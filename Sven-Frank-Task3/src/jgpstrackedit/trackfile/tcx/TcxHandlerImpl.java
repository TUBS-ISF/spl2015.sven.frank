/*
 * File:           TcxHandlerImpl.java
 * Date:           04. März 2012  08:21
 *
 * @author  Hubert
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jgpstrackedit.trackfile.tcx;

import jgpstrackedit.data.Track;
import jgpstrackedit.data.Point;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author Hubert
 */
public class TcxHandlerImpl implements TcxHandler {
    public static final boolean DEBUG = false;
	private Track track = new Track();
	private Point point;

    public void handle_LangID(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_LangID: " + meta);
        }
    }

    public void handle_TriggerMethod(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_TriggerMethod: " + meta);
        }
    }

    public void handle_Calories(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Calories: " + meta);
        }
    }

    public void handle_Type(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Type: " + meta);
        }
    }

    public void handle_BuildMinor(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_BuildMinor: " + meta);
        }
    }

    public void handle_MaximumSpeed(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_MaximumSpeed: " + meta);
        }
    }

    public void handle_BuildMajor(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_BuildMajor: " + meta);
        }
    }

    public void handle_Author(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Author: " + meta);
        }
    }

    public void start_Author(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Author: " + meta);
        }
    }

    public void end_Author() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Author()");
        }
    }

    public void handle_ProductID(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_ProductID: " + meta);
        }
    }

    public void handle_PartNumber(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_PartNumber: " + meta);
        }
    }

    public void handle_TotalTimeSeconds(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_TotalTimeSeconds: " + meta);
        }
    }

    public void handle_Time(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Time: " + meta);
        }
    }

    public void start_HeartRateBpm(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_HeartRateBpm: " + meta);
        }
    }

    public void end_HeartRateBpm() throws SAXException {
        if (DEBUG) {
            System.err.println("end_HeartRateBpm()");
        }
    }

    public void handle_Build(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Build: " + meta);
        }
    }

    public void start_Build(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Build: " + meta);
        }
    }

    public void end_Build() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Build()");
        }
    }

    public void handle_DistanceMeters(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_DistanceMeters: " + meta);
        }
    }

    public void handle_VersionMajor(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_VersionMajor: " + meta);
        }
    }

    public void start_Version(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Version: " + meta);
        }
    }

    public void end_Version() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Version()");
        }
    }

    public void handle_UnitId(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_UnitId: " + meta);
        }
    }

    public void handle_Cadence(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Cadence: " + meta);
        }
    }

    public void handle_Trackpoint(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Trackpoint: " + meta);
        }
    }

    public void start_Trackpoint(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Trackpoint: " + meta);
        }
        point = new Point();
    }

    public void end_Trackpoint() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Trackpoint()");
        }
        track.add(point);
    }

    public void handle_LongitudeDegrees(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_LongitudeDegrees: " + meta);
        }
        point.setLongitude(data);
    }

    public void handle_Value(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Value: " + meta);
        }
    }

    public void handle_Creator(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Creator: " + meta);
        }
    }

    public void start_Creator(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Creator: " + meta);
        }
    }

    public void end_Creator() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Creator()");
        }
    }

    public void handle_Lap(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Lap: " + meta);
        }
    }

    public void start_Lap(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Lap: " + meta);
        }
    }

    public void end_Lap() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Lap()");
        }
    }

    public void handle_Track(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Track: " + meta);
        }
    }

    public void start_Track(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Track: " + meta);
        }
    }

    public void end_Track() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Track()");
        }
    }

    public void handle_AltitudeMeters(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_AltitudeMeters: " + meta);
        }
        point.setElevation(data);
    }

    public void handle_Name(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Name: " + meta);
        }
    }

    public void handle_TrainingCenterDatabase(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_TrainingCenterDatabase: " + meta);
        }
    }

    public void start_TrainingCenterDatabase(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_TrainingCenterDatabase: " + meta);
        }
    }

    public void end_TrainingCenterDatabase() throws SAXException {
        if (DEBUG) {
            System.err.println("end_TrainingCenterDatabase()");
        }
    }

    public void handle_Activity(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Activity: " + meta);
        }
    }

    public void start_Activity(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Activity: " + meta);
        }
    }

    public void end_Activity() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Activity()");
        }
        track.setValid(true);
    }

    public void handle_VersionMinor(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_VersionMinor: " + meta);
        }
    }

    public void handle_LatitudeDegrees(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_LatitudeDegrees: " + meta);
        }
        point.setLatitude(data);
    }

    public void handle_Intensity(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Intensity: " + meta);
        }
    }

    public void start_AverageHeartRateBpm(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_AverageHeartRateBpm: " + meta);
        }
    }

    public void end_AverageHeartRateBpm() throws SAXException {
        if (DEBUG) {
            System.err.println("end_AverageHeartRateBpm()");
        }
    }

    public void start_Position(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Position: " + meta);
        }
    }

    public void end_Position() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Position()");
        }
    }

    public void handle_Id(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Id: " + meta);
        }
        track.setName(data);
    }

    public void handle_SensorState(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_SensorState: " + meta);
        }
    }

    public void start_MaximumHeartRateBpm(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_MaximumHeartRateBpm: " + meta);
        }
    }

    public void end_MaximumHeartRateBpm() throws SAXException {
        if (DEBUG) {
            System.err.println("end_MaximumHeartRateBpm()");
        }
    }

    public void handle_Activities(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_Activities: " + meta);
        }
    }

    public void start_Activities(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_Activities: " + meta);
        }
    }

    public void end_Activities() throws SAXException {
        if (DEBUG) {
            System.err.println("end_Activities()");
        }
    }

	public Track getTrack() {
		// TODO Auto-generated method stub
		return track;
	}

}
