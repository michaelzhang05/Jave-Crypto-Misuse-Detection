package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import android.app.Activity;
import com.google.android.gms.internal.measurement.C2077b1;

/* loaded from: classes3.dex */
final class B1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f16081e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2077b1.b f16082f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(C2077b1.b bVar, Activity activity) {
        super(C2077b1.this);
        this.f16081e = activity;
        this.f16082f = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = C2077b1.this.f16562i;
        ((Q0) AbstractC1400p.l(q02)).onActivityResumed(Y.b.s0(this.f16081e), this.f16564b);
    }
}
