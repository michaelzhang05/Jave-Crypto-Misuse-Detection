package z0;

import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.getcapacitor.g0;
import com.getcapacitor.h;
import com.getcapacitor.j0;
import com.getcapacitor.k0;
import com.getcapacitor.v0;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f9905a;

    public c(HttpURLConnection httpURLConnection) {
        this.f9905a = httpURLConnection;
        l();
    }

    private String d() {
        Locale locale;
        LocaleList localeList;
        if (Build.VERSION.SDK_INT >= 24) {
            localeList = LocaleList.getDefault();
            locale = localeList.get(0);
        } else {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return !TextUtils.isEmpty(language) ? !TextUtils.isEmpty(country) ? String.format("%s-%s,%s;q=0.5", language, country, language) : String.format("%s;q=0.5", language) : "";
    }

    private void l() {
        String d6 = d();
        if (TextUtils.isEmpty(d6)) {
            return;
        }
        this.f9905a.setRequestProperty("Accept-Language", d6);
    }

    private void t(String str, g0 g0Var) {
        Base64.Decoder decoder;
        byte[] decode;
        DataOutputStream dataOutputStream = new DataOutputStream(this.f9905a.getOutputStream());
        try {
            String str2 = str.split(";")[1].split("=")[1];
            for (Object obj : g0Var.a()) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String string = jSONObject.getString("type");
                    String string2 = jSONObject.getString("key");
                    String string3 = jSONObject.getString("value");
                    if (string.equals("string")) {
                        dataOutputStream.writeBytes("--" + str2 + "\r\n");
                        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + string2 + "\"\r\n\r\n");
                        dataOutputStream.writeBytes(string3);
                    } else if (string.equals("base64File")) {
                        String string4 = jSONObject.getString("fileName");
                        String string5 = jSONObject.getString("contentType");
                        dataOutputStream.writeBytes("--" + str2 + "\r\n");
                        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + string2 + "\"; filename=\"" + string4 + "\"\r\n");
                        StringBuilder sb = new StringBuilder();
                        sb.append("Content-Type: ");
                        sb.append(string5);
                        sb.append("\r\n");
                        dataOutputStream.writeBytes(sb.toString());
                        dataOutputStream.writeBytes("Content-Transfer-Encoding: binary\r\n");
                        dataOutputStream.writeBytes("\r\n");
                        if (Build.VERSION.SDK_INT >= 26) {
                            decoder = Base64.getDecoder();
                            decode = decoder.decode(string3);
                            dataOutputStream.write(decode);
                        }
                    }
                    dataOutputStream.writeBytes("\r\n");
                }
            }
            dataOutputStream.writeBytes("--" + str2 + "--\r\n");
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void u(String str) {
        DataOutputStream dataOutputStream = new DataOutputStream(this.f9905a.getOutputStream());
        try {
            dataOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // z0.e
    public InputStream a() {
        return this.f9905a.getErrorStream();
    }

    @Override // z0.e
    public InputStream b() {
        return this.f9905a.getInputStream();
    }

    @Override // z0.e
    public String c(String str) {
        return this.f9905a.getHeaderField(str);
    }

    public void e() {
        this.f9905a.connect();
    }

    public void f() {
        this.f9905a.disconnect();
    }

    public Map g() {
        return this.f9905a.getHeaderFields();
    }

    public int h() {
        return this.f9905a.getResponseCode();
    }

    public URL i() {
        return this.f9905a.getURL();
    }

    public void j(boolean z5) {
        this.f9905a.setAllowUserInteraction(z5);
    }

    public void k(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("timeout can not be negative");
        }
        this.f9905a.setConnectTimeout(i6);
    }

    public void m(boolean z5) {
        this.f9905a.setInstanceFollowRedirects(!z5);
    }

    public void n(boolean z5) {
        this.f9905a.setDoOutput(z5);
    }

    public void o(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("timeout can not be negative");
        }
        this.f9905a.setReadTimeout(i6);
    }

    public void p(v0 v0Var, k0 k0Var, String str) {
        Base64.Decoder decoder;
        byte[] decode;
        String str2;
        String requestProperty = this.f9905a.getRequestProperty("Content-Type");
        if (requestProperty == null || requestProperty.isEmpty()) {
            return;
        }
        if (requestProperty.contains("application/json")) {
            g0 g0Var = null;
            if (k0Var != null) {
                str2 = k0Var.toString();
            } else {
                g0Var = v0Var.d("data", null);
                str2 = "";
            }
            if (g0Var != null) {
                str2 = g0Var.toString();
            } else if (k0Var == null) {
                str2 = v0Var.n("data");
            }
            u(str2 != null ? str2 : "");
            return;
        }
        if (str == null || !str.equals("file")) {
            if (str == null || !str.equals("formData")) {
                u(k0Var.toString());
                return;
            } else {
                t(requestProperty, k0Var.b());
                return;
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(this.f9905a.getOutputStream());
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                decoder = Base64.getDecoder();
                decode = decoder.decode(k0Var.toString());
                dataOutputStream.write(decode);
            }
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void q(j0 j0Var) {
        Iterator<String> keys = j0Var.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f9905a.setRequestProperty(next, j0Var.getString(next));
        }
    }

    public void r(String str) {
        this.f9905a.setRequestMethod(str);
    }

    public void s(h hVar) {
        try {
            Class<?> cls = Class.forName("io.ionic.sslpinning.SSLPinning");
            SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) cls.getDeclaredMethod("getSSLSocketFactory", h.class).invoke(cls.newInstance(), hVar);
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) this.f9905a).setSSLSocketFactory(sSLSocketFactory);
            }
        } catch (Exception unused) {
        }
    }
}
