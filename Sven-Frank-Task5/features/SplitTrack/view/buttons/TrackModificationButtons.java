package jgpstrackedit.view.buttons;


import jgpstrackedit.view.JGPSTrackEdit;

public class TrackModificationButtons implements ITrackModificationPlugin {
	public TrackSplitButton track_split_btn;
	@Override
	public void initButtons(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		orignal(app);
		track_split_btn = new TrackSplitButton();
		track_split_btn.setApplication(app);
	}
}
