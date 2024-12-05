package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzard
/* loaded from: classes2.dex */
final class a7<T> implements zzbbh<T> {

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f11062f;

    /* renamed from: g, reason: collision with root package name */
    private final c7 f11063g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a7(Throwable th) {
        this.f11062f = th;
        c7 c7Var = new c7();
        this.f11063g = c7Var;
        c7Var.b();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void f(Runnable runnable, Executor executor) {
        this.f11063g.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException {
        throw new ExecutionException(this.f11062f);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(this.f11062f);
    }
}
