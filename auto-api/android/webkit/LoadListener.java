package android.webkit;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ParseException;
import android.net.Uri;
import android.net.WebAddress;
import android.net.http.EventHandler;
import android.net.http.Headers;
import android.net.http.HttpAuthHeader;
import android.net.http.RequestHandle;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.webkit.CacheManager.CacheResult;
import android.webkit.JniUtil;
import com.android.internal.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class LoadListener extends Handler implements EventHandler {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "1F82295670D8C49C778553291F467693", hash_generated_field = "C2ADEC4B7675869DD34EF84CA5DC8ADA")

    private final ByteArrayBuilder mDataBuilder = new ByteArrayBuilder();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "8299C83E9CFFA2EF5909444648349221", hash_generated_field = "9C2E85EC79E8F8349BF2E81BA4AC7991")

    private String mUrl;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "5FBE3730DCFF234F97B15868D5CE649D", hash_generated_field = "93793E19832E1B2CEA9B3AE18495201F")

    private WebAddress mUri;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "5CE6426C79F06E218F426F0E1851F643", hash_generated_field = "632697020547475B21783FF9A242BA30")

    private boolean mPermanent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "C71E6F27982C162E3D48504B7CE95EEE", hash_generated_field = "568234C9B8DA241BFA5B09B8101F8B12")

    private String mOriginalUrl;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "51EF5995AD6B82C50AE546C1599EFFFA", hash_generated_field = "C458E619396054F78BC926FB81B4386D")

    private Context mContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "210C1862D81E3FCC2FD87A83EA255D40", hash_generated_field = "076F5BF2A47D119E2704BFAF413B4749")

    private BrowserFrame mBrowserFrame;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "8B6CED6C3251DC4BFDDBC4CCDF1CAA54", hash_generated_field = "CFE8D432F2D30F6D44FDB0D4F89E9956")

    private int mNativeLoader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "FA38F1960A45A7EC16349AAF783A80BC", hash_generated_field = "D6D2783B71AE4BF9CBF84D44336E2BF9")

    private String mMimeType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "FF7D0B646B2C057679C99D4079D890AA", hash_generated_field = "98F3D6B51351657C10385D44B0C0054D")

    private String mEncoding;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "2DF3ED20DD5FCAD4BBC54FFEAFD60E5D", hash_generated_field = "5B5A898734AC0BC3BD56BC7A1B09A1AA")

    private String mTransferEncoding;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "7948B1EFB4AE211035F97F99CDB6078C", hash_generated_field = "A03B65E05BCBAEC5D04E36F3DA55AA89")

    private int mStatusCode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "E376B2491257EB4CB20B17AAF2E5520C", hash_generated_field = "8308E02599DA7B9492281855AF586F6A")

    private String mStatusText;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "D4BC2D0F0185C97879D7062C4CEFD633", hash_generated_field = "1ACBF6AD05D624BD330C1EA27911AFED")

    public long mContentLength;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "1813307BAF5C3869F23F1AC0318DE4BE", hash_generated_field = "582F041564D3B399F48E8AE230C16FEE")

    private boolean mCancelled;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.149 -0400", hash_original_field = "0191A284F8F26AE941D84E8E2ADF5731", hash_generated_field = "11E3D87CDBCDF8F27F5BCF75E88255E5")

    private boolean mAuthFailed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "6C485DBF404EED3828D28EAB5B75583E", hash_generated_field = "7D2D2225EC07E109A425BA1C9069B594")

    private CacheLoader mCacheLoader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "F48561BA425AAC50D6E8B7A4F82555FB", hash_generated_field = "7BD10F8B23449D67AF64947251567443")

    private boolean mFromCache = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "D88F8961E896B36F45BC65C0E5C94B4F", hash_generated_field = "F92F68007E24C2007F5E8613B464C2BA")

    private HttpAuthHeader mAuthHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "16DE1F4FBED47663F1B008C927D7B64E", hash_generated_field = "CFF6FAF13B4D5230E9FF26C0A80758BB")

    private int mErrorID = OK;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "4B18E53CCE831597CAE997F39A2FB253", hash_generated_field = "9A2F4E95853CE87C657553938570C697")

    private String mErrorDescription;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "99A9A437E48C76D1556026A0A85B5820", hash_generated_field = "260FF327C4645479FF5E5DCF19E349AD")

    private SslError mSslError;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "8F2BBF6B97D2E4DAE439A5022B5DBE41", hash_generated_field = "D2C086119AFB2A8257E7CAD619AFA47F")

    private RequestHandle mRequestHandle;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "049D0917259EC924AF2E8D101BAF0656", hash_generated_field = "1D3366ACEEB83C50B8FD0D2EE0AAAE40")

    private RequestHandle mSslErrorRequestHandle;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "326FAE0022967BEB3C583F6C15C54AA4", hash_generated_field = "B0E361E4F3B0293B8C4D8932D9873B39")

    private long mPostIdentifier;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "428D706CEC47D9F07779621FC1626C5A", hash_generated_field = "E5EA8984DD22A9073BFFEAE2B245DF81")

    private boolean mSetNativeResponse;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "411D2DFDB93368C46AFADBEC76A54162", hash_generated_field = "46D356CEC2B798E53528C0BD5F09C873")

    private String mMethod;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "0A064CD66C89784C0961CEF3F748A30D", hash_generated_field = "223EBD1E69C1299B02B1F1776461294B")

    private Map<String, String> mRequestHeaders;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "AF86FBE15EC2C25B16B35C7E4DD756CA", hash_generated_field = "C5200C1F2575A09491B18B8CE6E6A375")

    private byte[] mPostData;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "E3B093022B51696D8A9249A5CBB1B7C1", hash_generated_field = "FB6DD9E423DD8E3B65713D050C1DF4CF")

    private boolean mSynchronous;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "9B951BA0E0DD99654367267037A17F00", hash_generated_field = "8086EB07D920976B70D832288B336380")

    private Vector<Message> mMessageQueue;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "F0D779550E246389EBE13C14C5F7FDB9", hash_generated_field = "E2600D589BA8423FB6859BA77F68989A")

    private boolean mIsMainPageLoader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "AF36715AAF25E2195BB18F3B33004164", hash_generated_field = "75023DD9A0A12C6512FD4F2D45866B50")

    private boolean mIsMainResourceLoader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "5E8195D2B1BFC9907987B84962F03AEB", hash_generated_field = "D928F63690A6A62BFF2AD4D16739AD6F")

    private boolean mUserGesture;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "9DA6583E4F64A78649E80D72BFE1DBCC", hash_generated_field = "13C03042313948D47B6F87C772F0131E")

    private Headers mHeaders;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "2FB3EB7CD104D0E14FE0487884A12591", hash_generated_field = "50564F75BBDED0F5A11BFE739FB8373A")

    private String mUsername;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "5C6B7EE711155A7472DA571800057A96", hash_generated_field = "44A1332F4D6AD461D600A43252892695")

    private String mPassword;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.150 -0400", hash_original_field = "4B9E95174875242C9A98A092137F2AE1", hash_generated_field = "DC46C8F8C9ECAF31EBEBF94599D29CFE")

    private int mCacheRedirectCount;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.151 -0400", hash_original_method = "63FB01D41A0193C36F7BC9C3E9D1276B", hash_generated_method = "B434F09CD029CFFFA3BD7ECD2C37104F")
      LoadListener(Context context, BrowserFrame frame, String url,
            int nativeLoader, boolean synchronous, boolean isMainPageLoader,
            boolean isMainResource, boolean userGesture, long postIdentifier,
            String username, String password) {
        mContext = context;
        mBrowserFrame = frame;
        setUrl(url);
        mNativeLoader = nativeLoader;
        mSynchronous = synchronous;
        {
            mMessageQueue = new Vector<Message>();
        } 
        mIsMainPageLoader = isMainPageLoader;
        mIsMainResourceLoader = isMainResource;
        mUserGesture = userGesture;
        mPostIdentifier = postIdentifier;
        mUsername = username;
        mPassword = password;
        addTaint(url.getTaint());
        
        
        
            
        
        
        
        
        
        
        
            
        
        
        
        
        
        
        
    }

    
    public static LoadListener getLoadListener(Context context,
            BrowserFrame frame, String url, int nativeLoader,
            boolean synchronous, boolean isMainPageLoader,
            boolean isMainResource, boolean userGesture, long postIdentifier,
            String username, String password) {
        sNativeLoaderCount += 1;
        return new LoadListener(context, frame, url, nativeLoader, synchronous,
                isMainPageLoader, isMainResource, userGesture, postIdentifier,
                username, password);
    }

    
    @DSModeled(DSC.SAFE)
    public static int getNativeLoaderCount() {
        return sNativeLoaderCount;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.151 -0400", hash_original_method = "E8BFBC0989CB1303890EF6ABB82F2DCB", hash_generated_method = "1D30724615CFE0039A108856FCC50022")
    private void clearNativeLoader() {
        sNativeLoaderCount -= 1;
        mNativeLoader = 0;
        mSetNativeResponse = false;
        
        
        
        
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.152 -0400", hash_original_method = "77CD0D13F9C2AAAECAF2A5910AFEFD4A", hash_generated_method = "E99DB646EB6174827DBAE708547947DC")
    public void handleMessage(Message msg) {
        
        handleHeaders((Headers) msg.obj);
        
        
        {
            boolean varEBF14453EC3DF653682F6F49D18A0FCD_816845274 = (mNativeLoader != 0 && !ignoreCallbacks());
            {
                commitLoad();
            } 
        } 
        
        
        handleEndData();
        
        
        handleError(msg.arg1, (String) msg.obj);
        
        
        doRedirect();
        
        
        Message contMsg = obtainMessage(MSG_LOCATION_CHANGED);
        
        
        Message stopMsg = obtainMessage(MSG_CONTENT_FINISHED);
        
        
        mBrowserFrame.getCallbackProxy().onFormResubmission(
                        stopMsg, contMsg);
        
        
        HashMap status = (HashMap) msg.obj;
        
        
        handleStatus(((Integer) status.get("major")).intValue(),
                        ((Integer) status.get("minor")).intValue(),
                        ((Integer) status.get("code")).intValue(),
                        (String) status.get("reason"));
        
        
        handleCertificate((SslCertificate) msg.obj);
        
        
        handleSslError((SslError) msg.obj);
        
        addTaint(msg.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.153 -0400", hash_original_method = "172B6AEABEB6A05CD87E0FF0F77BADEB", hash_generated_method = "13F48ADDEBB7EC062576AA3E630F6B2C")
     BrowserFrame getFrame() {
        BrowserFrame varB4EAC82CA7396A68D541C85D26508E83_16385313 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_16385313 = mBrowserFrame;
        varB4EAC82CA7396A68D541C85D26508E83_16385313.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_16385313;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.154 -0400", hash_original_method = "4F4EBC54D108D66F416C93B46580E117", hash_generated_method = "14E04DA42892B0F0CCCD76B6D8396554")
     Context getContext() {
        Context varB4EAC82CA7396A68D541C85D26508E83_1658210262 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1658210262 = mContext;
        varB4EAC82CA7396A68D541C85D26508E83_1658210262.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1658210262;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.154 -0400", hash_original_method = "8DEF62308917FED7D5E9DE4FE979D5DE", hash_generated_method = "CD94FB6674A60A43B738BDF5ADBE36E7")
     boolean isSynchronous() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_884279885 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_884279885;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.154 -0400", hash_original_method = "E8044B5DC56667FC9DCFE8CB33E5852B", hash_generated_method = "9BF53430980B89D544C090147E09F8BB")
    public boolean cancelled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1478025795 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1478025795;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.155 -0400", hash_original_method = "454399D3A9345FFC357883E67C1190C2", hash_generated_method = "B28828EC25FABD9F69DB3108DB03FB5A")
    public void headers(Headers headers) {
        ArrayList<String> cookies = headers.getSetCookie();
        {
            int i = 0;
            boolean varE9AF3BEAEA8CF5406F5AC5D6F9EE8F57_1802433466 = (i < cookies.size());
            {
                CookieManager.getInstance().setCookie(mUri, cookies.get(i));
            } 
        } 
        sendMessageInternal(obtainMessage(MSG_CONTENT_HEADERS, headers));
        addTaint(headers.getTaint());
        
        
        
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.156 -0400", hash_original_method = "311EC7904C0F96CC61CCD61A611678E4", hash_generated_method = "F5B1C1F6C3DF59F2A76182408E35A2DC")
    private void handleHeaders(Headers headers) {
        {
            WebViewWorker.getHandler().obtainMessage(
                    WebViewWorker.MSG_REMOVE_CACHE, this).sendToTarget();
        } 
        mHeaders = headers;
        long contentLength = headers.getContentLength();
        {
            mContentLength = contentLength;
        } 
        {
            mContentLength = 0;
        } 
        String contentType = headers.getContentType();
        {
            parseContentTypeHeader(contentType);
            mMimeType = MimeTypeMap.getSingleton().remapGenericMimeType(
                    mMimeType, mUrl, headers.getContentDisposition());
        } 
        {
            guessMimeType();
        } 
        {
            boolean var1FB790FEEC374B8E1CFBA64E5D64F4C6_1731426497 = (mIsMainPageLoader && mIsMainResourceLoader && mUserGesture &&
                Pattern.matches(XML_MIME_TYPE, mMimeType) &&
                !mMimeType.equalsIgnoreCase("application/xhtml+xml"));
            {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setDataAndType(Uri.parse(url()), mMimeType);
                ResolveInfo info = mContext.getPackageManager().resolveActivity(i,
                    PackageManager.MATCH_DEFAULT_ONLY);
                {
                    boolean var0CAA1F9BE373A668A403365FF0CE483B_1002382720 = (info != null && !mContext.getPackageName().equals(
                    info.activityInfo.packageName));
                    {
                        try 
                        {
                            mContext.startActivity(i);
                            mBrowserFrame.stopLoading();
                        } 
                        catch (ActivityNotFoundException ex)
                        { }
                    } 
                } 
            } 
        } 
        boolean mustAuthenticate = (mStatusCode == HTTP_AUTH ||
                mStatusCode == HTTP_PROXY_AUTH);
        boolean isProxyAuthRequest = (mStatusCode == HTTP_PROXY_AUTH);
        mAuthFailed = false;
        {
            mAuthFailed = (mustAuthenticate &&
                    isProxyAuthRequest == mAuthHeader.isProxy());
            {
                boolean varCC683FE62B0EF80F8FFB7C83613687C9_541861178 = (!mAuthFailed && mAuthHeader.isProxy());
                {
                    Network network = Network.getInstance(mContext);
                    {
                        boolean varE7ECF7EC251273A020C9A5595F22451C_1534748743 = (network.isValidProxySet());
                        {
                            {
                                network.setProxyUsername(mAuthHeader.getUsername());
                                network.setProxyPassword(mAuthHeader.getPassword());
                            } 
                        } 
                    } 
                } 
            } 
        } 
        mAuthHeader = null;
        {
            {
                mAuthHeader = parseAuthHeader(
                        headers.getWwwAuthenticate());
            } 
            {
                mAuthHeader = parseAuthHeader(
                        headers.getProxyAuthenticate());
                {
                    mAuthHeader.setProxy();
                } 
            } 
        } 
        {
            {
                boolean var12B07FF95F64556F0F5629AF1ADEEDEA_811410454 = (!mFromCache && mRequestHandle != null
                    && (!mRequestHandle.getMethod().equals("POST")
                            || mPostIdentifier != 0));
                {
                    WebViewWorker.CacheCreateData data = new WebViewWorker.CacheCreateData();
                    data.mListener = this;
                    data.mUrl = mUrl;
                    data.mMimeType = mMimeType;
                    data.mStatusCode = mStatusCode;
                    data.mPostId = mPostIdentifier;
                    data.mHeaders = headers;
                    WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_CREATE_CACHE, data).sendToTarget();
                } 
            } 
            WebViewWorker.CacheEncoding ce = new WebViewWorker.CacheEncoding();
            ce.mEncoding = mEncoding;
            ce.mListener = this;
            WebViewWorker.getHandler().obtainMessage(
                    WebViewWorker.MSG_UPDATE_CACHE_ENCODING, ce).sendToTarget();
        } 
        commitHeadersCheckRedirect();
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.157 -0400", hash_original_method = "700C126D7DD3A2A28FA66689BEC1C959", hash_generated_method = "FE151C22A3EA55383DBBCE1349209422")
     boolean proxyAuthenticate() {
        {
            boolean varE5CAE2FBD59400ACCD83E492081A86C1_1301119926 = (mAuthHeader.isProxy());
        } 
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1681466787 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1681466787;
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.157 -0400", hash_original_method = "DDF05333033BF6873CD233D3316FD8A3", hash_generated_method = "09DF21126473D562D885A79E07B5563E")
    public void status(int majorVersion, int minorVersion,
            int code,  String reasonPhrase) {
        HashMap status = new HashMap();
        status.put("major", majorVersion);
        status.put("minor", minorVersion);
        status.put("code", code);
        status.put("reason", reasonPhrase);
        mDataBuilder.clear();
        mMimeType = "";
        mEncoding = "";
        mTransferEncoding = "";
        sendMessageInternal(obtainMessage(MSG_STATUS, status));
        addTaint(majorVersion);
        addTaint(minorVersion);
        addTaint(code);
        addTaint(reasonPhrase.getTaint());
        
        
            
                    
                    
                    
                    
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.157 -0400", hash_original_method = "80BDEC9DD0BC19198E8FAA3CF681EF16", hash_generated_method = "92132462CD10CE442A0AE57AEC11FA6C")
    private void handleStatus(int major, int minor, int code, String reason) {
        mStatusCode = code;
        mStatusText = reason;
        mPermanent = false;
        addTaint(major);
        addTaint(minor);
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.158 -0400", hash_original_method = "E4096ABF23EF8731F97354B434FC290A", hash_generated_method = "1FE0A9DB37368C3366448DF8108D0E1A")
    public void certificate(SslCertificate certificate) {
        sendMessageInternal(obtainMessage(MSG_SSL_CERTIFICATE, certificate));
        addTaint(certificate.getTaint());
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.158 -0400", hash_original_method = "0FA338360DC1BF86862C5325E0DDE15B", hash_generated_method = "5A72371D15998E3081A501C76B63986F")
    private void handleCertificate(SslCertificate certificate) {
        {
            mBrowserFrame.certificate(certificate);
        } 
        addTaint(certificate.getTaint());
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.159 -0400", hash_original_method = "89A45FCA5400E7297D291CB9BD4FA531", hash_generated_method = "D3786D2B0F2EC8342100554EBF07FA2E")
    public void error(int id, String description) {
        sendMessageInternal(obtainMessage(MSG_CONTENT_ERROR, id, 0, description));
        addTaint(id);
        addTaint(description.getTaint());
        
        
            
                    
        
        
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.159 -0400", hash_original_method = "FF98E8647B63FEBC8B925077CB2E6971", hash_generated_method = "BFAA29B7AE658444FE661E602E4F9A12")
    private void handleError(int id, String description) {
        mErrorID = id;
        mErrorDescription = description;
        detachRequestHandle();
        notifyError();
        tearDown();
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.159 -0400", hash_original_method = "842D88ADC63F459E21BBD6FC9BF11FA0", hash_generated_method = "467D3F98B294F1B34D3BF53D4E88801D")
    public void data(byte[] data, int length) {
        boolean sendMessage = false;
        {
            sendMessage = mDataBuilder.isEmpty();
            mDataBuilder.append(data, 0, length);
        } 
        {
            sendMessageInternal(obtainMessage(MSG_CONTENT_DATA));
        } 
        addTaint(data[0]);
        addTaint(length);
        
        
            
        
        
        
            
            
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.160 -0400", hash_original_method = "57E1AB7C57BAD02879F9C8B9B633558A", hash_generated_method = "169AA40A4DB785BD992709004B47C00D")
    public void endData() {
        sendMessageInternal(obtainMessage(MSG_CONTENT_FINISHED));
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.160 -0400", hash_original_method = "CDF3DE93E351C5A11A75DE0E367F817E", hash_generated_method = "A121312D23A094B39BB6CB5FEC271CCB")
    private void handleEndData() {
        
        mPermanent = true;
        
        
        {
            {
                boolean varD068D29C86C3899A0A7365E7D8E5A606_1847400916 = (mRequestHandle != null && 
                                mRequestHandle.getMethod().equals("POST"));
                {
                    sendMessageInternal(obtainMessage(
                                MSG_LOCATION_CHANGED_REQUEST));
                } 
                {
                    boolean varD28941268B369EB362F84F893C633B30_1652229818 = (mMethod != null && mMethod.equals("POST"));
                    {
                        sendMessageInternal(obtainMessage(
                                MSG_LOCATION_CHANGED_REQUEST));
                    } 
                    {
                        sendMessageInternal(obtainMessage(MSG_LOCATION_CHANGED));
                    } 
                } 
            } 
        } 
        {
            sendMessageInternal(obtainMessage(MSG_LOCATION_CHANGED));
        } 
        
        
        {
            boolean var73D6F5715104F63F29F36A391760A31E_1972277131 = (mAuthHeader != null &&
                        (Network.getInstance(mContext).isValidProxySet() ||
                         !mAuthHeader.isProxy()));
            {
                {
                    String host;
                    boolean varDFD43C8D97D180F461A514E8A6A76A39_999635337 = (mAuthHeader.isProxy());
                    host = Network.getInstance(mContext).getProxyHostname();
                    host = mUri.getHost();
                    HttpAuthHandlerImpl.onReceivedCredentials(this, host,
                                mAuthHeader.getRealm(), mUsername, mPassword);
                    makeAuthResponse(mUsername, mPassword);
                } 
                {
                    Network.getInstance(mContext).handleAuthRequest(this);
                } 
            } 
        } 
        
        
        {
            {
                boolean var42C78101C5CD9E8ED377DC60807FD554_2024653257 = (isSynchronous());
                {
                    mCacheLoader.load();
                } 
                {
                    WebViewWorker.getHandler().obtainMessage(
                                WebViewWorker.MSG_ADD_STREAMLOADER, mCacheLoader)
                                .sendToTarget();
                } 
            } 
            mFromCache = true;
        } 
        
        detachRequestHandle();
        tearDown();
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.161 -0400", hash_original_method = "986192BD953D202BDF33831C4485C789", hash_generated_method = "47CBFFEFBA2BEBDF39A8136B3A86A818")
     void setCacheLoader(CacheLoader c) {
        mCacheLoader = c;
        mFromCache = true;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.161 -0400", hash_original_method = "0AD650AC52F38566687E74B5EF113675", hash_generated_method = "E47C4E4F199E1D4E97C992663A0FBE32")
     boolean checkCache(Map<String, String> headers) {
        CacheResult result = CacheManager.getCacheFile(url(), mPostIdentifier,
                headers);
        mCacheLoader = null;
        mFromCache = false;
        {
            mCacheLoader = new CacheLoader(this, result);
            {
                boolean varC6BCA4E5BDBD2D7A1E9322998F81BCBF_859538737 = (!headers.containsKey(
                    CacheManager.HEADER_KEY_IFNONEMATCH) &&
                    !headers.containsKey(
                            CacheManager.HEADER_KEY_IFMODIFIEDSINCE));
                {
                    {
                        boolean varE43BEDB07085C405402D06A50570074B_1114799966 = (isSynchronous());
                        {
                            mCacheLoader.load();
                        } 
                        {
                            WebViewWorker.getHandler().obtainMessage(
                            WebViewWorker.MSG_ADD_STREAMLOADER, mCacheLoader)
                            .sendToTarget();
                        } 
                    } 
                    mFromCache = true;
                } 
            } 
        } 
        addTaint(headers.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_192227045 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_192227045;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.162 -0400", hash_original_method = "DAC212856E10133D124E798AA1F9AF10", hash_generated_method = "8B9A917F038FDA84CEFAC9E56C970163")
    public boolean handleSslErrorRequest(SslError error) {
        {
            boolean var4D0341006E9A9633CEB75F8CF4C09DE3_2057753369 = (Network.getInstance(mContext).checkSslPrefTable(this, error));
        } 
        {
            boolean var837A5D3B4D6C6B7A7C66720A25FA94F8_1721442499 = (isSynchronous());
            {
                mRequestHandle.handleSslErrorResponse(false);
            } 
        } 
        sendMessageInternal(obtainMessage(MSG_SSL_ERROR, error));
        {
            mSslErrorRequestHandle = mRequestHandle;
        } 
        addTaint(error.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1034047903 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1034047903;
        
        
            
                    
                    
                    
        
        
            
        
        
            
            
        
        
        
            
        
        
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.162 -0400", hash_original_method = "8A34681F6BA1F3EEE132C403DE00B59E", hash_generated_method = "B29005D565C8401F61A0BA306735B0E3")
    private void handleSslError(SslError error) {
        {
            mSslError = error;
            Network.getInstance(mContext).handleSslErrorRequest(this);
        } 
        {
            mSslErrorRequestHandle.handleSslErrorResponse(true);
        } 
        mSslErrorRequestHandle = null;
        
        
            
            
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.163 -0400", hash_original_method = "273C3FB8F6276DB18167E6647E9B9071", hash_generated_method = "FAD0C8B643C057F521701FCBC055EF18")
     String realm() {
        String varB4EAC82CA7396A68D541C85D26508E83_1753959523 = null; 
        String varB4EAC82CA7396A68D541C85D26508E83_505452857 = null; 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1753959523 = null;
        } 
        {
            varB4EAC82CA7396A68D541C85D26508E83_505452857 = mAuthHeader.getRealm();
        } 
        String varA7E53CE21691AB073D9660D615818899_1943239115; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1943239115 = varB4EAC82CA7396A68D541C85D26508E83_1753959523;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1943239115 = varB4EAC82CA7396A68D541C85D26508E83_505452857;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1943239115.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1943239115;
        
        
            
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.163 -0400", hash_original_method = "B53822BFF4A674DE454739734B590814", hash_generated_method = "72356899C9962B441901557EF6E6A4EF")
     boolean authCredentialsInvalid() {
        boolean var3969C3B58B09A1ECDB164E540B11F523_177288030 = ((mAuthFailed &&
                !(mAuthHeader.isDigest() && mAuthHeader.getStale())));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_837052220 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_837052220;
        
        
                
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.164 -0400", hash_original_method = "D83DC2897E3C9B13E1B0E03447F2258A", hash_generated_method = "BD22B6A5565CD6E4DCEE79663A13C0D8")
     SslError sslError() {
        SslError varB4EAC82CA7396A68D541C85D26508E83_1730639862 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1730639862 = mSslError;
        varB4EAC82CA7396A68D541C85D26508E83_1730639862.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1730639862;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.164 -0400", hash_original_method = "98A7269FE5209374A8ED24F438AC19C3", hash_generated_method = "2DA925C04A94A7E66D325CFB1CBE363E")
     void handleSslErrorResponse(boolean proceed) {
        {
            mRequestHandle.handleSslErrorResponse(proceed);
        } 
        {
            mBrowserFrame.stopLoading();
            tearDown();
        } 
        addTaint(proceed);
        
        
            
        
        
            
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.165 -0400", hash_original_method = "7E02E9AA12C4A958E94F9A413E55434A", hash_generated_method = "CB117F7EB32BBE6EF3D6A4D41FE257FE")
     void handleAuthResponse(String username, String password) {
        {
            makeAuthResponse(username, password);
        } 
        {
            commitLoad();
            tearDown();
        } 
        addTaint(username.getTaint());
        addTaint(password.getTaint());
        
        
            
                    
                    
        
        
            
        
            
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.166 -0400", hash_original_method = "D4EC792204E12F6CD4476F22DB2D7416", hash_generated_method = "D4C2AF4063B6153D331F8F13F9E6B662")
     void makeAuthResponse(String username, String password) {
        mAuthHeader.setUsername(username);
        mAuthHeader.setPassword(password);
        int scheme = mAuthHeader.getScheme();
        {
            boolean isProxy = mAuthHeader.isProxy();
            mRequestHandle.setupBasicAuthResponse(isProxy, username, password);
        } 
        {
            boolean isProxy = mAuthHeader.isProxy();
            String realm = mAuthHeader.getRealm();
            String nonce = mAuthHeader.getNonce();
            String qop = mAuthHeader.getQop();
            String algorithm = mAuthHeader.getAlgorithm();
            String opaque = mAuthHeader.getOpaque();
            mRequestHandle.setupDigestAuthResponse(isProxy, username, password,
                    realm, nonce, qop, algorithm, opaque);
        } 
        addTaint(username.getTaint());
        addTaint(password.getTaint());
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.166 -0400", hash_original_method = "0354530277F06C2F68A7F9A147112FDC", hash_generated_method = "B9828203D5B8AB72FF779428888DC616")
     void setRequestData(String method, Map<String, String> headers, 
            byte[] postData) {
        mMethod = method;
        mRequestHeaders = headers;
        mPostData = postData;
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.167 -0400", hash_original_method = "50C2A5A94CFD2B09208EC5050A570E5D", hash_generated_method = "ECF4315EF0A53686A374A578A89ACF3D")
     String url() {
        String varB4EAC82CA7396A68D541C85D26508E83_754475791 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_754475791 = mUrl;
        varB4EAC82CA7396A68D541C85D26508E83_754475791.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_754475791;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.168 -0400", hash_original_method = "C2839DA6285DEBF5C5C20951F1E9FC61", hash_generated_method = "1F4D0B6E2C59F764EDE02C9D2B350D31")
     WebAddress getWebAddress() {
        WebAddress varB4EAC82CA7396A68D541C85D26508E83_344579882 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_344579882 = mUri;
        varB4EAC82CA7396A68D541C85D26508E83_344579882.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_344579882;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.168 -0400", hash_original_method = "0451B8994B1846476A8FE8B0355ADDFF", hash_generated_method = "5A4479AB34DA87B24671FDD63CF9AA6F")
     String host() {
        String varB4EAC82CA7396A68D541C85D26508E83_134503213 = null; 
        String varB4EAC82CA7396A68D541C85D26508E83_1531202603 = null; 
        {
            varB4EAC82CA7396A68D541C85D26508E83_134503213 = mUri.getHost();
        } 
        varB4EAC82CA7396A68D541C85D26508E83_1531202603 = null;
        String varA7E53CE21691AB073D9660D615818899_75926291; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_75926291 = varB4EAC82CA7396A68D541C85D26508E83_134503213;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_75926291 = varB4EAC82CA7396A68D541C85D26508E83_1531202603;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_75926291.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_75926291;
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.169 -0400", hash_original_method = "BC027B9D5395B8E20CC57CD534FC36DC", hash_generated_method = "EE608422703F6972064749A501E64B16")
     String originalUrl() {
        String varB4EAC82CA7396A68D541C85D26508E83_688479154 = null; 
        String varB4EAC82CA7396A68D541C85D26508E83_368267164 = null; 
        {
            varB4EAC82CA7396A68D541C85D26508E83_688479154 = mOriginalUrl;
        } 
        {
            varB4EAC82CA7396A68D541C85D26508E83_368267164 = mUrl;
        } 
        String varA7E53CE21691AB073D9660D615818899_1733556348; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1733556348 = varB4EAC82CA7396A68D541C85D26508E83_688479154;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1733556348 = varB4EAC82CA7396A68D541C85D26508E83_368267164;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1733556348.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1733556348;
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.169 -0400", hash_original_method = "1FD4A483F618FB6B6B2EA6F438798B25", hash_generated_method = "C67FF6CA2D4F5720C2AD255052B62292")
     long postIdentifier() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_20530790 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_20530790;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.169 -0400", hash_original_method = "555C5182696D3D1E5A8F07F29E226BC9", hash_generated_method = "B0A005E1C16B27D55998264EB3ED9582")
     void attachRequestHandle(RequestHandle requestHandle) {
        mRequestHandle = requestHandle;
        
        
            
                    
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.170 -0400", hash_original_method = "A03FA80E3F939CA589BDCCBFD92DE3E2", hash_generated_method = "BDF1A7E1FC3C2077A98A5A519EEA781B")
     void detachRequestHandle() {
        mRequestHandle = null;
        
        
            
                    
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.170 -0400", hash_original_method = "34F543213ABA35F3500E526ABE3EA0BF", hash_generated_method = "C51EE3EB880DEE2C6E9A9DFF6BE15A5F")
     void downloadFile() {
        WebViewWorker.getHandler().obtainMessage(
                WebViewWorker.MSG_REMOVE_CACHE, this).sendToTarget();
        mBrowserFrame.getCallbackProxy().onDownloadStart(url(), 
                mBrowserFrame.getUserAgentString(),
                mHeaders.getContentDisposition(), 
                mMimeType, mContentLength);
        cancel();
        
        
                
        
                
                
                
        
    }

    
    @DSModeled(DSC.SPEC)
    static boolean willLoadFromCache(String url, long identifier) {
        assert !JniUtil.useChromiumHttpStack();
        boolean inCache =
                CacheManager.getCacheFile(url, identifier, null) != null;
        if (DebugFlags.LOAD_LISTENER) {
            Log.v(LOGTAG, "willLoadFromCache: " + url + " in cache: " + 
                    inCache);
        }
        return inCache;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.170 -0400", hash_original_method = "D1C1DC94D32429EE46F2E8034E6F3CAD", hash_generated_method = "E5BFBF4C61B75C3DF875FCDE0EEBC18D")
     void resetCancel() {
        mCancelled = false;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.171 -0400", hash_original_method = "AB4E07CAED8783333F5D8E2EFE2FEA5A", hash_generated_method = "53041D17AB46B4AA598F59B92916DE46")
     String mimeType() {
        String varB4EAC82CA7396A68D541C85D26508E83_254370271 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_254370271 = mMimeType;
        varB4EAC82CA7396A68D541C85D26508E83_254370271.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_254370271;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.171 -0400", hash_original_method = "EDB0721EF3A307F050BF15E668A80271", hash_generated_method = "D9DD02A4F3B75D91CAF9E66E3F5E328A")
     String transferEncoding() {
        String varB4EAC82CA7396A68D541C85D26508E83_1401352976 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1401352976 = mTransferEncoding;
        varB4EAC82CA7396A68D541C85D26508E83_1401352976.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1401352976;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.172 -0400", hash_original_method = "A0A208846C45918947FC3EEE159224A3", hash_generated_method = "39148D035DE276CECE6F04B5A4715D9F")
     long contentLength() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1121322876 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1121322876;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.172 -0400", hash_original_method = "78D8A8AE22C18C73CE2907680A09633B", hash_generated_method = "D7B58E33D6B765DEEEE5CAFF2690F9E2")
    private void commitHeadersCheckRedirect() {
        commitHeaders();
        
        
        
                
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.172 -0400", hash_original_method = "8E8E66962C082FBF4981B6E1121BFDBD", hash_generated_method = "8FD73C3D97AF6DB04F93AD40B85A78DE")
    private void commitHeaders() {
        {
            boolean var9788089095FD8B842742F0D3B2475B66_495908483 = (mIsMainPageLoader && CertTool.getCertType(mMimeType) != null);
        } 
        setNativeResponse();
        
        
            
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.172 -0400", hash_original_method = "E28F47114E6BDDF9FD429A699C881F5C", hash_generated_method = "C28ED8FE5AE4C35EBB24DC321B47FC1C")
    private void setNativeResponse() {
        int nativeResponse = createNativeResponse();
        nativeReceivedResponse(nativeResponse);
        mSetNativeResponse = true;
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.174 -0400", hash_original_method = "90DA669053E3EAB1E41208AD478B9563", hash_generated_method = "A430F1387271607D095262D20737C807")
    private int createNativeResponse() {
        int statusCode;
        statusCode = HTTP_OK;
        statusCode = mStatusCode;
        final int nativeResponse = nativeCreateResponse(
                originalUrl(), statusCode, mStatusText,
                mMimeType, mContentLength, mEncoding);
        {
            mHeaders.getHeaders(new Headers.HeaderCallback() {                
                @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.173 -0400", hash_original_method = "69E60F28B81345DBCE843A767C941042", hash_generated_method = "AF8D6CADD1F28EDEBD637D5D8F89D05F")
                public void header(String name, String value) {
                    nativeSetResponseHeader(nativeResponse, name, value);
                    addTaint(name.getTaint());
                    addTaint(value.getTaint());
                    
                    
                }
});
        } 
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2083187222 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2083187222;
        
        
                
        
                
                
        
            
                    
                        
                    
                
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.174 -0400", hash_original_method = "6C3510E057E7F86D9E5BFE641B751A6D", hash_generated_method = "144E2745FD9CBE5DEF113BE5FB4C1E3B")
    private void commitLoad() {
        {
            setNativeResponse();
        } 
        {
            String type = CertTool.getCertType(mMimeType);
            {
                {
                    byte[] cert = new byte[mDataBuilder.getByteSize()];
                    int offset = 0;
                    {
                        ByteArrayBuilder.Chunk c = mDataBuilder.getFirstChunk();
                        {
                            System.arraycopy(c.mArray, 0, cert, offset, c.mLength);
                            offset += c.mLength;
                        } 
                        c.release();
                    } 
                    CertTool.addCertificate(mContext, type, cert);
                    mBrowserFrame.stopLoading();
                } 
            } 
        } 
        ByteArrayBuilder.Chunk c;
        {
            c = mDataBuilder.getFirstChunk();
            {
                nativeAddData(c.mArray, c.mLength);
                WebViewWorker.CacheData data = new WebViewWorker.CacheData();
                data.mListener = this;
                data.mChunk = c;
                WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_APPEND_CACHE, data).sendToTarget();
            } 
            {
                c.release();
            } 
        } 
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.176 -0400", hash_original_method = "622A6BD0A40561F44F0949C5CF1F5483", hash_generated_method = "27440B139C0D4A9932C2512CAE67B3E5")
     void tearDown() {
        {
            boolean varAB9E8CB6A473BE0B33C57182B7F91870_1581235373 = (getErrorID() == OK);
            {
                WebViewWorker.CacheSaveData data = new WebViewWorker.CacheSaveData();
                data.mListener = this;
                data.mUrl = mUrl;
                data.mPostId = mPostIdentifier;
                WebViewWorker.getHandler().obtainMessage(
                    WebViewWorker.MSG_SAVE_CACHE, data).sendToTarget();
            } 
            {
                WebViewWorker.getHandler().obtainMessage(
                    WebViewWorker.MSG_REMOVE_CACHE, this).sendToTarget();
            } 
        } 
        {
            {
                setNativeResponse();
            } 
            nativeFinished();
            clearNativeLoader();
        } 
        
        
            
            
            
            
            
                    
        
            
                    
        
        
            
                
            
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.176 -0400", hash_original_method = "209FBE9F3E1C7384DEBC7D7B19E27A8A", hash_generated_method = "ADE1EB686AD5931DDB3ED4D648D72407")
    private int getErrorID() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_578488145 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_578488145;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.177 -0400", hash_original_method = "D67F514368DCF056FAAB1F778CFC87BD", hash_generated_method = "E51116997D018707D2EDDD5013C6C3E2")
    private String getErrorDescription() {
        String varB4EAC82CA7396A68D541C85D26508E83_432570003 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_432570003 = mErrorDescription;
        varB4EAC82CA7396A68D541C85D26508E83_432570003.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_432570003;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.178 -0400", hash_original_method = "E680E4717FCBA329FAA87BAD42E56CAC", hash_generated_method = "3F2DA2D506FB18AA878EA2D5A61A0E3B")
     void notifyError() {
        {
            String description = getErrorDescription();
            description = "";
            nativeError(getErrorID(), description, url());
            clearNativeLoader();
        } 
        
        
            
            
            
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.178 -0400", hash_original_method = "DFC23EFD31E5C4FF40E98CE1A64FD5ED", hash_generated_method = "F49939ADFF2C677E812D4F412736ABE3")
     void pauseLoad(boolean pause) {
        {
            mRequestHandle.pauseRequest(pause);
        } 
        addTaint(pause);
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.178 -0400", hash_original_method = "1181D36634AC97975F684A5C861366C7", hash_generated_method = "2D1A43E511ACBC3B72914B7AA57BF9A7")
    public void cancel() {
        {
            mRequestHandle.cancel();
            mRequestHandle = null;
        } 
        WebViewWorker.getHandler().obtainMessage(
                WebViewWorker.MSG_REMOVE_CACHE, this).sendToTarget();
        mCancelled = true;
        clearNativeLoader();
        
        
            
                
            
                
            
        
        
            
            
        
        
                
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.180 -0400", hash_original_method = "A28FBC4A594C62B1FB221C43DC1C2583", hash_generated_method = "A93BEFD69BFAD97E2C71C2520BB66496")
    private void doRedirect() {
        {
            handleError(EventHandler.ERROR_REDIRECT_LOOP, mContext.getString(
                    R.string.httpErrorRedirectLoop));
        } 
        String redirectTo = mHeaders.getLocation();
        {
            int nativeResponse = createNativeResponse();
            redirectTo =
                    nativeRedirectedToUrl(mUrl, redirectTo, nativeResponse);
            {
                Log.d(LOGTAG, "Redirection failed for "
                        + mHeaders.getLocation());
                cancel();
            } 
            {
                boolean var4BC74C0339FF0D282D6889513716AF46_672890050 = (!URLUtil.isNetworkUrl(redirectTo));
                {
                    final String text = mContext
                        .getString(R.string.open_permission_deny)
                        + "\n" + redirectTo;
                    {
                        setNativeResponse();
                    } 
                    nativeAddData(text.getBytes(), text.length());
                    nativeFinished();
                    clearNativeLoader();
                } 
            } 
            {
                boolean var9FABAD625F3CF927825C199D1CB19D00_1313889905 = (getErrorID() == OK);
                {
                    WebViewWorker.CacheSaveData data = new WebViewWorker.CacheSaveData();
                    data.mListener = this;
                    data.mUrl = mUrl;
                    data.mPostId = mPostIdentifier;
                    WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_SAVE_CACHE, data).sendToTarget();
                } 
                {
                    WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_REMOVE_CACHE, this).sendToTarget();
                } 
            } 
            mOriginalUrl = redirectTo;
            setUrl(redirectTo);
            {
                mRequestHeaders = new HashMap<String, String>();
            } 
            boolean fromCache = false;
            {
                fromCache = true;
            } 
            {
                boolean var5B86DF6F22EC6A011A7E7F676EE6B6AB_2097384634 = (!checkCache(mRequestHeaders));
                {
                    {
                        try 
                        {
                            mRequestHandle.setupRedirect(mUrl, mStatusCode,
                                mRequestHeaders);
                        } 
                        catch (RuntimeException e)
                        {
                            handleError(EventHandler.ERROR_BAD_URL,
                                mContext.getString(R.string.httpErrorBadUrl));
                        } 
                    } 
                    {
                        Network network = Network.getInstance(getContext());
                        {
                            boolean var39F3D24FAA0DC03AD29BF73501987F25_1293534173 = (!network.requestURL(mMethod, mRequestHeaders,
                            mPostData, this));
                            {
                                handleError(EventHandler.ERROR_BAD_URL,
                                mContext.getString(R.string.httpErrorBadUrl));
                            } 
                        } 
                    } 
                    {
                        mRequestHandle.setRedirectCount(mCacheRedirectCount);
                    } 
                } 
                {
                    mCacheRedirectCount = mRequestHandle.getRedirectCount() + 1;
                } 
            } 
        } 
        {
            commitHeaders();
            commitLoad();
            tearDown();
        } 
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.182 -0400", hash_original_method = "F42460285C9091878E41158B4AED6A71", hash_generated_method = "0668A118A30555386A441298E09F3C84")
     void parseContentTypeHeader(String contentType) {
        {
            int i = contentType.indexOf(';');
            {
                mMimeType = contentType.substring(0, i);
                int j = contentType.indexOf('=', i);
                {
                    i = contentType.indexOf(';', j);
                    {
                        i = contentType.length();
                    } 
                    mEncoding = contentType.substring(j + 1, i);
                } 
                {
                    mEncoding = contentType.substring(i + 1);
                } 
                mEncoding = mEncoding.trim().toLowerCase();
                {
                    boolean var13B27D95A9632914626DBEBE651A12EF_1162666465 = (i < contentType.length() - 1);
                    {
                        mTransferEncoding =
                            contentType.substring(i + 1).trim().toLowerCase();
                    } 
                } 
            } 
            {
                mMimeType = contentType;
            } 
            mMimeType = mMimeType.trim();
            try 
            {
                Matcher m = CONTENT_TYPE_PATTERN.matcher(mMimeType);
                {
                    boolean var39BD3106C7A2329BC5A3364836FB2CF9_1863691905 = (m.find());
                    {
                        mMimeType = m.group(1);
                    } 
                    {
                        guessMimeType();
                    } 
                } 
            } 
            catch (IllegalStateException ex)
            {
                guessMimeType();
            } 
        } 
        mMimeType = mMimeType.toLowerCase();
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.184 -0400", hash_original_method = "AE0FC74CC8A0BC926B5DCE69D72EC94D", hash_generated_method = "F08927C8E6A22AE15CDE651B3887F884")
    private HttpAuthHeader parseAuthHeader(String header) {
        HttpAuthHeader varB4EAC82CA7396A68D541C85D26508E83_1772969271 = null; 
        HttpAuthHeader varB4EAC82CA7396A68D541C85D26508E83_864751801 = null; 
        HttpAuthHeader varB4EAC82CA7396A68D541C85D26508E83_403699922 = null; 
        {
            int posMax = 256;
            int posLen = 0;
            int[] pos = new int [posMax];
            int headerLen = header.length();
            {
                boolean quoted = false;
                {
                    int i = 0;
                    {
                        {
                            boolean varEED5FE80D284B29088CDC3B2020C18BA_325607554 = (header.charAt(i) == '\"');
                            {
                                quoted = !quoted;
                            } 
                            {
                                {
                                    {
                                        boolean varA6D900745186AB55FA6DC70E044D90E7_1303063170 = (header.regionMatches(true, i,
                                    HttpAuthHeader.BASIC_TOKEN, 0,
                                    HttpAuthHeader.BASIC_TOKEN.length()));
                                        {
                                            pos[posLen++] = i;
                                        } 
                                    } 
                                    {
                                        boolean var9BB96610CCDD0A2CA167EA62D5B1E782_1004122158 = (header.regionMatches(true, i,
                                    HttpAuthHeader.DIGEST_TOKEN, 0,
                                    HttpAuthHeader.DIGEST_TOKEN.length()));
                                        {
                                            pos[posLen++] = i;
                                        } 
                                    } 
                                } 
                            } 
                        } 
                    } 
                } 
            } 
            {
                {
                    int i = 0;
                    {
                        {
                            boolean var0F7ADCB64C853D5C60254F8DA31AB71B_72613494 = (header.regionMatches(true, pos[i],
                                HttpAuthHeader.DIGEST_TOKEN, 0,
                                HttpAuthHeader.DIGEST_TOKEN.length()));
                            {
                                String sub = header.substring(pos[i],
                                (i + 1 < posLen ? pos[i + 1] : headerLen));
                                HttpAuthHeader rval = new HttpAuthHeader(sub);
                                {
                                    boolean var049D67944127B174A09BA345E9C65282_594224064 = (rval.isSupportedScheme());
                                    {
                                        varB4EAC82CA7396A68D541C85D26508E83_1772969271 = rval;
                                    } 
                                } 
                            } 
                        } 
                    } 
                } 
                {
                    int i = 0;
                    {
                        {
                            boolean var3C860FF7CD9160C8A47433614CAD0330_675646682 = (header.regionMatches(true, pos[i],
                                HttpAuthHeader.BASIC_TOKEN, 0,
                                HttpAuthHeader.BASIC_TOKEN.length()));
                            {
                                String sub = header.substring(pos[i],
                                (i + 1 < posLen ? pos[i + 1] : headerLen));
                                HttpAuthHeader rval = new HttpAuthHeader(sub);
                                {
                                    boolean var049D67944127B174A09BA345E9C65282_877378092 = (rval.isSupportedScheme());
                                    {
                                        varB4EAC82CA7396A68D541C85D26508E83_864751801 = rval;
                                    } 
                                } 
                            } 
                        } 
                    } 
                } 
            } 
        } 
        varB4EAC82CA7396A68D541C85D26508E83_403699922 = null;
        addTaint(header.getTaint());
        HttpAuthHeader varA7E53CE21691AB073D9660D615818899_1224499780; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1224499780 = varB4EAC82CA7396A68D541C85D26508E83_1772969271;
                break;
            case 2: 
                varA7E53CE21691AB073D9660D615818899_1224499780 = varB4EAC82CA7396A68D541C85D26508E83_864751801;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1224499780 = varB4EAC82CA7396A68D541C85D26508E83_403699922;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1224499780.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1224499780;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.185 -0400", hash_original_method = "977413F84EEA9D9E0B7BBB5D674FC9E7", hash_generated_method = "BA0ED6917E62C2BBB009D1FA6D909DB2")
    private boolean ignoreCallbacks() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_630759765 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_630759765;
        
        
                
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.186 -0400", hash_original_method = "B1CFB6FACF3C8464BDC576EEF15EE2EE", hash_generated_method = "0524477058DE24ADE7302594F3E45CF8")
     void setUrl(String url) {
        {
            mUri = null;
            {
                boolean varB7E6CB04F9FE3A0CBF3E091A2172F917_105364179 = (URLUtil.isNetworkUrl(url));
                {
                    mUrl = URLUtil.stripAnchor(url);
                    try 
                    {
                        mUri = new WebAddress(mUrl);
                    } 
                    catch (ParseException e)
                    {
                        e.printStackTrace();
                    } 
                } 
                {
                    mUrl = url;
                } 
            } 
        } 
        
        
            
            
                
                
                    
                
                    
                
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.187 -0400", hash_original_method = "EF260C0902D2E84B94B185FE48F20D51", hash_generated_method = "2DB41D872127EA089EE9ED65758168A3")
    private void guessMimeType() {
        {
            boolean varC2714C547A38705DE5583ECBFD766FDE_568396528 = (URLUtil.isDataUrl(mUrl) && mMimeType.length() != 0);
            {
                cancel();
                final String text = mContext.getString(R.string.httpErrorBadUrl);
                handleError(EventHandler.ERROR_BAD_URL, text);
            } 
            {
                mMimeType = "text/html";
                String newMimeType = guessMimeTypeFromExtension(mUrl);
                {
                    mMimeType = newMimeType;
                } 
            } 
        } 
        
        
            
            
            
        
            
            
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.187 -0400", hash_original_method = "2EA3CE69FA8B837FDAA4CA6DE51D2499", hash_generated_method = "8EBAF57FE7A068746395BDCB094E3C08")
    private String guessMimeTypeFromExtension(String url) {
        String varB4EAC82CA7396A68D541C85D26508E83_1691821931 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1691821931 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(
                MimeTypeMap.getFileExtensionFromUrl(url));
        addTaint(url.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1691821931.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1691821931;
        
        
            
        
        
                
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.188 -0400", hash_original_method = "4C14C55105A23524352CD131708D205A", hash_generated_method = "D7092780BEA3316216BF3242167DD9D0")
    private void sendMessageInternal(Message msg) {
        {
            mMessageQueue.add(msg);
        } 
        {
            sendMessage(msg);
        } 
        addTaint(msg.getTaint());
        
        
            
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.188 -0400", hash_original_method = "84B3C85DEED8CE51C1D689DF257AD721", hash_generated_method = "61A1B30D8F6B84E809AE50D3C496758F")
     void loadSynchronousMessages() {
        {
            if (DroidSafeAndroidRuntime.control) throw new AssertionError();
        } 
        {
            boolean var8F5875506F461E3D4FAABDB7CF8E2CD9_1073105596 = (!mMessageQueue.isEmpty());
            {
                handleMessage(mMessageQueue.remove(0));
            } 
        } 
        
        
            
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.189 -0400", hash_original_method = "4DA58223C4F20A38192632BBFEEE57C8", hash_generated_method = "79277DBA76D7A62F02D72E70FC9C793C")
    private int nativeCreateResponse(String url, int statusCode,
            String statusText, String mimeType, long expectedLength,
            String encoding) {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1511971539 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1511971539;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.189 -0400", hash_original_method = "BA6D20A53269A42AE8656C6EBDDFC70F", hash_generated_method = "2EE95CDE989B39A0D0DDF8BD2F00F5D0")
    private void nativeSetResponseHeader(int nativeResponse, String key,
            String val) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.189 -0400", hash_original_method = "41C6950B308582DB9C9A99E22648CC08", hash_generated_method = "4463E5BF89AC3DAA3138235FBCA35550")
    private void nativeReceivedResponse(int nativeResponse) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.189 -0400", hash_original_method = "CB7AF973B7AC5B91CFB8AF007E1C0D32", hash_generated_method = "2DC911843AB3EF8DD3A2BB1A5E9C90C7")
    private void nativeAddData(byte[] data, int length) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_method = "49549DEACC297430F7E9805D3678A016", hash_generated_method = "F76CF5604F7D206ECF3936D4EC9118B8")
    private void nativeFinished() {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_method = "33F440D9D1697DCCED15CDDD044058A8", hash_generated_method = "29EA735C0797FDF2B21BDCB4EDCF36A9")
    private String nativeRedirectedToUrl(String baseUrl,
            String redirectTo, int nativeResponse) {
    	String s = new String();
    	s.addTaint(taint);
    	return s;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_method = "BCCFE0CFBD3782D8BEDE6CB5D0F9DEA3", hash_generated_method = "5B90DA7D769D000F23CD21F1BE24C0C0")
    private void nativeError(int id, String desc, String failingUrl) {
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "9722F24E24D81405093C0E61AAF58518", hash_generated_field = "061362C112C980EB4954480FBAFBE378")

    private static final String LOGTAG = "webkit";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "509AF2834ADA401F28B3A49D3B705FD7", hash_generated_field = "411E409FCE3C58BE9BA3E6203E80B6AB")

    private static final int MSG_CONTENT_HEADERS = 100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "7355BAE53F9D568830324A8969C07267", hash_generated_field = "DAA6BB961A1AB150C7D4C79F2F45075C")

    private static final int MSG_CONTENT_DATA = 110;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "A2D250A3518B45A65154B96127A6F664", hash_generated_field = "821C83A5F10056724A1264EDF4B243C7")

    private static final int MSG_CONTENT_FINISHED = 120;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "675853C8435F9866A52B73DF381042EF", hash_generated_field = "B2A41EFD129FF10B9F368F8C3B6CABAB")

    private static final int MSG_CONTENT_ERROR = 130;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "4CF18A1C721AB1F4A835A45350590E10", hash_generated_field = "DEE25F2AAC38E6182B595E5F1A7B9DF8")

    private static final int MSG_LOCATION_CHANGED = 140;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "2481F0AA6F79937644E1A5A293AFBAC3", hash_generated_field = "66AC92B296B18CD4FFA79CCBEBEFDEDC")

    private static final int MSG_LOCATION_CHANGED_REQUEST = 150;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "B7A45E8514F101F74E05513138B304C8", hash_generated_field = "8CE8B590CBF427BDEBAF776EA07B635E")

    private static final int MSG_STATUS = 160;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "15F7BB0E8BD2B4E568C46B6504FE8D7A", hash_generated_field = "77AEDD03EFF9D007A9FF71685ED9B603")

    private static final int MSG_SSL_CERTIFICATE = 170;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "608CB7C17A9F5C4E9F987C213FF631BA", hash_generated_field = "4A5C4BFACAE94926B45870B18FFAEC2B")

    private static final int MSG_SSL_ERROR = 180;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "4800DC2FC1B39792E563783C8F6B5A15", hash_generated_field = "C8D2666C9BA638414EEC6A741AFCFBE7")

    private static final int HTTP_OK = 200;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "0760F8C3033E9095987F4D9935F2063D", hash_generated_field = "D8436253A0E1590995389DEF643C7AC4")

    private static final int HTTP_PARTIAL_CONTENT = 206;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "0DF4FEB60449DF34F1AD9AA9936765DE", hash_generated_field = "A21DD64CACF18DF6C575E72962C46F9E")

    private static final int HTTP_MOVED_PERMANENTLY = 301;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "97B42AAB3CD04F3E73E4AE80BA351129", hash_generated_field = "F16818D73EBE4718633BC72A35C64865")

    private static final int HTTP_FOUND = 302;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "181D1EAE3C8C62D9A4E824819B863C2E", hash_generated_field = "949A18F982649D59B83F6E75D3E98A68")

    private static final int HTTP_SEE_OTHER = 303;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "0FF390CB90ACDFA99B5AA910382219DE", hash_generated_field = "DBCD47929E85185D8F234889685C9320")

    private static final int HTTP_NOT_MODIFIED = 304;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "9BEEF7C99885EE31AD26A587958D111A", hash_generated_field = "A37E4C811DC81991FD4504CDD85F4F53")

    private static final int HTTP_TEMPORARY_REDIRECT = 307;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "8E590EA7EB338033302726F6757CBE86", hash_generated_field = "19163CCE00330334DC887A0C1853E241")

    private static final int HTTP_AUTH = 401;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "B970EF697AC248BDAD36A5826B50E965", hash_generated_field = "0E33C348AEF88770DA8DCD09874C3305")

    private static final int HTTP_NOT_FOUND = 404;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "63AD218BFAC63DB6FD5C0ED2F32ADDA7", hash_generated_field = "6F18BE030B574644F542FCCDBD4B8DCE")

    private static final int HTTP_PROXY_AUTH = 407;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.190 -0400", hash_original_field = "52191F22AFD6839461470104D6DB2030", hash_generated_field = "4FCBFD819BC0278295B9EC4188A35F2D")

    private static int sNativeLoaderCount;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.191 -0400", hash_original_field = "C18621DE80ED88424E67439E8D952773", hash_generated_field = "F163785717C82BE5535ACE6D74FC3873")

    private static final String XML_MIME_TYPE = "^[\\w_\\-+~!$\\^{}|.%'`#&*]+/" +
            "[\\w_\\-+~!$\\^{}|.%'`#&*]+\\+xml$";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:05.191 -0400", hash_original_field = "459CF722BCB9467407E6E09F9891AF1C", hash_generated_field = "9A0633094294E861E914F60D234070F3")

    private static final Pattern CONTENT_TYPE_PATTERN = Pattern.compile("^((?:[xX]-)?[a-zA-Z\\*]+/[\\w\\+\\*-]+[\\.[\\w\\+-]+]*)$");
}

