package k2;

import O5.I;
import P5.AbstractC1378t;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import f2.AbstractC2816a;
import g2.C2877q;
import g2.InterfaceC2865e;
import h2.InterfaceC2898b;
import i2.C2977a;
import j6.n;
import java.io.InputStream;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class c extends WebView implements C2877q.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2898b f34093a;

    /* renamed from: b, reason: collision with root package name */
    private final f f34094b;

    /* renamed from: c, reason: collision with root package name */
    private Function1 f34095c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34096d;

    /* loaded from: classes4.dex */
    public static final class a extends WebChromeClient {

        /* renamed from: k2.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0780a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebChromeClient.CustomViewCallback f34098a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0780a(WebChromeClient.CustomViewCallback customViewCallback) {
                super(0);
                this.f34098a = customViewCallback;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5603invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5603invoke() {
                this.f34098a.onCustomViewHidden();
            }
        }

        a() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            if (defaultVideoPoster == null) {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
            }
            return defaultVideoPoster;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            super.onHideCustomView();
            c.this.f34093a.onExitFullscreen();
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
            AbstractC3255y.i(view, "view");
            AbstractC3255y.i(callback, "callback");
            super.onShowCustomView(view, callback);
            c.this.f34093a.a(view, new C0780a(callback));
        }
    }

    public /* synthetic */ c(Context context, InterfaceC2898b interfaceC2898b, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, interfaceC2898b, (i9 & 4) != 0 ? null : attributeSet, (i9 & 8) != 0 ? 0 : i8);
    }

    private final void d(C2977a c2977a) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setCacheMode(-1);
        addJavascriptInterface(new C2877q(this), "YouTubePlayerBridge");
        InputStream openRawResource = getResources().openRawResource(AbstractC2816a.f31856a);
        AbstractC3255y.h(openRawResource, "resources.openRawResourc…R.raw.ayp_youtube_player)");
        loadDataWithBaseURL(c2977a.b(), n.A(d.a(openRawResource), "<<injectedPlayerVars>>", c2977a.toString(), false, 4, null), "text/html", "utf-8", null);
        setWebChromeClient(new a());
    }

    @Override // g2.C2877q.b
    public void a() {
        Function1 function1 = this.f34095c;
        if (function1 == null) {
            AbstractC3255y.y("youTubePlayerInitListener");
            function1 = null;
        }
        function1.invoke(this.f34094b);
    }

    public final boolean c(h2.c listener) {
        AbstractC3255y.i(listener, "listener");
        return this.f34094b.h().add(listener);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f34094b.k();
        super.destroy();
    }

    public final void e(Function1 initListener, C2977a c2977a) {
        AbstractC3255y.i(initListener, "initListener");
        this.f34095c = initListener;
        if (c2977a == null) {
            c2977a = C2977a.f32867b.a();
        }
        d(c2977a);
    }

    public final boolean f() {
        return this.f34096d;
    }

    @Override // g2.C2877q.b
    public InterfaceC2865e getInstance() {
        return this.f34094b;
    }

    @Override // g2.C2877q.b
    public Collection<h2.c> getListeners() {
        return AbstractC1378t.b1(this.f34094b.h());
    }

    public final InterfaceC2865e getYoutubePlayer$core_release() {
        return this.f34094b;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i8) {
        if (this.f34096d && (i8 == 8 || i8 == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i8);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z8) {
        this.f34096d = z8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, InterfaceC2898b listener, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f34093a = listener;
        this.f34094b = new f(this);
    }
}
