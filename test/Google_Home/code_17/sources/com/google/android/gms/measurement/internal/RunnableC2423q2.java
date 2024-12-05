package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2423q2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2409o2 f17773a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17774b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f17775c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f17776d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17777e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f17778f;

    @Override // java.lang.Runnable
    public final void run() {
        this.f17773a.a(this.f17777e, this.f17774b, this.f17775c, this.f17776d, this.f17778f);
    }

    private RunnableC2423q2(String str, InterfaceC2409o2 interfaceC2409o2, int i8, Throwable th, byte[] bArr, Map map) {
        AbstractC1400p.l(interfaceC2409o2);
        this.f17773a = interfaceC2409o2;
        this.f17774b = i8;
        this.f17775c = th;
        this.f17776d = bArr;
        this.f17777e = str;
        this.f17778f = map;
    }
}
