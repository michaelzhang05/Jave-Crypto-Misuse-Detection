package I6;

import F6.B;
import F6.C1164a;
import F6.i;
import F6.o;
import F6.s;
import F6.u;
import I6.f;
import L6.n;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C1164a f4315a;

    /* renamed from: b, reason: collision with root package name */
    private f.a f4316b;

    /* renamed from: c, reason: collision with root package name */
    private B f4317c;

    /* renamed from: d, reason: collision with root package name */
    private final i f4318d;

    /* renamed from: e, reason: collision with root package name */
    public final F6.e f4319e;

    /* renamed from: f, reason: collision with root package name */
    public final o f4320f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f4321g;

    /* renamed from: h, reason: collision with root package name */
    private final f f4322h;

    /* renamed from: i, reason: collision with root package name */
    private int f4323i;

    /* renamed from: j, reason: collision with root package name */
    private c f4324j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4325k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4326l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4327m;

    /* renamed from: n, reason: collision with root package name */
    private J6.c f4328n;

    /* loaded from: classes5.dex */
    public static final class a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final Object f4329a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f4329a = obj;
        }
    }

    public g(i iVar, C1164a c1164a, F6.e eVar, o oVar, Object obj) {
        this.f4318d = iVar;
        this.f4315a = c1164a;
        this.f4319e = eVar;
        this.f4320f = oVar;
        this.f4322h = new f(c1164a, o(), eVar, oVar);
        this.f4321g = obj;
    }

    private Socket d(boolean z8, boolean z9, boolean z10) {
        Socket socket;
        if (z10) {
            this.f4328n = null;
        }
        if (z9) {
            this.f4326l = true;
        }
        c cVar = this.f4324j;
        if (cVar == null) {
            return null;
        }
        if (z8) {
            cVar.f4297k = true;
        }
        if (this.f4328n != null) {
            return null;
        }
        if (!this.f4326l && !cVar.f4297k) {
            return null;
        }
        k(cVar);
        if (this.f4324j.f4300n.isEmpty()) {
            this.f4324j.f4301o = System.nanoTime();
            if (G6.a.f3218a.e(this.f4318d, this.f4324j)) {
                socket = this.f4324j.q();
                this.f4324j = null;
                return socket;
            }
        }
        socket = null;
        this.f4324j = null;
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
        synchronized (this.f4318d) {
            try {
                if (!this.f4326l) {
                    if (this.f4328n == null) {
                        if (!this.f4327m) {
                            cVar = this.f4324j;
                            m8 = m();
                            cVar2 = this.f4324j;
                            socket = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f4325k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                G6.a.f3218a.h(this.f4318d, this.f4315a, this, null);
                                c cVar3 = this.f4324j;
                                if (cVar3 != null) {
                                    cVar2 = cVar3;
                                    z9 = true;
                                    b8 = null;
                                } else {
                                    b8 = this.f4317c;
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
        G6.c.e(m8);
        if (cVar != null) {
            this.f4320f.h(this.f4319e, cVar);
        }
        if (z9) {
            this.f4320f.g(this.f4319e, cVar2);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (b8 == null && ((aVar = this.f4316b) == null || !aVar.b())) {
            this.f4316b = this.f4322h.e();
            z10 = true;
        } else {
            z10 = false;
        }
        synchronized (this.f4318d) {
            try {
                if (!this.f4327m) {
                    if (z10) {
                        List a8 = this.f4316b.a();
                        int size = a8.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                break;
                            }
                            B b9 = (B) a8.get(i12);
                            G6.a.f3218a.h(this.f4318d, this.f4315a, this, b9);
                            c cVar4 = this.f4324j;
                            if (cVar4 != null) {
                                this.f4317c = b9;
                                cVar2 = cVar4;
                                z9 = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (!z9) {
                        if (b8 == null) {
                            b8 = this.f4316b.c();
                        }
                        this.f4317c = b8;
                        this.f4323i = 0;
                        cVar2 = new c(this.f4318d, b8);
                        a(cVar2, false);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        if (z9) {
            this.f4320f.g(this.f4319e, cVar2);
            return cVar2;
        }
        cVar2.c(i8, i9, i10, i11, z8, this.f4319e, this.f4320f);
        o().a(cVar2.p());
        synchronized (this.f4318d) {
            try {
                this.f4325k = true;
                G6.a.f3218a.i(this.f4318d, cVar2);
                if (cVar2.m()) {
                    socket = G6.a.f3218a.f(this.f4318d, this.f4315a, this);
                    cVar2 = this.f4324j;
                }
            } finally {
            }
        }
        G6.c.e(socket);
        this.f4320f.g(this.f4319e, cVar2);
        return cVar2;
    }

    private c f(int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
        while (true) {
            c e8 = e(i8, i9, i10, i11, z8);
            synchronized (this.f4318d) {
                try {
                    if (e8.f4298l == 0) {
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
        int size = cVar.f4300n.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((Reference) cVar.f4300n.get(i8)).get() == this) {
                cVar.f4300n.remove(i8);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket m() {
        c cVar = this.f4324j;
        if (cVar != null && cVar.f4297k) {
            return d(false, false, true);
        }
        return null;
    }

    private d o() {
        return G6.a.f3218a.j(this.f4318d);
    }

    public void a(c cVar, boolean z8) {
        if (this.f4324j == null) {
            this.f4324j = cVar;
            this.f4325k = z8;
            cVar.f4300n.add(new a(this, this.f4321g));
            return;
        }
        throw new IllegalStateException();
    }

    public J6.c b() {
        J6.c cVar;
        synchronized (this.f4318d) {
            cVar = this.f4328n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f4324j;
    }

    public boolean g() {
        f.a aVar;
        if (this.f4317c == null && (((aVar = this.f4316b) == null || !aVar.b()) && !this.f4322h.c())) {
            return false;
        }
        return true;
    }

    public J6.c h(u uVar, s.a aVar, boolean z8) {
        try {
            J6.c o8 = f(aVar.connectTimeoutMillis(), aVar.readTimeoutMillis(), aVar.writeTimeoutMillis(), uVar.r(), uVar.y(), z8).o(uVar, aVar, this);
            synchronized (this.f4318d) {
                this.f4328n = o8;
            }
            return o8;
        } catch (IOException e8) {
            throw new e(e8);
        }
    }

    public void i() {
        c cVar;
        Socket d8;
        synchronized (this.f4318d) {
            cVar = this.f4324j;
            d8 = d(true, false, false);
            if (this.f4324j != null) {
                cVar = null;
            }
        }
        G6.c.e(d8);
        if (cVar != null) {
            this.f4320f.h(this.f4319e, cVar);
        }
    }

    public void j() {
        c cVar;
        Socket d8;
        synchronized (this.f4318d) {
            cVar = this.f4324j;
            d8 = d(false, true, false);
            if (this.f4324j != null) {
                cVar = null;
            }
        }
        G6.c.e(d8);
        if (cVar != null) {
            this.f4320f.h(this.f4319e, cVar);
        }
    }

    public Socket l(c cVar) {
        if (this.f4328n == null && this.f4324j.f4300n.size() == 1) {
            Reference reference = (Reference) this.f4324j.f4300n.get(0);
            Socket d8 = d(true, false, false);
            this.f4324j = cVar;
            cVar.f4300n.add(reference);
            return d8;
        }
        throw new IllegalStateException();
    }

    public B n() {
        return this.f4317c;
    }

    public void p(IOException iOException) {
        c cVar;
        boolean z8;
        Socket d8;
        synchronized (this.f4318d) {
            try {
                cVar = null;
                if (iOException instanceof n) {
                    L6.b bVar = ((n) iOException).f6707a;
                    L6.b bVar2 = L6.b.REFUSED_STREAM;
                    if (bVar == bVar2) {
                        this.f4323i++;
                    }
                    if (bVar != bVar2 || this.f4323i > 1) {
                        this.f4317c = null;
                        z8 = true;
                    }
                    z8 = false;
                } else {
                    c cVar2 = this.f4324j;
                    if (cVar2 != null && (!cVar2.m() || (iOException instanceof L6.a))) {
                        if (this.f4324j.f4298l == 0) {
                            B b8 = this.f4317c;
                            if (b8 != null && iOException != null) {
                                this.f4322h.a(b8, iOException);
                            }
                            this.f4317c = null;
                        }
                        z8 = true;
                    }
                    z8 = false;
                }
                c cVar3 = this.f4324j;
                d8 = d(z8, false, true);
                if (this.f4324j == null && this.f4325k) {
                    cVar = cVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G6.c.e(d8);
        if (cVar != null) {
            this.f4320f.h(this.f4319e, cVar);
        }
    }

    public void q(boolean z8, J6.c cVar, long j8, IOException iOException) {
        c cVar2;
        Socket d8;
        boolean z9;
        this.f4320f.p(this.f4319e, j8);
        synchronized (this.f4318d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f4328n) {
                        if (!z8) {
                            this.f4324j.f4298l++;
                        }
                        cVar2 = this.f4324j;
                        d8 = d(z8, false, true);
                        if (this.f4324j != null) {
                            cVar2 = null;
                        }
                        z9 = this.f4326l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f4328n + " but was " + cVar);
        }
        G6.c.e(d8);
        if (cVar2 != null) {
            this.f4320f.h(this.f4319e, cVar2);
        }
        if (iOException != null) {
            this.f4320f.b(this.f4319e, iOException);
        } else if (z9) {
            this.f4320f.a(this.f4319e);
        }
    }

    public String toString() {
        c c8 = c();
        if (c8 != null) {
            return c8.toString();
        }
        return this.f4315a.toString();
    }
}
