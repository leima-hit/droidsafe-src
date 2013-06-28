package android.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.ArrayList;

public class PerformanceCollector {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.936 -0400", hash_original_field = "26B1BECD2B69E5E2482C90E44053F874", hash_generated_field = "2E6B5EF6C826CFAA09973D53DE7A3FDC")

    private PerformanceResultsWriter mPerfWriter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.936 -0400", hash_original_field = "F56D8DF10CDE273BA3E255F39F13F172", hash_generated_field = "C52DFF4EAE973D9A0B515C624EA1B572")

    private Bundle mPerfSnapshot;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.937 -0400", hash_original_field = "B2F8741A25C92C24321EFB211D7A9F2F", hash_generated_field = "A49B1FB08B88F40C1B360A21064E1B7D")

    private Bundle mPerfMeasurement;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.937 -0400", hash_original_field = "E47DA2E554A0F2C240AA4109C059F740", hash_generated_field = "BC16E2E92895711EBE19B0CBACC641DD")

    private long mSnapshotCpuTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.937 -0400", hash_original_field = "3823F7810BE7F2B3AF183A2660FD72D5", hash_generated_field = "C5F0C15458BC4B393B0CAA896E7D06F7")

    private long mSnapshotExecTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.937 -0400", hash_original_field = "D03EB05E72794ED3F35FA7ECCF219879", hash_generated_field = "79EEABA38A66B76B3AF5F1D6CF746428")

    private long mCpuTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.937 -0400", hash_original_field = "7A4A16A760CF6072CBA3700F7C779B0E", hash_generated_field = "1D443F14238FC42E629544415CC62589")

