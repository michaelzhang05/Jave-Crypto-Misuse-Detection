package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
final class qz implements zzkc {
    private final Uri a;

    /* renamed from: b, reason: collision with root package name */
    private final zzjp f12073b;

    /* renamed from: c, reason: collision with root package name */
    private final zzid f12074c;

    /* renamed from: d, reason: collision with root package name */
    private final zzjr f12075d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12076e;

    /* renamed from: f, reason: collision with root package name */
    private final zzij f12077f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f12078g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12079h;

    public qz(Uri uri, zzjp zzjpVar, zzid zzidVar, zzjr zzjrVar, int i2, long j2) {
        this.a = (Uri) zzkh.c(uri);
        this.f12073b = (zzjp) zzkh.c(zzjpVar);
        this.f12074c = (zzid) zzkh.c(zzidVar);
        this.f12075d = (zzjr) zzkh.c(zzjrVar);
        this.f12076e = i2;
        zzij zzijVar = new zzij();
        this.f12077f = zzijVar;
        zzijVar.a = j2;
        this.f12079h = true;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    public final boolean a() {
        return this.f12078g;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    public final void b() {
        this.f12078g = true;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    public final void c() throws IOException, InterruptedException {
        if (this.f12079h) {
            this.f12074c.e();
            this.f12079h = false;
        }
        int i2 = 0;
        while (i2 == 0 && !this.f12078g) {
            zzib zzibVar = null;
            try {
                long j2 = this.f12077f.a;
                long a = this.f12073b.a(new zzjq(this.a, j2, -1L, null));
                if (a != -1) {
                    a += j2;
                }
                zzib zzibVar2 = new zzib(this.f12073b, j2, a);
                while (i2 == 0) {
                    try {
                        if (this.f12078g) {
                            break;
                        }
                        this.f12075d.d(this.f12076e);
                        i2 = this.f12074c.a(zzibVar2, this.f12077f);
                    } catch (Throwable th) {
                        th = th;
                        zzibVar = zzibVar2;
                        if (i2 != 1 && zzibVar != null) {
                            this.f12077f.a = zzibVar.getPosition();
                        }
                        this.f12073b.close();
                        throw th;
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    this.f12077f.a = zzibVar2.getPosition();
                }
                this.f12073b.close();
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
