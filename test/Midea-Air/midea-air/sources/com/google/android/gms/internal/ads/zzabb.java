package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
/* loaded from: classes2.dex */
public final class zzabb {
    private final zzamo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzyc f12576b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f12577c;

    /* renamed from: d, reason: collision with root package name */
    private final VideoController f12578d;

    /* renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    private final zzyv f12579e;

    /* renamed from: f, reason: collision with root package name */
    private zzxr f12580f;

    /* renamed from: g, reason: collision with root package name */
    private AdListener f12581g;

    /* renamed from: h, reason: collision with root package name */
    private AdSize[] f12582h;

    /* renamed from: i, reason: collision with root package name */
    private AppEventListener f12583i;

    /* renamed from: j, reason: collision with root package name */
    private Correlator f12584j;

    /* renamed from: k, reason: collision with root package name */
    private zzzk f12585k;
    private OnCustomRenderedAdLoadedListener l;
    private VideoOptions m;
    private String n;
    private ViewGroup o;
    private int p;
    private boolean q;

    public zzabb(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzyc.a, 0);
    }

    private static boolean C(int i2) {
        return i2 == 1;
    }

    private static zzyd x(Context context, AdSize[] adSizeArr, int i2) {
        zzyd zzydVar = new zzyd(context, adSizeArr);
        zzydVar.o = C(i2);
        return zzydVar;
    }

    public final void A(AdSize... adSizeArr) {
        this.f12582h = adSizeArr;
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.q2(x(this.o.getContext(), this.f12582h, this.p));
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
        this.o.requestLayout();
    }

    public final boolean B(zzzk zzzkVar) {
        if (zzzkVar == null) {
            return false;
        }
        try {
            IObjectWrapper w0 = zzzkVar.w0();
            if (w0 == null || ((View) ObjectWrapper.R(w0)).getParent() != null) {
                return false;
            }
            this.o.addView((View) ObjectWrapper.R(w0));
            this.f12585k = zzzkVar;
            return true;
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final zzaar D() {
        zzzk zzzkVar = this.f12585k;
        if (zzzkVar == null) {
            return null;
        }
        try {
            return zzzkVar.getVideoController();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final void a() {
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.destroy();
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final AdListener b() {
        return this.f12581g;
    }

    public final AdSize c() {
        zzyd Q5;
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null && (Q5 = zzzkVar.Q5()) != null) {
                return com.google.android.gms.ads.zzb.zza(Q5.f15814j, Q5.f15811g, Q5.f15810f);
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
        AdSize[] adSizeArr = this.f12582h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] d() {
        return this.f12582h;
    }

    public final String e() {
        zzzk zzzkVar;
        if (this.n == null && (zzzkVar = this.f12585k) != null) {
            try {
                this.n = zzzkVar.x6();
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
        return this.n;
    }

    public final AppEventListener f() {
        return this.f12583i;
    }

    public final String g() {
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                return zzzkVar.M();
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final OnCustomRenderedAdLoadedListener h() {
        return this.l;
    }

    public final VideoController i() {
        return this.f12578d;
    }

    public final VideoOptions j() {
        return this.m;
    }

    public final boolean k() {
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                return zzzkVar.U();
            }
            return false;
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final void l() {
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.pause();
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void m() {
        if (this.f12577c.getAndSet(true)) {
            return;
        }
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.S6();
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void n() {
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.resume();
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void o(AdListener adListener) {
        this.f12581g = adListener;
        this.f12579e.a(adListener);
    }

    public final void p(AdSize... adSizeArr) {
        if (this.f12582h == null) {
            A(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void q(String str) {
        if (this.n == null) {
            this.n = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void r(AppEventListener appEventListener) {
        try {
            this.f12583i = appEventListener;
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.g6(appEventListener != null ? new zzyf(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void s(Correlator correlator) {
        this.f12584j = correlator;
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.A4(correlator == null ? null : correlator.zzdf());
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void t(boolean z) {
        this.q = z;
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.i1(z);
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void u(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.l = onCustomRenderedAdLoadedListener;
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.f7(onCustomRenderedAdLoadedListener != null ? new zzadr(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void v(VideoOptions videoOptions) {
        this.m = videoOptions;
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.x7(videoOptions == null ? null : new zzacd(videoOptions));
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void y(zzaaz zzaazVar) {
        zzzk b2;
        try {
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar == null) {
                if ((this.f12582h != null && this.n != null) || zzzkVar != null) {
                    Context context = this.o.getContext();
                    zzyd x = x(context, this.f12582h, this.p);
                    if ("search_v2".equals(x.f15810f)) {
                        b2 = new a60(zzyt.b(), context, x, this.n).b(context, false);
                    } else {
                        b2 = new y50(zzyt.b(), context, x, this.n, this.a).b(context, false);
                    }
                    this.f12585k = b2;
                    b2.p0(new zzxv(this.f12579e));
                    if (this.f12580f != null) {
                        this.f12585k.C4(new zzxs(this.f12580f));
                    }
                    if (this.f12583i != null) {
                        this.f12585k.g6(new zzyf(this.f12583i));
                    }
                    if (this.l != null) {
                        this.f12585k.f7(new zzadr(this.l));
                    }
                    Correlator correlator = this.f12584j;
                    if (correlator != null) {
                        this.f12585k.A4(correlator.zzdf());
                    }
                    if (this.m != null) {
                        this.f12585k.x7(new zzacd(this.m));
                    }
                    this.f12585k.i1(this.q);
                    try {
                        IObjectWrapper w0 = this.f12585k.w0();
                        if (w0 != null) {
                            this.o.addView((View) ObjectWrapper.R(w0));
                        }
                    } catch (RemoteException e2) {
                        zzbad.f("#007 Could not call remote method.", e2);
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            if (this.f12585k.Q4(zzyc.a(this.o.getContext(), zzaazVar))) {
                this.a.K7(zzaazVar.q());
            }
        } catch (RemoteException e3) {
            zzbad.f("#007 Could not call remote method.", e3);
        }
    }

    public final void z(zzxr zzxrVar) {
        try {
            this.f12580f = zzxrVar;
            zzzk zzzkVar = this.f12585k;
            if (zzzkVar != null) {
                zzzkVar.C4(zzxrVar != null ? new zzxs(zzxrVar) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public zzabb(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, zzyc.a, i2);
    }

    public zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzyc.a, 0);
    }

    public zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i2) {
        this(viewGroup, attributeSet, false, zzyc.a, i2);
    }

    @VisibleForTesting
    private zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzyc zzycVar, zzzk zzzkVar, int i2) {
        this.a = new zzamo();
        this.f12578d = new VideoController();
        this.f12579e = new a(this);
        this.o = viewGroup;
        this.f12576b = zzycVar;
        this.f12585k = null;
        this.f12577c = new AtomicBoolean(false);
        this.p = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzyg zzygVar = new zzyg(context, attributeSet);
                this.f12582h = zzygVar.c(z);
                this.n = zzygVar.a();
                if (viewGroup.isInEditMode()) {
                    zzazt a = zzyt.a();
                    AdSize adSize = this.f12582h[0];
                    int i3 = this.p;
                    zzyd zzydVar = new zzyd(context, adSize);
                    zzydVar.o = C(i3);
                    a.f(viewGroup, zzydVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                zzyt.a().h(viewGroup, new zzyd(context, AdSize.BANNER), e2.getMessage(), e2.getMessage());
            }
        }
    }

    @VisibleForTesting
    private zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzyc zzycVar, int i2) {
        this(viewGroup, attributeSet, z, zzycVar, null, i2);
    }
}
