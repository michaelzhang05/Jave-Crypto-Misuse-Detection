package U6;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class o0 extends AbstractC1450h {
    public o0(C1446e c1446e) {
        super(c1446e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1456n c1456n = this.f10447a;
        if (c1456n != null) {
            byteArrayOutputStream.write(c1456n.k("DL"));
        }
        C1453k c1453k = this.f10448b;
        if (c1453k != null) {
            byteArrayOutputStream.write(c1453k.k("DL"));
        }
        AbstractC1460s abstractC1460s = this.f10449c;
        if (abstractC1460s != null) {
            byteArrayOutputStream.write(abstractC1460s.k("DL"));
        }
        byteArrayOutputStream.write(new w0(true, this.f10450d, this.f10451e).k("DL"));
        c1459q.m(z8, 32, 8, byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return getEncoded().length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s t() {
        return this;
    }
}
