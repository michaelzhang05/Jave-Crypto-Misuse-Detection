package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzcze<E, V> implements zzbbh<V> {

    /* renamed from: f, reason: collision with root package name */
    private final E f14613f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14614g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbbh<V> f14615h;

    public zzcze(E e2, String str, zzbbh<V> zzbbhVar) {
        this.f14613f = e2;
        this.f14614g = str;
        this.f14615h = zzbbhVar;
    }

    public final E a() {
        return this.f14613f;
    }

    public final String b() {
        return this.f14614g;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f14615h.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void f(Runnable runnable, Executor executor) {
        this.f14615h.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.f14615h.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14615h.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14615h.isDone();
    }

    public final String toString() {
        String str = this.f14614g;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f14615h.get(j2, timeUnit);
    }
}
