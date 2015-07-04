package jgpstrackedit.view.buttons; 

import java.awt.Dimension; 

import jgpstrackedit.control.UIController; 
import jgpstrackedit.international.International; 
import jgpstrackedit.view.JGPSTrackEdit; 

public  class  TrackReverseButton  implements IButtonPlugin {
	
	public JGPSTrackEdit app;

	
	@Override
	public Dimension getButtonDimension() {
		// TODO Auto-generated method stub
		return new Dimension(20, 20);
	}

	

	@Override
	public String getButtonToolTip() {
		// TODO Auto-generated method stub
		return International.getText("Reverse_Track");
	}

	

	@Override
	public String getButtonIcon() {
		// TODO Auto-generated method stub
		return "/jgpstrackedit/view/icon/arrow_refresh.png";
	}

	

	@Override
	public void buttonClicked(UIController ui) {
		// TODO Auto-generated method stub
		ui.reverseTrack();
	}

	

	@Override
	public void setApplication(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		this.app = app;
	}


}
