package D1;

import B1.g;
import E1.f;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import y1.C3968a;
import y1.C3970c;
import y1.C3971d;
import y1.C3980m;
import y1.C3981n;
import z1.C4014b;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private H1.b f1377a;

    /* renamed from: b, reason: collision with root package name */
    private C3968a f1378b;

    /* renamed from: c, reason: collision with root package name */
    private C4014b f1379c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC0026a f1380d;

    /* renamed from: e, reason: collision with root package name */
    private long f1381e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D1.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0026a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a() {
        a();
        this.f1377a = new H1.b(null);
    }

    public void a() {
        this.f1381e = f.b();
        this.f1380d = EnumC0026a.AD_STATE_IDLE;
    }

    public void b(float f8) {
        g.a().c(v(), f8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(WebView webView) {
        this.f1377a = new H1.b(webView);
    }

    public void d(String str) {
        g.a().f(v(), str, null);
    }

    public void e(String str, long j8) {
        if (j8 >= this.f1381e) {
            EnumC0026a enumC0026a = this.f1380d;
            EnumC0026a enumC0026a2 = EnumC0026a.AD_STATE_NOTVISIBLE;
            if (enumC0026a != enumC0026a2) {
                this.f1380d = enumC0026a2;
                g.a().d(v(), str);
            }
        }
    }

    public void f(String str, JSONObject jSONObject) {
        g.a().f(v(), str, jSONObject);
    }

    public void g(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        E1.c.h(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        g.a().o(v(), jSONObject);
    }

    public void h(JSONObject jSONObject) {
        g.a().n(v(), jSONObject);
    }

    public void i(C3968a c3968a) {
        this.f1378b = c3968a;
    }

    public void j(C3970c c3970c) {
        g.a().j(v(), c3970c.d());
    }

    public void k(C3981n c3981n, C3971d c3971d) {
        l(c3981n, c3971d, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(C3981n c3981n, C3971d c3971d, JSONObject jSONObject) {
        String v8 = c3981n.v();
        JSONObject jSONObject2 = new JSONObject();
        E1.c.h(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        E1.c.h(jSONObject2, "adSessionType", c3971d.c());
        E1.c.h(jSONObject2, "deviceInfo", E1.b.d());
        E1.c.h(jSONObject2, "deviceCategory", E1.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        E1.c.h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        E1.c.h(jSONObject3, "partnerName", c3971d.h().b());
        E1.c.h(jSONObject3, "partnerVersion", c3971d.h().c());
        E1.c.h(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        E1.c.h(jSONObject4, "libraryVersion", "1.4.2-Mmadbridge");
        E1.c.h(jSONObject4, "appId", B1.f.c().a().getApplicationContext().getPackageName());
        E1.c.h(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (c3971d.d() != null) {
            E1.c.h(jSONObject2, "contentUrl", c3971d.d());
        }
        if (c3971d.e() != null) {
            E1.c.h(jSONObject2, "customReferenceData", c3971d.e());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (C3980m c3980m : c3971d.i()) {
            E1.c.h(jSONObject5, c3980m.d(), c3980m.e());
        }
        g.a().g(v(), v8, jSONObject2, jSONObject5, jSONObject);
    }

    public void m(C4014b c4014b) {
        this.f1379c = c4014b;
    }

    public void n(boolean z8) {
        String str;
        if (s()) {
            if (z8) {
                str = "foregrounded";
            } else {
                str = "backgrounded";
            }
            g.a().m(v(), str);
        }
    }

    public void o() {
        this.f1377a.clear();
    }

    public void p(String str, long j8) {
        if (j8 >= this.f1381e) {
            this.f1380d = EnumC0026a.AD_STATE_VISIBLE;
            g.a().d(v(), str);
        }
    }

    public C3968a q() {
        return this.f1378b;
    }

    public C4014b r() {
        return this.f1379c;
    }

    public boolean s() {
        if (this.f1377a.get() != 0) {
            return true;
        }
        return false;
    }

    public void t() {
        g.a().b(v());
    }

    public void u() {
        g.a().l(v());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView v() {
        return (WebView) this.f1377a.get();
    }

    public void w() {
    }
}
