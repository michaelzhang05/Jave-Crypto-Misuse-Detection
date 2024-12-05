package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2051m6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y3 {

    /* renamed from: a, reason: collision with root package name */
    protected long f16395a;

    /* renamed from: b, reason: collision with root package name */
    protected long f16396b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2236o f16397c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2160a4 f16398d;

    public Y3(C2160a4 c2160a4) {
        this.f16398d = c2160a4;
        this.f16397c = new X3(this, c2160a4.f16777a);
        long elapsedRealtime = c2160a4.f16777a.a().elapsedRealtime();
        this.f16395a = elapsedRealtime;
        this.f16396b = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f16397c.b();
        this.f16395a = 0L;
        this.f16396b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j8) {
        this.f16397c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j8) {
        this.f16398d.h();
        this.f16397c.b();
        this.f16395a = j8;
        this.f16396b = j8;
    }

    public final boolean d(boolean z8, boolean z9, long j8) {
        this.f16398d.h();
        this.f16398d.i();
        C2051m6.c();
        if (this.f16398d.f16777a.z().B(null, AbstractC2217k1.f16597h0)) {
            if (this.f16398d.f16777a.o()) {
                this.f16398d.f16777a.F().f16159o.b(this.f16398d.f16777a.a().currentTimeMillis());
            }
        } else {
            this.f16398d.f16777a.F().f16159o.b(this.f16398d.f16777a.a().currentTimeMillis());
        }
        long j9 = j8 - this.f16395a;
        if (!z8 && j9 < 1000) {
            this.f16398d.f16777a.d().v().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j9));
            return false;
        }
        if (!z9) {
            j9 = j8 - this.f16396b;
            this.f16396b = j8;
        }
        this.f16398d.f16777a.d().v().b("Recording user engagement, ms", Long.valueOf(j9));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j9);
        y4.y(this.f16398d.f16777a.K().s(!this.f16398d.f16777a.z().D()), bundle, true);
        if (!z9) {
            this.f16398d.f16777a.I().u("auto", "_e", bundle);
        }
        this.f16395a = j8;
        this.f16397c.b();
        this.f16397c.d(3600000L);
        return true;
    }
}
