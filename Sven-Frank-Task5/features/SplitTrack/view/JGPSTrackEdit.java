/*
 * JGPSTrackEdit.java
 *
 * Created on 08.06.2010, 20:32:46
 */
package jgpstrackedit.view;


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


public class JGPSTrackEdit extends javax.swing.JFrame implements
		ListSelectionListener, MouseListener, MouseMotionListener,
		MouseWheelListener, ConfigurationObserver, KeyListener {

	/**
	 * 
	 */

	private UIController uiController;

	private TrackModificationButtons trackmodification_plugin;
	


	/** Creates new form JGPSTrackEdit */
	public JGPSTrackEdit() {
		if(this.trackmodification_plugin == null){
			this.trackmodification_plugin = new TrackModificationButtons();
			trackmodification_plugin.initButtons(this);
		}
		
		orginal();
	}
	
	private void addSplitButton(JButton btnSplitTrack, JToolBar toolBar) 
	{
		orginal(btnSplitTrack, toolBar);
		if(trackmodification_plugin != null) {
			
			btnSplitTrack = new JButton("");
			btnSplitTrack.setMaximumSize(trackmodification_plugin.track_split_btn.getButtonDimension());
			btnSplitTrack.setMinimumSize(trackmodification_plugin.track_split_btn.getButtonDimension());
			btnSplitTrack.setPreferredSize(trackmodification_plugin.track_split_btn.getButtonDimension());
			btnSplitTrack.setToolTipText(trackmodification_plugin.track_split_btn.getButtonToolTip());
			btnSplitTrack.setIcon(new ImageIcon(JGPSTrackEdit.class
					.getResource(trackmodification_plugin.track_split_btn.getButtonIcon())));
			btnSplitTrack.setContentAreaFilled(false);
			btnSplitTrack.setBorder(null);
			btnSplitTrack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					handleSplit();
				}
			});
			toolBar.add(btnSplitTrack);
		}
	}
	
	private void addSplitMenu(JMenu trackMenu) {		
		if(trackmodification_plugin != null) {
			mntmSplit = new JMenuItem(International.getText("menu.Track.Split")
					+ "...");
			mntmSplit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					handleSplit();
				}
			});
			trackMenu.add(mntmSplit);
		}		
	}	

	protected void handleSplit() {
		try {
			DlgSplit dialog = new DlgSplit(db.getTrack(
					jTableTracks.getSelectedRow()).getName());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setModalityType(ModalityType.DOCUMENT_MODAL);
			dialog.setVisible(true);
			uiController.split(dialog.getSplitOption(),
					db.getTrack(jTableTracks.getSelectedRow()),
					dialog.getTrackName(), dialog.getNumberTracks(),
					dialog.getNumberPoints(), dialog.getSplitLength());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private JMenuItem mntmSplit;
	private JButton btnSplitTrack;
}
