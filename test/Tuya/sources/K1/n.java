package K1;

import java.text.ParseException;

/* loaded from: classes4.dex */
public class n extends g {

    /* renamed from: c, reason: collision with root package name */
    private m f5814c;

    /* renamed from: d, reason: collision with root package name */
    private Z1.c f5815d;

    /* renamed from: e, reason: collision with root package name */
    private Z1.c f5816e;

    /* renamed from: f, reason: collision with root package name */
    private Z1.c f5817f;

    /* renamed from: g, reason: collision with root package name */
    private Z1.c f5818g;

    /* renamed from: h, reason: collision with root package name */
    private a f5819h;

    /* loaded from: classes4.dex */
    public enum a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public n(m mVar, w wVar) {
        if (mVar != null) {
            this.f5814c = mVar;
            if (wVar != null) {
                d(wVar);
                this.f5815d = null;
                this.f5817f = null;
                this.f5819h = a.UNENCRYPTED;
                return;
            }
            throw new IllegalArgumentException("The payload must not be null");
        }
        throw new IllegalArgumentException("The JWE header must not be null");
    }

    private void h() {
        a aVar = this.f5819h;
        if (aVar != a.ENCRYPTED && aVar != a.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void j() {
        if (this.f5819h == a.ENCRYPTED) {
        } else {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void k(l lVar) {
        if (lVar.f().contains(p().t())) {
            if (lVar.c().contains(p().v())) {
                return;
            }
            throw new f("The " + p().v() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + lVar.c());
        }
        throw new f("The " + p().t() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + lVar.f());
    }

    private void l() {
        if (this.f5819h == a.UNENCRYPTED) {
        } else {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public static n r(String str) {
        Z1.c[] e8 = g.e(str);
        if (e8.length == 5) {
            return new n(e8[0], e8[1], e8[2], e8[3], e8[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public synchronized void f(k kVar) {
        j();
        try {
            d(new w(kVar.a(p(), o(), q(), n(), m())));
            this.f5819h = a.DECRYPTED;
        } catch (f e8) {
            throw e8;
        } catch (Exception e9) {
            throw new f(e9.getMessage(), e9);
        }
    }

    public synchronized void g(l lVar) {
        try {
            l();
            k(lVar);
            try {
                try {
                    j b8 = lVar.b(p(), b().d());
                    if (b8.d() != null) {
                        this.f5814c = b8.d();
                    }
                    this.f5815d = b8.c();
                    this.f5816e = b8.e();
                    this.f5817f = b8.b();
                    this.f5818g = b8.a();
                    this.f5819h = a.ENCRYPTED;
                } catch (Exception e8) {
                    throw new f(e8.getMessage(), e8);
                }
            } catch (f e9) {
                throw e9;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Z1.c m() {
        return this.f5818g;
    }

    public Z1.c n() {
        return this.f5817f;
    }

    public Z1.c o() {
        return this.f5815d;
    }

    public m p() {
        return this.f5814c;
    }

    public Z1.c q() {
        return this.f5816e;
    }

    public String t() {
        h();
        StringBuilder sb = new StringBuilder(this.f5814c.h().toString());
        sb.append('.');
        Z1.c cVar = this.f5815d;
        if (cVar != null) {
            sb.append(cVar);
        }
        sb.append('.');
        Z1.c cVar2 = this.f5816e;
        if (cVar2 != null) {
            sb.append(cVar2);
        }
        sb.append('.');
        sb.append(this.f5817f);
        sb.append('.');
        Z1.c cVar3 = this.f5818g;
        if (cVar3 != null) {
            sb.append(cVar3);
        }
        return sb.toString();
    }

    public n(Z1.c cVar, Z1.c cVar2, Z1.c cVar3, Z1.c cVar4, Z1.c cVar5) {
        if (cVar != null) {
            try {
                this.f5814c = m.x(cVar);
                if (cVar2 != null && !cVar2.toString().isEmpty()) {
                    this.f5815d = cVar2;
                } else {
                    this.f5815d = null;
                }
                if (cVar3 != null && !cVar3.toString().isEmpty()) {
                    this.f5816e = cVar3;
                } else {
                    this.f5816e = null;
                }
                if (cVar4 != null) {
                    this.f5817f = cVar4;
                    if (cVar5 != null && !cVar5.toString().isEmpty()) {
                        this.f5818g = cVar5;
                    } else {
                        this.f5818g = null;
                    }
                    this.f5819h = a.ENCRYPTED;
                    c(cVar, cVar2, cVar3, cVar4, cVar5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e8) {
                throw new ParseException("Invalid JWE header: " + e8.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
