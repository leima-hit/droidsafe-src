package gov.nist.javax.sip.header.extensions;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import javax.sip.header.Header;
import javax.sip.header.HeaderAddress;
import javax.sip.header.Parameters;

public interface ReferredByHeader extends Header, HeaderAddress, Parameters {

    String NAME = "Referred-By";
}