package com.android.internal.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

public class PkgUsageStats implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.663 -0400", hash_original_field = "387F1FA6FC99B8AE187C010A06120611", hash_generated_field = "AEA3D3739F492530AF8FD6582FAACBD9")

    public String packageName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.663 -0400", hash_original_field = "3A4579DD5A75D9BC0DEC11BAFC438A94", hash_generated_field = "21C854B78D53D6B68A5B48894136FE57")

    public int launchCount;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.663 -0400", hash_original_field = "E08E32FB1F41649AE793251F1549D37B", hash_generated_field = "BFFCAFFF5EF37FB71EBEED00E2451831")

    public long usageTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.663 -0400", hash_original_field = "FD867455D142EC9EB6FD4534D136FBD7", hash_generated_field = "DD071BE2371A95289920DCB4558946CA")

    public Map<String, Long> componentResumeTimes;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.664 -0400", hash_original_method = "EF5295BC011C50A8405086A4DA12DD9D", hash_generated_method = "15308FF3E0EA4BA885D7C451911F544E")
    public  PkgUsageStats(String pkgName, int count, long time, Map<String, Long> lastResumeTimes) {
        packageName = pkgName;
        launchCount = count;
        usageTime = time;
        componentResumeTimes = new HashMap<String, Long>(lastResumeTimes);
        // ---------- Original Method ----------
        //packageName = pkgName;
        //launchCount = count;
        //usageTime = time;
        //componentResumeTimes = new HashMap<String, Long>(lastResumeTimes);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.664 -0400", hash_original_method = "977D0617B4C179661ACE3B4403E55D28", hash_generated_method = "3B232E618D43059A45AB3100F7DED02E")
    public  PkgUsageStats(Parcel source) {
        packageName = source.readString();
        launchCount = source.readInt();
        usageTime = source.readLong();
        final int N = source.readInt();
        componentResumeTimes = new HashMap<String, Long>(N);
        {
            int i = 0;
            {
                String component = source.readString();
                long lastResumeTime = source.readLong();
                componentResumeTimes.put(component, lastResumeTime);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //packageName = source.readString();
        //launchCount = source.readInt();
        //usageTime = source.readLong();
        //final int N = source.readInt();
        //componentResumeTimes = new HashMap<String, Long>(N);
        //for (int i = 0; i < N; i++) {
            //String component = source.readString();
            //long lastResumeTime = source.readLong();
            //componentResumeTimes.put(component, lastResumeTime);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.665 -0400", hash_original_method = "9D74B058D8C14276F2F5A28106414DA9", hash_generated_method = "63D83B0D430410C4CCE030F330A1E270")
    public  PkgUsageStats(PkgUsageStats pStats) {
        packageName = pStats.packageName;
        launchCount = pStats.launchCount;
        usageTime = pStats.usageTime;
        componentResumeTimes = new HashMap<String, Long>(pStats.componentResumeTimes);
        // ---------- Original Method ----------
        //packageName = pStats.packageName;
        //launchCount = pStats.launchCount;
        //usageTime = pStats.usageTime;
        //componentResumeTimes = new HashMap<String, Long>(pStats.componentResumeTimes);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.665 -0400", hash_original_method = "5A8FDC802D15BADB218E7B9A38048A4B", hash_generated_method = "18C02651BAA35930F448BF0D1496797D")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_2084350346 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2084350346 = "PkgUsageStats{"
        + Integer.toHexString(System.identityHashCode(this))
        + " " + packageName + "}";
        varB4EAC82CA7396A68D541C85D26508E83_2084350346.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2084350346;
        // ---------- Original Method ----------
        //return "PkgUsageStats{"
        //+ Integer.toHexString(System.identityHashCode(this))
        //+ " " + packageName + "}";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.665 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "94A8F4BBC822C8EAB404077B03E44048")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1137903696 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1137903696;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.670 -0400", hash_original_method = "65B01222074C1BC4168423427126F9FB", hash_generated_method = "57D69C9162C7B4FB5F3858F86E2B9941")
    public void writeToParcel(Parcel dest, int parcelableFlags) {
        dest.writeString(packageName);
        dest.writeInt(launchCount);
        dest.writeLong(usageTime);
        dest.writeInt(componentResumeTimes.size());
        {
            Iterator<Map.Entry<String, Long>> var88FC42210E06D35F3FD471E41D5B26EC_1984565224 = (componentResumeTimes.entrySet()).iterator();
            var88FC42210E06D35F3FD471E41D5B26EC_1984565224.hasNext();
            Map.Entry<String, Long> ent = var88FC42210E06D35F3FD471E41D5B26EC_1984565224.next();
            {
                dest.writeString(ent.getKey());
                dest.writeLong(ent.getValue());
            } //End block
        } //End collapsed parenthetic
        addTaint(dest.getTaint());
        addTaint(parcelableFlags);
        // ---------- Original Method ----------
        //dest.writeString(packageName);
        //dest.writeInt(launchCount);
        //dest.writeLong(usageTime);
        //dest.writeInt(componentResumeTimes.size());
        //for (Map.Entry<String, Long> ent : componentResumeTimes.entrySet()) {
            //dest.writeString(ent.getKey());
            //dest.writeLong(ent.getValue());
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:19.670 -0400", hash_original_field = "A6B7AD8516005FC7EA17662B9B408CF5", hash_generated_field = "65B1A44C53F3FF61EDA70C7F983455D7")

    public static final Parcelable.Creator<PkgUsageStats> CREATOR
    = new Parcelable.Creator<PkgUsageStats>() {
        public PkgUsageStats createFromParcel(Parcel in) {
            return new PkgUsageStats(in);
        }

        public PkgUsageStats[] newArray(int size) {
            return new PkgUsageStats[size];
        }
    };
    // orphaned legacy method
    public PkgUsageStats createFromParcel(Parcel in) {
            return new PkgUsageStats(in);
        }
    
    // orphaned legacy method
    public PkgUsageStats[] newArray(int size) {
            return new PkgUsageStats[size];
        }
    
}

