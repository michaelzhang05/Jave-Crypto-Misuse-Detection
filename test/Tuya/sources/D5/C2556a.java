package d5;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import androidx.browser.trusted.sharing.ShareTarget;
import b5.C1881a;
import b5.C1882b;
import c5.C1926a;
import c5.C1929d;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import g6.C2728d;
import g6.n;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2556a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0726a f30177b = new C0726a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f30178a;

    /* renamed from: d5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0726a {
        public C0726a(AbstractC3151p abstractC3151p) {
        }
    }

    public C2556a(Context context) {
        AbstractC3159y.i(context, "context");
        this.f30178a = context;
    }

    public static String a(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        boolean z8 = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (z8) {
                z8 = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(str, C.UTF8_NAME));
            sb.append("=");
            sb.append(URLEncoder.encode(str2, C.UTF8_NAME));
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "result.toString()");
        return sb2;
    }

    public final C1929d b(String token) {
        BufferedReader bufferedReader;
        OutputStream outputStream;
        AbstractC3159y.i(token, "token");
        String str = "/eapi/sdk-installation/" + Settings.Secure.getString(this.f30178a.getContentResolver(), "android_id");
        HashMap hashMap = new HashMap();
        String jSONObject = new C1881a(this.f30178a, token).a(this.f30178a).toString();
        AbstractC3159y.h(jSONObject, "jsonObjectContext.toString()");
        hashMap.put("context", jSONObject);
        String jSONObject2 = new C1882b(this.f30178a).a().toString();
        AbstractC3159y.h(jSONObject2, "jsonObjectFile.toString()");
        hashMap.put("file", jSONObject2);
        StringBuilder sb = new StringBuilder();
        C1926a c1926a = C1926a.f14984a;
        sb.append(c1926a.b());
        sb.append(str);
        String sb2 = sb.toString();
        C1929d c1929d = new C1929d();
        try {
            if (n.s(ShareTarget.METHOD_POST, ShareTarget.METHOD_GET, true)) {
                sb2 = sb2 + '?' + a(hashMap);
            }
            URLConnection openConnection = new URL(sb2).openConnection();
            AbstractC3159y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setReadTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            httpsURLConnection.setConnectTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            httpsURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpsURLConnection.setDoInput(true);
            if (n.s(ShareTarget.METHOD_POST, ShareTarget.METHOD_POST, true)) {
                httpsURLConnection.setDoOutput(true);
            }
            if (n.H("https://secure.uptodown.com", "www.xxxyyyxxx.com", false, 2, null)) {
                Charset charset = C2728d.f31293b;
                byte[] bytes = "".getBytes(charset);
                AbstractC3159y.h(bytes, "getBytes(...)");
                byte[] encode = Base64.encode(bytes, 0);
                AbstractC3159y.h(encode, "encode(devValue.toByteArray(), Base64.DEFAULT)");
                httpsURLConnection.setRequestProperty("", new String(encode, charset));
            }
            httpsURLConnection.setRequestProperty("Identificador", "Uptodown_Android");
            httpsURLConnection.setRequestProperty("Identificador-Version", "600");
            httpsURLConnection.setRequestProperty("APIKEY", c1926a.a());
            if (n.s(ShareTarget.METHOD_POST, ShareTarget.METHOD_POST, true) && (outputStream = httpsURLConnection.getOutputStream()) != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C.UTF8_NAME));
                bufferedWriter.write(a(hashMap));
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
            }
            int responseCode = httpsURLConnection.getResponseCode();
            c1929d.e(responseCode);
            if (responseCode == 200) {
                bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getErrorStream()));
                c1929d.c(true);
            }
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb3.append(readLine);
            }
            c1929d.d(sb3.toString());
        } catch (Exception e8) {
            e8.printStackTrace();
            c1929d.c(true);
            c1929d.d(e8.getMessage());
        }
        return c1929d;
    }
}