    private long mExecTime;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.937 -0400", hash_original_method = "405D2609A0193176D2AFC5D34E96663C", hash_generated_method = "3B2002EB63933A95B11D5472AF645642")
    public  PerformanceCollector() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.937 -0400", hash_original_method = "9149F2AAE94E2FF1A90DA44ADCB7F1A5", hash_generated_method = "A802B281B59E5150D58C823C44ACAF07")
    public  PerformanceCollector(PerformanceResultsWriter writer) {
        setPerformanceResultsWriter(writer);
        addTaint(writer.getTaint());
        // ---------- Original Method ----------
        //setPerformanceResultsWriter(writer);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.937 -0400", hash_original_method = "37F3C4CB00E2065177941F440A1EB96E", hash_generated_method = "B9C8894AFEBF94656C66FAA8B38F355F")
    public void setPerformanceResultsWriter(PerformanceResultsWriter writer) {
        mPerfWriter = writer;
        // ---------- Original Method ----------
        //mPerfWriter = writer;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.938 -0400", hash_original_method = "29FF8CD15679E582F927741D3542D4F3", hash_generated_method = "62612DB9A0A84EA4A9FDB7B42CF65D97")
    public void beginSnapshot(String label) {
        mPerfWriter.writeBeginSnapshot(label);
        startPerformanceSnapshot();
        addTaint(label.getTaint());
        // ---------- Original Method ----------
        //if (mPerfWriter != null)
            //mPerfWriter.writeBeginSnapshot(label);
        //startPerformanceSnapshot();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.938 -0400", hash_original_method = "6B502666465A4C791D4C2AED784D2CB8", hash_generated_method = "9629ED59DD1CE15CDB311427C7BDA018")
    public Bundle endSnapshot() {
        Bundle varB4EAC82CA7396A68D541C85D26508E83_1394867855 = null; //Variable for return #1
        endPerformanceSnapshot();
        mPerfWriter.writeEndSnapshot(mPerfSnapshot);
        varB4EAC82CA7396A68D541C85D26508E83_1394867855 = mPerfSnapshot;
        varB4EAC82CA7396A68D541C85D26508E83_1394867855.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1394867855;
        // ---------- Original Method ----------
        //endPerformanceSnapshot();
        //if (mPerfWriter != null)
            //mPerfWriter.writeEndSnapshot(mPerfSnapshot);
        //return mPerfSnapshot;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.939 -0400", hash_original_method = "15BE0BB59194B3FBDF2799231E5E71EE", hash_generated_method = "6EC2430CB55C1C0E45B152F11CDB8646")
    public void startTiming(String label) {
        mPerfWriter.writeStartTiming(label);
        mPerfMeasurement = new Bundle();
        mPerfMeasurement.putParcelableArrayList(
                METRIC_KEY_ITERATIONS, new ArrayList<Parcelable>());
        mExecTime = SystemClock.uptimeMillis();
        mCpuTime = Process.getElapsedCpuTime();
        addTaint(label.getTaint());
        // ---------- Original Method ----------
        //if (mPerfWriter != null)
            //mPerfWriter.writeStartTiming(label);
        //mPerfMeasurement = new Bundle();
        //mPerfMeasurement.putParcelableArrayList(
                //METRIC_KEY_ITERATIONS, new ArrayList<Parcelable>());
        //mExecTime = SystemClock.uptimeMillis();
        //mCpuTime = Process.getElapsedCpuTime();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.941 -0400", hash_original_method = "9C0B776255C5FFA271DF9EC0789087D7", hash_generated_method = "A500E485AF7AA1022E75EF18CA9227E5")
    public Bundle addIteration(String label) {
        Bundle varB4EAC82CA7396A68D541C85D26508E83_1983916701 = null; //Variable for return #1
        mCpuTime = Process.getElapsedCpuTime() - mCpuTime;
        mExecTime = SystemClock.uptimeMillis() - mExecTime;
        Bundle iteration = new Bundle();
        iteration.putString(METRIC_KEY_LABEL, label);
        iteration.putLong(METRIC_KEY_EXECUTION_TIME, mExecTime);
        iteration.putLong(METRIC_KEY_CPU_TIME, mCpuTime);
        mPerfMeasurement.getParcelableArrayList(METRIC_KEY_ITERATIONS).add(iteration);
        mExecTime = SystemClock.uptimeMillis();
        mCpuTime = Process.getElapsedCpuTime();
        varB4EAC82CA7396A68D541C85D26508E83_1983916701 = iteration;
        addTaint(label.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1983916701.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1983916701;
        // ---------- Original Method ----------
        //mCpuTime = Process.getElapsedCpuTime() - mCpuTime;
        //mExecTime = SystemClock.uptimeMillis() - mExecTime;
        //Bundle iteration = new Bundle();
        //iteration.putString(METRIC_KEY_LABEL, label);
        //iteration.putLong(METRIC_KEY_EXECUTION_TIME, mExecTime);
        //iteration.putLong(METRIC_KEY_CPU_TIME, mCpuTime);
        //mPerfMeasurement.getParcelableArrayList(METRIC_KEY_ITERATIONS).add(iteration);
        //mExecTime = SystemClock.uptimeMillis();
        //mCpuTime = Process.getElapsedCpuTime();
        //return iteration;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.942 -0400", hash_original_method = "CE19881A0670EADF6F440246450D4521", hash_generated_method = "D73619D8357D3898E79F700314224C2F")
    public Bundle stopTiming(String label) {
        Bundle varB4EAC82CA7396A68D541C85D26508E83_548055083 = null; //Variable for return #1
        addIteration(label);
        mPerfWriter.writeStopTiming(mPerfMeasurement);
        varB4EAC82CA7396A68D541C85D26508E83_548055083 = mPerfMeasurement;
        addTaint(label.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_548055083.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_548055083;
        // ---------- Original Method ----------
        //addIteration(label);
        //if (mPerfWriter != null)
            //mPerfWriter.writeStopTiming(mPerfMeasurement);
        //return mPerfMeasurement;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.942 -0400", hash_original_method = "F7662CC60D6C37C7D8E6A983FE816D6B", hash_generated_method = "36008E85AAA9DC2B582EB96CECFF7EBD")
    public void addMeasurement(String label, long value) {
        mPerfWriter.writeMeasurement(label, value);
        addTaint(label.getTaint());
        addTaint(value);
        // ---------- Original Method ----------
        //if (mPerfWriter != null)
            //mPerfWriter.writeMeasurement(label, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.943 -0400", hash_original_method = "D91873E003245DBC7EFC93D07019AB08", hash_generated_method = "0E64F983BC29A5CC30FD04281B510E04")
    public void addMeasurement(String label, float value) {
        mPerfWriter.writeMeasurement(label, value);
        addTaint(label.getTaint());
        addTaint(value);
        // ---------- Original Method ----------
        //if (mPerfWriter != null)
            //mPerfWriter.writeMeasurement(label, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.943 -0400", hash_original_method = "8B4722495479149E3D93BD2C6D69D7B4", hash_generated_method = "1648E68AE180CC1088887FF8D4A5BADD")
    public void addMeasurement(String label, String value) {
        mPerfWriter.writeMeasurement(label, value);
        addTaint(label.getTaint());
        addTaint(value.getTaint());
        // ---------- Original Method ----------
        //if (mPerfWriter != null)
            //mPerfWriter.writeMeasurement(label, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.948 -0400", hash_original_method = "1B503104185A94AFFC2FCF84AFCEABAE", hash_generated_method = "B1B1AF37462F5629FC5CE89FC93AE142")
    private void startPerformanceSnapshot() {
        mPerfSnapshot = new Bundle();
        Bundle binderCounts = getBinderCounts();
        {
            Iterator<String> varC1F757575F721DB498F3C05BE0B52083_2042529006 = (binderCounts.keySet()).iterator();
            varC1F757575F721DB498F3C05BE0B52083_2042529006.hasNext();
            String key = varC1F757575F721DB498F3C05BE0B52083_2042529006.next();
            {
                mPerfSnapshot.putLong("pre_" + key, binderCounts.getLong(key));
            } //End block
        } //End collapsed parenthetic
        startAllocCounting();
        mSnapshotExecTime = SystemClock.uptimeMillis();
        mSnapshotCpuTime = Process.getElapsedCpuTime();
        // ---------- Original Method ----------
        //mPerfSnapshot = new Bundle();
        //Bundle binderCounts = getBinderCounts();
        //for (String key : binderCounts.keySet()) {
            //mPerfSnapshot.putLong("pre_" + key, binderCounts.getLong(key));
        //}
        //startAllocCounting();
        //mSnapshotExecTime = SystemClock.uptimeMillis();
        //mSnapshotCpuTime = Process.getElapsedCpuTime();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.963 -0400", hash_original_method = "41A01DA3C680B16D19143811CC413B1E", hash_generated_method = "1222B036B696D73E7688AA7B1FEA79F3")
    private void endPerformanceSnapshot() {
        mSnapshotCpuTime = Process.getElapsedCpuTime() - mSnapshotCpuTime;
        mSnapshotExecTime = SystemClock.uptimeMillis() - mSnapshotExecTime;
        stopAllocCounting();
        long nativeMax = Debug.getNativeHeapSize() / 1024;
        long nativeAllocated = Debug.getNativeHeapAllocatedSize() / 1024;
        long nativeFree = Debug.getNativeHeapFreeSize() / 1024;
        Debug.MemoryInfo memInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memInfo);
        Runtime runtime = Runtime.getRuntime();
        long dalvikMax = runtime.totalMemory() / 1024;
        long dalvikFree = runtime.freeMemory() / 1024;
        long dalvikAllocated = dalvikMax - dalvikFree;
        Bundle binderCounts = getBinderCounts();
        {
            Iterator<String> varC1F757575F721DB498F3C05BE0B52083_882604732 = (binderCounts.keySet()).iterator();
            varC1F757575F721DB498F3C05BE0B52083_882604732.hasNext();
            String key = varC1F757575F721DB498F3C05BE0B52083_882604732.next();
            {
                mPerfSnapshot.putLong(key, binderCounts.getLong(key));
            } //End block
        } //End collapsed parenthetic
        Bundle allocCounts = getAllocCounts();
        {
            Iterator<String> var2BBFB4C3EA5780E4017714F0682556AF_1478463710 = (allocCounts.keySet()).iterator();
            var2BBFB4C3EA5780E4017714F0682556AF_1478463710.hasNext();
            String key = var2BBFB4C3EA5780E4017714F0682556AF_1478463710.next();
            {
                mPerfSnapshot.putLong(key, allocCounts.getLong(key));
            } //End block
        } //End collapsed parenthetic
        mPerfSnapshot.putLong(METRIC_KEY_EXECUTION_TIME, mSnapshotExecTime);
        mPerfSnapshot.putLong(METRIC_KEY_CPU_TIME, mSnapshotCpuTime);
        mPerfSnapshot.putLong(METRIC_KEY_NATIVE_SIZE, nativeMax);
        mPerfSnapshot.putLong(METRIC_KEY_NATIVE_ALLOCATED, nativeAllocated);
        mPerfSnapshot.putLong(METRIC_KEY_NATIVE_FREE, nativeFree);
        mPerfSnapshot.putLong(METRIC_KEY_NATIVE_PSS, memInfo.nativePss);
        mPerfSnapshot.putLong(METRIC_KEY_NATIVE_PRIVATE_DIRTY, memInfo.nativePrivateDirty);
        mPerfSnapshot.putLong(METRIC_KEY_NATIVE_SHARED_DIRTY, memInfo.nativeSharedDirty);
        mPerfSnapshot.putLong(METRIC_KEY_JAVA_SIZE, dalvikMax);
        mPerfSnapshot.putLong(METRIC_KEY_JAVA_ALLOCATED, dalvikAllocated);
        mPerfSnapshot.putLong(METRIC_KEY_JAVA_FREE, dalvikFree);
        mPerfSnapshot.putLong(METRIC_KEY_JAVA_PSS, memInfo.dalvikPss);
        mPerfSnapshot.putLong(METRIC_KEY_JAVA_PRIVATE_DIRTY, memInfo.dalvikPrivateDirty);
        mPerfSnapshot.putLong(METRIC_KEY_JAVA_SHARED_DIRTY, memInfo.dalvikSharedDirty);
        mPerfSnapshot.putLong(METRIC_KEY_OTHER_PSS, memInfo.otherPss);
        mPerfSnapshot.putLong(METRIC_KEY_OTHER_PRIVATE_DIRTY, memInfo.otherPrivateDirty);
        mPerfSnapshot.putLong(METRIC_KEY_OTHER_SHARED_DIRTY, memInfo.otherSharedDirty);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    private static void startAllocCounting() {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();
        Debug.resetAllCounts();
        Debug.startAllocCounting();
    }

    
    private static void stopAllocCounting() {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();
        Debug.stopAllocCounting();
    }

    
    private static Bundle getAllocCounts() {
        Bundle results = new Bundle();
        results.putLong(METRIC_KEY_GLOBAL_ALLOC_COUNT, Debug.getGlobalAllocCount());
        results.putLong(METRIC_KEY_GLOBAL_ALLOC_SIZE, Debug.getGlobalAllocSize());
        results.putLong(METRIC_KEY_GLOBAL_FREED_COUNT, Debug.getGlobalFreedCount());
        results.putLong(METRIC_KEY_GLOBAL_FREED_SIZE, Debug.getGlobalFreedSize());
        results.putLong(METRIC_KEY_GC_INVOCATION_COUNT, Debug.getGlobalGcInvocationCount());
        return results;
    }

    
    private static Bundle getBinderCounts() {
        Bundle results = new Bundle();
        results.putLong(METRIC_KEY_SENT_TRANSACTIONS, Debug.getBinderSentTransactions());
        results.putLong(METRIC_KEY_RECEIVED_TRANSACTIONS, Debug.getBinderReceivedTransactions());
        return results;
    }

    
    public interface PerformanceResultsWriter {

        
        public void writeBeginSnapshot(String label);

        
        public void writeEndSnapshot(Bundle results);

        
        public void writeStartTiming(String label);

        
        public void writeStopTiming(Bundle results);

        
        public void writeMeasurement(String label, long value);

        
        public void writeMeasurement(String label, float value);

        
        public void writeMeasurement(String label, String value);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "4AA7423E0EF8AD492600470D4830B61A", hash_generated_field = "1D7890C1BD5FA236C5D0FD55992B18CF")

    public static final String METRIC_KEY_ITERATIONS = "iterations";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "A4BF6DAAC65C8B13DBC26761521A3D45", hash_generated_field = "86E70D28A98D79A6D6F47C72F3222FE8")

    public static final String METRIC_KEY_LABEL = "label";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "3B5F409C9B3C40110376EF4BA546C026", hash_generated_field = "77B6548FC4B73EB3ADF155FC60C0D532")

    public static final String METRIC_KEY_CPU_TIME = "cpu_time";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "DE48205C4490C3DFE74D5A33121346C8", hash_generated_field = "4C812288505951DC5D7BE4B66E572C74")

    public static final String METRIC_KEY_EXECUTION_TIME = "execution_time";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "E4F7C31BBE866A93D6F79F447456205E", hash_generated_field = "F9C012B372C48271470C88B3ECB1971F")

    public static final String METRIC_KEY_PRE_RECEIVED_TRANSACTIONS = "pre_received_transactions";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "1DF70367C6DEAAE6B8005D9A8D3123A1", hash_generated_field = "5409646691D7EB77F28FB72511989A7B")

    public static final String METRIC_KEY_PRE_SENT_TRANSACTIONS = "pre_sent_transactions";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "5038F9E48B332F3B29C71053D98F7FF8", hash_generated_field = "DC558879723642FA47D1968D4255A1C3")

    public static final String METRIC_KEY_RECEIVED_TRANSACTIONS = "received_transactions";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "38709508B2AE5A4FC7272D427C266E20", hash_generated_field = "BD6B8CEA268DF487B24116A56395CDD0")

    public static final String METRIC_KEY_SENT_TRANSACTIONS = "sent_transactions";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "0C7DEF4541150AB397BE2D2757F8F468", hash_generated_field = "A2AA92FFB88183B4F24057311349ED58")

    public static final String METRIC_KEY_GC_INVOCATION_COUNT = "gc_invocation_count";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "B94F19AD21346A2ECC0EDF8CECD346EF", hash_generated_field = "3BE2D32F7E26E9BD224D27B30715DE91")

    public static final String METRIC_KEY_JAVA_ALLOCATED = "java_allocated";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "9667C8A6AD0F2861C273CC0C348AF17F", hash_generated_field = "5A283F60187263FA3CECC1DD5773CFBC")

    public static final String METRIC_KEY_JAVA_FREE = "java_free";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "F384A9636FDD22E82ADA80C8223347F4", hash_generated_field = "1D289C5644FA9767C2E31DD49F0EDE9C")

    public static final String METRIC_KEY_JAVA_PRIVATE_DIRTY = "java_private_dirty";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "2E510C7B84A8D918D8210CA9E1B7AAE2", hash_generated_field = "80ACA2CC85B0F985638C7AD424E753BD")

    public static final String METRIC_KEY_JAVA_PSS = "java_pss";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "92BFDD0CB11862D197337DD2430B964D", hash_generated_field = "771DB8E8D936FEF928A6689C9F56F28E")

