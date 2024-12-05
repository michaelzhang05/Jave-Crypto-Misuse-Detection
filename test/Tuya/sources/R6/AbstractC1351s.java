package R6;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: R6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1351s extends AbstractC1346m {
    public static AbstractC1351s s(byte[] bArr) {
        C1343j c1343j = new C1343j(bArr);
        try {
            AbstractC1351s m8 = c1343j.m();
            if (c1343j.available() == 0) {
                return m8;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // R6.AbstractC1346m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC1335d) && m(((InterfaceC1335d) obj).d())) {
            return true;
        }
        return false;
    }

    @Override // R6.AbstractC1346m
    public void h(OutputStream outputStream) {
        C1350q.a(outputStream).t(this);
    }

    @Override // R6.AbstractC1346m
    public abstract int hashCode();

    @Override // R6.AbstractC1346m
    public void i(OutputStream outputStream, String str) {
        C1350q.b(outputStream, str).t(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m(AbstractC1351s abstractC1351s);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(C1350q c1350q, boolean z8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int q();

    public final boolean r(AbstractC1351s abstractC1351s) {
        if (this != abstractC1351s && !m(abstractC1351s)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean t();

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public final AbstractC1351s d() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1351s u() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1351s v() {
        return this;
    }
}
