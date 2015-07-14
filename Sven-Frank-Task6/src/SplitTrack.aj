

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import jgpstrackedit.view.JGPSTrackEdit;
import jgpstrackedit.view.buttons.*;


public privileged aspect SplitTrack {
	declare parents : TrackModificationButtons implements TrackModificationButtons;

	pointcut buttonConstructor() :
		execution(public void TrackModificationButtons.initButtons(..));
	after(TrackModificationButtons own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct split plugin");
		own.track_split_btn = new TrackSplitButton();
	};
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addButtons () :
		call(private void JGPSTrackEdit.addTrackModificationButtons()) ; 
	after(JGPSTrackEdit own) : addButtons() && this(own) {
		System.out.println("Buttons for Split added");
		own.btnSplitTrack = new JButton("");
		own.btnSplitTrack.setMaximumSize(own.trackmodification_plugin.track_split_btn.getButtonDimension());
		own.btnSplitTrack.setMinimumSize(own.trackmodification_plugin.track_split_btn.getButtonDimension());
		own.btnSplitTrack.setPreferredSize(own.trackmodification_plugin.track_split_btn.getButtonDimension());
		own.btnSplitTrack.setToolTipText(own.trackmodification_plugin.track_split_btn.getButtonToolTip());
		own.btnSplitTrack.setIcon(new ImageIcon(JGPSTrackEdit.class
				.getResource(own.trackmodification_plugin.track_split_btn.getButtonIcon())));
		own.btnSplitTrack.setContentAreaFilled(false);
		own.btnSplitTrack.setBorder(null);
		own.btnSplitTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.handleSplit();
			}
		});
		own.toolBar.add(own.btnSplitTrack);		
	}
}