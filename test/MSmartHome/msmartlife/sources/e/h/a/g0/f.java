package e.h.a.g0;

import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* compiled from: DownloadStatusCallback.java */
/* loaded from: classes2.dex */
public class f implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private final FileDownloadModel f17838f;

    /* renamed from: h, reason: collision with root package name */
    private final a f17840h;

    /* renamed from: i, reason: collision with root package name */
    private final int f17841i;

    /* renamed from: j, reason: collision with root package name */
    private final int f17842j;

    /* renamed from: k, reason: collision with root package name */
    private final int f17843k;
    private long l;
    private Handler m;
    private HandlerThread n;
    private volatile Thread p;
    private volatile boolean o = false;
    private volatile long q = 0;
    private final AtomicLong r = new AtomicLong();
    private final AtomicBoolean s = new AtomicBoolean(false);
    private final AtomicBoolean t = new AtomicBoolean(false);
    private final AtomicBoolean u = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    private final e.h.a.f0.a f17839g = c.j().f();

    /* compiled from: DownloadStatusCallback.java */
    /* loaded from: classes2.dex */
    public static class a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private Exception f17844b;

        /* renamed from: c, reason: collision with root package name */
        private int f17845c;

        public Exception a() {
            return this.f17844b;
        }

        public int b() {
            return this.f17845c;
        }

        public boolean c() {
            return this.a;
        }

        void d(Exception exc) {
            this.f17844b = exc;
        }

        void e(boolean z) {
            this.a = z;
        }

        void f(int i2) {
            this.f17845c = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(FileDownloadModel fileDownloadModel, int i2, int i3, int i4) {
        this.f17838f = fileDownloadModel;
        this.f17842j = i3 < 5 ? 5 : i3;
        this.f17843k = i4;
        this.f17840h = new a();
        this.f17841i = i2;
    }

    private static long a(long j2, long j3) {
        if (j3 <= 0) {
            return -1L;
        }
        if (j2 == -1) {
            return 1L;
        }
        long j4 = j2 / j3;
        if (j4 <= 0) {
            return 1L;
        }
        return j4;
    }

    private Exception c(Exception exc) {
        long length;
        String j2 = this.f17838f.j();
        if ((!this.f17838f.n() && !e.h.a.k0.e.a().f17895f) || !(exc instanceof IOException) || !new File(j2).exists()) {
            return exc;
        }
        long x = e.h.a.k0.f.x(j2);
        if (x > 4096) {
            return exc;
        }
        File file = new File(j2);
        if (!file.exists()) {
            e.h.a.k0.d.c(this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
            length = 0;
        } else {
            length = file.length();
        }
        if (Build.VERSION.SDK_INT >= 9) {
            return new FileDownloadOutOfSpaceException(x, 4096L, length, exc);
        }
        return new FileDownloadOutOfSpaceException(x, 4096L, length);
    }

    private void d() throws IOException {
        w();
        this.f17838f.z((byte) -3);
        this.f17839g.d(this.f17838f.e(), this.f17838f.k());
        this.f17839g.h(this.f17838f.e());
        v((byte) -3);
        if (e.h.a.k0.e.a().f17896g) {
            com.liulishuo.filedownloader.services.f.a(this.f17838f);
        }
    }

    private void e(Exception exc) {
        Exception exc2;
        Exception c2 = c(exc);
        if (c2 instanceof SQLiteFullException) {
            i((SQLiteFullException) c2);
            exc2 = c2;
        } else {
            try {
                this.f17838f.z((byte) -1);
                this.f17838f.u(exc.toString());
                this.f17839g.k(this.f17838f.e(), c2, this.f17838f.g());
                exc2 = c2;
            } catch (SQLiteFullException e2) {
                SQLiteFullException sQLiteFullException = e2;
                i(sQLiteFullException);
                exc2 = sQLiteFullException;
            }
        }
        this.f17840h.d(exc2);
        v((byte) -1);
    }

    private void f() {
        this.f17838f.z((byte) -2);
        this.f17839g.q(this.f17838f.e(), this.f17838f.g());
        v((byte) -2);
    }

    private void g() {
        if (this.f17838f.g() == this.f17838f.k()) {
            this.f17839g.l(this.f17838f.e(), this.f17838f.g());
            return;
        }
        if (this.t.compareAndSet(true, false)) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.e(this, "handleProgress update model's status with progress", new Object[0]);
            }
            this.f17838f.z((byte) 3);
        }
        if (this.s.compareAndSet(true, false)) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.e(this, "handleProgress notify user progress status", new Object[0]);
            }
            v((byte) 3);
        }
    }

    private void h(Exception exc, int i2) {
        Exception c2 = c(exc);
        this.f17840h.d(c2);
        this.f17840h.f(this.f17841i - i2);
        this.f17838f.z((byte) 5);
        this.f17838f.u(c2.toString());
        this.f17839g.c(this.f17838f.e(), c2);
        v((byte) 5);
    }

    private void i(SQLiteFullException sQLiteFullException) {
        int e2 = this.f17838f.e();
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(e2), sQLiteFullException.toString());
        }
        this.f17838f.u(sQLiteFullException.toString());
        this.f17838f.z((byte) -1);
        this.f17839g.remove(e2);
        this.f17839g.h(e2);
    }

    private void j(long j2) {
        boolean z;
        if (!this.u.compareAndSet(true, false)) {
            long j3 = j2 - this.q;
            if (this.l == -1 || this.r.get() < this.l || j3 < this.f17842j) {
                z = false;
                if (z || !this.s.compareAndSet(false, true)) {
                }
                if (e.h.a.k0.d.a) {
                    e.h.a.k0.d.e(this, "inspectNeedCallbackToUser need callback to user", new Object[0]);
                }
                this.q = j2;
                this.r.set(0L);
                return;
            }
        }
        z = true;
        if (z) {
        }
    }

    private boolean k() {
        if (this.f17838f.n()) {
            FileDownloadModel fileDownloadModel = this.f17838f;
            fileDownloadModel.A(fileDownloadModel.g());
        } else if (this.f17838f.g() != this.f17838f.k()) {
            o(new FileDownloadGiveUpRetryException(e.h.a.k0.f.o("sofar[%d] not equal total[%d]", Long.valueOf(this.f17838f.g()), Long.valueOf(this.f17838f.k()))));
            return true;
        }
        return false;
    }

    private void v(byte b2) {
        if (b2 == -2) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.f17838f.e()));
                return;
            }
            return;
        }
        com.liulishuo.filedownloader.message.b.a().b(com.liulishuo.filedownloader.message.c.e(b2, this.f17838f, this.f17840h));
    }

    private void w() throws IOException {
        boolean z;
        String j2 = this.f17838f.j();
        String i2 = this.f17838f.i();
        File file = new File(j2);
        try {
            File file2 = new File(i2);
            if (file2.exists()) {
                long length = file2.length();
                if (file2.delete()) {
                    e.h.a.k0.d.i(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", i2, Long.valueOf(length), Long.valueOf(file.length()));
                } else {
                    throw new IOException(e.h.a.k0.f.o("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", i2, Long.valueOf(length)));
                }
            }
            z = !file.renameTo(file2);
            if (!z) {
                if (z && file.exists() && !file.delete()) {
                    e.h.a.k0.d.i(this, "delete the temp file(%s) failed, on completed downloading.", j2);
                    return;
                }
                return;
            }
            try {
                throw new IOException(e.h.a.k0.f.o("Can't rename the  temp downloaded file(%s) to the target file(%s)", j2, i2));
            } catch (Throwable th) {
                th = th;
                if (z && file.exists() && !file.delete()) {
                    e.h.a.k0.d.i(this, "delete the temp file(%s) failed, on completed downloading.", j2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
    }

    private synchronized void x(Message message) {
        if (!this.n.isAlive()) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
            return;
        }
        try {
            this.m.sendMessage(message);
        } catch (IllegalStateException e2) {
            if (!this.n.isAlive()) {
                if (e.h.a.k0.d.a) {
                    e.h.a.k0.d.a(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
                }
            } else {
                throw e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.n.quit();
            this.p = Thread.currentThread();
            while (this.o) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.p = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[DONT_GENERATE] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            r0 = 1
            r4.o = r0
            int r1 = r5.what
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L17
            r2 = 5
            if (r1 == r2) goto Ld
            goto L1a
        Ld:
            java.lang.Object r1 = r5.obj     // Catch: java.lang.Throwable -> L26
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch: java.lang.Throwable -> L26
            int r5 = r5.arg1     // Catch: java.lang.Throwable -> L26
            r4.h(r1, r5)     // Catch: java.lang.Throwable -> L26
            goto L1a
        L17:
            r4.g()     // Catch: java.lang.Throwable -> L26
        L1a:
            r4.o = r3
            java.lang.Thread r5 = r4.p
            if (r5 == 0) goto L25
            java.lang.Thread r5 = r4.p
            java.util.concurrent.locks.LockSupport.unpark(r5)
        L25:
            return r0
        L26:
            r5 = move-exception
            r4.o = r3
            java.lang.Thread r0 = r4.p
            if (r0 == 0) goto L32
            java.lang.Thread r0 = r4.p
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L32:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.g0.f.handleMessage(android.os.Message):boolean");
    }

    public boolean l() {
        HandlerThread handlerThread = this.n;
        return handlerThread != null && handlerThread.isAlive();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() throws IOException {
        if (k()) {
            return;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z, long j2, String str, String str2) throws IllegalArgumentException {
        String b2 = this.f17838f.b();
        if (b2 != null && !b2.equals(str)) {
            throw new IllegalArgumentException(e.h.a.k0.f.o("callback onConnected must with precondition succeed, but the etag is changes(%s != %s)", str, b2));
        }
        this.f17840h.e(z);
        this.f17838f.z((byte) 2);
        this.f17838f.A(j2);
        this.f17838f.t(str);
        this.f17838f.v(str2);
        this.f17839g.m(this.f17838f.e(), j2, str, str2);
        v((byte) 2);
        this.l = a(j2, this.f17843k);
        this.t.compareAndSet(false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(Exception exc) {
        e(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback");
        this.n = handlerThread;
        handlerThread.start();
        this.m = new Handler(this.n.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        f();
    }

    public void r() {
        this.f17838f.z((byte) 1);
        this.f17839g.a(this.f17838f.e());
        v((byte) 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(long j2) {
        this.r.addAndGet(j2);
        this.f17838f.m(j2);
        j(SystemClock.elapsedRealtime());
        if (this.m == null) {
            g();
        } else if (this.s.get()) {
            x(this.m.obtainMessage(3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(Exception exc, int i2) {
        this.r.set(0L);
        Handler handler = this.m;
        if (handler == null) {
            h(exc, i2);
        } else {
            x(handler.obtainMessage(5, i2, 0, exc));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        this.f17838f.z((byte) 6);
        v((byte) 6);
        this.f17839g.i(this.f17838f.e());
    }
}
