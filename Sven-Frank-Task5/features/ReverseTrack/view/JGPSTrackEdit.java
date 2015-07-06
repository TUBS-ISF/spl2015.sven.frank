/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JGPSTrackEdit.java
 *
 * Created on 08.06.2010, 20:32:46
 */
package jgpstrackedit.view;

/*
 * This software is copyright Hubert Lutnik 2012 and made available through the GNU GPL version 3,
 * see also http://www.gnu.org/copyleft/gpl.html.
 * Usage only for non commercial purposes.
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import jgpstrackedit.config.Configuration;
import jgpstrackedit.config.ConfigurationObserver;
import jgpstrackedit.config.view.ConfigurationDialog;
import jgpstrackedit.config.view.ViewingConfiguration;
import jgpstrackedit.control.UIController;
import jgpstrackedit.data.Database;
import jgpstrackedit.data.Point;
import jgpstrackedit.data.Track;
import jgpstrackedit.data.util.TourPlaner;
import jgpstrackedit.data.util.UnDoManager;
import jgpstrackedit.map.TileManager;
import jgpstrackedit.map.tiledownload.DlgProcessingTileDownload;
import jgpstrackedit.map.tiledownload.DlgStartTiledownloadMode;
import jgpstrackedit.map.tiledownload.DlgStopTiledownloadMode;
import jgpstrackedit.map.tiledownload.TileDownload;
import jgpstrackedit.map.util.MapExtract;
import jgpstrackedit.map.util.MapExtractManager;
import jgpstrackedit.map.util.TileNumber;
import jgpstrackedit.view.buttons.SaveMapAsImageButton;
import jgpstrackedit.view.buttons.SaveMapExtractButton;
import jgpstrackedit.view.buttons.SaveTrackAsButton;
import jgpstrackedit.view.buttons.SaveTrackButton;
import jgpstrackedit.view.buttons.TrackModificationButtons;
import jgpstrackedit.view.util.ColorEditor;
import jgpstrackedit.view.util.ColorRenderer;
import jgpstrackedit.international.International;
import jgpstrackedit.util.Parser;

/* TODO:
 * AltitudeProfil, Sync selected Point to Map
 - Internationalisierung (Deutsch)

 */


/**
 * JGPSTrackEdit is a tool for editing (gps) tracks and planing (multiple days)
 * tours. This class represent the main class, providing the main method.<br>
 * This software is copyright Hubert Lutnik 2012,2013,2014 and made available through the
 * GNU GPL version 3, see also http://www.gnu.org/copyleft/gpl.html. Usage only
 * for non commercial purposes.
 * 
 * @author Hubert
 */
public class JGPSTrackEdit extends javax.swing.JFrame implements
		ListSelectionListener, MouseListener, MouseMotionListener,
		MouseWheelListener, ConfigurationObserver, KeyListener {


	private TrackModificationButtons trackmodification_plugin;

	public JGPSTrackEdit() {
		if(this.trackmodification_plugin == null){
			this.trackmodification_plugin = new TrackModificationButtons();
			trackmodification_plugin.initButtons(this);
		}
		
		orginal();
	}

	private void addReverseButton(JButton btnReverseTrack, JToolBar toolBar)
	{
		orginal(btnReverseTrack, toolBar);
		
		if(trackmodification_plugin != null) {
			btnReverseTrack = new JButton("");
			btnReverseTrack.setBorder(null);
			btnReverseTrack.setContentAreaFilled(false);
			btnReverseTrack.setMaximumSize(trackmodification_plugin.track_reverse_btn.getButtonDimension());
			btnReverseTrack.setMinimumSize(trackmodification_plugin.track_reverse_btn.getButtonDimension());
			btnReverseTrack.setPreferredSize(trackmodification_plugin.track_reverse_btn.getButtonDimension());
			btnReverseTrack.setToolTipText(trackmodification_plugin.track_reverse_btn.getButtonToolTip());
			btnReverseTrack.setIcon(new ImageIcon(JGPSTrackEdit.class
					.getResource(trackmodification_plugin.track_reverse_btn.getButtonIcon())));
			btnReverseTrack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					trackmodification_plugin.track_reverse_btn.buttonClicked(uiController);
				}
			});
			toolBar.add(btnReverseTrack);
		}
	}
	private void addReverseMenu(JMenu trackMenu) 
	{
		orginal(trackMenu);
		if(trackmodification_plugin != null) {
			jMenuItemReverse.setText(International.getText("menu.Track.Reverse"));
			jMenuItemReverse.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					trackmodification_plugin.track_reverse_btn.buttonClicked(uiController);
				}
			});
		}
		
		if(trackmodification_plugin != null)
			trackMenu.add(jMenuItemReverse);
	}

	private JButton btnReverseTrack;