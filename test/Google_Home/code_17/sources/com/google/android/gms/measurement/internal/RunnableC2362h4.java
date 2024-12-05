package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2362h4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Boolean f17615a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17616b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2362h4(A3 a32, Boolean bool) {
        this.f17615a = bool;
        this.f17616b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17616b.a0(this.f17615a, true);
    }
}
