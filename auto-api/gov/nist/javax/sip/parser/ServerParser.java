package gov.nist.javax.sip.parser;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import gov.nist.javax.sip.header.*;
import java.text.ParseException;

public class ServerParser extends HeaderParser {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:43.555 -0400", hash_original_method = "34ED7286D2A920D6CAAB19B69F1E2272", hash_generated_method = "888E93136AD8569BFDC8D4F05F7D97A3")
    public  ServerParser(String server) {
        super(server);
        addTaint(server.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:43.555 -0400", hash_original_method = "D6FF2C5B569C35FFD38E06BDFF6C27A4", hash_generated_method = "8A465FAAC11B416930BD68F6E655D9F3")
    protected  ServerParser(Lexer lexer) {
        super(lexer);
        addTaint(lexer.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:43.556 -0400", hash_original_method = "F7C094FE7E8356B9E6B34E820636D434", hash_generated_method = "EB19096F7B387CD125E8A26B04068A9A")
    public SIPHeader parse() throws ParseException {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_436192771 = null; 
        dbg_enter("ServerParser.parse");
        Server server = new Server();
        try 
        {
            headerName(TokenTypes.SERVER);
            {
                boolean varE8319E96ED7B82FE86A0F5A02AAB8C1A_329298596 = (this.lexer.lookAhead(0) == '\n');
                if (DroidSafeAndroidRuntime.control) throw createParseException("empty header");
            } 
            {
                boolean var8FB4C24DD238037CA48CACBA0110A3FD_1514119680 = (this.lexer.lookAhead(0) != '\n'
                && this.lexer.lookAhead(0) != '\0');
                {
                    {
                        boolean varBE42586E6C05C1C337617197702A94AB_601824630 = (this.lexer.lookAhead(0) == '(');
                        {
                            String comment = this.lexer.comment();
                            server.addProductToken('(' + comment + ')');
                        } 
                        {
                            String tok;
                            int marker = 0;
                            try 
                            {
                                marker = this.lexer.markInputPosition();
                                tok = this.lexer.getString('/');
                                {
                                    boolean var7758689215C22180F3AD46F78EC11CE9_120417326 = (tok.charAt(tok.length() - 1) == '\n');
                                    tok = tok.trim();
                                } 
                                server.addProductToken(tok);
                            } 
                            catch (ParseException ex)
                            {
                                this.lexer.rewindInputPosition(marker);
                                tok = this.lexer.getRest().trim();
                                server.addProductToken(tok);
                            } 
                        } 
                    } 
                } 
            } 
        } 
        finally 
        {
            dbg_leave("ServerParser.parse");
        } 
        varB4EAC82CA7396A68D541C85D26508E83_436192771 = server;
        varB4EAC82CA7396A68D541C85D26508E83_436192771.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_436192771;
        
        
    }

    
}

