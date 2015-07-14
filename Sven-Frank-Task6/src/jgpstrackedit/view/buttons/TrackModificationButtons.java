package jgpstrackedit.view.buttons;


import jgpstrackedit.view.JGPSTrackEdit;

public class TrackModificationButtons implements ITrackModificationPlugin {
	public TrackCompressButton track_compress_btn;
	public TrackMergeButton track_merge_btn;
	public TrackSplitButton track_split_btn;
	public TrackReverseButton track_reverse_btn;
	@Override
	public void initButtons(JGPSTrackEdit app) {
		
		//NOTE: Buttons created via aspects
	}
}
