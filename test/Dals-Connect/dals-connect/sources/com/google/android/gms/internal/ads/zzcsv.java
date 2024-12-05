package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsv implements zzcva<zzcsu> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbbl f14434b;

    public zzcsv(Context context, zzbbl zzbblVar) {
        this.a = context;
        this.f14434b = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcsu> b() {
        return this.f14434b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.eo

            /* renamed from: f, reason: collision with root package name */
            private final zzcsv f11370f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11370f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i2;
                String I;
                String str;
                zzk.zzlg();
                zzuu x = zzk.zzlk().r().x();
                Bundle bundle = null;
                if (x != null && (!zzk.zzlk().r().t() || !zzk.zzlk().r().l())) {
                    if (x.i()) {
                        x.a();
                    }
                    zzuo g2 = x.g();
                    if (g2 != null) {
                        i2 = g2.i();
                        str = g2.j();
                        I = g2.k();
                        if (i2 != null) {
                            zzk.zzlk().r().u(i2);
                        }
                        if (I != null) {
                            zzk.zzlk().r().y(I);
                        }
                    } else {
                        i2 = zzk.zzlk().r().i();
                        I = zzk.zzlk().r().I();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (I != null && !zzk.zzlk().r().l()) {
                        bundle2.putString("v_fp_vertical", I);
                    }
                    if (i2 != null && !zzk.zzlk().r().t()) {
                        bundle2.putString("fingerprint", i2);
                        if (!i2.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzcsu(bundle);
            }
        });
    }
}
