package jgpstrackedit.view;

import jgpstrackedit.control.UIController;

public interface MenuItemCleanPlugin {
	String getMenuNameText();
	void buttonClicked(UIController ui);
	void setApplication(JGPSTrackEdit app);
}
