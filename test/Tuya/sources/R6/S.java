package R6;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class S extends AbstractC1341h {
    public S(C1347n c1347n, C1344k c1344k, AbstractC1351s abstractC1351s, int i8, AbstractC1351s abstractC1351s2) {
        super(c1347n, c1344k, abstractC1351s, i8, abstractC1351s2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1347n c1347n = this.f8821a;
        if (c1347n != null) {
            byteArrayOutputStream.write(c1347n.l("DER"));
        }
        C1344k c1344k = this.f8822b;
        if (c1344k != null) {
            byteArrayOutputStream.write(c1344k.l("DER"));
        }
        AbstractC1351s abstractC1351s = this.f8823c;
        if (abstractC1351s != null) {
            byteArrayOutputStream.write(abstractC1351s.l("DER"));
        }
        byteArrayOutputStream.write(new h0(true, this.f8824d, this.f8825e).l("DER"));
        c1350q.m(z8, 32, 8, byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return getEncoded().length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1341h, R6.AbstractC1351s
    public AbstractC1351s u() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s v() {
        return this;
    }
}
