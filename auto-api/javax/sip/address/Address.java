package javax.sip.address;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;

import java.io.Serializable;
import java.text.ParseException;

public interface Address extends Cloneable, Serializable {
    String getDisplayName();
    void setDisplayName(String displayName) throws ParseException;
    boolean hasDisplayName();

    String getHost();
    int getPort();
    String getUserAtHostPort();

    boolean isSIPAddress();

    URI getURI();
    void setURI(URI uri);

    boolean isWildcard();
    void setWildCardFlag();

    boolean equals(Object obj);
    int hashCode();
    Object clone();
}

