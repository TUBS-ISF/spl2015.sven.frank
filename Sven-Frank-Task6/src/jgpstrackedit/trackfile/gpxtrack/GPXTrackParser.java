/*
 * File:           GPXTrackParser.java
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

import java.io.IOException;
import java.util.Stack;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.*;

/**
 *
 * @author hlutnik
 */
public class GPXTrackParser implements ContentHandler {
    private GPXTrackHandler handler;
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
    public GPXTrackParser(final GPXTrackHandler handler, final EntityResolver resolver) {
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
        if ("trkpt".equals(qname)) {
            handler.start_trkpt(attrs);
        } else if ("link".equals(qname)) {
            handler.start_link(attrs);
        } else if ("trk".equals(qname)) {
            handler.start_trk(attrs);
        } else if ("extensions".equals(qname)) {
            handler.start_extensions(attrs);
        } else if ("trkseg".equals(qname)) {
            handler.start_trkseg(attrs);
        } else if ("gpx".equals(qname)) {
            handler.start_gpx(attrs);
        } else if ("metadata".equals(qname)) {
            handler.start_metadata(attrs);
        }
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void endElement(java.lang.String ns, java.lang.String name, java.lang.String qname) throws org.xml.sax.SAXException {
        dispatch(false);
        context.pop();
        if ("trkpt".equals(qname)) {
            handler.end_trkpt();
        } else if ("link".equals(qname)) {
            handler.end_link();
        } else if ("trk".equals(qname)) {
            handler.end_trk();
        } else if ("extensions".equals(qname)) {
            handler.end_extensions();
        } else if ("trkseg".equals(qname)) {
            handler.end_trkseg();
        } else if ("gpx".equals(qname)) {
            handler.end_gpx();
        } else if ("metadata".equals(qname)) {
            handler.end_metadata();
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
        if ("gpsies:totalAscentMeter".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_gpsies_totalAscentMeter(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("text".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_text(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("time".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_time(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("gpsies:maxHeightMeter".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_gpsies_maxHeightMeter(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("name".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_name(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("gpsies:totalDescentMeter".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_gpsies_totalDescentMeter(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("gpsies:property".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_gpsies_property(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("gpsies:minHeightMeter".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_gpsies_minHeightMeter(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("gpsies:trackLengthMeter".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_gpsies_trackLengthMeter(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("ele".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_ele(buffer.length() == 0 ? null : buffer.toString(), attrs);
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
    public static void parse(final org.xml.sax.InputSource input, final GPXTrackHandler handler) throws SAXException, ParserConfigurationException, IOException {
        parse(input, new GPXTrackParser(handler, null));
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
    public static void parse(final java.net.URL url, final GPXTrackHandler handler) throws SAXException, ParserConfigurationException, IOException {
        parse(new org.xml.sax.InputSource(url.toExternalForm()), handler);
    }

    private static void parse(final org.xml.sax.InputSource input, final GPXTrackParser recognizer) throws SAXException, ParserConfigurationException, IOException {
        javax.xml.parsers.SAXParserFactory factory = javax.xml.parsers.SAXParserFactory.newInstance();
        factory.setValidating(false); //the code was generated according DTD
        factory.setNamespaceAware(false); //the code was generated according DTD
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
