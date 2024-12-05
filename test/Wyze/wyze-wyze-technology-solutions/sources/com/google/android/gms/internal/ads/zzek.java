package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzek extends zzfk {
    private final Activity n;
    private final View o;

    public zzek(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3, View view, Activity activity) {
        super(zzdyVar, str, str2, c0173zza, i2, 62);
        this.o = view;
        this.n = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.o == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzyt.e().c(zzacu.m2)).booleanValue();
        Object[] objArr = (Object[]) this.f15048k.invoke(null, this.o, this.n, Boolean.valueOf(booleanValue));
        synchronized (this.f15047j) {
            this.f15047j.r0(((Long) objArr[0]).longValue());
            this.f15047j.s0(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.f15047j.A((String) objArr[2]);
            }
        }
    }
}
