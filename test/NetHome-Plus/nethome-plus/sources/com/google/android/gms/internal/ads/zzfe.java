package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfe extends zzfk {
    private final zzeh n;
    private long o;

    public zzfe(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3, zzeh zzehVar) {
        super(zzdyVar, str, str2, c0173zza, i2, 53);
        this.n = zzehVar;
        if (zzehVar != null) {
            this.o = zzehVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.n != null) {
            this.f15047j.n0(((Long) this.f15048k.invoke(null, Long.valueOf(this.o))).longValue());
        }
    }
}
