package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfa extends zzfk {
    private List<Long> n;

    public zzfa(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3) {
        super(zzdyVar, str, str2, c0173zza, i2, 31);
        this.n = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f15047j.T(-1L);
        this.f15047j.U(-1L);
        if (this.n == null) {
            this.n = (List) this.f15048k.invoke(null, this.f15044g.a());
        }
        List<Long> list = this.n;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f15047j) {
            this.f15047j.T(this.n.get(0).longValue());
            this.f15047j.U(this.n.get(1).longValue());
        }
    }
}
