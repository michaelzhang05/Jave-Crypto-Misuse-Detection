package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzbbc<V> {
    private final zzbbr<Void> a = new zzbbr<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbc(Iterable<? extends zzbbh<? extends V>> iterable) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzbbh<? extends V> zzbbhVar : iterable) {
            atomicInteger.incrementAndGet();
            zzbar.h(this.a, zzbbhVar);
        }
        if (atomicInteger.get() == 0) {
            this.a.b(null);
            return;
        }
        Iterator<? extends zzbbh<? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            it.next().f(new Runnable(this, atomicInteger) { // from class: com.google.android.gms.internal.ads.y6

                /* renamed from: f, reason: collision with root package name */
                private final zzbbc f12437f;

                /* renamed from: g, reason: collision with root package name */
                private final AtomicInteger f12438g;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12437f = this;
                    this.f12438g = atomicInteger;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12437f.b(this.f12438g);
                }
            }, zzbbm.f13155b);
        }
    }

    public final <C> zzbbh<C> a(final Callable<C> callable, Executor executor) {
        return zzbar.c(this.a, new zzbal(callable) { // from class: com.google.android.gms.internal.ads.z6
            private final Callable a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = callable;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.o(this.a.call());
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(AtomicInteger atomicInteger) {
        if (atomicInteger.decrementAndGet() == 0) {
            this.a.b(null);
        }
    }
}
