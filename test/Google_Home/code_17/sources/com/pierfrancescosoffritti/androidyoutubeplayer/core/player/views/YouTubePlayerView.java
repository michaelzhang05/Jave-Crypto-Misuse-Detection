package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import f2.AbstractC2817b;
import g2.InterfaceC2865e;
import h2.AbstractC2897a;
import h2.InterfaceC2898b;
import i2.C2977a;
import j2.AbstractC3188h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.C3212a;
import k2.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class YouTubePlayerView extends k2.b implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    private final List f24248a;

    /* renamed from: b, reason: collision with root package name */
    private final b f24249b;

    /* renamed from: c, reason: collision with root package name */
    private final C3212a f24250c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24251d;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24252a;

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
            f24252a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2898b {
        b() {
        }

        @Override // h2.InterfaceC2898b
        public void a(View fullscreenView, Function0 exitFullscreen) {
            AbstractC3255y.i(fullscreenView, "fullscreenView");
            AbstractC3255y.i(exitFullscreen, "exitFullscreen");
            if (!YouTubePlayerView.this.f24248a.isEmpty()) {
                Iterator it = YouTubePlayerView.this.f24248a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2898b) it.next()).a(fullscreenView, exitFullscreen);
                }
                return;
            }
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }

        @Override // h2.InterfaceC2898b
        public void onExitFullscreen() {
            if (!YouTubePlayerView.this.f24248a.isEmpty()) {
                Iterator it = YouTubePlayerView.this.f24248a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2898b) it.next()).onExitFullscreen();
                }
                return;
            }
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2897a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24254a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ YouTubePlayerView f24255b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24256c;

        c(String str, YouTubePlayerView youTubePlayerView, boolean z8) {
            this.f24254a = str;
            this.f24255b = youTubePlayerView;
            this.f24256c = z8;
        }

        @Override // h2.AbstractC2897a, h2.c
        public void c(InterfaceC2865e youTubePlayer) {
            boolean z8;
            AbstractC3255y.i(youTubePlayer, "youTubePlayer");
            String str = this.f24254a;
            if (str != null) {
                YouTubePlayerView youTubePlayerView = this.f24255b;
                boolean z9 = this.f24256c;
                if (youTubePlayerView.f24250c.getCanPlay$core_release() && z9) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC3188h.a(youTubePlayer, z8, str, 0.0f);
            }
            youTubePlayer.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        ViewGroup.LayoutParams b8;
        AbstractC3255y.i(context, "context");
        this.f24248a = new ArrayList();
        b bVar = new b();
        this.f24249b = bVar;
        C3212a c3212a = new C3212a(context, bVar, null, 0, 12, null);
        this.f24250c = c3212a;
        b8 = g.b();
        addView(c3212a, b8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2817b.f31857a, 0, 0);
        AbstractC3255y.h(obtainStyledAttributes, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.f24251d = obtainStyledAttributes.getBoolean(AbstractC2817b.f31859c, true);
        boolean z8 = obtainStyledAttributes.getBoolean(AbstractC2817b.f31858b, false);
        boolean z9 = obtainStyledAttributes.getBoolean(AbstractC2817b.f31860d, true);
        String string = obtainStyledAttributes.getString(AbstractC2817b.f31861e);
        obtainStyledAttributes.recycle();
        if (z8 && string == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        c cVar = new c(string, this, z8);
        if (this.f24251d) {
            c3212a.e(cVar, z9, C2977a.f32867b.a());
        }
    }

    private final void f() {
        this.f24250c.h();
    }

    private final void g() {
        this.f24250c.i();
    }

    public final boolean c(InterfaceC2898b fullscreenListener) {
        AbstractC3255y.i(fullscreenListener, "fullscreenListener");
        return this.f24248a.add(fullscreenListener);
    }

    public final View d(int i8) {
        return this.f24250c.d(i8);
    }

    public final void e(h2.c youTubePlayerListener, C2977a playerOptions) {
        AbstractC3255y.i(youTubePlayerListener, "youTubePlayerListener");
        AbstractC3255y.i(playerOptions, "playerOptions");
        if (!this.f24251d) {
            this.f24250c.e(youTubePlayerListener, true, playerOptions);
            return;
        }
        throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.f24251d;
    }

    public final void h() {
        this.f24250c.j();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(event, "event");
        int i8 = a.f24252a[event.ordinal()];
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
        AbstractC3255y.i(view, "view");
        this.f24250c.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z8) {
        this.f24251d = z8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        AbstractC3255y.i(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC3255y.i(context, "context");
    }
}
