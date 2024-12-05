package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzet implements Callable {

    /* renamed from: f, reason: collision with root package name */
    private final zzdy f15035f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbp.zza.C0173zza f15036g;

    public zzet(zzdy zzdyVar, zzbp.zza.C0173zza c0173zza) {
        this.f15035f = zzdyVar;
        this.f15036g = c0173zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        if (this.f15035f.A() != null) {
            this.f15035f.A().get();
        }
        zzbp.zza z = this.f15035f.z();
        if (z == null) {
            return null;
        }
        try {
            synchronized (this.f15036g) {
                zzbp.zza.C0173zza c0173zza = this.f15036g;
                byte[] g2 = z.g();
                c0173zza.l(g2, 0, g2.length, zzdno.e());
            }
            return null;
        } catch (zzdok unused) {
            return null;
        }
    }
}
