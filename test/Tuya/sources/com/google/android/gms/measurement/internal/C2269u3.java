package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2269u3 extends AbstractC2236o {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K3 f16876e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269u3(K3 k32, InterfaceC2263t2 interfaceC2263t2) {
        super(interfaceC2263t2);
        this.f16876e = k32;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2236o
    public final void c() {
        K3 k32 = this.f16876e;
        k32.h();
        if (!k32.z()) {
            return;
        }
        k32.f16777a.d().v().a("Inactivity, disconnecting from the service");
        k32.Q();
    }
}
