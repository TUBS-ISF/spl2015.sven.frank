package jgpstrackedit.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;

public interface ButtonPlugin {
	Dimension getButtonDimension();
	String getButtonToolTip();
	String getButtonIcon();
	ActionListener buttonClicked();
	void setApplication(JGPSTrackEdit app);
}
