package U6;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class S extends AbstractC1450h {
    public S(C1456n c1456n, C1453k c1453k, AbstractC1460s abstractC1460s, int i8, AbstractC1460s abstractC1460s2) {
        super(c1456n, c1453k, abstractC1460s, i8, abstractC1460s2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1456n c1456n = this.f10447a;
        if (c1456n != null) {
            byteArrayOutputStream.write(c1456n.k("DER"));
        }
        C1453k c1453k = this.f10448b;
        if (c1453k != null) {
            byteArrayOutputStream.write(c1453k.k("DER"));
        }
        AbstractC1460s abstractC1460s = this.f10449c;
        if (abstractC1460s != null) {
            byteArrayOutputStream.write(abstractC1460s.k("DER"));
        }
        byteArrayOutputStream.write(new h0(true, this.f10450d, this.f10451e).k("DER"));
        c1459q.m(z8, 32, 8, byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return getEncoded().length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1450h, U6.AbstractC1460s
    public AbstractC1460s r() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s t() {
        return this;
    }
}
