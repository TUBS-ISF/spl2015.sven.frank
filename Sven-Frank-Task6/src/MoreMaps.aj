import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

import jgpstrackedit.view.JGPSTrackEdit;


public privileged aspect MoreMaps {
	declare parents : JGPSTrackEdit implements JGPSTrackEdit;

	pointcut addMoreMapsVariant () :
		call(private void JGPSTrackEdit.addMaps()) ; 
	after(JGPSTrackEdit own) : addMoreMapsVariant() && this(own) {
		if (own.mapType.equals("MapQuest")) {
			own.uiController.tileManagerMapQuest();
			own.rdbtnmntmMapquest.setSelected(true);
		} else if (own.mapType.equals("MapQuestSat")) {
			own.uiController.tileManagerMapQuestSat();
			own.rdbtnmntmMapquestsatellite.setSelected(true);
		} else if (own.mapType.equals("MapQuestHybride")) {
			own.uiController.tileManagerMapQuestHybride();
			own.rdbtnmntmMapquesthybride.setSelected(true);
		} else if (own.mapType.equals("HikeBikeMap")) {
			own.uiController.tileManagerHikeBikeMap();
			own.rdbtnmntmHikebikemap.setSelected(true);
		} else if (own.mapType.equals("4UMap")) {
			own.uiController.tileManager4UMap();
			own.rdbtnmntmumap.setSelected(true);
		} 
	}
	
	pointcut addMoreContextMenu () :
		call(private void JGPSTrackEdit.addMapsContextMenu()) ; 
	after(JGPSTrackEdit own) : addMoreContextMenu() && this(own) {
		own.rdbtnmntmHikebikemap = new JRadioButtonMenuItem("HikeBikeMap");
		
		own.mapRadioButtons.add(own.rdbtnmntmHikebikemap);
		own.rdbtnmntmHikebikemap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.uiController.tileManagerHikeBikeMap();
			}
		});
		own.mnMaps.add(own.rdbtnmntmHikebikemap);
		

		own.rdbtnmntmumap = new JRadioButtonMenuItem("4UMap");
		own.mapRadioButtons.add(own.rdbtnmntmumap);
		own.rdbtnmntmumap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.uiController.tileManager4UMap();
			}
		});
		own.mnMaps.add(own.rdbtnmntmumap);
		own.mnMaps.add(new JSeparator());

		own.rdbtnmntmMapquest = new JRadioButtonMenuItem("MapQuest");
		own.rdbtnmntmMapquest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				own.uiController.tileManagerMapQuest();
			}
		});
		own.mnMaps.add(own.rdbtnmntmMapquest);
	
		own.mapRadioButtons.add(own.rdbtnmntmMapquest);

		own.rdbtnmntmMapquestsatellite = new JRadioButtonMenuItem(
				"MapQuest (Satellite)");
		own.rdbtnmntmMapquestsatellite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.uiController.tileManagerMapQuestSat();
			}
		});
		own.mnMaps.add(own.rdbtnmntmMapquestsatellite);
		own.mapRadioButtons.add(own.rdbtnmntmMapquestsatellite);

		own.rdbtnmntmMapquesthybride = new JRadioButtonMenuItem(
				"MapQuest (Hybride)");
		own.rdbtnmntmMapquesthybride.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				own.uiController.tileManagerMapQuestHybride();
			}
		});
		own.mnMaps.add(own.rdbtnmntmMapquesthybride);
		own.mapRadioButtons.add(own.rdbtnmntmMapquesthybride);

		own.mnMaps.addSeparator();
	}
}