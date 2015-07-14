import jgpstrackedit.view.buttons.*;


public aspect SplitTrack {
	declare parents : TrackModificationButtons implements TrackModificationButtons;

	pointcut buttonConstructor() :
		execution(public void TrackModificationButtons.initButtons(..));
	after(TrackModificationButtons own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct split plugin");
		own.track_split_btn = new TrackSplitButton();
	};
}