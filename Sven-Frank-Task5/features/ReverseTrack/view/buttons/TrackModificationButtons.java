package jgpstrackedit.view.buttons;


import jgpstrackedit.view.JGPSTrackEdit;

public class TrackModificationButtons implements ITrackModificationPlugin {
	public TrackReverseButton track_reverse_btn;
	@Override
	public void initButtons(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		orignal(app);
		track_reverse_btn = new TrackReverseButton();
		track_reverse_btn.setApplication(app);
	}
}
