package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2147i1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16667e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16668f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ O0 f16669g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16670h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147i1(C2077b1 c2077b1, String str, String str2, O0 o02) {
        super(c2077b1);
        this.f16667e = str;
        this.f16668f = str2;
        this.f16669g = o02;
        this.f16670h = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16670h.f16562i;
        ((Q0) AbstractC1400p.l(q02)).getConditionalUserProperties(this.f16667e, this.f16668f, this.f16669g);
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    protected final void b() {
        this.f16669g.e(null);
    }
}
