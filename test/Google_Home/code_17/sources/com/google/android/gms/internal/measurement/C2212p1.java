package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2212p1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ O0 f16761e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16762f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212p1(C2077b1 c2077b1, O0 o02) {
        super(c2077b1);
        this.f16761e = o02;
        this.f16762f = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16762f.f16562i;
        ((Q0) AbstractC1400p.l(q02)).getCachedAppInstanceId(this.f16761e);
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    protected final void b() {
        this.f16761e.e(null);
    }
}
