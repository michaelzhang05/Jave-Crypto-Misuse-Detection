package e.h.a.g0;

import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import e.h.a.g0.a;
import e.h.a.g0.b;
import e.h.a.g0.e;
import e.h.a.y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DownloadLaunchRunnable.java */
/* loaded from: classes2.dex */
public class d implements Runnable, h {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadPoolExecutor f17813f = e.h.a.k0.b.c("ConnectionBlock");
    private volatile boolean A;
    private volatile Exception B;
    private String C;
    private long D;
    private long E;
    private long F;
    private long G;

    /* renamed from: g, reason: collision with root package name */
    private final f f17814g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17815h;

    /* renamed from: i, reason: collision with root package name */
    private final FileDownloadModel f17816i;

    /* renamed from: j, reason: collision with root package name */
    private final FileDownloadHeader f17817j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f17818k;
    private final boolean l;
    private final e.h.a.f0.a m;
    private final y n;
    private boolean o;
    int p;
    private boolean q;
    private final boolean r;
    private final ArrayList<e> s;
    private e t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final AtomicBoolean y;
    private volatile boolean z;

    /* compiled from: DownloadLaunchRunnable.java */
    /* loaded from: classes2.dex */
    public static class b {
        private FileDownloadModel a;

        /* renamed from: b, reason: collision with root package name */
        private FileDownloadHeader f17819b;

        /* renamed from: c, reason: collision with root package name */
        private y f17820c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f17821d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f17822e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f17823f;

        /* renamed from: g, reason: collision with root package name */
        private Boolean f17824g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f17825h;

        public d a() {
            if (this.a != null && this.f17820c != null && this.f17821d != null && this.f17822e != null && this.f17823f != null && this.f17824g != null && this.f17825h != null) {
                return new d(this.a, this.f17819b, this.f17820c, this.f17821d.intValue(), this.f17822e.intValue(), this.f17823f.booleanValue(), this.f17824g.booleanValue(), this.f17825h.intValue());
            }
            throw new IllegalArgumentException();
        }

        public b b(Integer num) {
            this.f17822e = num;
            return this;
        }

        public b c(Boolean bool) {
            this.f17823f = bool;
            return this;
        }

        public b d(FileDownloadHeader fileDownloadHeader) {
            this.f17819b = fileDownloadHeader;
            return this;
        }

        public b e(Integer num) {
            this.f17825h = num;
            return this;
        }

        public b f(Integer num) {
            this.f17821d = num;
            return this;
        }

        public b g(FileDownloadModel fileDownloadModel) {
            this.a = fileDownloadModel;
            return this;
        }

        public b h(y yVar) {
            this.f17820c = yVar;
            return this;
        }

