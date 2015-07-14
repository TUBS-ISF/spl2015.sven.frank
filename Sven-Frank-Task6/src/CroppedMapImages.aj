import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import jgpstrackedit.view.JGPSTrackEdit;
import jgpstrackedit.view.buttons.SaveMapAsImageButton;


public privileged aspect CroppedMapImages {
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;

	pointcut pluginConstructor() :
		call(private void JGPSTrackEdit.addSaveImagePlugin());
	after(JGPSTrackEdit own):
		pluginConstructor() && this(own)
	{
		System.out.println("Construct save image plugin");
		own.savemapimage_plugin = new SaveMapAsImageButton();
	};
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addContextMenu () :
		call(private void JGPSTrackEdit.addSaveImageContextMenu()) ; 
	after(JGPSTrackEdit own) : addContextMenu() && this(own) {
		System.out.println("Context menu (save image) added");
		if(own.savemapimage_plugin != null) {
			own.mntmSaveMapView = new JMenuItem(own.savemapimage_plugin.getMenuNameText());
			own.mntmSaveMapView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					own.savemapimage_plugin.buttonClicked(own.uiController);
				}
			});
			own.fileMenu.add(own.mntmSaveMapView);
		}
	}
}