package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16169a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16170b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16171c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y2 f16172d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I2(Y2 y22, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f16172d = y22;
        this.f16169a = atomicReference;
        this.f16170b = str2;
        this.f16171c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16172d.f16777a.L().U(this.f16169a, null, this.f16170b, this.f16171c);
    }
}
