package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2327c4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17527a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17528b = null;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17529c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17530d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ A3 f17531e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2327c4(A3 a32, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f17527a = atomicReference;
        this.f17529c = str2;
        this.f17530d = str3;
        this.f17531e = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17531e.f17844a.J().Q(this.f17527a, null, this.f17529c, this.f17530d);
    }
}
