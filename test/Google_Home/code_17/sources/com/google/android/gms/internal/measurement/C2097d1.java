package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2097d1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16598e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16599f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f16600g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f16601h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16602i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2097d1(C2077b1 c2077b1, String str, String str2, Object obj, boolean z8) {
        super(c2077b1);
        this.f16598e = str;
        this.f16599f = str2;
        this.f16600g = obj;
        this.f16601h = z8;
        this.f16602i = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16602i.f16562i;
        ((Q0) AbstractC1400p.l(q02)).setUserProperty(this.f16598e, this.f16599f, Y.b.s0(this.f16600g), this.f16601h, this.f16563a);
    }
}
