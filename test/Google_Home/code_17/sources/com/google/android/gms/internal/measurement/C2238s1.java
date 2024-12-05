package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2238s1 extends C2077b1.a {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16812f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f16813g;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16816j;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f16811e = 5;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Object f16814h = null;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Object f16815i = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2238s1(C2077b1 c2077b1, boolean z8, int i8, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f16812f = str;
        this.f16813g = obj;
        this.f16816j = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16816j.f16562i;
        ((Q0) AbstractC1400p.l(q02)).logHealthData(this.f16811e, this.f16812f, Y.b.s0(this.f16813g), Y.b.s0(null), Y.b.s0(null));
    }
}
