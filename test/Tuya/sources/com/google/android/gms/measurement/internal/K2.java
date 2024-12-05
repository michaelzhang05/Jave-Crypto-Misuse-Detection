package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16196a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16197b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16198c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f16199d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y2 f16200e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K2(Y2 y22, AtomicReference atomicReference, String str, String str2, String str3, boolean z8) {
        this.f16200e = y22;
        this.f16196a = atomicReference;
        this.f16197b = str2;
        this.f16198c = str3;
        this.f16199d = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16200e.f16777a.L().W(this.f16196a, null, this.f16197b, this.f16198c, this.f16199d);
    }
}
