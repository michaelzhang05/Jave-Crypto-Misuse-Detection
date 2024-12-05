package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class zzcyb<T> {
    private final Deque<zzbbh<T>> a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable<T> f14591b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbbl f14592c;

    public zzcyb(Callable<T> callable, zzbbl zzbblVar) {
        this.f14591b = callable;
        this.f14592c = zzbblVar;
    }

    public final synchronized void a(zzbbh<T> zzbbhVar) {
        this.a.addFirst(zzbbhVar);
    }

    public final synchronized zzbbh<T> b() {
        c(1);
        return this.a.poll();
    }

    public final synchronized void c(int i2) {
        int size = i2 - this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.a.add(this.f14592c.T(this.f14591b));
        }
    }
}
