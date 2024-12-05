package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzsh;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class n30<T extends zzsh> extends Handler implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final T f11837f;

    /* renamed from: g, reason: collision with root package name */
    private final zzsf<T> f11838g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11839h;

    /* renamed from: i, reason: collision with root package name */
    private final long f11840i;

    /* renamed from: j, reason: collision with root package name */
    private IOException f11841j;

    /* renamed from: k, reason: collision with root package name */
    private int f11842k;
    private volatile Thread l;
    private volatile boolean m;
    private final /* synthetic */ zzse n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(zzse zzseVar, Looper looper, T t, zzsf<T> zzsfVar, int i2, long j2) {
        super(looper);
        this.n = zzseVar;
        this.f11837f = t;
        this.f11838g = zzsfVar;
        this.f11839h = i2;
        this.f11840i = j2;
    }

    private final void a() {
        ExecutorService executorService;
        n30 n30Var;
        this.f11841j = null;
        executorService = this.n.a;
        n30Var = this.n.f15535b;
        executorService.execute(n30Var);
    }

    private final void b() {
        this.n.f15535b = null;
    }

    public final void c(int i2) throws IOException {
        IOException iOException = this.f11841j;
        if (iOException != null && this.f11842k > i2) {
            throw iOException;
        }
    }

    public final void d(long j2) {
        n30 n30Var;
        n30Var = this.n.f15535b;
        zzsk.e(n30Var == null);
        this.n.f15535b = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            a();
        }
    }

    public final void e(boolean z) {
        this.m = z;
        this.f11841j = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f11837f.b();
            if (this.l != null) {
                this.l.interrupt();
            }
        }
        if (z) {
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f11838g.n(this.f11837f, elapsedRealtime, elapsedRealtime - this.f11840i, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.m) {
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            a();
            return;
        }
        if (i2 != 4) {
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.f11840i;
            if (this.f11837f.a()) {
                this.f11838g.n(this.f11837f, elapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                this.f11838g.n(this.f11837f, elapsedRealtime, j2, false);
                return;
            }
            if (i3 == 2) {
                this.f11838g.g(this.f11837f, elapsedRealtime, j2);
                return;
            }
            if (i3 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f11841j = iOException;
            int m = this.f11838g.m(this.f11837f, elapsedRealtime, j2, iOException);
            if (m == 3) {
                this.n.f15536c = this.f11841j;
                return;
            } else {
                if (m != 2) {
                    this.f11842k = m == 1 ? 1 : this.f11842k + 1;
                    d(Math.min((r12 - 1) * 1000, 5000));
                    return;
                }
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.l = Thread.currentThread();
            if (!this.f11837f.a()) {
                String simpleName = this.f11837f.getClass().getSimpleName();
                zzsx.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f11837f.c();
                    zzsx.b();
                } catch (Throwable th) {
                    zzsx.b();
                    throw th;
                }
            }
            if (this.m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.m) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (Error e3) {
            Log.e("LoadTask", "Unexpected error loading stream", e3);
            if (!this.m) {
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (InterruptedException unused) {
            zzsk.e(this.f11837f.a());
            if (this.m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e4) {
            Log.e("LoadTask", "Unexpected exception loading stream", e4);
            if (this.m) {
                return;
            }
            obtainMessage(3, new zzsi(e4)).sendToTarget();
        } catch (OutOfMemoryError e5) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e5);
            if (this.m) {
                return;
            }
            obtainMessage(3, new zzsi(e5)).sendToTarget();
        }
    }
}
