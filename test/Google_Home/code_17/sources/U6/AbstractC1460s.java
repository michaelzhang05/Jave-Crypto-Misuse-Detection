package U6;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: U6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1460s extends AbstractC1455m {
    public static AbstractC1460s p(byte[] bArr) {
        C1452j c1452j = new C1452j(bArr);
        try {
            AbstractC1460s o8 = c1452j.o();
            if (c1452j.available() == 0) {
                return o8;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // U6.AbstractC1455m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC1444d) && l(((InterfaceC1444d) obj).d())) {
            return true;
        }
        return false;
    }

    @Override // U6.AbstractC1455m
    public void f(OutputStream outputStream) {
        C1459q.a(outputStream).t(this);
    }

    @Override // U6.AbstractC1455m
    public abstract int hashCode();

    @Override // U6.AbstractC1455m
    public void j(OutputStream outputStream, String str) {
        C1459q.b(outputStream, str).t(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean l(AbstractC1460s abstractC1460s);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void m(C1459q c1459q, boolean z8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int n();

    public final boolean o(AbstractC1460s abstractC1460s) {
        if (this != abstractC1460s && !l(abstractC1460s)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q();

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public final AbstractC1460s d() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1460s r() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1460s t() {
        return this;
    }
}
