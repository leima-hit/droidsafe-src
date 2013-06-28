package com.android.internal.telephony.gsm;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import static com.android.internal.telephony.TelephonyProperties.PROPERTY_ICC_OPERATOR_ALPHA;
import static com.android.internal.telephony.TelephonyProperties.PROPERTY_ICC_OPERATOR_ISO_COUNTRY;
import static com.android.internal.telephony.TelephonyProperties.PROPERTY_ICC_OPERATOR_NUMERIC;
import android.content.Context;
import android.os.AsyncResult;
import android.os.Message;
import android.os.SystemProperties;
import android.util.Log;
import com.android.internal.telephony.AdnRecord;
import com.android.internal.telephony.AdnRecordCache;
import com.android.internal.telephony.AdnRecordLoader;
import com.android.internal.telephony.BaseCommands;
import com.android.internal.telephony.CommandsInterface;
import com.android.internal.telephony.IccFileHandler;
import com.android.internal.telephony.IccRecords;
import com.android.internal.telephony.IccUtils;
import com.android.internal.telephony.IccVmFixedException;
import com.android.internal.telephony.IccVmNotSupportedException;
import com.android.internal.telephony.MccTable;
import com.android.internal.telephony.Phone;
import com.android.internal.telephony.PhoneBase;
import com.android.internal.telephony.SmsMessageBase;
import java.util.ArrayList;

