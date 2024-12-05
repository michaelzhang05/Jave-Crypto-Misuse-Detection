package c.l.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import c.h.j.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: j, reason: collision with root package name */
    private final Executor f2789j;

    /* renamed from: k, reason: collision with root package name */
    volatile a<D>.RunnableC0068a f2790k;
    volatile a<D>.RunnableC0068a l;
    long m;
    long n;
    Handler o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: c.l.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0068a extends c<Void, Void, D> implements Runnable {
        private final CountDownLatch p = new CountDownLatch(1);
        boolean q;

        RunnableC0068a() {
        }

        @Override // c.l.b.c
        protected void h(D d2) {
            try {
                a.this.y(this, d2);
            } finally {
                this.p.countDown();
            }
        }

        @Override // c.l.b.c
        protected void i(D d2) {
            try {
                a.this.z(this, d2);
            } finally {
                this.p.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.l.b.c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.D();
            } catch (OperationCanceledException e2) {
                if (f()) {
                    return null;
                }
                throw e2;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q = false;
            a.this.A();
        }
    }

    public a(Context context) {
        this(context, c.f2801h);
    }

    void A() {
        if (this.l != null || this.f2790k == null) {
            return;
        }
        if (this.f2790k.q) {
            this.f2790k.q = false;
            this.o.removeCallbacks(this.f2790k);
        }
        if (this.m > 0 && SystemClock.uptimeMillis() < this.n + this.m) {
            this.f2790k.q = true;
            this.o.postAtTime(this.f2790k, this.n + this.m);
        } else {
            this.f2790k.c(this.f2789j, null);
        }
    }

    public abstract D B();

    public void C(D d2) {
    }

    protected D D() {
        return B();
    }

    @Override // c.l.b.b
    @Deprecated
    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        if (this.f2790k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f2790k);
            printWriter.print(" waiting=");
            printWriter.println(this.f2790k.q);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(" waiting=");
            printWriter.println(this.l.q);
        }
        if (this.m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            k.c(this.m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            k.b(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // c.l.b.b
    protected boolean l() {
        if (this.f2790k == null) {
            return false;
        }
        if (!this.f2794e) {
            this.f2797h = true;
        }
        if (this.l != null) {
            if (this.f2790k.q) {
                this.f2790k.q = false;
                this.o.removeCallbacks(this.f2790k);
            }
            this.f2790k = null;
            return false;
        }
        if (this.f2790k.q) {
            this.f2790k.q = false;
            this.o.removeCallbacks(this.f2790k);
            this.f2790k = null;
            return false;
        }
        boolean a = this.f2790k.a(false);
        if (a) {
            this.l = this.f2790k;
            x();
        }
        this.f2790k = null;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.l.b.b
    public void n() {
        super.n();
        c();
        this.f2790k = new RunnableC0068a();
        A();
    }

    public void x() {
    }

    void y(a<D>.RunnableC0068a runnableC0068a, D d2) {
        C(d2);
        if (this.l == runnableC0068a) {
            t();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            f();
            A();
        }
    }

    void z(a<D>.RunnableC0068a runnableC0068a, D d2) {
        if (this.f2790k != runnableC0068a) {
            y(runnableC0068a, d2);
            return;
        }
        if (j()) {
            C(d2);
            return;
        }
        d();
        this.n = SystemClock.uptimeMillis();
        this.f2790k = null;
        g(d2);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.n = -10000L;
        this.f2789j = executor;
    }
}
