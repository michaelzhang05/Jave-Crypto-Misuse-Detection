package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

@zzard
/* loaded from: classes2.dex */
public final class zzbar {
    public static <V> zzbbc<V> a(zzbbh<? extends V>... zzbbhVarArr) {
        return n(Arrays.asList(zzbbhVarArr));
    }

    public static <V> zzbbh<V> b(zzbbh<V> zzbbhVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final zzbbr zzbbrVar = new zzbbr();
        h(zzbbrVar, zzbbhVar);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable(zzbbrVar) { // from class: com.google.android.gms.internal.ads.t6

            /* renamed from: f, reason: collision with root package name */
            private final zzbbr f12193f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12193f = zzbbrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12193f.c(new TimeoutException());
            }
        }, j2, timeUnit);
        g(zzbbhVar, zzbbrVar);
        zzbbrVar.f(new Runnable(schedule) { // from class: com.google.android.gms.internal.ads.u6

            /* renamed from: f, reason: collision with root package name */
            private final Future f12215f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12215f = schedule;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Future future = this.f12215f;
                if (future.isDone()) {
                    return;
                }
                future.cancel(true);
            }
        }, zzbbm.f13155b);
        return zzbbrVar;
    }

    public static <A, B> zzbbh<B> c(final zzbbh<A> zzbbhVar, final zzbal<? super A, ? extends B> zzbalVar, Executor executor) {
        final zzbbr zzbbrVar = new zzbbr();
        zzbbhVar.f(new Runnable(zzbbrVar, zzbalVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.q6

            /* renamed from: f, reason: collision with root package name */
            private final zzbbr f12046f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbal f12047g;

            /* renamed from: h, reason: collision with root package name */
            private final zzbbh f12048h;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12046f = zzbbrVar;
                this.f12047g = zzbalVar;
                this.f12048h = zzbbhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbar.i(this.f12046f, this.f12047g, this.f12048h);
            }
        }, executor);
        h(zzbbrVar, zzbbhVar);
        return zzbbrVar;
    }

    public static <A, B> zzbbh<B> d(final zzbbh<A> zzbbhVar, final zzbam<A, B> zzbamVar, Executor executor) {
        final zzbbr zzbbrVar = new zzbbr();
        zzbbhVar.f(new Runnable(zzbbrVar, zzbamVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.p6

            /* renamed from: f, reason: collision with root package name */
            private final zzbbr f11976f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbam f11977g;

            /* renamed from: h, reason: collision with root package name */
            private final zzbbh f11978h;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11976f = zzbbrVar;
                this.f11977g = zzbamVar;
                this.f11978h = zzbbhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbbr zzbbrVar2 = this.f11976f;
                try {
                    zzbbrVar2.b(this.f11977g.a(this.f11978h.get()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzbbrVar2.c(e2);
                } catch (CancellationException unused) {
                    zzbbrVar2.cancel(true);
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzbbrVar2.c(e);
                } catch (Exception e4) {
                    zzbbrVar2.c(e4);
                }
            }
        }, executor);
        h(zzbbrVar, zzbbhVar);
        return zzbbrVar;
    }

    public static <V, X extends Throwable> zzbbh<V> e(final zzbbh<? extends V> zzbbhVar, final Class<X> cls, final zzbal<? super X, ? extends V> zzbalVar, final Executor executor) {
        final zzbbr zzbbrVar = new zzbbr();
        h(zzbbrVar, zzbbhVar);
        zzbbhVar.f(new Runnable(zzbbrVar, zzbbhVar, cls, zzbalVar, executor) { // from class: com.google.android.gms.internal.ads.v6

            /* renamed from: f, reason: collision with root package name */
            private final zzbbr f12270f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbbh f12271g;

            /* renamed from: h, reason: collision with root package name */
            private final Class f12272h;

            /* renamed from: i, reason: collision with root package name */
            private final zzbal f12273i;

            /* renamed from: j, reason: collision with root package name */
            private final Executor f12274j;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12270f = zzbbrVar;
                this.f12271g = zzbbhVar;
                this.f12272h = cls;
                this.f12273i = zzbalVar;
                this.f12274j = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbar.j(this.f12270f, this.f12271g, this.f12272h, this.f12273i, this.f12274j);
            }
        }, zzbbm.f13155b);
        return zzbbrVar;
    }

    public static <V> void f(final zzbbh<V> zzbbhVar, final zzban<? super V> zzbanVar, Executor executor) {
        zzbbhVar.f(new Runnable(zzbanVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.o6

            /* renamed from: f, reason: collision with root package name */
            private final zzban f11923f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbbh f11924g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11923f = zzbanVar;
                this.f11924g = zzbbhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzban zzbanVar2 = this.f11923f;
                try {
                    zzbanVar2.b(this.f11924g.get());
                } catch (InterruptedException e2) {
                    e = e2;
                    Thread.currentThread().interrupt();
                    zzbanVar2.a(e);
                } catch (ExecutionException e3) {
                    e = e3.getCause();
                    zzbanVar2.a(e);
                } catch (Exception e4) {
                    e = e4;
                    zzbanVar2.a(e);
                }
            }
        }, executor);
    }

    private static <V> void g(final zzbbh<? extends V> zzbbhVar, final zzbbr<V> zzbbrVar) {
        h(zzbbrVar, zzbbhVar);
        zzbbhVar.f(new Runnable(zzbbrVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.w6

            /* renamed from: f, reason: collision with root package name */
            private final zzbbr f12320f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbbh f12321g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12320f = zzbbrVar;
                this.f12321g = zzbbhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbbr zzbbrVar2 = this.f12320f;
                try {
                    zzbbrVar2.b(this.f12321g.get());
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzbbrVar2.c(e2);
                } catch (ExecutionException e3) {
                    zzbbrVar2.c(e3.getCause());
                } catch (Exception e4) {
                    zzbbrVar2.c(e4);
                }
            }
        }, zzbbm.f13155b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <A, B> void h(final zzbbh<A> zzbbhVar, final Future<B> future) {
        zzbbhVar.f(new Runnable(zzbbhVar, future) { // from class: com.google.android.gms.internal.ads.x6

            /* renamed from: f, reason: collision with root package name */
            private final zzbbh f12375f;

            /* renamed from: g, reason: collision with root package name */
            private final Future f12376g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12375f = zzbbhVar;
                this.f12376g = future;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbbh zzbbhVar2 = this.f12375f;
                Future future2 = this.f12376g;
                if (zzbbhVar2.isCancelled()) {
                    future2.cancel(true);
                }
            }
        }, zzbbm.f13155b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void i(zzbbr zzbbrVar, zzbal zzbalVar, zzbbh zzbbhVar) {
        if (zzbbrVar.isCancelled()) {
            return;
        }
        try {
            g(zzbalVar.zzf(zzbbhVar.get()), zzbbrVar);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            zzbbrVar.c(e2);
        } catch (CancellationException unused) {
            zzbbrVar.cancel(true);
        } catch (ExecutionException e3) {
            zzbbrVar.c(e3.getCause());
        } catch (Exception e4) {
            zzbbrVar.c(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void j(com.google.android.gms.internal.ads.zzbbr r1, com.google.android.gms.internal.ads.zzbbh r2, java.lang.Class r3, com.google.android.gms.internal.ads.zzbal r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L8 java.lang.InterruptedException -> La java.util.concurrent.ExecutionException -> L13
            r1.b(r2)     // Catch: java.lang.Exception -> L8 java.lang.InterruptedException -> La java.util.concurrent.ExecutionException -> L13
            return
        L8:
            r2 = move-exception
            goto L18
        La:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L18
        L13:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L18:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L2a
            com.google.android.gms.internal.ads.b7 r2 = o(r2)
            com.google.android.gms.internal.ads.zzbbh r2 = c(r2, r4, r5)
            g(r2, r1)
            return
        L2a:
            r1.c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbar.j(com.google.android.gms.internal.ads.zzbbr, com.google.android.gms.internal.ads.zzbbh, java.lang.Class, com.google.android.gms.internal.ads.zzbal, java.util.concurrent.Executor):void");
    }

    public static <T> a7<T> l(Throwable th) {
        return new a7<>(th);
    }

    public static <V> zzbbh<List<V>> m(final Iterable<? extends zzbbh<? extends V>> iterable) {
        final zzbbr zzbbrVar = new zzbbr();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzbbh<? extends V> zzbbhVar : iterable) {
            atomicInteger.incrementAndGet();
            h(zzbbrVar, zzbbhVar);
        }
        final Runnable runnable = new Runnable(iterable, zzbbrVar) { // from class: com.google.android.gms.internal.ads.r6

            /* renamed from: f, reason: collision with root package name */
            private final Iterable f12098f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbbr f12099g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12098f = iterable;
                this.f12099g = zzbbrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Iterable iterable2 = this.f12098f;
                zzbbr zzbbrVar2 = this.f12099g;
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((zzbbh) it.next()).get());
                    } catch (InterruptedException e2) {
                        e = e2;
                        zzbbrVar2.c(e);
                    } catch (ExecutionException e3) {
                        zzbbrVar2.c(e3.getCause());
                    } catch (Exception e4) {
                        e = e4;
                        zzbbrVar2.c(e);
                    }
                }
                zzbbrVar2.b(arrayList);
            }
        };
        for (final zzbbh<? extends V> zzbbhVar2 : iterable) {
            zzbbhVar2.f(new Runnable(zzbbhVar2, atomicInteger, runnable, zzbbrVar) { // from class: com.google.android.gms.internal.ads.s6

                /* renamed from: f, reason: collision with root package name */
                private final zzbbh f12150f;

                /* renamed from: g, reason: collision with root package name */
                private final AtomicInteger f12151g;

                /* renamed from: h, reason: collision with root package name */
                private final Runnable f12152h;

                /* renamed from: i, reason: collision with root package name */
                private final zzbbr f12153i;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12150f = zzbbhVar2;
                    this.f12151g = atomicInteger;
                    this.f12152h = runnable;
                    this.f12153i = zzbbrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbbh zzbbhVar3 = this.f12150f;
                    AtomicInteger atomicInteger2 = this.f12151g;
                    Runnable runnable2 = this.f12152h;
                    zzbbr zzbbrVar2 = this.f12153i;
                    try {
                        zzbbhVar3.get();
                        if (atomicInteger2.decrementAndGet() == 0) {
                            runnable2.run();
                        }
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        zzbbrVar2.c(e2);
                    } catch (ExecutionException e3) {
                        zzbbrVar2.c(e3.getCause());
                    } catch (Exception e4) {
                        zzbbrVar2.c(e4);
                    }
                }
            }, zzbbm.f13155b);
        }
        return zzbbrVar;
    }

    public static <V> zzbbc<V> n(Iterable<? extends zzbbh<? extends V>> iterable) {
        return new zzbbc<>(iterable);
    }

    public static <T> b7<T> o(T t) {
        return new b7<>(t);
    }
}
