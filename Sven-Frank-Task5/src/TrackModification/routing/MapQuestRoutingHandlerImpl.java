/*
 * File:           MapQuestRoutingHandlerImpl.java
 * Date:           19. März 2012  11:04
 *
 * @author  Hubert
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jgpstrackedit.routing; 

import jgpstrackedit.data.Point; 
import java.util.ArrayList; 

import org.xml.sax.Attributes; 
import org.xml.sax.SAXException; 

/**
 * 
 * @author Hubert
 */
public  class  MapQuestRoutingHandlerImpl  implements MapQuestRoutingHandler {
	
	public static final boolean DEBUG = false;

	

	private ArrayList<Point> points = null;

	
	private Point point = null;

	

	public ArrayList<Point> getPoints() {
		return points;
	}

	

	public void start_shapePoints(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("##start_shapePoints: " + meta);
		}
		points = new ArrayList<Point>();
		if (DEBUG) {
			System.err.println("points created");
		}
	}

	

	public void handle_lng(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("##handle_lng: " + meta);
		}
		if (point != null) {
			point.setLongitude(data);
			if (DEBUG) {
				System.err.println("Long: " + data);
			}
		}

	}

	

	public void handle_lat(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("##handle_lat: " + meta);
		}
		if (point != null) {
			point.setLatitude(data);
			if (DEBUG) {
				System.err.println("Lat: " + data);
			}
		}
	}

	

	public void start_latLng(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("##start_latLng: " + meta);
		}
		if (points != null) {
			point = new Point();
			points.add(point);
			if (DEBUG) {
				System.err.println("New Point, added");
			}
		}
	}

	

	public void handle_mustAvoidLinkIds(final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_mustAvoidLinkIds: " + meta);
		}
	}

	

	public void handle_drivingStyle(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_drivingStyle: " + meta);
		}
	}

	

	public void handle_countryBoundaryDisplay(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_countryBoundaryDisplay: " + meta);
		}
	}

	

	public void handle_generalize(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_generalize: " + meta);
		}
	}

	

	public void start_location(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_location: " + meta);
		}
	}

	

	public void end_location() throws SAXException {
		if (DEBUG) {
			System.err.println("end_location()");
		}
	}

	

	public void handle_imageUrl(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_imageUrl: " + meta);
		}
	}

	

	public void handle_narrative(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_narrative: " + meta);
		}
	}

	

	public void handle_iconUrl(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_iconUrl: " + meta);
		}
	}

	

	public void handle_street(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_street: " + meta);
		}
	}

	

	public void handle_destinationManeuverDisplay(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_destinationManeuverDisplay: " + meta);
		}
	}

	

	public void handle_type(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_type: " + meta);
		}
	}

	

	public void handle_timeType(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_timeType: " + meta);
		}
	}

	

	public void start_info(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_info: " + meta);
		}
	}

	

	public void end_info() throws SAXException {
		if (DEBUG) {
			System.err.println("end_info()");
		}
	}

	

	public void handle_isCollapseOrigNarrEnabled(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_isCollapseOrigNarrEnabled: " + meta);
		}
	}

	

	public void handle_time(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_time: " + meta);
		}
	}

	

	public void handle_postalCode(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_postalCode: " + meta);
		}
	}

	

	public void handle_sideOfStreet(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_sideOfStreet: " + meta);
		}
	}

	

	public void handle_hasCountryCross(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_hasCountryCross: " + meta);
		}
	}

	

	public void handle_directionName(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_directionName: " + meta);
		}
	}

	

	public void handle_geocodeQualityCode(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_geocodeQualityCode: " + meta);
		}
	}

	

	public void handle_signs(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_signs: " + meta);
		}
	}

	

	public void handle_text(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_text: " + meta);
		}
	}

	

	public void handle_index(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_index: " + meta);
		}
	}

	

	public void handle_stateBoundaryDisplay(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_stateBoundaryDisplay: " + meta);
		}
	}

	

	public void handle_maxLinkId(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_maxLinkId: " + meta);
		}
	}

	

	public void handle_fuelUsed(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_fuelUsed: " + meta);
		}
	}

	

	public void handle_shape(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_shape: " + meta);
		}
	}

	

	public void start_shape(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_shape: " + meta);
		}
	}

	

	public void end_shape() throws SAXException {
		if (DEBUG) {
			System.err.println("end_shape()");
		}
	}

	

	public void start_copyright(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_copyright: " + meta);
		}
	}

	

	public void end_copyright() throws SAXException {
		if (DEBUG) {
			System.err.println("end_copyright()");
		}
	}

	

	public void start_displayLatLng(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_displayLatLng: " + meta);
		}
	}

	

	public void end_displayLatLng() throws SAXException {
		if (DEBUG) {
			System.err.println("end_displayLatLng()");
		}
	}

	

	public void handle_locationSequence(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_locationSequence: " + meta);
		}
	}

	

	public void handle_sessionId(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_sessionId: " + meta);
		}
	}

	

	public void handle_geocodeQuality(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_geocodeQuality: " + meta);
		}
	}

	

	public void start_streets(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_streets: " + meta);
		}
	}

	

	public void end_streets() throws SAXException {
		if (DEBUG) {
			System.err.println("end_streets()");
		}
	}

	

	public void handle_highwayEfficiency(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_highwayEfficiency: " + meta);
		}
	}

	

	public void handle_sideOfStreetDisplay(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_sideOfStreetDisplay: " + meta);
		}
	}

	

	public void start_startPoint(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_startPoint: " + meta);
		}
	}

	

	public void end_startPoint() throws SAXException {
		if (DEBUG) {
			System.err.println("end_startPoint()");
		}
	}

	

	public void start_maneuvers(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_maneuvers: " + meta);
		}
	}

	

	public void end_maneuvers() throws SAXException {
		if (DEBUG) {
			System.err.println("end_maneuvers()");
		}
	}

	

	public void start_lr(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_lr: " + meta);
		}
	}

	

	public void end_lr() throws SAXException {
		if (DEBUG) {
			System.err.println("end_lr()");
		}
	}

	

	public void handle_direction(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_direction: " + meta);
		}
	}

	

	public void handle_narrativeType(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_narrativeType: " + meta);
		}
	}

	

	public void handle_isCollapseDestNarrEnabled(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_isCollapseDestNarrEnabled: " + meta);
		}
	}

	

	public void handle_locale(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_locale: " + meta);
		}
	}

	

	public void handle_avoidTimedConditions(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_avoidTimedConditions: " + meta);
		}
	}

	

	public void handle_enhancedNarrative(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_enhancedNarrative: " + meta);
		}
	}

	

	public void handle_messages(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_messages: " + meta);
		}
	}

	

	public void handle_hasUnpaved(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_hasUnpaved: " + meta);
		}
	}

	

	public void handle_hasHighway(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_hasHighway: " + meta);
		}
	}

	

	public void start_response(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_response: " + meta);
		}
	}

	

	public void end_response() throws SAXException {
		if (DEBUG) {
			System.err.println("end_response()");
		}
	}

	

	public void handle_statusCode(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_statusCode: " + meta);
		}
	}

	

	public void handle_realTime(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_realTime: " + meta);
		}
	}

	

	public void start_boundingBox(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_boundingBox: " + meta);
		}
	}

	

	public void end_boundingBox() throws SAXException {
		if (DEBUG) {
			System.err.println("end_boundingBox()");
		}
	}

	

	public void handle_distance(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_distance: " + meta);
		}
	}

	

	public void handle_routeType(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_routeType: " + meta);
		}
	}

	

	public void start_locations(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_locations: " + meta);
		}
	}

	

	public void end_locations() throws SAXException {
		if (DEBUG) {
			System.err.println("end_locations()");
		}
	}

	

	public void handle_hasSeasonalClosure(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_hasSeasonalClosure: " + meta);
		}
	}

	

	public void handle_linkIds(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_linkIds: " + meta);
		}
	}

	

	public void start_legIndexes(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_legIndexes: " + meta);
		}
	}

	

	public void end_legIndexes() throws SAXException {
		if (DEBUG) {
			System.err.println("end_legIndexes()");
		}
	}

	

	public void start_options(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_options: " + meta);
		}
	}

	

	public void end_options() throws SAXException {
		if (DEBUG) {
			System.err.println("end_options()");
		}
	}

	

	public void handle_hasTollRoad(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_hasTollRoad: " + meta);
		}
	}

	

	public void handle_maneuverNotes(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_maneuverNotes: " + meta);
		}
	}

	

	public void end_latLng() throws SAXException {
		if (DEBUG) {
			System.err.println("end_latLng()");
		}
	}

	

	public void start_ul(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_ul: " + meta);
		}
	}

	

	public void end_ul() throws SAXException {
		if (DEBUG) {
			System.err.println("end_ul()");
		}
	}

	

	public void start_maneuverIndexes(final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("start_maneuverIndexes: " + meta);
		}
	}

	

	public void end_maneuverIndexes() throws SAXException {
		if (DEBUG) {
			System.err.println("end_maneuverIndexes()");
		}
	}

	

	public void handle_adminArea4(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_adminArea4: " + meta);
		}
	}

	

	public void handle_adminArea5(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_adminArea5: " + meta);
		}
	}

	

	public void handle_computedWaypoints(final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_computedWaypoints: " + meta);
		}
	}

	

	public void handle_adminArea1(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_adminArea1: " + meta);
		}
	}

	

	public void handle_imageAltText(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_imageAltText: " + meta);
		}
	}

	

	public void handle_adminArea3(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_adminArea3: " + meta);
		}
	}

	

	public void handle_tryAvoidLinkIds(final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_tryAvoidLinkIds: " + meta);
		}
	}

	

	public void handle_unit(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_unit: " + meta);
		}
	}

	

	public void start_leg(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_leg: " + meta);
		}
	}

	

	public void end_leg() throws SAXException {
		if (DEBUG) {
			System.err.println("end_leg()");
		}
	}

	

	public void handle_linkId(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_linkId: " + meta);
		}
	}

	

	public void handle_shapeFormat(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_shapeFormat: " + meta);
		}
	}

	

	public void handle_dragPoint(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_dragPoint: " + meta);
		}
	}

	

	public void handle_useTraffic(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_useTraffic: " + meta);
		}
	}

	

	public void start_route(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_route: " + meta);
		}
	}

	

	public void end_route() throws SAXException {
		if (DEBUG) {
			System.err.println("end_route()");
		}
	}

	

	public void handle_returnLinkDirections(final String data,
			final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("handle_returnLinkDirections: " + meta);
		}
	}

	

	public void handle_manmaps(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_manmaps: " + meta);
		}
	}

	

	public void handle_shapePoints(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("##handle_shapePoints: " + meta);
		}
	}

	

	public void end_shapePoints() throws SAXException {
		if (DEBUG) {
			System.err.println("end_shapePoints()");
		}
	}

	

	public void start_legs(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_legs: " + meta);
		}
	}

	

	public void end_legs() throws SAXException {
		if (DEBUG) {
			System.err.println("end_legs()");
		}
	}

	

	public void handle_attributes(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_attributes: " + meta);
		}
	}

	

	public void handle_formattedTime(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_formattedTime: " + meta);
		}
	}

	

	public void start_maneuver(final Attributes meta) throws SAXException {
		if (DEBUG) {
			System.err.println("start_maneuver: " + meta);
		}
	}

	

	public void end_maneuver() throws SAXException {
		if (DEBUG) {
			System.err.println("end_maneuver()");
		}
	}

	

	public void handle_hasFerry(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_hasFerry: " + meta);
		}
	}

	

	public void handle_mapUrl(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_mapUrl: " + meta);
		}
	}

	

	public void handle_turnType(final String data, final Attributes meta)
			throws SAXException {
		if (DEBUG) {
			System.err.println("handle_turnType: " + meta);
		}
	}


}
