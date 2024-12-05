package c1;

import R.AbstractC1319p;
import W.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import c1.AbstractC1905d;
import c1.f;
import com.google.firebase.installations.d;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import r0.l;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1904c {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f14864d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f14865e = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    private final Context f14866a;

    /* renamed from: b, reason: collision with root package name */
    private final Z0.b f14867b;

    /* renamed from: c, reason: collision with root package name */
    private final e f14868c = new e();

    public C1904c(Context context, Z0.b bVar) {
        this.f14866a = context;
        this.f14867b = bVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.4");
            return jSONObject;
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.4");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private String f() {
        try {
            Context context = this.f14866a;
            byte[] a8 = W.a.a(context, context.getPackageName());
            if (a8 == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f14866a.getPackageName());
                return null;
            }
            return i.b(a8, false);
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("ContentValues", "No such package: " + this.f14866a.getPackageName(), e8);
            return null;
        }
    }

    private URL g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e8) {
            throw new com.google.firebase.installations.d(e8.getMessage(), d.a.UNAVAILABLE);
        }
    }

    private static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes(C.UTF8_NAME);
    }

    private static boolean i(int i8) {
        if (i8 >= 200 && i8 < 300) {
            return true;
        }
        return false;
    }

    private static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o8 = o(httpURLConnection);
        if (!TextUtils.isEmpty(o8)) {
            Log.w("Firebase-Installations", o8);
            Log.w("Firebase-Installations", a(str, str2, str3));
        }
    }

    private HttpURLConnection l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f14866a.getPackageName());
            X0.i iVar = (X0.i) this.f14867b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) l.a(iVar.a()));
                } catch (InterruptedException e8) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e8);
                } catch (ExecutionException e9) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e9);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    static long m(String str) {
        AbstractC1319p.b(f14864d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    private AbstractC1905d n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f14865e));
        f.a a8 = f.a();
        AbstractC1905d.a a9 = AbstractC1905d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a9.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a9.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a9.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a8.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a8.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a9.b(a8.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a9.e(AbstractC1905d.b.OK).a();
    }

    private static String o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f14865e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private f p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f14865e));
        f.a a8 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a8.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a8.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a8.b(f.b.OK).a();
    }

    private void q(HttpURLConnection httpURLConnection, String str, String str2) {
        s(httpURLConnection, h(b(str, str2)));
    }

    private void r(HttpURLConnection httpURLConnection) {
        s(httpURLConnection, h(c()));
    }

    private static void s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public AbstractC1905d d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC1905d n8;
        if (this.f14868c.b()) {
            URL g8 = g(String.format("projects/%s/installations", str3));
            for (int i8 = 0; i8 <= 1; i8++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l8 = l(g8, str);
                try {
                    try {
                        l8.setRequestMethod(ShareTarget.METHOD_POST);
                        l8.setDoOutput(true);
                        if (str5 != null) {
                            l8.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                        }
                        q(l8, str2, str4);
                        responseCode = l8.getResponseCode();
                        this.f14868c.f(responseCode);
                    } catch (IOException | AssertionError unused) {
                    }
                    if (i(responseCode)) {
                        n8 = n(l8);
                    } else {
                        k(l8, str4, str, str3);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                j();
                                n8 = AbstractC1905d.a().e(AbstractC1905d.b.BAD_CONFIG).a();
                            }
                            l8.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                        }
                    }
                    l8.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n8;
                } catch (Throwable th) {
                    l8.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    public f e(String str, String str2, String str3, String str4) {
        int responseCode;
        f p8;
        if (this.f14868c.b()) {
            URL g8 = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i8 = 0; i8 <= 1; i8++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l8 = l(g8, str);
                try {
                    try {
                        l8.setRequestMethod(ShareTarget.METHOD_POST);
                        l8.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        l8.setDoOutput(true);
                        r(l8);
                        responseCode = l8.getResponseCode();
                        this.f14868c.f(responseCode);
                    } finally {
                        l8.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (i(responseCode)) {
                    p8 = p(l8);
                } else {
                    k(l8, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                j();
                                p8 = f.a().b(f.b.BAD_CONFIG).a();
                            }
                        } else {
                            throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                        }
                    } else {
                        p8 = f.a().b(f.b.AUTH_ERROR).a();
                    }
                }
                return p8;
            }
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }
}
