package M6;

import I6.B;
import I6.C1263a;
import I6.o;
import I6.r;
import I6.s;
import I6.u;
import I6.x;
import I6.y;
import I6.z;
import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    private final u f7233a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7234b;

    /* renamed from: c, reason: collision with root package name */
    private volatile L6.g f7235c;

    /* renamed from: d, reason: collision with root package name */
    private Object f7236d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f7237e;

    public j(u uVar, boolean z8) {
        this.f7233a = uVar;
        this.f7234b = z8;
    }

    private C1263a b(r rVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        I6.f fVar;
        if (rVar.l()) {
            sSLSocketFactory = this.f7233a.C();
            hostnameVerifier = this.f7233a.n();
            fVar = this.f7233a.d();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new C1263a(rVar.k(), rVar.w(), this.f7233a.j(), this.f7233a.B(), sSLSocketFactory, hostnameVerifier, fVar, this.f7233a.w(), this.f7233a.t(), this.f7233a.s(), this.f7233a.g(), this.f7233a.x());
    }

    private x c(z zVar, B b8) {
        String m8;
        r z8;
        Proxy t8;
        if (zVar != null) {
            int g8 = zVar.g();
            String g9 = zVar.E().g();
            y yVar = null;
            if (g8 != 307 && g8 != 308) {
                if (g8 != 401) {
                    if (g8 != 503) {
                        if (g8 != 407) {
                            if (g8 != 408) {
                                switch (g8) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.f7233a.A()) {
                                    return null;
                                }
                                zVar.E().a();
                                if ((zVar.y() != null && zVar.y().g() == 408) || f(zVar, 0) > 0) {
                                    return null;
                                }
                                return zVar.E();
                            }
                        } else {
                            if (b8 != null) {
                                t8 = b8.b();
                            } else {
                                t8 = this.f7233a.t();
                            }
                            if (t8.type() == Proxy.Type.HTTP) {
                                return this.f7233a.w().a(b8, zVar);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        if ((zVar.y() != null && zVar.y().g() == 503) || f(zVar, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return zVar.E();
                    }
                } else {
                    return this.f7233a.b().a(b8, zVar);
                }
            } else if (!g9.equals(ShareTarget.METHOD_GET) && !g9.equals("HEAD")) {
                return null;
            }
            if (!this.f7233a.l() || (m8 = zVar.m("Location")) == null || (z8 = zVar.E().i().z(m8)) == null) {
                return null;
            }
            if (!z8.A().equals(zVar.E().i().A()) && !this.f7233a.m()) {
                return null;
            }
            x.a h8 = zVar.E().h();
            if (f.b(g9)) {
                boolean d8 = f.d(g9);
                if (f.c(g9)) {
                    h8.e(ShareTarget.METHOD_GET, null);
                } else {
                    if (d8) {
                        yVar = zVar.E().a();
                    }
                    h8.e(g9, yVar);
                }
                if (!d8) {
                    h8.f("Transfer-Encoding");
                    h8.f("Content-Length");
                    h8.f("Content-Type");
                }
            }
            if (!g(zVar, z8)) {
                h8.f("Authorization");
            }
            return h8.g(z8).a();
        }
        throw new IllegalStateException();
    }

    private boolean d(IOException iOException, boolean z8) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z8) {
                return false;
            }
            return true;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private boolean e(IOException iOException, L6.g gVar, boolean z8, x xVar) {
        gVar.p(iOException);
        if (!this.f7233a.A()) {
            return false;
        }
        if (z8) {
            xVar.a();
        }
        if (!d(iOException, z8) || !gVar.g()) {
            return false;
        }
        return true;
    }

    private int f(z zVar, int i8) {
        String m8 = zVar.m("Retry-After");
        if (m8 == null) {
            return i8;
        }
        if (m8.matches("\\d+")) {
            return Integer.valueOf(m8).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean g(z zVar, r rVar) {
        r i8 = zVar.E().i();
        if (i8.k().equals(rVar.k()) && i8.w() == rVar.w() && i8.A().equals(rVar.A())) {
            return true;
        }
        return false;
    }

    @Override // I6.s
    public z a(s.a aVar) {
        z f8;
        x c8;
        x request = aVar.request();
        g gVar = (g) aVar;
        I6.e b8 = gVar.b();
        o d8 = gVar.d();
        L6.g gVar2 = new L6.g(this.f7233a.f(), b(request.i()), b8, d8, this.f7236d);
        this.f7235c = gVar2;
        z zVar = null;
        int i8 = 0;
        while (!this.f7237e) {
            try {
                try {
                    f8 = gVar.f(request, gVar2, null, null);
                    if (zVar != null) {
                        f8 = f8.x().l(zVar.x().b(null).c()).c();
                    }
                    c8 = c(f8, gVar2.n());
                } catch (L6.e e8) {
                    if (!e(e8.c(), gVar2, false, request)) {
                        throw e8.c();
                    }
                } catch (IOException e9) {
                    if (!e(e9, gVar2, !(e9 instanceof O6.a), request)) {
                        throw e9;
                    }
                }
                if (c8 == null) {
                    if (!this.f7234b) {
                        gVar2.j();
                    }
                    return f8;
                }
                J6.c.d(f8.a());
                int i9 = i8 + 1;
                if (i9 <= 20) {
                    c8.a();
                    if (!g(f8, c8.i())) {
                        gVar2.j();
                        gVar2 = new L6.g(this.f7233a.f(), b(c8.i()), b8, d8, this.f7236d);
                        this.f7235c = gVar2;
                    } else if (gVar2.b() != null) {
                        throw new IllegalStateException("Closing the body of " + f8 + " didn't close its backing stream. Bad interceptor?");
                    }
                    zVar = f8;
                    request = c8;
                    i8 = i9;
                } else {
                    gVar2.j();
                    throw new ProtocolException("Too many follow-up requests: " + i9);
                }
            } catch (Throwable th) {
                gVar2.p(null);
                gVar2.j();
                throw th;
            }
        }
        gVar2.j();
        throw new IOException("Canceled");
    }

    public void h(Object obj) {
        this.f7236d = obj;
    }
}
