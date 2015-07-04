/*
 * File:           GPXRoute_Handler.java
 * Date:           20. Mai 2010  10:57
 *
 * @author  hlutnik
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jgpstrackedit.trackfile.gpxroute; 

import org.xml.sax.Attributes; 
import org.xml.sax.SAXException; 

/**
 *
 * @author hlutnik
 */
public  interface  GPXRoute_Handler {
	

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_time(final String data, final Attributes meta) throws SAXException;

	

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
    public void start_rtept(final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element end event handling method.
     */
    public void end_rtept() throws SAXException;

	

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
    public void start_rte(final Attributes meta) throws SAXException;

	

    /**
     *
     * A container element end event handling method.
     */
    public void end_rte() throws SAXException;

	

    /**
     *
     * An empty element event handling method.
     * @param data value or null
     */
    public void handle_copyright(final Attributes meta) throws SAXException;

	

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
