package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2424q3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ G f17779a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17780b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ W2 f17781c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2424q3(W2 w22, G g8, String str) {
        this.f17779a = g8;
        this.f17780b = str;
        this.f17781c = w22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        I5 i52;
        I5 i53;
        i52 = this.f17781c.f17393a;
        i52.z0();
        i53 = this.f17781c.f17393a;
        return i53.u0().v(this.f17779a, this.f17780b);
    }
}
