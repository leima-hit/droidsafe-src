package org.apache.http.impl.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.ParseException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public class HttpResponseParser extends AbstractMessageParser {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:41.830 -0400", hash_original_field = "231DD88D1D24FBAC95F5FF27F7E132D5", hash_generated_field = "617CD99CE3703350A89163AF27F85CC2")

    private HttpResponseFactory responseFactory;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:41.830 -0400", hash_original_field = "DD77BBE950DCBAAE75A78BE6835B370C", hash_generated_field = "138A98BD7AF16A46911F2E280FBA40A5")

    private CharArrayBuffer lineBuf;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:41.831 -0400", hash_original_method = "85B3567407021E0E58042A3E368512FA", hash_generated_method = "D2A105FDC660195C255E4A7B12593A56")
    public  HttpResponseParser(
            final SessionInputBuffer buffer,
            final LineParser parser,
            final HttpResponseFactory responseFactory,
            final HttpParams params) {
        super(buffer, parser, params);
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Response factory may not be null");
        } 
        this.responseFactory = responseFactory;
        this.lineBuf = new CharArrayBuffer(128);
        addTaint(buffer.getTaint());
        addTaint(parser.getTaint());
        addTaint(params.getTaint());
        
        
            
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:41.832 -0400", hash_original_method = "3017F26D59D622B6AFE8D24C9E35B44D", hash_generated_method = "DA6D55C564ACF9732AB032A4CFD2C9D6")
    protected HttpMessage parseHead(
            final SessionInputBuffer sessionBuffer) throws IOException, HttpException, ParseException {
        HttpMessage varB4EAC82CA7396A68D541C85D26508E83_1973174598 = null; 
        this.lineBuf.clear();
        int i = sessionBuffer.readLine(this.lineBuf);
        {
            if (DroidSafeAndroidRuntime.control) throw new NoHttpResponseException("The target server failed to respond");
        } 
        ParserCursor cursor = new ParserCursor(0, this.lineBuf.length());
        StatusLine statusline = lineParser.parseStatusLine(this.lineBuf, cursor);
        varB4EAC82CA7396A68D541C85D26508E83_1973174598 = this.responseFactory.newHttpResponse(statusline, null);
        addTaint(sessionBuffer.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1973174598.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1973174598;
        
        
        
        
            
        
        
        
        
    }

    
}

