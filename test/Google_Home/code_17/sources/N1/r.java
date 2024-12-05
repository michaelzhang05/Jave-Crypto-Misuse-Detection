package N1;

import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class r extends g {

    /* renamed from: c, reason: collision with root package name */
    private final q f7633c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7634d;

    /* renamed from: e, reason: collision with root package name */
    private c2.c f7635e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f7636f;

    /* loaded from: classes4.dex */
    public enum a {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public r(c2.c cVar, c2.c cVar2, c2.c cVar3) {
        this(cVar, new w(cVar2), cVar3);
    }

    private String f() {
        if (this.f7633c.v()) {
            return h().h().toString() + '.' + b().c().toString();
        }
        return h().h().toString() + '.' + b().toString();
    }

    private void g() {
        if (this.f7636f.get() != a.SIGNED && this.f7636f.get() != a.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    public static r k(String str) {
        c2.c[] e8 = g.e(str);
        if (e8.length == 3) {
            return new r(e8[0], e8[1], e8[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    public q h() {
        return this.f7633c;
    }

    public c2.c i() {
        return this.f7635e;
    }

    public byte[] j() {
        return this.f7634d.getBytes(c2.m.f15571a);
    }

    public String m() {
        return n(false);
    }

    public String n(boolean z8) {
        g();
        if (z8) {
            return this.f7633c.h().toString() + ".." + this.f7635e.toString();
        }
        return this.f7634d + '.' + this.f7635e.toString();
    }

    public synchronized boolean o(s sVar) {
        boolean b8;
        g();
        try {
            b8 = sVar.b(h(), j(), i());
            if (b8) {
                this.f7636f.set(a.VERIFIED);
            }
        } catch (f e8) {
            throw e8;
        } catch (Exception e9) {
            throw new f(e9.getMessage(), e9);
        }
        return b8;
    }

    public r(c2.c cVar, w wVar, c2.c cVar2) {
        AtomicReference atomicReference = new AtomicReference();
        this.f7636f = atomicReference;
        if (cVar != null) {
            try {
                this.f7633c = q.w(cVar);
                if (wVar != null) {
                    d(wVar);
                    this.f7634d = f();
                    if (cVar2 != null) {
                        this.f7635e = cVar2;
                        atomicReference.set(a.SIGNED);
                        if (h().v()) {
                            c(cVar, wVar.c(), cVar2);
                            return;
                        } else {
                            c(cVar, new c2.c(""), cVar2);
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
