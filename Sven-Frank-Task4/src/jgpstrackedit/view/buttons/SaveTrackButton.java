package jgpstrackedit.view.buttons;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jgpstrackedit.control.UIController;
import jgpstrackedit.international.International;
import jgpstrackedit.view.ButtonPlugin;
import jgpstrackedit.view.JGPSTrackEdit;

public class SaveTrackButton implements ButtonPlugin{
	private UIController uiController;
	private JGPSTrackEdit application;
	@Override
	public Dimension getButtonDimension() {
		return new Dimension(20,20);
	}

	@Override
	public String getButtonToolTip() {
		return International.getText("sel_dir");
	}

	@Override
	public String getButtonIcon() {
		return "/jgpstrackedit/view/icon/folder_table.png";
	}

	@Override
	public ActionListener buttonClicked() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uiController.save();}};
	}

	@Override
	public void setApplication(JGPSTrackEdit app) {
		this.application = app;
	}
}
