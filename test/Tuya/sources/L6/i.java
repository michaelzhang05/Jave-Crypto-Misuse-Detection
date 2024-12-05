package L6;

import P6.C1277c;
import P6.C1279e;
import P6.InterfaceC1281g;
import P6.X;
import P6.Z;
import P6.a0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    long f6668b;

    /* renamed from: c, reason: collision with root package name */
    final int f6669c;

    /* renamed from: d, reason: collision with root package name */
    final g f6670d;

    /* renamed from: e, reason: collision with root package name */
    private final List f6671e;

    /* renamed from: f, reason: collision with root package name */
    private List f6672f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6673g;

    /* renamed from: h, reason: collision with root package name */
    private final b f6674h;

    /* renamed from: i, reason: collision with root package name */
    final a f6675i;

    /* renamed from: a, reason: collision with root package name */
    long f6667a = 0;

    /* renamed from: j, reason: collision with root package name */
    final c f6676j = new c();

    /* renamed from: k, reason: collision with root package name */
    final c f6677k = new c();

    /* renamed from: l, reason: collision with root package name */
    L6.b f6678l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1279e f6679a = new C1279e();

        /* renamed from: b, reason: collision with root package name */
        boolean f6680b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6681c;

        a() {
        }

        private void a(boolean z8) {
            i iVar;
            long min;
            i iVar2;
            boolean z9;
            synchronized (i.this) {
                i.this.f6677k.v();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f6668b > 0 || this.f6681c || this.f6680b || iVar.f6678l != null) {
                            break;
                        } else {
                            iVar.r();
                        }
                    } finally {
                        i.this.f6677k.C();
                    }
                }
                iVar.f6677k.C();
                i.this.c();
                min = Math.min(i.this.f6668b, this.f6679a.x());
                iVar2 = i.this;
                iVar2.f6668b -= min;
            }
            iVar2.f6677k.v();
            try {
                i iVar3 = i.this;
                g gVar = iVar3.f6670d;
                int i8 = iVar3.f6669c;
                if (z8 && min == this.f6679a.x()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gVar.K(i8, z9, this.f6679a, min);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // P6.X
        public void C(C1279e c1279e, long j8) {
            this.f6679a.C(c1279e, j8);
            while (this.f6679a.x() >= 16384) {
                a(false);
            }
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                try {
                    if (this.f6680b) {
                        return;
                    }
                    if (!i.this.f6675i.f6681c) {
                        if (this.f6679a.x() > 0) {
                            while (this.f6679a.x() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f6670d.K(iVar.f6669c, true, null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f6680b = true;
                    }
                    i.this.f6670d.flush();
                    i.this.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // P6.X, java.io.Flushable
        public void flush() {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.f6679a.x() > 0) {
                a(false);
                i.this.f6670d.flush();
            }
        }

        @Override // P6.X
        public a0 timeout() {
            return i.this.f6677k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final C1279e f6683a = new C1279e();

        /* renamed from: b, reason: collision with root package name */
        private final C1279e f6684b = new C1279e();

        /* renamed from: c, reason: collision with root package name */
        private final long f6685c;

        /* renamed from: d, reason: collision with root package name */
        boolean f6686d;

        /* renamed from: e, reason: collision with root package name */
        boolean f6687e;

        b(long j8) {
            this.f6685c = j8;
        }

        private void a() {
            if (!this.f6686d) {
                if (i.this.f6678l == null) {
                    return;
                } else {
                    throw new n(i.this.f6678l);
                }
            }
            throw new IOException("stream closed");
        }

        private void e() {
            i.this.f6676j.v();
            while (this.f6684b.x() == 0 && !this.f6687e && !this.f6686d) {
                try {
                    i iVar = i.this;
                    if (iVar.f6678l != null) {
                        break;
                    } else {
                        iVar.r();
                    }
                } finally {
                    i.this.f6676j.C();
                }
            }
        }

        void b(InterfaceC1281g interfaceC1281g, long j8) {
            boolean z8;
            boolean z9;
            boolean z10;
            while (j8 > 0) {
                synchronized (i.this) {
                    z8 = this.f6687e;
                    z9 = false;
                    if (this.f6684b.x() + j8 > this.f6685c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    interfaceC1281g.skip(j8);
                    i.this.f(L6.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z8) {
                    interfaceC1281g.skip(j8);
                    return;
                }
                long y8 = interfaceC1281g.y(this.f6683a, j8);
                if (y8 != -1) {
                    j8 -= y8;
                    synchronized (i.this) {
                        try {
                            if (this.f6684b.x() == 0) {
                                z9 = true;
                            }
                            this.f6684b.K(this.f6683a);
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

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                this.f6686d = true;
                this.f6684b.a();
                i.this.notifyAll();
            }
            i.this.b();
        }

        @Override // P6.Z
        public a0 timeout() {
            return i.this.f6676j;
        }

        @Override // P6.Z
        public long y(C1279e c1279e, long j8) {
            if (j8 >= 0) {
                synchronized (i.this) {
                    try {
                        e();
                        a();
                        if (this.f6684b.x() == 0) {
                            return -1L;
                        }
                        C1279e c1279e2 = this.f6684b;
                        long y8 = c1279e2.y(c1279e, Math.min(j8, c1279e2.x()));
                        i iVar = i.this;
                        long j9 = iVar.f6667a + y8;
                        iVar.f6667a = j9;
                        if (j9 >= iVar.f6670d.f6608n.d() / 2) {
                            i iVar2 = i.this;
                            iVar2.f6670d.O(iVar2.f6669c, iVar2.f6667a);
                            i.this.f6667a = 0L;
                        }
                        synchronized (i.this.f6670d) {
                            try {
                                g gVar = i.this.f6670d;
                                long j10 = gVar.f6606l + y8;
                                gVar.f6606l = j10;
                                if (j10 >= gVar.f6608n.d() / 2) {
                                    g gVar2 = i.this.f6670d;
                                    gVar2.O(0, gVar2.f6606l);
                                    i.this.f6670d.f6606l = 0L;
                                }
                            } finally {
                            }
                        }
                        return y8;
                    } finally {
                    }
                }
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends C1277c {
        c() {
        }

        @Override // P6.C1277c
        protected void B() {
            i.this.f(L6.b.CANCEL);
        }

        public void C() {
            if (!w()) {
            } else {
                throw x(null);
            }
        }

        @Override // P6.C1277c
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
                this.f6669c = i8;
                this.f6670d = gVar;
                this.f6668b = gVar.f6609o.d();
                b bVar = new b(gVar.f6608n.d());
                this.f6674h = bVar;
                a aVar = new a();
                this.f6675i = aVar;
                bVar.f6687e = z9;
                aVar.f6681c = z8;
                this.f6671e = list;
                return;
            }
            throw new NullPointerException("requestHeaders == null");
        }
        throw new NullPointerException("connection == null");
    }

    private boolean e(L6.b bVar) {
        synchronized (this) {
            try {
                if (this.f6678l != null) {
                    return false;
                }
                if (this.f6674h.f6687e && this.f6675i.f6681c) {
                    return false;
                }
                this.f6678l = bVar;
                notifyAll();
                this.f6670d.G(this.f6669c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j8) {
        this.f6668b += j8;
        if (j8 > 0) {
            notifyAll();
        }
    }

    void b() {
        boolean z8;
        boolean k8;
        synchronized (this) {
            try {
                b bVar = this.f6674h;
                if (!bVar.f6687e && bVar.f6686d) {
                    a aVar = this.f6675i;
                    if (!aVar.f6681c) {
                        if (aVar.f6680b) {
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
            d(L6.b.CANCEL);
        } else if (!k8) {
            this.f6670d.G(this.f6669c);
        }
    }

    void c() {
        a aVar = this.f6675i;
        if (!aVar.f6680b) {
            if (!aVar.f6681c) {
                if (this.f6678l == null) {
                    return;
                } else {
                    throw new n(this.f6678l);
                }
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void d(L6.b bVar) {
        if (!e(bVar)) {
            return;
        }
        this.f6670d.M(this.f6669c, bVar);
    }

    public void f(L6.b bVar) {
        if (!e(bVar)) {
            return;
        }
        this.f6670d.N(this.f6669c, bVar);
    }

    public int g() {
        return this.f6669c;
    }

    public X h() {
        synchronized (this) {
            try {
                if (!this.f6673g && !j()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6675i;
    }

    public Z i() {
        return this.f6674h;
    }

    public boolean j() {
        boolean z8;
        if ((this.f6669c & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f6670d.f6595a == z8) {
            return true;
        }
        return false;
    }

    public synchronized boolean k() {
        try {
            if (this.f6678l != null) {
                return false;
            }
            b bVar = this.f6674h;
            if (!bVar.f6687e) {
                if (bVar.f6686d) {
                }
                return true;
            }
            a aVar = this.f6675i;
            if (aVar.f6681c || aVar.f6680b) {
                if (this.f6673g) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public a0 l() {
        return this.f6676j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(InterfaceC1281g interfaceC1281g, int i8) {
        this.f6674h.b(interfaceC1281g, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        boolean k8;
        synchronized (this) {
            this.f6674h.f6687e = true;
            k8 = k();
            notifyAll();
        }
        if (!k8) {
            this.f6670d.G(this.f6669c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(List list) {
        boolean z8;
        synchronized (this) {
            z8 = true;
            try {
                this.f6673g = true;
                if (this.f6672f == null) {
                    this.f6672f = list;
                    z8 = k();
                    notifyAll();
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.f6672f);
                    arrayList.add(null);
                    arrayList.addAll(list);
                    this.f6672f = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8) {
            this.f6670d.G(this.f6669c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void p(L6.b bVar) {
        if (this.f6678l == null) {
            this.f6678l = bVar;
            notifyAll();
        }
    }

    public synchronized List q() {
        List list;
        if (j()) {
            this.f6676j.v();
            while (this.f6672f == null && this.f6678l == null) {
                try {
                    r();
                } catch (Throwable th) {
                    this.f6676j.C();
                    throw th;
                }
            }
            this.f6676j.C();
            list = this.f6672f;
            if (list != null) {
                this.f6672f = null;
            } else {
                throw new n(this.f6678l);
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
        return this.f6677k;
    }
}
