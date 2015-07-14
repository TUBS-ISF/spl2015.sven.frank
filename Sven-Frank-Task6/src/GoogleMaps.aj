import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButtonMenuItem;

import jgpstrackedit.view.JGPSTrackEdit;


public privileged aspect GoogleMaps {
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;
	
	pointcut addGoogleMapsVariant () :
		call(private void JGPSTrackEdit.addMaps()) ; 
	after(JGPSTrackEdit own) : addGoogleMapsVariant() && this(own) {
		if (own.mapType.equals("GoogleMap")) {
			own.uiController.tileManagerGoogleMap();
			own.rdbtnmntmGooglemap.setSelected(true);
		} else if (own.mapType.equals("GoogleMapTerrain")) {
			own.uiController.tileManagerGoogleMapTerrain();
			own.rdbtnmntmGooglemapterrain.setSelected(true);
		} else if (own.mapType.equals("GoogleMapSatellite")) {
			own.uiController.tileManagerGoogleMapSatellite();
			own.rdbtnmntmGooglemapsatellite.setSelected(true);
		} else if (own.mapType.equals("GoogleMapHybrid")) {
			own.uiController.tileManagerGoogleMapHybrid();
			own.rdbtnmntmGooglemaphybrid.setSelected(true);
		}
	}
	
	pointcut addGoogleContextMenu () :
		call(private void JGPSTrackEdit.addMapsContextMenu()) ; 
	after(JGPSTrackEdit own) : addGoogleContextMenu() && this(own) {
		JRadioButtonMenuItem rdbtnmntmGooglemap = new JRadioButtonMenuItem(
				"GoogleMap");
		own.mapRadioButtons.add(rdbtnmntmGooglemap);
		rdbtnmntmGooglemap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.uiController.tileManagerGoogleMap();
			}
		});
		own.mnMaps.add(rdbtnmntmGooglemap);
		
		own.rdbtnmntmGooglemapsatellite = new JRadioButtonMenuItem(
				"GoogleMap (Satellite)");
		own.mapRadioButtons.add(own.rdbtnmntmGooglemapsatellite);
		own.rdbtnmntmGooglemapsatellite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.uiController.tileManagerGoogleMapSatellite();
			}
		});
		own.mnMaps.add(own.rdbtnmntmGooglemapsatellite);

		own.rdbtnmntmGooglemaphybrid = new JRadioButtonMenuItem(
				"GoogleMap (Hybrid)");
		own.mapRadioButtons.add(own.rdbtnmntmGooglemaphybrid);
		own.rdbtnmntmGooglemaphybrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.uiController.tileManagerGoogleMapHybrid();
			}
		});
		own.mnMaps.add(own.rdbtnmntmGooglemaphybrid);

		own.rdbtnmntmGooglemapterrain = new JRadioButtonMenuItem(
				"GoogleMap (Terrain)");
		own.mapRadioButtons.add(own.rdbtnmntmGooglemapterrain);
		own.rdbtnmntmGooglemapterrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.uiController.tileManagerGoogleMapTerrain();
			}
		});
		own.mnMaps.add(own.rdbtnmntmGooglemapterrain);
	}
}