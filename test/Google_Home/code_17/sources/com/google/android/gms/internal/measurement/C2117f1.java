package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2117f1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16625e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16626f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Bundle f16627g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16628h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2117f1(C2077b1 c2077b1, String str, String str2, Bundle bundle) {
        super(c2077b1);
        this.f16625e = str;
        this.f16626f = str2;
        this.f16627g = bundle;
        this.f16628h = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16628h.f16562i;
        ((Q0) AbstractC1400p.l(q02)).clearConditionalUserProperty(this.f16625e, this.f16626f, this.f16627g);
    }
}
