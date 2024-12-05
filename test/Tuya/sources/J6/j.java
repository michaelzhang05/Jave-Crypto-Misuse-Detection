package J6;

import F6.B;
import F6.C1164a;
import F6.o;
import F6.r;
import F6.s;
import F6.u;
import F6.x;
import F6.y;
import F6.z;
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
    private final u f5527a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5528b;

    /* renamed from: c, reason: collision with root package name */
    private volatile I6.g f5529c;

    /* renamed from: d, reason: collision with root package name */
    private Object f5530d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f5531e;

    public j(u uVar, boolean z8) {
        this.f5527a = uVar;
        this.f5528b = z8;
    }

    private C1164a b(r rVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        F6.f fVar;
        if (rVar.l()) {
            sSLSocketFactory = this.f5527a.A();
            hostnameVerifier = this.f5527a.n();
            fVar = this.f5527a.d();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new C1164a(rVar.k(), rVar.w(), this.f5527a.j(), this.f5527a.z(), sSLSocketFactory, hostnameVerifier, fVar, this.f5527a.v(), this.f5527a.t(), this.f5527a.s(), this.f5527a.g(), this.f5527a.w());
    }

    private x c(z zVar, B b8) {
        String h8;
        r z8;
        Proxy t8;
        if (zVar != null) {
            int f8 = zVar.f();
            String g8 = zVar.E().g();
            y yVar = null;
            if (f8 != 307 && f8 != 308) {
                if (f8 != 401) {
                    if (f8 != 503) {
                        if (f8 != 407) {
                            if (f8 != 408) {
                                switch (f8) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.f5527a.y()) {
                                    return null;
                                }
                                zVar.E().a();
                                if ((zVar.w() != null && zVar.w().f() == 408) || f(zVar, 0) > 0) {
                                    return null;
                                }
                                return zVar.E();
                            }
                        } else {
                            if (b8 != null) {
                                t8 = b8.b();
                            } else {
                                t8 = this.f5527a.t();
                            }
                            if (t8.type() == Proxy.Type.HTTP) {
                                return this.f5527a.v().a(b8, zVar);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        if ((zVar.w() != null && zVar.w().f() == 503) || f(zVar, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return zVar.E();
                    }
                } else {
                    return this.f5527a.b().a(b8, zVar);
                }
            } else if (!g8.equals(ShareTarget.METHOD_GET) && !g8.equals("HEAD")) {
                return null;
            }
            if (!this.f5527a.l() || (h8 = zVar.h("Location")) == null || (z8 = zVar.E().i().z(h8)) == null) {
                return null;
            }
            if (!z8.A().equals(zVar.E().i().A()) && !this.f5527a.m()) {
                return null;
            }
            x.a h9 = zVar.E().h();
            if (f.b(g8)) {
                boolean d8 = f.d(g8);
                if (f.c(g8)) {
                    h9.e(ShareTarget.METHOD_GET, null);
                } else {
                    if (d8) {
                        yVar = zVar.E().a();
                    }
                    h9.e(g8, yVar);
                }
                if (!d8) {
                    h9.f("Transfer-Encoding");
                    h9.f("Content-Length");
                    h9.f("Content-Type");
                }
            }
            if (!g(zVar, z8)) {
                h9.f("Authorization");
            }
            return h9.g(z8).a();
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

    private boolean e(IOException iOException, I6.g gVar, boolean z8, x xVar) {
        gVar.p(iOException);
        if (!this.f5527a.y()) {
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
        String h8 = zVar.h("Retry-After");
        if (h8 == null) {
            return i8;
        }
        if (h8.matches("\\d+")) {
            return Integer.valueOf(h8).intValue();
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

    @Override // F6.s
    public z a(s.a aVar) {
        z f8;
        x c8;
        x request = aVar.request();
        g gVar = (g) aVar;
        F6.e b8 = gVar.b();
        o d8 = gVar.d();
        I6.g gVar2 = new I6.g(this.f5527a.f(), b(request.i()), b8, d8, this.f5530d);
        this.f5529c = gVar2;
        z zVar = null;
        int i8 = 0;
        while (!this.f5531e) {
            try {
                try {
                    f8 = gVar.f(request, gVar2, null, null);
                    if (zVar != null) {
                        f8 = f8.u().l(zVar.u().b(null).c()).c();
                    }
                    c8 = c(f8, gVar2.n());
                } catch (I6.e e8) {
                    if (!e(e8.c(), gVar2, false, request)) {
                        throw e8.c();
                    }
                } catch (IOException e9) {
                    if (!e(e9, gVar2, !(e9 instanceof L6.a), request)) {
                        throw e9;
                    }
                }
                if (c8 == null) {
                    if (!this.f5528b) {
                        gVar2.j();
                    }
                    return f8;
                }
                G6.c.d(f8.a());
                int i9 = i8 + 1;
                if (i9 <= 20) {
                    c8.a();
                    if (!g(f8, c8.i())) {
                        gVar2.j();
                        gVar2 = new I6.g(this.f5527a.f(), b(c8.i()), b8, d8, this.f5530d);
                        this.f5529c = gVar2;
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
        this.f5530d = obj;
    }
}
