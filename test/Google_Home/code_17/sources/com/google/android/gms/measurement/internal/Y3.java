package com.google.android.gms.measurement.internal;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y3 extends AbstractC2461w {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ A3 f17422e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(A3 a32, InterfaceC2465w3 interfaceC2465w3) {
        super(interfaceC2465w3);
        this.f17422e = a32;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2461w
    public final void d() {
        AbstractC2461w abstractC2461w;
        if (this.f17422e.f17844a.r()) {
            abstractC2461w = this.f17422e.f16959s;
            abstractC2461w.b(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }
}
