package jgpstrackedit.view.buttons;


import jgpstrackedit.view.JGPSTrackEdit;

public class TrackModificationButtons implements ITrackModificationPlugin {
	public TrackCompressButton track_compress_btn;
	@Override
	public void initButtons(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		orignal(app);
		track_compress_btn = new TrackCompressButton();
		track_compress_btn.setApplication(app);
	}
}
