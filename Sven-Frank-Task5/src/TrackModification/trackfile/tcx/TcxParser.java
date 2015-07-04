/*
 * File:           TcxParser.java
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

import java.io.IOException; 
import java.util.Stack; 
import javax.xml.parsers.ParserConfigurationException; 
import org.xml.sax.*; 

/**
 *
 * @author Hubert
 */
public  class  TcxParser  implements ContentHandler {
	
    private TcxHandler handler;

	
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
    public TcxParser(final TcxHandler handler, final EntityResolver resolver) {
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
        if ("Author".equals(qname)) {
            handler.start_Author(attrs);
        } else if ("HeartRateBpm".equals(qname)) {
            handler.start_HeartRateBpm(attrs);
        } else if ("Build".equals(qname)) {
            handler.start_Build(attrs);
        } else if ("Version".equals(qname)) {
            handler.start_Version(attrs);
        } else if ("Trackpoint".equals(qname)) {
            handler.start_Trackpoint(attrs);
        } else if ("Creator".equals(qname)) {
            handler.start_Creator(attrs);
        } else if ("Lap".equals(qname)) {
            handler.start_Lap(attrs);
        } else if ("Track".equals(qname)) {
            handler.start_Track(attrs);
        } else if ("TrainingCenterDatabase".equals(qname)) {
            handler.start_TrainingCenterDatabase(attrs);
        } else if ("Activity".equals(qname)) {
            handler.start_Activity(attrs);
        } else if ("AverageHeartRateBpm".equals(qname)) {
            handler.start_AverageHeartRateBpm(attrs);
        } else if ("Position".equals(qname)) {
            handler.start_Position(attrs);
        } else if ("MaximumHeartRateBpm".equals(qname)) {
            handler.start_MaximumHeartRateBpm(attrs);
        } else if ("Activities".equals(qname)) {
            handler.start_Activities(attrs);
        }
    }

	

    /**
     *
     * This SAX interface method is implemented by the parser.
     */
    public final void endElement(java.lang.String ns, java.lang.String name, java.lang.String qname) throws org.xml.sax.SAXException {
        dispatch(false);
        context.pop();
        if ("Author".equals(qname)) {
            handler.end_Author();
        } else if ("HeartRateBpm".equals(qname)) {
            handler.end_HeartRateBpm();
        } else if ("Build".equals(qname)) {
            handler.end_Build();
        } else if ("Version".equals(qname)) {
            handler.end_Version();
        } else if ("Trackpoint".equals(qname)) {
            handler.end_Trackpoint();
        } else if ("Creator".equals(qname)) {
            handler.end_Creator();
        } else if ("Lap".equals(qname)) {
            handler.end_Lap();
        } else if ("Track".equals(qname)) {
            handler.end_Track();
        } else if ("TrainingCenterDatabase".equals(qname)) {
            handler.end_TrainingCenterDatabase();
        } else if ("Activity".equals(qname)) {
            handler.end_Activity();
        } else if ("AverageHeartRateBpm".equals(qname)) {
            handler.end_AverageHeartRateBpm();
        } else if ("Position".equals(qname)) {
            handler.end_Position();
        } else if ("MaximumHeartRateBpm".equals(qname)) {
            handler.end_MaximumHeartRateBpm();
        } else if ("Activities".equals(qname)) {
            handler.end_Activities();
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
        if ("LangID".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_LangID(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("TriggerMethod".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_TriggerMethod(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Calories".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_Calories(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Type".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_Type(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("BuildMinor".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_BuildMinor(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("MaximumSpeed".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_MaximumSpeed(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("BuildMajor".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_BuildMajor(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Author".equals(here)) {
            handler.handle_Author(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("ProductID".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_ProductID(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("PartNumber".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_PartNumber(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("TotalTimeSeconds".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_TotalTimeSeconds(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Time".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_Time(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Build".equals(here)) {
            handler.handle_Build(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("DistanceMeters".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_DistanceMeters(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("VersionMajor".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_VersionMajor(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("UnitId".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_UnitId(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Cadence".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_Cadence(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Trackpoint".equals(here)) {
            handler.handle_Trackpoint(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("LongitudeDegrees".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_LongitudeDegrees(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Value".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_Value(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Creator".equals(here)) {
            handler.handle_Creator(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Lap".equals(here)) {
            handler.handle_Lap(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Track".equals(here)) {
            handler.handle_Track(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("AltitudeMeters".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_AltitudeMeters(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Name".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_Name(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("TrainingCenterDatabase".equals(here)) {
            handler.handle_TrainingCenterDatabase(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Activity".equals(here)) {
            handler.handle_Activity(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("VersionMinor".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_VersionMinor(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("LatitudeDegrees".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_LatitudeDegrees(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Intensity".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_Intensity(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Id".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_Id(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("SensorState".equals(here)) {
            if (fireOnlyIfMixed) {
                throw new IllegalStateException("Unexpected characters() event! (Missing DTD?)");
            }
            handler.handle_SensorState(buffer.length() == 0 ? null : buffer.toString(), attrs);
        } else if ("Activities".equals(here)) {
            handler.handle_Activities(buffer.length() == 0 ? null : buffer.toString(), attrs);
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
    public static void parse(final org.xml.sax.InputSource input, final TcxHandler handler) throws SAXException, ParserConfigurationException, IOException {
        parse(input, new TcxParser(handler, null));
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
    public static void parse(final java.net.URL url, final TcxHandler handler) throws SAXException, ParserConfigurationException, IOException {
        parse(new org.xml.sax.InputSource(url.toExternalForm()), handler);
    }

	

    private static void parse(final org.xml.sax.InputSource input, final TcxParser recognizer) throws SAXException, ParserConfigurationException, IOException {
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
