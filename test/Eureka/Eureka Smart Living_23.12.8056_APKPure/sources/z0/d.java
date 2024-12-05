package z0;

import android.text.TextUtils;
import android.util.Base64;
import com.getcapacitor.g0;
import com.getcapacitor.h;
import com.getcapacitor.j0;
import com.getcapacitor.k0;
import com.getcapacitor.v0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9906a;

        static {
            int[] iArr = new int[EnumC0152d.values().length];
            f9906a = iArr;
            try {
                iArr[EnumC0152d.ARRAY_BUFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9906a[EnumC0152d.BLOB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9906a[EnumC0152d.JSON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9906a[EnumC0152d.DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9906a[EnumC0152d.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f9907a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f9908b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f9909c;

        /* renamed from: d, reason: collision with root package name */
        public j0 f9910d;

        /* renamed from: e, reason: collision with root package name */
        public String f9911e;

        /* renamed from: f, reason: collision with root package name */
        public URL f9912f;

        /* renamed from: g, reason: collision with root package name */
        public z0.c f9913g;

        public z0.c a() {
            return this.f9913g;
        }

        public b b() {
            z0.c cVar = new z0.c((HttpURLConnection) this.f9912f.openConnection());
            this.f9913g = cVar;
            cVar.j(false);
            this.f9913g.r(this.f9911e);
            Integer num = this.f9907a;
            if (num != null) {
                this.f9913g.k(num.intValue());
            }
            Integer num2 = this.f9908b;
            if (num2 != null) {
                this.f9913g.o(num2.intValue());
            }
            Boolean bool = this.f9909c;
            if (bool != null) {
                this.f9913g.m(bool.booleanValue());
            }
            this.f9913g.q(this.f9910d);
            return this;
        }

        public b c(Integer num) {
            this.f9907a = num;
            return this;
        }

        public b d(Boolean bool) {
            this.f9909c = bool;
            return this;
        }

        public b e(j0 j0Var) {
            this.f9910d = j0Var;
            return this;
        }

        public b f(String str) {
            this.f9911e = str;
            return this;
        }

        public b g(Integer num) {
            this.f9908b = num;
            return this;
        }

        public b h(URL url) {
            this.f9912f = url;
            return this;
        }

        public b i(j0 j0Var, boolean z5) {
            String query = this.f9912f.getQuery();
            if (query == null) {
                query = "";
            }
            Iterator<String> keys = j0Var.keys();
            if (!keys.hasNext()) {
                return this;
            }
            StringBuilder sb = new StringBuilder(query);
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    StringBuilder sb2 = new StringBuilder();
                    JSONArray jSONArray = j0Var.getJSONArray(next);
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        sb2.append(next);
                        sb2.append("=");
                        sb2.append(jSONArray.getString(i6));
                        if (i6 != jSONArray.length() - 1) {
                            sb2.append("&");
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append((CharSequence) sb2);
                } catch (JSONException unused) {
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(next);
                    sb.append("=");
                    sb.append(j0Var.getString(next));
                }
            }
            String sb3 = sb.toString();
            URI uri = this.f9912f.toURI();
            if (z5) {
                this.f9912f = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), sb3, uri.getFragment()).toURL();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(uri.getScheme());
                sb4.append("://");
                sb4.append(uri.getAuthority());
                sb4.append(uri.getPath());
                sb4.append(sb3.equals("") ? "" : "?" + sb3);
                sb4.append(uri.getFragment() != null ? uri.getFragment() : "");
                this.f9912f = new URL(sb4.toString());
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(Integer num, Integer num2);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 z0.d$d, still in use, count: 1, list:
      (r0v4 z0.d$d) from 0x0042: SPUT (r0v4 z0.d$d) z0.d.d.g z0.d$d
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: z0.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class EnumC0152d {
        ARRAY_BUFFER("arraybuffer"),
        BLOB("blob"),
        DOCUMENT("document"),
        JSON("json"),
        TEXT("text");


        /* renamed from: g, reason: collision with root package name */
        static final EnumC0152d f9919g = new EnumC0152d("text");

        /* renamed from: a, reason: collision with root package name */
        private final String f9921a;

        static {
        }

        private EnumC0152d(String str) {
            this.f9921a = str;
        }

        public static EnumC0152d b(String str) {
            for (EnumC0152d enumC0152d : values()) {
                if (enumC0152d.f9921a.equalsIgnoreCase(str)) {
                    return enumC0152d;
                }
            }
            return f9919g;
        }

        public static EnumC0152d valueOf(String str) {
            return (EnumC0152d) Enum.valueOf(EnumC0152d.class, str);
        }

        public static EnumC0152d[] values() {
            return (EnumC0152d[]) f9920h.clone();
        }
    }

    public static j0 a(z0.c cVar, EnumC0152d enumC0152d) {
        int h6 = cVar.h();
        j0 j0Var = new j0();
        j0Var.put("status", h6);
        j0Var.put("headers", b(cVar));
        j0Var.put("url", cVar.i());
        j0Var.put("data", f(cVar, enumC0152d));
        if (cVar.a() != null) {
            j0Var.put("error", true);
        }
        return j0Var;
    }

    public static j0 b(z0.c cVar) {
        j0 j0Var = new j0();
        for (Map.Entry entry : cVar.g().entrySet()) {
            j0Var.m((String) entry.getKey(), TextUtils.join(", ", (Iterable) entry.getValue()));
        }
        return j0Var;
    }

    private static Boolean c(h hVar, URL url) {
        try {
            Class<?> cls = Class.forName("io.ionic.sslpinning.SSLPinning");
            return (Boolean) cls.getDeclaredMethod("isDomainExcluded", h.class, URL.class).invoke(cls.newInstance(), hVar, url);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public static boolean d(String str, f... fVarArr) {
        if (str != null) {
            for (f fVar : fVarArr) {
                if (str.contains(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object e(String str) {
        new JSONObject();
        try {
            if ("null".equals(str.trim())) {
                return JSONObject.NULL;
            }
            if ("true".equals(str.trim())) {
                return Boolean.TRUE;
            }
            if ("false".equals(str.trim())) {
                return Boolean.FALSE;
            }
            if (str.trim().length() <= 0) {
                return "";
            }
            if (str.trim().matches("^\".*\"$")) {
                return str.trim().substring(1, str.trim().length() - 1);
            }
            if (str.trim().matches("^-?\\d+$")) {
                return Integer.valueOf(Integer.parseInt(str.trim()));
            }
            if (str.trim().matches("^-?\\d+(\\.\\d+)?$")) {
                return Double.valueOf(Double.parseDouble(str.trim()));
            }
            try {
                return new j0(str);
            } catch (JSONException unused) {
                return new g0(str);
            }
        } catch (JSONException unused2) {
            return str;
        }
    }

    public static Object f(e eVar, EnumC0152d enumC0152d) {
        String h6;
        InputStream a6 = eVar.a();
        String c6 = eVar.c("Content-Type");
        if (a6 != null) {
            if (!d(c6, f.APPLICATION_JSON, f.APPLICATION_VND_API_JSON)) {
                return h(a6);
            }
            h6 = h(a6);
        } else {
            if (c6 == null || !c6.contains(f.APPLICATION_JSON.b())) {
                InputStream b6 = eVar.b();
                int i6 = a.f9906a[enumC0152d.ordinal()];
                if (i6 == 1 || i6 == 2) {
                    return g(b6);
                }
                String h7 = h(b6);
                return i6 != 3 ? h7 : e(h7);
            }
            h6 = h(eVar.b());
        }
        return e(h6);
    }

    public static String g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    String encodeToString = Base64.encodeToString(byteArray, 0, byteArray.length, 0);
                    byteArrayOutputStream.close();
                    return encodeToString;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String h(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            String readLine = bufferedReader.readLine();
            while (readLine != null) {
                sb.append(readLine);
                readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(System.getProperty("line.separator"));
                }
            }
            String sb2 = sb.toString();
            bufferedReader.close();
            return sb2;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static j0 i(v0 v0Var, String str, h hVar) {
        String o6 = v0Var.o("url", "");
        j0 l6 = v0Var.l("headers", new j0());
        j0 l7 = v0Var.l("params", new j0());
        Integer i6 = v0Var.i("connectTimeout");
        Integer i7 = v0Var.i("readTimeout");
        Boolean e6 = v0Var.e("disableRedirects");
        Boolean f6 = v0Var.f("shouldEncodeUrlParams", Boolean.TRUE);
        EnumC0152d b6 = EnumC0152d.b(v0Var.n("responseType"));
        String n6 = v0Var.n("dataType");
        if (str == null) {
            str = v0Var.o("method", "GET");
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        boolean z5 = upperCase.equals("DELETE") || upperCase.equals("PATCH") || upperCase.equals("POST") || upperCase.equals("PUT");
        URL url = new URL(o6);
        z0.c a6 = new b().h(url).f(upperCase).e(l6).i(l7, f6.booleanValue()).c(i6).g(i7).d(e6).b().a();
        if (hVar != null && !c(hVar, url).booleanValue()) {
            a6.s(hVar);
        }
        if (z5) {
            k0 k0Var = new k0(v0Var, "data");
            if (k0Var.a() != null) {
                a6.n(true);
                a6.p(v0Var, k0Var, n6);
            }
        }
        v0Var.h().put("activeCapacitorHttpUrlConnection", a6);
        a6.e();
        j0 a7 = a(a6, b6);
        a6.f();
        v0Var.h().remove("activeCapacitorHttpUrlConnection");
        return a7;
    }
}
