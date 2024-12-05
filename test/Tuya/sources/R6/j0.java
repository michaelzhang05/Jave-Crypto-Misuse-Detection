package R6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class j0 extends AbstractC1351s {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f8831b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8832a;

    public j0(byte[] bArr) {
        this.f8832a = E7.a.d(bArr);
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8832a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof j0)) {
            return false;
        }
        return E7.a.a(this.f8832a, ((j0) abstractC1351s).f8832a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 28, this.f8832a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8832a.length) + 1 + this.f8832a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }

    public String toString() {
        return w();
    }

    public String w() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i8 = 0; i8 != encoded.length; i8++) {
                char[] cArr = f8831b;
                stringBuffer.append(cArr[(encoded[i8] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i8] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new r("internal error encoding UniversalString");
        }
    }
}