    public static final String METRIC_KEY_JAVA_SHARED_DIRTY = "java_shared_dirty";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "892357894B5E6AF471DE5BA16D60C453", hash_generated_field = "A2B7475836759D50B19B1BAABC8470B0")

    public static final String METRIC_KEY_JAVA_SIZE = "java_size";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "7A0A366A51EA9F177A58F7AD2A7EB9C8", hash_generated_field = "9FCCDC80F37FDA149843B665F88B02B4")

    public static final String METRIC_KEY_NATIVE_ALLOCATED = "native_allocated";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "E8D4B73DA457F79BACBDD7F233B8C41B", hash_generated_field = "672D9746FA921B21491CD569E29859DD")

    public static final String METRIC_KEY_NATIVE_FREE = "native_free";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "E4B7D6A8ED4311BC004F88001F27387F", hash_generated_field = "DD95072F63E3D5208F19F7BFFCEB7AC0")

    public static final String METRIC_KEY_NATIVE_PRIVATE_DIRTY = "native_private_dirty";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "63841C35E772F3A57CB6DB926510D858", hash_generated_field = "E42F6602BEA2FE75D3F5AEF606D6C08C")

    public static final String METRIC_KEY_NATIVE_PSS = "native_pss";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "B8B86646A3A1E735C18DBD79CC455F48", hash_generated_field = "6CE2FD1E3E12963FEB9E78BA78A8A67B")

    public static final String METRIC_KEY_NATIVE_SHARED_DIRTY = "native_shared_dirty";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "63FC16B2516E9E5691D31D00F2334091", hash_generated_field = "49E99AC048E613E8191A91BC78FAE993")

    public static final String METRIC_KEY_NATIVE_SIZE = "native_size";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "67DE58CF0080CCCECC4AC68E871AB879", hash_generated_field = "AE96E4BEBF83CC3706569C9EB8F76FF7")

    public static final String METRIC_KEY_GLOBAL_ALLOC_COUNT = "global_alloc_count";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "88EBD552BA88367E7666E568A7C3A6AB", hash_generated_field = "4EE641C2D656B628ABAC8495CF18A8DD")

    public static final String METRIC_KEY_GLOBAL_ALLOC_SIZE = "global_alloc_size";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "ED39E41FE4EAC053D7DDD1FAB6FEE9A0", hash_generated_field = "A58EBCA1F6AE94437D14AFAE9C39B726")

    public static final String METRIC_KEY_GLOBAL_FREED_COUNT = "global_freed_count";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "FE6ABCB4B1BB6B3B1DE581A432045AB9", hash_generated_field = "0914CF9C312CD253CD765DCC71D122F9")

    public static final String METRIC_KEY_GLOBAL_FREED_SIZE = "global_freed_size";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "D818CAF628AFDC07D316B3E895CF982E", hash_generated_field = "581412CDC2C6ECB9CE0B4F204B43C2DF")

    public static final String METRIC_KEY_OTHER_PRIVATE_DIRTY = "other_private_dirty";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "BEAFB15ECB1B2B7DABF0CA892AA6D783", hash_generated_field = "7C88A8007679EADC984537E1CAFCE6AD")

    public static final String METRIC_KEY_OTHER_PSS = "other_pss";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:42.965 -0400", hash_original_field = "22C5C5519A5F1FB29DF20DF0FA1BFA73", hash_generated_field = "ED3F38BBCD9CD55DE2C91BBBF176A48C")

    public static final String METRIC_KEY_OTHER_SHARED_DIRTY = "other_shared_dirty";
}

