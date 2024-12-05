package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2256u1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16857e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ O0 f16858f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16859g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2256u1(C2077b1 c2077b1, String str, O0 o02) {
        super(c2077b1);
        this.f16857e = str;
        this.f16858f = o02;
        this.f16859g = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16859g.f16562i;
        ((Q0) AbstractC1400p.l(q02)).getMaxUserProperties(this.f16857e, this.f16858f);
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    protected final void b() {
        this.f16858f.e(null);
    }
}
