package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P2 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final long f17281a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f17282b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17283c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ M2 f17284d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(M2 m22, Runnable runnable, boolean z8, String str) {
        super(com.google.android.gms.internal.measurement.J0.a().b(runnable), null);
        AtomicLong atomicLong;
        this.f17284d = m22;
        AbstractC1400p.l(str);
        atomicLong = M2.f17249l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f17281a = andIncrement;
        this.f17283c = str;
        this.f17282b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            m22.c().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        P2 p22 = (P2) obj;
        boolean z8 = this.f17282b;
        if (z8 != p22.f17282b) {
            if (!z8) {
                return 1;
            }
            return -1;
        }
        long j8 = this.f17281a;
        long j9 = p22.f17281a;
        if (j8 < j9) {
            return -1;
        }
        if (j8 > j9) {
            return 1;
        }
        this.f17284d.c().I().b("Two tasks share the same index. index", Long.valueOf(this.f17281a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f17284d.c().G().b(this.f17283c, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(M2 m22, Callable callable, boolean z8, String str) {
        super(com.google.android.gms.internal.measurement.J0.a().a(callable));
        AtomicLong atomicLong;
        this.f17284d = m22;
        AbstractC1400p.l(str);
        atomicLong = M2.f17249l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f17281a = andIncrement;
        this.f17283c = str;
        this.f17282b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            m22.c().G().a("Tasks index overflow");
        }
    }
}
