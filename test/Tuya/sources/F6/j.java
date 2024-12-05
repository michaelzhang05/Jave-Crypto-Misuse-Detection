package F6;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private static final g[] f2893e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f2894f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f2895g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f2896h;

    /* renamed from: a, reason: collision with root package name */
    final boolean f2897a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f2898b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f2899c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f2900d;

    static {
        g[] gVarArr = {g.f2821Z0, g.f2832d1, g.f2823a1, g.f2835e1, g.f2853k1, g.f2850j1, g.f2791K0, g.f2793L0, g.f2846i0, g.f2849j0, g.f2782G, g.f2790K, g.f2851k};
        f2893e = gVarArr;
        a b8 = new a(true).b(gVarArr);
        C c8 = C.TLS_1_0;
        j a8 = b8.e(C.TLS_1_3, C.TLS_1_2, C.TLS_1_1, c8).d(true).a();
        f2894f = a8;
        f2895g = new a(a8).e(c8).d(true).a();
        f2896h = new a(false).a();
    }

    j(a aVar) {
        this.f2897a = aVar.f2901a;
        this.f2899c = aVar.f2902b;
        this.f2900d = aVar.f2903c;
        this.f2898b = aVar.f2904d;
    }

    private j e(SSLSocket sSLSocket, boolean z8) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f2899c != null) {
            enabledCipherSuites = G6.c.v(g.f2824b, sSLSocket.getEnabledCipherSuites(), this.f2899c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f2900d != null) {
            enabledProtocols = G6.c.v(G6.c.f3236q, sSLSocket.getEnabledProtocols(), this.f2900d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int s8 = G6.c.s(g.f2824b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z8 && s8 != -1) {
            enabledCipherSuites = G6.c.f(enabledCipherSuites, supportedCipherSuites[s8]);
        }
        return new a(this).c(enabledCipherSuites).f(enabledProtocols).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z8) {
        j e8 = e(sSLSocket, z8);
        String[] strArr = e8.f2900d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e8.f2899c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List b() {
        String[] strArr = this.f2899c;
        if (strArr != null) {
            return g.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f2897a) {
            return false;
        }
        String[] strArr = this.f2900d;
        if (strArr != null && !G6.c.x(G6.c.f3236q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f2899c;
        if (strArr2 != null && !G6.c.x(g.f2824b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return false;
        }
        return true;
    }

    public boolean d() {
        return this.f2897a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z8 = this.f2897a;
        if (z8 != jVar.f2897a) {
            return false;
        }
        if (z8 && (!Arrays.equals(this.f2899c, jVar.f2899c) || !Arrays.equals(this.f2900d, jVar.f2900d) || this.f2898b != jVar.f2898b)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f2898b;
    }

    public List g() {
        String[] strArr = this.f2900d;
        if (strArr != null) {
            return C.b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f2897a) {
            return ((((527 + Arrays.hashCode(this.f2899c)) * 31) + Arrays.hashCode(this.f2900d)) * 31) + (!this.f2898b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f2897a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        if (this.f2899c == null) {
            str = "[all enabled]";
        } else {
            str = b().toString();
        }
        if (this.f2900d != null) {
            str2 = g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f2898b + ")";
    }

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f2901a;

        /* renamed from: b, reason: collision with root package name */
        String[] f2902b;

        /* renamed from: c, reason: collision with root package name */
        String[] f2903c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2904d;

        a(boolean z8) {
            this.f2901a = z8;
        }

        public j a() {
            return new j(this);
        }

        public a b(g... gVarArr) {
            if (this.f2901a) {
                String[] strArr = new String[gVarArr.length];
                for (int i8 = 0; i8 < gVarArr.length; i8++) {
                    strArr[i8] = gVarArr[i8].f2884a;
                }
                return c(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(String... strArr) {
            if (this.f2901a) {
                if (strArr.length != 0) {
                    this.f2902b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z8) {
            if (this.f2901a) {
                this.f2904d = z8;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(C... cArr) {
            if (this.f2901a) {
                String[] strArr = new String[cArr.length];
                for (int i8 = 0; i8 < cArr.length; i8++) {
                    strArr[i8] = cArr[i8].f2696a;
                }
                return f(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a f(String... strArr) {
            if (this.f2901a) {
                if (strArr.length != 0) {
                    this.f2903c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(j jVar) {
            this.f2901a = jVar.f2897a;
            this.f2902b = jVar.f2899c;
            this.f2903c = jVar.f2900d;
            this.f2904d = jVar.f2898b;
        }
    }
}
