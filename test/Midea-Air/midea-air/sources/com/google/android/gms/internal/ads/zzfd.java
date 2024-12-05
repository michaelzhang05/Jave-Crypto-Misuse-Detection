package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfd extends zzfk {
    public zzfd(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3) {
        super(zzdyVar, str, str2, c0173zza, i2, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.f15047j) {
            zzdx zzdxVar = new zzdx((String) this.f15048k.invoke(null, new Object[0]));
            this.f15047j.l0(zzdxVar.f15003b.longValue());
            this.f15047j.m0(zzdxVar.f15004c.longValue());
        }
    }
}
