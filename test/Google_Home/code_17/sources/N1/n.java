package N1;

import java.text.ParseException;

/* loaded from: classes4.dex */
public class n extends g {

    /* renamed from: c, reason: collision with root package name */
    private m f7593c;

    /* renamed from: d, reason: collision with root package name */
    private c2.c f7594d;

    /* renamed from: e, reason: collision with root package name */
    private c2.c f7595e;

    /* renamed from: f, reason: collision with root package name */
    private c2.c f7596f;

    /* renamed from: g, reason: collision with root package name */
    private c2.c f7597g;

    /* renamed from: h, reason: collision with root package name */
    private a f7598h;

    /* loaded from: classes4.dex */
    public enum a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public n(m mVar, w wVar) {
        if (mVar != null) {
            this.f7593c = mVar;
            if (wVar != null) {
                d(wVar);
                this.f7594d = null;
                this.f7596f = null;
                this.f7598h = a.UNENCRYPTED;
                return;
            }
            throw new IllegalArgumentException("The payload must not be null");
        }
        throw new IllegalArgumentException("The JWE header must not be null");
    }

    private void h() {
        a aVar = this.f7598h;
        if (aVar != a.ENCRYPTED && aVar != a.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void i() {
        if (this.f7598h == a.ENCRYPTED) {
        } else {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void j(l lVar) {
        if (lVar.e().contains(q().t())) {
            if (lVar.a().contains(q().v())) {
                return;
            }
            throw new f("The " + q().v() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + lVar.a());
        }
        throw new f("The " + q().t() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + lVar.e());
    }

    private void k() {
        if (this.f7598h == a.UNENCRYPTED) {
        } else {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public static n s(String str) {
        c2.c[] e8 = g.e(str);
        if (e8.length == 5) {
            return new n(e8[0], e8[1], e8[2], e8[3], e8[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public synchronized void f(k kVar) {
        i();
        try {
            d(new w(kVar.f(q(), o(), r(), n(), m())));
            this.f7598h = a.DECRYPTED;
        } catch (f e8) {
            throw e8;
        } catch (Exception e9) {
            throw new f(e9.getMessage(), e9);
        }
    }

    public synchronized void g(l lVar) {
        try {
            k();
            j(lVar);
            try {
                try {
                    j c8 = lVar.c(q(), b().d());
                    if (c8.d() != null) {
                        this.f7593c = c8.d();
                    }
                    this.f7594d = c8.c();
                    this.f7595e = c8.e();
                    this.f7596f = c8.b();
                    this.f7597g = c8.a();
                    this.f7598h = a.ENCRYPTED;
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

    public c2.c m() {
        return this.f7597g;
    }

    public c2.c n() {
        return this.f7596f;
    }

    public c2.c o() {
        return this.f7594d;
    }

    public m q() {
        return this.f7593c;
    }

    public c2.c r() {
        return this.f7595e;
    }

    public String t() {
        h();
        StringBuilder sb = new StringBuilder(this.f7593c.h().toString());
        sb.append('.');
        c2.c cVar = this.f7594d;
        if (cVar != null) {
            sb.append(cVar);
        }
        sb.append('.');
        c2.c cVar2 = this.f7595e;
        if (cVar2 != null) {
            sb.append(cVar2);
        }
        sb.append('.');
        sb.append(this.f7596f);
        sb.append('.');
        c2.c cVar3 = this.f7597g;
        if (cVar3 != null) {
            sb.append(cVar3);
        }
        return sb.toString();
    }

    public n(c2.c cVar, c2.c cVar2, c2.c cVar3, c2.c cVar4, c2.c cVar5) {
        if (cVar != null) {
            try {
                this.f7593c = m.x(cVar);
                if (cVar2 != null && !cVar2.toString().isEmpty()) {
                    this.f7594d = cVar2;
                } else {
                    this.f7594d = null;
                }
                if (cVar3 != null && !cVar3.toString().isEmpty()) {
                    this.f7595e = cVar3;
                } else {
                    this.f7595e = null;
                }
                if (cVar4 != null) {
                    this.f7596f = cVar4;
                    if (cVar5 != null && !cVar5.toString().isEmpty()) {
                        this.f7597g = cVar5;
                    } else {
                        this.f7597g = null;
                    }
                    this.f7598h = a.ENCRYPTED;
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
