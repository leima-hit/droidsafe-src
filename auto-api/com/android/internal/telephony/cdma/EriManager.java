package com.android.internal.telephony.cdma;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Message;
import android.util.Log;
import android.util.Xml;
import com.android.internal.telephony.Phone;
import com.android.internal.telephony.PhoneBase;
import com.android.internal.util.XmlUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public final class EriManager {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.433 -0400", hash_original_field = "44BC87C3198CFC247427A5305FDEA9BE", hash_generated_field = "E7BDAD23CF4F53103B9ED94B380FFE2A")

    private PhoneBase mPhone;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.433 -0400", hash_original_field = "51EF5995AD6B82C50AE546C1599EFFFA", hash_generated_field = "C458E619396054F78BC926FB81B4386D")

    private Context mContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.433 -0400", hash_original_field = "A757B28B600867D7632EA7A4EAF519EA", hash_generated_field = "BE050A394E5DDA84CD7D9B82D09CD0DF")

    private int mEriFileSource = ERI_FROM_XML;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.433 -0400", hash_original_field = "583264D6B6FB2E8327A962B767E7361D", hash_generated_field = "D44D6DD6E8F17217EFA480219059C42D")

    private boolean isEriFileLoaded;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.434 -0400", hash_original_field = "368C9D55284EA57A4D72C138088A7AEA", hash_generated_field = "F63AB3051D8F51BADF0A35205FF6E8C1")

    private EriFile mEriFile;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.434 -0400", hash_original_method = "3CF9033327C5802237473AC2EBF5A9A4", hash_generated_method = "DE2FD4EC78744ED88F4F1E9E56C3186D")
    public  EriManager(PhoneBase phone, Context context, int eriFileSource) {
        this.mPhone = phone;
        this.mContext = context;
        this.mEriFileSource = eriFileSource;
        this.mEriFile = new EriFile();
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.434 -0400", hash_original_method = "E6DC952A5F138026D46EF70E48873C6A", hash_generated_method = "63E6418D6E31FB076F0ABE7FE7C0BC71")
    public void dispose() {
        mEriFile = new EriFile();
        isEriFileLoaded = false;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.435 -0400", hash_original_method = "79759E789BC701587754CBB5AD9F0BEC", hash_generated_method = "9AD1C333977B2F5366B5F750F19BD008")
    public void loadEriFile() {
        
        loadEriFileFromModem();
        
        
        loadEriFileFromFileSystem();
        
        
        loadEriFileFromXml();
        
        
        
        
            
            
        
            
            
        
        
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.435 -0400", hash_original_method = "F319D2CF7E3E715B8D39AE2FABF6BF7B", hash_generated_method = "E557464B9F1CB4500DE84483A9542396")
    private void loadEriFileFromModem() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.435 -0400", hash_original_method = "A745E0763E42351C9DE31AD2579A5B7C", hash_generated_method = "E7A0D2EF52E0D62B1AC03B9954F84BEF")
    private void loadEriFileFromFileSystem() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.436 -0400", hash_original_method = "C6A3384D5129DFA3EA95328C5EF0C849", hash_generated_method = "7B67EB2485CE914721A49C786A198E62")
    private void loadEriFileFromXml() {
        XmlPullParser parser = null;
        FileInputStream stream = null;
        Resources r = mContext.getResources();
        try 
        {
            Log.d(LOG_TAG, "loadEriFileFromXml: check for alternate file");
            stream = new FileInputStream(
                            r.getString(com.android.internal.R.string.alternate_eri_file));
            parser = Xml.newPullParser();
            parser.setInput(stream, null);
            Log.d(LOG_TAG, "loadEriFileFromXml: opened alternate file");
        } 
        catch (FileNotFoundException e)
        {
            Log.d(LOG_TAG, "loadEriFileFromXml: no alternate file");
            parser = null;
        } 
        catch (XmlPullParserException e)
        {
            Log.d(LOG_TAG, "loadEriFileFromXml: no parser for alternate file");
            parser = null;
        } 
        {
            Log.d(LOG_TAG, "loadEriFileFromXml: open normal file");
            parser = r.getXml(com.android.internal.R.xml.eri);
        } 
        try 
        {
            XmlUtils.beginDocument(parser, "EriFile");
            mEriFile.mVersionNumber = Integer.parseInt(
                    parser.getAttributeValue(null, "VersionNumber"));
            mEriFile.mNumberOfEriEntries = Integer.parseInt(
                    parser.getAttributeValue(null, "NumberOfEriEntries"));
            mEriFile.mEriFileType = Integer.parseInt(
                    parser.getAttributeValue(null, "EriFileType"));
            int parsedEriEntries = 0;
            {
                XmlUtils.nextElement(parser);
                String name = parser.getName();
                {
                    boolean varE80C698A9C3F8E5666F4303FE2067665_2055302659 = (name.equals("CallPromptId"));
                    {
                        int id = Integer.parseInt(parser.getAttributeValue(null, "Id"));
                        String text = parser.getAttributeValue(null, "CallPromptText");
                        {
                            mEriFile.mCallPromptId[id] = text;
                        } 
                    } 
                    {
                        boolean var899A8E63ADE4001FCB3DF2C3D92C8FA5_1609603201 = (name.equals("EriInfo"));
                        {
                            int roamingIndicator = Integer.parseInt(
                            parser.getAttributeValue(null, "RoamingIndicator"));
                            int iconIndex = Integer.parseInt(parser.getAttributeValue(null, "IconIndex"));
                            int iconMode = Integer.parseInt(parser.getAttributeValue(null, "IconMode"));
                            String eriText = parser.getAttributeValue(null, "EriText");
                            int callPromptId = Integer.parseInt(
                            parser.getAttributeValue(null, "CallPromptId"));
                            int alertId = Integer.parseInt(parser.getAttributeValue(null, "AlertId"));
                            mEriFile.mRoamIndTable.put(roamingIndicator, new EriInfo (roamingIndicator,
                            iconIndex, iconMode, eriText, callPromptId, alertId));
                        } 
                    } 
                } 
            } 
            Log.d(LOG_TAG, "loadEriFileFromXml: eri parsing successful, file loaded");
            isEriFileLoaded = true;
        } 
        catch (Exception e)
        { }
        finally 
        {
            {
                ((XmlResourceParser)parser).close();
            } 
            try 
            {
                {
                    stream.close();
                } 
            } 
            catch (IOException e)
            { }
        } 
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.437 -0400", hash_original_method = "C9469B68514D99711DF201C8FE7DFBA7", hash_generated_method = "C36FEC4137EB0E8D452C32CF93B49039")
    public int getEriFileVersion() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1677688634 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1677688634;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.437 -0400", hash_original_method = "61A833F46D3B8953A540625C42A0EB37", hash_generated_method = "3B7668F37DB3D9E3FB7E2E61797946D8")
    public int getEriNumberOfEntries() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_11966921 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_11966921;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.438 -0400", hash_original_method = "1FA8D7F59FB6C59B7F4FF404D7CADD99", hash_generated_method = "4338A98036BAF8698AED63AAE68BA403")
    public int getEriFileType() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2090584144 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2090584144;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.438 -0400", hash_original_method = "82EFBDE53CEDFA09C7F551715591238A", hash_generated_method = "8FDB32BEBEC0513E605ACEDB639DC0BD")
    public boolean isEriFileLoaded() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1461918942 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1461918942;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.440 -0400", hash_original_method = "EC9DEB76FD43053D10B144FC41192B14", hash_generated_method = "1F337327BA8F6CA4345FE0205B5898C6")
    private EriInfo getEriInfo(int roamingIndicator) {
        EriInfo varB4EAC82CA7396A68D541C85D26508E83_967756654 = null; 
        EriInfo varB4EAC82CA7396A68D541C85D26508E83_1061082206 = null; 
        {
            boolean var57ABABFD2A3B3C6B754E21C0F57554B9_1255232367 = (mEriFile.mRoamIndTable.containsKey(roamingIndicator));
            {
                varB4EAC82CA7396A68D541C85D26508E83_967756654 = mEriFile.mRoamIndTable.get(roamingIndicator);
            } 
            {
                varB4EAC82CA7396A68D541C85D26508E83_1061082206 = null;
            } 
        } 
        addTaint(roamingIndicator);
        EriInfo varA7E53CE21691AB073D9660D615818899_421779949; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_421779949 = varB4EAC82CA7396A68D541C85D26508E83_967756654;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_421779949 = varB4EAC82CA7396A68D541C85D26508E83_1061082206;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_421779949.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_421779949;
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.448 -0400", hash_original_method = "D2C726FAB5040CEBEF6EB4A1388860BE", hash_generated_method = "00D8126185AD2017604D4D9E4B4A4E9C")
    private EriDisplayInformation getEriDisplayInformation(int roamInd, int defRoamInd) {
        EriDisplayInformation varB4EAC82CA7396A68D541C85D26508E83_840848368 = null; 
        EriDisplayInformation varB4EAC82CA7396A68D541C85D26508E83_1769402472 = null; 
        EriDisplayInformation ret;
        {
            EriInfo eriInfo = getEriInfo(roamInd);
            {
                ret = new EriDisplayInformation(
                        eriInfo.mIconIndex,
                        eriInfo.mIconMode,
                        eriInfo.mEriText);
                varB4EAC82CA7396A68D541C85D26508E83_840848368 = ret;
            } 
        } 
        
        ret = new EriDisplayInformation(
                    EriInfo.ROAMING_INDICATOR_ON,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText0).toString());
        
        
        ret = new EriDisplayInformation(
                    EriInfo.ROAMING_INDICATOR_OFF,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText1).toString());
        
        
        ret = new EriDisplayInformation(
                    EriInfo.ROAMING_INDICATOR_FLASH,
                    EriInfo.ROAMING_ICON_MODE_FLASH,
                    mContext.getText(com.android.internal.R.string.roamingText2).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText3).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText4).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText5).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText6).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText7).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText8).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText9).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText10).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText11).toString());
        
        
        ret = new EriDisplayInformation(
                    roamInd,
                    EriInfo.ROAMING_ICON_MODE_NORMAL,
                    mContext.getText(com.android.internal.R.string.roamingText12).toString());
        
        
        {
            Log.d(LOG_TAG, "ERI File not loaded");
            {
                ret = new EriDisplayInformation(
                            EriInfo.ROAMING_INDICATOR_FLASH,
                            EriInfo.ROAMING_ICON_MODE_FLASH,
                            mContext.getText(com.android.internal
                                                            .R.string.roamingText2).toString());
            } 
            {
                
                ret = new EriDisplayInformation(
                                EriInfo.ROAMING_INDICATOR_ON,
                                EriInfo.ROAMING_ICON_MODE_NORMAL,
                                mContext.getText(com.android.internal
                                                            .R.string.roamingText0).toString());
                
                
                ret = new EriDisplayInformation(
                                EriInfo.ROAMING_INDICATOR_OFF,
                                EriInfo.ROAMING_ICON_MODE_NORMAL,
                                mContext.getText(com.android.internal
                                                            .R.string.roamingText1).toString());
                
                
                ret = new EriDisplayInformation(
                                EriInfo.ROAMING_INDICATOR_FLASH,
                                EriInfo.ROAMING_ICON_MODE_FLASH,
                                mContext.getText(com.android.internal
                                                            .R.string.roamingText2).toString());
                
                
                ret = new EriDisplayInformation(-1, -1, "ERI text");
                
            } 
        } 
        {
            EriInfo eriInfo = getEriInfo(roamInd);
            EriInfo defEriInfo = getEriInfo(defRoamInd);
            {
                {
                    ret = new EriDisplayInformation(
                                EriInfo.ROAMING_INDICATOR_ON,
                                EriInfo.ROAMING_ICON_MODE_NORMAL,
                                mContext.getText(com.android.internal
                                                             .R.string.roamingText0).toString());
                } 
                {
                    ret = new EriDisplayInformation(
                                defEriInfo.mIconIndex,
                                defEriInfo.mIconMode,
                                defEriInfo.mEriText);
                } 
            } 
            {
                ret = new EriDisplayInformation(
                            eriInfo.mIconIndex,
                            eriInfo.mIconMode,
                            eriInfo.mEriText);
            } 
        } 
        
        varB4EAC82CA7396A68D541C85D26508E83_1769402472 = ret;
        addTaint(roamInd);
        addTaint(defRoamInd);
        EriDisplayInformation varA7E53CE21691AB073D9660D615818899_1850635916; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1850635916 = varB4EAC82CA7396A68D541C85D26508E83_840848368;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1850635916 = varB4EAC82CA7396A68D541C85D26508E83_1769402472;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1850635916.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1850635916;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.449 -0400", hash_original_method = "0CC10569A68EA715FF25360AD6D9EC97", hash_generated_method = "20D8886E6C9B9DF5AE6F6EEA9264F2F4")
    public int getCdmaEriIconIndex(int roamInd, int defRoamInd) {
        int var515FFAA8B10D5444FFA319B784D84C94_92816638 = (getEriDisplayInformation(roamInd, defRoamInd).mEriIconIndex);
        addTaint(roamInd);
        addTaint(defRoamInd);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_46915422 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_46915422;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.450 -0400", hash_original_method = "9AB048E0DEB3BE0C35B104EC83429815", hash_generated_method = "CF18E3787E216C72CA0EDDF2F85A1E6D")
    public int getCdmaEriIconMode(int roamInd, int defRoamInd) {
        int var29D805AE6BA7F58D859AF81BAF606D7F_129397670 = (getEriDisplayInformation(roamInd, defRoamInd).mEriIconMode);
        addTaint(roamInd);
        addTaint(defRoamInd);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2147219611 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2147219611;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.451 -0400", hash_original_method = "180B939948D08F85119E751A7703AC82", hash_generated_method = "CE80F9D7E3AE2F72FB5E463F4A89D197")
    public String getCdmaEriText(int roamInd, int defRoamInd) {
        String varB4EAC82CA7396A68D541C85D26508E83_2052243572 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_2052243572 = getEriDisplayInformation(roamInd, defRoamInd).mEriIconText;
        addTaint(roamInd);
        addTaint(defRoamInd);
        varB4EAC82CA7396A68D541C85D26508E83_2052243572.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_2052243572;
        
        
    }

    
    class EriFile {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.451 -0400", hash_original_field = "CA3B6F228A22FE5E587CFE3500DB0235", hash_generated_field = "7213E6068BB9156E973788AD57203866")

        public int mVersionNumber;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.451 -0400", hash_original_field = "C42433D66F2C2DBC9799A789B2B48B1D", hash_generated_field = "FDCC1E3B4FD2295A26ED5003CFA706F3")

        public int mNumberOfEriEntries;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.452 -0400", hash_original_field = "AD315A22B51F691A15FF83833BF75CD9", hash_generated_field = "E9576BD6C3AB66FA7A330571C9CA95FE")

        public int mEriFileType;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.452 -0400", hash_original_field = "2FB0AC8DD26FF5F0DD2CA5B243F49CAB", hash_generated_field = "AFBDC935694CE0774D1C68BD6FD348E1")

        public String[] mCallPromptId;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.452 -0400", hash_original_field = "4FC2074114FB09A5F4C098DD58728B23", hash_generated_field = "777F27FBAB0D81E98C7637CE98514EB6")

        public HashMap<Integer, EriInfo> mRoamIndTable;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.453 -0400", hash_original_method = "2EA3C22290A4E78EE72B7E98713E9994", hash_generated_method = "198DE2BB12791BAD0A6900555629D6CA")
        public  EriFile() {
            this.mVersionNumber = -1;
            this.mNumberOfEriEntries = 0;
            this.mEriFileType = -1;
            this.mCallPromptId = new String[] { "", "", "" };
            this.mRoamIndTable = new HashMap<Integer, EriInfo>();
            
            
            
            
            
            
        }

        
    }


    
    class EriDisplayInformation {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.453 -0400", hash_original_field = "5C2EEBB55B73259BA23EEAF20EEA7208", hash_generated_field = "D41D6FF190F02ADC6B00CBC4CA09758B")

        public int mEriIconIndex;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.453 -0400", hash_original_field = "EBB2869EEC015D02DBBB42BC561755A0", hash_generated_field = "567015E9F1EBB9480DDA52E1D3755433")

        public int mEriIconMode;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.453 -0400", hash_original_field = "950CBE7B17588C814951F20D86DEFDC5", hash_generated_field = "FE7B91EA19745F159F421B316262311F")

        public String mEriIconText;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.454 -0400", hash_original_method = "4EF117935273C0A391AF6FA851E1F0DC", hash_generated_method = "7B98B4E282FBDCCFB11D0BC5C762DE79")
        public  EriDisplayInformation(int eriIconIndex, int eriIconMode, String eriIconText) {
            mEriIconIndex = eriIconIndex;
            mEriIconMode = eriIconMode;
            mEriIconText = eriIconText;
            
            
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.455 -0400", hash_original_method = "AD3807950D152469EF511B007C55D141", hash_generated_method = "C060756F8F03546A2D8669AA14016CFD")
        @Override
        public String toString() {
            String varB4EAC82CA7396A68D541C85D26508E83_1822651615 = null; 
            varB4EAC82CA7396A68D541C85D26508E83_1822651615 = "EriDisplayInformation: {" + " IconIndex: " + mEriIconIndex + " EriIconMode: "
                    + mEriIconMode + " EriIconText: " + mEriIconText + " }";
            varB4EAC82CA7396A68D541C85D26508E83_1822651615.addTaint(getTaint()); 
            return varB4EAC82CA7396A68D541C85D26508E83_1822651615;
            
            
                    
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.455 -0400", hash_original_field = "951C150E6D062E6AED2C45BB9B756185", hash_generated_field = "1718F4DE7305211326235C8400C02ED3")

    private static final String LOG_TAG = "CDMA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.455 -0400", hash_original_field = "A4622F7F72162611C8E075EE443BC26E", hash_generated_field = "B7707D757F0604821CCAF673B2122320")

    private static final boolean DBG = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.455 -0400", hash_original_field = "F731EB70B21910E383F52051C1671657", hash_generated_field = "D02AF5D06ADE430F9873A441F2773872")

    private static final boolean VDBG = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.455 -0400", hash_original_field = "5593BB933254AF080B241EF8A7D85975", hash_generated_field = "00C3C5EFF0729D5E68BE0BDCAA7114C6")

    public static final int ERI_FROM_XML          = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.455 -0400", hash_original_field = "75287E9282EF2CA3FA6D4E6197DEF8B2", hash_generated_field = "02B1498635DB5093BFD38B42915E1A9B")

    public static final int ERI_FROM_FILE_SYSTEM  = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:27.455 -0400", hash_original_field = "5CC67EE3C8CE1461E5FE0D948907D471", hash_generated_field = "468B5F78F500D1FE21D0E4DF6EAF48F6")

    public static final int ERI_FROM_MODEM        = 2;
}

