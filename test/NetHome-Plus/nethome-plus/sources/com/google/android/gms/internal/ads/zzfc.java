package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfc extends zzfk {
    private final StackTraceElement[] n;

    public zzfc(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzdyVar, str, str2, c0173zza, i2, 45);
        this.n = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        zzbz zzbzVar;
        StackTraceElement[] stackTraceElementArr = this.n;
        if (stackTraceElementArr != null) {
            zzdw zzdwVar = new zzdw((String) this.f15048k.invoke(null, stackTraceElementArr));
            synchronized (this.f15047j) {
                this.f15047j.k0(zzdwVar.f15000b.longValue());
                if (zzdwVar.f15001c.booleanValue()) {
                    zzbp.zza.C0173zza c0173zza = this.f15047j;
                    if (zzdwVar.f15002d.booleanValue()) {
                        zzbzVar = zzbz.ENUM_FALSE;
                    } else {
                        zzbzVar = zzbz.ENUM_TRUE;
                    }
                    c0173zza.y0(zzbzVar);
                } else {
                    this.f15047j.y0(zzbz.ENUM_FAILURE);
                }
            }
        }
    }
}
