package jgpstrackedit.view.buttons; 

import java.awt.Dimension; 

import jgpstrackedit.control.UIController; 
import jgpstrackedit.international.International; 
import jgpstrackedit.view.JGPSTrackEdit; 

public  class  TrackCompressButton  implements IButtonPlugin {
	
	private JGPSTrackEdit app;

	
	@Override
	public Dimension getButtonDimension() {
		// TODO Auto-generated method stub
		return new Dimension(20, 20);
	}

	

	@Override
	public String getButtonToolTip() {
		// TODO Auto-generated method stub
		return International.getText("Compress_Track");
	}

	

	@Override
	public String getButtonIcon() {
		// TODO Auto-generated method stub
		return "/jgpstrackedit/view/icon/arrow_in.png";
	}

	

	@Override
	public void buttonClicked(UIController ui) {
		// TODO Auto-generated method stub
		ui.compress();
	}

	

	@Override
	public void setApplication(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		this.app = app;
	}


}
