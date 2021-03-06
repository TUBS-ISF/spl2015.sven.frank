/*
 * File:           MapQuestRoutingParser.java
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

import java.io.IOException;
import java.util.Stack;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.*;

/**
 *
 * @author Hubert
 */
public class MapQuestRoutingParser implements ContentHandler {
    private MapQuestRoutingHandler handler;
    private Stack context;
    private StringBuffer buffer;
    private EntityResolver resolver;

    /**
     *
     * Creates a parser instance.
     * @param handler handler interface implementation (never <code>null</code>
     * @param resolver SAX entity resolver implementation or <code>null</code>.
     * It is recommended that it could be able to resolve at least the DTD.
     */
    public MapQuestRoutingParser(final MapQuestRoutingHandler handler, final EntityResolver resolver) {
        this.handler = handler;
        this.resolver = resolver;
        buffer = new StringBuffer(111);
        context = new java.util.Stack();
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void setDocumentLocator(Locator locator) {
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void startDocument() throws SAXException {
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void endDocument() throws SAXException {
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void startElement(java.lang.String ns, java.lang.String name, java.lang.String qname, org.xml.sax.Attributes attrs) throws org.xml.sax.SAXException {
        dispatch(true);
        context.push(new Object[]{qname, new org.xml.sax.helpers.AttributesImpl(attrs)});
        if ("mustAvoidLinkIds".equals(qname)) {
            handler.handle_mustAvoidLinkIds(attrs);
        } else if ("location".equals(qname)) {
            handler.start_location(attrs);
        } else if ("info".equals(qname)) {
            handler.start_info(attrs);
        } else if ("postalCode".equals(qname)) {
            handler.handle_postalCode(attrs);
        } else if ("signs".equals(qname)) {
            handler.handle_signs(attrs);
        } else if ("shape".equals(qname)) {
            handler.start_shape(attrs);
        } else if ("copyright".equals(qname)) {
            handler.start_copyright(attrs);
        } else if ("displayLatLng".equals(qname)) {
            handler.start_displayLatLng(attrs);
        } else if ("streets".equals(qname)) {
            handler.start_streets(attrs);
        } else if ("startPoint".equals(qname)) {
            handler.start_startPoint(attrs);
        } else if ("maneuvers".equals(qname)) {
            handler.start_maneuvers(attrs);
        } else if ("lr".equals(qname)) {
            handler.start_lr(attrs);
        } else if ("messages".equals(qname)) {
            handler.handle_messages(attrs);
        } else if ("response".equals(qname)) {
            handler.start_response(attrs);
        } else if ("boundingBox".equals(qname)) {
            handler.start_boundingBox(attrs);
        } else if ("locations".equals(qname)) {
            handler.start_locations(attrs);
        } else if ("linkIds".equals(qname)) {
            handler.handle_linkIds(attrs);
        } else if ("legIndexes".equals(qname)) {
            handler.start_legIndexes(attrs);
        } else if ("options".equals(qname)) {
            handler.start_options(attrs);
        } else if ("maneuverNotes".equals(qname)) {
            handler.handle_maneuverNotes(attrs);
        } else if ("latLng".equals(qname)) {
            handler.start_latLng(attrs);
        } else if ("ul".equals(qname)) {
            handler.start_ul(attrs);
        } else if ("maneuverIndexes".equals(qname)) {
            handler.start_maneuverIndexes(attrs);
        } else if ("adminArea5".equals(qname)) {
            handler.handle_adminArea5(attrs);
        } else if ("computedWaypoints".equals(qname)) {
            handler.handle_computedWaypoints(attrs);
        } else if ("tryAvoidLinkIds".equals(qname)) {
            handler.handle_tryAvoidLinkIds(attrs);
        } else if ("leg".equals(qname)) {
            handler.start_leg(attrs);
        } else if ("route".equals(qname)) {
            handler.start_route(attrs);
        } else if ("shapePoints".equals(qname)) {
            handler.start_shapePoints(attrs);
        } else if ("legs".equals(qname)) {
            handler.start_legs(attrs);
        } else if ("maneuver".equals(qname)) {
            handler.start_maneuver(attrs);
        }
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void endElement(java.lang.String ns, java.lang.String name, java.lang.String qname) throws org.xml.sax.SAXException {
        dispatch(false);
        context.pop();
        if ("location".equals(qname)) {
            handler.end_location();
        } else if ("info".equals(qname)) {
            handler.end_info();
        } else if ("shape".equals(qname)) {
            handler.end_shape();
        } else if ("copyright".equals(qname)) {
            handler.end_copyright();
        } else if ("displayLatLng".equals(qname)) {
            handler.end_displayLatLng();
        } else if ("streets".equals(qname)) {
            handler.end_streets();
        } else if ("startPoint".equals(qname)) {
            handler.end_startPoint();
        } else if ("maneuvers".equals(qname)) {
            handler.end_maneuvers();
        } else if ("lr".equals(qname)) {
            handler.end_lr();
        } else if ("response".equals(qname)) {
            handler.end_response();
        } else if ("boundingBox".equals(qname)) {
            handler.end_boundingBox();
        } else if ("locations".equals(qname)) {
            handler.end_locations();
        } else if ("legIndexes".equals(qname)) {
            handler.end_legIndexes();
        } else if ("options".equals(qname)) {
            handler.end_options();
        } else if ("latLng".equals(qname)) {
            handler.end_latLng();
        } else if ("ul".equals(qname)) {
            handler.end_ul();
        } else if ("maneuverIndexes".equals(qname)) {
            handler.end_maneuverIndexes();
        } else if ("leg".equals(qname)) {
            handler.end_leg();
        } else if ("route".equals(qname)) {
            handler.end_route();
        } else if ("shapePoints".equals(qname)) {
            handler.end_shapePoints();
        } else if ("legs".equals(qname)) {
            handler.end_legs();
        } else if ("maneuver".equals(qname)) {
            handler.end_maneuver();
        }
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void characters(char[] chars, int start, int len) throws SAXException {
        buffer.append(chars, start, len);
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void ignorableWhitespace(char[] chars, int start, int len) throws SAXException {
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void processingInstruction(String target, String data) throws SAXException {
    }

    public final void startPrefixMapping(java.lang.String prefix, java.lang.String uri) throws org.xml.sax.SAXException {
    }

    public final void endPrefixMapping(java.lang.String prefix) throws org.xml.sax.SAXException {
    }

    public final void skippedEntity(java.lang.String name) throws org.xml.sax.SAXException {
    }

    private void dispatch(final boolean fireOnlyIfMixed) throws SAXException {
        if (fireOnlyIfMixed && buffer.length() == 0) {
            return; //skip it
        }
        Object[] ctx = (Object[]) context.peek();
        String here = (String) ctx[0];
        org.xml.sax.Attributes attrs = (org.xml.sax.Attributes) ctx[1];
        if ("drivingStyle".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_drivingStyle(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("countryBoundaryDisplay".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_countryBoundaryDisplay(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("generalize".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_generalize(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("imageUrl".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_imageUrl(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("narrative".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_narrative(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("iconUrl".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_iconUrl(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("street".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_street(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("destinationManeuverDisplay".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_destinationManeuverDisplay(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("type".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_type(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("timeType".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_timeType(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("isCollapseOrigNarrEnabled".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_isCollapseOrigNarrEnabled(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("time".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_time(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("sideOfStreet".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_sideOfStreet(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("hasCountryCross".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_hasCountryCross(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("directionName".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_directionName(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("geocodeQualityCode".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_geocodeQualityCode(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("text".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_text(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("index".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_index(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("stateBoundaryDisplay".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_stateBoundaryDisplay(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("maxLinkId".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_maxLinkId(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("fuelUsed".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_fuelUsed(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("shape".equals(here)) {
            handler.handle_shape(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("locationSequence".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_locationSequence(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("sessionId".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_sessionId(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("geocodeQuality".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_geocodeQuality(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("highwayEfficiency".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_highwayEfficiency(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("sideOfStreetDisplay".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_sideOfStreetDisplay(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("direction".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_direction(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("narrativeType".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_narrativeType(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("isCollapseDestNarrEnabled".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_isCollapseDestNarrEnabled(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("locale".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_locale(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("avoidTimedConditions".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_avoidTimedConditions(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("lng".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_lng(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("enhancedNarrative".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_enhancedNarrative(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("hasUnpaved".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_hasUnpaved(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("hasHighway".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_hasHighway(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("statusCode".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_statusCode(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("realTime".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_realTime(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("distance".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_distance(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("routeType".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_routeType(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("hasSeasonalClosure".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_hasSeasonalClosure(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("lat".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_lat(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("hasTollRoad".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_hasTollRoad(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("adminArea4".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_adminArea4(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("adminArea1".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_adminArea1(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("imageAltText".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_imageAltText(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("adminArea3".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_adminArea3(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("unit".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_unit(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("linkId".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_linkId(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("shapeFormat".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_shapeFormat(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("dragPoint".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_dragPoint(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("useTraffic".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_useTraffic(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("returnLinkDirections".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_returnLinkDirections(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("manmaps".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_manmaps(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("shapePoints".equals(here)) {
            handler.handle_shapePoints(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("attributes".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_attributes(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("formattedTime".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_formattedTime(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("hasFerry".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_hasFerry(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("mapUrl".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_mapUrl(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("turnType".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_turnType(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else {
            //do not care
        }
        buffer.delete(0, buffer.length());
    }

    /**
     *
     * The recognizer entry method taking an InputSource.
     * @param input InputSource to be parsed.
     * @throws java.io.IOException on I/O error
     * @throws org.xml.sax.SAXException propagated exception thrown by a DocumentHandler
     * @throws javax.xml.parsers.ParserConfigurationException a parser satisfying the requested configuration cannot be created
     * @throws javax.xml.parsers.FactoryConfigurationRrror if the implementation cannot be instantiated
     */
    public void parse(final org.xml.sax.InputSource input) throws SAXException, ParserConfigurationException, IOException {
        parse(input, this);
    }

    /**
     *
     * The recognizer entry method taking a URL.
     * @param url URL Source to be parsed.
     * @throws java.io.IOException on I/O error
     * @throws org.xml.sax.SAXException propagated exception thrown by a DocumentHandler
     * @throws javax.xml.parsers.ParserConfigurationException a parser satisfying the requested configuration cannot be created
     * @throws javax.xml.parsers.FactoryConfigurationRrror if the implementation cannot be instantiated
     */
    public void parse(final java.net.URL url) throws SAXException, ParserConfigurationException, IOException {
        parse(new org.xml.sax.InputSource(url.toExternalForm()), this);
    }

    /**
     *
     * The recognizer entry method taking an Inputsource.
     * @param input InputSource to be parsed.
     * @throws java.io.IOException on I/O error
     * @throws org.xml.sax.SAXException propagated exception thrown by a DocumentHandler
     * @throws javax.xml.parsers.ParserConfigurationException a parser satisfying the requested configuration cannot be created
     * @throws javax.xml.parsers.FactoryConfigurationRrror if the implementation cannot be instantiated
     */
    public static void parse(final org.xml.sax.InputSource input, final MapQuestRoutingHandler handler) throws SAXException, ParserConfigurationException, IOException {
        parse(input, new MapQuestRoutingParser(handler, null));
    }

    /**
     *
     * The recognizer entry method taking a URL.
     * @param url URL source to be parsed.
     * @throws java.io.IOException on I/O error
     * @throws org.xml.sax.SAXException propagated exception thrown by a DocumentHandler
     * @throws javax.xml.parsers.ParserConfigurationException a parser satisfying the requested configuration cannot be created
     * @throws javax.xml.parsers.FactoryConfigurationRrror if the implementation cannot be instantiated
     */
    public static void parse(final java.net.URL url, final MapQuestRoutingHandler handler) throws SAXException, ParserConfigurationException, IOException {
        parse(new org.xml.sax.InputSource(url.toExternalForm()), handler);
    }

    private static void parse(final org.xml.sax.InputSource input, final MapQuestRoutingParser recognizer) throws SAXException, ParserConfigurationException, IOException {
        javax.xml.parsers.SAXParserFactory factory = javax.xml.parsers.SAXParserFactory.newInstance();
        factory.setValidating(false); //the code was generated according DTD
        //the code was generated according DTD
        factory.setNamespaceAware(false); //the code was generated according DTD
        //the code was generated according DTD
        //the code was generated according DTD
        XMLReader parser = factory.newSAXParser().getXMLReader();
        parser.setContentHandler(recognizer);
        parser.setErrorHandler(recognizer.getDefaultErrorHandler());
        if (recognizer.resolver != null) {
            parser.setEntityResolver(recognizer.resolver);
        }
        parser.parse(input);
    }

    /**
     *
     * Creates default error handler used by this parser.
     * @return org.xml.sax.ErrorHandler implementation
     */
    protected ErrorHandler getDefaultErrorHandler() {
        return new ErrorHandler() {

            public void error(SAXParseException ex) throws SAXException {
                if (context.isEmpty()) {
                    System.err.println("Missing DOCTYPE.");
                }
                throw ex;
            }

            public void fatalError(SAXParseException ex) throws SAXException {
                throw ex;
            }

            public void warning(SAXParseException ex) throws SAXException {
                // ignore
            }
        };
    }

}
