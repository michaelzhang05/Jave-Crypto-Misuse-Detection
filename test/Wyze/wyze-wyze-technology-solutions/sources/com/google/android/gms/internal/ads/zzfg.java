package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfg extends zzfk {
    public zzfg(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3) {
        super(zzdyVar, str, str2, c0173zza, i2, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f15047j.w0(zzbz.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f15048k.invoke(null, this.f15044g.a())).booleanValue();
        synchronized (this.f15047j) {
            if (booleanValue) {
                this.f15047j.w0(zzbz.ENUM_TRUE);
            } else {
                this.f15047j.w0(zzbz.ENUM_FALSE);
            }
        }
    }
}
