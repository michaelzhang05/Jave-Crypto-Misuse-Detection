package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzabe {
    private static zzabe a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12596b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private zzaab f12597c;

    /* renamed from: d, reason: collision with root package name */
    private RewardedVideoAd f12598d;

    /* renamed from: e, reason: collision with root package name */
    private zztw f12599e;

    private zzabe() {
    }

    public static zzabe j() {
        zzabe zzabeVar;
        synchronized (f12596b) {
            if (a == null) {
                a = new zzabe();
            }
            zzabeVar = a;
        }
        return zzabeVar;
    }

    public final RewardedVideoAd a(Context context) {
        synchronized (f12596b) {
            RewardedVideoAd rewardedVideoAd = this.f12598d;
            if (rewardedVideoAd != null) {
                return rewardedVideoAd;
            }
            zzatj zzatjVar = new zzatj(context, new g60(zzyt.b(), context, new zzamo()).b(context, false));
            this.f12598d = zzatjVar;
            return zzatjVar;
        }
    }

    public final String b() {
        Preconditions.m(this.f12597c != null, "MobileAds.initialize() must be called prior to getting version string.");
        try {
            return this.f12597c.F3();
        } catch (RemoteException e2) {
            zzbad.c("Unable to get version string.", e2);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public final void c(Context context, String str) {
        Preconditions.m(this.f12597c != null, "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.f12597c.M6(ObjectWrapper.i0(context), str);
        } catch (RemoteException e2) {
            zzbad.c("Unable to open debug menu.", e2);
        }
    }

    public final void d(Class<? extends RtbAdapter> cls) {
        try {
            this.f12597c.D2(cls.getCanonicalName());
        } catch (RemoteException e2) {
            zzbad.c("Unable to register RtbAdapter", e2);
        }
    }

    public final void e(boolean z) {
        Preconditions.m(this.f12597c != null, "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.f12597c.S1(z);
        } catch (RemoteException e2) {
            zzbad.c("Unable to set app mute state.", e2);
        }
    }

    public final void f(float f2) {
        Preconditions.b(0.0f <= f2 && f2 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        Preconditions.m(this.f12597c != null, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.f12597c.I5(f2);
        } catch (RemoteException e2) {
            zzbad.c("Unable to set app volume.", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.c] */
    public final void g(final Context context, String str, zzabi zzabiVar, zztx zztxVar) {
        synchronized (f12596b) {
            if (this.f12597c != null) {
                return;
            }
            if (context != null) {
                try {
                    zzami.H7(context, str);
                    boolean z = false;
                    zzaab b2 = new d60(zzyt.b(), context).b(context, false);
                    this.f12597c = b2;
                    b2.s0(new zzamo());
                    this.f12597c.f0();
                    this.f12597c.p2(str, ObjectWrapper.i0(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.b

                        /* renamed from: f, reason: collision with root package name */
                        private final zzabe f11104f;

                        /* renamed from: g, reason: collision with root package name */
                        private final Context f11105g;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.f11104f = this;
                            this.f11105g = context;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11104f.a(this.f11105g);
                        }
                    }));
                    zzacu.a(context);
                    if (!((Boolean) zzyt.e().c(zzacu.d4)).booleanValue()) {
                        if (((Boolean) zzyt.e().c(zzacu.j4)).booleanValue()) {
                            z = true;
                        }
                    }
                    if (!z) {
                        zzbad.g("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                        this.f12599e = new Object(this) { // from class: com.google.android.gms.internal.ads.c
                            private final zzabe a;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = this;
                            }
                        };
                    }
                } catch (RemoteException e2) {
                    zzbad.d("MobileAdsSettingManager initialization failed", e2);
                }
                return;
            }
            throw new IllegalArgumentException("Context cannot be null.");
        }
    }

    public final float h() {
        zzaab zzaabVar = this.f12597c;
        if (zzaabVar == null) {
            return 1.0f;
        }
        try {
            return zzaabVar.I4();
        } catch (RemoteException e2) {
            zzbad.c("Unable to get app volume.", e2);
            return 1.0f;
        }
    }

    public final boolean i() {
        zzaab zzaabVar = this.f12597c;
        if (zzaabVar == null) {
            return false;
        }
        try {
            return zzaabVar.H3();
        } catch (RemoteException e2) {
            zzbad.c("Unable to get app mute state.", e2);
            return false;
        }
    }
}
