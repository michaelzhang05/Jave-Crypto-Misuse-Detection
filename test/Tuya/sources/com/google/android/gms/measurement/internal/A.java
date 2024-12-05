package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f15996a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f15997b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D0 f15998c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(D0 d02, String str, long j8) {
        this.f15998c = d02;
        this.f15996a = str;
        this.f15997b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D0.j(this.f15998c, this.f15996a, this.f15997b);
    }
}
