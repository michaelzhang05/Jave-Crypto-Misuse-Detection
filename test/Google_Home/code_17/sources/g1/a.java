package G1;

import B1.d;
import B1.m;
import B1.n;
import E1.g;
import H1.f;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private K1.b f2919a;

    /* renamed from: b, reason: collision with root package name */
    private B1.a f2920b;

    /* renamed from: c, reason: collision with root package name */
    private C1.b f2921c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC0051a f2922d;

    /* renamed from: e, reason: collision with root package name */
    private long f2923e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0051a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a() {
        a();
        this.f2919a = new K1.b(null);
    }

    public void a() {
        this.f2923e = f.b();
        this.f2922d = EnumC0051a.AD_STATE_IDLE;
    }

    public void b(float f8) {
        g.a().c(v(), f8);
    }

    public void c(B1.a aVar) {
        this.f2920b = aVar;
    }

    public void d(B1.c cVar) {
        g.a().j(v(), cVar.d());
    }

    public void e(n nVar, d dVar) {
        f(nVar, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(n nVar, d dVar, JSONObject jSONObject) {
        String v8 = nVar.v();
        JSONObject jSONObject2 = new JSONObject();
        H1.c.i(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        H1.c.i(jSONObject2, "adSessionType", dVar.c());
        H1.c.i(jSONObject2, "deviceInfo", H1.b.d());
        H1.c.i(jSONObject2, "deviceCategory", H1.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        H1.c.i(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        H1.c.i(jSONObject3, "partnerName", dVar.h().b());
        H1.c.i(jSONObject3, "partnerVersion", dVar.h().c());
        H1.c.i(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        H1.c.i(jSONObject4, "libraryVersion", "1.4.2-Mmadbridge");
        H1.c.i(jSONObject4, "appId", E1.f.c().a().getApplicationContext().getPackageName());
        H1.c.i(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (dVar.d() != null) {
            H1.c.i(jSONObject2, "contentUrl", dVar.d());
        }
        if (dVar.e() != null) {
            H1.c.i(jSONObject2, "customReferenceData", dVar.e());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (m mVar : dVar.i()) {
            H1.c.i(jSONObject5, mVar.d(), mVar.e());
        }
        g.a().g(v(), v8, jSONObject2, jSONObject5, jSONObject);
    }

    public void g(C1.b bVar) {
        this.f2921c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(WebView webView) {
        this.f2919a = new K1.b(webView);
    }

    public void i(String str) {
        g.a().f(v(), str, null);
    }

    public void j(String str, long j8) {
        if (j8 >= this.f2923e) {
            EnumC0051a enumC0051a = this.f2922d;
            EnumC0051a enumC0051a2 = EnumC0051a.AD_STATE_NOTVISIBLE;
            if (enumC0051a != enumC0051a2) {
                this.f2922d = enumC0051a2;
                g.a().d(v(), str);
            }
        }
    }

    public void k(String str, JSONObject jSONObject) {
        g.a().f(v(), str, jSONObject);
    }

    public void l(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        H1.c.i(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        g.a().o(v(), jSONObject);
    }

    public void m(JSONObject jSONObject) {
        g.a().n(v(), jSONObject);
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
        this.f2919a.clear();
    }

    public void p(String str, long j8) {
        if (j8 >= this.f2923e) {
            this.f2922d = EnumC0051a.AD_STATE_VISIBLE;
            g.a().d(v(), str);
        }
    }

    public B1.a q() {
        return this.f2920b;
    }

    public C1.b r() {
        return this.f2921c;
    }

    public boolean s() {
        if (this.f2919a.get() != 0) {
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
        return (WebView) this.f2919a.get();
    }

    public void w() {
    }
}
