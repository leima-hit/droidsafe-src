package org.apache.harmony.luni.lang.reflect;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class GenericSignatureParser {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "2CD56E5B83C33F80B2D25820C51596A0", hash_generated_field = "3A123DBAC2896D22118ACC4A0DBF2815")

    public ListOfTypes exceptionTypes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "11427856321C6E9F5321CA879704C8FE", hash_generated_field = "755AC25C18AC88DD7B505952EB00E2FC")

    public ListOfTypes parameterTypes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "898BB6A86E0DA433332CBC4F55D3E967", hash_generated_field = "96CAE8588B8CB92AE83279FEB36F4121")

    public TypeVariable[] formalTypeParameters;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "9CD6843F4536590CD86F933708C7371E", hash_generated_field = "8FCAB3423DB3533C393A75EA17B6B1D8")

    public Type returnType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "833750AC635FCC57DC33ECAFE365F9A7", hash_generated_field = "7BF0B57018D92E424F704D1E59B55203")

    public Type fieldType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "2E8612447B369F7E0D27C66E9273CB06", hash_generated_field = "0A3DD769080BC24A9D258283D7D7DC30")

    public ListOfTypes interfaceTypes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "2DC4A623293420174B22464D58B6A831", hash_generated_field = "2B6C083B05F286DFD7F93749F54AF5DA")

    public Type superclassType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "4A527F83A3A4CA7E1D70ADB26A35B72E", hash_generated_field = "34AC02C91B7B47224132768354947AB0")

    public ClassLoader loader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "AA84DC6545C7C550F5338E00F04FD372", hash_generated_field = "4BEC95563D8D0B015ABDE90FC2F1C6AF")

    GenericDeclaration genericDecl;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "97BFF26855A8BFA63E05D5477E794B24", hash_generated_field = "4D622F1F51FE2777B0E8D81C997E113C")

    char symbol;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "F393F3F5E496869A15BC72CBFD56F541", hash_generated_field = "67D18ED1400CD458B308847E018D0637")

    String identifier;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "2E51B1AB42E8A4A67F3445174BE5191B", hash_generated_field = "5CB70878869318B356B4B3C25335C11E")

    private boolean eof;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "7F2DB423A49B305459147332FB01CF87", hash_generated_field = "AF37951EAE101F357ACAF48FB7E85D88")

    char[] buffer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.101 -0400", hash_original_field = "5E0BDCBDDCCCA4D66D74BA8C1CEE1A68", hash_generated_field = "5780BC7BCF265A6425A5A90F1AD9B24E")

    int pos;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.102 -0400", hash_original_method = "B4AF29B80F8E14619B64C65F02963718", hash_generated_method = "C049BAD034A575B3E9230CA1104DE603")
    public  GenericSignatureParser(ClassLoader loader) {
        this.loader = loader;
        // ---------- Original Method ----------
        //this.loader = loader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.102 -0400", hash_original_method = "6F9101760876DEB9422AEF7944CF1BF2", hash_generated_method = "7B98AFA204D8E0471A99B93A78803DD0")
     void setInput(GenericDeclaration genericDecl, String input) {
        {
            this.genericDecl = genericDecl;
            this.buffer = input.toCharArray();
            this.eof = false;
            scanSymbol();
        } //End block
        {
            this.eof = true;
        } //End block
        // ---------- Original Method ----------
        //if (input != null) {
            //this.genericDecl = genericDecl;
            //this.buffer = input.toCharArray();
            //this.eof = false;
            //scanSymbol();
        //}
        //else {
            //this.eof = true;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.103 -0400", hash_original_method = "408B9941E0DDFF19B1C3AECDF838B6FF", hash_generated_method = "513746912D109E621004D872130D6FF5")
    public void parseForClass(GenericDeclaration genericDecl,
            String signature) {
        setInput(genericDecl, signature);
        {
            parseClassSignature();
        } //End block
        {
            {
                Class c = (Class) genericDecl;
                this.formalTypeParameters = ListOfVariables.EMPTY;
                this.superclassType = c.getSuperclass();
                this.interfaceTypes = new ListOfTypes(c.getInterfaces());
            } //End block
            {
                this.formalTypeParameters = ListOfVariables.EMPTY;
                this.superclassType = Object.class;
                this.interfaceTypes = ListOfTypes.EMPTY;
            } //End block
        } //End block
        addTaint(genericDecl.getTaint());
        addTaint(signature.getTaint());
        // ---------- Original Method ----------
        //setInput(genericDecl, signature);
        //if (!eof) {
            //parseClassSignature();
        //} else {
            //if(genericDecl instanceof Class) {
                //Class c = (Class) genericDecl;
                //this.formalTypeParameters = ListOfVariables.EMPTY;
                //this.superclassType = c.getSuperclass();
                //this.interfaceTypes = new ListOfTypes(c.getInterfaces());
            //} else {
                //this.formalTypeParameters = ListOfVariables.EMPTY;
                //this.superclassType = Object.class;
                //this.interfaceTypes = ListOfTypes.EMPTY;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.104 -0400", hash_original_method = "15DFE7F1F24F7739B7BEC1E53A5655D9", hash_generated_method = "8AE146EB400AF0858303234FB36B7A75")
    public void parseForMethod(GenericDeclaration genericDecl,
            String signature, Class<?>[] rawExceptionTypes) {
        setInput(genericDecl, signature);
        {
            parseMethodTypeSignature(rawExceptionTypes);
        } //End block
        {
            {
                Method m = (Method) genericDecl;
                this.formalTypeParameters = ListOfVariables.EMPTY;
                this.parameterTypes = new ListOfTypes(m.getParameterTypes());
                this.exceptionTypes = new ListOfTypes(m.getExceptionTypes());
                this.returnType = m.getReturnType();
            } //End block
            {
                this.formalTypeParameters = ListOfVariables.EMPTY;
                this.parameterTypes = ListOfTypes.EMPTY;
                this.exceptionTypes = ListOfTypes.EMPTY;
                this.returnType = void.class;
            } //End block
        } //End block
        addTaint(genericDecl.getTaint());
        addTaint(signature.getTaint());
        addTaint(rawExceptionTypes[0].getTaint());
        // ---------- Original Method ----------
        //setInput(genericDecl, signature);
        //if (!eof) {
            //parseMethodTypeSignature(rawExceptionTypes);
        //} else {
            //if(genericDecl instanceof Method) {
                //Method m = (Method) genericDecl;
                //this.formalTypeParameters = ListOfVariables.EMPTY;
                //this.parameterTypes = new ListOfTypes(m.getParameterTypes());
                //this.exceptionTypes = new ListOfTypes(m.getExceptionTypes());
                //this.returnType = m.getReturnType();
            //} else {
                //this.formalTypeParameters = ListOfVariables.EMPTY;
                //this.parameterTypes = ListOfTypes.EMPTY;
                //this.exceptionTypes = ListOfTypes.EMPTY;
                //this.returnType = void.class;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.105 -0400", hash_original_method = "0C9CA8BB038974E4A40BF19F7EB72426", hash_generated_method = "EE5B3E63DBB24E1E656AA8E0C6772B32")
    public void parseForConstructor(GenericDeclaration genericDecl,
            String signature, Class<?>[] rawExceptionTypes) {
        setInput(genericDecl, signature);
        {
            parseMethodTypeSignature(rawExceptionTypes);
        } //End block
        {
            {
                Constructor c = (Constructor) genericDecl;
                this.formalTypeParameters = ListOfVariables.EMPTY;
                this.parameterTypes = new ListOfTypes(c.getParameterTypes());
                this.exceptionTypes = new ListOfTypes(c.getExceptionTypes());
            } //End block
            {
                this.formalTypeParameters = ListOfVariables.EMPTY;
                this.parameterTypes = ListOfTypes.EMPTY;
                this.exceptionTypes = ListOfTypes.EMPTY;
            } //End block
        } //End block
        addTaint(genericDecl.getTaint());
        addTaint(signature.getTaint());
        addTaint(rawExceptionTypes[0].getTaint());
        // ---------- Original Method ----------
        //setInput(genericDecl, signature);
        //if (!eof) {
            //parseMethodTypeSignature(rawExceptionTypes);
        //} else {
            //if(genericDecl instanceof Constructor) {
                //Constructor c = (Constructor) genericDecl;
                //this.formalTypeParameters = ListOfVariables.EMPTY;
                //this.parameterTypes = new ListOfTypes(c.getParameterTypes());
                //this.exceptionTypes = new ListOfTypes(c.getExceptionTypes());
            //} else {
                //this.formalTypeParameters = ListOfVariables.EMPTY;
                //this.parameterTypes = ListOfTypes.EMPTY;
                //this.exceptionTypes = ListOfTypes.EMPTY;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.105 -0400", hash_original_method = "F697D7E02D0C8DEEF4B0854E9491CC15", hash_generated_method = "68F3BE0EC37F1E3A9FAF7D7E3911B166")
    public void parseForField(GenericDeclaration genericDecl,
            String signature) {
        setInput(genericDecl, signature);
        {
            this.fieldType = parseFieldTypeSignature();
        } //End block
        addTaint(genericDecl.getTaint());
        addTaint(signature.getTaint());
        // ---------- Original Method ----------
        //setInput(genericDecl, signature);
        //if (!eof) {
            //this.fieldType = parseFieldTypeSignature();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.106 -0400", hash_original_method = "2A6822DB636AAE3DC282A54EED7D514D", hash_generated_method = "6AD39E41A42F3007E3245DCC8D631ADD")
     void parseClassSignature() {
        parseOptFormalTypeParameters();
        this.superclassType = parseClassTypeSignature();
        interfaceTypes = new ListOfTypes(16);
        {
            interfaceTypes.add(parseClassTypeSignature());
        } //End block
        // ---------- Original Method ----------
        //parseOptFormalTypeParameters();
        //this.superclassType = parseClassTypeSignature();
        //interfaceTypes = new ListOfTypes(16);
        //while (symbol > 0) {
            //interfaceTypes.add(parseClassTypeSignature());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.106 -0400", hash_original_method = "F25135739D6C61926B7C7AB20920C0C3", hash_generated_method = "25562004A8F8192C19D1AF0960703D3B")
     void parseOptFormalTypeParameters() {
        ListOfVariables typeParams = new ListOfVariables();
        {
            scanSymbol();
            typeParams.add(parseFormalTypeParameter());
            {
                typeParams.add(parseFormalTypeParameter());
            } //End block
            expect('>');
        } //End block
        this.formalTypeParameters = typeParams.getArray();
        // ---------- Original Method ----------
        //ListOfVariables typeParams = new ListOfVariables();
        //if (symbol == '<') {
            //scanSymbol();
            //typeParams.add(parseFormalTypeParameter());
            //while ((symbol != '>') && (symbol > 0)) {
                //typeParams.add(parseFormalTypeParameter());
            //}
            //expect('>');
        //}
        //this.formalTypeParameters = typeParams.getArray();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.108 -0400", hash_original_method = "8E4B54F231B830B261D22AAC458F74D2", hash_generated_method = "1797E3627B5D2BCD7F8532AEFC79D6CB")
     ImplForVariable<GenericDeclaration> parseFormalTypeParameter() {
        ImplForVariable<GenericDeclaration> varB4EAC82CA7396A68D541C85D26508E83_1039332937 = null; //Variable for return #1
        scanIdentifier();
        String name = identifier.intern();
        ListOfTypes bounds = new ListOfTypes(8);
        expect(':');
        {
            bounds.add(parseFieldTypeSignature());
        } //End block
        {
            scanSymbol();
            bounds.add(parseFieldTypeSignature());
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1039332937 = new ImplForVariable<GenericDeclaration>(genericDecl, name, bounds);
        varB4EAC82CA7396A68D541C85D26508E83_1039332937.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1039332937;
        // ---------- Original Method ----------
        //scanIdentifier();
        //String name = identifier.intern();
        //ListOfTypes bounds = new ListOfTypes(8);
        //expect(':');
        //if (symbol == 'L' || symbol == '[' || symbol == 'T') {
            //bounds.add(parseFieldTypeSignature());
        //}
        //while (symbol == ':') {
            //scanSymbol();
            //bounds.add(parseFieldTypeSignature());
        //}
        //return new ImplForVariable<GenericDeclaration>(genericDecl, name, bounds);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.109 -0400", hash_original_method = "39858CB077F5F270CB13BCD8F5E588C4", hash_generated_method = "2C9288BA5E5CE7B9DA009C3C2C3CD817")
     Type parseFieldTypeSignature() {
        Type varB4EAC82CA7396A68D541C85D26508E83_1259062002 = null; //Variable for return #1
        Type varB4EAC82CA7396A68D541C85D26508E83_1585896633 = null; //Variable for return #2
        Type varB4EAC82CA7396A68D541C85D26508E83_1805125152 = null; //Variable for return #3
        //Begin case 'L' 
        varB4EAC82CA7396A68D541C85D26508E83_1259062002 = parseClassTypeSignature();
        //End case 'L' 
        //Begin case '[' 
        scanSymbol();
        //End case '[' 
        //Begin case '[' 
        varB4EAC82CA7396A68D541C85D26508E83_1585896633 = new ImplForArray(parseTypeSignature());
        //End case '[' 
        //Begin case 'T' 
        varB4EAC82CA7396A68D541C85D26508E83_1805125152 = parseTypeVariableSignature();
        //End case 'T' 
        //Begin case default 
        if (DroidSafeAndroidRuntime.control) throw new GenericSignatureFormatError();
        //End case default 
        Type varA7E53CE21691AB073D9660D615818899_1239833621; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1239833621 = varB4EAC82CA7396A68D541C85D26508E83_1259062002;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1239833621 = varB4EAC82CA7396A68D541C85D26508E83_1585896633;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1239833621 = varB4EAC82CA7396A68D541C85D26508E83_1805125152;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1239833621.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1239833621;
        // ---------- Original Method ----------
        //switch (symbol) {
        //case 'L':
            //return parseClassTypeSignature();
        //case '[':
            //scanSymbol();
            //return new ImplForArray(parseTypeSignature());
        //case 'T':
            //return parseTypeVariableSignature();
        //default:
            //throw new GenericSignatureFormatError();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.113 -0400", hash_original_method = "0940B5693D1CE1CEA33652B7603676B3", hash_generated_method = "D00ECF30D0C687474E87CF16E92B8469")
     Type parseClassTypeSignature() {
        Type varB4EAC82CA7396A68D541C85D26508E83_1377965008 = null; //Variable for return #1
        expect('L');
        StringBuilder qualIdent = new StringBuilder();
        scanIdentifier();
        {
            scanSymbol();
            qualIdent.append(identifier).append(".");
            scanIdentifier();
        } //End block
        qualIdent.append(this.identifier);
        ListOfTypes typeArgs = parseOptTypeArguments();
        ImplForType parentType = new ImplForType(null, qualIdent.toString(), typeArgs, loader);
        ImplForType type = parentType;
        {
            scanSymbol();
            scanIdentifier();
            qualIdent.append("$").append(identifier);
            typeArgs = parseOptTypeArguments();
            type = new ImplForType(parentType, qualIdent.toString(), typeArgs,
                    loader);
        } //End block
        expect(';');
        varB4EAC82CA7396A68D541C85D26508E83_1377965008 = type;
        varB4EAC82CA7396A68D541C85D26508E83_1377965008.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1377965008;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.116 -0400", hash_original_method = "FCA6C6C42F8D0470CBF5F70C4C8E2247", hash_generated_method = "2B35EBE73E05774D6DE3BE939C736A50")
     ListOfTypes parseOptTypeArguments() {
        ListOfTypes varB4EAC82CA7396A68D541C85D26508E83_390622412 = null; //Variable for return #1
        ListOfTypes typeArgs = new ListOfTypes(8);
        {
            scanSymbol();
            typeArgs.add(parseTypeArgument());
            {
                typeArgs.add(parseTypeArgument());
            } //End block
            expect('>');
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_390622412 = typeArgs;
        varB4EAC82CA7396A68D541C85D26508E83_390622412.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_390622412;
        // ---------- Original Method ----------
        //ListOfTypes typeArgs = new ListOfTypes(8);
        //if (symbol == '<') {
            //scanSymbol();
            //typeArgs.add(parseTypeArgument());
            //while ((symbol != '>') && (symbol > 0)) {
                //typeArgs.add(parseTypeArgument());
            //}
            //expect('>');
        //}
        //return typeArgs;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.117 -0400", hash_original_method = "C611A5720E520CD6B6248914D1F9FF4D", hash_generated_method = "34148DAA7D96C2F922AA23A2113BC6EF")
     Type parseTypeArgument() {
        Type varB4EAC82CA7396A68D541C85D26508E83_195265166 = null; //Variable for return #1
        Type varB4EAC82CA7396A68D541C85D26508E83_730355313 = null; //Variable for return #2
        Type varB4EAC82CA7396A68D541C85D26508E83_2141772099 = null; //Variable for return #3
        Type varB4EAC82CA7396A68D541C85D26508E83_1589441159 = null; //Variable for return #4
        ListOfTypes extendsBound = new ListOfTypes(1);
        ListOfTypes superBound = new ListOfTypes(1);
        {
            scanSymbol();
            extendsBound.add(Object.class);
            varB4EAC82CA7396A68D541C85D26508E83_195265166 = new ImplForWildcard(extendsBound, superBound);
        } //End block
        {
            scanSymbol();
            extendsBound.add(parseFieldTypeSignature());
            varB4EAC82CA7396A68D541C85D26508E83_730355313 = new ImplForWildcard(extendsBound, superBound);
        } //End block
        {
            scanSymbol();
            superBound.add(parseFieldTypeSignature());
            extendsBound.add(Object.class);
            varB4EAC82CA7396A68D541C85D26508E83_2141772099 = new ImplForWildcard(extendsBound, superBound);
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1589441159 = parseFieldTypeSignature();
        } //End block
        Type varA7E53CE21691AB073D9660D615818899_1340769698; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1340769698 = varB4EAC82CA7396A68D541C85D26508E83_195265166;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1340769698 = varB4EAC82CA7396A68D541C85D26508E83_730355313;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1340769698 = varB4EAC82CA7396A68D541C85D26508E83_2141772099;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1340769698 = varB4EAC82CA7396A68D541C85D26508E83_1589441159;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1340769698.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1340769698;
        // ---------- Original Method ----------
        //ListOfTypes extendsBound = new ListOfTypes(1);
        //ListOfTypes superBound = new ListOfTypes(1);
        //if (symbol == '*') {
            //scanSymbol();
            //extendsBound.add(Object.class);
            //return new ImplForWildcard(extendsBound, superBound);
        //}
        //else if (symbol == '+') {
            //scanSymbol();
            //extendsBound.add(parseFieldTypeSignature());
            //return new ImplForWildcard(extendsBound, superBound);
        //}
        //else if (symbol == '-') {
            //scanSymbol();
            //superBound.add(parseFieldTypeSignature());
            //extendsBound.add(Object.class);
            //return new ImplForWildcard(extendsBound, superBound);
        //}
        //else {
            //return parseFieldTypeSignature();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.119 -0400", hash_original_method = "FF6DECA5851C272F523D7639C2D071BC", hash_generated_method = "AF1541706354A7209682FD57E4C7E767")
     ImplForVariable<GenericDeclaration> parseTypeVariableSignature() {
        ImplForVariable<GenericDeclaration> varB4EAC82CA7396A68D541C85D26508E83_1115072858 = null; //Variable for return #1
        expect('T');
        scanIdentifier();
        expect(';');
        varB4EAC82CA7396A68D541C85D26508E83_1115072858 = new ImplForVariable<GenericDeclaration>(genericDecl, identifier);
        varB4EAC82CA7396A68D541C85D26508E83_1115072858.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1115072858;
        // ---------- Original Method ----------
        //expect('T');
        //scanIdentifier();
        //expect(';');
        //return new ImplForVariable<GenericDeclaration>(genericDecl, identifier);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.121 -0400", hash_original_method = "ABCBB21DD03AAC76512AB0248A5CE39A", hash_generated_method = "7A725D578E5AB17A892C8B4B93BF2B4B")
     Type parseTypeSignature() {
        Type varB4EAC82CA7396A68D541C85D26508E83_1272146674 = null; //Variable for return #1
        Type varB4EAC82CA7396A68D541C85D26508E83_1972219956 = null; //Variable for return #2
        Type varB4EAC82CA7396A68D541C85D26508E83_573314915 = null; //Variable for return #3
        Type varB4EAC82CA7396A68D541C85D26508E83_403915258 = null; //Variable for return #4
        Type varB4EAC82CA7396A68D541C85D26508E83_1848621631 = null; //Variable for return #5
        Type varB4EAC82CA7396A68D541C85D26508E83_2059380219 = null; //Variable for return #6
        Type varB4EAC82CA7396A68D541C85D26508E83_17194286 = null; //Variable for return #7
        Type varB4EAC82CA7396A68D541C85D26508E83_452373484 = null; //Variable for return #8
        Type varB4EAC82CA7396A68D541C85D26508E83_1205661300 = null; //Variable for return #9
        //Begin case 'B' 
        scanSymbol();
        //End case 'B' 
        //Begin case 'B' 
        varB4EAC82CA7396A68D541C85D26508E83_1272146674 = byte.class;
        //End case 'B' 
        //Begin case 'C' 
        scanSymbol();
        //End case 'C' 
        //Begin case 'C' 
        varB4EAC82CA7396A68D541C85D26508E83_1972219956 = char.class;
        //End case 'C' 
        //Begin case 'D' 
        scanSymbol();
        //End case 'D' 
        //Begin case 'D' 
        varB4EAC82CA7396A68D541C85D26508E83_573314915 = double.class;
        //End case 'D' 
        //Begin case 'F' 
        scanSymbol();
        //End case 'F' 
        //Begin case 'F' 
        varB4EAC82CA7396A68D541C85D26508E83_403915258 = float.class;
        //End case 'F' 
        //Begin case 'I' 
        scanSymbol();
        //End case 'I' 
        //Begin case 'I' 
        varB4EAC82CA7396A68D541C85D26508E83_1848621631 = int.class;
        //End case 'I' 
        //Begin case 'J' 
        scanSymbol();
        //End case 'J' 
        //Begin case 'J' 
        varB4EAC82CA7396A68D541C85D26508E83_2059380219 = long.class;
        //End case 'J' 
        //Begin case 'S' 
        scanSymbol();
        //End case 'S' 
        //Begin case 'S' 
        varB4EAC82CA7396A68D541C85D26508E83_17194286 = short.class;
        //End case 'S' 
        //Begin case 'Z' 
        scanSymbol();
        //End case 'Z' 
        //Begin case 'Z' 
        varB4EAC82CA7396A68D541C85D26508E83_452373484 = boolean.class;
        //End case 'Z' 
        //Begin case default 
        varB4EAC82CA7396A68D541C85D26508E83_1205661300 = parseFieldTypeSignature();
        //End case default 
        Type varA7E53CE21691AB073D9660D615818899_1658024752; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_1272146674;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_1972219956;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_573314915;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_403915258;
                break;
            case 5: //Assign result for return ordinal #5
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_1848621631;
                break;
            case 6: //Assign result for return ordinal #6
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_2059380219;
                break;
            case 7: //Assign result for return ordinal #7
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_17194286;
                break;
            case 8: //Assign result for return ordinal #8
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_452373484;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1658024752 = varB4EAC82CA7396A68D541C85D26508E83_1205661300;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1658024752.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1658024752;
        // ---------- Original Method ----------
        //switch (symbol) {
        //case 'B': scanSymbol(); return byte.class;
        //case 'C': scanSymbol(); return char.class;
        //case 'D': scanSymbol(); return double.class;
        //case 'F': scanSymbol(); return float.class;
        //case 'I': scanSymbol(); return int.class;
        //case 'J': scanSymbol(); return long.class;
        //case 'S': scanSymbol(); return short.class;
        //case 'Z': scanSymbol(); return boolean.class;
        //default:
            //return parseFieldTypeSignature();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.122 -0400", hash_original_method = "BD4178EAA9E41C4057CACEBF28047848", hash_generated_method = "D2940C586D8ECAB409C65CAD07A93EAE")
     void parseMethodTypeSignature(Class<?>[] rawExceptionTypes) {
        parseOptFormalTypeParameters();
        parameterTypes = new ListOfTypes(16);
        expect('(');
        {
            parameterTypes.add(parseTypeSignature());
        } //End block
        expect(')');
        returnType = parseReturnType();
        {
            exceptionTypes = new ListOfTypes(8);
            {
                scanSymbol();
                {
                    exceptionTypes.add(parseTypeVariableSignature());
                } //End block
                {
                    exceptionTypes.add(parseClassTypeSignature());
                } //End block
            } //End block
        } //End block
        {
            exceptionTypes = new ListOfTypes(rawExceptionTypes);
        } //End block
        {
            exceptionTypes = new ListOfTypes(0);
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.123 -0400", hash_original_method = "6FEAF434B1E5FC2FC9EAA724A7A39FCB", hash_generated_method = "D61178820A9C699291A60F23BEC2D636")
     Type parseReturnType() {
        Type varB4EAC82CA7396A68D541C85D26508E83_1205628861 = null; //Variable for return #1
        Type varB4EAC82CA7396A68D541C85D26508E83_93297255 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1205628861 = parseTypeSignature();
        } //End block
        {
            scanSymbol();
            varB4EAC82CA7396A68D541C85D26508E83_93297255 = void.class;
        } //End block
        Type varA7E53CE21691AB073D9660D615818899_670836997; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_670836997 = varB4EAC82CA7396A68D541C85D26508E83_1205628861;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_670836997 = varB4EAC82CA7396A68D541C85D26508E83_93297255;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_670836997.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_670836997;
        // ---------- Original Method ----------
        //if (symbol != 'V') { return parseTypeSignature(); }
        //else { scanSymbol(); return void.class; }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.123 -0400", hash_original_method = "CAE4999AD72CF442B6BBF401B7699A36", hash_generated_method = "2AEB0226C7D192BA1030997411AB9788")
     void scanSymbol() {
        {
            {
                symbol = buffer[pos];
            } //End block
            {
                symbol = 0;
                eof = true;
            } //End block
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new GenericSignatureFormatError();
        } //End block
        // ---------- Original Method ----------
        //if (!eof) {
            //if (pos < buffer.length) {
                //symbol = buffer[pos];
                //pos++;
            //} else {
                //symbol = 0;
                //eof = true;
            //}
        //} else {
            //throw new GenericSignatureFormatError();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.124 -0400", hash_original_method = "D25C52D6AA7AD670E052B9729E548EBD", hash_generated_method = "6B1C782BE814EC3F9F505678FA0E48FD")
     void expect(char c) {
        {
            scanSymbol();
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new GenericSignatureFormatError();
        } //End block
        addTaint(c);
        // ---------- Original Method ----------
        //if (symbol == c) {
            //scanSymbol();
        //} else {
            //throw new GenericSignatureFormatError();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.124 -0400", hash_original_method = "1CE8B25C92A2D6D9FB5D5E3D923D48F0", hash_generated_method = "7313CCC5A481EDB07402157B7FDFB415")
     boolean isStopSymbol(char ch) {
        addTaint(ch);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1821764892 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1821764892;
        // ---------- Original Method ----------
        //switch (ch) {
        //case ':':
        //case '/':
        //case ';':
        //case '<':
        //case '.':
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.125 -0400", hash_original_method = "A47433FA08CE7DFA194FC642B799E216", hash_generated_method = "5963E317D1BBCA4BC22D84B0C5D72F07")
     void scanIdentifier() {
        {
            StringBuilder identBuf = new StringBuilder(32);
            {
                boolean varBA8951A438FB95E4147857CD77D7FDCF_929120559 = (!isStopSymbol(symbol));
                {
                    identBuf.append(symbol);
                    {
                        char ch = buffer[pos];
                        {
                            boolean varC7ECC067547E5D886884C9CD83B3361C_1841534472 = ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')
                            || !isStopSymbol(ch));
                            {
                                identBuf.append(buffer[pos]);
                            } //End block
                            {
                                identifier = identBuf.toString();
                                scanSymbol();
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                    identifier = identBuf.toString();
                    symbol = 0;
                    eof = true;
                } //End block
                {
                    symbol = 0;
                    eof = true;
                    if (DroidSafeAndroidRuntime.control) throw new GenericSignatureFormatError();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new GenericSignatureFormatError();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
}

