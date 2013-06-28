package libcore.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public final class SneakyThrow {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:30.026 -0400", hash_original_method = "F6943C77D63FE9259DE7FD0A0682E999", hash_generated_method = "19FDB13A46BEE2B1007D50142F524148")
    private  SneakyThrow() {
        // ---------- Original Method ----------
    }

    
    public static void sneakyThrow(Throwable t) {
        SneakyThrow.<Error>sneakyThrow2(t);
    }

    
    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void sneakyThrow2(Throwable t) throws T {
        throw (T) t;
    }

    
}

