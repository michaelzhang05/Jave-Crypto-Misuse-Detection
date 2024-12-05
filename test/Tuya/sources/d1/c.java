package D1;

import B1.g;
import E1.f;
import android.os.Handler;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import y1.C3971d;
import y1.C3980m;
import y1.C3981n;

/* loaded from: classes3.dex */
public class c extends D1.a {

    /* renamed from: f, reason: collision with root package name */
    private WebView f1386f;

    /* renamed from: g, reason: collision with root package name */
    private Long f1387g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map f1388h;

    /* renamed from: i, reason: collision with root package name */
    private final String f1389i;

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f1390a;

        a() {
            this.f1390a = c.this.f1386f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1390a.destroy();
        }
    }

    public c(Map map, String str) {
        this.f1388h = map;
        this.f1389i = str;
    }

    @Override // D1.a
    public void k(C3981n c3981n, C3971d c3971d) {
        JSONObject jSONObject = new JSONObject();
        Map f8 = c3971d.f();
        for (String str : f8.keySet()) {
            E1.c.h(jSONObject, str, ((C3980m) f8.get(str)).f());
        }
        l(c3981n, c3971d, jSONObject);
    }

    @Override // D1.a
    public void o() {
        long convert;
        super.o();
        if (this.f1387g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(f.b() - this.f1387g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f1386f = null;
    }

    @Override // D1.a
    public void w() {
        super.w();
        y();
    }

    void y() {
        WebView webView = new WebView(B1.f.c().a());
        this.f1386f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f1386f.getSettings().setAllowContentAccess(false);
        c(this.f1386f);
        g.a().p(this.f1386f, this.f1389i);
        for (String str : this.f1388h.keySet()) {
            g.a().e(this.f1386f, ((C3980m) this.f1388h.get(str)).c().toExternalForm(), str);
        }
        this.f1387g = Long.valueOf(f.b());
    }
}
