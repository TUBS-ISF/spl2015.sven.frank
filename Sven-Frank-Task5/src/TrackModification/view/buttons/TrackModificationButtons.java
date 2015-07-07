package jgpstrackedit.view.buttons; 


import jgpstrackedit.view.JGPSTrackEdit; 

public   class  TrackModificationButtons  implements ITrackModificationPlugin {
	
	@Override
	public void initButtons(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		orignal(app);
		track_compress_btn = new TrackCompressButton();
		track_compress_btn.setApplication(app);
	}

	
	public TrackSplitButton track_split_btn;

	
	public TrackMergeButton track_merge_btn;

	
	public TrackReverseButton track_reverse_btn;

	
	public TrackCompressButton track_compress_btn;


}
