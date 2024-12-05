package G1;

import B1.d;
import B1.m;
import B1.n;
import E1.g;
import H1.f;
import android.os.Handler;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c extends G1.a {

    /* renamed from: f, reason: collision with root package name */
    private WebView f2928f;

    /* renamed from: g, reason: collision with root package name */
    private Long f2929g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map f2930h;

    /* renamed from: i, reason: collision with root package name */
    private final String f2931i;

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f2932a;

        a() {
            this.f2932a = c.this.f2928f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2932a.destroy();
        }
    }

    public c(Map map, String str) {
        this.f2930h = map;
        this.f2931i = str;
    }

    @Override // G1.a
    public void e(n nVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map f8 = dVar.f();
        for (String str : f8.keySet()) {
            H1.c.i(jSONObject, str, ((m) f8.get(str)).f());
        }
        f(nVar, dVar, jSONObject);
    }

    @Override // G1.a
    public void o() {
        long convert;
        super.o();
        if (this.f2929g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(f.b() - this.f2929g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f2928f = null;
    }

    @Override // G1.a
    public void w() {
        super.w();
        y();
    }

    void y() {
        WebView webView = new WebView(E1.f.c().a());
        this.f2928f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f2928f.getSettings().setAllowContentAccess(false);
        h(this.f2928f);
        g.a().p(this.f2928f, this.f2931i);
        for (String str : this.f2930h.keySet()) {
            g.a().e(this.f2928f, ((m) this.f2930h.get(str)).c().toExternalForm(), str);
        }
        this.f2929g = Long.valueOf(f.b());
    }
}
