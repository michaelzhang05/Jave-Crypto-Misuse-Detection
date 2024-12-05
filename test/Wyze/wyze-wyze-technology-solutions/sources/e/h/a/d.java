package e.h.a;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import e.h.a.a;
import e.h.a.x;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

/* compiled from: DownloadTaskHunter.java */
/* loaded from: classes2.dex */
public class d implements x, x.b, x.a, a.d {
    private t a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f17762b;

    /* renamed from: c, reason: collision with root package name */
    private final a f17763c;

    /* renamed from: f, reason: collision with root package name */
    private final s f17766f;

    /* renamed from: g, reason: collision with root package name */
    private final r f17767g;

    /* renamed from: h, reason: collision with root package name */
    private long f17768h;

    /* renamed from: i, reason: collision with root package name */
    private long f17769i;

    /* renamed from: j, reason: collision with root package name */
    private int f17770j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17771k;
    private boolean l;
    private String m;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte f17764d = 0;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f17765e = null;
    private boolean n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadTaskHunter.java */
    /* loaded from: classes2.dex */
    public interface a {
        ArrayList<a.InterfaceC0230a> C();

        FileDownloadHeader M();

        void a(String str);

        a.b r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar, Object obj) {
        this.f17762b = obj;
        this.f17763c = aVar;
        b bVar = new b();
        this.f17766f = bVar;
        this.f17767g = bVar;
        this.a = new k(aVar.r(), this);
    }

    private int r() {
        return this.f17763c.r().v().getId();
    }

