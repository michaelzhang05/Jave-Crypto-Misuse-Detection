package e.h.a.g0;

import android.os.SystemClock;
import java.io.IOException;

/* compiled from: FetchDataTask.java */
/* loaded from: classes2.dex */
public class g {
    private final h a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17846b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17847c;

    /* renamed from: d, reason: collision with root package name */
    private final e f17848d;

    /* renamed from: e, reason: collision with root package name */
    private final e.h.a.e0.b f17849e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17850f;

    /* renamed from: g, reason: collision with root package name */
    private final long f17851g;

    /* renamed from: h, reason: collision with root package name */
    private final long f17852h;

    /* renamed from: i, reason: collision with root package name */
    private final long f17853i;

    /* renamed from: j, reason: collision with root package name */
    private final String f17854j;

    /* renamed from: k, reason: collision with root package name */
    long f17855k;
    private e.h.a.j0.a l;
    private volatile boolean m;
    private final e.h.a.f0.a n;
    private volatile long o;
    private volatile long p;

    /* compiled from: FetchDataTask.java */
    /* loaded from: classes2.dex */
    public static class b {
        e a;

        /* renamed from: b, reason: collision with root package name */
        e.h.a.e0.b f17856b;

        /* renamed from: c, reason: collision with root package name */
        e.h.a.g0.b f17857c;

        /* renamed from: d, reason: collision with root package name */
        h f17858d;

        /* renamed from: e, reason: collision with root package name */
        String f17859e;

        /* renamed from: f, reason: collision with root package name */
        Boolean f17860f;

        /* renamed from: g, reason: collision with root package name */
        Integer f17861g;

        /* renamed from: h, reason: collision with root package name */
        Integer f17862h;

        public g a() throws IllegalArgumentException {
            e.h.a.e0.b bVar;
            e.h.a.g0.b bVar2;
            Integer num;
            if (this.f17860f != null && (bVar = this.f17856b) != null && (bVar2 = this.f17857c) != null && this.f17858d != null && this.f17859e != null && (num = this.f17862h) != null && this.f17861g != null) {
                return new g(bVar, bVar2, this.a, num.intValue(), this.f17861g.intValue(), this.f17860f.booleanValue(), this.f17858d, this.f17859e);
            }
            throw new IllegalArgumentException();
        }

        public b b(h hVar) {
            this.f17858d = hVar;
            return this;
        }

        public b c(e.h.a.e0.b bVar) {
            this.f17856b = bVar;
            return this;
        }

        public b d(int i2) {
            this.f17861g = Integer.valueOf(i2);
            return this;
        }

        public b e(e.h.a.g0.b bVar) {
            this.f17857c = bVar;
            return this;
        }

        public b f(int i2) {
            this.f17862h = Integer.valueOf(i2);
            return this;
        }

        public b g(e eVar) {
            this.a = eVar;
            return this;
        }

        public b h(String str) {
            this.f17859e = str;
            return this;
        }

        public b i(boolean z) {
            this.f17860f = Boolean.valueOf(z);
            return this;
        }
    }

    private void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (e.h.a.k0.f.L(this.f17855k - this.o, elapsedRealtime - this.p)) {
            d();
            this.o = this.f17855k;
            this.p = elapsedRealtime;
        }
    }

    private void d() {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.l.b();
            z = true;
        } catch (IOException e2) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e2);
            }
            z = false;
        }
        if (z) {
            int i2 = this.f17847c;
            if (i2 >= 0) {
                this.n.f(this.f17846b, i2, this.f17855k);
            } else {
                this.a.f();
            }
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.f17846b), Integer.valueOf(this.f17847c), Long.valueOf(this.f17855k), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    public void b() {
        this.m = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ea, code lost:
    
        throw new com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() throws java.io.IOException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.g0.g.c():void");
    }

    private g(e.h.a.e0.b bVar, e.h.a.g0.b bVar2, e eVar, int i2, int i3, boolean z, h hVar, String str) {
        this.o = 0L;
        this.p = 0L;
        this.a = hVar;
        this.f17854j = str;
        this.f17849e = bVar;
        this.f17850f = z;
        this.f17848d = eVar;
        this.f17847c = i3;
        this.f17846b = i2;
        this.n = c.j().f();
        this.f17851g = bVar2.a;
        this.f17852h = bVar2.f17803c;
        this.f17855k = bVar2.f17802b;
        this.f17853i = bVar2.f17804d;
    }
}
