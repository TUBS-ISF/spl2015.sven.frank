import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;

import jgpstrackedit.international.International;
import jgpstrackedit.view.JGPSTrackEdit;


public privileged aspect Open {
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addContextMenu () :
		call(private void JGPSTrackEdit.addOpenContext()) ; 
	after(JGPSTrackEdit own) : addContextMenu() && this(own) {
		own.openMenuItem.setText(International.getText("Open_Track") + "...");
		own.openMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				own.openMenuItemActionPerformed(evt);
			}
		});
		own.fileMenu.add(own.openMenuItem);

		own.mntmOpenGpsiescomTrack = new JMenuItem(
				International.getText("menu.File.Open_GPSies.com") + "...");
		own.mntmOpenGpsiescomTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				own.uiController.openGPSies();
			}
		});
		own.fileMenu.add(own.mntmOpenGpsiescomTrack);

		JMenuItem mntmOpenDirectory = new JMenuItem(
				International.getText("menu.File.Open_Directory") + "...");
		mntmOpenDirectory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				own.uiController.openDirectory();
			}
		});
		own.fileMenu.add(mntmOpenDirectory);
		own.fileMenu.addSeparator();
	}

	pointcut addButtons () :
		call(private void JGPSTrackEdit.addOpenButtons()) ; 
	after(JGPSTrackEdit own) : addButtons() && this(own) {
		System.out.println("Buttons for open added");
		
		own.jButtonOpenTrack = new javax.swing.JButton();
		own.jButtonOpenTrack.setBorder(null);
		own.toolBar.add(own.jButtonOpenTrack);
		own.jButtonOpenTrack.setPreferredSize(new Dimension(20, 20));
		own.jButtonOpenTrack.setMaximumSize(new Dimension(20, 20));
		own.jButtonOpenTrack.setMinimumSize(new Dimension(20, 20));
		own.jButtonOpenTrack.setContentAreaFilled(false);
		own.jButtonOpenTrack.setToolTipText(International.getText("Open_Track"));
		own.jButtonOpenTrack.setIcon(new ImageIcon(JGPSTrackEdit.class
				.getResource("/jgpstrackedit/view/icon/folder.png")));

		JButton btnOpenGpsiesTrack = new JButton("");
		btnOpenGpsiesTrack.setBorder(null);
		btnOpenGpsiesTrack.setMaximumSize(new Dimension(20, 20));
		btnOpenGpsiesTrack.setMinimumSize(new Dimension(20, 20));
		btnOpenGpsiesTrack.setContentAreaFilled(false);
		btnOpenGpsiesTrack.setPreferredSize(new Dimension(20, 20));
		btnOpenGpsiesTrack.setIcon(new ImageIcon(JGPSTrackEdit.class
				.getResource("/jgpstrackedit/view/icon/folder_find.png")));
		btnOpenGpsiesTrack.setToolTipText(International
				.getText("Open_GPSies_Track"));
		btnOpenGpsiesTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				own.uiController.openGPSies();
			}
		});
		own.toolBar.add(btnOpenGpsiesTrack);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				own.uiController.openDirectory();
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setMaximumSize(new Dimension(20, 20));
		btnNewButton_1.setMinimumSize(new Dimension(20, 20));
		btnNewButton_1.setPreferredSize(new Dimension(20, 20));
		btnNewButton_1.setIcon(new ImageIcon(JGPSTrackEdit.class
				.getResource("/jgpstrackedit/view/icon/folder_table.png")));
		btnNewButton_1.setToolTipText(International.getText("sel_dir"));
		own.toolBar.add(btnNewButton_1);
		own.toolBar.addSeparator();
	}
	
	
}