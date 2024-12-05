package F6;

import F6.e;
import F6.o;
import F6.q;
import F6.z;
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
    static final List f2959B = G6.c.r(v.HTTP_2, v.HTTP_1_1);

    /* renamed from: C, reason: collision with root package name */
    static final List f2960C = G6.c.r(j.f2894f, j.f2896h);

    /* renamed from: A, reason: collision with root package name */
    final int f2961A;

    /* renamed from: a, reason: collision with root package name */
    final m f2962a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f2963b;

    /* renamed from: c, reason: collision with root package name */
    final List f2964c;

    /* renamed from: d, reason: collision with root package name */
    final List f2965d;

    /* renamed from: e, reason: collision with root package name */
    final List f2966e;

    /* renamed from: f, reason: collision with root package name */
    final List f2967f;

    /* renamed from: g, reason: collision with root package name */
    final o.c f2968g;

    /* renamed from: h, reason: collision with root package name */
    final ProxySelector f2969h;

    /* renamed from: i, reason: collision with root package name */
    final l f2970i;

    /* renamed from: j, reason: collision with root package name */
    final C1166c f2971j;

    /* renamed from: k, reason: collision with root package name */
    final H6.f f2972k;

    /* renamed from: l, reason: collision with root package name */
    final SocketFactory f2973l;

    /* renamed from: m, reason: collision with root package name */
    final SSLSocketFactory f2974m;

    /* renamed from: n, reason: collision with root package name */
    final O6.c f2975n;

    /* renamed from: o, reason: collision with root package name */
    final HostnameVerifier f2976o;

    /* renamed from: p, reason: collision with root package name */
    final f f2977p;

    /* renamed from: q, reason: collision with root package name */
    final InterfaceC1165b f2978q;

    /* renamed from: r, reason: collision with root package name */
    final InterfaceC1165b f2979r;

    /* renamed from: s, reason: collision with root package name */
    final i f2980s;

    /* renamed from: t, reason: collision with root package name */
    final n f2981t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f2982u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f2983v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f2984w;

    /* renamed from: x, reason: collision with root package name */
    final int f2985x;

    /* renamed from: y, reason: collision with root package name */
    final int f2986y;

    /* renamed from: z, reason: collision with root package name */
    final int f2987z;

    /* loaded from: classes5.dex */
    final class a extends G6.a {
        a() {
        }

        @Override // G6.a
        public void a(q.a aVar, String str) {
            aVar.b(str);
        }

        @Override // G6.a
        public void b(q.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        @Override // G6.a
        public void c(j jVar, SSLSocket sSLSocket, boolean z8) {
            jVar.a(sSLSocket, z8);
        }

        @Override // G6.a
        public int d(z.a aVar) {
            return aVar.f3057c;
        }

        @Override // G6.a
        public boolean e(i iVar, I6.c cVar) {
            return iVar.b(cVar);
        }

        @Override // G6.a
        public Socket f(i iVar, C1164a c1164a, I6.g gVar) {
            return iVar.c(c1164a, gVar);
        }

        @Override // G6.a
        public boolean g(C1164a c1164a, C1164a c1164a2) {
            return c1164a.d(c1164a2);
        }

        @Override // G6.a
        public I6.c h(i iVar, C1164a c1164a, I6.g gVar, B b8) {
            return iVar.d(c1164a, gVar, b8);
        }

        @Override // G6.a
        public void i(i iVar, I6.c cVar) {
            iVar.f(cVar);
        }

        @Override // G6.a
        public I6.d j(i iVar) {
            return iVar.f2890e;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        int f2988A;

        /* renamed from: b, reason: collision with root package name */
        Proxy f2990b;

        /* renamed from: j, reason: collision with root package name */
        C1166c f2998j;

        /* renamed from: k, reason: collision with root package name */
        H6.f f2999k;

        /* renamed from: m, reason: collision with root package name */
        SSLSocketFactory f3001m;

        /* renamed from: n, reason: collision with root package name */
        O6.c f3002n;

        /* renamed from: q, reason: collision with root package name */
        InterfaceC1165b f3005q;

        /* renamed from: r, reason: collision with root package name */
        InterfaceC1165b f3006r;

        /* renamed from: s, reason: collision with root package name */
        i f3007s;

        /* renamed from: t, reason: collision with root package name */
        n f3008t;

        /* renamed from: u, reason: collision with root package name */
        boolean f3009u;

        /* renamed from: v, reason: collision with root package name */
        boolean f3010v;

        /* renamed from: w, reason: collision with root package name */
        boolean f3011w;

        /* renamed from: x, reason: collision with root package name */
        int f3012x;

        /* renamed from: y, reason: collision with root package name */
        int f3013y;

        /* renamed from: z, reason: collision with root package name */
        int f3014z;

        /* renamed from: e, reason: collision with root package name */
        final List f2993e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        final List f2994f = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        m f2989a = new m();

        /* renamed from: c, reason: collision with root package name */
        List f2991c = u.f2959B;

        /* renamed from: d, reason: collision with root package name */
        List f2992d = u.f2960C;

        /* renamed from: g, reason: collision with root package name */
        o.c f2995g = o.k(o.f2927a);

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f2996h = ProxySelector.getDefault();

        /* renamed from: i, reason: collision with root package name */
        l f2997i = l.f2918a;

        /* renamed from: l, reason: collision with root package name */
        SocketFactory f3000l = SocketFactory.getDefault();

        /* renamed from: o, reason: collision with root package name */
        HostnameVerifier f3003o = O6.d.f7800a;

        /* renamed from: p, reason: collision with root package name */
        f f3004p = f.f2766c;

        public b() {
            InterfaceC1165b interfaceC1165b = InterfaceC1165b.f2708a;
            this.f3005q = interfaceC1165b;
            this.f3006r = interfaceC1165b;
            this.f3007s = new i();
            this.f3008t = n.f2926a;
            this.f3009u = true;
            this.f3010v = true;
            this.f3011w = true;
            this.f3012x = 10000;
            this.f3013y = 10000;
            this.f3014z = 10000;
            this.f2988A = 0;
        }

        public u a() {
            return new u(this);
        }

        public b b(C1166c c1166c) {
            this.f2998j = c1166c;
            this.f2999k = null;
            return this;
        }
    }

    static {
        G6.a.f3218a = new a();
    }

    u(b bVar) {
        boolean z8;
        this.f2962a = bVar.f2989a;
        this.f2963b = bVar.f2990b;
        this.f2964c = bVar.f2991c;
        List list = bVar.f2992d;
        this.f2965d = list;
        this.f2966e = G6.c.q(bVar.f2993e);
        this.f2967f = G6.c.q(bVar.f2994f);
        this.f2968g = bVar.f2995g;
        this.f2969h = bVar.f2996h;
        this.f2970i = bVar.f2997i;
        this.f2971j = bVar.f2998j;
        this.f2972k = bVar.f2999k;
        this.f2973l = bVar.f3000l;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z8 = z8 || ((j) it.next()).d();
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f3001m;
        if (sSLSocketFactory == null && z8) {
            X509TrustManager C8 = C();
            this.f2974m = B(C8);
            this.f2975n = O6.c.b(C8);
        } else {
            this.f2974m = sSLSocketFactory;
            this.f2975n = bVar.f3002n;
        }
        this.f2976o = bVar.f3003o;
        this.f2977p = bVar.f3004p.e(this.f2975n);
        this.f2978q = bVar.f3005q;
        this.f2979r = bVar.f3006r;
        this.f2980s = bVar.f3007s;
        this.f2981t = bVar.f3008t;
        this.f2982u = bVar.f3009u;
        this.f2983v = bVar.f3010v;
        this.f2984w = bVar.f3011w;
        this.f2985x = bVar.f3012x;
        this.f2986y = bVar.f3013y;
        this.f2987z = bVar.f3014z;
        this.f2961A = bVar.f2988A;
        if (!this.f2966e.contains(null)) {
            if (!this.f2967f.contains(null)) {
                return;
            }
            throw new IllegalStateException("Null network interceptor: " + this.f2967f);
        }
        throw new IllegalStateException("Null interceptor: " + this.f2966e);
    }

    private SSLSocketFactory B(X509TrustManager x509TrustManager) {
        try {
            SSLContext k8 = N6.f.i().k();
            k8.init(null, new TrustManager[]{x509TrustManager}, null);
            return k8.getSocketFactory();
        } catch (GeneralSecurityException e8) {
            throw G6.c.a("No System TLS", e8);
        }
    }

    private X509TrustManager C() {
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
            throw G6.c.a("No System TLS", e8);
        }
    }

    public SSLSocketFactory A() {
        return this.f2974m;
    }

    public int D() {
        return this.f2987z;
    }

    @Override // F6.e.a
    public e a(x xVar) {
        return w.d(this, xVar, false);
    }

    public InterfaceC1165b b() {
        return this.f2979r;
    }

    public C1166c c() {
        return this.f2971j;
    }

    public f d() {
        return this.f2977p;
    }

    public int e() {
        return this.f2985x;
    }

    public i f() {
        return this.f2980s;
    }

    public List g() {
        return this.f2965d;
    }

    public l h() {
        return this.f2970i;
    }

    public m i() {
        return this.f2962a;
    }

    public n j() {
        return this.f2981t;
    }

    public o.c k() {
        return this.f2968g;
    }

    public boolean l() {
        return this.f2983v;
    }

    public boolean m() {
        return this.f2982u;
    }

    public HostnameVerifier n() {
        return this.f2976o;
    }

    public List o() {
        return this.f2966e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H6.f p() {
        C1166c c1166c = this.f2971j;
        if (c1166c != null) {
            return c1166c.f2709a;
        }
        return this.f2972k;
    }

    public List q() {
        return this.f2967f;
    }

    public int r() {
        return this.f2961A;
    }

    public List s() {
        return this.f2964c;
    }

    public Proxy t() {
        return this.f2963b;
    }

    public InterfaceC1165b v() {
        return this.f2978q;
    }

    public ProxySelector w() {
        return this.f2969h;
    }

    public int x() {
        return this.f2986y;
    }

    public boolean y() {
        return this.f2984w;
    }

    public SocketFactory z() {
        return this.f2973l;
    }
}
