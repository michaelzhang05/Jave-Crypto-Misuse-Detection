package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import android.app.Activity;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2157j1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f16682e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16683f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f16684g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16685h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2157j1(C2077b1 c2077b1, Activity activity, String str, String str2) {
        super(c2077b1);
        this.f16682e = activity;
        this.f16683f = str;
        this.f16684g = str2;
        this.f16685h = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16685h.f16562i;
        ((Q0) AbstractC1400p.l(q02)).setCurrentScreen(Y.b.s0(this.f16682e), this.f16683f, this.f16684g, this.f16563a);
    }
}
