package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class py implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f12017f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f12018g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzdy f12019h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public py(zzdy zzdyVar, int i2, boolean z) {
        this.f12019h = zzdyVar;
        this.f12017f = i2;
        this.f12018g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean h2;
        zzbp.zza l = this.f12019h.l(this.f12017f, this.f12018g);
        this.f12019h.f15014k = l;
        h2 = zzdy.h(this.f12017f, l);
        if (h2) {
            this.f12019h.e(this.f12017f + 1, this.f12018g);
        }
    }
}
