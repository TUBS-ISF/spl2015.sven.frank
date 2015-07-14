/*
 * File:           KmlParser.java
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

import java.io.IOException;
import java.util.Stack;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.*;

/**
 *
 * @author hlutnik
 */
public class KmlParser implements ContentHandler {
    private KmlHandler handler;
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
    public KmlParser(final KmlHandler handler, final EntityResolver resolver) {
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
        if ("LineStyle".equals(qname)) {
            handler.start_LineStyle(attrs);
        } else if ("Pair".equals(qname)) {
            handler.start_Pair(attrs);
        } else if ("Style".equals(qname)) {
            handler.start_Style(attrs);
        } else if ("MultiGeometry".equals(qname)) {
            handler.start_MultiGeometry(attrs);
        } else if ("kml".equals(qname)) {
            handler.start_kml(attrs);
        } else if ("BalloonStyle".equals(qname)) {
            handler.start_BalloonStyle(attrs);
        } else if ("Point".equals(qname)) {
            handler.start_Point(attrs);
        } else if ("Document".equals(qname)) {
            handler.start_Document(attrs);
        } else if ("Snippet".equals(qname)) {
            handler.handle_Snippet(attrs);
        } else if ("LineString".equals(qname)) {
            handler.start_LineString(attrs);
        } else if ("StyleMap".equals(qname)) {
            handler.start_StyleMap(attrs);
        } else if ("LabelStyle".equals(qname)) {
            handler.start_LabelStyle(attrs);
        } else if ("IconStyle".equals(qname)) {
            handler.start_IconStyle(attrs);
        } else if ("Placemark".equals(qname)) {
            handler.start_Placemark(attrs);
        } else if ("Icon".equals(qname)) {
            handler.start_Icon(attrs);
        }
    }

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void endElement(java.lang.String ns, java.lang.String name, java.lang.String qname) throws org.xml.sax.SAXException {
        dispatch(false);
        context.pop();
        if ("LineStyle".equals(qname)) {
            handler.end_LineStyle();
        } else if ("Pair".equals(qname)) {
            handler.end_Pair();
        } else if ("Style".equals(qname)) {
            handler.end_Style();
        } else if ("MultiGeometry".equals(qname)) {
            handler.end_MultiGeometry();
        } else if ("kml".equals(qname)) {
            handler.end_kml();
        } else if ("BalloonStyle".equals(qname)) {
            handler.end_BalloonStyle();
        } else if ("Point".equals(qname)) {
            handler.end_Point();
        } else if ("Document".equals(qname)) {
            handler.end_Document();
        } else if ("LineString".equals(qname)) {
            handler.end_LineString();
        } else if ("StyleMap".equals(qname)) {
            handler.end_StyleMap();
        } else if ("LabelStyle".equals(qname)) {
            handler.end_LabelStyle();
        } else if ("IconStyle".equals(qname)) {
            handler.end_IconStyle();
        } else if ("Placemark".equals(qname)) {
            handler.end_Placemark();
        } else if ("Icon".equals(qname)) {
            handler.end_Icon();
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
        if ("scale".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_scale(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("visibility".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_visibility(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("styleUrl".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_styleUrl(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("extrude".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_extrude(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("open".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_open(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("description".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_description(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("name".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_name(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("colorMode".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_colorMode(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("href".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_href(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("key".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_key(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("coordinates".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_coordinates(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("text".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_text(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("width".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_width(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("tessellate".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_tessellate(buffer.length() == 0 ? null : buffer.toString(), attrs);
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
    public static void parse(final org.xml.sax.InputSource input, final KmlHandler handler) throws SAXException, ParserConfigurationException, IOException {
        parse(input, new KmlParser(handler, null));
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
    public static void parse(final java.net.URL url, final KmlHandler handler) throws SAXException, ParserConfigurationException, IOException {
        parse(new org.xml.sax.InputSource(url.toExternalForm()), handler);
    }

    private static void parse(final org.xml.sax.InputSource input, final KmlParser recognizer) throws SAXException, ParserConfigurationException, IOException {
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