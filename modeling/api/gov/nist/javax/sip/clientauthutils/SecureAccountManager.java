package gov.nist.javax.sip.clientauthutils;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import javax.sip.ClientTransaction;

public interface SecureAccountManager  {

    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    UserCredentialHash getCredentialHash(ClientTransaction challengedTransaction, String realm);

}