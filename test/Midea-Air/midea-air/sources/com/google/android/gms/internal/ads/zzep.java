package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzep extends zzfk {
    public zzep(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3) {
        super(zzdyVar, str, str2, c0173zza, i2, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f15047j.E(-1L);
        this.f15047j.F(-1L);
        int[] iArr = (int[]) this.f15048k.invoke(null, this.f15044g.a());
        synchronized (this.f15047j) {
            this.f15047j.E(iArr[0]);
            this.f15047j.F(iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f15047j.o0(iArr[2]);
            }
        }
    }
}
