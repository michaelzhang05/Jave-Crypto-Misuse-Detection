package W6;

import R6.AbstractC1331b;
import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.AbstractC1355w;
import R6.AbstractC1358z;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;
import R6.InterfaceC1335d;
import R6.Q;
import R6.h0;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class b extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private C1344k f12161a;

    /* renamed from: b, reason: collision with root package name */
    private X6.a f12162b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC1348o f12163c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC1355w f12164d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1331b f12165e;

    private b(AbstractC1353u abstractC1353u) {
        Enumeration y8 = abstractC1353u.y();
        C1344k x8 = C1344k.x(y8.nextElement());
        this.f12161a = x8;
        int s8 = s(x8);
        this.f12162b = X6.a.p(y8.nextElement());
        this.f12163c = AbstractC1348o.x(y8.nextElement());
        int i8 = -1;
        while (y8.hasMoreElements()) {
            AbstractC1358z abstractC1358z = (AbstractC1358z) y8.nextElement();
            int y9 = abstractC1358z.y();
            if (y9 <= i8) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (y9 == 0) {
                this.f12164d = AbstractC1355w.x(abstractC1358z, false);
            } else {
                if (y9 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (s8 < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f12165e = Q.B(abstractC1358z, false);
            }
            i8 = y9;
        }
    }

    public static b p(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(AbstractC1353u.w(obj));
        }
        return null;
    }

    private static int s(C1344k c1344k) {
        int B8 = c1344k.B();
        if (B8 >= 0 && B8 <= 1) {
            return B8;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e(5);
        c1337e.a(this.f12161a);
        c1337e.a(this.f12162b);
        c1337e.a(this.f12163c);
        AbstractC1355w abstractC1355w = this.f12164d;
        if (abstractC1355w != null) {
            c1337e.a(new h0(false, 0, abstractC1355w));
        }
        AbstractC1331b abstractC1331b = this.f12165e;
        if (abstractC1331b != null) {
            c1337e.a(new h0(false, 1, abstractC1331b));
        }
        return new C1338e0(c1337e);
    }

    public AbstractC1355w m() {
        return this.f12164d;
    }

    public X6.a q() {
        return this.f12162b;
    }

    public AbstractC1331b r() {
        return this.f12165e;
    }

    public InterfaceC1335d t() {
        return AbstractC1351s.s(this.f12163c.y());
    }

    public b(X6.a aVar, InterfaceC1335d interfaceC1335d) {
        this(aVar, interfaceC1335d, null, null);
    }

    public b(X6.a aVar, InterfaceC1335d interfaceC1335d, AbstractC1355w abstractC1355w) {
        this(aVar, interfaceC1335d, abstractC1355w, null);
    }

    public b(X6.a aVar, InterfaceC1335d interfaceC1335d, AbstractC1355w abstractC1355w, byte[] bArr) {
        this.f12161a = new C1344k(bArr != null ? E7.b.f2390b : E7.b.f2389a);
        this.f12162b = aVar;
        this.f12163c = new C1330a0(interfaceC1335d);
        this.f12164d = abstractC1355w;
        this.f12165e = bArr == null ? null : new Q(bArr);
    }
}
