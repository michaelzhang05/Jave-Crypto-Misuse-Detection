package I6;

import F6.B;
import F6.C1164a;
import F6.h;
import F6.i;
import F6.j;
import F6.o;
import F6.p;
import F6.r;
import F6.s;
import F6.u;
import F6.v;
import F6.x;
import F6.z;
import L6.g;
import P6.InterfaceC1280f;
import P6.InterfaceC1281g;
import P6.L;
import P6.Z;
import P6.a0;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class c extends g.h implements h {

    /* renamed from: b, reason: collision with root package name */
    private final i f4288b;

    /* renamed from: c, reason: collision with root package name */
    private final B f4289c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f4290d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f4291e;

    /* renamed from: f, reason: collision with root package name */
    private p f4292f;

    /* renamed from: g, reason: collision with root package name */
    private v f4293g;

    /* renamed from: h, reason: collision with root package name */
    private L6.g f4294h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC1281g f4295i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC1280f f4296j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4297k;

    /* renamed from: l, reason: collision with root package name */
    public int f4298l;

    /* renamed from: m, reason: collision with root package name */
    public int f4299m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final List f4300n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f4301o = Long.MAX_VALUE;

    public c(i iVar, B b8) {
        this.f4288b = iVar;
        this.f4289c = b8;
    }

    private void d(int i8, int i9, F6.e eVar, o oVar) {
        Socket createSocket;
        Proxy b8 = this.f4289c.b();
        C1164a a8 = this.f4289c.a();
        if (b8.type() != Proxy.Type.DIRECT && b8.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(b8);
        } else {
            createSocket = a8.j().createSocket();
        }
        this.f4290d = createSocket;
        oVar.f(eVar, this.f4289c.d(), b8);
        this.f4290d.setSoTimeout(i9);
        try {
            N6.f.i().g(this.f4290d, this.f4289c.d(), i8);
            try {
                this.f4295i = L.d(L.m(this.f4290d));
                this.f4296j = L.c(L.i(this.f4290d));
            } catch (NullPointerException e8) {
                if (!"throw with null exception".equals(e8.getMessage())) {
                } else {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f4289c.d());
            connectException.initCause(e9);
            throw connectException;
        }
    }

    private void e(b bVar) {
        SSLSocket sSLSocket;
        v vVar;
        C1164a a8 = this.f4289c.a();
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            try {
                sSLSocket = (SSLSocket) a8.k().createSocket(this.f4290d, a8.l().k(), a8.l().w(), true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (AssertionError e8) {
            e = e8;
        }
        try {
            j a9 = bVar.a(sSLSocket);
            if (a9.f()) {
                N6.f.i().f(sSLSocket, a8.l().k(), a8.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if (n(session)) {
                p c8 = p.c(session);
                if (a8.e().verify(a8.l().k(), session)) {
                    a8.a().a(a8.l().k(), c8.e());
                    if (a9.f()) {
                        str = N6.f.i().l(sSLSocket);
                    }
                    this.f4291e = sSLSocket;
                    this.f4295i = L.d(L.m(sSLSocket));
                    this.f4296j = L.c(L.i(this.f4291e));
                    this.f4292f = c8;
                    if (str != null) {
                        vVar = v.a(str);
                    } else {
                        vVar = v.HTTP_1_1;
                    }
                    this.f4293g = vVar;
                    N6.f.i().a(sSLSocket);
                    return;
                }
                X509Certificate x509Certificate = (X509Certificate) c8.e().get(0);
                throw new SSLPeerUnverifiedException("Hostname " + a8.l().k() + " not verified:\n    certificate: " + F6.f.c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + O6.d.a(x509Certificate));
            }
            throw new IOException("a valid ssl session was not established");
        } catch (AssertionError e9) {
            e = e9;
            if (G6.c.w(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                N6.f.i().a(sSLSocket2);
            }
            G6.c.e(sSLSocket2);
            throw th;
        }
    }

    private void f(int i8, int i9, int i10, F6.e eVar, o oVar) {
        x h8 = h();
        r i11 = h8.i();
        for (int i12 = 0; i12 < 21; i12++) {
            d(i8, i9, eVar, oVar);
            h8 = g(i9, i10, h8, i11);
            if (h8 != null) {
                G6.c.e(this.f4290d);
                this.f4290d = null;
                this.f4296j = null;
                this.f4295i = null;
                oVar.d(eVar, this.f4289c.d(), this.f4289c.b(), null);
            } else {
                return;
            }
        }
    }

    private x g(int i8, int i9, x xVar, r rVar) {
        String str = "CONNECT " + G6.c.p(rVar, true) + " HTTP/1.1";
        while (true) {
            K6.a aVar = new K6.a(null, null, this.f4295i, this.f4296j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f4295i.timeout().g(i8, timeUnit);
            this.f4296j.timeout().g(i9, timeUnit);
            aVar.l(xVar.d(), str);
            aVar.finishRequest();
            z c8 = aVar.readResponseHeaders(false).o(xVar).c();
            long b8 = J6.e.b(c8);
            if (b8 == -1) {
                b8 = 0;
            }
            Z h8 = aVar.h(b8);
            G6.c.y(h8, Integer.MAX_VALUE, timeUnit);
            h8.close();
            int f8 = c8.f();
            if (f8 != 200) {
                if (f8 == 407) {
                    x a8 = this.f4289c.a().h().a(this.f4289c, c8);
                    if (a8 != null) {
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.h("Connection"))) {
                            return a8;
                        }
                        xVar = a8;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c8.f());
                }
            } else {
                if (this.f4295i.buffer().exhausted() && this.f4296j.buffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private x h() {
        return new x.a().g(this.f4289c.a().l()).c("Host", G6.c.p(this.f4289c.a().l(), true)).c("Proxy-Connection", "Keep-Alive").c(Command.HTTP_HEADER_USER_AGENT, G6.d.a()).a();
    }

    private void i(b bVar, int i8, F6.e eVar, o oVar) {
        if (this.f4289c.a().k() == null) {
            this.f4293g = v.HTTP_1_1;
            this.f4291e = this.f4290d;
            return;
        }
        oVar.u(eVar);
        e(bVar);
        oVar.t(eVar, this.f4292f);
        if (this.f4293g == v.HTTP_2) {
            this.f4291e.setSoTimeout(0);
            L6.g a8 = new g.C0138g(true).d(this.f4291e, this.f4289c.a().l().k(), this.f4295i, this.f4296j).b(this).c(i8).a();
            this.f4294h = a8;
            a8.I();
        }
    }

    private boolean n(SSLSession sSLSession) {
        if (!"NONE".equals(sSLSession.getProtocol()) && !"SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite())) {
            return true;
        }
        return false;
    }

    @Override // L6.g.h
    public void a(L6.g gVar) {
        synchronized (this.f4288b) {
            this.f4299m = gVar.r();
        }
    }

    @Override // L6.g.h
    public void b(L6.i iVar) {
        iVar.d(L6.b.REFUSED_STREAM);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r17, int r18, int r19, int r20, boolean r21, F6.e r22, F6.o r23) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.c.c(int, int, int, int, boolean, F6.e, F6.o):void");
    }

    public p j() {
        return this.f4292f;
    }

    public boolean k(C1164a c1164a, B b8) {
        if (this.f4300n.size() >= this.f4299m || this.f4297k || !G6.a.f3218a.g(this.f4289c.a(), c1164a)) {
            return false;
        }
        if (c1164a.l().k().equals(p().a().l().k())) {
            return true;
        }
        if (this.f4294h == null || b8 == null) {
            return false;
        }
        Proxy.Type type = b8.b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f4289c.b().type() != type2 || !this.f4289c.d().equals(b8.d()) || b8.a().e() != O6.d.f7800a || !r(c1164a.l())) {
            return false;
        }
        try {
            c1164a.a().a(c1164a.l().k(), j().e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean l(boolean z8) {
        if (this.f4291e.isClosed() || this.f4291e.isInputShutdown() || this.f4291e.isOutputShutdown()) {
            return false;
        }
        if (this.f4294h != null) {
            return !r0.o();
        }
        if (z8) {
            try {
                int soTimeout = this.f4291e.getSoTimeout();
                try {
                    this.f4291e.setSoTimeout(1);
                    if (this.f4295i.exhausted()) {
                        return false;
                    }
                    return true;
                } finally {
                    this.f4291e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean m() {
        if (this.f4294h != null) {
            return true;
        }
        return false;
    }

    public J6.c o(u uVar, s.a aVar, g gVar) {
        if (this.f4294h != null) {
            return new L6.f(uVar, aVar, gVar, this.f4294h);
        }
        this.f4291e.setSoTimeout(aVar.readTimeoutMillis());
        a0 timeout = this.f4295i.timeout();
        long readTimeoutMillis = aVar.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(readTimeoutMillis, timeUnit);
        this.f4296j.timeout().g(aVar.writeTimeoutMillis(), timeUnit);
        return new K6.a(uVar, gVar, this.f4295i, this.f4296j);
    }

    public B p() {
        return this.f4289c;
    }

    public Socket q() {
        return this.f4291e;
    }

    public boolean r(r rVar) {
        if (rVar.w() != this.f4289c.a().l().w()) {
            return false;
        }
        if (rVar.k().equals(this.f4289c.a().l().k())) {
            return true;
        }
        if (this.f4292f == null || !O6.d.f7800a.c(rVar.k(), (X509Certificate) this.f4292f.e().get(0))) {
            return false;
        }
        return true;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f4289c.a().l().k());
        sb.append(":");
        sb.append(this.f4289c.a().l().w());
        sb.append(", proxy=");
        sb.append(this.f4289c.b());
        sb.append(" hostAddress=");
        sb.append(this.f4289c.d());
        sb.append(" cipherSuite=");
        p pVar = this.f4292f;
        if (pVar != null) {
            obj = pVar.a();
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f4293g);
        sb.append('}');
        return sb.toString();
    }
}