        public b i(Boolean bool) {
            this.f17824g = bool;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadLaunchRunnable.java */
    /* loaded from: classes2.dex */
    public class c extends Throwable {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadLaunchRunnable.java */
    /* renamed from: e.h.a.g0.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0235d extends Throwable {
        C0235d() {
        }
    }

    private int g(long j2) {
        if (!q()) {
            return 1;
        }
        if (this.v) {
            return this.f17816i.a();
        }
        return e.h.a.g0.c.j().c(this.f17816i.e(), this.f17816i.l(), this.f17816i.f(), j2);
    }

    private void h() throws C0235d, c {
        int e2 = this.f17816i.e();
        if (this.f17816i.q()) {
            String i2 = this.f17816i.i();
            int r = e.h.a.k0.f.r(this.f17816i.l(), i2);
            if (!e.h.a.k0.c.d(e2, i2, this.f17818k, false)) {
                FileDownloadModel o = this.m.o(r);
                if (o != null) {
                    if (!e.h.a.k0.c.e(e2, o, this.n, false)) {
                        List<com.liulishuo.filedownloader.model.a> n = this.m.n(r);
                        this.m.remove(r);
                        this.m.h(r);
                        e.h.a.k0.f.e(this.f17816i.i());
                        if (e.h.a.k0.f.G(r, o)) {
                            this.f17816i.y(o.g());
                            this.f17816i.A(o.k());
                            this.f17816i.t(o.b());
                            this.f17816i.s(o.a());
                            this.m.j(this.f17816i);
                            if (n != null) {
                                for (com.liulishuo.filedownloader.model.a aVar : n) {
                                    aVar.i(e2);
                                    this.m.g(aVar);
                                }
                            }
                            throw new C0235d();
                        }
                    } else {
                        this.m.remove(e2);
                        this.m.h(e2);
                        throw new c();
                    }
                }
                if (e.h.a.k0.c.c(e2, this.f17816i.g(), this.f17816i.j(), i2, this.n)) {
                    this.m.remove(e2);
                    this.m.h(e2);
                    throw new c();
                }
                return;
            }
            this.m.remove(e2);
            this.m.h(e2);
            throw new c();
        }
    }

    private void i() throws FileDownloadGiveUpRetryException {
        if (this.l && !e.h.a.k0.f.a("android.permission.ACCESS_NETWORK_STATE")) {
            throw new FileDownloadGiveUpRetryException(e.h.a.k0.f.o("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.f17816i.e()), "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.l && e.h.a.k0.f.M()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    private void j(List<com.liulishuo.filedownloader.model.a> list, long j2) throws InterruptedException {
        long b2;
        int e2 = this.f17816i.e();
        String b3 = this.f17816i.b();
        String str = this.C;
        if (str == null) {
            str = this.f17816i.l();
        }
        String j3 = this.f17816i.j();
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(e2), Long.valueOf(j2));
        }
        boolean z = this.v;
        long j4 = 0;
        long j5 = 0;
        for (com.liulishuo.filedownloader.model.a aVar : list) {
            if (aVar.b() == -1) {
                b2 = j2 - aVar.a();
            } else {
                b2 = (aVar.b() - aVar.a()) + 1;
            }
            long j6 = b2;
            j5 += aVar.a() - aVar.e();
            if (j6 == j4) {
                if (e.h.a.k0.d.a) {
                    e.h.a.k0.d.a(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(aVar.c()), Integer.valueOf(aVar.d()));
                }
            } else {
                e a2 = new e.b().g(e2).c(Integer.valueOf(aVar.d())).b(this).i(str).e(z ? b3 : null).f(this.f17817j).j(this.l).d(b.C0234b.b(aVar.e(), aVar.a(), aVar.b(), j6)).h(j3).a();
                if (e.h.a.k0.d.a) {
                    e.h.a.k0.d.a(this, "enable multiple connection: %s", aVar);
                }
                if (a2 != null) {
                    this.s.add(a2);
                } else {
                    throw new IllegalArgumentException("the download runnable must not be null!");
                }
            }
            j4 = 0;
        }
        if (j5 != this.f17816i.g()) {
            e.h.a.k0.d.i(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.f17816i.g()), Long.valueOf(j5));
            this.f17816i.y(j5);
        }
        ArrayList arrayList = new ArrayList(this.s.size());
        Iterator<e> it = this.s.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (this.z) {
                next.c();
            } else {
                arrayList.add(Executors.callable(next));
            }
        }
        if (this.z) {
            this.f17816i.z((byte) -2);
            return;
        }
        List<Future> invokeAll = f17813f.invokeAll(arrayList);
        if (e.h.a.k0.d.a) {
            for (Future future : invokeAll) {
                e.h.a.k0.d.a(this, "finish sub-task for [%d] %B %B", Integer.valueOf(e2), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    private void m(long j2, String str) throws IOException, IllegalAccessException {
        e.h.a.j0.a aVar = null;
        if (j2 != -1) {
            try {
                aVar = e.h.a.k0.f.c(this.f17816i.j());
                long length = new File(str).length();
                long j3 = j2 - length;
                long x = e.h.a.k0.f.x(str);
                if (x >= j3) {
                    if (!e.h.a.k0.e.a().f17895f) {
                        aVar.a(j2);
                    }
                } else {
                    throw new FileDownloadOutOfSpaceException(x, j3, length);
                }
            } finally {
                if (0 != 0) {
                    aVar.close();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r18, e.h.a.g0.a r19, e.h.a.e0.b r20) throws java.io.IOException, e.h.a.g0.d.C0235d, java.lang.IllegalArgumentException, com.liulishuo.filedownloader.exception.FileDownloadSecurityException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.g0.d.n(java.util.Map, e.h.a.g0.a, e.h.a.e0.b):void");
    }

    private boolean q() {
        return (!this.v || this.f17816i.a() > 1) && this.w && this.r && !this.x;
    }

    private void t(long j2, int i2) throws InterruptedException {
        long j3 = j2 / i2;
        int e2 = this.f17816i.e();
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        int i3 = 0;
        while (i3 < i2) {
            long j5 = i3 == i2 + (-1) ? -1L : (j4 + j3) - 1;
            com.liulishuo.filedownloader.model.a aVar = new com.liulishuo.filedownloader.model.a();
            aVar.i(e2);
            aVar.j(i3);
            aVar.k(j4);
            aVar.g(j4);
            aVar.h(j5);
            arrayList.add(aVar);
            this.m.g(aVar);
            j4 += j3;
            i3++;
        }
        this.f17816i.s(i2);
        this.m.p(e2, i2);
        j(arrayList, j2);
    }

    private void u(int i2, List<com.liulishuo.filedownloader.model.a> list) throws InterruptedException {
        if (i2 > 1 && list.size() == i2) {
            j(list, this.f17816i.k());
            return;
        }
        throw new IllegalArgumentException();
    }

    private void v(long j2) throws IOException, IllegalAccessException {
        e.h.a.g0.b c2;
        if (!this.w) {
            this.f17816i.y(0L);
            c2 = b.C0234b.a(j2);
        } else {
            c2 = b.C0234b.c(this.f17816i.g(), this.f17816i.g(), j2 - this.f17816i.g());
        }
        this.t = new e.b().g(this.f17816i.e()).c(-1).b(this).i(this.f17816i.l()).e(this.f17816i.b()).f(this.f17817j).j(this.l).d(c2).h(this.f17816i.j()).a();
        this.f17816i.s(1);
        this.m.p(this.f17816i.e(), 1);
        if (this.z) {
            this.f17816i.z((byte) -2);
            this.t.c();
        } else {
            this.t.run();
        }
    }

    private void w() throws IOException, C0235d, IllegalAccessException, FileDownloadSecurityException {
        e.h.a.g0.b d2;
        e.h.a.e0.b bVar = null;
        try {
            if (this.q) {
                d2 = b.C0234b.e();
            } else {
                d2 = b.C0234b.d();
            }
            e.h.a.g0.a a2 = new a.b().c(this.f17816i.e()).f(this.f17816i.l()).d(this.f17816i.b()).e(this.f17817j).b(d2).a();
            bVar = a2.c();
            n(a2.g(), a2, bVar);
        } finally {
            if (bVar != null) {
                bVar.g();
            }
        }
    }

    @Override // e.h.a.g0.h
    public void a(e eVar, long j2, long j3) {
        if (this.z) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.f17816i.e()));
                return;
            }
            return;
        }
        int i2 = eVar.m;
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(this.f17816i.k()));
        }
        if (!this.u) {
            synchronized (this.s) {
                this.s.remove(eVar);
            }
        } else {
            if (j2 == 0 || j3 == this.f17816i.k()) {
                return;
            }
            e.h.a.k0.d.b(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(this.f17816i.k()), Integer.valueOf(this.f17816i.e()));
        }
    }

    @Override // e.h.a.g0.h
    public void b(Exception exc) {
        this.A = true;
        this.B = exc;
        if (this.z) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.f17816i.e()));
            }
        } else {
            Iterator it = ((ArrayList) this.s.clone()).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
    }

    @Override // e.h.a.g0.h
    public void c(Exception exc) {
        if (this.z) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.f17816i.e()));
            }
        } else {
            int i2 = this.p;
            int i3 = i2 - 1;
            this.p = i3;
            if (i2 < 0) {
                e.h.a.k0.d.b(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i3), Integer.valueOf(this.f17816i.e()));
            }
            this.f17814g.t(exc, this.p);
        }
    }

    @Override // e.h.a.g0.h
    public void d(long j2) {
        if (this.z) {
            return;
        }
        this.f17814g.s(j2);
    }

    @Override // e.h.a.g0.h
    public boolean e(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int b2 = ((FileDownloadHttpException) exc).b();
            if (this.u && b2 == 416 && !this.o) {
                e.h.a.k0.f.f(this.f17816i.i(), this.f17816i.j());
                this.o = true;
                return true;
            }
        }
        return this.p > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // e.h.a.g0.h
    public void f() {
        this.m.l(this.f17816i.e(), this.f17816i.g());
    }

    public int k() {
        return this.f17816i.e();
    }

    public String l() {
        return this.f17816i.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void o(java.util.List<com.liulishuo.filedownloader.model.a> r11) {
        /*
            r10 = this;
            com.liulishuo.filedownloader.model.FileDownloadModel r0 = r10.f17816i
            int r0 = r0.a()
            com.liulishuo.filedownloader.model.FileDownloadModel r1 = r10.f17816i
            java.lang.String r1 = r1.j()
            com.liulishuo.filedownloader.model.FileDownloadModel r2 = r10.f17816i
            java.lang.String r2 = r2.i()
            r3 = 0
            r4 = 1
            if (r0 <= r4) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            boolean r6 = r10.q
            r7 = 0
            if (r6 == 0) goto L21
        L1f:
            r5 = r7
            goto L58
        L21:
            if (r5 == 0) goto L28
            boolean r6 = r10.r
            if (r6 != 0) goto L28
            goto L1f
        L28:
            com.liulishuo.filedownloader.model.FileDownloadModel r6 = r10.f17816i
            int r6 = r6.e()
            com.liulishuo.filedownloader.model.FileDownloadModel r9 = r10.f17816i
            boolean r6 = e.h.a.k0.f.G(r6, r9)
            if (r6 == 0) goto L1f
            boolean r6 = r10.r
            if (r6 != 0) goto L44
            java.io.File r11 = new java.io.File
            r11.<init>(r1)
            long r5 = r11.length()
            goto L58
        L44:
            if (r5 == 0) goto L52
            int r5 = r11.size()
            if (r0 == r5) goto L4d
            goto L1f
        L4d:
            long r5 = com.liulishuo.filedownloader.model.a.f(r11)
            goto L58
        L52:
            com.liulishuo.filedownloader.model.FileDownloadModel r11 = r10.f17816i
            long r5 = r11.g()
        L58:
            com.liulishuo.filedownloader.model.FileDownloadModel r11 = r10.f17816i
            r11.y(r5)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L62
            r3 = 1
        L62:
            r10.v = r3
            if (r3 != 0) goto L74
            e.h.a.f0.a r11 = r10.m
            com.liulishuo.filedownloader.model.FileDownloadModel r0 = r10.f17816i
            int r0 = r0.e()
            r11.h(r0)
            e.h.a.k0.f.f(r2, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.g0.d.o(java.util.List):void");
    }

    public boolean p() {
        return this.y.get() || this.f17814g.l();
    }

    public void r() {
        this.z = true;
        e eVar = this.t;
        if (eVar != null) {
            eVar.c();
        }
        Iterator it = ((ArrayList) this.s.clone()).iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (eVar2 != null) {
                eVar2.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1 A[Catch: all -> 0x01f6, TryCatch #12 {all -> 0x01f6, blocks: (B:3:0x0003, B:6:0x0012, B:8:0x001a, B:10:0x001e, B:25:0x0030, B:26:0x008d, B:28:0x0091, B:30:0x0096, B:116:0x009a, B:118:0x009e, B:33:0x00c6, B:35:0x00e2, B:44:0x0100, B:56:0x0136, B:58:0x013a, B:69:0x015f, B:71:0x0163, B:85:0x0167, B:87:0x0170, B:88:0x0174, B:90:0x0178, B:91:0x018b, B:109:0x018c, B:93:0x01bb, B:95:0x01c1, B:99:0x01c6), top: B:2:0x0003, inners: #15, #12, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.g0.d.run():void");
    }

    public void s() {
        o(this.m.n(this.f17816i.e()));
        this.f17814g.r();
    }

    private d(FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, y yVar, int i2, int i3, boolean z, boolean z2, int i4) {
        this.f17815h = 5;
        this.q = false;
        this.s = new ArrayList<>(5);
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.y = new AtomicBoolean(true);
        this.z = false;
        this.o = false;
        this.f17816i = fileDownloadModel;
        this.f17817j = fileDownloadHeader;
        this.f17818k = z;
        this.l = z2;
        this.m = e.h.a.g0.c.j().f();
        this.r = e.h.a.g0.c.j().m();
        this.n = yVar;
        this.p = i4;
        this.f17814g = new f(fileDownloadModel, i4, i2, i3);
    }
}
