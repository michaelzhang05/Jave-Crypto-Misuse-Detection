package Q0;

import J0.C1283s;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c implements k {

    /* renamed from: a, reason: collision with root package name */
    private final String f9090a;

    /* renamed from: b, reason: collision with root package name */
    private final N0.b f9091b;

    /* renamed from: c, reason: collision with root package name */
    private final G0.h f9092c;

    public c(String str, N0.b bVar) {
        this(str, bVar, G0.h.f());
    }

    private N0.a b(N0.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f9121a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C1283s.i());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f9122b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f9123c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f9124d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f9125e.a().c());
        return aVar;
    }

    private void c(N0.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e8) {
            this.f9092c.l("Failed to parse settings JSON from " + this.f9090a, e8);
            this.f9092c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f9128h);
        hashMap.put("display_version", jVar.f9127g);
        hashMap.put("source", Integer.toString(jVar.f9129i));
        String str = jVar.f9126f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // Q0.k
    public JSONObject a(j jVar, boolean z8) {
        if (z8) {
            try {
                Map f8 = f(jVar);
                N0.a b8 = b(d(f8), jVar);
                this.f9092c.b("Requesting settings from " + this.f9090a);
                this.f9092c.i("Settings query params were: " + f8);
                return g(b8.c());
            } catch (IOException e8) {
                this.f9092c.e("Settings request failed.", e8);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected N0.a d(Map map) {
        return this.f9091b.a(this.f9090a, map).d(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/" + C1283s.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(N0.c cVar) {
        int b8 = cVar.b();
        this.f9092c.i("Settings response code was: " + b8);
        if (h(b8)) {
            return e(cVar.a());
        }
        this.f9092c.d("Settings request failed; (status: " + b8 + ") from " + this.f9090a);
        return null;
    }

    boolean h(int i8) {
        if (i8 != 200 && i8 != 201 && i8 != 202 && i8 != 203) {
            return false;
        }
        return true;
    }

    c(String str, N0.b bVar, G0.h hVar) {
        if (str != null) {
            this.f9092c = hVar;
            this.f9091b = bVar;
            this.f9090a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
