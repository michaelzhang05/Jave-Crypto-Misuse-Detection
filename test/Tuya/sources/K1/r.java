package K1;

import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class r extends g {

    /* renamed from: c, reason: collision with root package name */
    private final q f5854c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5855d;

    /* renamed from: e, reason: collision with root package name */
    private Z1.c f5856e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f5857f;

    /* loaded from: classes4.dex */
    public enum a {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public r(Z1.c cVar, Z1.c cVar2, Z1.c cVar3) {
        this(cVar, new w(cVar2), cVar3);
    }

    private String f() {
        if (this.f5854c.v()) {
            return h().h().toString() + '.' + b().c().toString();
        }
        return h().h().toString() + '.' + b().toString();
    }

    private void g() {
        if (this.f5857f.get() != a.SIGNED && this.f5857f.get() != a.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    public static r l(String str) {
        Z1.c[] e8 = g.e(str);
        if (e8.length == 3) {
            return new r(e8[0], e8[1], e8[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    public q h() {
        return this.f5854c;
    }

    public Z1.c j() {
        return this.f5856e;
    }

    public byte[] k() {
        return this.f5855d.getBytes(Z1.m.f13247a);
    }

    public String m() {
        return n(false);
    }

    public String n(boolean z8) {
        g();
        if (z8) {
            return this.f5854c.h().toString() + ".." + this.f5856e.toString();
        }
        return this.f5855d + '.' + this.f5856e.toString();
    }

    public synchronized boolean o(s sVar) {
        boolean d8;
        g();
        try {
            d8 = sVar.d(h(), k(), j());
            if (d8) {
                this.f5857f.set(a.VERIFIED);
            }
        } catch (f e8) {
            throw e8;
        } catch (Exception e9) {
            throw new f(e9.getMessage(), e9);
        }
        return d8;
    }

    public r(Z1.c cVar, w wVar, Z1.c cVar2) {
        AtomicReference atomicReference = new AtomicReference();
        this.f5857f = atomicReference;
        if (cVar != null) {
            try {
                this.f5854c = q.w(cVar);
                if (wVar != null) {
                    d(wVar);
                    this.f5855d = f();
                    if (cVar2 != null) {
                        this.f5856e = cVar2;
                        atomicReference.set(a.SIGNED);
                        if (h().v()) {
                            c(cVar, wVar.c(), cVar2);
                            return;
                        } else {
                            c(cVar, new Z1.c(""), cVar2);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("The third part must not be null");
                }
                throw new IllegalArgumentException("The payload (second part) must not be null");
            } catch (ParseException e8) {
                throw new ParseException("Invalid JWS header: " + e8.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
