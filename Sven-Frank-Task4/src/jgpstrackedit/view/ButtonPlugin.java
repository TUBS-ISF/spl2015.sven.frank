package jgpstrackedit.view;

import java.awt.Dimension;

import jgpstrackedit.control.UIController;

public interface ButtonPlugin {
	Dimension getButtonDimension();
	String getButtonToolTip();
	String getButtonIcon();
	void buttonClicked(UIController ui);
	void setApplication(JGPSTrackEdit app);
}
