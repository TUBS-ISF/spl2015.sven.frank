import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButtonMenuItem;

import jgpstrackedit.international.International;
import jgpstrackedit.view.JGPSTrackEdit;


public privileged aspect OSM {
	
	pointcut addOSMMapsVariant () :
		call(private void JGPSTrackEdit.addMaps()) ; 
	after(JGPSTrackEdit own) : addOSMMapsVariant() && this(own) {
		if (own.mapType.equals("OpenStreetMap")) {
			own.uiController.tileManagerOSM_Mapnik();
			own.rdbtnmntmOpenstreetmapmapnik.setSelected(true);
		} else if (own.mapType.equals("OpenCycleMap")) {
			own.uiController.tileManagerOCM();
			own.rdbtnmntmOpencyclemap.setSelected(true);
		} else {
			own.rdbtnmntmOpenstreetmapmapnik.setSelected(true);
			own.uiController.tileManagerOSM_Mapnik();
		}
	}
	
	pointcut addOSMContextMenu () :
		call(private void JGPSTrackEdit.addMapsContextMenu()) ; 
	before(JGPSTrackEdit own) : addOSMContextMenu() && this(own) {
		own.rdbtnmntmNone = new JRadioButtonMenuItem(
				International.getText("menu.View.Maps.None"));
		own.rdbtnmntmNone.setSelected(true);
		own.mapRadioButtons.add(own.rdbtnmntmNone);
		own.rdbtnmntmNone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// No Map should be used
				own.uiController.tileManagerNone();
				own.repaint();

			}
		});
		own.mnMaps.add(own.rdbtnmntmNone);

		own.rdbtnmntmOpenstreetmapmapnik = new JRadioButtonMenuItem(
				"OpenStreetMap (Mapnik)");
		own.mapRadioButtons.add(own.rdbtnmntmOpenstreetmapmapnik);
		own.rdbtnmntmOpenstreetmapmapnik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// OSM (Mapnik) should be used
				own.uiController.tileManagerOSM_Mapnik();
			}
		});
		own.mnMaps.add(own.rdbtnmntmOpenstreetmapmapnik);
		
		
		own.rdbtnmntmOpencyclemap = new JRadioButtonMenuItem("OpenCycleMap");
		own.mapRadioButtons.add(own.rdbtnmntmOpencyclemap);
		own.rdbtnmntmOpencyclemap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				own.uiController.tileManagerOCM();
			}
		});
		own.mnMaps.add(own.rdbtnmntmOpencyclemap);
	}
}