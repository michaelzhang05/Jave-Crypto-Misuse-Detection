package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzer extends zzfk {
    private long n;

    public zzer(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, long j2, int i2, int i3) {
        super(zzdyVar, str, str2, c0173zza, i2, 25);
        this.n = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f15048k.invoke(null, new Object[0])).longValue();
        synchronized (this.f15047j) {
            this.f15047j.t0(longValue);
            long j2 = this.n;
            if (j2 != 0) {
                this.f15047j.O(longValue - j2);
                this.f15047j.S(this.n);
            }
        }
    }
}
