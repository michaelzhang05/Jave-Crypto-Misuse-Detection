package I6;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private static final g[] f4433e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f4434f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f4435g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f4436h;

    /* renamed from: a, reason: collision with root package name */
    final boolean f4437a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f4438b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f4439c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f4440d;

    static {
        g[] gVarArr = {g.f4361Z0, g.f4372d1, g.f4363a1, g.f4375e1, g.f4393k1, g.f4390j1, g.f4331K0, g.f4333L0, g.f4386i0, g.f4389j0, g.f4322G, g.f4330K, g.f4391k};
        f4433e = gVarArr;
        a b8 = new a(true).b(gVarArr);
        C c8 = C.TLS_1_0;
        j a8 = b8.e(C.TLS_1_3, C.TLS_1_2, C.TLS_1_1, c8).d(true).a();
        f4434f = a8;
        f4435g = new a(a8).e(c8).d(true).a();
        f4436h = new a(false).a();
    }

    j(a aVar) {
        this.f4437a = aVar.f4441a;
        this.f4439c = aVar.f4442b;
        this.f4440d = aVar.f4443c;
        this.f4438b = aVar.f4444d;
    }

    private j e(SSLSocket sSLSocket, boolean z8) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f4439c != null) {
            enabledCipherSuites = J6.c.v(g.f4364b, sSLSocket.getEnabledCipherSuites(), this.f4439c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f4440d != null) {
            enabledProtocols = J6.c.v(J6.c.f4955q, sSLSocket.getEnabledProtocols(), this.f4440d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int s8 = J6.c.s(g.f4364b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z8 && s8 != -1) {
            enabledCipherSuites = J6.c.f(enabledCipherSuites, supportedCipherSuites[s8]);
        }
        return new a(this).c(enabledCipherSuites).f(enabledProtocols).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z8) {
        j e8 = e(sSLSocket, z8);
        String[] strArr = e8.f4440d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e8.f4439c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List b() {
        String[] strArr = this.f4439c;
        if (strArr != null) {
            return g.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f4437a) {
            return false;
        }
        String[] strArr = this.f4440d;
        if (strArr != null && !J6.c.x(J6.c.f4955q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f4439c;
        if (strArr2 != null && !J6.c.x(g.f4364b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return false;
        }
        return true;
    }

    public boolean d() {
        return this.f4437a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z8 = this.f4437a;
        if (z8 != jVar.f4437a) {
            return false;
        }
        if (z8 && (!Arrays.equals(this.f4439c, jVar.f4439c) || !Arrays.equals(this.f4440d, jVar.f4440d) || this.f4438b != jVar.f4438b)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f4438b;
    }

    public List g() {
        String[] strArr = this.f4440d;
        if (strArr != null) {
            return C.b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f4437a) {
            return ((((527 + Arrays.hashCode(this.f4439c)) * 31) + Arrays.hashCode(this.f4440d)) * 31) + (!this.f4438b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f4437a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        if (this.f4439c == null) {
            str = "[all enabled]";
        } else {
            str = b().toString();
        }
        if (this.f4440d != null) {
            str2 = g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f4438b + ")";
    }

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f4441a;

        /* renamed from: b, reason: collision with root package name */
        String[] f4442b;

        /* renamed from: c, reason: collision with root package name */
        String[] f4443c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4444d;

        a(boolean z8) {
            this.f4441a = z8;
        }

        public j a() {
            return new j(this);
        }

        public a b(g... gVarArr) {
            if (this.f4441a) {
                String[] strArr = new String[gVarArr.length];
                for (int i8 = 0; i8 < gVarArr.length; i8++) {
                    strArr[i8] = gVarArr[i8].f4424a;
                }
                return c(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(String... strArr) {
            if (this.f4441a) {
                if (strArr.length != 0) {
                    this.f4442b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z8) {
            if (this.f4441a) {
                this.f4444d = z8;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(C... cArr) {
            if (this.f4441a) {
                String[] strArr = new String[cArr.length];
                for (int i8 = 0; i8 < cArr.length; i8++) {
                    strArr[i8] = cArr[i8].f4236a;
                }
                return f(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a f(String... strArr) {
            if (this.f4441a) {
                if (strArr.length != 0) {
                    this.f4443c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(j jVar) {
            this.f4441a = jVar.f4437a;
            this.f4442b = jVar.f4439c;
            this.f4443c = jVar.f4440d;
            this.f4444d = jVar.f4438b;
        }
    }
}
