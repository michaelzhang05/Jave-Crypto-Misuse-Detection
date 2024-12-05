package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2208i4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s4 f16521a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r4 f16522b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2208i4(r4 r4Var, s4 s4Var) {
        this.f16522b = r4Var;
        this.f16521a = s4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4.k0(this.f16522b, this.f16521a);
        this.f16522b.x();
    }
}
