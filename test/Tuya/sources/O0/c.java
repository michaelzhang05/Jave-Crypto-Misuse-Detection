package O0;

import H0.C1182p;
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
    private final String f7691a;

    /* renamed from: b, reason: collision with root package name */
    private final L0.b f7692b;

    /* renamed from: c, reason: collision with root package name */
    private final E0.f f7693c;

    public c(String str, L0.b bVar) {
        this(str, bVar, E0.f.f());
    }

    private L0.a b(L0.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f7722a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C1182p.i());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f7723b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f7724c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f7725d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f7726e.a().c());
        return aVar;
    }

    private void c(L0.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e8) {
            this.f7693c.l("Failed to parse settings JSON from " + this.f7691a, e8);
            this.f7693c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f7729h);
        hashMap.put("display_version", jVar.f7728g);
        hashMap.put("source", Integer.toString(jVar.f7730i));
        String str = jVar.f7727f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // O0.k
    public JSONObject a(j jVar, boolean z8) {
        if (z8) {
            try {
                Map f8 = f(jVar);
                L0.a b8 = b(d(f8), jVar);
                this.f7693c.b("Requesting settings from " + this.f7691a);
                this.f7693c.i("Settings query params were: " + f8);
                return g(b8.c());
            } catch (IOException e8) {
                this.f7693c.e("Settings request failed.", e8);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected L0.a d(Map map) {
        return this.f7692b.a(this.f7691a, map).d(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/" + C1182p.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(L0.c cVar) {
        int b8 = cVar.b();
        this.f7693c.i("Settings response code was: " + b8);
        if (h(b8)) {
            return e(cVar.a());
        }
        this.f7693c.d("Settings request failed; (status: " + b8 + ") from " + this.f7691a);
        return null;
    }

    boolean h(int i8) {
        if (i8 != 200 && i8 != 201 && i8 != 202 && i8 != 203) {
            return false;
        }
        return true;
    }

    c(String str, L0.b bVar, E0.f fVar) {
        if (str != null) {
            this.f7693c = fVar;
            this.f7692b = bVar;
            this.f7691a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
