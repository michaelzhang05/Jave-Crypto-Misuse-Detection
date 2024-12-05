package h2;

import L5.I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d2.EnumC2540d;
import d2.InterfaceC2541e;
import e2.AbstractC2577a;
import e2.InterfaceC2578b;
import f2.C2659a;
import g2.C2705b;
import g2.C2709f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2745a extends h2.b {

    /* renamed from: a, reason: collision with root package name */
    private final h2.c f31357a;

    /* renamed from: b, reason: collision with root package name */
    private final C2705b f31358b;

    /* renamed from: c, reason: collision with root package name */
    private final C2709f f31359c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31360d;

    /* renamed from: e, reason: collision with root package name */
    private Function0 f31361e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f31362f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31363g;

    /* renamed from: h2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0752a extends AbstractC2577a {
        C0752a() {
        }

        @Override // e2.AbstractC2577a, e2.c
        public void j(InterfaceC2541e youTubePlayer, EnumC2540d state) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            AbstractC3159y.i(state, "state");
            if (state == EnumC2540d.PLAYING && !C2745a.this.f()) {
                youTubePlayer.pause();
            }
        }
    }

    /* renamed from: h2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2577a {
        b() {
        }

        @Override // e2.AbstractC2577a, e2.c
        public void g(InterfaceC2541e youTubePlayer) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            C2745a.this.setYouTubePlayerReady$core_release(true);
            Iterator it = C2745a.this.f31362f.iterator();
            if (!it.hasNext()) {
                C2745a.this.f31362f.clear();
                youTubePlayer.c(this);
            } else {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
        }
    }

    /* renamed from: h2.a$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f31367a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5588invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5588invoke() {
        }
    }

    /* renamed from: h2.a$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2659a f31369b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2.c f31370c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h2.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0753a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2.c f31371a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0753a(e2.c cVar) {
                super(1);
                this.f31371a = cVar;
            }

            public final void a(InterfaceC2541e it) {
                AbstractC3159y.i(it, "it");
                it.a(this.f31371a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC2541e) obj);
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C2659a c2659a, e2.c cVar) {
            super(0);
            this.f31369b = c2659a;
            this.f31370c = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5589invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5589invoke() {
            C2745a.this.getWebViewYouTubePlayer$core_release().e(new C0753a(this.f31370c), this.f31369b);
        }
    }

    public /* synthetic */ C2745a(Context context, InterfaceC2578b interfaceC2578b, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, interfaceC2578b, (i9 & 4) != 0 ? null : attributeSet, (i9 & 8) != 0 ? 0 : i8);
    }

    public final View d(int i8) {
        removeViews(1, getChildCount() - 1);
        View inflate = View.inflate(getContext(), i8, this);
        AbstractC3159y.h(inflate, "inflate(context, layoutId, this)");
        return inflate;
    }

    public final void e(e2.c youTubePlayerListener, boolean z8, C2659a playerOptions) {
        AbstractC3159y.i(youTubePlayerListener, "youTubePlayerListener");
        AbstractC3159y.i(playerOptions, "playerOptions");
        if (!this.f31360d) {
            if (z8) {
                this.f31358b.e();
            }
            e eVar = new e(playerOptions, youTubePlayerListener);
            this.f31361e = eVar;
            if (!z8) {
                eVar.invoke();
                return;
            }
            return;
        }
        throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
    }

    public final boolean f() {
        if (!this.f31363g && !this.f31357a.f()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return this.f31360d;
    }

    public final boolean getCanPlay$core_release() {
        return this.f31363g;
    }

    public final h2.c getWebViewYouTubePlayer$core_release() {
        return this.f31357a;
    }

    public final void h() {
        this.f31359c.k();
        this.f31363g = true;
    }

    public final void i() {
        this.f31357a.getYoutubePlayer$core_release().pause();
        this.f31359c.l();
        this.f31363g = false;
    }

    public final void j() {
        this.f31358b.a();
        removeView(this.f31357a);
        this.f31357a.removeAllViews();
        this.f31357a.destroy();
    }

    public final void setCustomPlayerUi(View view) {
        AbstractC3159y.i(view, "view");
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z8) {
        this.f31360d = z8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2745a(Context context, InterfaceC2578b listener, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        h2.c cVar = new h2.c(context, listener, null, 0, 12, null);
        this.f31357a = cVar;
        Context applicationContext = context.getApplicationContext();
        AbstractC3159y.h(applicationContext, "context.applicationContext");
        C2705b c2705b = new C2705b(applicationContext);
        this.f31358b = c2705b;
        C2709f c2709f = new C2709f();
        this.f31359c = c2709f;
        this.f31361e = d.f31367a;
        this.f31362f = new LinkedHashSet();
        this.f31363g = true;
        addView(cVar, new FrameLayout.LayoutParams(-1, -1));
        cVar.c(c2709f);
        cVar.c(new C0752a());
        cVar.c(new b());
        c2705b.d().add(new c());
    }

    /* renamed from: h2.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements C2705b.a {
        c() {
        }

        @Override // g2.C2705b.a
        public void a() {
            if (!C2745a.this.g()) {
                C2745a.this.f31361e.invoke();
            } else {
                C2745a.this.f31359c.m(C2745a.this.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release());
            }
        }

        @Override // g2.C2705b.a
        public void b() {
        }
    }
}
