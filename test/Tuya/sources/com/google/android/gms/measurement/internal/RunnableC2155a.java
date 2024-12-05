package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2155a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16410a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16411b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D0 f16412c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2155a(D0 d02, String str, long j8) {
        this.f16412c = d02;
        this.f16410a = str;
        this.f16411b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D0.i(this.f16412c, this.f16410a, this.f16411b);
    }
}
