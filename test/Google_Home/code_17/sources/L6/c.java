package L6;

import I6.B;
import I6.C1263a;
import I6.h;
import I6.i;
import I6.j;
import I6.o;
import I6.p;
import I6.r;
import I6.s;
import I6.u;
import I6.v;
import I6.x;
import I6.z;
import O6.g;
import S6.InterfaceC1418f;
import S6.InterfaceC1419g;
import S6.L;
import S6.Z;
import S6.a0;
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
    private final i f6283b;

    /* renamed from: c, reason: collision with root package name */
    private final B f6284c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f6285d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f6286e;

    /* renamed from: f, reason: collision with root package name */
    private p f6287f;

    /* renamed from: g, reason: collision with root package name */
    private v f6288g;

    /* renamed from: h, reason: collision with root package name */
    private O6.g f6289h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC1419g f6290i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC1418f f6291j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6292k;

    /* renamed from: l, reason: collision with root package name */
    public int f6293l;

    /* renamed from: m, reason: collision with root package name */
    public int f6294m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final List f6295n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f6296o = Long.MAX_VALUE;

    public c(i iVar, B b8) {
        this.f6283b = iVar;
        this.f6284c = b8;
    }

    private void d(int i8, int i9, I6.e eVar, o oVar) {
        Socket createSocket;
        Proxy b8 = this.f6284c.b();
        C1263a a8 = this.f6284c.a();
        if (b8.type() != Proxy.Type.DIRECT && b8.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(b8);
        } else {
            createSocket = a8.j().createSocket();
        }
        this.f6285d = createSocket;
        oVar.f(eVar, this.f6284c.d(), b8);
        this.f6285d.setSoTimeout(i9);
        try {
            Q6.f.i().g(this.f6285d, this.f6284c.d(), i8);
            try {
                this.f6290i = L.d(L.m(this.f6285d));
                this.f6291j = L.c(L.i(this.f6285d));
            } catch (NullPointerException e8) {
                if (!"throw with null exception".equals(e8.getMessage())) {
                } else {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f6284c.d());
            connectException.initCause(e9);
            throw connectException;
        }
    }

    private void e(b bVar) {
        SSLSocket sSLSocket;
        v vVar;
        C1263a a8 = this.f6284c.a();
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            try {
                sSLSocket = (SSLSocket) a8.k().createSocket(this.f6285d, a8.l().k(), a8.l().w(), true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (AssertionError e8) {
            e = e8;
        }
        try {
            j a9 = bVar.a(sSLSocket);
            if (a9.f()) {
                Q6.f.i().f(sSLSocket, a8.l().k(), a8.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if (n(session)) {
                p c8 = p.c(session);
                if (a8.e().verify(a8.l().k(), session)) {
                    a8.a().a(a8.l().k(), c8.e());
                    if (a9.f()) {
                        str = Q6.f.i().l(sSLSocket);
                    }
                    this.f6286e = sSLSocket;
                    this.f6290i = L.d(L.m(sSLSocket));
                    this.f6291j = L.c(L.i(this.f6286e));
                    this.f6287f = c8;
                    if (str != null) {
                        vVar = v.a(str);
                    } else {
                        vVar = v.HTTP_1_1;
                    }
                    this.f6288g = vVar;
                    Q6.f.i().a(sSLSocket);
                    return;
                }
                X509Certificate x509Certificate = (X509Certificate) c8.e().get(0);
                throw new SSLPeerUnverifiedException("Hostname " + a8.l().k() + " not verified:\n    certificate: " + I6.f.c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + R6.d.a(x509Certificate));
            }
            throw new IOException("a valid ssl session was not established");
        } catch (AssertionError e9) {
            e = e9;
            if (J6.c.w(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                Q6.f.i().a(sSLSocket2);
            }
            J6.c.e(sSLSocket2);
            throw th;
        }
    }

    private void f(int i8, int i9, int i10, I6.e eVar, o oVar) {
        x h8 = h();
        r i11 = h8.i();
        for (int i12 = 0; i12 < 21; i12++) {
            d(i8, i9, eVar, oVar);
            h8 = g(i9, i10, h8, i11);
            if (h8 != null) {
                J6.c.e(this.f6285d);
                this.f6285d = null;
                this.f6291j = null;
                this.f6290i = null;
                oVar.d(eVar, this.f6284c.d(), this.f6284c.b(), null);
            } else {
                return;
            }
        }
    }

    private x g(int i8, int i9, x xVar, r rVar) {
        String str = "CONNECT " + J6.c.p(rVar, true) + " HTTP/1.1";
        while (true) {
            N6.a aVar = new N6.a(null, null, this.f6290i, this.f6291j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f6290i.timeout().g(i8, timeUnit);
            this.f6291j.timeout().g(i9, timeUnit);
            aVar.l(xVar.d(), str);
            aVar.finishRequest();
            z c8 = aVar.readResponseHeaders(false).o(xVar).c();
            long b8 = M6.e.b(c8);
            if (b8 == -1) {
                b8 = 0;
            }
            Z h8 = aVar.h(b8);
            J6.c.y(h8, Integer.MAX_VALUE, timeUnit);
            h8.close();
            int g8 = c8.g();
            if (g8 != 200) {
                if (g8 == 407) {
                    x a8 = this.f6284c.a().h().a(this.f6284c, c8);
                    if (a8 != null) {
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.m("Connection"))) {
                            return a8;
                        }
                        xVar = a8;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c8.g());
                }
            } else {
                if (this.f6290i.buffer().exhausted() && this.f6291j.buffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private x h() {
        return new x.a().g(this.f6284c.a().l()).c("Host", J6.c.p(this.f6284c.a().l(), true)).c("Proxy-Connection", "Keep-Alive").c(Command.HTTP_HEADER_USER_AGENT, J6.d.a()).a();
    }

    private void i(b bVar, int i8, I6.e eVar, o oVar) {
        if (this.f6284c.a().k() == null) {
            this.f6288g = v.HTTP_1_1;
            this.f6286e = this.f6285d;
            return;
        }
        oVar.u(eVar);
        e(bVar);
        oVar.t(eVar, this.f6287f);
        if (this.f6288g == v.HTTP_2) {
            this.f6286e.setSoTimeout(0);
            O6.g a8 = new g.C0166g(true).d(this.f6286e, this.f6284c.a().l().k(), this.f6290i, this.f6291j).b(this).c(i8).a();
            this.f6289h = a8;
            a8.I();
        }
    }

    private boolean n(SSLSession sSLSession) {
        if (!"NONE".equals(sSLSession.getProtocol()) && !"SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite())) {
            return true;
        }
        return false;
    }

    @Override // O6.g.h
    public void a(O6.g gVar) {
        synchronized (this.f6283b) {
            this.f6294m = gVar.u();
        }
    }

    @Override // O6.g.h
    public void b(O6.i iVar) {
        iVar.d(O6.b.REFUSED_STREAM);
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
    public void c(int r17, int r18, int r19, int r20, boolean r21, I6.e r22, I6.o r23) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L6.c.c(int, int, int, int, boolean, I6.e, I6.o):void");
    }

    public p j() {
        return this.f6287f;
    }

    public boolean k(C1263a c1263a, B b8) {
        if (this.f6295n.size() >= this.f6294m || this.f6292k || !J6.a.f4937a.g(this.f6284c.a(), c1263a)) {
            return false;
        }
        if (c1263a.l().k().equals(p().a().l().k())) {
            return true;
        }
        if (this.f6289h == null || b8 == null) {
            return false;
        }
        Proxy.Type type = b8.b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f6284c.b().type() != type2 || !this.f6284c.d().equals(b8.d()) || b8.a().e() != R6.d.f9656a || !r(c1263a.l())) {
            return false;
        }
        try {
            c1263a.a().a(c1263a.l().k(), j().e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean l(boolean z8) {
        if (this.f6286e.isClosed() || this.f6286e.isInputShutdown() || this.f6286e.isOutputShutdown()) {
            return false;
        }
        if (this.f6289h != null) {
            return !r0.s();
        }
        if (z8) {
            try {
                int soTimeout = this.f6286e.getSoTimeout();
                try {
                    this.f6286e.setSoTimeout(1);
                    if (this.f6290i.exhausted()) {
                        return false;
                    }
                    return true;
                } finally {
                    this.f6286e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean m() {
        if (this.f6289h != null) {
            return true;
        }
        return false;
    }

    public M6.c o(u uVar, s.a aVar, g gVar) {
        if (this.f6289h != null) {
            return new O6.f(uVar, aVar, gVar, this.f6289h);
        }
        this.f6286e.setSoTimeout(aVar.readTimeoutMillis());
        a0 timeout = this.f6290i.timeout();
        long readTimeoutMillis = aVar.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(readTimeoutMillis, timeUnit);
        this.f6291j.timeout().g(aVar.writeTimeoutMillis(), timeUnit);
        return new N6.a(uVar, gVar, this.f6290i, this.f6291j);
    }

    public B p() {
        return this.f6284c;
    }

    public Socket q() {
        return this.f6286e;
    }

    public boolean r(r rVar) {
        if (rVar.w() != this.f6284c.a().l().w()) {
            return false;
        }
        if (rVar.k().equals(this.f6284c.a().l().k())) {
            return true;
        }
        if (this.f6287f == null || !R6.d.f9656a.c(rVar.k(), (X509Certificate) this.f6287f.e().get(0))) {
            return false;
        }
        return true;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f6284c.a().l().k());
        sb.append(":");
        sb.append(this.f6284c.a().l().w());
        sb.append(", proxy=");
        sb.append(this.f6284c.b());
        sb.append(" hostAddress=");
        sb.append(this.f6284c.d());
        sb.append(" cipherSuite=");
        p pVar = this.f6287f;
        if (pVar != null) {
            obj = pVar.a();
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f6288g);
        sb.append('}');
        return sb.toString();
    }
}
