package jgpstrackedit.view.buttons; 

import jgpstrackedit.control.UIController; 
import jgpstrackedit.view.JGPSTrackEdit; 

public  interface  IMenuItemCleanPlugin {
	
	String getMenuNameText();

	
	void buttonClicked(UIController ui);

	
	void setApplication(JGPSTrackEdit app);


}
