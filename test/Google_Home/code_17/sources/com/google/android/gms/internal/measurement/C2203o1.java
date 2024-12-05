package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2203o1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ O0 f16754e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16755f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203o1(C2077b1 c2077b1, O0 o02) {
        super(c2077b1);
        this.f16754e = o02;
        this.f16755f = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16755f.f16562i;
        ((Q0) AbstractC1400p.l(q02)).generateEventId(this.f16754e);
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    protected final void b() {
        this.f16754e.e(null);
    }
}
