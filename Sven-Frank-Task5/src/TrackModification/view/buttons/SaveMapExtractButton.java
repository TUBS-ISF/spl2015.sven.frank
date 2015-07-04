package jgpstrackedit.view.buttons; 

import java.awt.Dimension; 

import jgpstrackedit.control.UIController; 
import jgpstrackedit.international.International; 
import jgpstrackedit.view.JGPSTrackEdit; 

public  class  SaveMapExtractButton  implements IButtonPlugin {
	
	private JGPSTrackEdit application;

	
	@Override
	public Dimension getButtonDimension() {
		// TODO Auto-generated method stub
		return new Dimension(20, 20);
	}

	

	@Override
	public String getButtonToolTip() {
		// TODO Auto-generated method stub
		return International
				.getText("Save_current_map_extract");
	}

	

	@Override
	public String getButtonIcon() {
		// TODO Auto-generated method stub
		return "/jgpstrackedit/view/icon/photo_add.png";
	}

	

	@Override
	public void buttonClicked(UIController ui) {
		// TODO Auto-generated method stub
		ui.saveMapExtract();
	}

	

	@Override
	public void setApplication(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		this.application = app;
	}


}
