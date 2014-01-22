package gov.nist.javax.sip.header.ims;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.text.ParseException;

import javax.sip.InvalidArgumentException;
import javax.sip.header.AuthorizationHeader;

public interface AuthorizationHeaderIms extends AuthorizationHeader
{
    
    public static final String YES  = "yes";
    public static final String NO   = "no";
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public void setIntegrityProtected(String integrityProtected) throws InvalidArgumentException, ParseException;

    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public String getIntegrityProtected();

}
