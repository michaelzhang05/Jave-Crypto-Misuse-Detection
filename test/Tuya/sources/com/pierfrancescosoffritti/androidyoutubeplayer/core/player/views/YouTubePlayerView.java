package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import c2.AbstractC1907b;
import d2.InterfaceC2541e;
import e2.AbstractC2577a;
import e2.InterfaceC2578b;
import f2.C2659a;
import g2.AbstractC2711h;
import h2.C2745a;
import h2.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class YouTubePlayerView extends h2.b implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    private final List f23193a;

    /* renamed from: b, reason: collision with root package name */
    private final b f23194b;

    /* renamed from: c, reason: collision with root package name */
    private final C2745a f23195c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23196d;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23197a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f23197a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2578b {
        b() {
        }

        @Override // e2.InterfaceC2578b
        public void a(View fullscreenView, Function0 exitFullscreen) {
            AbstractC3159y.i(fullscreenView, "fullscreenView");
            AbstractC3159y.i(exitFullscreen, "exitFullscreen");
            if (!YouTubePlayerView.this.f23193a.isEmpty()) {
                Iterator it = YouTubePlayerView.this.f23193a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2578b) it.next()).a(fullscreenView, exitFullscreen);
                }
                return;
            }
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }

        @Override // e2.InterfaceC2578b
        public void onExitFullscreen() {
            if (!YouTubePlayerView.this.f23193a.isEmpty()) {
                Iterator it = YouTubePlayerView.this.f23193a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2578b) it.next()).onExitFullscreen();
                }
                return;
            }
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2577a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f23199a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ YouTubePlayerView f23200b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23201c;

        c(String str, YouTubePlayerView youTubePlayerView, boolean z8) {
            this.f23199a = str;
            this.f23200b = youTubePlayerView;
            this.f23201c = z8;
        }

        @Override // e2.AbstractC2577a, e2.c
        public void g(InterfaceC2541e youTubePlayer) {
            boolean z8;
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            String str = this.f23199a;
            if (str != null) {
                YouTubePlayerView youTubePlayerView = this.f23200b;
                boolean z9 = this.f23201c;
                if (youTubePlayerView.f23195c.getCanPlay$core_release() && z9) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC2711h.a(youTubePlayer, z8, str, 0.0f);
            }
            youTubePlayer.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        ViewGroup.LayoutParams b8;
        AbstractC3159y.i(context, "context");
        this.f23193a = new ArrayList();
        b bVar = new b();
        this.f23194b = bVar;
        C2745a c2745a = new C2745a(context, bVar, null, 0, 12, null);
        this.f23195c = c2745a;
        b8 = g.b();
        addView(c2745a, b8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1907b.f14882a, 0, 0);
        AbstractC3159y.h(obtainStyledAttributes, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.f23196d = obtainStyledAttributes.getBoolean(AbstractC1907b.f14884c, true);
        boolean z8 = obtainStyledAttributes.getBoolean(AbstractC1907b.f14883b, false);
        boolean z9 = obtainStyledAttributes.getBoolean(AbstractC1907b.f14885d, true);
        String string = obtainStyledAttributes.getString(AbstractC1907b.f14886e);
        obtainStyledAttributes.recycle();
        if (z8 && string == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        c cVar = new c(string, this, z8);
        if (this.f23196d) {
            c2745a.e(cVar, z9, C2659a.f31004b.a());
        }
    }

    private final void f() {
        this.f23195c.h();
    }

    private final void g() {
        this.f23195c.i();
    }

    public final boolean c(InterfaceC2578b fullscreenListener) {
        AbstractC3159y.i(fullscreenListener, "fullscreenListener");
        return this.f23193a.add(fullscreenListener);
    }

    public final View d(int i8) {
        return this.f23195c.d(i8);
    }

    public final void e(e2.c youTubePlayerListener, C2659a playerOptions) {
        AbstractC3159y.i(youTubePlayerListener, "youTubePlayerListener");
        AbstractC3159y.i(playerOptions, "playerOptions");
        if (!this.f23196d) {
            this.f23195c.e(youTubePlayerListener, true, playerOptions);
            return;
        }
        throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.f23196d;
    }

    public final void h() {
        this.f23195c.j();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(event, "event");
        int i8 = a.f23197a[event.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    h();
                    return;
                }
                return;
            }
            g();
            return;
        }
        f();
    }

    public final void setCustomPlayerUi(View view) {
        AbstractC3159y.i(view, "view");
        this.f23195c.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z8) {
        this.f23196d = z8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        AbstractC3159y.i(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC3159y.i(context, "context");
    }
}
