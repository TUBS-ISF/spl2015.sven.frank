/*
 * File:           KmlHandler.java
 * Date:           18. Januar 2012  10:47
 *
 * @author  hlutnik
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jgpstrackedit.trackfile.kml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author hlutnik
 */
public interface KmlHandler {

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_scale(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_LineStyle(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_LineStyle() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_visibility(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_Pair(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_Pair() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_Style(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_Style() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_styleUrl(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_extrude(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_open(final String data, final Attributes meta) throws SAXException;

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
    public void handle_name(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_MultiGeometry(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_MultiGeometry() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_kml(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_kml() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_BalloonStyle(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_BalloonStyle() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_colorMode(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_href(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_key(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_Point(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_Point() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_coordinates(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_Document(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_Document() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_text(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_width(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * An empty element event handling method.
     * @param data value or null
     */
    public void handle_Snippet(final Attributes meta) throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_tessellate(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_LineString(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_LineString() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_StyleMap(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_StyleMap() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_LabelStyle(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_LabelStyle() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_IconStyle(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_IconStyle() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_Placemark(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_Placemark() throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_Icon(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_Icon() throws SAXException;
    
}
