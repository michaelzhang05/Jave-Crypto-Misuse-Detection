package k2;

import P5.AbstractC1378t;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import g2.InterfaceC2865e;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class f implements InterfaceC2865e {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f34102a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f34103b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f34104c;

    public f(WebView webView) {
        AbstractC3255y.i(webView, "webView");
        this.f34102a = webView;
        this.f34103b = new Handler(Looper.getMainLooper());
        this.f34104c = new LinkedHashSet();
    }

    private final void i(final WebView webView, final String str, Object... objArr) {
        String obj;
        final ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            if (obj2 instanceof String) {
                StringBuilder sb = new StringBuilder();
                sb.append('\'');
                sb.append(obj2);
                sb.append('\'');
                obj = sb.toString();
            } else {
                obj = obj2.toString();
            }
            arrayList.add(obj);
        }
        this.f34103b.post(new Runnable() { // from class: k2.e
            @Override // java.lang.Runnable
            public final void run() {
                f.j(webView, str, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WebView this_invoke, String function, List stringArgs) {
        AbstractC3255y.i(this_invoke, "$this_invoke");
        AbstractC3255y.i(function, "$function");
        AbstractC3255y.i(stringArgs, "$stringArgs");
        this_invoke.loadUrl("javascript:" + function + '(' + AbstractC1378t.w0(stringArgs, ",", null, null, 0, null, null, 62, null) + ')');
    }

    @Override // g2.InterfaceC2865e
    public boolean a(h2.c listener) {
        AbstractC3255y.i(listener, "listener");
        return this.f34104c.remove(listener);
    }

    @Override // g2.InterfaceC2865e
    public void b() {
        i(this.f34102a, "toggleFullscreen", new Object[0]);
    }

    @Override // g2.InterfaceC2865e
    public void c(String videoId, float f8) {
        AbstractC3255y.i(videoId, "videoId");
        i(this.f34102a, "cueVideo", videoId, Float.valueOf(f8));
    }

    @Override // g2.InterfaceC2865e
    public boolean d(h2.c listener) {
        AbstractC3255y.i(listener, "listener");
        return this.f34104c.add(listener);
    }

    @Override // g2.InterfaceC2865e
    public void e(String videoId, float f8) {
        AbstractC3255y.i(videoId, "videoId");
        i(this.f34102a, "loadVideo", videoId, Float.valueOf(f8));
    }

    @Override // g2.InterfaceC2865e
    public void f() {
        i(this.f34102a, CampaignEx.JSON_NATIVE_VIDEO_MUTE, new Object[0]);
    }

    public final Set h() {
        return this.f34104c;
    }

    public final void k() {
        this.f34104c.clear();
        this.f34103b.removeCallbacksAndMessages(null);
    }

    @Override // g2.InterfaceC2865e
    public void pause() {
        i(this.f34102a, "pauseVideo", new Object[0]);
    }

    @Override // g2.InterfaceC2865e
    public void play() {
        i(this.f34102a, "playVideo", new Object[0]);
    }
}
