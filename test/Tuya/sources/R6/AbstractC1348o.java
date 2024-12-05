package R6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: R6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1348o extends AbstractC1351s implements InterfaceC1349p {

    /* renamed from: a, reason: collision with root package name */
    byte[] f8842a;

    public AbstractC1348o(byte[] bArr) {
        if (bArr != null) {
            this.f8842a = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    public static AbstractC1348o w(AbstractC1358z abstractC1358z, boolean z8) {
        if (z8) {
            if (abstractC1358z.z()) {
                return x(abstractC1358z.x());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC1351s x8 = abstractC1358z.x();
        if (abstractC1358z.z()) {
            AbstractC1348o x9 = x(x8);
            if (abstractC1358z instanceof M) {
                return new E(new AbstractC1348o[]{x9});
            }
            return (AbstractC1348o) new E(new AbstractC1348o[]{x9}).v();
        }
        if (x8 instanceof AbstractC1348o) {
            AbstractC1348o abstractC1348o = (AbstractC1348o) x8;
            if (abstractC1358z instanceof M) {
                return abstractC1348o;
            }
            return (AbstractC1348o) abstractC1348o.v();
        }
        if (x8 instanceof AbstractC1353u) {
            AbstractC1353u abstractC1353u = (AbstractC1353u) x8;
            if (abstractC1358z instanceof M) {
                return E.B(abstractC1353u);
            }
            return (AbstractC1348o) E.B(abstractC1353u).v();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC1358z.getClass().getName());
    }

    public static AbstractC1348o x(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1348o)) {
            if (obj instanceof byte[]) {
                try {
                    return x(AbstractC1351s.s((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1335d) {
                AbstractC1351s d8 = ((InterfaceC1335d) obj).d();
                if (d8 instanceof AbstractC1348o) {
                    return (AbstractC1348o) d8;
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1348o) obj;
    }

    @Override // R6.InterfaceC1349p
    public InputStream a() {
        return new ByteArrayInputStream(this.f8842a);
    }

    @Override // R6.y0
    public AbstractC1351s g() {
        return d();
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(y());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof AbstractC1348o)) {
            return false;
        }
        return E7.a.a(this.f8842a, ((AbstractC1348o) abstractC1351s).f8842a);
    }

    public String toString() {
        return "#" + E7.h.b(F7.b.a(this.f8842a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s u() {
        return new C1330a0(this.f8842a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s v() {
        return new C1330a0(this.f8842a);
    }

    public byte[] y() {
        return this.f8842a;
    }
}
