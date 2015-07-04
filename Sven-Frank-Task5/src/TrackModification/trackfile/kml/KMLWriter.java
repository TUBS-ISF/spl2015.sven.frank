/**
 * 
 */
package jgpstrackedit.trackfile.kml; 

import java.io.PrintWriter; 

import jgpstrackedit.data.Point; 
import jgpstrackedit.data.Track; 

/**
 * @author Hubert
 *
 */
public  class  KMLWriter {
	

	public void print(Track track, PrintWriter out) {
		// TODO Auto-generated method stub
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<kml xmlns=\"http://www.opengis.net/kml/2.2\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.opengis.net/kml/2.2 http://schemas.opengis.net/kml/2.2.0/ogckml22.xsd\">");
		out.println("  <Document>");
		out.println("    <name>" + track.getName() + "</name>");
        out.println("      <Placemark>");
		out.println("        <name>" + track.getName() + "</name>");
		out.println("        <visibility>1</visibility>");
		out.println("        <open>1</open>");
		out.println("        <Snippet maxLines=\"0\" />");
		out.println("        	      <description><![CDATA[Generated by JGPSTrackEdit]]></description>");
		out.println("        	      <styleUrl>#gpsiesStyle</styleUrl>");
        out.println("        <MultiGeometry>");
		out.println("          <LineString>");
		out.println("            <extrude>true</extrude>");
		out.println("            <tessellate>true</tessellate>");
		boolean first = true;
		for (Point p : track.getPoints()) {
			if (first) {
				out.print("            <coordinates>");
				first = false;
			} else {
				out.println("");
			}
			out.print(p.getLongitudeAsString()+ ","+ p.getLatitudeAsString() 
					  + "," + p.getElevationAsString());
		}
		out.print("</coordinates>");
		out.println("          </LineString>");
        out.println("        </MultiGeometry>");
        out.println("      </Placemark>");
        out.println("  </Document>");
		out.println("</kml>");
		
	}


}