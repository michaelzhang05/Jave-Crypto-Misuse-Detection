package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzff extends zzfk {
    private static volatile Long n;
    private static final Object o = new Object();

    public zzff(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3) {
        super(zzdyVar, str, str2, c0173zza, i2, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (n == null) {
            synchronized (o) {
                if (n == null) {
                    n = (Long) this.f15048k.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f15047j) {
            this.f15047j.V(n.longValue());
        }
    }
}
