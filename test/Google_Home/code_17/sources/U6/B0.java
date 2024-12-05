package U6;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class B0 extends AbstractC1462u {

    /* renamed from: b, reason: collision with root package name */
    private byte[] f10390b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B0(byte[] bArr) {
        this.f10390b = bArr;
    }

    private void A() {
        if (this.f10390b != null) {
            C1446e c1446e = new C1446e();
            A0 a02 = new A0(this.f10390b);
            while (a02.hasMoreElements()) {
                c1446e.a((AbstractC1460s) a02.nextElement());
            }
            this.f10478a = c1446e.g();
            this.f10390b = null;
        }
    }

    @Override // U6.AbstractC1462u, U6.AbstractC1460s, U6.AbstractC1455m
    public synchronized int hashCode() {
        A();
        return super.hashCode();
    }

    @Override // U6.AbstractC1462u, java.lang.Iterable
    public synchronized Iterator iterator() {
        A();
        return super.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public synchronized void m(C1459q c1459q, boolean z8) {
        try {
            byte[] bArr = this.f10390b;
            if (bArr != null) {
                c1459q.n(z8, 48, bArr);
            } else {
                super.t().m(c1459q, z8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public synchronized int n() {
        byte[] bArr = this.f10390b;
        if (bArr != null) {
            return E0.a(bArr.length) + 1 + this.f10390b.length;
        }
        return super.t().n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1462u, U6.AbstractC1460s
    public synchronized AbstractC1460s r() {
        A();
        return super.r();
    }

    @Override // U6.AbstractC1462u
    public synchronized int size() {
        A();
        return super.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1462u, U6.AbstractC1460s
    public synchronized AbstractC1460s t() {
        A();
        return super.t();
    }

    @Override // U6.AbstractC1462u
    public synchronized InterfaceC1444d v(int i8) {
        A();
        return super.v(i8);
    }

    @Override // U6.AbstractC1462u
    public synchronized Enumeration y() {
        byte[] bArr = this.f10390b;
        if (bArr != null) {
            return new A0(bArr);
        }
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1462u
    public InterfaceC1444d[] z() {
        A();
        return super.z();
    }
}
