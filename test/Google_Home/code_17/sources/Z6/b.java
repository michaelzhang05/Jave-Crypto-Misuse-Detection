package Z6;

import U6.AbstractC1440b;
import U6.AbstractC1455m;
import U6.AbstractC1457o;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.AbstractC1464w;
import U6.AbstractC1467z;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;
import U6.InterfaceC1444d;
import U6.Q;
import U6.h0;
import a7.C1677a;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class b extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private C1453k f13799a;

    /* renamed from: b, reason: collision with root package name */
    private C1677a f13800b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC1457o f13801c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC1464w f13802d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1440b f13803e;

    private b(AbstractC1462u abstractC1462u) {
        Enumeration y8 = abstractC1462u.y();
        C1453k v8 = C1453k.v(y8.nextElement());
        this.f13799a = v8;
        int p8 = p(v8);
        this.f13800b = C1677a.m(y8.nextElement());
        this.f13801c = AbstractC1457o.v(y8.nextElement());
        int i8 = -1;
        while (y8.hasMoreElements()) {
            AbstractC1467z abstractC1467z = (AbstractC1467z) y8.nextElement();
            int y9 = abstractC1467z.y();
            if (y9 <= i8) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (y9 == 0) {
                this.f13802d = AbstractC1464w.v(abstractC1467z, false);
            } else {
                if (y9 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (p8 < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f13803e = Q.B(abstractC1467z, false);
            }
            i8 = y9;
        }
    }

    public static b m(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(AbstractC1462u.u(obj));
        }
        return null;
    }

    private static int p(C1453k c1453k) {
        int B8 = c1453k.B();
        if (B8 >= 0 && B8 <= 1) {
            return B8;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e(5);
        c1446e.a(this.f13799a);
        c1446e.a(this.f13800b);
        c1446e.a(this.f13801c);
        AbstractC1464w abstractC1464w = this.f13802d;
        if (abstractC1464w != null) {
            c1446e.a(new h0(false, 0, abstractC1464w));
        }
        AbstractC1440b abstractC1440b = this.f13803e;
        if (abstractC1440b != null) {
            c1446e.a(new h0(false, 1, abstractC1440b));
        }
        return new C1447e0(c1446e);
    }

    public AbstractC1464w l() {
        return this.f13802d;
    }

    public C1677a n() {
        return this.f13800b;
    }

    public AbstractC1440b o() {
        return this.f13803e;
    }

    public InterfaceC1444d q() {
        return AbstractC1460s.p(this.f13801c.y());
    }

    public b(C1677a c1677a, InterfaceC1444d interfaceC1444d) {
        this(c1677a, interfaceC1444d, null, null);
    }

    public b(C1677a c1677a, InterfaceC1444d interfaceC1444d, AbstractC1464w abstractC1464w) {
        this(c1677a, interfaceC1444d, abstractC1464w, null);
    }

    public b(C1677a c1677a, InterfaceC1444d interfaceC1444d, AbstractC1464w abstractC1464w, byte[] bArr) {
        this.f13799a = new C1453k(bArr != null ? H7.b.f3940b : H7.b.f3939a);
        this.f13800b = c1677a;
        this.f13801c = new C1439a0(interfaceC1444d);
        this.f13802d = abstractC1464w;
        this.f13803e = bArr == null ? null : new Q(bArr);
    }
}
