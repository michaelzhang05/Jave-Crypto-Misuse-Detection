package L6;

import I6.B;
import I6.C1263a;
import I6.i;
import I6.o;
import I6.s;
import I6.u;
import L6.f;
import O6.n;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C1263a f6310a;

    /* renamed from: b, reason: collision with root package name */
    private f.a f6311b;

    /* renamed from: c, reason: collision with root package name */
    private B f6312c;

    /* renamed from: d, reason: collision with root package name */
    private final i f6313d;

    /* renamed from: e, reason: collision with root package name */
    public final I6.e f6314e;

    /* renamed from: f, reason: collision with root package name */
    public final o f6315f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f6316g;

    /* renamed from: h, reason: collision with root package name */
    private final f f6317h;

    /* renamed from: i, reason: collision with root package name */
    private int f6318i;

    /* renamed from: j, reason: collision with root package name */
    private c f6319j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6320k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6321l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6322m;

    /* renamed from: n, reason: collision with root package name */
    private M6.c f6323n;

    /* loaded from: classes5.dex */
    public static final class a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final Object f6324a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f6324a = obj;
        }
    }

    public g(i iVar, C1263a c1263a, I6.e eVar, o oVar, Object obj) {
        this.f6313d = iVar;
        this.f6310a = c1263a;
        this.f6314e = eVar;
        this.f6315f = oVar;
        this.f6317h = new f(c1263a, o(), eVar, oVar);
        this.f6316g = obj;
    }

    private Socket d(boolean z8, boolean z9, boolean z10) {
        Socket socket;
        if (z10) {
            this.f6323n = null;
        }
        if (z9) {
            this.f6321l = true;
        }
        c cVar = this.f6319j;
        if (cVar == null) {
            return null;
        }
        if (z8) {
            cVar.f6292k = true;
        }
        if (this.f6323n != null) {
            return null;
        }
        if (!this.f6321l && !cVar.f6292k) {
            return null;
        }
        k(cVar);
        if (this.f6319j.f6295n.isEmpty()) {
            this.f6319j.f6296o = System.nanoTime();
            if (J6.a.f4937a.e(this.f6313d, this.f6319j)) {
                socket = this.f6319j.q();
                this.f6319j = null;
                return socket;
            }
        }
        socket = null;
        this.f6319j = null;
        return socket;
    }

    private c e(int i8, int i9, int i10, int i11, boolean z8) {
        c cVar;
        Socket m8;
        c cVar2;
        Socket socket;
        B b8;
        boolean z9;
        boolean z10;
        f.a aVar;
        synchronized (this.f6313d) {
            try {
                if (!this.f6321l) {
                    if (this.f6323n == null) {
                        if (!this.f6322m) {
                            cVar = this.f6319j;
                            m8 = m();
                            cVar2 = this.f6319j;
                            socket = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f6320k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                J6.a.f4937a.h(this.f6313d, this.f6310a, this, null);
                                c cVar3 = this.f6319j;
                                if (cVar3 != null) {
                                    cVar2 = cVar3;
                                    z9 = true;
                                    b8 = null;
                                } else {
                                    b8 = this.f6312c;
                                }
                            } else {
                                b8 = null;
                            }
                            z9 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        J6.c.e(m8);
        if (cVar != null) {
            this.f6315f.h(this.f6314e, cVar);
        }
        if (z9) {
            this.f6315f.g(this.f6314e, cVar2);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (b8 == null && ((aVar = this.f6311b) == null || !aVar.b())) {
            this.f6311b = this.f6317h.e();
            z10 = true;
        } else {
            z10 = false;
        }
        synchronized (this.f6313d) {
            try {
                if (!this.f6322m) {
                    if (z10) {
                        List a8 = this.f6311b.a();
                        int size = a8.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                break;
                            }
                            B b9 = (B) a8.get(i12);
                            J6.a.f4937a.h(this.f6313d, this.f6310a, this, b9);
                            c cVar4 = this.f6319j;
                            if (cVar4 != null) {
                                this.f6312c = b9;
                                cVar2 = cVar4;
                                z9 = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (!z9) {
                        if (b8 == null) {
                            b8 = this.f6311b.c();
                        }
                        this.f6312c = b8;
                        this.f6318i = 0;
                        cVar2 = new c(this.f6313d, b8);
                        a(cVar2, false);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        if (z9) {
            this.f6315f.g(this.f6314e, cVar2);
            return cVar2;
        }
        cVar2.c(i8, i9, i10, i11, z8, this.f6314e, this.f6315f);
        o().a(cVar2.p());
        synchronized (this.f6313d) {
            try {
                this.f6320k = true;
                J6.a.f4937a.i(this.f6313d, cVar2);
                if (cVar2.m()) {
                    socket = J6.a.f4937a.f(this.f6313d, this.f6310a, this);
                    cVar2 = this.f6319j;
                }
            } finally {
            }
        }
        J6.c.e(socket);
        this.f6315f.g(this.f6314e, cVar2);
        return cVar2;
    }

    private c f(int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
        while (true) {
            c e8 = e(i8, i9, i10, i11, z8);
            synchronized (this.f6313d) {
                try {
                    if (e8.f6293l == 0) {
                        return e8;
                    }
                    if (!e8.l(z9)) {
                        i();
                    } else {
                        return e8;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void k(c cVar) {
        int size = cVar.f6295n.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((Reference) cVar.f6295n.get(i8)).get() == this) {
                cVar.f6295n.remove(i8);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket m() {
        c cVar = this.f6319j;
        if (cVar != null && cVar.f6292k) {
            return d(false, false, true);
        }
        return null;
    }

    private d o() {
        return J6.a.f4937a.j(this.f6313d);
    }

    public void a(c cVar, boolean z8) {
        if (this.f6319j == null) {
            this.f6319j = cVar;
            this.f6320k = z8;
            cVar.f6295n.add(new a(this, this.f6316g));
            return;
        }
        throw new IllegalStateException();
    }

    public M6.c b() {
        M6.c cVar;
        synchronized (this.f6313d) {
            cVar = this.f6323n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f6319j;
    }

    public boolean g() {
        f.a aVar;
        if (this.f6312c == null && (((aVar = this.f6311b) == null || !aVar.b()) && !this.f6317h.c())) {
            return false;
        }
        return true;
    }

    public M6.c h(u uVar, s.a aVar, boolean z8) {
        try {
            M6.c o8 = f(aVar.connectTimeoutMillis(), aVar.readTimeoutMillis(), aVar.writeTimeoutMillis(), uVar.r(), uVar.A(), z8).o(uVar, aVar, this);
            synchronized (this.f6313d) {
                this.f6323n = o8;
            }
            return o8;
        } catch (IOException e8) {
            throw new e(e8);
        }
    }

    public void i() {
        c cVar;
        Socket d8;
        synchronized (this.f6313d) {
            cVar = this.f6319j;
            d8 = d(true, false, false);
            if (this.f6319j != null) {
                cVar = null;
            }
        }
        J6.c.e(d8);
        if (cVar != null) {
            this.f6315f.h(this.f6314e, cVar);
        }
    }

    public void j() {
        c cVar;
        Socket d8;
        synchronized (this.f6313d) {
            cVar = this.f6319j;
            d8 = d(false, true, false);
            if (this.f6319j != null) {
                cVar = null;
            }
        }
        J6.c.e(d8);
        if (cVar != null) {
            this.f6315f.h(this.f6314e, cVar);
        }
    }

    public Socket l(c cVar) {
        if (this.f6323n == null && this.f6319j.f6295n.size() == 1) {
            Reference reference = (Reference) this.f6319j.f6295n.get(0);
            Socket d8 = d(true, false, false);
            this.f6319j = cVar;
            cVar.f6295n.add(reference);
            return d8;
        }
        throw new IllegalStateException();
    }

    public B n() {
        return this.f6312c;
    }

    public void p(IOException iOException) {
        c cVar;
        boolean z8;
        Socket d8;
        synchronized (this.f6313d) {
            try {
                cVar = null;
                if (iOException instanceof n) {
                    O6.b bVar = ((n) iOException).f8498a;
                    O6.b bVar2 = O6.b.REFUSED_STREAM;
                    if (bVar == bVar2) {
                        this.f6318i++;
                    }
                    if (bVar != bVar2 || this.f6318i > 1) {
                        this.f6312c = null;
                        z8 = true;
                    }
                    z8 = false;
                } else {
                    c cVar2 = this.f6319j;
                    if (cVar2 != null && (!cVar2.m() || (iOException instanceof O6.a))) {
                        if (this.f6319j.f6293l == 0) {
                            B b8 = this.f6312c;
                            if (b8 != null && iOException != null) {
                                this.f6317h.a(b8, iOException);
                            }
                            this.f6312c = null;
                        }
                        z8 = true;
                    }
                    z8 = false;
                }
                c cVar3 = this.f6319j;
                d8 = d(z8, false, true);
                if (this.f6319j == null && this.f6320k) {
                    cVar = cVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J6.c.e(d8);
        if (cVar != null) {
            this.f6315f.h(this.f6314e, cVar);
        }
    }

    public void q(boolean z8, M6.c cVar, long j8, IOException iOException) {
        c cVar2;
        Socket d8;
        boolean z9;
        this.f6315f.p(this.f6314e, j8);
        synchronized (this.f6313d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f6323n) {
                        if (!z8) {
                            this.f6319j.f6293l++;
                        }
                        cVar2 = this.f6319j;
                        d8 = d(z8, false, true);
                        if (this.f6319j != null) {
                            cVar2 = null;
                        }
                        z9 = this.f6321l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f6323n + " but was " + cVar);
        }
        J6.c.e(d8);
        if (cVar2 != null) {
            this.f6315f.h(this.f6314e, cVar2);
        }
        if (iOException != null) {
            this.f6315f.b(this.f6314e, iOException);
        } else if (z9) {
            this.f6315f.a(this.f6314e);
        }
    }

    public String toString() {
        c c8 = c();
        if (c8 != null) {
            return c8.toString();
        }
        return this.f6310a.toString();
    }
}
