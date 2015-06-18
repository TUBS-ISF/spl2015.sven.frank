package jgpstrackedit.view.buttons;

import java.awt.Dimension;

import jgpstrackedit.control.UIController;
import jgpstrackedit.view.JGPSTrackEdit;

public interface IButtonPlugin {
	Dimension getButtonDimension();
	String getButtonToolTip();
	String getButtonIcon();
	void buttonClicked(UIController ui);
	void setApplication(JGPSTrackEdit app);
}
