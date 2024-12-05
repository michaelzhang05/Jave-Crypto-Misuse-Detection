package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzcus implements zzcva<zzcur> {
    private final zzavg a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbbl f14473b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f14474c;

    public zzcus(zzavg zzavgVar, zzbbl zzbblVar, Context context) {
        this.a = zzavgVar;
        this.f14473b = zzbblVar;
        this.f14474c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcur a() throws Exception {
        if (!this.a.D(this.f14474c)) {
            return new zzcur(null, null, null, null, null);
        }
        String l = this.a.l(this.f14474c);
        String str = l == null ? HttpUrl.FRAGMENT_ENCODE_SET : l;
        String m = this.a.m(this.f14474c);
        String str2 = m == null ? HttpUrl.FRAGMENT_ENCODE_SET : m;
        String n = this.a.n(this.f14474c);
        String str3 = n == null ? HttpUrl.FRAGMENT_ENCODE_SET : n;
        String o = this.a.o(this.f14474c);
        return new zzcur(str, str2, str3, o == null ? HttpUrl.FRAGMENT_ENCODE_SET : o, "TIME_OUT".equals(str2) ? (Long) zzyt.e().c(zzacu.E0) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcur> b() {
        return this.f14473b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.xo

            /* renamed from: f, reason: collision with root package name */
            private final zzcus f12398f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12398f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12398f.a();
            }
        });
    }
}
