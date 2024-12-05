package h2;

import M5.AbstractC1246t;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import d2.InterfaceC2541e;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class f implements InterfaceC2541e {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f31381a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f31382b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f31383c;

    public f(WebView webView) {
        AbstractC3159y.i(webView, "webView");
        this.f31381a = webView;
        this.f31382b = new Handler(Looper.getMainLooper());
        this.f31383c = new LinkedHashSet();
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
        this.f31382b.post(new Runnable() { // from class: h2.e
            @Override // java.lang.Runnable
            public final void run() {
                f.j(webView, str, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WebView this_invoke, String function, List stringArgs) {
        AbstractC3159y.i(this_invoke, "$this_invoke");
        AbstractC3159y.i(function, "$function");
        AbstractC3159y.i(stringArgs, "$stringArgs");
        this_invoke.loadUrl("javascript:" + function + '(' + AbstractC1246t.w0(stringArgs, ",", null, null, 0, null, null, 62, null) + ')');
    }

    @Override // d2.InterfaceC2541e
    public boolean a(e2.c listener) {
        AbstractC3159y.i(listener, "listener");
        return this.f31383c.add(listener);
    }

    @Override // d2.InterfaceC2541e
    public void b() {
        i(this.f31381a, "toggleFullscreen", new Object[0]);
    }

    @Override // d2.InterfaceC2541e
    public boolean c(e2.c listener) {
        AbstractC3159y.i(listener, "listener");
        return this.f31383c.remove(listener);
    }

    @Override // d2.InterfaceC2541e
    public void d(String videoId, float f8) {
        AbstractC3159y.i(videoId, "videoId");
        i(this.f31381a, "cueVideo", videoId, Float.valueOf(f8));
    }

    @Override // d2.InterfaceC2541e
    public void e(String videoId, float f8) {
        AbstractC3159y.i(videoId, "videoId");
        i(this.f31381a, "loadVideo", videoId, Float.valueOf(f8));
    }

    @Override // d2.InterfaceC2541e
    public void f() {
        i(this.f31381a, CampaignEx.JSON_NATIVE_VIDEO_MUTE, new Object[0]);
    }

    public final Set h() {
        return this.f31383c;
    }

    public final void k() {
        this.f31383c.clear();
        this.f31382b.removeCallbacksAndMessages(null);
    }

    @Override // d2.InterfaceC2541e
    public void pause() {
        i(this.f31381a, "pauseVideo", new Object[0]);
    }

    @Override // d2.InterfaceC2541e
    public void play() {
        i(this.f31381a, "playVideo", new Object[0]);
    }
}
