package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfb extends zzfk {
    private final boolean n;

    public zzfb(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3) {
        super(zzdyVar, str, str2, c0173zza, i2, 61);
        this.n = zzdyVar.y();
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f15048k.invoke(null, this.f15044g.a(), Boolean.valueOf(this.n))).longValue();
        synchronized (this.f15047j) {
            this.f15047j.q0(longValue);
        }
    }
}
