/*
 * File:           TrackHandler.java
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
public interface TrackHandler {

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_gpsies_totalAscentMeter(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_text(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_trkpt(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_trkpt() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_link(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_link() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_trk(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_trk() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_extensions(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_extensions() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_time(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_trkseg(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_trkseg() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_gpsies_maxHeightMeter(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_name(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_gpsies_totalDescentMeter(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_gpsies_property(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_gpsies_minHeightMeter(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_gpx(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_gpx() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_gpsies_trackLengthMeter(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_ele(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_metadata(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_metadata() throws SAXException;
    
}
