package org.apache.harmony.luni.lang.reflect;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class ListOfTypes {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.225 -0400", hash_original_field = "D14A8022B085F9EF19D479CBDD581127", hash_generated_field = "8892A3AAA12E491FA3A203DD834955E2")

    private ArrayList<Type> types;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.225 -0400", hash_original_field = "9D3C508B350DACB1819B1B8FF8C2892F", hash_generated_field = "87D7847847236888863F03CF45EBFAF0")

    private Type[] resolvedTypes;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.226 -0400", hash_original_method = "1B717CC03BB3C0AEB2AD5F80BAEDAB75", hash_generated_method = "4DC1BA96B5060DA9D761A0767EF562F5")
      ListOfTypes(int capacity) {
        types = new ArrayList<Type>(capacity);
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.227 -0400", hash_original_method = "A3B43C45442B7BC58B3D5A9B17362DF9", hash_generated_method = "783F3FDBDC6B5F20A798FC4580610825")
      ListOfTypes(Type[] types) {
        this.types = new ArrayList<Type>(types.length);
        {
            
            
            Type type = types[0];
            {
                this.types.add(type);
            } 
        } 
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.227 -0400", hash_original_method = "521B9354050D45CFE1C9313A9C3FFED0", hash_generated_method = "80E84AAB57486F37C62FE02D4C0D6EB9")
     void add(Type type) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("type == null");
        } 
        types.add(type);
        addTaint(type.getTaint());
        
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.228 -0400", hash_original_method = "5C54E587FAEC26FCFBB8E0F344888E86", hash_generated_method = "F1105B5435717C326402C3765D07E4A3")
     int length() {
        int var36D5E6EA8FBC745E7500AFF20661D660_2104800591 = (types.size());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_146999921 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_146999921;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.229 -0400", hash_original_method = "631AD2F872BA627B3C9B69A500832CF8", hash_generated_method = "4F9637AEC7A2D497634E0CD0230DADBB")
    public Type[] getResolvedTypes() {
        Type[] varB4EAC82CA7396A68D541C85D26508E83_1564078222 = null; 
        Type[] result = resolvedTypes;
        varB4EAC82CA7396A68D541C85D26508E83_1564078222 = result != null ? result : (resolvedTypes = resolveTypes(types));
        varB4EAC82CA7396A68D541C85D26508E83_1564078222.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1564078222;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.231 -0400", hash_original_method = "F2767C6141E0603586233C8F8B50B3D9", hash_generated_method = "37AA6453C08F4345AFA30AE68BB853C7")
    private Type[] resolveTypes(List<Type> unresolved) {
        Type[] varB4EAC82CA7396A68D541C85D26508E83_622145133 = null; 
        Type[] result = new Type[unresolved.size()];
        {
            int i = 0;
            boolean var4B6942D14B8B3CA4D1DDA3BF54081882_141679448 = (i < unresolved.size());
            {
                Type type = unresolved.get(i);
                try 
                {
                    result[i] = ((ImplForType) type).getResolvedType();
                } 
                catch (ClassCastException e)
                {
                    result[i] = type;
                } 
            } 
        } 
        varB4EAC82CA7396A68D541C85D26508E83_622145133 = result;
        addTaint(unresolved.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_622145133.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_622145133;
        
        
        
            
            
                
            
                
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.231 -0400", hash_original_method = "E058D2B2430FADEC45CDF66AF212F70E", hash_generated_method = "CAE32EEBA8C1E6C213F9B9978913D91E")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_2128712059 = null; 
        StringBuilder result = new StringBuilder();
        {
            int i = 0;
            boolean var5B2E9C78052F33E6158F587025879BF2_555293916 = (i < types.size());
            {
                {
                    result.append(", ");
                } 
                result.append(types.get(i));
            } 
        } 
        varB4EAC82CA7396A68D541C85D26508E83_2128712059 = result.toString();
        varB4EAC82CA7396A68D541C85D26508E83_2128712059.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_2128712059;
        
        
        
            
                
            
            
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.232 -0400", hash_original_field = "BA2CE12BA025194CD2FA1EAB55E9AC2C", hash_generated_field = "E5BC5D3021F6BC63E6401C0642F71BC4")

    public static final ListOfTypes EMPTY = new ListOfTypes(0);
}

