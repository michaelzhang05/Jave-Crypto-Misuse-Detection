package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.C2077b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2247t1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16843e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16844f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f16845g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ O0 f16846h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16847i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247t1(C2077b1 c2077b1, String str, String str2, boolean z8, O0 o02) {
        super(c2077b1);
        this.f16843e = str;
        this.f16844f = str2;
        this.f16845g = z8;
        this.f16846h = o02;
        this.f16847i = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Q0 q02;
        q02 = this.f16847i.f16562i;
        ((Q0) AbstractC1400p.l(q02)).getUserProperties(this.f16843e, this.f16844f, this.f16845g, this.f16846h);
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    protected final void b() {
        this.f16846h.e(null);
    }
}
