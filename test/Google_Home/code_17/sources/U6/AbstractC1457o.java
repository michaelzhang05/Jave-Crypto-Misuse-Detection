package U6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: U6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1457o extends AbstractC1460s implements InterfaceC1458p {

    /* renamed from: a, reason: collision with root package name */
    byte[] f10468a;

    public AbstractC1457o(byte[] bArr) {
        if (bArr != null) {
            this.f10468a = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    public static AbstractC1457o u(AbstractC1467z abstractC1467z, boolean z8) {
        if (z8) {
            if (abstractC1467z.z()) {
                return v(abstractC1467z.v());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC1460s v8 = abstractC1467z.v();
        if (abstractC1467z.z()) {
            AbstractC1457o v9 = v(v8);
            if (abstractC1467z instanceof M) {
                return new E(new AbstractC1457o[]{v9});
            }
            return (AbstractC1457o) new E(new AbstractC1457o[]{v9}).t();
        }
        if (v8 instanceof AbstractC1457o) {
            AbstractC1457o abstractC1457o = (AbstractC1457o) v8;
            if (abstractC1467z instanceof M) {
                return abstractC1457o;
            }
            return (AbstractC1457o) abstractC1457o.t();
        }
        if (v8 instanceof AbstractC1462u) {
            AbstractC1462u abstractC1462u = (AbstractC1462u) v8;
            if (abstractC1467z instanceof M) {
                return E.B(abstractC1462u);
            }
            return (AbstractC1457o) E.B(abstractC1462u).t();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC1467z.getClass().getName());
    }

    public static AbstractC1457o v(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1457o)) {
            if (obj instanceof byte[]) {
                try {
                    return v(AbstractC1460s.p((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1444d) {
                AbstractC1460s d8 = ((InterfaceC1444d) obj).d();
                if (d8 instanceof AbstractC1457o) {
                    return (AbstractC1457o) d8;
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1457o) obj;
    }

    @Override // U6.InterfaceC1458p
    public InputStream c() {
        return new ByteArrayInputStream(this.f10468a);
    }

    @Override // U6.y0
    public AbstractC1460s e() {
        return d();
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        return H7.a.k(y());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof AbstractC1457o)) {
            return false;
        }
        return H7.a.a(this.f10468a, ((AbstractC1457o) abstractC1460s).f10468a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s r() {
        return new C1439a0(this.f10468a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s t() {
        return new C1439a0(this.f10468a);
    }

    public String toString() {
        return "#" + H7.h.b(I7.b.a(this.f10468a));
    }

    public byte[] y() {
        return this.f10468a;
    }
}
