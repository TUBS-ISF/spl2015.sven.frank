package jgpstrackedit.view;

import java.awt.Dimension;

public interface ButtonPlugin {
	Dimension getButtonDimension();
	String getButtonToolTip();
	String getButtonIcon();
	void buttonClicked();
	void setApplication(JGPSTrackEdit app);
}
