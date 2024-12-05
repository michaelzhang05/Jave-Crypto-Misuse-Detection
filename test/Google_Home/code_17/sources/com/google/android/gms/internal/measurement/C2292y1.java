package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import android.app.Activity;
import com.google.android.gms.internal.measurement.C2077b1;

/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2292y1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f16902e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2077b1.b f16903f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2292y1(C2077b1.b bVar, Activity activity) {
        super(C2077b1.this);
        this.f16902e = activity;
        this.f16903f = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = C2077b1.this.f16562i;
        ((Q0) AbstractC1400p.l(q02)).onActivityStarted(Y.b.s0(this.f16902e), this.f16564b);
    }
}
