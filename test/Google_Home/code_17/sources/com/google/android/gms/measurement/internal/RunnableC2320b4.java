package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2320b4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17478a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17479b = null;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17480c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17481d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f17482e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ A3 f17483f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2320b4(A3 a32, AtomicReference atomicReference, String str, String str2, String str3, boolean z8) {
        this.f17478a = atomicReference;
        this.f17480c = str2;
        this.f17481d = str3;
        this.f17482e = z8;
        this.f17483f = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17483f.f17844a.J().R(this.f17478a, null, this.f17480c, this.f17481d, this.f17482e);
    }
}
