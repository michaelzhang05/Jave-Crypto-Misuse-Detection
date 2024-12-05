package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U1 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final long f16301a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f16302b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16303c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ W1 f16304d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(W1 w12, Runnable runnable, boolean z8, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f16304d = w12;
        AbstractC1319p.l(str);
        atomicLong = W1.f16324l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f16301a = andIncrement;
        this.f16303c = str;
        this.f16302b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            w12.f16777a.d().r().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        U1 u12 = (U1) obj;
        boolean z8 = this.f16302b;
        if (z8 != u12.f16302b) {
            if (z8) {
                return -1;
            }
        } else {
            long j8 = this.f16301a;
            long j9 = u12.f16301a;
            if (j8 < j9) {
                return -1;
            }
            if (j8 <= j9) {
                this.f16304d.f16777a.d().t().b("Two tasks share the same index. index", Long.valueOf(this.f16301a));
                return 0;
            }
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f16304d.f16777a.d().r().b(this.f16303c, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(W1 w12, Callable callable, boolean z8, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f16304d = w12;
        AbstractC1319p.l("Task exception on worker thread");
        atomicLong = W1.f16324l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f16301a = andIncrement;
        this.f16303c = "Task exception on worker thread";
        this.f16302b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            w12.f16777a.d().r().a("Tasks index overflow");
        }
    }
}
