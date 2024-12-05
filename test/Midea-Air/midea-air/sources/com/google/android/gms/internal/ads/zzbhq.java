package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzbhq extends zzaas {

    /* renamed from: f, reason: collision with root package name */
    private final zzbdf f13285f;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f13287h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f13288i;

    /* renamed from: j, reason: collision with root package name */
    private int f13289j;

    /* renamed from: k, reason: collision with root package name */
    private zzaau f13290k;
    private boolean l;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;

    /* renamed from: g, reason: collision with root package name */
    private final Object f13286g = new Object();
    private boolean m = true;

    public zzbhq(zzbdf zzbdfVar, float f2, boolean z, boolean z2) {
        this.f13285f = zzbdfVar;
        this.n = f2;
        this.f13287h = z;
        this.f13288i = z2;
    }

    private final void J7(final int i2, final int i3, final boolean z, final boolean z2) {
        zzbbm.a.execute(new Runnable(this, i2, i3, z, z2) { // from class: com.google.android.gms.internal.ads.gb

            /* renamed from: f, reason: collision with root package name */
            private final zzbhq f11477f;

            /* renamed from: g, reason: collision with root package name */
            private final int f11478g;

            /* renamed from: h, reason: collision with root package name */
            private final int f11479h;

            /* renamed from: i, reason: collision with root package name */
            private final boolean f11480i;

            /* renamed from: j, reason: collision with root package name */
            private final boolean f11481j;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11477f = this;
                this.f11478g = i2;
                this.f11479h = i3;
                this.f11480i = z;
                this.f11481j = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11477f.L7(this.f11478g, this.f11479h, this.f11480i, this.f11481j);
            }
        });
    }

    private final void O7(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbbm.a.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.fb

            /* renamed from: f, reason: collision with root package name */
            private final zzbhq f11410f;

            /* renamed from: g, reason: collision with root package name */
            private final Map f11411g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11410f = this;
                this.f11411g = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11410f.P7(this.f11411g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void F1(zzaau zzaauVar) {
        synchronized (this.f13286g) {
            this.f13290k = zzaauVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final float G() {
        float f2;
        synchronized (this.f13286g) {
            f2 = this.p;
        }
        return f2;
    }

    public final void I7(float f2, float f3, int i2, boolean z, float f4) {
        boolean z2;
        int i3;
        synchronized (this.f13286g) {
            this.n = f3;
            this.o = f2;
            z2 = this.m;
            this.m = z;
            i3 = this.f13289j;
            this.f13289j = i2;
            float f5 = this.p;
            this.p = f4;
            if (Math.abs(f4 - f5) > 1.0E-4f) {
                this.f13285f.getView().invalidate();
            }
        }
        J7(i3, i2, z2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean J0() {
        boolean z;
        boolean w5 = w5();
        synchronized (this.f13286g) {
            if (!w5) {
                try {
                    z = this.r && this.f13288i;
                } finally {
                }
            }
        }
        return z;
    }

    public final void K7() {
        boolean z;
        int i2;
        synchronized (this.f13286g) {
            z = this.m;
            i2 = this.f13289j;
            this.f13289j = 3;
        }
        J7(i2, 3, z, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void L7(int i2, int i3, boolean z, boolean z2) {
        zzaau zzaauVar;
        zzaau zzaauVar2;
        zzaau zzaauVar3;
        synchronized (this.f13286g) {
            boolean z3 = i2 != i3;
            boolean z4 = this.l;
            boolean z5 = !z4 && i3 == 1;
            boolean z6 = z3 && i3 == 1;
            boolean z7 = z3 && i3 == 2;
            boolean z8 = z3 && i3 == 3;
            boolean z9 = z != z2;
            this.l = z4 || z5;
            if (z5) {
                try {
                    zzaau zzaauVar4 = this.f13290k;
                    if (zzaauVar4 != null) {
                        zzaauVar4.onVideoStart();
                    }
                } catch (RemoteException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
            if (z6 && (zzaauVar3 = this.f13290k) != null) {
                zzaauVar3.onVideoPlay();
            }
            if (z7 && (zzaauVar2 = this.f13290k) != null) {
                zzaauVar2.onVideoPause();
            }
            if (z8) {
                zzaau zzaauVar5 = this.f13290k;
                if (zzaauVar5 != null) {
                    zzaauVar5.S();
                }
                this.f13285f.M();
            }
            if (z9 && (zzaauVar = this.f13290k) != null) {
                zzaauVar.x0(z2);
            }
        }
    }

    public final void M7(zzacd zzacdVar) {
        boolean z = zzacdVar.f12609f;
        boolean z2 = zzacdVar.f12610g;
        boolean z3 = zzacdVar.f12611h;
        synchronized (this.f13286g) {
            this.q = z2;
            this.r = z3;
        }
        O7("initialState", CollectionUtils.a("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    public final void N7(float f2) {
        synchronized (this.f13286g) {
            this.o = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void P7(Map map) {
        this.f13285f.y("pubVideoCmd", map);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void f2(boolean z) {
        O7(z ? "mute" : "unmute", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final float j6() {
        float f2;
        synchronized (this.f13286g) {
            f2 = this.o;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final zzaau k5() throws RemoteException {
        zzaau zzaauVar;
        synchronized (this.f13286g) {
            zzaauVar = this.f13290k;
        }
        return zzaauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void pause() {
        O7("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final float q7() {
        float f2;
        synchronized (this.f13286g) {
            f2 = this.n;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int t() {
        int i2;
        synchronized (this.f13286g) {
            i2 = this.f13289j;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean u1() {
        boolean z;
        synchronized (this.f13286g) {
            z = this.m;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void v5() {
        O7("play", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean w5() {
        boolean z;
        synchronized (this.f13286g) {
            z = this.f13287h && this.q;
        }
        return z;
    }
}
