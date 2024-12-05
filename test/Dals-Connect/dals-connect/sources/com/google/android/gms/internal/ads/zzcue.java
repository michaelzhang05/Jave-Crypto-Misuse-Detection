package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcue implements zzcva<zzcud> {
    private final zzbbl a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f14455b;

    public zzcue(zzbbl zzbblVar, Bundle bundle) {
        this.a = zzbblVar;
        this.f14455b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcud a() throws Exception {
        return new zzcud(this.f14455b);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcud> b() {
        return this.a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.ro

            /* renamed from: f, reason: collision with root package name */
            private final zzcue f12118f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12118f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12118f.a();
            }
        });
    }
}
