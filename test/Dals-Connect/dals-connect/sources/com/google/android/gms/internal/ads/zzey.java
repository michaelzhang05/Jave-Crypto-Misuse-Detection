package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzey extends zzfk {
    public zzey(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3) {
        super(zzdyVar, str, str2, c0173zza, i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.f15047j) {
            zzdl zzdlVar = new zzdl((String) this.f15048k.invoke(null, this.f15044g.a()));
            synchronized (this.f15047j) {
                this.f15047j.C(zzdlVar.f14792b);
                this.f15047j.p0(zzdlVar.f14793c);
            }
        }
    }
}
