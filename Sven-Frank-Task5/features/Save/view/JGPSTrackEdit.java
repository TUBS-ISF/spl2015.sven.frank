package jgpstrackedit.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import jgpstrackedit.view.buttons.SaveTrackAsButton;
import jgpstrackedit.view.buttons.SaveTrackButton;
import jgpstrackedit.control.UIController;

public class JGPSTrackEdit extends javax.swing.JFrame implements
		ListSelectionListener, MouseListener, MouseMotionListener,
		MouseWheelListener, ConfigurationObserver, KeyListener {


	private SaveTrackButton savetrack_plugin;
	private SaveTrackAsButton savetrackas_plugin;
	


	/** Creates new form JGPSTrackEdit */
	public JGPSTrackEdit() {
		own = this;
		//-------------------------------------------------
		// init plugins
		this.savetrack_plugin = new SaveTrackButton();
		savetrack_plugin.setApplication(this);
		
		this.savetrackas_plugin = new SaveTrackAsButton();
		savetrackas_plugin.setApplication(this);
	}

	private void initComponents() {
		
		// -------------------------------------------------------------------------------------------------
		// added: save
		saveMenuItem = new javax.swing.JMenuItem();
		if(savetrack_plugin != null) {
			saveMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					savetrack_plugin.buttonClicked(uiController);
				}
			});
		}
		saveAsMenuItem = new javax.swing.JMenuItem();

		// -------------------------------------------------------------------------------------------------

		// -------------------------------------------------------------------------------------------------
		// added: save_as
		JButton btnNewButton = new JButton("");
		if(savetrackas_plugin != null) {
			btnNewButton.setBorder(null);
			btnNewButton.setMinimumSize(savetrackas_plugin.getButtonDimension());
			btnNewButton.setMaximumSize(savetrackas_plugin.getButtonDimension());
			btnNewButton.setPreferredSize(savetrackas_plugin.getButtonDimension());
			btnNewButton.setToolTipText(savetrackas_plugin.getButtonToolTip());
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setIcon(new ImageIcon(JGPSTrackEdit.class
					.getResource(savetrackas_plugin.getButtonIcon())));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					savetrackas_plugin.buttonClicked(uiController);;
				}
			});
		}
		// -------------------------------------------------------------------------------------------------
		
		// -------------------------------------------------------------------------------------------------
		// added: save_track
		
		jButtonSave = new javax.swing.JButton();
		if(savetrack_plugin != null) {
			jButtonSave.setBorder(null);
			jButtonSave.setMaximumSize(savetrack_plugin.getButtonDimension());
			jButtonSave.setMinimumSize(savetrack_plugin.getButtonDimension());
			jButtonSave.setToolTipText(savetrack_plugin.getButtonToolTip());
			jButtonSave.setIcon(new ImageIcon(JGPSTrackEdit.class
					.getResource(savetrack_plugin.getButtonIcon())));
			jButtonSave.setPreferredSize(savetrack_plugin.getButtonDimension());
			jButtonSave.setContentAreaFilled(false);
			jButtonSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					savetrack_plugin.buttonClicked(uiController);
				}
			});
			toolBar.add(jButtonSave);
		}
		if(savetrackas_plugin != null)
			toolBar.add(btnNewButton);
		// -------------------------------------------------------------------------------------------------
		

		//-------------------------------------------------------------
		if(savetrack_plugin != null) {
			saveMenuItem.setText(International.getText("menu.File.Save"));
			fileMenu.add(saveMenuItem);
		}
		
		
		if(savetrackas_plugin != null) {
			saveAsMenuItem.setText(International.getText("menu.File.Save_As")
					+ "...");
			saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					savetrackas_plugin.buttonClicked(uiController)
				}
			});
			fileMenu.add(saveAsMenuItem);
		}
		//-------------------------------------------------------------
		pack();
	}
	
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveMenuItem;
}
