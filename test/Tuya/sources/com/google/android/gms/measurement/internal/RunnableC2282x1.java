package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.util.Map;
import m0.AbstractC3393f;

/* renamed from: com.google.android.gms.measurement.internal.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2282x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2277w1 f16917a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16918b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f16919c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f16920d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16921e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f16922f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC2282x1(String str, InterfaceC2277w1 interfaceC2277w1, int i8, Throwable th, byte[] bArr, Map map, AbstractC3393f abstractC3393f) {
        AbstractC1319p.l(interfaceC2277w1);
        this.f16917a = interfaceC2277w1;
        this.f16918b = i8;
        this.f16919c = th;
        this.f16920d = bArr;
        this.f16921e = str;
        this.f16922f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16917a.a(this.f16921e, this.f16918b, this.f16919c, this.f16920d, this.f16922f);
    }
}
