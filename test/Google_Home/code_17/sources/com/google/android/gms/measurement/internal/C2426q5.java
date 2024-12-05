package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2426q5 {

    /* renamed from: a, reason: collision with root package name */
    private RunnableC2446t5 f17782a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2419p5 f17783b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2426q5(C2419p5 c2419p5) {
        this.f17783b = c2419p5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Handler handler;
        this.f17783b.k();
        if (this.f17782a != null) {
            handler = this.f17783b.f17762c;
            handler.removeCallbacks(this.f17782a);
        }
        this.f17783b.f().f17831u.a(false);
        this.f17783b.D(false);
        if (this.f17783b.a().q(H.f17074L0) && this.f17783b.o().J0()) {
            this.f17783b.c().K().a("Retrying trigger URI registration in foreground");
            this.f17783b.o().H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j8) {
        Handler handler;
        this.f17782a = new RunnableC2446t5(this, this.f17783b.x().currentTimeMillis(), j8);
        handler = this.f17783b.f17762c;
        handler.postDelayed(this.f17782a, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
