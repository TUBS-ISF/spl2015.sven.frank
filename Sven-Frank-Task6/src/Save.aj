import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jgpstrackedit.view.buttons.SaveTrackAsButton;
import jgpstrackedit.view.buttons.SaveTrackButton;

public aspect Save {
	private SaveTrackButton savetrack_plugin;
	private SaveTrackAsButton savetrackas_plugin;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JMenuItem saveAsMenuItem;

	pointcut loadSavePlugins () :
		withincode(* JGPSTrackEdit.JGPSTrackEdit(..));
	before() : loadSavePlugins() {
		System.out.println("Test");
		this.savetrack_plugin = new SaveTrackButton();	
		this.savetrackas_plugin = new SaveTrackAsButton();
	}
	
	/*pointcut addSave_As_Buttons() :
		withincode(* JGPSTrackEdit.initComponents(..)) 
		&& call(* JGPSTrackEdit.addSaveButtons());
	after(): addSave_As_Buttons() {
		saveMenuItem = new javax.swing.JMenuItem();
		if(savetrack_plugin != null) {
			saveMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					savetrack_plugin.buttonClicked(uiController);
				}
			});
		}
		if(savetrackas_plugin != null)
			saveAsMenuItem = new javax.swing.JMenuItem();
	}*/
	
}