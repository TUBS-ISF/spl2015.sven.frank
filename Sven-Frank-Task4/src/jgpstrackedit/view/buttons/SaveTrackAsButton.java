package jgpstrackedit.view.buttons;

import java.awt.Dimension;

import jgpstrackedit.control.UIController;
import jgpstrackedit.international.International;
import jgpstrackedit.view.ButtonPlugin;
import jgpstrackedit.view.JGPSTrackEdit;

public class SaveTrackAsButton implements ButtonPlugin{
	private JGPSTrackEdit application;
	@Override
	public Dimension getButtonDimension() {
		// TODO Auto-generated method stub
		return new Dimension(20,20);
	}

	@Override
	public String getButtonToolTip() {
		// TODO Auto-generated method stub
		return International.getText("Save_As");
	}

	@Override
	public String getButtonIcon() {
		// TODO Auto-generated method stub
		return "/jgpstrackedit/view/icon/page_save.png";
	}

	@Override
	public void buttonClicked(UIController ui) {
		// TODO Auto-generated method stub
		ui.saveAs();
	}

	@Override
	public void setApplication(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		this.application = app;
	}

}
