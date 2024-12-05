package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W3 {

    /* renamed from: a, reason: collision with root package name */
    private V3 f16339a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2160a4 f16340b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W3(C2160a4 c2160a4) {
        this.f16340b = c2160a4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j8) {
        Handler handler;
        this.f16339a = new V3(this, this.f16340b.f16777a.a().currentTimeMillis(), j8);
        handler = this.f16340b.f16422c;
        handler.postDelayed(this.f16339a, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Handler handler;
        this.f16340b.h();
        V3 v32 = this.f16339a;
        if (v32 != null) {
            handler = this.f16340b.f16422c;
            handler.removeCallbacks(v32);
        }
        this.f16340b.f16777a.F().f16162r.a(false);
        this.f16340b.s(false);
    }
}