    private void s() throws IOException {
        File file;
        e.h.a.a v = this.f17763c.r().v();
        if (v.c() == null) {
            v.j(e.h.a.k0.f.v(v.m()));
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "save Path is null to %s", v.c());
            }
        }
        if (v.P()) {
            file = new File(v.c());
        } else {
            String A = e.h.a.k0.f.A(v.c());
            if (A != null) {
                file = new File(A);
            } else {
                throw new InvalidParameterException(e.h.a.k0.f.o("the provided mPath[%s] is invalid, can't find its directory", v.c()));
            }
        }
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new IOException(e.h.a.k0.f.o("Create parent directory failed, please make sure you have permission to create file or directory on the path: %s", file.getAbsolutePath()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(MessageSnapshot messageSnapshot) {
        e.h.a.a v = this.f17763c.r().v();
        byte k2 = messageSnapshot.k();
        this.f17764d = k2;
        this.f17771k = messageSnapshot.m();
        if (k2 == -4) {
            this.f17766f.a();
            int e2 = h.i().e(v.getId());
            if (e2 + ((e2 > 1 || !v.P()) ? 0 : h.i().e(e.h.a.k0.f.r(v.m(), v.k()))) <= 1) {
                byte D = m.b().D(v.getId());
                e.h.a.k0.d.i(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(v.getId()), Integer.valueOf(D));
                if (com.liulishuo.filedownloader.model.b.a(D)) {
                    this.f17764d = (byte) 1;
                    this.f17769i = messageSnapshot.g();
                    long f2 = messageSnapshot.f();
                    this.f17768h = f2;
                    this.f17766f.f(f2);
                    this.a.b(((MessageSnapshot.b) messageSnapshot).a());
                    return;
                }
            }
            h.i().l(this.f17763c.r(), messageSnapshot);
            return;
        }
        if (k2 == -3) {
            this.n = messageSnapshot.p();
            this.f17768h = messageSnapshot.g();
            this.f17769i = messageSnapshot.g();
            h.i().l(this.f17763c.r(), messageSnapshot);
            return;
        }
        if (k2 == -1) {
            this.f17765e = messageSnapshot.l();
            this.f17768h = messageSnapshot.f();
            h.i().l(this.f17763c.r(), messageSnapshot);
            return;
        }
        if (k2 == 1) {
            this.f17768h = messageSnapshot.f();
            this.f17769i = messageSnapshot.g();
            this.a.b(messageSnapshot);
            return;
        }
        if (k2 == 2) {
            this.f17769i = messageSnapshot.g();
            this.l = messageSnapshot.n();
            this.m = messageSnapshot.c();
            String d2 = messageSnapshot.d();
            if (d2 != null) {
                if (v.U() != null) {
                    e.h.a.k0.d.i(this, "already has mFilename[%s], but assign mFilename[%s] again", v.U(), d2);
                }
                this.f17763c.a(d2);
            }
            this.f17766f.f(this.f17768h);
            this.a.h(messageSnapshot);
            return;
        }
        if (k2 == 3) {
            this.f17768h = messageSnapshot.f();
            this.f17766f.h(messageSnapshot.f());
            this.a.f(messageSnapshot);
        } else if (k2 != 5) {
            if (k2 != 6) {
                return;
            }
            this.a.l(messageSnapshot);
        } else {
            this.f17768h = messageSnapshot.f();
            this.f17765e = messageSnapshot.l();
            this.f17770j = messageSnapshot.h();
            this.f17766f.a();
            this.a.e(messageSnapshot);
        }
    }

    @Override // e.h.a.x.a
    public boolean a(MessageSnapshot messageSnapshot) {
        if (!this.f17763c.r().v().P() || messageSnapshot.k() != -4 || getStatus() != 2) {
            return false;
        }
        t(messageSnapshot);
        return true;
    }

    @Override // e.h.a.x
    public void b() {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "free the task %d, when the status is %d", Integer.valueOf(r()), Byte.valueOf(this.f17764d));
        }
        this.f17764d = (byte) 0;
    }

    @Override // e.h.a.x.a
    public t c() {
        return this.a;
    }

    @Override // e.h.a.x
    public int d() {
        return this.f17770j;
    }

    @Override // e.h.a.x
    public Throwable e() {
        return this.f17765e;
    }

    @Override // e.h.a.a.d
    public void f() {
        e.h.a.a v = this.f17763c.r().v();
        if (l.b()) {
            l.a().c(v);
        }
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.h(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
        this.f17766f.c(this.f17768h);
        if (this.f17763c.C() != null) {
            ArrayList arrayList = (ArrayList) this.f17763c.C().clone();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((a.InterfaceC0230a) arrayList.get(i2)).a(v);
            }
        }
        q.e().f().c(this.f17763c.r());
    }

    @Override // e.h.a.x
    public boolean g() {
        return this.f17771k;
    }

    @Override // e.h.a.x
    public byte getStatus() {
        return this.f17764d;
    }

    @Override // e.h.a.x.a
    public boolean h(MessageSnapshot messageSnapshot) {
        if (!com.liulishuo.filedownloader.model.b.b(getStatus(), messageSnapshot.k())) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f17764d), Byte.valueOf(getStatus()), Integer.valueOf(r()));
            }
            return false;
        }
        t(messageSnapshot);
        return true;
    }

    @Override // e.h.a.x
    public void i() {
        boolean z;
        synchronized (this.f17762b) {
            if (this.f17764d != 0) {
                e.h.a.k0.d.i(this, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(r()), Byte.valueOf(this.f17764d));
                return;
            }
            this.f17764d = (byte) 10;
            a.b r = this.f17763c.r();
            e.h.a.a v = r.v();
            if (l.b()) {
                l.a().b(v);
            }
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.h(this, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", v.m(), v.c(), v.F(), v.getTag());
            }
            try {
                s();
                z = true;
            } catch (Throwable th) {
                h.i().a(r);
                h.i().l(r, k(th));
                z = false;
            }
            if (z) {
                p.c().d(this);
            }
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.h(this, "the task[%d] has been into the launch pool.", Integer.valueOf(r()));
            }
        }
    }

    @Override // e.h.a.x
    public long j() {
        return this.f17768h;
    }

    @Override // e.h.a.x.a
    public MessageSnapshot k(Throwable th) {
        this.f17764d = (byte) -1;
        this.f17765e = th;
        return com.liulishuo.filedownloader.message.c.b(r(), j(), th);
    }

    @Override // e.h.a.x
    public long l() {
        return this.f17769i;
    }

    @Override // e.h.a.x.a
    public boolean m(MessageSnapshot messageSnapshot) {
        if (!com.liulishuo.filedownloader.model.b.d(this.f17763c.r().v())) {
            return false;
        }
        t(messageSnapshot);
        return true;
    }

    @Override // e.h.a.a.d
    public void n() {
        if (l.b() && getStatus() == 6) {
            l.a().e(this.f17763c.r().v());
        }
    }

    @Override // e.h.a.x.a
    public boolean o(MessageSnapshot messageSnapshot) {
        byte status = getStatus();
        byte k2 = messageSnapshot.k();
        if (-2 == status && com.liulishuo.filedownloader.model.b.a(k2)) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(r()));
            }
            return true;
        }
        if (!com.liulishuo.filedownloader.model.b.c(status, k2)) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f17764d), Byte.valueOf(getStatus()), Integer.valueOf(r()));
            }
            return false;
        }
        t(messageSnapshot);
        return true;
    }

    @Override // e.h.a.a.d
    public void p() {
        if (l.b()) {
            l.a().d(this.f17763c.r().v());
        }
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.h(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
    }

    @Override // e.h.a.x
    public boolean pause() {
        if (com.liulishuo.filedownloader.model.b.e(getStatus())) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "High concurrent cause, Already is over, can't pause again, %d %d", Byte.valueOf(getStatus()), Integer.valueOf(this.f17763c.r().v().getId()));
            }
            return false;
        }
        this.f17764d = (byte) -2;
        a.b r = this.f17763c.r();
        e.h.a.a v = r.v();
        p.c().b(this);
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.h(this, "the task[%d] has been expired from the launch pool.", Integer.valueOf(r()));
        }
        if (!q.e().i()) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "request pause the task[%d] to the download service, but the download service isn't connected yet.", Integer.valueOf(v.getId()));
            }
        } else {
            m.b().K(v.getId());
        }
        h.i().a(r);
        h.i().l(r, com.liulishuo.filedownloader.message.c.c(v));
        q.e().f().c(r);
        return true;
    }

    @Override // e.h.a.x.b
    public boolean q(i iVar) {
        return this.f17763c.r().v().F() == iVar;
    }

    @Override // e.h.a.x.b
    public void start() {
        if (this.f17764d != 10) {
            e.h.a.k0.d.i(this, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(r()), Byte.valueOf(this.f17764d));
            return;
        }
        a.b r = this.f17763c.r();
        e.h.a.a v = r.v();
        v f2 = q.e().f();
        try {
            if (f2.b(r)) {
                return;
            }
            synchronized (this.f17762b) {
                if (this.f17764d != 10) {
                    e.h.a.k0.d.i(this, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(r()), Byte.valueOf(this.f17764d));
                    return;
                }
                this.f17764d = (byte) 11;
                h.i().a(r);
                if (e.h.a.k0.c.d(v.getId(), v.k(), v.L(), true)) {
                    return;
                }
                boolean F = m.b().F(v.m(), v.c(), v.P(), v.J(), v.p(), v.s(), v.L(), this.f17763c.M(), v.q());
                if (this.f17764d == -2) {
                    e.h.a.k0.d.i(this, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(r()));
                    if (F) {
                        m.b().K(r());
                        return;
                    }
                    return;
                }
                if (!F) {
                    if (f2.b(r)) {
                        return;
                    }
                    MessageSnapshot k2 = k(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                    if (h.i().k(r)) {
                        f2.c(r);
                        h.i().a(r);
                    }
                    h.i().l(r, k2);
                    return;
                }
                f2.c(r);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            h.i().l(r, k(th));
        }
    }
}
