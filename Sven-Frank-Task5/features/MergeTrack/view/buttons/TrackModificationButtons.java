package jgpstrackedit.view.buttons;


import jgpstrackedit.view.JGPSTrackEdit;

public class TrackModificationButtons implements ITrackModificationPlugin {
	public TrackMergeButton track_merge_btn;
	@Override
	public void initButtons(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		orignal(app);
		track_merge_btn = new TrackMergeButton();
		track_merge_btn.setApplication(app);
	}
}
