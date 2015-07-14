import jgpstrackedit.view.buttons.TrackMergeButton;
import jgpstrackedit.view.buttons.TrackModificationButtons;


public aspect MergeTrack {
	declare parents : TrackModificationButtons implements TrackModificationButtons;

	pointcut buttonConstructor() :
		execution(public void TrackModificationButtons.initButtons(..));
	after(TrackModificationButtons own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct merge plugin");
		own.track_merge_btn = new TrackMergeButton();
	};
}