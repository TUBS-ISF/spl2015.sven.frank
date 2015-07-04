/*
 * File:           GPSiesResultHandler.java
 * Date:           09. März 2012  17:27
 *
 * @author  Hubert
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jgpstrackedit.gpsies; 

import org.xml.sax.Attributes; 
import org.xml.sax.SAXException; 

/**
 *
 * @author Hubert
 */
public  interface  GPSiesResultHandler {
	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_startPointLon(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_startPointLat(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_endPointLat(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_meta(final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element end event handling method.
     */
    public void end_meta() throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_resultPage(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_changedDate(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_title(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_username(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_description(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_endPointCountry(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_filetype(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_altitudeMaxHeightM(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_createdDate(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_endPointLon(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_limit(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_altitudeDifferenceM(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_totalDescentM(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_track(final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element end event handling method.
     */
    public void end_track() throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_totalAscentM(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_altitudeMinHeightM(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_tracks(final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element end event handling method.
     */
    public void end_tracks() throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_requestUrl(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_countTrackpoints(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_fileId(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_startPointCountry(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_trackProperty(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_downloadLink(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_trackLengthM(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_gpsies(final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element end event handling method.
     */
    public void end_gpsies() throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_resultSize(final String data, final Attributes meta) throws SAXException;

	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_downloadBaseUrl(final String data, final Attributes meta) throws SAXException;


}