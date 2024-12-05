package I6;

import I6.e;
import I6.o;
import I6.q;
import I6.z;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public class u implements Cloneable, e.a {

    /* renamed from: B, reason: collision with root package name */
    static final List f4499B = J6.c.r(v.HTTP_2, v.HTTP_1_1);

    /* renamed from: C, reason: collision with root package name */
    static final List f4500C = J6.c.r(j.f4434f, j.f4436h);

    /* renamed from: A, reason: collision with root package name */
    final int f4501A;

    /* renamed from: a, reason: collision with root package name */
    final m f4502a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f4503b;

    /* renamed from: c, reason: collision with root package name */
    final List f4504c;

    /* renamed from: d, reason: collision with root package name */
    final List f4505d;

    /* renamed from: e, reason: collision with root package name */
    final List f4506e;

    /* renamed from: f, reason: collision with root package name */
    final List f4507f;

    /* renamed from: g, reason: collision with root package name */
    final o.c f4508g;

    /* renamed from: h, reason: collision with root package name */
    final ProxySelector f4509h;

    /* renamed from: i, reason: collision with root package name */
    final l f4510i;

    /* renamed from: j, reason: collision with root package name */
    final C1265c f4511j;

    /* renamed from: k, reason: collision with root package name */
    final K6.f f4512k;

    /* renamed from: l, reason: collision with root package name */
    final SocketFactory f4513l;

    /* renamed from: m, reason: collision with root package name */
    final SSLSocketFactory f4514m;

    /* renamed from: n, reason: collision with root package name */
    final R6.c f4515n;

    /* renamed from: o, reason: collision with root package name */
    final HostnameVerifier f4516o;

    /* renamed from: p, reason: collision with root package name */
    final f f4517p;

    /* renamed from: q, reason: collision with root package name */
    final InterfaceC1264b f4518q;

    /* renamed from: r, reason: collision with root package name */
    final InterfaceC1264b f4519r;

    /* renamed from: s, reason: collision with root package name */
    final i f4520s;

    /* renamed from: t, reason: collision with root package name */
    final n f4521t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f4522u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f4523v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f4524w;

    /* renamed from: x, reason: collision with root package name */
    final int f4525x;

    /* renamed from: y, reason: collision with root package name */
    final int f4526y;

    /* renamed from: z, reason: collision with root package name */
    final int f4527z;

    /* loaded from: classes5.dex */
    final class a extends J6.a {
        a() {
        }

        @Override // J6.a
        public void a(q.a aVar, String str) {
            aVar.b(str);
        }

        @Override // J6.a
        public void b(q.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        @Override // J6.a
        public void c(j jVar, SSLSocket sSLSocket, boolean z8) {
            jVar.a(sSLSocket, z8);
        }

        @Override // J6.a
        public int d(z.a aVar) {
            return aVar.f4597c;
        }

        @Override // J6.a
        public boolean e(i iVar, L6.c cVar) {
            return iVar.b(cVar);
        }

        @Override // J6.a
        public Socket f(i iVar, C1263a c1263a, L6.g gVar) {
            return iVar.c(c1263a, gVar);
        }

        @Override // J6.a
        public boolean g(C1263a c1263a, C1263a c1263a2) {
            return c1263a.d(c1263a2);
        }

        @Override // J6.a
        public L6.c h(i iVar, C1263a c1263a, L6.g gVar, B b8) {
            return iVar.d(c1263a, gVar, b8);
        }

        @Override // J6.a
        public void i(i iVar, L6.c cVar) {
            iVar.f(cVar);
        }

        @Override // J6.a
        public L6.d j(i iVar) {
            return iVar.f4430e;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        int f4528A;

        /* renamed from: b, reason: collision with root package name */
        Proxy f4530b;

        /* renamed from: j, reason: collision with root package name */
        C1265c f4538j;

        /* renamed from: k, reason: collision with root package name */
        K6.f f4539k;

        /* renamed from: m, reason: collision with root package name */
        SSLSocketFactory f4541m;

        /* renamed from: n, reason: collision with root package name */
        R6.c f4542n;

        /* renamed from: q, reason: collision with root package name */
        InterfaceC1264b f4545q;

        /* renamed from: r, reason: collision with root package name */
        InterfaceC1264b f4546r;

        /* renamed from: s, reason: collision with root package name */
        i f4547s;

        /* renamed from: t, reason: collision with root package name */
        n f4548t;

        /* renamed from: u, reason: collision with root package name */
        boolean f4549u;

        /* renamed from: v, reason: collision with root package name */
        boolean f4550v;

        /* renamed from: w, reason: collision with root package name */
        boolean f4551w;

        /* renamed from: x, reason: collision with root package name */
        int f4552x;

        /* renamed from: y, reason: collision with root package name */
        int f4553y;

        /* renamed from: z, reason: collision with root package name */
        int f4554z;

        /* renamed from: e, reason: collision with root package name */
        final List f4533e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        final List f4534f = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        m f4529a = new m();

        /* renamed from: c, reason: collision with root package name */
        List f4531c = u.f4499B;

        /* renamed from: d, reason: collision with root package name */
        List f4532d = u.f4500C;

        /* renamed from: g, reason: collision with root package name */
        o.c f4535g = o.k(o.f4467a);

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f4536h = ProxySelector.getDefault();

        /* renamed from: i, reason: collision with root package name */
        l f4537i = l.f4458a;

        /* renamed from: l, reason: collision with root package name */
        SocketFactory f4540l = SocketFactory.getDefault();

        /* renamed from: o, reason: collision with root package name */
        HostnameVerifier f4543o = R6.d.f9656a;

        /* renamed from: p, reason: collision with root package name */
        f f4544p = f.f4306c;

        public b() {
            InterfaceC1264b interfaceC1264b = InterfaceC1264b.f4248a;
            this.f4545q = interfaceC1264b;
            this.f4546r = interfaceC1264b;
            this.f4547s = new i();
            this.f4548t = n.f4466a;
            this.f4549u = true;
            this.f4550v = true;
            this.f4551w = true;
            this.f4552x = 10000;
            this.f4553y = 10000;
            this.f4554z = 10000;
            this.f4528A = 0;
        }

        public u a() {
            return new u(this);
        }

        public b b(C1265c c1265c) {
            this.f4538j = c1265c;
            this.f4539k = null;
            return this;
        }
    }

    static {
        J6.a.f4937a = new a();
    }

    u(b bVar) {
        boolean z8;
        this.f4502a = bVar.f4529a;
        this.f4503b = bVar.f4530b;
        this.f4504c = bVar.f4531c;
        List list = bVar.f4532d;
        this.f4505d = list;
        this.f4506e = J6.c.q(bVar.f4533e);
        this.f4507f = J6.c.q(bVar.f4534f);
        this.f4508g = bVar.f4535g;
        this.f4509h = bVar.f4536h;
        this.f4510i = bVar.f4537i;
        this.f4511j = bVar.f4538j;
        this.f4512k = bVar.f4539k;
        this.f4513l = bVar.f4540l;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z8 = z8 || ((j) it.next()).d();
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f4541m;
        if (sSLSocketFactory == null && z8) {
            X509TrustManager E8 = E();
            this.f4514m = D(E8);
            this.f4515n = R6.c.b(E8);
        } else {
            this.f4514m = sSLSocketFactory;
            this.f4515n = bVar.f4542n;
        }
        this.f4516o = bVar.f4543o;
        this.f4517p = bVar.f4544p.e(this.f4515n);
        this.f4518q = bVar.f4545q;
        this.f4519r = bVar.f4546r;
        this.f4520s = bVar.f4547s;
        this.f4521t = bVar.f4548t;
        this.f4522u = bVar.f4549u;
        this.f4523v = bVar.f4550v;
        this.f4524w = bVar.f4551w;
        this.f4525x = bVar.f4552x;
        this.f4526y = bVar.f4553y;
        this.f4527z = bVar.f4554z;
        this.f4501A = bVar.f4528A;
        if (!this.f4506e.contains(null)) {
            if (!this.f4507f.contains(null)) {
                return;
            }
            throw new IllegalStateException("Null network interceptor: " + this.f4507f);
        }
        throw new IllegalStateException("Null interceptor: " + this.f4506e);
    }

    private SSLSocketFactory D(X509TrustManager x509TrustManager) {
        try {
            SSLContext k8 = Q6.f.i().k();
            k8.init(null, new TrustManager[]{x509TrustManager}, null);
            return k8.getSocketFactory();
        } catch (GeneralSecurityException e8) {
            throw J6.c.a("No System TLS", e8);
        }
    }

    private X509TrustManager E() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e8) {
            throw J6.c.a("No System TLS", e8);
        }
    }

    public boolean A() {
        return this.f4524w;
    }

    public SocketFactory B() {
        return this.f4513l;
    }

    public SSLSocketFactory C() {
        return this.f4514m;
    }

    public int F() {
        return this.f4527z;
    }

    @Override // I6.e.a
    public e a(x xVar) {
        return w.d(this, xVar, false);
    }

    public InterfaceC1264b b() {
        return this.f4519r;
    }

    public C1265c c() {
        return this.f4511j;
    }

    public f d() {
        return this.f4517p;
    }

    public int e() {
        return this.f4525x;
    }

    public i f() {
        return this.f4520s;
    }

    public List g() {
        return this.f4505d;
    }

    public l h() {
        return this.f4510i;
    }

    public m i() {
        return this.f4502a;
    }

    public n j() {
        return this.f4521t;
    }

    public o.c k() {
        return this.f4508g;
    }

    public boolean l() {
        return this.f4523v;
    }

    public boolean m() {
        return this.f4522u;
    }

    public HostnameVerifier n() {
        return this.f4516o;
    }

    public List o() {
        return this.f4506e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K6.f p() {
        C1265c c1265c = this.f4511j;
        if (c1265c != null) {
            return c1265c.f4249a;
        }
        return this.f4512k;
    }

    public List q() {
        return this.f4507f;
    }

    public int r() {
        return this.f4501A;
    }

    public List s() {
        return this.f4504c;
    }

    public Proxy t() {
        return this.f4503b;
    }

    public InterfaceC1264b w() {
        return this.f4518q;
    }

    public ProxySelector x() {
        return this.f4509h;
    }

    public int z() {
        return this.f4526y;
    }
}
