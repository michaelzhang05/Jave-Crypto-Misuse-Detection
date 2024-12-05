package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
@KeepName
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> a = new q0();

    /* renamed from: b, reason: collision with root package name */
    private final Object f10568b;

    /* renamed from: c, reason: collision with root package name */
    private final CallbackHandler<R> f10569c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<GoogleApiClient> f10570d;

    /* renamed from: e, reason: collision with root package name */
    private final CountDownLatch f10571e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<PendingResult.StatusListener> f10572f;

    /* renamed from: g, reason: collision with root package name */
    private ResultCallback<? super R> f10573g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<l0> f10574h;

    /* renamed from: i, reason: collision with root package name */
    private R f10575i;

    /* renamed from: j, reason: collision with root package name */
    private Status f10576j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f10577k;
    private boolean l;
    private boolean m;

    @KeepName
    private a mResultGuardian;
    private ICancelToken n;
    private volatile zacm<R> o;
    private boolean p;

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class CallbackHandler<R extends Result> extends zap {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public final void a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i2);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).p(Status.f10559i);
                return;
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.a(result);
            } catch (RuntimeException e2) {
                BasePendingResult.o(result);
                throw e2;
            }
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class a {
        private a() {
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.o(BasePendingResult.this.f10575i);
            super.finalize();
        }

        /* synthetic */ a(BasePendingResult basePendingResult, q0 q0Var) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f10568b = new Object();
        this.f10571e = new CountDownLatch(1);
        this.f10572f = new ArrayList<>();
        this.f10574h = new AtomicReference<>();
        this.p = false;
        this.f10569c = new CallbackHandler<>(Looper.getMainLooper());
        this.f10570d = new WeakReference<>(null);
    }

    private final R i() {
        R r;
        synchronized (this.f10568b) {
            Preconditions.m(!this.f10577k, "Result has already been consumed.");
            Preconditions.m(j(), "Result is not ready.");
            r = this.f10575i;
            this.f10575i = null;
            this.f10573g = null;
            this.f10577k = true;
        }
        l0 andSet = this.f10574h.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    private final void m(R r) {
        this.f10575i = r;
        q0 q0Var = null;
        this.n = null;
        this.f10571e.countDown();
        this.f10576j = this.f10575i.getStatus();
        if (this.l) {
            this.f10573g = null;
        } else if (this.f10573g == null) {
            if (this.f10575i instanceof Releasable) {
                this.mResultGuardian = new a(this, q0Var);
            }
        } else {
            this.f10569c.removeMessages(2);
            this.f10569c.a(this.f10573g, i());
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.f10572f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            PendingResult.StatusListener statusListener = arrayList.get(i2);
            i2++;
            statusListener.a(this.f10576j);
        }
        this.f10572f.clear();
    }

    public static void o(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void b(PendingResult.StatusListener statusListener) {
        Preconditions.b(statusListener != null, "Callback cannot be null.");
        synchronized (this.f10568b) {
            if (j()) {
                statusListener.a(this.f10576j);
            } else {
                this.f10572f.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R c(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            Preconditions.i("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.m(!this.f10577k, "Result has already been consumed.");
        Preconditions.m(this.o == null, "Cannot await if then() has been called.");
        try {
            if (!this.f10571e.await(j2, timeUnit)) {
                p(Status.f10559i);
            }
        } catch (InterruptedException unused) {
            p(Status.f10557g);
        }
        Preconditions.m(j(), "Result is not ready.");
        return i();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void d() {
        synchronized (this.f10568b) {
            if (!this.l && !this.f10577k) {
                ICancelToken iCancelToken = this.n;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                o(this.f10575i);
                this.l = true;
                m(h(Status.f10560j));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public boolean e() {
        boolean z;
        synchronized (this.f10568b) {
            z = this.l;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void f(ResultCallback<? super R> resultCallback) {
        synchronized (this.f10568b) {
            if (resultCallback == null) {
                this.f10573g = null;
                return;
            }
            boolean z = true;
            Preconditions.m(!this.f10577k, "Result has already been consumed.");
            if (this.o != null) {
                z = false;
            }
            Preconditions.m(z, "Cannot set callbacks if then() has been called.");
            if (e()) {
                return;
            }
            if (j()) {
                this.f10569c.a(resultCallback, i());
            } else {
                this.f10573g = resultCallback;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final Integer g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public abstract R h(Status status);

    @KeepForSdk
    public final boolean j() {
        return this.f10571e.getCount() == 0;
    }

    @KeepForSdk
    public final void k(R r) {
        synchronized (this.f10568b) {
            if (!this.m && !this.l) {
                j();
                boolean z = true;
                Preconditions.m(!j(), "Results have already been set");
                if (this.f10577k) {
                    z = false;
                }
                Preconditions.m(z, "Result has already been consumed");
                m(r);
                return;
            }
            o(r);
        }
    }

    public final void n(l0 l0Var) {
        this.f10574h.set(l0Var);
    }

    public final void p(Status status) {
        synchronized (this.f10568b) {
            if (!j()) {
                k(h(status));
                this.m = true;
            }
        }
    }

    public final boolean q() {
        boolean e2;
        synchronized (this.f10568b) {
            if (this.f10570d.get() == null || !this.p) {
                d();
            }
            e2 = e();
        }
        return e2;
    }

    public final void r() {
        this.p = this.p || a.get().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.f10568b = new Object();
        this.f10571e = new CountDownLatch(1);
        this.f10572f = new ArrayList<>();
        this.f10574h = new AtomicReference<>();
        this.p = false;
        this.f10569c = new CallbackHandler<>(googleApiClient != null ? googleApiClient.o() : Looper.getMainLooper());
        this.f10570d = new WeakReference<>(googleApiClient);
    }
}
