package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsp implements zzcva<Cdo> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbbl f14432b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsp(Context context, zzbbl zzbblVar) {
        this.a = context;
        this.f14432b = zzbblVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Cdo a() throws Exception {
        zzk.zzlg();
        String F = zzaxi.F(this.a);
        zzk.zzlg();
        return new Cdo(F, zzaxi.G(this.a));
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<Cdo> b() {
        return this.f14432b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.bo

            /* renamed from: f, reason: collision with root package name */
            private final zzcsp f11165f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11165f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11165f.a();
            }
        });
    }
}
