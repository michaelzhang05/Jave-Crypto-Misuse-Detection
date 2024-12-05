package e.h.a.f0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import e.h.a.f0.a;
import e.h.a.k0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* compiled from: RemitDatabase.java */
/* loaded from: classes2.dex */
public class c implements e.h.a.f0.a {

    /* renamed from: c, reason: collision with root package name */
    private Handler f17777c;

    /* renamed from: g, reason: collision with root package name */
    private volatile Thread f17781g;

    /* renamed from: e, reason: collision with root package name */
    private final List<Integer> f17779e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private AtomicInteger f17780f = new AtomicInteger();
    private final b a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final d f17776b = new d();

    /* renamed from: d, reason: collision with root package name */
    private final long f17778d = e.h.a.k0.e.a().f17891b;

    /* compiled from: RemitDatabase.java */
    /* loaded from: classes2.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                if (c.this.f17781g != null) {
                    LockSupport.unpark(c.this.f17781g);
                    c.this.f17781g = null;
                }
                return false;
            }
            try {
                c.this.f17780f.set(i2);
                c.this.y(i2);
                c.this.f17779e.add(Integer.valueOf(i2));
                return false;
            } finally {
                c.this.f17780f.set(0);
                if (c.this.f17781g != null) {
                    LockSupport.unpark(c.this.f17781g);
                    c.this.f17781g = null;
                }
            }
        }
    }

    public c() {
        HandlerThread handlerThread = new HandlerThread(f.D("RemitHandoverToDB"));
        handlerThread.start();
        this.f17777c = new Handler(handlerThread.getLooper(), new a());
    }

    private void w(int i2) {
        this.f17777c.removeMessages(i2);
        if (this.f17780f.get() == i2) {
            this.f17781g = Thread.currentThread();
            this.f17777c.sendEmptyMessage(0);
            LockSupport.park();
            return;
        }
        y(i2);
    }

    private boolean x(int i2) {
        return !this.f17779e.contains(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i2) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "sync cache to db %d", Integer.valueOf(i2));
        }
        this.f17776b.j(this.a.o(i2));
        List<com.liulishuo.filedownloader.model.a> n = this.a.n(i2);
        this.f17776b.h(i2);
        Iterator<com.liulishuo.filedownloader.model.a> it = n.iterator();
        while (it.hasNext()) {
            this.f17776b.g(it.next());
        }
    }

    @Override // e.h.a.f0.a
    public void a(int i2) {
        this.a.a(i2);
        if (x(i2)) {
            return;
        }
        this.f17776b.a(i2);
    }

    @Override // e.h.a.f0.a
    public a.InterfaceC0231a b() {
        d dVar = this.f17776b;
        b bVar = this.a;
        return dVar.v(bVar.a, bVar.f17773b);
    }

    @Override // e.h.a.f0.a
    public void c(int i2, Throwable th) {
        this.a.c(i2, th);
        if (x(i2)) {
            return;
        }
        this.f17776b.c(i2, th);
    }

    @Override // e.h.a.f0.a
    public void clear() {
        this.a.clear();
        this.f17776b.clear();
    }

    @Override // e.h.a.f0.a
    public void d(int i2, long j2) {
        this.a.d(i2, j2);
        if (x(i2)) {
            this.f17777c.removeMessages(i2);
            if (this.f17780f.get() == i2) {
                this.f17781g = Thread.currentThread();
                this.f17777c.sendEmptyMessage(0);
                LockSupport.park();
                this.f17776b.d(i2, j2);
            }
        } else {
            this.f17776b.d(i2, j2);
        }
        this.f17779e.remove(Integer.valueOf(i2));
    }

    @Override // e.h.a.f0.a
    public void e(int i2, String str, long j2, long j3, int i3) {
        this.a.e(i2, str, j2, j3, i3);
        if (x(i2)) {
            return;
        }
        this.f17776b.e(i2, str, j2, j3, i3);
    }

    @Override // e.h.a.f0.a
    public void f(int i2, int i3, long j2) {
        this.a.f(i2, i3, j2);
        if (x(i2)) {
            return;
        }
        this.f17776b.f(i2, i3, j2);
    }

    @Override // e.h.a.f0.a
    public void g(com.liulishuo.filedownloader.model.a aVar) {
        this.a.g(aVar);
        if (x(aVar.c())) {
            return;
        }
        this.f17776b.g(aVar);
    }

    @Override // e.h.a.f0.a
    public void h(int i2) {
        this.a.h(i2);
        if (x(i2)) {
            return;
        }
        this.f17776b.h(i2);
    }

    @Override // e.h.a.f0.a
    public void i(int i2) {
        this.f17777c.sendEmptyMessageDelayed(i2, this.f17778d);
    }

    @Override // e.h.a.f0.a
    public void j(FileDownloadModel fileDownloadModel) {
        this.a.j(fileDownloadModel);
        if (x(fileDownloadModel.e())) {
            return;
        }
        this.f17776b.j(fileDownloadModel);
    }

    @Override // e.h.a.f0.a
    public void k(int i2, Throwable th, long j2) {
        this.a.k(i2, th, j2);
        if (x(i2)) {
            w(i2);
        }
        this.f17776b.k(i2, th, j2);
        this.f17779e.remove(Integer.valueOf(i2));
    }

    @Override // e.h.a.f0.a
    public void l(int i2, long j2) {
        this.a.l(i2, j2);
        if (x(i2)) {
            return;
        }
        this.f17776b.l(i2, j2);
    }

    @Override // e.h.a.f0.a
    public void m(int i2, long j2, String str, String str2) {
        this.a.m(i2, j2, str, str2);
        if (x(i2)) {
            return;
        }
        this.f17776b.m(i2, j2, str, str2);
    }

    @Override // e.h.a.f0.a
    public List<com.liulishuo.filedownloader.model.a> n(int i2) {
        return this.a.n(i2);
    }

    @Override // e.h.a.f0.a
    public FileDownloadModel o(int i2) {
        return this.a.o(i2);
    }

    @Override // e.h.a.f0.a
    public void p(int i2, int i3) {
        this.a.p(i2, i3);
        if (x(i2)) {
            return;
        }
        this.f17776b.p(i2, i3);
    }

    @Override // e.h.a.f0.a
    public void q(int i2, long j2) {
        this.a.q(i2, j2);
        if (x(i2)) {
            w(i2);
        }
        this.f17776b.q(i2, j2);
        this.f17779e.remove(Integer.valueOf(i2));
    }

    @Override // e.h.a.f0.a
    public boolean remove(int i2) {
        this.f17776b.remove(i2);
        return this.a.remove(i2);
    }
}
