package k2;

import O5.I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import g2.EnumC2864d;
import g2.InterfaceC2865e;
import h2.AbstractC2897a;
import h2.InterfaceC2898b;
import i2.C2977a;
import j2.C3182b;
import j2.C3186f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3212a extends k2.b {

    /* renamed from: a, reason: collision with root package name */
    private final k2.c f34078a;

    /* renamed from: b, reason: collision with root package name */
    private final C3182b f34079b;

    /* renamed from: c, reason: collision with root package name */
    private final C3186f f34080c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34081d;

    /* renamed from: e, reason: collision with root package name */
    private Function0 f34082e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f34083f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34084g;

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0778a extends AbstractC2897a {
        C0778a() {
        }

        @Override // h2.AbstractC2897a, h2.c
        public void f(InterfaceC2865e youTubePlayer, EnumC2864d state) {
            AbstractC3255y.i(youTubePlayer, "youTubePlayer");
            AbstractC3255y.i(state, "state");
            if (state == EnumC2864d.PLAYING && !C3212a.this.f()) {
                youTubePlayer.pause();
            }
        }
    }

    /* renamed from: k2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2897a {
        b() {
        }

        @Override // h2.AbstractC2897a, h2.c
        public void c(InterfaceC2865e youTubePlayer) {
            AbstractC3255y.i(youTubePlayer, "youTubePlayer");
            C3212a.this.setYouTubePlayerReady$core_release(true);
            Iterator it = C3212a.this.f34083f.iterator();
            if (!it.hasNext()) {
                C3212a.this.f34083f.clear();
                youTubePlayer.a(this);
            } else {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
        }
    }

    /* renamed from: k2.a$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f34088a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5601invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5601invoke() {
        }
    }

    /* renamed from: k2.a$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2977a f34090b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h2.c f34091c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k2.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0779a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h2.c f34092a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0779a(h2.c cVar) {
                super(1);
                this.f34092a = cVar;
            }

            public final void a(InterfaceC2865e it) {
                AbstractC3255y.i(it, "it");
                it.d(this.f34092a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC2865e) obj);
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C2977a c2977a, h2.c cVar) {
            super(0);
            this.f34090b = c2977a;
            this.f34091c = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5602invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5602invoke() {
            C3212a.this.getWebViewYouTubePlayer$core_release().e(new C0779a(this.f34091c), this.f34090b);
        }
    }

    public /* synthetic */ C3212a(Context context, InterfaceC2898b interfaceC2898b, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, interfaceC2898b, (i9 & 4) != 0 ? null : attributeSet, (i9 & 8) != 0 ? 0 : i8);
    }

    public final View d(int i8) {
        removeViews(1, getChildCount() - 1);
        View inflate = View.inflate(getContext(), i8, this);
        AbstractC3255y.h(inflate, "inflate(context, layoutId, this)");
        return inflate;
    }

    public final void e(h2.c youTubePlayerListener, boolean z8, C2977a playerOptions) {
        AbstractC3255y.i(youTubePlayerListener, "youTubePlayerListener");
        AbstractC3255y.i(playerOptions, "playerOptions");
        if (!this.f34081d) {
            if (z8) {
                this.f34079b.e();
            }
            e eVar = new e(playerOptions, youTubePlayerListener);
            this.f34082e = eVar;
            if (!z8) {
                eVar.invoke();
                return;
            }
            return;
        }
        throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
    }

    public final boolean f() {
        if (!this.f34084g && !this.f34078a.f()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return this.f34081d;
    }

    public final boolean getCanPlay$core_release() {
        return this.f34084g;
    }

    public final k2.c getWebViewYouTubePlayer$core_release() {
        return this.f34078a;
    }

    public final void h() {
        this.f34080c.k();
        this.f34084g = true;
    }

    public final void i() {
        this.f34078a.getYoutubePlayer$core_release().pause();
        this.f34080c.l();
        this.f34084g = false;
    }

    public final void j() {
        this.f34079b.a();
        removeView(this.f34078a);
        this.f34078a.removeAllViews();
        this.f34078a.destroy();
    }

    public final void setCustomPlayerUi(View view) {
        AbstractC3255y.i(view, "view");
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z8) {
        this.f34081d = z8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3212a(Context context, InterfaceC2898b listener, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        k2.c cVar = new k2.c(context, listener, null, 0, 12, null);
        this.f34078a = cVar;
        Context applicationContext = context.getApplicationContext();
        AbstractC3255y.h(applicationContext, "context.applicationContext");
        C3182b c3182b = new C3182b(applicationContext);
        this.f34079b = c3182b;
        C3186f c3186f = new C3186f();
        this.f34080c = c3186f;
        this.f34082e = d.f34088a;
        this.f34083f = new LinkedHashSet();
        this.f34084g = true;
        addView(cVar, new FrameLayout.LayoutParams(-1, -1));
        cVar.c(c3186f);
        cVar.c(new C0778a());
        cVar.c(new b());
        c3182b.d().add(new c());
    }

    /* renamed from: k2.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements C3182b.a {
        c() {
        }

        @Override // j2.C3182b.a
        public void a() {
            if (!C3212a.this.g()) {
                C3212a.this.f34082e.invoke();
            } else {
                C3212a.this.f34080c.m(C3212a.this.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release());
            }
        }

        @Override // j2.C3182b.a
        public void b() {
        }
    }
}
