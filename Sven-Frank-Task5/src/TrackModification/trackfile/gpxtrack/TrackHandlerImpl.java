/*
 * File:           TrackHandlerImpl.java
 * Date:           18. Januar 2012  11:05
 *
 * @author  hlutnik
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jgpstrackedit.trackfile.gpxtrack; 

import org.xml.sax.Attributes; 
import org.xml.sax.SAXException; 

/**
 *
 * @author hlutnik
 */
public  class  TrackHandlerImpl  implements TrackHandler {
	
    public static final boolean DEBUG = false;

	

    public void handle_gpsies_totalAscentMeter(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_gpsies_totalAscentMeter: " + meta);
        }
    }

	

    public void handle_text(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_text: " + meta);
        }
    }

	

    public void start_trkpt(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_trkpt: " + meta);
        }
    }

	

    public void end_trkpt() throws SAXException {
        if (DEBUG) {
            System.err.println("end_trkpt()");
        }
    }

	

    public void start_link(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_link: " + meta);
        }
    }

	

    public void end_link() throws SAXException {
        if (DEBUG) {
            System.err.println("end_link()");
        }
    }

	

    public void start_trk(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_trk: " + meta);
        }
    }

	

    public void end_trk() throws SAXException {
        if (DEBUG) {
            System.err.println("end_trk()");
        }
    }

	

    public void start_extensions(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_extensions: " + meta);
        }
    }

	

    public void end_extensions() throws SAXException {
        if (DEBUG) {
            System.err.println("end_extensions()");
        }
    }

	

    public void handle_time(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_time: " + meta);
        }
    }

	

    public void start_trkseg(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_trkseg: " + meta);
        }
    }

	

    public void end_trkseg() throws SAXException {
        if (DEBUG) {
            System.err.println("end_trkseg()");
        }
    }

	

    public void handle_gpsies_maxHeightMeter(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_gpsies_maxHeightMeter: " + meta);
        }
    }

	

    public void handle_name(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_name: " + meta);
        }
    }

	

    public void handle_gpsies_totalDescentMeter(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_gpsies_totalDescentMeter: " + meta);
        }
    }

	

    public void handle_gpsies_property(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_gpsies_property: " + meta);
        }
    }

	

    public void handle_gpsies_minHeightMeter(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_gpsies_minHeightMeter: " + meta);
        }
    }

	

    public void start_gpx(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_gpx: " + meta);
        }
    }

	

    public void end_gpx() throws SAXException {
        if (DEBUG) {
            System.err.println("end_gpx()");
        }
    }

	

    public void handle_gpsies_trackLengthMeter(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_gpsies_trackLengthMeter: " + meta);
        }
    }

	

    public void handle_ele(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_ele: " + meta);
        }
    }

	

    public void start_metadata(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_metadata: " + meta);
        }
    }

	

    public void end_metadata() throws SAXException {
        if (DEBUG) {
            System.err.println("end_metadata()");
        }
    }


}
