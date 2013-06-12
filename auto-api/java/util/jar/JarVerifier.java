package java.util.jar;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import libcore.io.Base64;
import org.apache.harmony.security.utils.JarUtils;

class JarVerifier {
    private final String jarName;
    private Manifest man;
    private HashMap<String, byte[]> metaEntries = new HashMap<String, byte[]>(5);
    private final Hashtable<String, HashMap<String, Attributes>> signatures = new Hashtable<String, HashMap<String, Attributes>>(
            5);
    private final Hashtable<String, Certificate[]> certificates = new Hashtable<String, Certificate[]>(
            5);
    private final Hashtable<String, Certificate[]> verifiedEntries = new Hashtable<String, Certificate[]>();
    int mainAttributesEnd;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.486 -0400", hash_original_method = "4436059C4E8276439A6065FE93A5DE5F", hash_generated_method = "70D81B8CBC0B33B7FEC3775F7946240C")
    @DSModeled(DSC.SAFE)
     JarVerifier(String name) {
        dsTaint.addTaint(name);
        // ---------- Original Method ----------
        //jarName = name;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.486 -0400", hash_original_method = "A00C668D834700B7DBCD83DF376B2F68", hash_generated_method = "3A274D068B930AED38C61654200DBE7B")
    @DSModeled(DSC.SAFE)
    private SecurityException invalidDigest(String signatureFile, String name, String jarName) {
        dsTaint.addTaint(signatureFile);
        dsTaint.addTaint(name);
        dsTaint.addTaint(jarName);
        throw new SecurityException(signatureFile + " has invalid digest for " + name +
                " in " + jarName);
        return (SecurityException)dsTaint.getTaint();
        // ---------- Original Method ----------
        //throw new SecurityException(signatureFile + " has invalid digest for " + name +
                //" in " + jarName);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.486 -0400", hash_original_method = "6DF68FF1B39EE346E0EC276311EA5830", hash_generated_method = "108DAB34816A7BA876F03A8F23609803")
    @DSModeled(DSC.SAFE)
    private SecurityException failedVerification(String jarName, String signatureFile) {
        dsTaint.addTaint(signatureFile);
        dsTaint.addTaint(jarName);
        throw new SecurityException(jarName + " failed verification of " + signatureFile);
        return (SecurityException)dsTaint.getTaint();
        // ---------- Original Method ----------
        //throw new SecurityException(jarName + " failed verification of " + signatureFile);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.487 -0400", hash_original_method = "6A6033A1386EA2314D4EF0CB331B3F5C", hash_generated_method = "834D0AE75A8C2278B99ABCC334CE1D2B")
    //DSFIXME:  CODE0002: Requires DSC value to be set
     VerifierEntry initEntry(String name) {
        dsTaint.addTaint(name);
        {
            boolean var1739105B34C5F197F51A0EEC2FCE22C4_1994155935 = (man == null || signatures.size() == 0);
        } //End collapsed parenthetic
        Attributes attributes;
        attributes = man.getAttributes(name);
        ArrayList<Certificate> certs;
        certs = new ArrayList<Certificate>();
        Iterator<Map.Entry<String, HashMap<String, Attributes>>> it;
        it = signatures.entrySet().iterator();
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_1758048240 = (it.hasNext());
            {
                Map.Entry<String, HashMap<String, Attributes>> entry;
                entry = it.next();
                HashMap<String, Attributes> hm;
                hm = entry.getValue();
                {
                    boolean varA11FBA9D7341E0328282C6ADC9E3B007_1310134001 = (hm.get(name) != null);
                    {
                        String signatureFile;
                        signatureFile = entry.getKey();
                        certs.addAll(getSignerCertificates(signatureFile, certificates));
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        {
            boolean varD07177C898FD12D837B9D5964F0C24CD_1564438404 = (certs.isEmpty());
        } //End collapsed parenthetic
        Certificate[] certificatesArray;
        certificatesArray = certs.toArray(new Certificate[certs.size()]);
        String algorithms;
        algorithms = attributes.getValue("Digest-Algorithms");
        {
            algorithms = "SHA SHA1";
        } //End block
        StringTokenizer tokens;
        tokens = new StringTokenizer(algorithms);
        {
            boolean var4A8B7054AF091A6B38EB732ACFC1CEDB_830246345 = (tokens.hasMoreTokens());
            {
                String algorithm;
                algorithm = tokens.nextToken();
                String hash;
                hash = attributes.getValue(algorithm + "-Digest");
                byte[] hashBytes;
                hashBytes = hash.getBytes(Charsets.ISO_8859_1);
                try 
                {
                    VerifierEntry var79BF7AB399F8E8C867504849FFEE572B_301296698 = (new VerifierEntry(name, MessageDigest
                        .getInstance(algorithm), hashBytes, certificatesArray));
                } //End block
                catch (NoSuchAlgorithmException e)
                { }
            } //End block
        } //End collapsed parenthetic
        return (VerifierEntry)dsTaint.getTaint();
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.487 -0400", hash_original_method = "B24E46A89F6B78A5F74DC1F8899F1D36", hash_generated_method = "D8CE759F4DBFCEB2916FBC7DFE789ACF")
    //DSFIXME:  CODE0002: Requires DSC value to be set
     void addMetaEntry(String name, byte[] buf) {
        dsTaint.addTaint(name);
        dsTaint.addTaint(buf);
        metaEntries.put(name.toUpperCase(Locale.US), buf);
        // ---------- Original Method ----------
        //metaEntries.put(name.toUpperCase(Locale.US), buf);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.487 -0400", hash_original_method = "8A8EDD1088AB3F7694E04A76DE584752", hash_generated_method = "35A36CAD83EC57FEE9ACC0841B70D646")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    synchronized boolean readCertificates() {
        Iterator<String> it;
        it = metaEntries.keySet().iterator();
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_1432937070 = (it.hasNext());
            {
                String key;
                key = it.next();
                {
                    boolean var4681B3668908FCE90CF6A905CFCA3F33_1057628581 = (key.endsWith(".DSA") || key.endsWith(".RSA"));
                    {
                        verifyCertificate(key);
                        it.remove();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //if (metaEntries == null) {
            //return false;
        //}
        //Iterator<String> it = metaEntries.keySet().iterator();
        //while (it.hasNext()) {
            //String key = it.next();
            //if (key.endsWith(".DSA") || key.endsWith(".RSA")) {
                //verifyCertificate(key);
                //if (metaEntries == null) {
                    //return false;
                //}
                //it.remove();
            //}
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.487 -0400", hash_original_method = "E0F968F23AF085C0376D04DBFBF51D30", hash_generated_method = "1A0E86F49B733A74A3F2EA1D4C6C1A58")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void verifyCertificate(String certFile) {
        dsTaint.addTaint(certFile);
        String signatureFile;
        signatureFile = certFile.substring(0, certFile.lastIndexOf('.'))
                + ".SF";
        byte[] sfBytes;
        sfBytes = metaEntries.get(signatureFile);
        byte[] manifest;
        manifest = metaEntries.get(JarFile.MANIFEST_NAME);
        byte[] sBlockBytes;
        sBlockBytes = metaEntries.get(certFile);
        try 
        {
            Certificate[] signerCertChain;
            signerCertChain = JarUtils.verifySignature(
                    new ByteArrayInputStream(sfBytes),
                    new ByteArrayInputStream(sBlockBytes));
            {
                certificates.put(signatureFile, signerCertChain);
            } //End block
        } //End block
        catch (IOException e)
        { }
        catch (GeneralSecurityException e)
        {
            throw failedVerification(jarName, signatureFile);
        } //End block
        Attributes attributes;
        attributes = new Attributes();
        HashMap<String, Attributes> entries;
        entries = new HashMap<String, Attributes>();
        try 
        {
            InitManifest im;
            im = new InitManifest(sfBytes, attributes, Attributes.Name.SIGNATURE_VERSION);
            im.initEntries(entries, null);
        } //End block
        catch (IOException e)
        { }
        boolean createdBySigntool;
        createdBySigntool = false;
        String createdBy;
        createdBy = attributes.getValue("Created-By");
        {
            createdBySigntool = createdBy.indexOf("signtool") != -1;
        } //End block
        {
            String digestAttribute;
            digestAttribute = "-Digest-Manifest-Main-Attributes";
            {
                boolean var9660D2ABC682B0CBB44B33389EFC28FB_1328951121 = (!verify(attributes, digestAttribute, manifest, 0, mainAttributesEnd, false, true));
                {
                    throw failedVerification(jarName, signatureFile);
                } //End block
            } //End collapsed parenthetic
        } //End block
        String digestAttribute;
        digestAttribute = "-Digest";
        digestAttribute = "-Digest-Manifest";
        {
            boolean varBF55E30490CA8C888FC67F88CD7AD658_2057696303 = (!verify(attributes, digestAttribute, manifest, 0, manifest.length,
                false, false));
            {
                Iterator<Map.Entry<String, Attributes>> it;
                it = entries.entrySet()
                    .iterator();
                {
                    boolean var3DEC40B862508A9A2151C7EC9CE55CF3_1876297033 = (it.hasNext());
                    {
                        Map.Entry<String, Attributes> entry;
                        entry = it.next();
                        Manifest.Chunk chunk;
                        chunk = man.getChunk(entry.getKey());
                        {
                            boolean varAC1C8F34BDBC7D9F713C0353FA7B6FAF_664284167 = (!verify(entry.getValue(), "-Digest", manifest,
                        chunk.start, chunk.end, createdBySigntool, false));
                            {
                                throw invalidDigest(signatureFile, entry.getKey(), jarName);
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        metaEntries.put(signatureFile, null);
        signatures.put(signatureFile, entries);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "5E96175D15755C77B9F4C5D6341FECA1", hash_generated_method = "C583D1B4FD33AB62BFB67064A210AEB3")
    @DSModeled(DSC.SAFE)
     void setManifest(Manifest mf) {
        dsTaint.addTaint(mf.dsTaint);
        // ---------- Original Method ----------
        //man = mf;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "61D9EDAFD8C0E1537C8EF2C7E942A904", hash_generated_method = "F0DAC32A308E3D50C84FD3A676B328A2")
    //DSFIXME:  CODE0002: Requires DSC value to be set
     boolean isSignedJar() {
        boolean var7CAE1A061A4DC00175B4D2E783D22316_1995160263 = (certificates.size() > 0);
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return certificates.size() > 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "C1D665F8901BA184CF5172955B73AB34", hash_generated_method = "392FAECC2B751CB30AE6BAB132FF1888")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private boolean verify(Attributes attributes, String entry, byte[] data,
            int start, int end, boolean ignoreSecondEndline, boolean ignorable) {
        dsTaint.addTaint(start);
        dsTaint.addTaint(entry);
        dsTaint.addTaint(data);
        dsTaint.addTaint(ignoreSecondEndline);
        dsTaint.addTaint(attributes.dsTaint);
        dsTaint.addTaint(end);
        dsTaint.addTaint(ignorable);
        String algorithms;
        algorithms = attributes.getValue("Digest-Algorithms");
        {
            algorithms = "SHA SHA1";
        } //End block
        StringTokenizer tokens;
        tokens = new StringTokenizer(algorithms);
        {
            boolean var4A8B7054AF091A6B38EB732ACFC1CEDB_663441381 = (tokens.hasMoreTokens());
            {
                String algorithm;
                algorithm = tokens.nextToken();
                String hash;
                hash = attributes.getValue(algorithm + entry);
                MessageDigest md;
                try 
                {
                    md = MessageDigest.getInstance(algorithm);
                } //End block
                catch (NoSuchAlgorithmException e)
                { }
                {
                    md.update(data, start, end - 1 - start);
                } //End block
                {
                    md.update(data, start, end - start);
                } //End block
                byte[] b;
                b = md.digest();
                byte[] hashBytes;
                hashBytes = hash.getBytes(Charsets.ISO_8859_1);
                boolean varF4F3230BCA44283481584F405E42E5C9_1198142399 = (MessageDigest.isEqual(b, Base64.decode(hashBytes)));
            } //End block
        } //End collapsed parenthetic
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "4AB9D8996D4C7F856FC4CD4DD096303E", hash_generated_method = "71C29F9A640E4B967428AC036D0489E2")
    //DSFIXME:  CODE0002: Requires DSC value to be set
     Certificate[] getCertificates(String name) {
        dsTaint.addTaint(name);
        Certificate[] verifiedCerts;
        verifiedCerts = verifiedEntries.get(name);
        Certificate[] varB666DFB21103BC8574440F7BDC96BF26_1101640166 = (verifiedCerts.clone());
        return (Certificate[])dsTaint.getTaint();
        // ---------- Original Method ----------
        //Certificate[] verifiedCerts = verifiedEntries.get(name);
        //if (verifiedCerts == null) {
            //return null;
        //}
        //return verifiedCerts.clone();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "98B5FDE1FF609AB4DAC6F710E4FAE37E", hash_generated_method = "351E2FFC3CDC6548D3CF4825342C8C1C")
    @DSModeled(DSC.SAFE)
     void removeMetaEntries() {
        metaEntries = null;
        // ---------- Original Method ----------
        //metaEntries = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "7076E38A2129A6111F64A5E586BC8201", hash_generated_method = "A3ACF8B97210B63D516427CC61673029")
    public static Vector<Certificate> getSignerCertificates(
            String signatureFileName, Map<String, Certificate[]> certificates) {
        Vector<Certificate> result = new Vector<Certificate>();
        Certificate[] certChain = certificates.get(signatureFileName);
        if (certChain != null) {
            for (Certificate element : certChain) {
                result.add(element);
            }
        }
        return result;
    }

    
    class VerifierEntry extends OutputStream {
        private String name;
        private MessageDigest digest;
        private byte[] hash;
        private Certificate[] certificates;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "519B899FEA5DD6CF74252B8A7E9BDF9B", hash_generated_method = "F6DEDF9E35BDC514300718D3D19CD53B")
        @DSModeled(DSC.SAFE)
         VerifierEntry(String name, MessageDigest digest, byte[] hash,
                Certificate[] certificates) {
            dsTaint.addTaint(hash);
            dsTaint.addTaint(name);
            dsTaint.addTaint(digest.dsTaint);
            dsTaint.addTaint(certificates.dsTaint);
            // ---------- Original Method ----------
            //this.name = name;
            //this.digest = digest;
            //this.hash = hash;
            //this.certificates = certificates;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "977E904E5666EA1924971461B3999364", hash_generated_method = "DD3734FB2F2796B5FDFC7794C4EE2B5A")
        @DSModeled(DSC.SAFE)
        @Override
        public void write(int value) {
            dsTaint.addTaint(value);
            digest.update((byte) value);
            // ---------- Original Method ----------
            //digest.update((byte) value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "8BB7D0A84FCC70584CF33970C6F95BDA", hash_generated_method = "2449C72A4F607C17F974AA01C93D28C9")
        @DSModeled(DSC.SAFE)
        @Override
        public void write(byte[] buf, int off, int nbytes) {
            dsTaint.addTaint(nbytes);
            dsTaint.addTaint(off);
            dsTaint.addTaint(buf);
            digest.update(buf, off, nbytes);
            // ---------- Original Method ----------
            //digest.update(buf, off, nbytes);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.488 -0400", hash_original_method = "E514DAB8C6AF0A1EE37FB72F5B8B9108", hash_generated_method = "3A8F19317E4BA12359E606A115B57438")
        //DSFIXME:  CODE0002: Requires DSC value to be set
         void verify() {
            byte[] d;
            d = digest.digest();
            {
                boolean varF713951728C54611E5DA59160EF2FDFA_796391915 = (!MessageDigest.isEqual(d, Base64.decode(hash)));
                {
                    throw invalidDigest(JarFile.MANIFEST_NAME, name, jarName);
                } //End block
            } //End collapsed parenthetic
            verifiedEntries.put(name, certificates);
            // ---------- Original Method ----------
            //byte[] d = digest.digest();
            //if (!MessageDigest.isEqual(d, Base64.decode(hash))) {
                //throw invalidDigest(JarFile.MANIFEST_NAME, name, jarName);
            //}
            //verifiedEntries.put(name, certificates);
        }

        
    }


    
}


