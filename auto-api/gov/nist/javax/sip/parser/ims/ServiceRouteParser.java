package gov.nist.javax.sip.parser.ims;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.text.ParseException;
import gov.nist.javax.sip.header.ims.ServiceRoute;
import gov.nist.javax.sip.header.ims.ServiceRouteList;
import gov.nist.javax.sip.header.SIPHeader;
import gov.nist.javax.sip.parser.AddressParametersParser;
import gov.nist.javax.sip.parser.Lexer;
import gov.nist.javax.sip.parser.TokenTypes;

public class ServiceRouteParser extends AddressParametersParser {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:44.235 -0400", hash_original_method = "C37E1CF835BF2C15063590E48C1460DA", hash_generated_method = "8C2B7AE6C87ECFA2AE553FECAD97617E")
    public  ServiceRouteParser(String serviceRoute) {
        super(serviceRoute);
        addTaint(serviceRoute.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:44.235 -0400", hash_original_method = "2EF38FE2F98AC9040691FDDD49315448", hash_generated_method = "40B8AF85BCDEC5F1C3B570E298922915")
    protected  ServiceRouteParser(Lexer lexer) {
        super(lexer);
        addTaint(lexer.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:44.235 -0400", hash_original_method = "8017C6E265731C6E1BE6E337AC0EFE2E", hash_generated_method = "3657DE966816C7648CBC274812482199")
    public SIPHeader parse() throws ParseException {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_117457860 = null; 
        ServiceRouteList serviceRouteList = new ServiceRouteList();
        dbg_enter("ServiceRouteParser.parse");
        try 
        {
            this.lexer.match(TokenTypes.SERVICE_ROUTE);
            this.lexer.SPorHT();
            this.lexer.match(':');
            this.lexer.SPorHT();
            {
                ServiceRoute serviceRoute = new ServiceRoute();
                super.parse(serviceRoute);
                serviceRouteList.add(serviceRoute);
                this.lexer.SPorHT();
                {
                    boolean varFAA47A806C2A7754F7408D0DC0C208DE_1623892269 = (lexer.lookAhead(0) == ',');
                    {
                        this.lexer.match(',');
                        this.lexer.SPorHT();
                    } 
                    {
                        boolean var91663D5DD0C5A7E21E3D02876DD48380_1680107576 = (lexer.lookAhead(0) == '\n');
                        if (DroidSafeAndroidRuntime.control) throw createParseException("unexpected char");
                    } 
                } 
            } 
            varB4EAC82CA7396A68D541C85D26508E83_117457860 = serviceRouteList;
        } 
        finally 
        {
            dbg_leave("ServiceRouteParser.parse");
        } 
        varB4EAC82CA7396A68D541C85D26508E83_117457860.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_117457860;
        
        
    }

    
}

