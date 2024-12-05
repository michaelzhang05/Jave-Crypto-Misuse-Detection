package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2283x1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Long f16887e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16888f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f16889g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f16890h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f16891i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f16892j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16893k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2283x1(C2077b1 c2077b1, Long l8, String str, String str2, Bundle bundle, boolean z8, boolean z9) {
        super(c2077b1);
        this.f16887e = l8;
        this.f16888f = str;
        this.f16889g = str2;
        this.f16890h = bundle;
        this.f16891i = z8;
        this.f16892j = z9;
        this.f16893k = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        long longValue;
        Q0 q02;
        Long l8 = this.f16887e;
        if (l8 == null) {
            longValue = this.f16563a;
        } else {
            longValue = l8.longValue();
        }
        long j8 = longValue;
        q02 = this.f16893k.f16562i;
        ((Q0) AbstractC1400p.l(q02)).logEvent(this.f16888f, this.f16889g, this.f16890h, this.f16891i, this.f16892j, j8);
    }
}
