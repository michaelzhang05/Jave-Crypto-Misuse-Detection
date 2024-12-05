package com.google.android.gms.common.api.internal;

import O.g;
import O.j;
import Q.AbstractC1400p;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import d0.HandlerC2730i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends O.j> extends O.g {

    /* renamed from: m, reason: collision with root package name */
    static final ThreadLocal f15904m = new D();

    /* renamed from: b, reason: collision with root package name */
    protected final a f15906b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f15907c;

    /* renamed from: g, reason: collision with root package name */
    private O.j f15911g;

    /* renamed from: h, reason: collision with root package name */
    private Status f15912h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f15913i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15914j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15915k;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15905a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f15908d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f15909e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f15910f = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    private boolean f15916l = false;

    /* loaded from: classes3.dex */
    public static class a extends HandlerC2730i {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 1) {
                if (i8 != 2) {
                    Log.wtf("BasePendingResult", "Don't know how to handle message: " + i8, new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).d(Status.f15892i);
                return;
            }
            Pair pair = (Pair) message.obj;
            android.support.v4.media.a.a(pair.first);
            O.j jVar = (O.j) pair.second;
            try {
                throw null;
            } catch (RuntimeException e8) {
                BasePendingResult.j(jVar);
                throw e8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(O.f fVar) {
        Looper mainLooper;
        if (fVar != null) {
            mainLooper = fVar.c();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f15906b = new a(mainLooper);
        this.f15907c = new WeakReference(fVar);
    }

    private final O.j g() {
        O.j jVar;
        synchronized (this.f15905a) {
            AbstractC1400p.p(!this.f15913i, "Result has already been consumed.");
            AbstractC1400p.p(e(), "Result is not ready.");
            jVar = this.f15911g;
            this.f15911g = null;
            this.f15913i = true;
        }
        android.support.v4.media.a.a(this.f15910f.getAndSet(null));
        return (O.j) AbstractC1400p.l(jVar);
    }

    private final void h(O.j jVar) {
        this.f15911g = jVar;
        this.f15912h = jVar.getStatus();
        this.f15908d.countDown();
        ArrayList arrayList = this.f15909e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((g.a) arrayList.get(i8)).a(this.f15912h);
        }
        this.f15909e.clear();
    }

    @Override // O.g
    public final void a(g.a aVar) {
        boolean z8;
        if (aVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1400p.b(z8, "Callback cannot be null.");
        synchronized (this.f15905a) {
            try {
                if (e()) {
                    aVar.a(this.f15912h);
                } else {
                    this.f15909e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O.g
    public final O.j b(long j8, TimeUnit timeUnit) {
        if (j8 > 0) {
            AbstractC1400p.k("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC1400p.p(!this.f15913i, "Result has already been consumed.");
        AbstractC1400p.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.f15908d.await(j8, timeUnit)) {
                d(Status.f15892i);
            }
        } catch (InterruptedException unused) {
            d(Status.f15890g);
        }
        AbstractC1400p.p(e(), "Result is not ready.");
        return g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract O.j c(Status status);

    public final void d(Status status) {
        synchronized (this.f15905a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.f15915k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        if (this.f15908d.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void f(O.j jVar) {
        synchronized (this.f15905a) {
            try {
                if (!this.f15915k && !this.f15914j) {
                    e();
                    AbstractC1400p.p(!e(), "Results have already been set");
                    AbstractC1400p.p(!this.f15913i, "Result has already been consumed");
                    h(jVar);
                    return;
                }
                j(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        boolean z8 = true;
        if (!this.f15916l && !((Boolean) f15904m.get()).booleanValue()) {
            z8 = false;
        }
        this.f15916l = z8;
    }

    public static void j(O.j jVar) {
    }
}
