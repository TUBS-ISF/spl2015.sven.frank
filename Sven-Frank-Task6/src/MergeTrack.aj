import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import jgpstrackedit.view.JGPSTrackEdit;
import jgpstrackedit.view.buttons.TrackMergeButton;
import jgpstrackedit.view.buttons.TrackModificationButtons;


public privileged aspect MergeTrack {
	declare parents : TrackModificationButtons implements TrackModificationButtons;

	pointcut buttonConstructor() :
		execution(public void TrackModificationButtons.initButtons(..));
	after(TrackModificationButtons own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct merge plugin");
		own.track_merge_btn = new TrackMergeButton();
	};
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addButtons () :
		call(private void JGPSTrackEdit.addTrackModificationButtons()) ; 
	after(JGPSTrackEdit own) : addButtons() && this(own) {
		System.out.println("Buttons for Merge added");
		own.btnMergeTrack = new JButton("");
		own.btnMergeTrack.setBorder(null);
		own.btnMergeTrack.setContentAreaFilled(false);
		own.btnMergeTrack.setMaximumSize(own.trackmodification_plugin.track_merge_btn.getButtonDimension());
		own.btnMergeTrack.setMinimumSize(own.trackmodification_plugin.track_merge_btn.getButtonDimension());
		own.btnMergeTrack.setPreferredSize(own.trackmodification_plugin.track_merge_btn.getButtonDimension());
		own.btnMergeTrack.setToolTipText(own.trackmodification_plugin.track_merge_btn.getButtonToolTip());
		own.btnMergeTrack.setIcon(new ImageIcon(JGPSTrackEdit.class
				.getResource(own.trackmodification_plugin.track_merge_btn.getButtonIcon())));
		own.btnMergeTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.handleMerge();
			}
		});
		own.toolBar.add(own.btnMergeTrack);	
	}
}