package org.apache.http.protocol;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.net.InetAddress;
import org.apache.http.HttpConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.ProtocolException;

public class RequestTargetHost implements HttpRequestInterceptor {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.648 -0400", hash_original_method = "8E392018972A7DBBBF7C8FCDEC2420D5", hash_generated_method = "6517A03037392B0D34A56F3318F3EB95")
    public  RequestTargetHost() {
        super();
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:42.649 -0400", hash_original_method = "EFFA06EA6DD5102576B15EFE0500FD3E", hash_generated_method = "C74523EB77AEBB8BDBC8E4069A4AEDEC")
    public void process(final HttpRequest request, final HttpContext context) throws HttpException, IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP request may not be null");
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP context may not be null");
        } 
        {
            boolean var42F48AC317DCD4FCC14CFA497F63A10F_906651514 = (!request.containsHeader(HTTP.TARGET_HOST));
            {
                HttpHost targethost = (HttpHost) context
                .getAttribute(ExecutionContext.HTTP_TARGET_HOST);
                {
                    HttpConnection conn = (HttpConnection) context
                    .getAttribute(ExecutionContext.HTTP_CONNECTION);
                    {
                        InetAddress address = ((HttpInetConnection) conn).getRemoteAddress();
                        int port = ((HttpInetConnection) conn).getRemotePort();
                        {
                            targethost = new HttpHost(address.getHostName(), port);
                        } 
                    } 
                    {
                        ProtocolVersion ver = request.getRequestLine().getProtocolVersion();
                        {
                            boolean var6975353BB6195CBDBBE6503768DE7665_1868055831 = (ver.lessEquals(HttpVersion.HTTP_1_0));
                            {
                                if (DroidSafeAndroidRuntime.control) throw new ProtocolException("Target host missing");
                            } 
                        } 
                    } 
                } 
                request.addHeader(HTTP.TARGET_HOST, targethost.toHostString());
            } 
        } 
        addTaint(request.getTaint());
        addTaint(context.getTaint());
        
        
    }

    
}

