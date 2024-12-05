package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f17267a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M2 f17268b;

    public N2(M2 m22, String str) {
        this.f17268b = m22;
        AbstractC1400p.l(str);
        this.f17267a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f17268b.c().G().b(this.f17267a, th);
    }
}
