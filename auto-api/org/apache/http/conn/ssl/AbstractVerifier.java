package org.apache.http.conn.ssl;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import org.apache.http.conn.util.InetAddressUtils;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public abstract class AbstractVerifier implements X509HostnameVerifier {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:39.384 -0400", hash_original_method = "F9761A2E230B965E685AB0F097FC8BA3", hash_generated_method = "B512B82EB5D4AD689C485137CF7AD9E0")
    public  AbstractVerifier() {
        super();
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:39.385 -0400", hash_original_method = "A023267D72420C341ECC242060C387E3", hash_generated_method = "578EFC7A7B28297091475ADDB56AFF11")
    public final void verify(String host, SSLSocket ssl) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("host to verify is null");
        } 
        SSLSession session = ssl.getSession();
        Certificate[] certs = session.getPeerCertificates();
        X509Certificate x509 = (X509Certificate) certs[0];
        verify(host, x509);
        addTaint(host.getTaint());
        addTaint(ssl.getTaint());
        
        
            
        
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:39.385 -0400", hash_original_method = "43EDB91BF0A5D9A44DF28C7ADED9E98C", hash_generated_method = "5D29DDD50671ADAD5ED8EF4332D54479")
    public final boolean verify(String host, SSLSession session) {
        try 
        {
            Certificate[] certs = session.getPeerCertificates();
            X509Certificate x509 = (X509Certificate) certs[0];
            verify(host, x509);
        } 
        catch (SSLException e)
        { }
        addTaint(host.getTaint());
        addTaint(session.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1691626369 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1691626369;
        
        
            
            
            
            
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:39.385 -0400", hash_original_method = "08CBAD509C26DA74CD541E0020FFDCD1", hash_generated_method = "9888C623BDD279095F4BF42EE947684C")
    public final void verify(String host, X509Certificate cert) throws SSLException {
        String[] cns = getCNs(cert);
        String[] subjectAlts = getDNSSubjectAlts(cert);
        verify(host, cns, subjectAlts);
        addTaint(host.getTaint());
        addTaint(cert.getTaint());
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:39.423 -0400", hash_original_method = "9A07FB90ABAE18EA37F4E80ACC04FEE0", hash_generated_method = "554B47007FA7FB89D9CF043576E193C5")
    public final void verify(final String host, final String[] cns,
                             final String[] subjectAlts,
                             final boolean strictWithSubDomains) throws SSLException {
        LinkedList<String> names = new LinkedList<String>();
        {
            names.add(cns[0]);
        } 
        {
            {
                String subjectAlt = subjectAlts[0];
                {
                    {
                        names.add(subjectAlt);
                    } 
                } 
            } 
        } 
        {
            boolean var55C5C26F0BF22C4008A3E37E2E8525D7_2051444424 = (names.isEmpty());
            {
                String msg = "Certificate for <" + host + "> doesn't contain CN or DNS subjectAlt";
                if (DroidSafeAndroidRuntime.control) throw new SSLException(msg);
            } 
        } 
        StringBuffer buf = new StringBuffer();
        String hostName = host.trim().toLowerCase(Locale.ENGLISH);
        boolean match = false;
        {
            Iterator<String> it = names.iterator();
            boolean var03729FD53960D8DCA3A41A13A0229637_2095505471 = (it.hasNext());
            {
                String cn = it.next();
                cn = cn.toLowerCase(Locale.ENGLISH);
                buf.append(" <");
                buf.append(cn);
                buf.append('>');
                {
                    boolean var3DEC40B862508A9A2151C7EC9CE55CF3_173962111 = (it.hasNext());
                    {
                        buf.append(" OR");
                    } 
                } 
                boolean doWildcard = cn.startsWith("*.") &&
                                 cn.indexOf('.', 2) != -1 &&
                                 acceptableCountryWildcard(cn) &&
                                 !InetAddressUtils.isIPv4Address(host);
                {
                    match = hostName.endsWith(cn.substring(1));
                    {
                        match = countDots(hostName) == countDots(cn);
                    } 
                } 
                {
                    match = hostName.equals(cn);
                } 
            } 
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new SSLException("hostname in certificate didn't match: <" + host + "> !=" + buf);
        } 
        addTaint(host.getTaint());
        addTaint(cns[0].getTaint());
        addTaint(subjectAlts[0].getTaint());
        addTaint(strictWithSubDomains);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static boolean acceptableCountryWildcard(String cn) {
        int cnLen = cn.length();
        if(cnLen >= 7 && cnLen <= 9) {
            if(cn.charAt(cnLen - 3) == '.') {
                String s = cn.substring(2, cnLen - 3);
                int x = Arrays.binarySearch(BAD_COUNTRY_2LDS, s);
                return x < 0;
            }
        }
        return true;
    }

    
    @DSModeled(DSC.SAFE)
    public static String[] getCNs(X509Certificate cert) {
        LinkedList<String> cnList = new LinkedList<String>();
        String subjectPrincipal = cert.getSubjectX500Principal().toString();
        StringTokenizer st = new StringTokenizer(subjectPrincipal, ",");
        while(st.hasMoreTokens()) {
            String tok = st.nextToken();
            int x = tok.indexOf("CN=");
            if(x >= 0) {
                cnList.add(tok.substring(x + 3));
            }
        }
        if(!cnList.isEmpty()) {
            String[] cns = new String[cnList.size()];
            cnList.toArray(cns);
            return cns;
        } else {
            return null;
        }
    }

    
    @DSModeled(DSC.SAFE)
    public static String[] getDNSSubjectAlts(X509Certificate cert) {
        LinkedList<String> subjectAltList = new LinkedList<String>();
        Collection<List<?>> c = null;
        try {
            c = cert.getSubjectAlternativeNames();
        }
        catch(CertificateParsingException cpe) {
            Logger.getLogger(AbstractVerifier.class.getName())
                    .log(Level.FINE, "Error parsing certificate.", cpe);
        }
        if(c != null) {
            for (List<?> aC : c) {
                List<?> list = aC;
                int type = ((Integer) list.get(0)).intValue();
                if (type == 2) {
                    String s = (String) list.get(1);
                    subjectAltList.add(s);
                }
            }
        }
        if(!subjectAltList.isEmpty()) {
            String[] subjectAlts = new String[subjectAltList.size()];
            subjectAltList.toArray(subjectAlts);
            return subjectAlts;
        } else {
            return null;
        }
    }

    
    public static int countDots(final String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.') {
                count++;
            }
        }
        return count;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:39.424 -0400", hash_original_field = "76B1D705F0ADC634FC0CFCB99B6D9F38", hash_generated_field = "6968AEDC2C31A50F6ADB7A7EFEF7EBAD")

    private final static String[] BAD_COUNTRY_2LDS = { "ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info",
            "lg", "ne", "net", "or", "org" };
    static {
        Arrays.sort(BAD_COUNTRY_2LDS);
    }
    
}

