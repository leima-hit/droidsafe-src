package org.apache.http.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;

public interface HttpMessageParser {
    
    HttpMessage parse()
        throws IOException, HttpException;

}
