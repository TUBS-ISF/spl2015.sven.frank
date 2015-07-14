import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;

import jgpstrackedit.international.International;
import jgpstrackedit.view.JGPSTrackEdit;
import jgpstrackedit.view.buttons.TrackModificationButtons;
import jgpstrackedit.view.buttons.TrackReverseButton;

public privileged aspect ReverseTrack {
	declare parents : TrackModificationButtons implements TrackModificationButtons;

	pointcut buttonConstructor() :
		execution(public void TrackModificationButtons.initButtons(..));
	after(TrackModificationButtons own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct split plugin");
		own.track_reverse_btn = new TrackReverseButton();
	};
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addButtons () :
		call(private void JGPSTrackEdit.addTrackModificationButtons()) ; 
	after(JGPSTrackEdit own) : addButtons() && this(own) {
		System.out.println("Buttons for Reverse added");
		own.btnReverseTrack = new JButton("");
		own.btnReverseTrack.setBorder(null);
		own.btnReverseTrack.setContentAreaFilled(false);
		own.btnReverseTrack.setMaximumSize(own.trackmodification_plugin.track_reverse_btn.getButtonDimension());
		own.btnReverseTrack.setMinimumSize(own.trackmodification_plugin.track_reverse_btn.getButtonDimension());
		own.btnReverseTrack.setPreferredSize(own.trackmodification_plugin.track_reverse_btn.getButtonDimension());
		own.btnReverseTrack.setToolTipText(own.trackmodification_plugin.track_reverse_btn.getButtonToolTip());
		own.btnReverseTrack.setIcon(new ImageIcon(JGPSTrackEdit.class
				.getResource(own.trackmodification_plugin.track_reverse_btn.getButtonIcon())));
		own.btnReverseTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.trackmodification_plugin.track_reverse_btn.buttonClicked(own.uiController);
			}
		});
		own.toolBar.add(own.btnReverseTrack);
	}
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addContextMenu () :
		call(private void JGPSTrackEdit.addTrackmodificationContextMenu()) ; 
	after(JGPSTrackEdit own) : addContextMenu() && this(own) {
		System.out.println("Context menu Reverse added");
		own.jMenuItemReverse.setText(International.getText("menu.Track.Reverse"));
		own.jMenuItemReverse.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				own.jMenuItemReverseActionPerformed(evt);
			}
		});
		own.trackMenu.add(own.jMenuItemReverse);
	}
}