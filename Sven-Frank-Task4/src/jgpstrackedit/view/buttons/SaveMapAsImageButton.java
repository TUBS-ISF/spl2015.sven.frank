package jgpstrackedit.view.buttons;

import jgpstrackedit.control.UIController;
import jgpstrackedit.international.International;
import jgpstrackedit.view.JGPSTrackEdit;
import jgpstrackedit.view.MenuItemCleanPlugin;

public class SaveMapAsImageButton implements MenuItemCleanPlugin {
	private JGPSTrackEdit application;

	@Override
	public String getMenuNameText() {
		// TODO Auto-generated method stub
		return (International.getText("menu.File.Save_Map_View_as_Image") + "...");
	}

	@Override
	public void buttonClicked(UIController ui) {
		// TODO Auto-generated method stub
		ui.saveMapViewAsImage();
	}

	@Override
	public void setApplication(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		this.application = app;
	}

}
