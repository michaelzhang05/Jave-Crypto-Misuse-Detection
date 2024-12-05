package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzcyi implements zzaws, zzbro {

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<zzawj> f14594f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final Context f14595g;

    /* renamed from: h, reason: collision with root package name */
    private final zzawu f14596h;

    public zzcyi(Context context, zzawu zzawuVar) {
        this.f14595g = context;
        this.f14596h = zzawuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    public final synchronized void a(HashSet<zzawj> hashSet) {
        this.f14594f.clear();
        this.f14594f.addAll(hashSet);
    }

    public final Bundle b() {
        return this.f14596h.b(this.f14595g, this);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final synchronized void onAdFailedToLoad(int i2) {
        if (i2 != 3) {
            this.f14596h.f(this.f14594f);
        }
    }
}
