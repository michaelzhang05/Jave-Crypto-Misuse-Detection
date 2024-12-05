package F6;

import F6.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: F6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1164a {

    /* renamed from: a, reason: collision with root package name */
    final r f2697a;

    /* renamed from: b, reason: collision with root package name */
    final n f2698b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f2699c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1165b f2700d;

    /* renamed from: e, reason: collision with root package name */
    final List f2701e;

    /* renamed from: f, reason: collision with root package name */
    final List f2702f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f2703g;

    /* renamed from: h, reason: collision with root package name */
    final Proxy f2704h;

    /* renamed from: i, reason: collision with root package name */
    final SSLSocketFactory f2705i;

    /* renamed from: j, reason: collision with root package name */
    final HostnameVerifier f2706j;

    /* renamed from: k, reason: collision with root package name */
    final f f2707k;

    public C1164a(String str, int i8, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, InterfaceC1165b interfaceC1165b, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        this.f2697a = new r.a().p(sSLSocketFactory != null ? "https" : "http").e(str).k(i8).a();
        if (nVar != null) {
            this.f2698b = nVar;
            if (socketFactory != null) {
                this.f2699c = socketFactory;
                if (interfaceC1165b != null) {
                    this.f2700d = interfaceC1165b;
                    if (list != null) {
                        this.f2701e = G6.c.q(list);
                        if (list2 != null) {
                            this.f2702f = G6.c.q(list2);
                            if (proxySelector != null) {
                                this.f2703g = proxySelector;
                                this.f2704h = proxy;
                                this.f2705i = sSLSocketFactory;
                                this.f2706j = hostnameVerifier;
                                this.f2707k = fVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public f a() {
        return this.f2707k;
    }

    public List b() {
        return this.f2702f;
    }

    public n c() {
        return this.f2698b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(C1164a c1164a) {
        if (this.f2698b.equals(c1164a.f2698b) && this.f2700d.equals(c1164a.f2700d) && this.f2701e.equals(c1164a.f2701e) && this.f2702f.equals(c1164a.f2702f) && this.f2703g.equals(c1164a.f2703g) && G6.c.n(this.f2704h, c1164a.f2704h) && G6.c.n(this.f2705i, c1164a.f2705i) && G6.c.n(this.f2706j, c1164a.f2706j) && G6.c.n(this.f2707k, c1164a.f2707k) && l().w() == c1164a.l().w()) {
            return true;
        }
        return false;
    }

    public HostnameVerifier e() {
        return this.f2706j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1164a) {
            C1164a c1164a = (C1164a) obj;
            if (this.f2697a.equals(c1164a.f2697a) && d(c1164a)) {
                return true;
            }
        }
        return false;
    }

    public List f() {
        return this.f2701e;
    }

    public Proxy g() {
        return this.f2704h;
    }

    public InterfaceC1165b h() {
        return this.f2700d;
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int hashCode = (((((((((((527 + this.f2697a.hashCode()) * 31) + this.f2698b.hashCode()) * 31) + this.f2700d.hashCode()) * 31) + this.f2701e.hashCode()) * 31) + this.f2702f.hashCode()) * 31) + this.f2703g.hashCode()) * 31;
        Proxy proxy = this.f2704h;
        int i11 = 0;
        if (proxy != null) {
            i8 = proxy.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (hashCode + i8) * 31;
        SSLSocketFactory sSLSocketFactory = this.f2705i;
        if (sSLSocketFactory != null) {
            i9 = sSLSocketFactory.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i12 + i9) * 31;
        HostnameVerifier hostnameVerifier = this.f2706j;
        if (hostnameVerifier != null) {
            i10 = hostnameVerifier.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        f fVar = this.f2707k;
        if (fVar != null) {
            i11 = fVar.hashCode();
        }
        return i14 + i11;
    }

    public ProxySelector i() {
        return this.f2703g;
    }

    public SocketFactory j() {
        return this.f2699c;
    }

    public SSLSocketFactory k() {
        return this.f2705i;
    }

    public r l() {
        return this.f2697a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f2697a.k());
        sb.append(":");
        sb.append(this.f2697a.w());
        if (this.f2704h != null) {
            sb.append(", proxy=");
            sb.append(this.f2704h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f2703g);
        }
        sb.append("}");
        return sb.toString();
    }
}
