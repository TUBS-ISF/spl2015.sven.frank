package jgpstrackedit.view.buttons; 


import jgpstrackedit.view.JGPSTrackEdit; 

public  class  TrackModificationButtons  implements ITrackModificationPlugin {
	
	public TrackCompressButton track_compress_btn;

	
	public TrackMergeButton track_merge_btn;

	
	public TrackSplitButton track_split_btn;

	
	public TrackReverseButton track_reverse_btn;

	
	@Override
	public void initButtons(JGPSTrackEdit app) {
		// TODO Auto-generated method stub
		track_compress_btn = new TrackCompressButton();
		track_compress_btn.setApplication(app);
		
		track_merge_btn = new TrackMergeButton();
		track_merge_btn.setApplication(app);
		
		track_split_btn = new TrackSplitButton();
		track_split_btn.setApplication(app);
		
		track_reverse_btn = new TrackReverseButton();
		track_reverse_btn.setApplication(app);
	}


}
