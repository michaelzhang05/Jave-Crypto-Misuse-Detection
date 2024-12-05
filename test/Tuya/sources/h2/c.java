package h2;

import L5.I;
import M5.AbstractC1246t;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c2.AbstractC1906a;
import d2.C2553q;
import d2.InterfaceC2541e;
import e2.InterfaceC2578b;
import f2.C2659a;
import g6.n;
import java.io.InputStream;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class c extends WebView implements C2553q.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2578b f31372a;

    /* renamed from: b, reason: collision with root package name */
    private final f f31373b;

    /* renamed from: c, reason: collision with root package name */
    private Function1 f31374c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31375d;

    /* loaded from: classes4.dex */
    public static final class a extends WebChromeClient {

        /* renamed from: h2.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0754a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebChromeClient.CustomViewCallback f31377a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0754a(WebChromeClient.CustomViewCallback customViewCallback) {
                super(0);
                this.f31377a = customViewCallback;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5590invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5590invoke() {
                this.f31377a.onCustomViewHidden();
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
            c.this.f31372a.onExitFullscreen();
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
            AbstractC3159y.i(view, "view");
            AbstractC3159y.i(callback, "callback");
            super.onShowCustomView(view, callback);
            c.this.f31372a.a(view, new C0754a(callback));
        }
    }

    public /* synthetic */ c(Context context, InterfaceC2578b interfaceC2578b, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, interfaceC2578b, (i9 & 4) != 0 ? null : attributeSet, (i9 & 8) != 0 ? 0 : i8);
    }

    private final void d(C2659a c2659a) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setCacheMode(-1);
        addJavascriptInterface(new C2553q(this), "YouTubePlayerBridge");
        InputStream openRawResource = getResources().openRawResource(AbstractC1906a.f14881a);
        AbstractC3159y.h(openRawResource, "resources.openRawResourc…R.raw.ayp_youtube_player)");
        loadDataWithBaseURL(c2659a.b(), n.A(d.a(openRawResource), "<<injectedPlayerVars>>", c2659a.toString(), false, 4, null), "text/html", "utf-8", null);
        setWebChromeClient(new a());
    }

    @Override // d2.C2553q.b
    public void a() {
        Function1 function1 = this.f31374c;
        if (function1 == null) {
            AbstractC3159y.y("youTubePlayerInitListener");
            function1 = null;
        }
        function1.invoke(this.f31373b);
    }

    public final boolean c(e2.c listener) {
        AbstractC3159y.i(listener, "listener");
        return this.f31373b.h().add(listener);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f31373b.k();
        super.destroy();
    }

    public final void e(Function1 initListener, C2659a c2659a) {
        AbstractC3159y.i(initListener, "initListener");
        this.f31374c = initListener;
        if (c2659a == null) {
            c2659a = C2659a.f31004b.a();
        }
        d(c2659a);
    }

    public final boolean f() {
        return this.f31375d;
    }

    @Override // d2.C2553q.b
    public InterfaceC2541e getInstance() {
        return this.f31373b;
    }

    @Override // d2.C2553q.b
    public Collection<e2.c> getListeners() {
        return AbstractC1246t.b1(this.f31373b.h());
    }

    public final InterfaceC2541e getYoutubePlayer$core_release() {
        return this.f31373b;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i8) {
        if (this.f31375d && (i8 == 8 || i8 == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i8);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z8) {
        this.f31375d = z8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, InterfaceC2578b listener, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f31372a = listener;
        this.f31373b = new f(this);
    }
}