public class SIMRecords extends IccRecords {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "A6D54253A6E7A5BF5CFC7DB47F269D57", hash_generated_field = "3D45F4DC7928ADFBE49F3906732C5FDD")

    VoiceMailConstants mVmConfig;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "E040FD05576717C9CA830E49D86F56E5", hash_generated_field = "1D5FAB34B5B1DFA2FF0C72EB8EB1417D")

    SpnOverride mSpnOverride;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "2A3E692FB30211EBAAAF0E3BF2F7B04D", hash_generated_field = "C8FB6D75F33BBB165F89E1184AF1DAB5")

    private String imsi;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "D3724EA3C1583660418AAE7549D15B6B", hash_generated_field = "F3670A331578D3C800D2A8879CDAE6A2")

    private boolean callForwardingEnabled;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "7A58A9F6FCDF3B6856A0262D5FF72428", hash_generated_field = "71EE1DCA9A91F37B8070C2DE70EBC3CC")

    private Get_Spn_Fsm_State spnState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "CC93CCB29A5FE37184AD950A48100507", hash_generated_field = "B94C656CABFD2A097CE8CA776F9B3D25")

    private byte[] mCphsInfo = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "1D3682655094CF36E1E3298A4C25ED91", hash_generated_field = "3B0DBAF5E1453033DE8A23FEF66CB6CF")

    boolean mCspPlmnEnabled = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "D2C36B26FA6DBE28216F0234CF7213CA", hash_generated_field = "531BEBDA8DE453FA3ED736DAC070C337")

    byte[] efMWIS = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "95FFAD26D850D5EC0F2B1F6AAE5CD8CE", hash_generated_field = "F7BA255CC3AE0058E8CFC095600F245B")

    byte[] efCPHS_MWI = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "58264A603FE1A26D9B3DD780DF8AAC91", hash_generated_field = "27C9B421032889367442E38FD625EA3E")

    byte[] mEfCff = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "D6E9B336B4F61EEF8DC3ED94B6E2429B", hash_generated_field = "4CFC3799ACD516937F814E469F055B3D")

    byte[] mEfCfis = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.876 -0400", hash_original_field = "6E8DE6542D284DA95B6DF2FA3E03574A", hash_generated_field = "677DC81727BE9252421E71F32EAE57E6")

    int spnDisplayCondition;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.877 -0400", hash_original_field = "E2A1ABC58A408D18FA38B6BF738C77C8", hash_generated_field = "9CBD8D86B3B910D521D7CFC4F4B05AE6")

    ArrayList<String> spdiNetworks = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.877 -0400", hash_original_field = "C79C429F0ECF3DC640C19EFC7DA64CD0", hash_generated_field = "FC170B0C5C20481C238409EFCB48A036")

    String pnnHomeName = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.877 -0400", hash_original_field = "06F1EF4000599F31B6960C354731E5E3", hash_generated_field = "433C8C040DD36FD17B8409B23AF92316")

    UsimServiceTable mUsimServiceTable;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.877 -0400", hash_original_method = "AA8710B4BBDFAECA42DF87898B5E71E9", hash_generated_method = "F453B0793EE78A6C0F14E38E4EB7DEBF")
    public  SIMRecords(PhoneBase p) {
        super(p);
        adnCache = new AdnRecordCache(phone);
        mVmConfig = new VoiceMailConstants();
        mSpnOverride = new SpnOverride();
        recordsRequested = false;
        recordsToLoad = 0;
        p.mCM.registerForSIMReady(this, EVENT_SIM_READY, null);
        p.mCM.registerForOffOrNotAvailable(
                        this, EVENT_RADIO_OFF_OR_NOT_AVAILABLE, null);
        p.mCM.setOnSmsOnSim(this, EVENT_SMS_ON_SIM, null);
        p.mCM.registerForIccRefresh(this, EVENT_SIM_REFRESH, null);
        onRadioOffOrNotAvailable();
        addTaint(p.getTaint());
        // ---------- Original Method ----------
        //adnCache = new AdnRecordCache(phone);
        //mVmConfig = new VoiceMailConstants();
        //mSpnOverride = new SpnOverride();
        //recordsRequested = false;
        //recordsToLoad = 0;
        //p.mCM.registerForSIMReady(this, EVENT_SIM_READY, null);
        //p.mCM.registerForOffOrNotAvailable(
                        //this, EVENT_RADIO_OFF_OR_NOT_AVAILABLE, null);
        //p.mCM.setOnSmsOnSim(this, EVENT_SMS_ON_SIM, null);
        //p.mCM.registerForIccRefresh(this, EVENT_SIM_REFRESH, null);
        //onRadioOffOrNotAvailable();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.877 -0400", hash_original_method = "60B34C0CDC881E5C8D40C8AAD990557F", hash_generated_method = "3EA07F3E006CA7F93EFE786B4B31CD0A")
    @Override
    public void dispose() {
        phone.mCM.unregisterForSIMReady(this);
        phone.mCM.unregisterForOffOrNotAvailable( this);
        phone.mCM.unregisterForIccRefresh(this);
        // ---------- Original Method ----------
        //phone.mCM.unregisterForSIMReady(this);
        //phone.mCM.unregisterForOffOrNotAvailable( this);
        //phone.mCM.unregisterForIccRefresh(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.878 -0400", hash_original_method = "D676C6F3D2367DC0A4942786FE826692", hash_generated_method = "6E2BC99A5C88DFAF422E2B6A62A301F5")
    protected void finalize() {
        Log.d(LOG_TAG, "SIMRecords finalized");
        // ---------- Original Method ----------
        //if(DBG) Log.d(LOG_TAG, "SIMRecords finalized");
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.878 -0400", hash_original_method = "1C495E4F05849546A87C14B5D6E64BED", hash_generated_method = "DFF28017DADF7D467DB4EC42F6547305")
    protected void onRadioOffOrNotAvailable() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        imsi = null;
        msisdn = null;
        voiceMailNum = null;
        countVoiceMessages = 0;
        mncLength = UNINITIALIZED;
        iccid = null;
        spnDisplayCondition = -1;
        efMWIS = null;
        efCPHS_MWI = null;
        spdiNetworks = null;
        pnnHomeName = null;
        adnCache.reset();
        phone.setSystemProperty(PROPERTY_ICC_OPERATOR_NUMERIC, null);
        phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ALPHA, null);
        phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ISO_COUNTRY, null);
        recordsRequested = false;
        // ---------- Original Method ----------
        //imsi = null;
        //msisdn = null;
        //voiceMailNum = null;
        //countVoiceMessages = 0;
        //mncLength = UNINITIALIZED;
        //iccid = null;
        //spnDisplayCondition = -1;
        //efMWIS = null;
        //efCPHS_MWI = null;
        //spdiNetworks = null;
        //pnnHomeName = null;
        //adnCache.reset();
        //phone.setSystemProperty(PROPERTY_ICC_OPERATOR_NUMERIC, null);
        //phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ALPHA, null);
        //phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ISO_COUNTRY, null);
        //recordsRequested = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.879 -0400", hash_original_method = "3D26DD60574339032566256F631F5DB8", hash_generated_method = "DC3BF66C3E0B0A7B072A54FD2C43AE57")
    @Override
    public String getIMSI() {
        String varB4EAC82CA7396A68D541C85D26508E83_1560255634 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1560255634 = imsi;
        varB4EAC82CA7396A68D541C85D26508E83_1560255634.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1560255634;
        // ---------- Original Method ----------
        //return imsi;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.880 -0400", hash_original_method = "9D42E73ED1AA846035EF94EBFAAEA8F6", hash_generated_method = "ED1701BFFCA032A6099F4C40973EBF36")
    public String getMsisdnNumber() {
        String varB4EAC82CA7396A68D541C85D26508E83_768962132 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_768962132 = msisdn;
        varB4EAC82CA7396A68D541C85D26508E83_768962132.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_768962132;
        // ---------- Original Method ----------
        //return msisdn;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.881 -0400", hash_original_method = "F96F62208A76C85F8691E193053EFC74", hash_generated_method = "757447D5198DCEACFDA593E927809AD4")
    @Override
    public UsimServiceTable getUsimServiceTable() {
        UsimServiceTable varB4EAC82CA7396A68D541C85D26508E83_1037974135 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1037974135 = mUsimServiceTable;
        varB4EAC82CA7396A68D541C85D26508E83_1037974135.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1037974135;
        // ---------- Original Method ----------
        //return mUsimServiceTable;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.881 -0400", hash_original_method = "7B16D051528D70BC1665C409BE0B92A5", hash_generated_method = "6D93835E811DE359D8EF935EC46B9D1D")
    public void setMsisdnNumber(String alphaTag, String number,
            Message onComplete) {
        msisdn = number;
        msisdnTag = alphaTag;
        log("Set MSISDN: " + msisdnTag + " " +  "xxxxxxx");
        AdnRecord adn = new AdnRecord(msisdnTag, msisdn);
        new AdnRecordLoader(phone).updateEF(adn, EF_MSISDN, EF_EXT1, 1, null,
                obtainMessage(EVENT_SET_MSISDN_DONE, onComplete));
        addTaint(alphaTag.getTaint());
        addTaint(number.getTaint());
        addTaint(onComplete.getTaint());
        // ---------- Original Method ----------
        //msisdn = number;
        //msisdnTag = alphaTag;
        //if(DBG) log("Set MSISDN: " + msisdnTag + " " +  "xxxxxxx");
        //AdnRecord adn = new AdnRecord(msisdnTag, msisdn);
        //new AdnRecordLoader(phone).updateEF(adn, EF_MSISDN, EF_EXT1, 1, null,
                //obtainMessage(EVENT_SET_MSISDN_DONE, onComplete));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.882 -0400", hash_original_method = "E32EFED28CC433860D178485CFB4EEE4", hash_generated_method = "CA1449A6BA0CF18F5ECB4F5DA716BEBA")
    public String getMsisdnAlphaTag() {
        String varB4EAC82CA7396A68D541C85D26508E83_1141984702 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1141984702 = msisdnTag;
        varB4EAC82CA7396A68D541C85D26508E83_1141984702.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1141984702;
        // ---------- Original Method ----------
        //return msisdnTag;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.883 -0400", hash_original_method = "77FFC0D98CD3CB2629C7F6A7D27E6FFF", hash_generated_method = "9CBF5276134A7217DB4EF34052C70ED4")
    public String getVoiceMailNumber() {
        String varB4EAC82CA7396A68D541C85D26508E83_464295153 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_464295153 = voiceMailNum;
        varB4EAC82CA7396A68D541C85D26508E83_464295153.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_464295153;
        // ---------- Original Method ----------
        //return voiceMailNum;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.883 -0400", hash_original_method = "BBA59ED68AB83B35B5A29C09BCF3BE4C", hash_generated_method = "38417C56F3FDC2AE58D441C58C80C8AA")
    public void setVoiceMailNumber(String alphaTag, String voiceNumber,
            Message onComplete) {
        {
            AsyncResult.forMessage((onComplete)).exception =
                    new IccVmFixedException("Voicemail number is fixed by operator");
            onComplete.sendToTarget();
        } //End block
        newVoiceMailNum = voiceNumber;
        newVoiceMailTag = alphaTag;
        AdnRecord adn = new AdnRecord(newVoiceMailTag, newVoiceMailNum);
        {
            new AdnRecordLoader(phone).updateEF(adn, EF_MBDN, EF_EXT6,
                    mailboxIndex, null,
                    obtainMessage(EVENT_SET_MBDN_DONE, onComplete));
        } //End block
        {
            boolean var49EDB32946FB23439D4ABEF334DBE8F4_449718295 = (isCphsMailboxEnabled());
            {
                new AdnRecordLoader(phone).updateEF(adn, EF_MAILBOX_CPHS,
                    EF_EXT1, 1, null,
                    obtainMessage(EVENT_SET_CPHS_MAILBOX_DONE, onComplete));
            } //End block
            {
                AsyncResult.forMessage((onComplete)).exception =
                    new IccVmNotSupportedException("Update SIM voice mailbox error");
                onComplete.sendToTarget();
            } //End block
        } //End collapsed parenthetic
        addTaint(alphaTag.getTaint());
        addTaint(voiceNumber.getTaint());
        addTaint(onComplete.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.884 -0400", hash_original_method = "5A91F4662DCD8CEE6B5E6A046B7A4ABC", hash_generated_method = "91A4A3399403859059A739256592860D")
    public String getVoiceMailAlphaTag() {
        String varB4EAC82CA7396A68D541C85D26508E83_1844780881 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1844780881 = voiceMailTag;
        varB4EAC82CA7396A68D541C85D26508E83_1844780881.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1844780881;
        // ---------- Original Method ----------
        //return voiceMailTag;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.885 -0400", hash_original_method = "75BFE4AFE8A3A09F4E38976A214FAF70", hash_generated_method = "ED2C812C930BC414206CF263F8543B3E")
    public void setVoiceMessageWaiting(int line, int countWaiting) {
        {
            countWaiting = -1;
        } //End block
        {
            countWaiting = 0xff;
        } //End block
        countVoiceMessages = countWaiting;
        phone.notifyMessageWaitingIndicator();
        try 
        {
            {
                efMWIS[0] = (byte)((efMWIS[0] & 0xfe)
                                    | (countVoiceMessages == 0 ? 0 : 1));
                {
                    efMWIS[1] = 0;
                } //End block
                {
                    efMWIS[1] = (byte) countWaiting;
                } //End block
                phone.getIccFileHandler().updateEFLinearFixed(
                    EF_MWIS, 1, efMWIS, null,
                    obtainMessage (EVENT_UPDATE_DONE, EF_MWIS));
            } //End block
            {
                efCPHS_MWI[0] = (byte)((efCPHS_MWI[0] & 0xf0)
                            | (countVoiceMessages == 0 ? 0x5 : 0xa));
                phone.getIccFileHandler().updateEFTransparent(
                    EF_VOICE_MAIL_INDICATOR_CPHS, efCPHS_MWI,
                    obtainMessage (EVENT_UPDATE_DONE, EF_VOICE_MAIL_INDICATOR_CPHS));
            } //End block
        } //End block
        catch (ArrayIndexOutOfBoundsException ex)
        { }
        addTaint(line);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.885 -0400", hash_original_method = "2A8D94361FF074096EDCA291A7FA986D", hash_generated_method = "144CEDB00C1499D9FEC296ABD8FE7BA2")
    @Override
    public boolean getVoiceCallForwardingFlag() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1647930140 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1647930140;
        // ---------- Original Method ----------
        //return callForwardingEnabled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.886 -0400", hash_original_method = "141082A6B47AB008F9D1AEFE7E7266B0", hash_generated_method = "7D470D879E0BE633F0C906E6A355A40F")
    @Override
    public void setVoiceCallForwardingFlag(int line, boolean enable) {
        callForwardingEnabled = enable;
        phone.notifyCallForwardingIndicator();
        try 
        {
            {
                {
                    mEfCfis[1] |= 1;
                } //End block
                {
                    mEfCfis[1] &= 0xfe;
                } //End block
                phone.getIccFileHandler().updateEFLinearFixed(
                        EF_CFIS, 1, mEfCfis, null,
                        obtainMessage (EVENT_UPDATE_DONE, EF_CFIS));
            } //End block
            {
                {
                    mEfCff[0] = (byte) ((mEfCff[0] & CFF_LINE1_RESET)
                            | CFF_UNCONDITIONAL_ACTIVE);
                } //End block
                {
                    mEfCff[0] = (byte) ((mEfCff[0] & CFF_LINE1_RESET)
                            | CFF_UNCONDITIONAL_DEACTIVE);
                } //End block
                phone.getIccFileHandler().updateEFTransparent(
                        EF_CFF_CPHS, mEfCff,
                        obtainMessage (EVENT_UPDATE_DONE, EF_CFF_CPHS));
            } //End block
        } //End block
        catch (ArrayIndexOutOfBoundsException ex)
        { }
        addTaint(line);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.886 -0400", hash_original_method = "3729AD4A21CE0EDB3800382FBE3F87EC", hash_generated_method = "7912B183DD2EB642356E1DD30C60FE60")
    public void onRefresh(boolean fileChanged, int[] fileList) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            fetchSimRecords();
        } //End block
        addTaint(fileChanged);
        addTaint(fileList[0]);
        // ---------- Original Method ----------
        //if (fileChanged) {
            //fetchSimRecords();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:29.887 -0400", hash_original_method = "7E03E5ED77A0C757F38448793B936037", hash_generated_method = "F465C874A02EC2C70BF940A57072AF5D")
    @Override
    public String getOperatorNumeric() {
        String varB4EAC82CA7396A68D541C85D26508E83_964642249 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_245775431 = null; //Variable for return #2
        String varB4EAC82CA7396A68D541C85D26508E83_1991624694 = null; //Variable for return #3
        {
            Log.d(LOG_TAG, "getOperatorNumeric: IMSI == null");
            varB4EAC82CA7396A68D541C85D26508E83_964642249 = null;
        } //End block
        {
            Log.d(LOG_TAG, "getSIMOperatorNumeric: bad mncLength");
            varB4EAC82CA7396A68D541C85D26508E83_245775431 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1991624694 = imsi.substring(0, 3 + mncLength);
        String varA7E53CE21691AB073D9660D615818899_500184012; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_500184012 = varB4EAC82CA7396A68D541C85D26508E83_964642249;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_500184012 = varB4EAC82CA7396A68D541C85D26508E83_245775431;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_500184012 = varB4EAC82CA7396A68D541C85D26508E83_1991624694;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_500184012.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_500184012;
        // ---------- Original Method ----------
        //if (imsi == null) {
            //Log.d(LOG_TAG, "getOperatorNumeric: IMSI == null");
            //return null;
        //}
        //if (mncLength == UNINITIALIZED || mncLength == UNKNOWN) {
            //Log.d(LOG_TAG, "getSIMOperatorNumeric: bad mncLength");
            //return null;
        //}
        //return imsi.substring(0, 3 + mncLength);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.271 -0400", hash_original_method = "5FA65278BC21B747191DBEA87B814DA9", hash_generated_method = "C4CEA5E6D5DE9F995A999EB8091F4467")
    public void handleMessage(Message msg) {
        AsyncResult ar;
        AdnRecord adn;
        byte data[];
        boolean isRecordLoadResponse = false;
        try 
        {
            //Begin case EVENT_SIM_READY 
            onSimReady();
            //End case EVENT_SIM_READY 
            //Begin case EVENT_RADIO_OFF_OR_NOT_AVAILABLE 
            onRadioOffOrNotAvailable();
            //End case EVENT_RADIO_OFF_OR_NOT_AVAILABLE 
            //Begin case EVENT_GET_IMSI_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_IMSI_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_IMSI_DONE 
            imsi = (String) ar.result;
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_IMSI_DONE 
            {
                boolean var830EA25F7AEDECBD15578DB21CAE52BA_1180645789 = (imsi != null && (imsi.length() < 6 || imsi.length() > 15));
                {
                    imsi = null;
                } //End block
            } //End collapsed parenthetic
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_IMSI_DONE 
            Log.d(LOG_TAG, "IMSI: " +  "xxxxxxx");
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_IMSI_DONE 
            {
                boolean varAA3845750DE6743614D7EDB45EFDA541_1042252715 = (((mncLength == UNKNOWN) || (mncLength == 2)) &&
                        ((imsi != null) && (imsi.length() >= 6)));
                {
                    String mccmncCode = imsi.substring(0, 6);
                    {
                        String mccmnc = MCCMNC_CODES_HAVING_3DIGITS_MNC[0];
                        {
                            {
                                boolean var7D3F2C7003F88A96589D9955600C8CFE_338658983 = (mccmnc.equals(mccmncCode));
                                {
                                    mncLength = 3;
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_IMSI_DONE 
            {
                try 
                {
                    int mcc = Integer.parseInt(imsi.substring(0,3));
                    mncLength = MccTable.smallestDigitsMccForMnc(mcc);
                } //End block
                catch (NumberFormatException e)
                {
                    mncLength = UNKNOWN;
                } //End block
            } //End block
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_IMSI_DONE 
            {
                MccTable.updateMccMncConfiguration(phone, imsi.substring(0, 3 + mncLength));
            } //End block
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_IMSI_DONE 
            phone.mIccCard.broadcastIccStateChangedIntent(
                        SimCard.INTENT_VALUE_ICC_IMSI, null);
            //End case EVENT_GET_IMSI_DONE 
            //Begin case EVENT_GET_MBI_DONE 
            boolean isValidMbdn;
            //End case EVENT_GET_MBI_DONE 
            //Begin case EVENT_GET_MBI_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_MBI_DONE 
            //Begin case EVENT_GET_MBI_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_MBI_DONE 
            //Begin case EVENT_GET_MBI_DONE 
            data = (byte[]) ar.result;
            //End case EVENT_GET_MBI_DONE 
            //Begin case EVENT_GET_MBI_DONE 
            isValidMbdn = false;
            //End case EVENT_GET_MBI_DONE 
            //Begin case EVENT_GET_MBI_DONE 
            {
                Log.d(LOG_TAG, "EF_MBI: " +
                            IccUtils.bytesToHexString(data));
                mailboxIndex = (int)data[0] & 0xff;
                {
                    Log.d(LOG_TAG, "Got valid mailbox number for MBDN");
                    isValidMbdn = true;
                } //End block
            } //End block
            //End case EVENT_GET_MBI_DONE 
            //Begin case EVENT_GET_MBI_DONE 
            recordsToLoad += 1;
            //End case EVENT_GET_MBI_DONE 
            //Begin case EVENT_GET_MBI_DONE 
            {
                new AdnRecordLoader(phone).loadFromEF(EF_MBDN, EF_EXT6,
                            mailboxIndex, obtainMessage(EVENT_GET_MBDN_DONE));
            } //End block
            {
                new AdnRecordLoader(phone).loadFromEF(EF_MAILBOX_CPHS,
                            EF_EXT1, 1,
                            obtainMessage(EVENT_GET_CPHS_MAILBOX_DONE));
            } //End block
            //End case EVENT_GET_MBI_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            voiceMailNum = null;
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            voiceMailTag = null;
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            {
                Log.d(LOG_TAG, "Invalid or missing EF"
                        + ((msg.what == EVENT_GET_CPHS_MAILBOX_DONE) ? "[MAILBOX]" : "[MBDN]"));
                {
                    recordsToLoad += 1;
                    new AdnRecordLoader(phone).loadFromEF(
                                EF_MAILBOX_CPHS, EF_EXT1, 1,
                                obtainMessage(EVENT_GET_CPHS_MAILBOX_DONE));
                } //End block
            } //End block
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            adn = (AdnRecord)ar.result;
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            Log.d(LOG_TAG, "VM: " + adn +
                        ((msg.what == EVENT_GET_CPHS_MAILBOX_DONE) ? " EF[MAILBOX]" : " EF[MBDN]"));
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            {
                boolean var6E610A8EE073A016325ACA342BC92511_467372891 = (adn.isEmpty() && msg.what == EVENT_GET_MBDN_DONE);
                {
                    recordsToLoad += 1;
                    new AdnRecordLoader(phone).loadFromEF(
                            EF_MAILBOX_CPHS, EF_EXT1, 1,
                            obtainMessage(EVENT_GET_CPHS_MAILBOX_DONE));
                } //End block
            } //End collapsed parenthetic
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            voiceMailNum = adn.getNumber();
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            voiceMailTag = adn.getAlphaTag();
            //End case EVENT_GET_CPHS_MAILBOX_DONE EVENT_GET_MBDN_DONE 
            //Begin case EVENT_GET_MSISDN_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_MSISDN_DONE 
            //Begin case EVENT_GET_MSISDN_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_MSISDN_DONE 
            //Begin case EVENT_GET_MSISDN_DONE 
            {
                Log.d(LOG_TAG, "Invalid or missing EF[MSISDN]");
            } //End block
            //End case EVENT_GET_MSISDN_DONE 
            //Begin case EVENT_GET_MSISDN_DONE 
            adn = (AdnRecord)ar.result;
            //End case EVENT_GET_MSISDN_DONE 
            //Begin case EVENT_GET_MSISDN_DONE 
            msisdn = adn.getNumber();
            //End case EVENT_GET_MSISDN_DONE 
            //Begin case EVENT_GET_MSISDN_DONE 
            msisdnTag = adn.getAlphaTag();
            //End case EVENT_GET_MSISDN_DONE 
            //Begin case EVENT_GET_MSISDN_DONE 
            Log.d(LOG_TAG, "MSISDN: " +  "xxxxxxx");
            //End case EVENT_GET_MSISDN_DONE 
            //Begin case EVENT_SET_MSISDN_DONE 
            isRecordLoadResponse = false;
            //End case EVENT_SET_MSISDN_DONE 
            //Begin case EVENT_SET_MSISDN_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_SET_MSISDN_DONE 
            //Begin case EVENT_SET_MSISDN_DONE 
            {
                AsyncResult.forMessage(((Message) ar.userObj)).exception
                            = ar.exception;
                ((Message) ar.userObj).sendToTarget();
            } //End block
            //End case EVENT_SET_MSISDN_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            data = (byte[])ar.result;
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            Log.d(LOG_TAG, "EF_MWIS: " +
                   IccUtils.bytesToHexString(data));
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            efMWIS = data;
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            {
                Log.d(LOG_TAG, "SIMRecords: Uninitialized record MWIS");
            } //End block
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            boolean voiceMailWaiting = ((data[0] & 0x01) != 0);
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            countVoiceMessages = data[1] & 0xff;
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            {
                countVoiceMessages = -1;
            } //End block
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_MWIS_DONE 
            phone.notifyMessageWaitingIndicator();
            //End case EVENT_GET_MWIS_DONE 
            //Begin case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            //Begin case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            //Begin case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            data = (byte[])ar.result;
            //End case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            //Begin case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            efCPHS_MWI = data;
            //End case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            //Begin case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            {
                int indicator = (int)(data[0] & 0xf);
                {
                    countVoiceMessages = -1;
                } //End block
                {
                    countVoiceMessages = 0;
                } //End block
                phone.notifyMessageWaitingIndicator();
            } //End block
            //End case EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE 
            //Begin case EVENT_GET_ICCID_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_ICCID_DONE 
            //Begin case EVENT_GET_ICCID_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_ICCID_DONE 
            //Begin case EVENT_GET_ICCID_DONE 
            data = (byte[])ar.result;
            //End case EVENT_GET_ICCID_DONE 
            //Begin case EVENT_GET_ICCID_DONE 
            iccid = IccUtils.bcdToString(data, 0, data.length);
            //End case EVENT_GET_ICCID_DONE 
            //Begin case EVENT_GET_ICCID_DONE 
            Log.d(LOG_TAG, "iccid: " + iccid);
            //End case EVENT_GET_ICCID_DONE 
            //Begin case EVENT_GET_AD_DONE 
            try 
            {
                isRecordLoadResponse = true;
                ar = (AsyncResult)msg.obj;
                data = (byte[])ar.result;
                Log.d(LOG_TAG, "EF_AD: " +
                            IccUtils.bytesToHexString(data));
                {
                    Log.d(LOG_TAG, "SIMRecords: Corrupt AD data on SIM");
                } //End block
                {
                    Log.d(LOG_TAG, "SIMRecords: MNC length not present in EF_AD");
                } //End block
                mncLength = (int)data[3] & 0xf;
                {
                    mncLength = UNKNOWN;
                } //End block
            } //End block
            finally 
            {
                {
                    boolean varA6967A0FC894379A31A07978EEE8D097_954259293 = (((mncLength == UNINITIALIZED) || (mncLength == UNKNOWN) ||
                            (mncLength == 2)) && ((imsi != null) && (imsi.length() >= 6)));
                    {
                        String mccmncCode = imsi.substring(0, 6);
                        {
                            Iterator<String> varC240E69CE119782E8F47CC07C68C68DD_1300712988 = (MCCMNC_CODES_HAVING_3DIGITS_MNC).iterator();
                            varC240E69CE119782E8F47CC07C68C68DD_1300712988.hasNext();
                            String mccmnc = varC240E69CE119782E8F47CC07C68C68DD_1300712988.next();
                            {
                                {
                                    boolean var84BDA82F133A3C6DFBD3E95E8608ED9C_1658156434 = (mccmnc.equals(mccmncCode));
                                    {
                                        mncLength = 3;
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
                {
                    {
                        try 
                        {
                            int mcc = Integer.parseInt(imsi.substring(0,3));
                            mncLength = MccTable.smallestDigitsMccForMnc(mcc);
                        } //End block
                        catch (NumberFormatException e)
                        {
                            mncLength = UNKNOWN;
                        } //End block
                    } //End block
                    {
                        mncLength = UNKNOWN;
                        Log.d(LOG_TAG, "SIMRecords: MNC length not present in EF_AD");
                    } //End block
                } //End block
                {
                    MccTable.updateMccMncConfiguration(phone, imsi.substring(0, 3 + mncLength));
                } //End block
            } //End block
            //End case EVENT_GET_AD_DONE 
            //Begin case EVENT_GET_SPN_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_SPN_DONE 
            //Begin case EVENT_GET_SPN_DONE 
            ar = (AsyncResult) msg.obj;
            //End case EVENT_GET_SPN_DONE 
            //Begin case EVENT_GET_SPN_DONE 
            getSpnFsm(false, ar);
            //End case EVENT_GET_SPN_DONE 
            //Begin case EVENT_GET_CFF_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_CFF_DONE 
            //Begin case EVENT_GET_CFF_DONE 
            ar = (AsyncResult) msg.obj;
            //End case EVENT_GET_CFF_DONE 
            //Begin case EVENT_GET_CFF_DONE 
            data = (byte[]) ar.result;
            //End case EVENT_GET_CFF_DONE 
            //Begin case EVENT_GET_CFF_DONE 
            Log.d(LOG_TAG, "EF_CFF_CPHS: " +
                        IccUtils.bytesToHexString(data));
            //End case EVENT_GET_CFF_DONE 
            //Begin case EVENT_GET_CFF_DONE 
            mEfCff = data;
            //End case EVENT_GET_CFF_DONE 
            //Begin case EVENT_GET_CFF_DONE 
            {
                callForwardingEnabled =
                        ((data[0] & CFF_LINE1_MASK) == CFF_UNCONDITIONAL_ACTIVE);
                phone.notifyCallForwardingIndicator();
            } //End block
            //End case EVENT_GET_CFF_DONE 
            //Begin case EVENT_GET_SPDI_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_SPDI_DONE 
            //Begin case EVENT_GET_SPDI_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_SPDI_DONE 
            //Begin case EVENT_GET_SPDI_DONE 
            data = (byte[])ar.result;
            //End case EVENT_GET_SPDI_DONE 
            //Begin case EVENT_GET_SPDI_DONE 
            parseEfSpdi(data);
            //End case EVENT_GET_SPDI_DONE 
            //Begin case EVENT_UPDATE_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_UPDATE_DONE 
            //Begin case EVENT_GET_PNN_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_PNN_DONE 
            //Begin case EVENT_GET_PNN_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_PNN_DONE 
            //Begin case EVENT_GET_PNN_DONE 
            data = (byte[])ar.result;
            //End case EVENT_GET_PNN_DONE 
            //Begin case EVENT_GET_PNN_DONE 
            SimTlv tlv = new SimTlv(data, 0, data.length);
            //End case EVENT_GET_PNN_DONE 
            //Begin case EVENT_GET_PNN_DONE 
            {
                boolean varCB644CCA004D571A2231D5557A3D0712_600031 = (tlv.isValidObject());
                tlv.nextObject();
                {
                    {
                        boolean varA602311CA9E7B0FBD63424EF01DC038B_2111260592 = (tlv.getTag() == TAG_FULL_NETWORK_NAME);
                        {
                            pnnHomeName
                            = IccUtils.networkNameToString(
                                tlv.getData(), 0, tlv.getData().length);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            //End case EVENT_GET_PNN_DONE 
            //Begin case EVENT_GET_ALL_SMS_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_ALL_SMS_DONE 
            //Begin case EVENT_GET_ALL_SMS_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_ALL_SMS_DONE 
            //Begin case EVENT_GET_ALL_SMS_DONE 
            handleSmses((ArrayList) ar.result);
            //End case EVENT_GET_ALL_SMS_DONE 
            //Begin case EVENT_SMS_ON_SIM 
            isRecordLoadResponse = false;
            //End case EVENT_SMS_ON_SIM 
            //Begin case EVENT_SMS_ON_SIM 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_SMS_ON_SIM 
            //Begin case EVENT_SMS_ON_SIM 
            int[] index = (int[])ar.result;
            //End case EVENT_SMS_ON_SIM 
            //Begin case EVENT_SMS_ON_SIM 
            {
                Log.d(LOG_TAG, "READ EF_SMS RECORD index=" + index[0]);
                phone.getIccFileHandler().loadEFLinearFixed(EF_SMS,index[0],
                            obtainMessage(EVENT_GET_SMS_DONE));
            } //End block
            //End case EVENT_SMS_ON_SIM 
            //Begin case EVENT_GET_SMS_DONE 
            isRecordLoadResponse = false;
            //End case EVENT_GET_SMS_DONE 
            //Begin case EVENT_GET_SMS_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_SMS_DONE 
            //Begin case EVENT_GET_SMS_DONE 
            {
                handleSms((byte[])ar.result);
            } //End block
            //End case EVENT_GET_SMS_DONE 
            //Begin case EVENT_GET_SST_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_SST_DONE 
            //Begin case EVENT_GET_SST_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_SST_DONE 
            //Begin case EVENT_GET_SST_DONE 
            data = (byte[])ar.result;
            //End case EVENT_GET_SST_DONE 
            //Begin case EVENT_GET_SST_DONE 
            mUsimServiceTable = new UsimServiceTable(data);
            //End case EVENT_GET_SST_DONE 
            //Begin case EVENT_GET_SST_DONE 
            log("SST: " + mUsimServiceTable);
            //End case EVENT_GET_SST_DONE 
            //Begin case EVENT_GET_INFO_CPHS_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_INFO_CPHS_DONE 
            //Begin case EVENT_GET_INFO_CPHS_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_INFO_CPHS_DONE 
            //Begin case EVENT_GET_INFO_CPHS_DONE 
            mCphsInfo = (byte[])ar.result;
            //End case EVENT_GET_INFO_CPHS_DONE 
            //Begin case EVENT_GET_INFO_CPHS_DONE 
            log("iCPHS: " + IccUtils.bytesToHexString(mCphsInfo));
            //End case EVENT_GET_INFO_CPHS_DONE 
            //Begin case EVENT_SET_MBDN_DONE 
            isRecordLoadResponse = false;
            //End case EVENT_SET_MBDN_DONE 
            //Begin case EVENT_SET_MBDN_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_SET_MBDN_DONE 
            //Begin case EVENT_SET_MBDN_DONE 
            {
                voiceMailNum = newVoiceMailNum;
                voiceMailTag = newVoiceMailTag;
            } //End block
            //End case EVENT_SET_MBDN_DONE 
            //Begin case EVENT_SET_MBDN_DONE 
            {
                boolean varDB6C50FA3E4BE068EAA8443655261A1E_796197387 = (isCphsMailboxEnabled());
                {
                    adn = new AdnRecord(voiceMailTag, voiceMailNum);
                    Message onCphsCompleted = (Message) ar.userObj;
                    {
                        AsyncResult.forMessage(((Message) ar.userObj)).exception
                                = null;
                        ((Message) ar.userObj).sendToTarget();
                        log("Callback with MBDN successful.");
                        onCphsCompleted = null;
                    } //End block
                    new AdnRecordLoader(phone).
                            updateEF(adn, EF_MAILBOX_CPHS, EF_EXT1, 1, null,
                            obtainMessage(EVENT_SET_CPHS_MAILBOX_DONE,
                                    onCphsCompleted));
                } //End block
                {
                    {
                        AsyncResult.forMessage(((Message) ar.userObj)).exception
                                = ar.exception;
                        ((Message) ar.userObj).sendToTarget();
                    } //End block
                } //End block
            } //End collapsed parenthetic
            //End case EVENT_SET_MBDN_DONE 
            //Begin case EVENT_SET_CPHS_MAILBOX_DONE 
            isRecordLoadResponse = false;
            //End case EVENT_SET_CPHS_MAILBOX_DONE 
            //Begin case EVENT_SET_CPHS_MAILBOX_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_SET_CPHS_MAILBOX_DONE 
            //Begin case EVENT_SET_CPHS_MAILBOX_DONE 
            {
                voiceMailNum = newVoiceMailNum;
                voiceMailTag = newVoiceMailTag;
            } //End block
            {
                log("Set CPHS MailBox with exception: "
                            + ar.exception);
            } //End block
            //End case EVENT_SET_CPHS_MAILBOX_DONE 
            //Begin case EVENT_SET_CPHS_MAILBOX_DONE 
            {
                log("Callback with CPHS MB successful.");
                AsyncResult.forMessage(((Message) ar.userObj)).exception
                            = ar.exception;
                ((Message) ar.userObj).sendToTarget();
            } //End block
            //End case EVENT_SET_CPHS_MAILBOX_DONE 
            //Begin case EVENT_SIM_REFRESH 
            isRecordLoadResponse = false;
            //End case EVENT_SIM_REFRESH 
            //Begin case EVENT_SIM_REFRESH 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_SIM_REFRESH 
            //Begin case EVENT_SIM_REFRESH 
            log("Sim REFRESH with exception: " + ar.exception);
            //End case EVENT_SIM_REFRESH 
            //Begin case EVENT_SIM_REFRESH 
            {
                handleSimRefresh((int[])(ar.result));
            } //End block
            //End case EVENT_SIM_REFRESH 
            //Begin case EVENT_GET_CFIS_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_CFIS_DONE 
            //Begin case EVENT_GET_CFIS_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_CFIS_DONE 
            //Begin case EVENT_GET_CFIS_DONE 
            data = (byte[])ar.result;
            //End case EVENT_GET_CFIS_DONE 
            //Begin case EVENT_GET_CFIS_DONE 
            Log.d(LOG_TAG, "EF_CFIS: " +
                   IccUtils.bytesToHexString(data));
            //End case EVENT_GET_CFIS_DONE 
            //Begin case EVENT_GET_CFIS_DONE 
            mEfCfis = data;
            //End case EVENT_GET_CFIS_DONE 
            //Begin case EVENT_GET_CFIS_DONE 
            callForwardingEnabled = ((data[1] & 0x01) != 0);
            //End case EVENT_GET_CFIS_DONE 
            //Begin case EVENT_GET_CFIS_DONE 
            phone.notifyCallForwardingIndicator();
            //End case EVENT_GET_CFIS_DONE 
            //Begin case EVENT_GET_CSP_CPHS_DONE 
            isRecordLoadResponse = true;
            //End case EVENT_GET_CSP_CPHS_DONE 
            //Begin case EVENT_GET_CSP_CPHS_DONE 
            ar = (AsyncResult)msg.obj;
            //End case EVENT_GET_CSP_CPHS_DONE 
            //Begin case EVENT_GET_CSP_CPHS_DONE 
            data = (byte[])ar.result;
            //End case EVENT_GET_CSP_CPHS_DONE 
            //Begin case EVENT_GET_CSP_CPHS_DONE 
            handleEfCspData(data);
            //End case EVENT_GET_CSP_CPHS_DONE 
            //Begin case default 
            super.handleMessage(msg);
            //End case default 
        } //End block
        catch (RuntimeException exc)
        { }
        finally 
        {
            {
                onRecordLoaded();
            } //End block
        } //End block
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.272 -0400", hash_original_method = "E530DF481CB4FAA0037A4FE4ABD87373", hash_generated_method = "CF925A38E53DE3280062F2C1678C27C7")
    private void handleFileUpdate(int efid) {
        //Begin case EF_MBDN 
        new AdnRecordLoader(phone).loadFromEF(EF_MBDN, EF_EXT6,
                        mailboxIndex, obtainMessage(EVENT_GET_MBDN_DONE));
        //End case EF_MBDN 
        //Begin case EF_MAILBOX_CPHS 
        new AdnRecordLoader(phone).loadFromEF(EF_MAILBOX_CPHS, EF_EXT1,
                        1, obtainMessage(EVENT_GET_CPHS_MAILBOX_DONE));
        //End case EF_MAILBOX_CPHS 
        //Begin case EF_CSP_CPHS 
        phone.getIccFileHandler().loadEFTransparent(EF_CSP_CPHS,
                        obtainMessage(EVENT_GET_CSP_CPHS_DONE));
        //End case EF_CSP_CPHS 
        //Begin case default 
        adnCache.reset();
        //End case default 
        //Begin case default 
        fetchSimRecords();
        //End case default 
        addTaint(efid);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.272 -0400", hash_original_method = "CBD0F454D52453FACC84E0D26FD9E162", hash_generated_method = "6F7CBFE63EFAA218F12FC0D0A1526E69")
    private void handleSimRefresh(int[] result) {
        {
            log("handleSimRefresh without input");
        } //End block
        //Begin case CommandsInterface.SIM_REFRESH_FILE_UPDATED 
        log("handleSimRefresh with SIM_REFRESH_FILE_UPDATED");
        //End case CommandsInterface.SIM_REFRESH_FILE_UPDATED 
        //Begin case CommandsInterface.SIM_REFRESH_FILE_UPDATED 
        int efid = result[1];
        //End case CommandsInterface.SIM_REFRESH_FILE_UPDATED 
        //Begin case CommandsInterface.SIM_REFRESH_FILE_UPDATED 
        handleFileUpdate(efid);
        //End case CommandsInterface.SIM_REFRESH_FILE_UPDATED 
        //Begin case CommandsInterface.SIM_REFRESH_INIT 
        log("handleSimRefresh with SIM_REFRESH_INIT");
        //End case CommandsInterface.SIM_REFRESH_INIT 
        //Begin case CommandsInterface.SIM_REFRESH_INIT 
        adnCache.reset();
        //End case CommandsInterface.SIM_REFRESH_INIT 
        //Begin case CommandsInterface.SIM_REFRESH_INIT 
        fetchSimRecords();
        //End case CommandsInterface.SIM_REFRESH_INIT 
        //Begin case CommandsInterface.SIM_REFRESH_RESET 
        log("handleSimRefresh with SIM_REFRESH_RESET");
        //End case CommandsInterface.SIM_REFRESH_RESET 
        //Begin case CommandsInterface.SIM_REFRESH_RESET 
        phone.mCM.setRadioPower(false, null);
        //End case CommandsInterface.SIM_REFRESH_RESET 
        //Begin case default 
        log("handleSimRefresh with unknown operation");
        //End case default 
        addTaint(result[0]);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.272 -0400", hash_original_method = "0F425E7BAA03121C5111F3872E01B168", hash_generated_method = "D0B11F033A6A0BF726B093FA97601524")
    protected int dispatchGsmMessage(SmsMessageBase message) {
        int varA522FA72751E3B8CCDC974402CB11ED3_282000223 = (phone.mSMS.dispatchMessage(message));
        addTaint(message.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_500356706 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_500356706;
        // ---------- Original Method ----------
        //return phone.mSMS.dispatchMessage(message);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.273 -0400", hash_original_method = "3974DFF11A620863F24401AEED15BD51", hash_generated_method = "FAE6B8C5FC7BDD8B08AEE377367766D1")
    private void handleSms(byte[] ba) {
        Log.d("ENF", "status : " + ba[0]);
        {
            int n = ba.length;
            byte[] pdu = new byte[n - 1];
            System.arraycopy(ba, 1, pdu, 0, n - 1);
            SmsMessage message = SmsMessage.createFromPdu(pdu);
            dispatchGsmMessage(message);
        } //End block
        addTaint(ba[0]);
        // ---------- Original Method ----------
        //if (ba[0] != 0)
            //Log.d("ENF", "status : " + ba[0]);
        //if (ba[0] == 3) {
            //int n = ba.length;
            //byte[] pdu = new byte[n - 1];
            //System.arraycopy(ba, 1, pdu, 0, n - 1);
            //SmsMessage message = SmsMessage.createFromPdu(pdu);
            //dispatchGsmMessage(message);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.273 -0400", hash_original_method = "AAB2EB039B628CD9C66D57B4359C7EA6", hash_generated_method = "3A25439F4BB0217C6FEA131B643E0419")
    private void handleSmses(ArrayList messages) {
        int count = messages.size();
        {
            int i = 0;
            {
                byte[] ba = (byte[]) messages.get(i);
                {
                    int n = ba.length;
                    byte[] pdu = new byte[n - 1];
                    System.arraycopy(ba, 1, pdu, 0, n - 1);
                    SmsMessage message = SmsMessage.createFromPdu(pdu);
                    dispatchGsmMessage(message);
                    ba[0] = 1;
                    {
                        phone.getIccFileHandler().updateEFLinearFixed(EF_SMS,
                            i, ba, null, obtainMessage(EVENT_MARK_SMS_READ_DONE, i));
                    } //End block
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(messages.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.275 -0400", hash_original_method = "2DE8400081AD5D0DFDE4A5A335B40E41", hash_generated_method = "15D741D51610FD01EF0C6B9D8351E8E7")
    protected void onRecordLoaded() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        recordsToLoad -= 1;
        {
            onAllRecordsLoaded();
        } //End block
        {
            recordsToLoad = 0;
        } //End block
        // ---------- Original Method ----------
        //recordsToLoad -= 1;
        //if (recordsToLoad == 0 && recordsRequested == true) {
            //onAllRecordsLoaded();
        //} else if (recordsToLoad < 0) {
            //Log.e(LOG_TAG, "SIMRecords: recordsToLoad <0, programmer error suspected");
            //recordsToLoad = 0;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.276 -0400", hash_original_method = "66CB4A941BE4FC702CDC8E50BFF0F26C", hash_generated_method = "055036E05FF5744D28E05ED9E2BF3DCE")
    protected void onAllRecordsLoaded() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        Log.d(LOG_TAG, "SIMRecords: record load complete");
        String operator = getOperatorNumeric();
        phone.setSystemProperty(PROPERTY_ICC_OPERATOR_NUMERIC, operator);
        {
            phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ISO_COUNTRY,
                    MccTable.countryCodeForMcc(Integer.parseInt(imsi.substring(0,3))));
        } //End block
        setVoiceMailByCountry(operator);
        setSpnFromConfig(operator);
        recordsLoadedRegistrants.notifyRegistrants(
            new AsyncResult(null, null, null));
        phone.mIccCard.broadcastIccStateChangedIntent(
                SimCard.INTENT_VALUE_ICC_LOADED, null);
        // ---------- Original Method ----------
        //Log.d(LOG_TAG, "SIMRecords: record load complete");
        //String operator = getOperatorNumeric();
        //phone.setSystemProperty(PROPERTY_ICC_OPERATOR_NUMERIC, operator);
        //if (imsi != null) {
            //phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ISO_COUNTRY,
                    //MccTable.countryCodeForMcc(Integer.parseInt(imsi.substring(0,3))));
        //}
        //else {
            //Log.e("SIM", "[SIMRecords] onAllRecordsLoaded: imsi is NULL!");
        //}
        //setVoiceMailByCountry(operator);
        //setSpnFromConfig(operator);
        //recordsLoadedRegistrants.notifyRegistrants(
            //new AsyncResult(null, null, null));
        //phone.mIccCard.broadcastIccStateChangedIntent(
                //SimCard.INTENT_VALUE_ICC_LOADED, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.277 -0400", hash_original_method = "F5FC22B4152F67EB826E6610A6C9072B", hash_generated_method = "0ABB72C5A95B01F4F06EE096C3961E2C")
    private void setSpnFromConfig(String carrier) {
        {
            boolean var421905470EB904055FD073228F381009_687234600 = (mSpnOverride.containsCarrier(carrier));
            {
                spn = mSpnOverride.getSpn(carrier);
            } //End block
        } //End collapsed parenthetic
        addTaint(carrier.getTaint());
        // ---------- Original Method ----------
        //if (mSpnOverride.containsCarrier(carrier)) {
            //spn = mSpnOverride.getSpn(carrier);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.278 -0400", hash_original_method = "0A1C3646AC6E538340751C4EFB011D4A", hash_generated_method = "4B5DD787EAA14E40702454D2782D4911")
    private void setVoiceMailByCountry(String spn) {
        {
            boolean var78FA3AAD64E283DFCBDA5E9AF5AFA96F_835116859 = (mVmConfig.containsCarrier(spn));
            {
                isVoiceMailFixed = true;
                voiceMailNum = mVmConfig.getVoiceMailNumber(spn);
                voiceMailTag = mVmConfig.getVoiceMailTag(spn);
            } //End block
        } //End collapsed parenthetic
        addTaint(spn.getTaint());
        // ---------- Original Method ----------
        //if (mVmConfig.containsCarrier(spn)) {
            //isVoiceMailFixed = true;
            //voiceMailNum = mVmConfig.getVoiceMailNumber(spn);
            //voiceMailTag = mVmConfig.getVoiceMailTag(spn);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.280 -0400", hash_original_method = "9A96815ED791357C0C0DD55806DDDE67", hash_generated_method = "F27FE7CD305FE9A5DC0CE32EB9377D86")
    public void onSimReady() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        phone.mIccCard.broadcastIccStateChangedIntent(
                SimCard.INTENT_VALUE_ICC_READY, null);
        fetchSimRecords();
        // ---------- Original Method ----------
        //phone.mIccCard.broadcastIccStateChangedIntent(
                //SimCard.INTENT_VALUE_ICC_READY, null);
        //fetchSimRecords();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.281 -0400", hash_original_method = "267620266787F01EC9F0E5E0AE15B613", hash_generated_method = "440A40E7179FC91A15744508075743DC")
    protected void fetchSimRecords() {
        recordsRequested = true;
        IccFileHandler iccFh = phone.getIccFileHandler();
        phone.mCM.getIMSI(obtainMessage(EVENT_GET_IMSI_DONE));
        iccFh.loadEFTransparent(EF_ICCID, obtainMessage(EVENT_GET_ICCID_DONE));
        new AdnRecordLoader(phone).loadFromEF(EF_MSISDN, EF_EXT1, 1,
                    obtainMessage(EVENT_GET_MSISDN_DONE));
        iccFh.loadEFLinearFixed(EF_MBI, 1, obtainMessage(EVENT_GET_MBI_DONE));
        iccFh.loadEFTransparent(EF_AD, obtainMessage(EVENT_GET_AD_DONE));
        iccFh.loadEFLinearFixed(EF_MWIS, 1, obtainMessage(EVENT_GET_MWIS_DONE));
        iccFh.loadEFTransparent(
                EF_VOICE_MAIL_INDICATOR_CPHS,
                obtainMessage(EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE));
        iccFh.loadEFLinearFixed(EF_CFIS, 1, obtainMessage(EVENT_GET_CFIS_DONE));
        iccFh.loadEFTransparent(EF_CFF_CPHS, obtainMessage(EVENT_GET_CFF_DONE));
        getSpnFsm(true, null);
        iccFh.loadEFTransparent(EF_SPDI, obtainMessage(EVENT_GET_SPDI_DONE));
        iccFh.loadEFLinearFixed(EF_PNN, 1, obtainMessage(EVENT_GET_PNN_DONE));
        iccFh.loadEFTransparent(EF_SST, obtainMessage(EVENT_GET_SST_DONE));
        iccFh.loadEFTransparent(EF_INFO_CPHS, obtainMessage(EVENT_GET_INFO_CPHS_DONE));
        iccFh.loadEFTransparent(EF_CSP_CPHS,obtainMessage(EVENT_GET_CSP_CPHS_DONE));
        {
            iccFh.loadEFLinearFixedAll(EF_SMS, obtainMessage(EVENT_GET_ALL_SMS_DONE));
        } //End block
        {
            String sms = "0107912160130310f20404d0110041007030208054832b0120"
                         + "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
                         + "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
                         + "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
                         + "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
                         + "ffffffffffffffffffffffffffffff";
            byte[] ba = IccUtils.hexStringToBytes(sms);
            iccFh.updateEFLinearFixed(EF_SMS, 1, ba, null,
                            obtainMessage(EVENT_MARK_SMS_READ_DONE, 1));
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.281 -0400", hash_original_method = "409DDAA47064BEED68B0319934A64CD2", hash_generated_method = "9DAEDAF73B4A4D8FDCA55D6DE1E351EC")
    @Override
    public int getDisplayRule(String plmn) {
        int rule;
        {
            rule = SPN_RULE_SHOW_PLMN;
        } //End block
        {
            boolean var93D8A656618E8CC215C13DA82B4B7F6B_2045450016 = (isOnMatchingPlmn(plmn));
            {
                rule = SPN_RULE_SHOW_SPN;
                {
                    rule |= SPN_RULE_SHOW_PLMN;
                } //End block
            } //End block
            {
                rule = SPN_RULE_SHOW_PLMN;
                {
                    rule |= SPN_RULE_SHOW_SPN;
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(plmn.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1624317429 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1624317429;
        // ---------- Original Method ----------
        //int rule;
        //if (spn == null || spnDisplayCondition == -1) {
            //rule = SPN_RULE_SHOW_PLMN;
        //} else if (isOnMatchingPlmn(plmn)) {
            //rule = SPN_RULE_SHOW_SPN;
            //if ((spnDisplayCondition & 0x01) == 0x01) {
                //rule |= SPN_RULE_SHOW_PLMN;
            //}
        //} else {
            //rule = SPN_RULE_SHOW_PLMN;
            //if ((spnDisplayCondition & 0x02) == 0x00) {
                //rule |= SPN_RULE_SHOW_SPN;
            //}
        //}
        //return rule;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.291 -0400", hash_original_method = "94EB8BB16DAD2AA5FAF871DB9935C4E1", hash_generated_method = "29D26533AD0D6AF81ACC0A8DE2C7CF19")
    private boolean isOnMatchingPlmn(String plmn) {
        {
            boolean var0FF98638333814881B939E2E997568A8_1285237761 = (plmn.equals(getOperatorNumeric()));
        } //End collapsed parenthetic
        {
            {
                Iterator<String> var2DB1354A1A9DE1AE97AA82A80F522F26_630432573 = (spdiNetworks).iterator();
                var2DB1354A1A9DE1AE97AA82A80F522F26_630432573.hasNext();
                String spdiNet = var2DB1354A1A9DE1AE97AA82A80F522F26_630432573.next();
                {
                    {
                        boolean var41CE6775E09518F8198A5D804233075F_840953428 = (plmn.equals(spdiNet));
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(plmn.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1589429165 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1589429165;
        // ---------- Original Method ----------
        //if (plmn == null) return false;
        //if (plmn.equals(getOperatorNumeric())) {
            //return true;
        //}
        //if (spdiNetworks != null) {
            //for (String spdiNet : spdiNetworks) {
                //if (plmn.equals(spdiNet)) {
                    //return true;
                //}
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.293 -0400", hash_original_method = "CF95CAB3FC09F3005867C57538604F5A", hash_generated_method = "0694F46C0760348BD60538CF2BA8A465")
    private void getSpnFsm(boolean start, AsyncResult ar) {
        byte[] data;
        {
            spnState = Get_Spn_Fsm_State.INIT;
        } //End block
        //Begin case INIT 
        spn = null;
        //End case INIT 
        //Begin case INIT 
        phone.getIccFileHandler().loadEFTransparent( EF_SPN,
                        obtainMessage(EVENT_GET_SPN_DONE));
        //End case INIT 
        //Begin case INIT 
        spnState = Get_Spn_Fsm_State.READ_SPN_3GPP;
        //End case INIT 
        //Begin case READ_SPN_3GPP 
        {
            data = (byte[]) ar.result;
            spnDisplayCondition = 0xff & data[0];
            spn = IccUtils.adnStringFieldToString(data, 1, data.length - 1);
            log("Load EF_SPN: " + spn
                            + " spnDisplayCondition: " + spnDisplayCondition);
            phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ALPHA, spn);
            spnState = Get_Spn_Fsm_State.IDLE;
        } //End block
        {
            phone.getIccFileHandler().loadEFTransparent( EF_SPN_CPHS,
                            obtainMessage(EVENT_GET_SPN_DONE));
            spnState = Get_Spn_Fsm_State.READ_SPN_CPHS;
            spnDisplayCondition = -1;
        } //End block
        //End case READ_SPN_3GPP 
        //Begin case READ_SPN_CPHS 
        {
            data = (byte[]) ar.result;
            spn = IccUtils.adnStringFieldToString(
                            data, 0, data.length - 1 );
            log("Load EF_SPN_CPHS: " + spn);
            phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ALPHA, spn);
            spnState = Get_Spn_Fsm_State.IDLE;
        } //End block
        {
            phone.getIccFileHandler().loadEFTransparent(
                            EF_SPN_SHORT_CPHS, obtainMessage(EVENT_GET_SPN_DONE));
            spnState = Get_Spn_Fsm_State.READ_SPN_SHORT_CPHS;
        } //End block
        //End case READ_SPN_CPHS 
        //Begin case READ_SPN_SHORT_CPHS 
        {
            data = (byte[]) ar.result;
            spn = IccUtils.adnStringFieldToString(
                            data, 0, data.length - 1);
            log("Load EF_SPN_SHORT_CPHS: " + spn);
            phone.setSystemProperty(PROPERTY_ICC_OPERATOR_ALPHA, spn);
        } //End block
        {
            log("No SPN loaded in either CHPS or 3GPP");
        } //End block
        //End case READ_SPN_SHORT_CPHS 
        //Begin case READ_SPN_SHORT_CPHS 
        spnState = Get_Spn_Fsm_State.IDLE;
        //End case READ_SPN_SHORT_CPHS 
        //Begin case default 
        spnState = Get_Spn_Fsm_State.IDLE;
        //End case default 
        addTaint(start);
        addTaint(ar.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.294 -0400", hash_original_method = "2AE095A71557CBF993C4F4933FD42467", hash_generated_method = "99591E4D5B9A55B3AAF9C1955ACED425")
    private void parseEfSpdi(byte[] data) {
        SimTlv tlv = new SimTlv(data, 0, data.length);
        byte[] plmnEntries = null;
        {
            boolean varD6DAE705252AE64CA27B233F668D159C_597287392 = (tlv.isValidObject());
            tlv.nextObject();
            {
                {
                    boolean var06676F894B0CE0AFE5FFB22891957C33_530572213 = (tlv.getTag() == TAG_SPDI);
                    {
                        tlv = new SimTlv(tlv.getData(), 0, tlv.getData().length);
                    } //End block
                } //End collapsed parenthetic
                {
                    boolean var737E9541DB57851299264A8B92818535_1601551955 = (tlv.getTag() == TAG_SPDI_PLMN_LIST);
                    {
                        plmnEntries = tlv.getData();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        spdiNetworks = new ArrayList<String>(plmnEntries.length / 3);
        {
            int i = 0;
            i += 3;
            {
                String plmnCode;
                plmnCode = IccUtils.bcdToString(plmnEntries, i, 3);
                {
                    boolean var2A08EE5A8A72F3C48E7EDA0361A465D4_1837620797 = (plmnCode.length() >= 5);
                    {
                        log("EF_SPDI network: " + plmnCode);
                        spdiNetworks.add(plmnCode);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(data[0]);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.295 -0400", hash_original_method = "3EE42FFEB0B4A779D022FF2A029DBC31", hash_generated_method = "C9BC17C9B138CB806D6E74D3F458CB0E")
    private boolean isCphsMailboxEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1399925829 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1399925829;
        // ---------- Original Method ----------
        //if (mCphsInfo == null)  return false;
        //return ((mCphsInfo[1] & CPHS_SST_MBN_MASK) == CPHS_SST_MBN_ENABLED );
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.295 -0400", hash_original_method = "A8BE9816664C9DE6B42ACDFC7DA8D2D5", hash_generated_method = "80BD34BE1E1004B1AFCEA0216220D37A")
    protected void log(String s) {
        Log.d(LOG_TAG, "[SIMRecords] " + s);
        addTaint(s.getTaint());
        // ---------- Original Method ----------
        //Log.d(LOG_TAG, "[SIMRecords] " + s);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.296 -0400", hash_original_method = "747DCE9A0C1CA0D85263EB0A5CECAE60", hash_generated_method = "9369A1FBEE7E35E0523A47E129631C96")
    protected void loge(String s) {
        addTaint(s.getTaint());
        // ---------- Original Method ----------
        //Log.e(LOG_TAG, "[SIMRecords] " + s);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.296 -0400", hash_original_method = "545A7868DCB44F353BBAB91C69F027BF", hash_generated_method = "1F0140305939BCE44F5D3909A2443E7C")
    public boolean isCspPlmnEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_153257505 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_153257505;
        // ---------- Original Method ----------
        //return mCspPlmnEnabled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_method = "5509D297F6B8CC0BD321C284BD8D086E", hash_generated_method = "DFD224299304ECBB1ABC55273DB7E080")
    private void handleEfCspData(byte[] data) {
        int usedCspGroups = data.length / 2;
        byte valueAddedServicesGroup = (byte)0xC0;
        mCspPlmnEnabled = true;
        {
            int i = 0;
            {
                {
                    {
                        mCspPlmnEnabled = true;
                    } //End block
                    {
                        mCspPlmnEnabled = false;
                        phone.setNetworkSelectionModeAutomatic(null);
                    } //End block
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(data[0]);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    private enum Get_Spn_Fsm_State {
        IDLE,               
        INIT,               
        READ_SPN_3GPP,      
        READ_SPN_CPHS,      
        READ_SPN_SHORT_CPHS 
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_field = "41EBE7F32B96C1E2E9C209710486A443", hash_generated_field = "BD940BC52C3AB14198F71CB81F0E8FEB")

    protected static final String LOG_TAG = "GSM";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_field = "BD51237ADEE637D214609A89D91C6B3D", hash_generated_field = "B1BDA8481E03A540852BC755DA2091B9")

    private static final boolean CRASH_RIL = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_field = "A4622F7F72162611C8E075EE443BC26E", hash_generated_field = "5F5E7D64B04175B8FA820B2440F700FC")

    protected static final boolean DBG = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_field = "EFFB07E9493825FFF5E2ADA97E52DB66", hash_generated_field = "415E874A6EA7F4409F1FD3738AF676C5")

    static final int SPN_RULE_SHOW_SPN = 0x01;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_field = "F99FB3994E948E7784AB738BF033D56D", hash_generated_field = "9615ED2E5048F60365ECFB661BB5CFF2")

    static final int SPN_RULE_SHOW_PLMN = 0x02;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_field = "81FFA7042D4CD8556CFB9D17E2D56708", hash_generated_field = "A4822F16D7D0722C09B349753F0A1C53")

    static final int TAG_SPDI = 0xA3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_field = "5B55D09E701D389C1CD5414433547D53", hash_generated_field = "C2D6252AE5B1E2BC23E6E6BEB3130A64")

    static final int TAG_SPDI_PLMN_LIST = 0x80;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.297 -0400", hash_original_field = "EE4E9897FB11D4CA652E750FCA253418", hash_generated_field = "743085D93FE3601EDCC832FB91368066")

    static final int TAG_FULL_NETWORK_NAME = 0x43;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "A7C298598F035F582F2994CA0184ED57", hash_generated_field = "F9C22C8E909AE3B47754DE26713168A6")

    static final int TAG_SHORT_NETWORK_NAME = 0x45;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "A4DE335C8AB9D5CD22553519B84FC5E5", hash_generated_field = "F76787922EB6AA2178B7A042FE279FE9")

    static final int CFF_UNCONDITIONAL_ACTIVE = 0x0a;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "B0E74EF7AE31DF824A2D801FE88BE298", hash_generated_field = "E898789BE36EE5CC895C4580678DC3EE")

    static final int CFF_UNCONDITIONAL_DEACTIVE = 0x05;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "69BFCC7071EF603B4043F9190D9A95E1", hash_generated_field = "6D646CF1330D172C697FBE463F3E20DD")

    static final int CFF_LINE1_MASK = 0x0f;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "D32DF44EE00F04F24CD371F2B902BB93", hash_generated_field = "21B7855A8A75A6C0FBA7800A32927557")

    static final int CFF_LINE1_RESET = 0xf0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "42940E3334CBA3BAA9F1A0F7C2D979F2", hash_generated_field = "DED73EE7FF558B0A8BCE28EA6F50AA32")

    private static final int CPHS_SST_MBN_MASK = 0x30;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "0FA35357C28858D0DF2D19D905ED912E", hash_generated_field = "90E2112308FC996159B6715487610C17")

    private static final int CPHS_SST_MBN_ENABLED = 0x30;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "F15D5CBB2043757AB5313BDD33D4BBC7", hash_generated_field = "CA9D8FD5F6DA4FDAFDD2818A884111C6")

    private static final int EVENT_SIM_READY = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "B41D6834011DAA4DB1A6AC940ADFA38E", hash_generated_field = "C65DF4AD1462685EBC499AE583280BAA")

    private static final int EVENT_RADIO_OFF_OR_NOT_AVAILABLE = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "1C7B2408ABBFF84C0AE773B343AAE081", hash_generated_field = "C1B81CA82D779018C72F133549599B37")

    protected static final int EVENT_GET_IMSI_DONE = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "448E89735034CA52094210C2C3805091", hash_generated_field = "FA13D8118051BEADD1DF91D4EC1C2052")

    protected static final int EVENT_GET_ICCID_DONE = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "32C87913BB9A9B8C0E774950157E52E2", hash_generated_field = "AC488F40D96E33B7A9106EEA894C7BD2")

    private static final int EVENT_GET_MBI_DONE = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "3E3F251CEC6926A6D2E784E6B7DAAEF0", hash_generated_field = "EDE69B90FE5CC250E0B91ECDBE9DE9D1")

    private static final int EVENT_GET_MBDN_DONE = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "7248BB1DD465A3F59F510A80078BB34B", hash_generated_field = "1ABA989B0F3362D2C70EEB5A70C87F0D")

    private static final int EVENT_GET_MWIS_DONE = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "370CB56A39D5391291430562D9A723EE", hash_generated_field = "5165FAAB5F7CD18E9D5F96D2818657FA")

    private static final int EVENT_GET_VOICE_MAIL_INDICATOR_CPHS_DONE = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "C924AEAB30A16AD11ED99D61AA5708C4", hash_generated_field = "AF8D9BB0B036F882F1D0C816581372A7")

    protected static final int EVENT_GET_AD_DONE = 9;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "16E2029513C20709A62FF531D3DD5014", hash_generated_field = "7E6BDAACDB02FB8DBDE5B121D1D96B80")

    protected static final int EVENT_GET_MSISDN_DONE = 10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "31D8AABE5416BED99B19A990923D8C0E", hash_generated_field = "16316F56D2B66BC0712FA6DCCB623FD8")

    private static final int EVENT_GET_CPHS_MAILBOX_DONE = 11;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "BD1F2474793DBD794A60F38D867722DC", hash_generated_field = "A9380C4C24D6B84D11AA10394A8A4655")

    private static final int EVENT_GET_SPN_DONE = 12;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "6C5AAA199C42018DFEBF9DB3106941D8", hash_generated_field = "23B20EDB29F4E6ACE5BC6B6E3131138F")

    private static final int EVENT_GET_SPDI_DONE = 13;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "529053860FA14F8B31FBDEC20F5F5B03", hash_generated_field = "7C08F6997CDB1F95B53292AC6E4DA474")

    private static final int EVENT_UPDATE_DONE = 14;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "221898CECF6E8C9F50998ADFEF8B06D1", hash_generated_field = "A297125EDFFC4F42969DFEF4BE44F8AC")

    private static final int EVENT_GET_PNN_DONE = 15;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "1E3C0E257296800F8D76872CD2E55387", hash_generated_field = "9BD29131ACB6B8193EA3976774320615")

    protected static final int EVENT_GET_SST_DONE = 17;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "3B79516072415E285E9DD48ECF8C32E3", hash_generated_field = "9F464D691ED618E65FF918987EFF9274")

    private static final int EVENT_GET_ALL_SMS_DONE = 18;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.298 -0400", hash_original_field = "5EB21554FBD2F493FD526FF035BA3944", hash_generated_field = "961A7A4D60E11CE78834F70BC49A219A")

    private static final int EVENT_MARK_SMS_READ_DONE = 19;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "E456F51692CD77EC7FABB0627F1E741E", hash_generated_field = "F05CD6C947B2B1AA00E5D1063F179FDF")

    private static final int EVENT_SET_MBDN_DONE = 20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "7040E283E3C6429991BBA3AAE2DFC6BA", hash_generated_field = "32F13C0B04E96171B7B8D712BBC53B0A")

    private static final int EVENT_SMS_ON_SIM = 21;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "17E27DF4CEFFF43554FD32CB85BD7662", hash_generated_field = "18FB3B701347968BBB3DB68B7D9FA9E0")

    private static final int EVENT_GET_SMS_DONE = 22;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "3D7336F8F10AF2644854C342FE6A5B62", hash_generated_field = "778675A2DDF2BB258371DC2061683859")

    private static final int EVENT_GET_CFF_DONE = 24;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "60FC5DEEB2B572B1AF1F2074AB4AF616", hash_generated_field = "5818D0009EC83D0304F736A07B44ED18")

    private static final int EVENT_SET_CPHS_MAILBOX_DONE = 25;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "B179DBEA5D80A114C092309538D3A988", hash_generated_field = "8D3AD55D8107BA8230AA0810AF1F7304")

    private static final int EVENT_GET_INFO_CPHS_DONE = 26;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "E775C0820692BDD407C8D22F0A74404C", hash_generated_field = "BE715D1FD0CE243424B798654ACC75BA")

    private static final int EVENT_SET_MSISDN_DONE = 30;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "44F3B6DB71F91630605B5A6876BFD3A4", hash_generated_field = "0FDD8C86CA2531BA62F4A95521E434F5")

    private static final int EVENT_SIM_REFRESH = 31;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "4A3450DC04C4C053A9A850983E872C19", hash_generated_field = "F29A42DEBAB245F7C058BE162E7F91ED")

    private static final int EVENT_GET_CFIS_DONE = 32;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "B0A927A61DAD1AD86AB00D245EB2C803", hash_generated_field = "3DCE777E62AE6095ECB53822D16E8FE9")

    private static final int EVENT_GET_CSP_CPHS_DONE = 33;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:31.299 -0400", hash_original_field = "1B81364A8EB1E2266EAA74C0C5553905", hash_generated_field = "7E3BF9E363667067579B2DD88404B9BE")

    private static final String[] MCCMNC_CODES_HAVING_3DIGITS_MNC = {
        "405025", "405026", "405027", "405028", "405029", "405030", "405031", "405032",
        "405033", "405034", "405035", "405036", "405037", "405038", "405039", "405040",
        "405041", "405042", "405043", "405044", "405045", "405046", "405047", "405750",
        "405751", "405752", "405753", "405754", "405755", "405756", "405799", "405800",
        "405801", "405802", "405803", "405804", "405805", "405806", "405807", "405808",
        "405809", "405810", "405811", "405812", "405813", "405814", "405815", "405816",
        "405817", "405818", "405819", "405820", "405821", "405822", "405823", "405824",
        "405825", "405826", "405827", "405828", "405829", "405830", "405831", "405832",
        "405833", "405834", "405835", "405836", "405837", "405838", "405839", "405840",
        "405841", "405842", "405843", "405844", "405845", "405846", "405847", "405848",
        "405849", "405850", "405851", "405852", "405853", "405875", "405876", "405877",
        "405878", "405879", "405880", "405881", "405882", "405883", "405884", "405885",
        "405886", "405908", "405909", "405910", "405911", "405925", "405926", "405927",
        "405928", "405929", "405932"
    };
}

