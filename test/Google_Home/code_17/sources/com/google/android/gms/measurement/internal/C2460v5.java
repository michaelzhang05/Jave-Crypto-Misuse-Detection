package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2460v5 {

    /* renamed from: a, reason: collision with root package name */
    private long f17870a;

    /* renamed from: b, reason: collision with root package name */
    protected long f17871b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2461w f17872c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2419p5 f17873d;

    public C2460v5(C2419p5 c2419p5) {
        this.f17873d = c2419p5;
        this.f17872c = new C2453u5(this, c2419p5.f17844a);
        long elapsedRealtime = c2419p5.x().elapsedRealtime();
        this.f17870a = elapsedRealtime;
        this.f17871b = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(C2460v5 c2460v5) {
        c2460v5.f17873d.k();
        c2460v5.d(false, false, c2460v5.f17873d.x().elapsedRealtime());
        c2460v5.f17873d.l().s(c2460v5.f17873d.x().elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j8) {
        long j9 = j8 - this.f17871b;
        this.f17871b = j8;
        return j9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f17872c.a();
        if (this.f17873d.a().q(H.f17123g1)) {
            this.f17870a = this.f17873d.x().elapsedRealtime();
        } else {
            this.f17870a = 0L;
        }
        this.f17871b = this.f17870a;
    }

    public final boolean d(boolean z8, boolean z9, long j8) {
        this.f17873d.k();
        this.f17873d.s();
        if (this.f17873d.f17844a.m()) {
            this.f17873d.f().f17828r.b(this.f17873d.x().currentTimeMillis());
        }
        long j9 = j8 - this.f17870a;
        if (!z8 && j9 < 1000) {
            this.f17873d.c().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j9));
            return false;
        }
        if (!z9) {
            j9 = a(j8);
        }
        this.f17873d.c().K().b("Recording user engagement, ms", Long.valueOf(j9));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j9);
        a6.X(this.f17873d.p().C(!this.f17873d.a().Z()), bundle, true);
        if (!z9) {
            this.f17873d.o().b1("auto", "_e", bundle);
        }
        this.f17870a = j8;
        this.f17872c.a();
        this.f17872c.b(((Long) H.f17113d0.a(null)).longValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(long j8) {
        this.f17872c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(long j8) {
        this.f17873d.k();
        this.f17872c.a();
        this.f17870a = j8;
        this.f17871b = j8;
    }
}
