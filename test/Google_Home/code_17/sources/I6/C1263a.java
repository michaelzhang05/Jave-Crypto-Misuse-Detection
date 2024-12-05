package I6;

import I6.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: I6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1263a {

    /* renamed from: a, reason: collision with root package name */
    final r f4237a;

    /* renamed from: b, reason: collision with root package name */
    final n f4238b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f4239c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1264b f4240d;

    /* renamed from: e, reason: collision with root package name */
    final List f4241e;

    /* renamed from: f, reason: collision with root package name */
    final List f4242f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f4243g;

    /* renamed from: h, reason: collision with root package name */
    final Proxy f4244h;

    /* renamed from: i, reason: collision with root package name */
    final SSLSocketFactory f4245i;

    /* renamed from: j, reason: collision with root package name */
    final HostnameVerifier f4246j;

    /* renamed from: k, reason: collision with root package name */
    final f f4247k;

    public C1263a(String str, int i8, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, InterfaceC1264b interfaceC1264b, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        r.a aVar = new r.a();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        this.f4237a = aVar.p(str2).e(str).k(i8).a();
        if (nVar != null) {
            this.f4238b = nVar;
            if (socketFactory != null) {
                this.f4239c = socketFactory;
                if (interfaceC1264b != null) {
                    this.f4240d = interfaceC1264b;
                    if (list != null) {
                        this.f4241e = J6.c.q(list);
                        if (list2 != null) {
                            this.f4242f = J6.c.q(list2);
                            if (proxySelector != null) {
                                this.f4243g = proxySelector;
                                this.f4244h = proxy;
                                this.f4245i = sSLSocketFactory;
                                this.f4246j = hostnameVerifier;
                                this.f4247k = fVar;
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
        return this.f4247k;
    }

    public List b() {
        return this.f4242f;
    }

    public n c() {
        return this.f4238b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(C1263a c1263a) {
        if (this.f4238b.equals(c1263a.f4238b) && this.f4240d.equals(c1263a.f4240d) && this.f4241e.equals(c1263a.f4241e) && this.f4242f.equals(c1263a.f4242f) && this.f4243g.equals(c1263a.f4243g) && J6.c.n(this.f4244h, c1263a.f4244h) && J6.c.n(this.f4245i, c1263a.f4245i) && J6.c.n(this.f4246j, c1263a.f4246j) && J6.c.n(this.f4247k, c1263a.f4247k) && l().w() == c1263a.l().w()) {
            return true;
        }
        return false;
    }

    public HostnameVerifier e() {
        return this.f4246j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1263a) {
            C1263a c1263a = (C1263a) obj;
            if (this.f4237a.equals(c1263a.f4237a) && d(c1263a)) {
                return true;
            }
        }
        return false;
    }

    public List f() {
        return this.f4241e;
    }

    public Proxy g() {
        return this.f4244h;
    }

    public InterfaceC1264b h() {
        return this.f4240d;
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int hashCode = (((((((((((527 + this.f4237a.hashCode()) * 31) + this.f4238b.hashCode()) * 31) + this.f4240d.hashCode()) * 31) + this.f4241e.hashCode()) * 31) + this.f4242f.hashCode()) * 31) + this.f4243g.hashCode()) * 31;
        Proxy proxy = this.f4244h;
        int i11 = 0;
        if (proxy != null) {
            i8 = proxy.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (hashCode + i8) * 31;
        SSLSocketFactory sSLSocketFactory = this.f4245i;
        if (sSLSocketFactory != null) {
            i9 = sSLSocketFactory.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i12 + i9) * 31;
        HostnameVerifier hostnameVerifier = this.f4246j;
        if (hostnameVerifier != null) {
            i10 = hostnameVerifier.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        f fVar = this.f4247k;
        if (fVar != null) {
            i11 = fVar.hashCode();
        }
        return i14 + i11;
    }

    public ProxySelector i() {
        return this.f4243g;
    }

    public SocketFactory j() {
        return this.f4239c;
    }

    public SSLSocketFactory k() {
        return this.f4245i;
    }

    public r l() {
        return this.f4237a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f4237a.k());
        sb.append(":");
        sb.append(this.f4237a.w());
        if (this.f4244h != null) {
            sb.append(", proxy=");
            sb.append(this.f4244h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f4243g);
        }
        sb.append("}");
        return sb.toString();
    }
}
