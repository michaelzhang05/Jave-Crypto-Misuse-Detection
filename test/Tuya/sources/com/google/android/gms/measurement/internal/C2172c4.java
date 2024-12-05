package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2172c4 extends AbstractC2236o {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2178d4 f16445e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172c4(C2178d4 c2178d4, InterfaceC2263t2 interfaceC2263t2) {
        super(interfaceC2263t2);
        this.f16445e = c2178d4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2236o
    public final void c() {
        this.f16445e.m();
        this.f16445e.f16777a.d().v().a("Starting upload from DelayedRunnable");
        this.f16445e.f16482b.C();
    }
}
