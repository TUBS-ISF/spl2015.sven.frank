import jgpstrackedit.view.buttons.TrackCompressButton;
import jgpstrackedit.view.buttons.TrackModificationButtons;


public aspect CompressTrack {
	declare parents : TrackModificationButtons implements TrackModificationButtons;

	pointcut buttonConstructor() :
		execution(public void TrackModificationButtons.initButtons(..));
	after(TrackModificationButtons own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct compress plugin");
		own.track_compress_btn = new TrackCompressButton();
	};
}