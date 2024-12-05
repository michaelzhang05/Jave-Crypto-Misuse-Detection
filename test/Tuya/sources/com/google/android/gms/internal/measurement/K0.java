package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f15362e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15363f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f15364g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f15365h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f15366i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f15367j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ X0 f15368k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(X0 x02, Long l8, String str, String str2, Bundle bundle, boolean z8, boolean z9) {
        super(x02, true);
        this.f15368k = x02;
        this.f15362e = l8;
        this.f15363f = str;
        this.f15364g = str2;
        this.f15365h = bundle;
        this.f15366i = z8;
        this.f15367j = z9;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        long longValue;
        InterfaceC2005h0 interfaceC2005h0;
        Long l8 = this.f15362e;
        if (l8 == null) {
            longValue = this.f15390a;
        } else {
            longValue = l8.longValue();
        }
        long j8 = longValue;
        interfaceC2005h0 = this.f15368k.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).logEvent(this.f15363f, this.f15364g, this.f15365h, this.f15366i, this.f15367j, j8);
    }
}
