package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzem extends zzfk {
    private static zzfl<String> n = new zzfl<>();
    private final Context o;

    public zzem(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3, Context context) {
        super(zzdyVar, str, str2, c0173zza, i2, 29);
        this.o = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f15047j.u("E");
        AtomicReference<String> a = n.a(this.o.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f15048k.invoke(null, this.o));
                }
            }
        }
        String str = a.get();
        synchronized (this.f15047j) {
            this.f15047j.u(zzcg.a(str.getBytes(), true));
        }
    }
}
