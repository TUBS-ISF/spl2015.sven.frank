package jgpstrackedit.view.buttons; 

import java.awt.Dimension; 

import jgpstrackedit.control.UIController; 
import jgpstrackedit.international.International; 
import jgpstrackedit.view.JGPSTrackEdit; 

public  class  SaveTrackButton  implements IButtonPlugin {
	
	private JGPSTrackEdit application;

	
	@Override
	public Dimension getButtonDimension() {
		return new Dimension(20,20);
	}

	

	@Override
	public String getButtonToolTip() {
		return International.getText("Save_Track");
	}

	

	@Override
	public String getButtonIcon() {
		return "/jgpstrackedit/view/icon/disk.png";
	}

	

	@Override
	public void buttonClicked(UIController ui) {
		ui.save();
	}

	

	@Override
	public void setApplication(JGPSTrackEdit app) {
		this.application = app;
	}


}
