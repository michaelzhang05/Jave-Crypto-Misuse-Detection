package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzabd {
    private final zzamo a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12586b;

    /* renamed from: c, reason: collision with root package name */
    private final zzyc f12587c;

    /* renamed from: d, reason: collision with root package name */
    private AdListener f12588d;

    /* renamed from: e, reason: collision with root package name */
    private zzxr f12589e;

    /* renamed from: f, reason: collision with root package name */
    private zzzk f12590f;

    /* renamed from: g, reason: collision with root package name */
    private String f12591g;

    /* renamed from: h, reason: collision with root package name */
    private AdMetadataListener f12592h;

    /* renamed from: i, reason: collision with root package name */
    private AppEventListener f12593i;

    /* renamed from: j, reason: collision with root package name */
    private OnCustomRenderedAdLoadedListener f12594j;

    /* renamed from: k, reason: collision with root package name */
    private Correlator f12595k;
    private RewardedVideoAdListener l;
    private boolean m;
    private boolean n;

    public zzabd(Context context) {
        this(context, zzyc.a, null);
    }

    private final void u(String str) {
        if (this.f12590f != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }

    public final AdListener a() {
        return this.f12588d;
    }

    public final Bundle b() {
        try {
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                return zzzkVar.getAdMetadata();
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
        return new Bundle();
    }

    public final String c() {
        return this.f12591g;
    }

    public final AppEventListener d() {
        return this.f12593i;
    }

    public final String e() {
        try {
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                return zzzkVar.M();
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
            return null;
        }
    }

    public final OnCustomRenderedAdLoadedListener f() {
        return this.f12594j;
    }

    public final boolean g() {
        try {
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar == null) {
                return false;
            }
            return zzzkVar.p();
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    public final boolean h() {
        try {
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar == null) {
                return false;
            }
            return zzzkVar.U();
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    public final void i(AdListener adListener) {
        try {
            this.f12588d = adListener;
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                zzzkVar.p0(adListener != null ? new zzxv(adListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void j(AdMetadataListener adMetadataListener) {
        try {
            this.f12592h = adMetadataListener;
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                zzzkVar.c0(adMetadataListener != null ? new zzxy(adMetadataListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void k(String str) {
        if (this.f12591g == null) {
            this.f12591g = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void l(AppEventListener appEventListener) {
        try {
            this.f12593i = appEventListener;
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                zzzkVar.g6(appEventListener != null ? new zzyf(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void m(Correlator correlator) {
        this.f12595k = correlator;
        try {
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                zzzkVar.A4(correlator == null ? null : correlator.zzdf());
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void n(boolean z) {
        try {
            this.n = z;
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                zzzkVar.setImmersiveMode(z);
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void o(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.f12594j = onCustomRenderedAdLoadedListener;
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                zzzkVar.f7(onCustomRenderedAdLoadedListener != null ? new zzadr(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void p(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.l = rewardedVideoAdListener;
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                zzzkVar.P(rewardedVideoAdListener != null ? new zzatg(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void q() {
        try {
            u("show");
            this.f12590f.showInterstitial();
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void r(zzaaz zzaazVar) {
        try {
            if (this.f12590f == null) {
                if (this.f12591g == null) {
                    u("loadAd");
                }
                zzyd L = this.m ? zzyd.L() : new zzyd();
                zzyh b2 = zzyt.b();
                Context context = this.f12586b;
                zzzk b3 = new b60(b2, context, L, this.f12591g, this.a).b(context, false);
                this.f12590f = b3;
                if (this.f12588d != null) {
                    b3.p0(new zzxv(this.f12588d));
                }
                if (this.f12589e != null) {
                    this.f12590f.C4(new zzxs(this.f12589e));
                }
                if (this.f12592h != null) {
                    this.f12590f.c0(new zzxy(this.f12592h));
                }
                if (this.f12593i != null) {
                    this.f12590f.g6(new zzyf(this.f12593i));
                }
                if (this.f12594j != null) {
                    this.f12590f.f7(new zzadr(this.f12594j));
                }
                Correlator correlator = this.f12595k;
                if (correlator != null) {
                    this.f12590f.A4(correlator.zzdf());
                }
                if (this.l != null) {
                    this.f12590f.P(new zzatg(this.l));
                }
                this.f12590f.setImmersiveMode(this.n);
            }
            if (this.f12590f.Q4(zzyc.a(this.f12586b, zzaazVar))) {
                this.a.K7(zzaazVar.q());
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void s(zzxr zzxrVar) {
        try {
            this.f12589e = zzxrVar;
            zzzk zzzkVar = this.f12590f;
            if (zzzkVar != null) {
                zzzkVar.C4(zzxrVar != null ? new zzxs(zzxrVar) : null);
            }
        } catch (RemoteException e2) {
            zzbad.f("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void t(boolean z) {
        this.m = true;
    }

    public zzabd(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzyc.a, publisherInterstitialAd);
    }

    @VisibleForTesting
    private zzabd(Context context, zzyc zzycVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.a = new zzamo();
        this.f12586b = context;
        this.f12587c = zzycVar;
    }
}
