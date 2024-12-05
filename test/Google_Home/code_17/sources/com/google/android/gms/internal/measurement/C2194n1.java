package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2194n1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16733e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16734f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194n1(C2077b1 c2077b1, String str) {
        super(c2077b1);
        this.f16733e = str;
        this.f16734f = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16734f.f16562i;
        ((Q0) AbstractC1400p.l(q02)).endAdUnitExposure(this.f16733e, this.f16564b);
    }
}
