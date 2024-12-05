package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ar implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzda f11100f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar(zzda zzdaVar) {
        this.f11100f = zzdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzdy zzdyVar;
        ConditionVariable conditionVariable2;
        if (this.f11100f.f14642e != null) {
            return;
        }
        conditionVariable = zzda.a;
        synchronized (conditionVariable) {
            if (this.f11100f.f14642e != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzyt.e().c(zzacu.i2)).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzdyVar = this.f11100f.f14641d;
                    zzda.f14639b = new zzwo(zzdyVar.f15005b, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.f11100f.f14642e = Boolean.valueOf(z2);
            conditionVariable2 = zzda.a;
            conditionVariable2.open();
        }
    }
}
