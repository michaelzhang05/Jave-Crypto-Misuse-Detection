package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfh extends zzfk {
    private final View n;

    public zzfh(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3, View view) {
        super(zzdyVar, str, str2, c0173zza, i2, 57);
        this.n = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.n != null) {
            Boolean bool = (Boolean) zzyt.e().c(zzacu.y2);
            zzeg zzegVar = new zzeg((String) this.f15048k.invoke(null, this.n, this.f15044g.a().getResources().getDisplayMetrics(), bool));
            zzbp.zza.zzf.C0175zza y = zzbp.zza.zzf.y();
            y.u(zzegVar.f15025b.longValue()).v(zzegVar.f15026c.longValue()).x(zzegVar.f15027d.longValue());
            if (bool.booleanValue()) {
                y.y(zzegVar.f15028e.longValue());
            }
            this.f15047j.X((zzbp.zza.zzf) ((zzdob) y.J()));
        }
    }
}
