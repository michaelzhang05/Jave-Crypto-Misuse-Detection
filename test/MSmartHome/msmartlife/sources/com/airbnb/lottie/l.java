package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public class l<T> {
    public static Executor a = Executors.newCachedThreadPool();

    /* renamed from: b, reason: collision with root package name */
    private Thread f7950b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<h<T>> f7951c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<h<Throwable>> f7952d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f7953e;

    /* renamed from: f, reason: collision with root package name */
    private final FutureTask<k<T>> f7954f;

    /* renamed from: g, reason: collision with root package name */
    private volatile k<T> f7955g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.f7955g == null || l.this.f7954f.isCancelled()) {
                return;
            }
            k kVar = l.this.f7955g;
            if (kVar.b() != null) {
                l.this.k(kVar.b());
            } else {
                l.this.i(kVar.a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class b extends Thread {

        /* renamed from: f, reason: collision with root package name */
        private boolean f7957f;

        b(String str) {
            super(str);
            this.f7957f = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!isInterrupted() && !this.f7957f) {
                if (l.this.f7954f.isDone()) {
                    try {
                        l lVar = l.this;
                        lVar.n((k) lVar.f7954f.get());
                    } catch (InterruptedException | ExecutionException e2) {
                        l.this.n(new k(e2));
                    }
                    this.f7957f = true;
                    l.this.p();
                }
            }
        }
    }

    public l(Callable<k<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f7952d);
        if (arrayList.isEmpty()) {
            Log.w("LOTTIE", "Lottie encountered an error but no failure listener was added.", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(th);
        }
    }

    private void j() {
        this.f7953e.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(T t) {
        Iterator it = new ArrayList(this.f7951c).iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(k<T> kVar) {
        if (this.f7955g == null) {
            this.f7955g = kVar;
            j();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    private synchronized void o() {
        if (!q() && this.f7955g == null) {
            b bVar = new b("LottieTaskObserver");
            this.f7950b = bVar;
            bVar.start();
            c.b("Starting TaskObserver thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        if (q()) {
            if (this.f7951c.isEmpty() || this.f7955g != null) {
                this.f7950b.interrupt();
                this.f7950b = null;
                c.b("Stopping TaskObserver thread");
            }
        }
    }

    private boolean q() {
        Thread thread = this.f7950b;
        return thread != null && thread.isAlive();
    }

    public synchronized l<T> g(h<Throwable> hVar) {
        if (this.f7955g != null && this.f7955g.a() != null) {
            hVar.a(this.f7955g.a());
        }
        this.f7952d.add(hVar);
        o();
        return this;
    }

    public synchronized l<T> h(h<T> hVar) {
        if (this.f7955g != null && this.f7955g.b() != null) {
            hVar.a(this.f7955g.b());
        }
        this.f7951c.add(hVar);
        o();
        return this;
    }

    public synchronized l<T> l(h<Throwable> hVar) {
        this.f7952d.remove(hVar);
        p();
        return this;
    }

    public synchronized l<T> m(h<T> hVar) {
        this.f7951c.remove(hVar);
        p();
        return this;
    }

    l(Callable<k<T>> callable, boolean z) {
        this.f7951c = new LinkedHashSet(1);
        this.f7952d = new LinkedHashSet(1);
        this.f7953e = new Handler(Looper.getMainLooper());
        this.f7955g = null;
        FutureTask<k<T>> futureTask = new FutureTask<>(callable);
        this.f7954f = futureTask;
        if (z) {
            try {
                n(callable.call());
                return;
            } catch (Throwable th) {
                n(new k<>(th));
                return;
            }
        }
        a.execute(futureTask);
        o();
    }
}
