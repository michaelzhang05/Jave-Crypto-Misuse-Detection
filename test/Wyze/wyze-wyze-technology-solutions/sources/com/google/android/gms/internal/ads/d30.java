package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
final class d30 implements zzsh {
    private final Uri a;

    /* renamed from: b, reason: collision with root package name */
    private final zzrv f11278b;

    /* renamed from: c, reason: collision with root package name */
    private final e30 f11279c;

    /* renamed from: d, reason: collision with root package name */
    private final zzsm f11280d;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f11282f;

    /* renamed from: h, reason: collision with root package name */
    private long f11284h;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ y20 f11286j;

    /* renamed from: e, reason: collision with root package name */
    private final zznt f11281e = new zznt();

    /* renamed from: g, reason: collision with root package name */
    private boolean f11283g = true;

    /* renamed from: i, reason: collision with root package name */
    private long f11285i = -1;

    public d30(y20 y20Var, Uri uri, zzrv zzrvVar, e30 e30Var, zzsm zzsmVar) {
        this.f11286j = y20Var;
        this.a = (Uri) zzsk.d(uri);
        this.f11278b = (zzrv) zzsk.d(zzrvVar);
        this.f11279c = (e30) zzsk.d(e30Var);
        this.f11280d = zzsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final boolean a() {
        return this.f11282f;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void b() {
        this.f11282f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void c() throws IOException, InterruptedException {
        long j2;
        zznm zznmVar;
        int i2 = 0;
        while (i2 == 0 && !this.f11282f) {
            zznm zznmVar2 = null;
            try {
                j2 = this.f11281e.a;
                long a = this.f11278b.a(new zzry(this.a, j2, -1L, y20.B(this.f11286j)));
                this.f11285i = a;
                if (a != -1) {
                    this.f11285i = a + j2;
                }
                zznmVar = new zznm(this.f11278b, j2, this.f11285i);
            } catch (Throwable th) {
                th = th;
            }
            try {
                zznn b2 = this.f11279c.b(zznmVar, this.f11278b.n0());
                if (this.f11283g) {
                    b2.h(j2, this.f11284h);
                    this.f11283g = false;
                }
                while (i2 == 0 && !this.f11282f) {
                    this.f11280d.a();
                    i2 = b2.d(zznmVar, this.f11281e);
                    if (zznmVar.getPosition() > y20.E(this.f11286j) + j2) {
                        j2 = zznmVar.getPosition();
                        this.f11280d.c();
                        y20.G(this.f11286j).post(y20.F(this.f11286j));
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    this.f11281e.a = zznmVar.getPosition();
                }
                zzsy.e(this.f11278b);
            } catch (Throwable th2) {
                th = th2;
                zznmVar2 = zznmVar;
                if (i2 != 1 && zznmVar2 != null) {
                    this.f11281e.a = zznmVar2.getPosition();
                }
                zzsy.e(this.f11278b);
                throw th;
            }
        }
    }

    public final void e(long j2, long j3) {
        this.f11281e.a = j2;
        this.f11284h = j3;
        this.f11283g = true;
    }
}
