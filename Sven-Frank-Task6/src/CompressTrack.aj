import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;

import jgpstrackedit.international.International;
import jgpstrackedit.view.JGPSTrackEdit;
import jgpstrackedit.view.buttons.TrackCompressButton;
import jgpstrackedit.view.buttons.TrackModificationButtons;


public privileged aspect CompressTrack {
	declare parents : TrackModificationButtons implements TrackModificationButtons;

	pointcut buttonConstructor() :
		execution(public void TrackModificationButtons.initButtons(..));
	after(TrackModificationButtons own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct compress plugin");
		own.track_compress_btn = new TrackCompressButton();
	};
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addButtons () :
		call(private void JGPSTrackEdit.addTrackModificationButtons()) ; 
	after(JGPSTrackEdit own) : addButtons() && this(own) {
		System.out.println("Buttons for Compress added");
		own.btnCompressTrack = new JButton("");
		own.btnCompressTrack.setMaximumSize(own.trackmodification_plugin.track_compress_btn.getButtonDimension());
		own.btnCompressTrack.setMinimumSize(own.trackmodification_plugin.track_compress_btn.getButtonDimension());
		own.btnCompressTrack.setPreferredSize(own.trackmodification_plugin.track_compress_btn.getButtonDimension());
		own.btnCompressTrack
				.setToolTipText(own.trackmodification_plugin.track_compress_btn.getButtonToolTip());
		own.btnCompressTrack.setIcon(new ImageIcon(JGPSTrackEdit.class
				.getResource(own.trackmodification_plugin.track_compress_btn.getButtonIcon())));
		own.btnCompressTrack.setContentAreaFilled(false);
		own.btnCompressTrack.setBorder(null);
		own.btnCompressTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.trackmodification_plugin.track_compress_btn.buttonClicked(own.uiController);;
			}
		});
		own.toolBar.add(own.btnCompressTrack);	
	}
	
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	pointcut addContextMenu () :
		call(private void JGPSTrackEdit.addTrackmodificationContextMenu()) ; 
	after(JGPSTrackEdit own) : addContextMenu() && this(own) {
		System.out.println("Context menu Compress added");
		own.mntmCompress = new JMenuItem(
				International.getText("menu.Track.Compress") + "...");
		own.mntmCompress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				own.uiController.compress();
			}
		});
		own.trackMenu.add(own.mntmCompress);
	}
}