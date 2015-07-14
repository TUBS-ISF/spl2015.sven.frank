import jgpstrackedit.view.buttons.TrackModificationButtons;
import jgpstrackedit.view.buttons.TrackReverseButton;

public aspect ReverseTrack {
	declare parents : TrackModificationButtons implements TrackModificationButtons;

	pointcut buttonConstructor() :
		execution(public void TrackModificationButtons.initButtons(..));
	after(TrackModificationButtons own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct split plugin");
		own.track_reverse_btn = new TrackReverseButton();
	};
}