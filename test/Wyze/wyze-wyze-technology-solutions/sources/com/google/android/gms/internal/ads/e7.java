package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@zzard
/* loaded from: classes2.dex */
final class e7<V> extends FutureTask<V> implements zzbbh<V> {

    /* renamed from: f, reason: collision with root package name */
    private final c7 f11342f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e7(Callable<V> callable) {
        super(callable);
        this.f11342f = new c7();
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        this.f11342f.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void f(Runnable runnable, Executor executor) {
        this.f11342f.a(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e7(Runnable runnable, V v) {
        super(runnable, v);
        this.f11342f = new c7();
    }
}
