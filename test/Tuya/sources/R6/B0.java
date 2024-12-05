package R6;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class B0 extends AbstractC1353u {

    /* renamed from: b, reason: collision with root package name */
    private byte[] f8764b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B0(byte[] bArr) {
        this.f8764b = bArr;
    }

    private void A() {
        if (this.f8764b != null) {
            C1337e c1337e = new C1337e();
            A0 a02 = new A0(this.f8764b);
            while (a02.hasMoreElements()) {
                c1337e.a((AbstractC1351s) a02.nextElement());
            }
            this.f8852a = c1337e.g();
            this.f8764b = null;
        }
    }

    @Override // R6.AbstractC1353u, R6.AbstractC1351s, R6.AbstractC1346m
    public synchronized int hashCode() {
        A();
        return super.hashCode();
    }

    @Override // R6.AbstractC1353u, java.lang.Iterable
    public synchronized Iterator iterator() {
        A();
        return super.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public synchronized void p(C1350q c1350q, boolean z8) {
        try {
            byte[] bArr = this.f8764b;
            if (bArr != null) {
                c1350q.n(z8, 48, bArr);
            } else {
                super.v().p(c1350q, z8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public synchronized int q() {
        byte[] bArr = this.f8764b;
        if (bArr != null) {
            return E0.a(bArr.length) + 1 + this.f8764b.length;
        }
        return super.v().q();
    }

    @Override // R6.AbstractC1353u
    public synchronized int size() {
        A();
        return super.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1353u, R6.AbstractC1351s
    public synchronized AbstractC1351s u() {
        A();
        return super.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1353u, R6.AbstractC1351s
    public synchronized AbstractC1351s v() {
        A();
        return super.v();
    }

    @Override // R6.AbstractC1353u
    public synchronized InterfaceC1335d x(int i8) {
        A();
        return super.x(i8);
    }

    @Override // R6.AbstractC1353u
    public synchronized Enumeration y() {
        byte[] bArr = this.f8764b;
        if (bArr != null) {
            return new A0(bArr);
        }
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1353u
    public InterfaceC1335d[] z() {
        A();
        return super.z();
    }
}
