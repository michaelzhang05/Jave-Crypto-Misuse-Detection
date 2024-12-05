package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D5 extends AbstractC2461w {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ A5 f17010e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5(A5 a52, InterfaceC2465w3 interfaceC2465w3) {
        super(interfaceC2465w3);
        this.f17010e = a52;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2461w
    public final void d() {
        this.f17010e.z();
        this.f17010e.c().K().a("Starting upload from DelayedRunnable");
        this.f17010e.f16988b.E0();
    }
}
