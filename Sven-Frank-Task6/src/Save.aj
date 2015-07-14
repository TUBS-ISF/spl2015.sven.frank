import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import jgpstrackedit.international.International;
import jgpstrackedit.view.buttons.SaveTrackAsButton;
import jgpstrackedit.view.buttons.SaveTrackButton;
import jgpstrackedit.view.JGPSTrackEdit;;

public privileged aspect Save {
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;

	pointcut buttonConstructor() :
		call(private void JGPSTrackEdit.addSavePlugin());
	after(JGPSTrackEdit own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct save plugin");
		own.savetrack_plugin = new SaveTrackButton();	
		own.savetrackas_plugin = new SaveTrackAsButton();
	};
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addContextMenu () :
		call(private void JGPSTrackEdit.addSaveContextMenu()) ; 
	after(JGPSTrackEdit own) : addContextMenu() && this(own) {
		System.out.println("Context menu added");
		own.saveMenuItem = new javax.swing.JMenuItem();
		if(own.savetrack_plugin != null) {
			own.saveMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					own.savetrack_plugin.buttonClicked(own.uiController);
				}
			});
		}
		if(own.savetrackas_plugin != null)
			own.saveAsMenuItem = new javax.swing.JMenuItem();
	}
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut setContextMenu () :
		call(private void JGPSTrackEdit.setSaveMenu()) ; 
	after(JGPSTrackEdit own) : setContextMenu() && this(own) {
		System.out.println("Config context menu");
		if(own.savetrack_plugin != null) {
			own.saveMenuItem.setText(International.getText("menu.File.Save"));
			own.fileMenu.add(own.saveMenuItem);
		}
		if(own.savetrackas_plugin != null) {
			own.saveAsMenuItem.setText(International.getText("menu.File.Save_As")
					+ "...");
			own.saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					own.saveAsMenuItemActionPerformed(evt);
				}
			});
			own.fileMenu.add(own.saveAsMenuItem);
		}
	}
	
	pointcut addButtons () :
		call(private void JGPSTrackEdit.addSaveButtons()) ; 
	after(JGPSTrackEdit own) : addButtons() && this(own) {
		System.out.println("Buttons for save/saveas added");
		JButton btnNewButton = new JButton("");
		if(own.savetrackas_plugin != null) {
			btnNewButton.setBorder(null);
			btnNewButton.setMinimumSize(own.savetrackas_plugin.getButtonDimension());
			btnNewButton.setMaximumSize(own.savetrackas_plugin.getButtonDimension());
			btnNewButton.setPreferredSize(own.savetrackas_plugin.getButtonDimension());
			btnNewButton.setToolTipText(own.savetrackas_plugin.getButtonToolTip());
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setIcon(new ImageIcon(JGPSTrackEdit.class
					.getResource(own.savetrackas_plugin.getButtonIcon())));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					own.savetrackas_plugin.buttonClicked(own.uiController);;
				}
			});
		}
		
		own.jButtonSave = new javax.swing.JButton();
		if(own.savetrack_plugin != null) {
			own.jButtonSave.setBorder(null);
			own.jButtonSave.setMaximumSize(own.savetrack_plugin.getButtonDimension());
			own.jButtonSave.setMinimumSize(own.savetrack_plugin.getButtonDimension());
			own.jButtonSave.setToolTipText(own.savetrack_plugin.getButtonToolTip());
			own.jButtonSave.setIcon(new ImageIcon(JGPSTrackEdit.class
					.getResource(own.savetrack_plugin.getButtonIcon())));
			own.jButtonSave.setPreferredSize(own.savetrack_plugin.getButtonDimension());
			own.jButtonSave.setContentAreaFilled(false);
			own.jButtonSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					own.savetrack_plugin.buttonClicked(own.uiController);
				}
			});
			own.toolBar.add(own.jButtonSave);
		}
		if(own.savetrackas_plugin != null)
			own.toolBar.add(btnNewButton);
	}
	
}