package e.h.a.g0;

import android.os.Process;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import e.h.a.g0.a;
import e.h.a.g0.g;
import java.io.IOException;
import java.net.SocketException;

/* compiled from: DownloadRunnable.java */
/* loaded from: classes2.dex */
public class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final e.h.a.g0.a f17828f;

    /* renamed from: g, reason: collision with root package name */
    private final h f17829g;

    /* renamed from: h, reason: collision with root package name */
    private final String f17830h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f17831i;

    /* renamed from: j, reason: collision with root package name */
    private g f17832j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f17833k;
    private final int l;
    final int m;

    /* compiled from: DownloadRunnable.java */
    /* loaded from: classes2.dex */
    public static class b {
        private final a.b a = new a.b();

        /* renamed from: b, reason: collision with root package name */
        private h f17834b;

        /* renamed from: c, reason: collision with root package name */
        private String f17835c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f17836d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f17837e;

        public e a() {
            if (this.f17834b != null && this.f17835c != null && this.f17836d != null && this.f17837e != null) {
                e.h.a.g0.a a = this.a.a();
                return new e(a.a, this.f17837e.intValue(), a, this.f17834b, this.f17836d.booleanValue(), this.f17835c);
            }
            throw new IllegalArgumentException(e.h.a.k0.f.o("%s %s %B", this.f17834b, this.f17835c, this.f17836d));
        }

        public b b(h hVar) {
            this.f17834b = hVar;
            return this;
        }

        public b c(Integer num) {
            this.f17837e = num;
            return this;
        }

        public b d(e.h.a.g0.b bVar) {
            this.a.b(bVar);
            return this;
        }

        public b e(String str) {
            this.a.d(str);
            return this;
        }

        public b f(FileDownloadHeader fileDownloadHeader) {
            this.a.e(fileDownloadHeader);
            return this;
        }

        public b g(int i2) {
            this.a.c(i2);
            return this;
        }

        public b h(String str) {
            this.f17835c = str;
            return this;
        }

        public b i(String str) {
            this.a.f(str);
            return this;
        }

        public b j(boolean z) {
            this.f17836d = Boolean.valueOf(z);
            return this;
        }
    }

    private long b() {
        e.h.a.f0.a f2 = c.j().f();
        if (this.m >= 0) {
            for (com.liulishuo.filedownloader.model.a aVar : f2.n(this.l)) {
                if (aVar.d() == this.m) {
                    return aVar.a();
                }
            }
            return 0L;
        }
        FileDownloadModel o = f2.o(this.l);
        if (o != null) {
            return o.g();
        }
        return 0L;
    }

    public void a() {
        c();
    }

    public void c() {
        this.f17833k = true;
        g gVar = this.f17832j;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        Exception e2;
        g.b bVar;
        Process.setThreadPriority(10);
        long j2 = this.f17828f.f().f17802b;
        e.h.a.e0.b bVar2 = null;
        boolean z2 = false;
        while (!this.f17833k) {
            try {
                try {
                    bVar2 = this.f17828f.c();
                    int d2 = bVar2.d();
                    if (e.h.a.k0.d.a) {
                        e.h.a.k0.d.a(this, "the connection[%d] for %d, is connected %s with code[%d]", Integer.valueOf(this.m), Integer.valueOf(this.l), this.f17828f.f(), Integer.valueOf(d2));
                    }
                    if (d2 != 206 && d2 != 200) {
                        throw new SocketException(e.h.a.k0.f.o("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.f17828f.g(), bVar2.b(), Integer.valueOf(d2), Integer.valueOf(this.l), Integer.valueOf(this.m)));
                        break;
                    }
                    try {
                        bVar = new g.b();
                    } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e3) {
                        e2 = e3;
                        z = true;
                        try {
                            if (this.f17829g.e(e2)) {
                                if (z && this.f17832j == null) {
                                    e.h.a.k0.d.i(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e2);
                                    this.f17829g.b(e2);
                                    if (bVar2 == null) {
                                        return;
                                    }
                                } else {
                                    if (this.f17832j != null) {
                                        long b2 = b();
                                        if (b2 > 0) {
                                            this.f17828f.i(b2);
                                        }
                                    }
                                    this.f17829g.c(e2);
                                    if (bVar2 != null) {
                                        bVar2.g();
                                    }
                                    z2 = z;
                                }
                            } else {
                                this.f17829g.b(e2);
                                if (bVar2 == null) {
                                    return;
                                }
                            }
                            return;
                        } finally {
                            if (bVar2 != null) {
                                bVar2.g();
                            }
                        }
                    }
                } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e4) {
                    e2 = e4;
                    z = false;
                }
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e5) {
                z = z2;
                e2 = e5;
            }
            if (this.f17833k) {
                bVar2.g();
                return;
            }
            g a2 = bVar.f(this.l).d(this.m).b(this.f17829g).g(this).i(this.f17831i).c(bVar2).e(this.f17828f.f()).h(this.f17830h).a();
            this.f17832j = a2;
            a2.c();
            if (this.f17833k) {
                this.f17832j.b();
            }
            return;
        }
        if (bVar2 != null) {
            bVar2.g();
        }
    }

    private e(int i2, int i3, e.h.a.g0.a aVar, h hVar, boolean z, String str) {
        this.l = i2;
        this.m = i3;
        this.f17833k = false;
        this.f17829g = hVar;
        this.f17830h = str;
        this.f17828f = aVar;
        this.f17831i = z;
    }
}
