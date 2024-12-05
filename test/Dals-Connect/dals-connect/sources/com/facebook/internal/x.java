package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.dataprovider.BuildConfig;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Utility.java */
/* loaded from: classes.dex */
public final class x {
    private static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static long f9232b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static long f9233c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static long f9234d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static String f9235e = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f9236f = "";

    /* renamed from: g, reason: collision with root package name */
    private static String f9237g = "NoCarrier";

    /* compiled from: Utility.java */
    /* loaded from: classes.dex */
    static class a implements GraphRequest.f {
        final /* synthetic */ c a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9238b;

        a(c cVar, String str) {
            this.a = cVar;
            this.f9238b = str;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(com.facebook.i iVar) {
            if (iVar.g() != null) {
                this.a.b(iVar.g().f());
            } else {
                u.b(this.f9238b, iVar.h());
                this.a.a(iVar.h());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utility.java */
    /* loaded from: classes.dex */
    public static class b implements FilenameFilter {
        b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    /* compiled from: Utility.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(JSONObject jSONObject);

        void b(FacebookException facebookException);
    }

    /* compiled from: Utility.java */
    /* loaded from: classes.dex */
    public static class d {
        List<String> a;

        /* renamed from: b, reason: collision with root package name */
        List<String> f9239b;

        /* renamed from: c, reason: collision with root package name */
        List<String> f9240c;

        public d(List<String> list, List<String> list2, List<String> list3) {
            this.a = list;
            this.f9239b = list2;
            this.f9240c = list3;
        }

        public List<String> a() {
            return this.f9239b;
        }

        public List<String> b() {
            return this.f9240c;
        }

        public List<String> c() {
            return this.a;
        }
    }

    public static Method A(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method B(String str, String str2, Class<?>... clsArr) {
        try {
            return A(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Locale C() {
        try {
            return com.facebook.f.e().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object D(JSONObject jSONObject, String str, String str2) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    public static d E(JSONObject jSONObject) throws JSONException {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            String optString2 = optJSONObject.optString("permission");
            if (optString2 != null && !optString2.equals("installed") && (optString = optJSONObject.optString("status")) != null) {
                if (optString.equals("granted")) {
                    arrayList.add(optString2);
                } else if (optString.equals("declined")) {
                    arrayList2.add(optString2);
                } else if (optString.equals("expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new d(arrayList, arrayList2, arrayList3);
    }

    private static String F(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b2 : digest) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString((b2 >> 0) & 15));
        }
        return sb.toString();
    }

    private static String G(String str, String str2) {
        return H(str, str2.getBytes());
    }

    private static String H(String str, byte[] bArr) {
        try {
            return F(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static Object I(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean J() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", com.facebook.f.f())));
            Context e2 = com.facebook.f.e();
            PackageManager packageManager = e2.getPackageManager();
            String packageName = e2.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (packageName.equals(it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean K(Context context) {
        AutofillManager autofillManager;
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    public static boolean L(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && str.matches(".+_cheets|cheets_.+");
    }

    public static boolean M(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean N(AccessToken accessToken) {
        return accessToken != null && accessToken.equals(AccessToken.g());
    }

    public static boolean O() {
        if (com.facebook.internal.a0.f.a.c(x.class)) {
            return false;
        }
        try {
            JSONObject w = w();
            if (w == null) {
                return false;
            }
            try {
                JSONArray jSONArray = w.getJSONArray("data_processing_options");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (jSONArray.getString(i2).toLowerCase().equals("ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, x.class);
            return false;
        }
    }

    public static boolean P(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean Q(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> boolean R(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean S(Uri uri) {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    public static List<String> T(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static void U(String str, Exception exc) {
        if (!com.facebook.f.u() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    public static void V(String str, String str2) {
        if (!com.facebook.f.u() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static void W(String str, String str2, Throwable th) {
        if (!com.facebook.f.u() || Q(str)) {
            return;
        }
        Log.d(str, str2, th);
    }

    public static String X(Map<String, String> map) {
        if (map.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static String Y(String str) {
        return G("MD5", str);
    }

    public static boolean Z(Context context) {
        return K(context);
    }

    public static Map<String, String> a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static Bundle a0(String str) {
        Bundle bundle = new Bundle();
        if (!Q(str)) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                try {
                    if (split.length == 2) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                    } else if (split.length == 1) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                } catch (UnsupportedEncodingException e2) {
                    U("FacebookSDK", e2);
                }
            }
        }
        return bundle;
    }

    public static <T> boolean b(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    public static boolean b0(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, obj.toString());
        return true;
    }

    public static <T> List<T> c(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static void c0(Bundle bundle, String str, String str2) {
        if (Q(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static JSONObject d(String str) {
        JSONObject a2 = u.a(str);
        if (a2 != null) {
            return a2;
        }
        com.facebook.i g2 = x(str).g();
        if (g2.g() != null) {
            return null;
        }
        return g2.h();
    }

    public static void d0(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            c0(bundle, str, uri.toString());
        }
    }

    public static Uri e(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    public static String e0(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[RecyclerView.l.FLAG_MOVED];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            h(bufferedInputStream);
                            h(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    h(bufferedInputStream);
                    h(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    private static void f(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : cookie.split(";")) {
            String[] split = str2.split("=");
            if (split.length > 0) {
                cookieManager.setCookie(str, split[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static Map<String, String> f0(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < readInt; i2++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static void g(Context context) {
        f(context, "facebook.com");
        f(context, ".facebook.com");
        f(context, "https://facebook.com");
        f(context, "https://.facebook.com");
    }

    private static void g0() {
        try {
            if (o()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f9234d = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f9234d = j(f9234d);
        } catch (Exception unused) {
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int h0() {
        int i2 = a;
        if (i2 > 0) {
            return i2;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new b());
            if (listFiles != null) {
                a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (a <= 0) {
            a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return a;
    }

    public static String i(String str, String str2) {
        return Q(str) ? str2 : str;
    }

    private static void i0(Context context) {
        if (f9237g.equals("NoCarrier")) {
            try {
                f9237g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    private static long j(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    private static void j0(Context context) {
        if (f9232b == -1 || System.currentTimeMillis() - f9232b >= cm.aptoide.pt.BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS) {
            f9232b = System.currentTimeMillis();
            k0();
            i0(context);
            l0();
            g0();
        }
    }

    public static List<String> k(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    private static void k0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f9235e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f9236f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    public static Map<String, String> l(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    private static void l0() {
        try {
            if (o()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f9233c = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f9233c = j(f9233c);
        } catch (Exception unused) {
        }
    }

    public static int m(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i2 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i2 += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void m0(Runnable runnable) {
        try {
            com.facebook.f.m().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static void n(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static void n0(JSONObject jSONObject, com.facebook.internal.a aVar, String str, boolean z) throws JSONException {
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", com.facebook.f.d());
        if (aVar != null) {
            if (aVar.g() != null) {
                jSONObject.put("attribution", aVar.g());
            }
            if (aVar.b() != null) {
                jSONObject.put("advertiser_id", aVar.b());
                jSONObject.put("advertiser_tracking_enabled", !aVar.k());
            }
            if (!aVar.k()) {
                String d2 = com.facebook.t.p.d();
                if (!d2.isEmpty()) {
                    jSONObject.put("ud", d2);
                }
            }
            if (aVar.f() != null) {
                jSONObject.put("installer_package", aVar.f());
            }
        }
    }

    private static boolean o() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static void o0(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i2;
        WindowManager windowManager;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        j0(context);
        String packageName = context.getPackageName();
        int i3 = 0;
        int i4 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i4 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jSONArray.put(packageName);
        jSONArray.put(i4);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
        jSONArray.put(f9235e);
        jSONArray.put(f9237g);
        double d2 = 0.0d;
        try {
            windowManager = (WindowManager) context.getSystemService("window");
        } catch (Exception unused3) {
        }
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i5 = displayMetrics.widthPixels;
            try {
                int i6 = displayMetrics.heightPixels;
                try {
                    d2 = displayMetrics.density;
                } catch (Exception unused4) {
                }
                i3 = i5;
                i2 = i6;
            } catch (Exception unused5) {
                i3 = i5;
            }
            jSONArray.put(i3);
            jSONArray.put(i2);
            jSONArray.put(new DecimalFormat("#.##").format(d2));
            jSONArray.put(h0());
            jSONArray.put(f9233c);
            jSONArray.put(f9234d);
            jSONArray.put(f9236f);
            jSONObject.put("extinfo", jSONArray.toString());
        }
        i2 = 0;
        jSONArray.put(i3);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(h0());
        jSONArray.put(f9233c);
        jSONArray.put(f9234d);
        jSONArray.put(f9236f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static String p(int i2) {
        return new BigInteger(i2 * 5, new Random()).toString(32);
    }

    public static String p0(byte[] bArr) {
        return H("SHA-1", bArr);
    }

    public static String q(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static String q0(String str) {
        if (str == null) {
            return null;
        }
        return G("SHA-256", str);
    }

    public static String r(Context context) {
        try {
            String g2 = com.facebook.f.g();
            if (g2 != null) {
                return g2;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return context.getString(i2);
        } catch (Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static <T> Collection<T> r0(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    public static String s() {
        Context e2 = com.facebook.f.e();
        if (e2 == null) {
            return null;
        }
        try {
            return e2.getPackageManager().getPackageInfo(e2.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static void s0(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static Date t(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Long) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                parseLong = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (parseLong * 1000));
    }

    public static long u(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = com.facebook.f.e().getContentResolver().query(uri, null, null, null, null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j2 = cursor.getLong(columnIndex);
            cursor.close();
            return j2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static Locale v() {
        Locale C = C();
        return C != null ? C : Locale.getDefault();
    }

    public static JSONObject w() {
        if (com.facebook.internal.a0.f.a.c(x.class)) {
            return null;
        }
        try {
            String string = com.facebook.f.e().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, x.class);
            return null;
        }
    }

    private static GraphRequest x(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        return new GraphRequest(null, "me", bundle, com.facebook.j.GET, null);
    }

    public static void y(String str, c cVar) {
        JSONObject a2 = u.a(str);
        if (a2 != null) {
            cVar.a(a2);
            return;
        }
        a aVar = new a(cVar, str);
        GraphRequest x = x(str);
        x.W(aVar);
        x.i();
    }

    public static String z(Context context) {
        y.i(context, "context");
        com.facebook.f.C(context);
        return com.facebook.f.f();
    }
}
