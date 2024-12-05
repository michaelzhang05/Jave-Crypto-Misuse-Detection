package O6;

import S6.C1415c;
import S6.C1417e;
import S6.InterfaceC1419g;
import S6.X;
import S6.Z;
import S6.a0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    long f8459b;

    /* renamed from: c, reason: collision with root package name */
    final int f8460c;

    /* renamed from: d, reason: collision with root package name */
    final g f8461d;

    /* renamed from: e, reason: collision with root package name */
    private final List f8462e;

    /* renamed from: f, reason: collision with root package name */
    private List f8463f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8464g;

    /* renamed from: h, reason: collision with root package name */
    private final b f8465h;

    /* renamed from: i, reason: collision with root package name */
    final a f8466i;

    /* renamed from: a, reason: collision with root package name */
    long f8458a = 0;

    /* renamed from: j, reason: collision with root package name */
    final c f8467j = new c();

    /* renamed from: k, reason: collision with root package name */
    final c f8468k = new c();

    /* renamed from: l, reason: collision with root package name */
    O6.b f8469l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1417e f8470a = new C1417e();

        /* renamed from: b, reason: collision with root package name */
        boolean f8471b;

        /* renamed from: c, reason: collision with root package name */
        boolean f8472c;

        a() {
        }

        private void a(boolean z8) {
            i iVar;
            long min;
            i iVar2;
            boolean z9;
            synchronized (i.this) {
                i.this.f8468k.v();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f8459b > 0 || this.f8472c || this.f8471b || iVar.f8469l != null) {
                            break;
                        } else {
                            iVar.r();
                        }
                    } finally {
                        i.this.f8468k.C();
                    }
                }
                iVar.f8468k.C();
                i.this.c();
                min = Math.min(i.this.f8459b, this.f8470a.E());
                iVar2 = i.this;
                iVar2.f8459b -= min;
            }
            iVar2.f8468k.v();
            try {
                i iVar3 = i.this;
                g gVar = iVar3.f8461d;
                int i8 = iVar3.f8460c;
                if (z8 && min == this.f8470a.E()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gVar.K(i8, z9, this.f8470a, min);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // S6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                try {
                    if (this.f8471b) {
                        return;
                    }
                    if (!i.this.f8466i.f8472c) {
                        if (this.f8470a.E() > 0) {
                            while (this.f8470a.E() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f8461d.K(iVar.f8460c, true, null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f8471b = true;
                    }
                    i.this.f8461d.flush();
                    i.this.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // S6.X, java.io.Flushable
        public void flush() {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.f8470a.E() > 0) {
                a(false);
                i.this.f8461d.flush();
            }
        }

        @Override // S6.X
        public void h(C1417e c1417e, long j8) {
            this.f8470a.h(c1417e, j8);
            while (this.f8470a.E() >= 16384) {
                a(false);
            }
        }

        @Override // S6.X
        public a0 timeout() {
            return i.this.f8468k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final C1417e f8474a = new C1417e();

        /* renamed from: b, reason: collision with root package name */
        private final C1417e f8475b = new C1417e();

        /* renamed from: c, reason: collision with root package name */
        private final long f8476c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8477d;

        /* renamed from: e, reason: collision with root package name */
        boolean f8478e;

        b(long j8) {
            this.f8476c = j8;
        }

        private void a() {
            if (!this.f8477d) {
                if (i.this.f8469l == null) {
                    return;
                } else {
                    throw new n(i.this.f8469l);
                }
            }
            throw new IOException("stream closed");
        }

        private void f() {
            i.this.f8467j.v();
            while (this.f8475b.E() == 0 && !this.f8478e && !this.f8477d) {
                try {
                    i iVar = i.this;
                    if (iVar.f8469l != null) {
                        break;
                    } else {
                        iVar.r();
                    }
                } finally {
                    i.this.f8467j.C();
                }
            }
        }

        @Override // S6.Z
        public long C(C1417e c1417e, long j8) {
            if (j8 >= 0) {
                synchronized (i.this) {
                    try {
                        f();
                        a();
                        if (this.f8475b.E() == 0) {
                            return -1L;
                        }
                        C1417e c1417e2 = this.f8475b;
                        long C8 = c1417e2.C(c1417e, Math.min(j8, c1417e2.E()));
                        i iVar = i.this;
                        long j9 = iVar.f8458a + C8;
                        iVar.f8458a = j9;
                        if (j9 >= iVar.f8461d.f8399n.d() / 2) {
                            i iVar2 = i.this;
                            iVar2.f8461d.O(iVar2.f8460c, iVar2.f8458a);
                            i.this.f8458a = 0L;
                        }
                        synchronized (i.this.f8461d) {
                            try {
                                g gVar = i.this.f8461d;
                                long j10 = gVar.f8397l + C8;
                                gVar.f8397l = j10;
                                if (j10 >= gVar.f8399n.d() / 2) {
                                    g gVar2 = i.this.f8461d;
                                    gVar2.O(0, gVar2.f8397l);
                                    i.this.f8461d.f8397l = 0L;
                                }
                            } finally {
                            }
                        }
                        return C8;
                    } finally {
                    }
                }
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }

        void b(InterfaceC1419g interfaceC1419g, long j8) {
            boolean z8;
            boolean z9;
            boolean z10;
            while (j8 > 0) {
                synchronized (i.this) {
                    z8 = this.f8478e;
                    z9 = false;
                    if (this.f8475b.E() + j8 > this.f8476c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    interfaceC1419g.skip(j8);
                    i.this.f(O6.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z8) {
                    interfaceC1419g.skip(j8);
                    return;
                }
                long C8 = interfaceC1419g.C(this.f8474a, j8);
                if (C8 != -1) {
                    j8 -= C8;
                    synchronized (i.this) {
                        try {
                            if (this.f8475b.E() == 0) {
                                z9 = true;
                            }
                            this.f8475b.L(this.f8474a);
                            if (z9) {
                                i.this.notifyAll();
                            }
                        } finally {
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                this.f8477d = true;
                this.f8475b.a();
                i.this.notifyAll();
            }
            i.this.b();
        }

        @Override // S6.Z
        public a0 timeout() {
            return i.this.f8467j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends C1415c {
        c() {
        }

        @Override // S6.C1415c
        protected void B() {
            i.this.f(O6.b.CANCEL);
        }

        public void C() {
            if (!w()) {
            } else {
                throw x(null);
            }
        }

        @Override // S6.C1415c
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i8, g gVar, boolean z8, boolean z9, List list) {
        if (gVar != null) {
            if (list != null) {
                this.f8460c = i8;
                this.f8461d = gVar;
                this.f8459b = gVar.f8400o.d();
                b bVar = new b(gVar.f8399n.d());
                this.f8465h = bVar;
                a aVar = new a();
                this.f8466i = aVar;
                bVar.f8478e = z9;
                aVar.f8472c = z8;
                this.f8462e = list;
                return;
            }
            throw new NullPointerException("requestHeaders == null");
        }
        throw new NullPointerException("connection == null");
    }

    private boolean e(O6.b bVar) {
        synchronized (this) {
            try {
                if (this.f8469l != null) {
                    return false;
                }
                if (this.f8465h.f8478e && this.f8466i.f8472c) {
                    return false;
                }
                this.f8469l = bVar;
                notifyAll();
                this.f8461d.G(this.f8460c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j8) {
        this.f8459b += j8;
        if (j8 > 0) {
            notifyAll();
        }
    }

    void b() {
        boolean z8;
        boolean k8;
        synchronized (this) {
            try {
                b bVar = this.f8465h;
                if (!bVar.f8478e && bVar.f8477d) {
                    a aVar = this.f8466i;
                    if (!aVar.f8472c) {
                        if (aVar.f8471b) {
                        }
                    }
                    z8 = true;
                    k8 = k();
                }
                z8 = false;
                k8 = k();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            d(O6.b.CANCEL);
        } else if (!k8) {
            this.f8461d.G(this.f8460c);
        }
    }

    void c() {
        a aVar = this.f8466i;
        if (!aVar.f8471b) {
            if (!aVar.f8472c) {
                if (this.f8469l == null) {
                    return;
                } else {
                    throw new n(this.f8469l);
                }
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void d(O6.b bVar) {
        if (!e(bVar)) {
            return;
        }
        this.f8461d.M(this.f8460c, bVar);
    }

    public void f(O6.b bVar) {
        if (!e(bVar)) {
            return;
        }
        this.f8461d.N(this.f8460c, bVar);
    }

    public int g() {
        return this.f8460c;
    }

    public X h() {
        synchronized (this) {
            try {
                if (!this.f8464g && !j()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f8466i;
    }

    public Z i() {
        return this.f8465h;
    }

    public boolean j() {
        boolean z8;
        if ((this.f8460c & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f8461d.f8386a == z8) {
            return true;
        }
        return false;
    }

    public synchronized boolean k() {
        try {
            if (this.f8469l != null) {
                return false;
            }
            b bVar = this.f8465h;
            if (!bVar.f8478e) {
                if (bVar.f8477d) {
                }
                return true;
            }
            a aVar = this.f8466i;
            if (aVar.f8472c || aVar.f8471b) {
                if (this.f8464g) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public a0 l() {
        return this.f8467j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(InterfaceC1419g interfaceC1419g, int i8) {
        this.f8465h.b(interfaceC1419g, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        boolean k8;
        synchronized (this) {
            this.f8465h.f8478e = true;
            k8 = k();
            notifyAll();
        }
        if (!k8) {
            this.f8461d.G(this.f8460c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(List list) {
        boolean z8;
        synchronized (this) {
            z8 = true;
            try {
                this.f8464g = true;
                if (this.f8463f == null) {
                    this.f8463f = list;
                    z8 = k();
                    notifyAll();
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.f8463f);
                    arrayList.add(null);
                    arrayList.addAll(list);
                    this.f8463f = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8) {
            this.f8461d.G(this.f8460c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void p(O6.b bVar) {
        if (this.f8469l == null) {
            this.f8469l = bVar;
            notifyAll();
        }
    }

    public synchronized List q() {
        List list;
        if (j()) {
            this.f8467j.v();
            while (this.f8463f == null && this.f8469l == null) {
                try {
                    r();
                } catch (Throwable th) {
                    this.f8467j.C();
                    throw th;
                }
            }
            this.f8467j.C();
            list = this.f8463f;
            if (list != null) {
                this.f8463f = null;
            } else {
                throw new n(this.f8469l);
            }
        } else {
            throw new IllegalStateException("servers cannot read response headers");
        }
        return list;
    }

    void r() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public a0 s() {
        return this.f8468k;
    }
}
