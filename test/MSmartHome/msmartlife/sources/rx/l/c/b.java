package rx.l.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import rx.exceptions.OnErrorNotImplementedException;
import rx.h;
import rx.k;
import rx.q.f;
import rx.t.e;

/* compiled from: LooperScheduler.java */
/* loaded from: classes2.dex */
class b extends h {
    private final Handler a;

    /* compiled from: LooperScheduler.java */
    /* loaded from: classes2.dex */
    static class a extends h.a {

        /* renamed from: f, reason: collision with root package name */
        private final Handler f22463f;

        /* renamed from: g, reason: collision with root package name */
        private final rx.l.b.b f22464g = rx.l.b.a.a().b();

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f22465h;

        a(Handler handler) {
            this.f22463f = handler;
        }

        @Override // rx.h.a
        public k c(rx.m.a aVar) {
            return d(aVar, 0L, TimeUnit.MILLISECONDS);
        }

        @Override // rx.h.a
        public k d(rx.m.a aVar, long j2, TimeUnit timeUnit) {
            if (this.f22465h) {
                return e.c();
            }
            RunnableC0398b runnableC0398b = new RunnableC0398b(this.f22464g.c(aVar), this.f22463f);
            Message obtain = Message.obtain(this.f22463f, runnableC0398b);
            obtain.obj = this;
            this.f22463f.sendMessageDelayed(obtain, timeUnit.toMillis(j2));
            if (!this.f22465h) {
                return runnableC0398b;
            }
            this.f22463f.removeCallbacks(runnableC0398b);
            return e.c();
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f22465h;
        }

        @Override // rx.k
        public void unsubscribe() {
            this.f22465h = true;
            this.f22463f.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LooperScheduler.java */
    /* renamed from: rx.l.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class RunnableC0398b implements Runnable, k {

        /* renamed from: f, reason: collision with root package name */
        private final rx.m.a f22466f;

        /* renamed from: g, reason: collision with root package name */
        private final Handler f22467g;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f22468h;

        RunnableC0398b(rx.m.a aVar, Handler handler) {
            this.f22466f = aVar;
            this.f22467g = handler;
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f22468h;
        }

        @Override // java.lang.Runnable
        public void run() {
            IllegalStateException illegalStateException;
            try {
                this.f22466f.call();
            } catch (Throwable th) {
                if (th instanceof OnErrorNotImplementedException) {
                    illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
                } else {
                    illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                }
                f.c().b().a(illegalStateException);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        @Override // rx.k
        public void unsubscribe() {
            this.f22468h = true;
            this.f22467g.removeCallbacks(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Looper looper) {
        this.a = new Handler(looper);
    }

    @Override // rx.h
    public h.a createWorker() {
        return new a(this.a);
    }
}
