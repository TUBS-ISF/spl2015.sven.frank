import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//import java.awt.event.MouseWheelListener;

//import javax.swing.event.ListSelectionListener;

//import jgpstrackedit.config.ConfigurationObserver;
import jgpstrackedit.view.buttons.SaveTrackAsButton;
import jgpstrackedit.view.buttons.SaveTrackButton;
import jgpstrackedit.view.JGPSTrackEdit;;

public privileged aspect Save {
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;

	pointcut buttonConstructor() :
		call(public void JGPSTrackEdit.addSavePlugin());
	after(JGPSTrackEdit own):
		buttonConstructor() && this(own)
	{
		System.out.println("Construct new Buttons");
		own.savetrack_plugin = new SaveTrackButton();	
		own.savetrackas_plugin = new SaveTrackAsButton();
	};
	
	pointcut loadSavePlugins () :
		call(private void JGPSTrackEdit.addSaveButtons()) ; 
	after() : loadSavePlugins() {
		System.out.println("Context menu added");
		//this.savetrack_plugin = new SaveTrackButton();	
		//this.savetrackas_plugin = new SaveTrackAsButton();
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