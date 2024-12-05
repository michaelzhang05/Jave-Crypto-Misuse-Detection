package R6;

/* loaded from: classes5.dex */
public class V extends C1342i {
    public V(byte[] bArr) {
        super(bArr);
    }

    private byte[] A() {
        byte[] bArr = this.f8826a;
        if (bArr[bArr.length - 1] == 90) {
            if (!x()) {
                byte[] bArr2 = this.f8826a;
                byte[] bArr3 = new byte[bArr2.length + 4];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
                System.arraycopy(E7.h.d("0000Z"), 0, bArr3, this.f8826a.length - 1, 5);
                return bArr3;
            }
            if (!y()) {
                byte[] bArr4 = this.f8826a;
                byte[] bArr5 = new byte[bArr4.length + 2];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
                System.arraycopy(E7.h.d("00Z"), 0, bArr5, this.f8826a.length - 1, 3);
                return bArr5;
            }
            if (w()) {
                int length = this.f8826a.length - 2;
                while (length > 0 && this.f8826a[length] == 48) {
                    length--;
                }
                byte[] bArr6 = this.f8826a;
                if (bArr6[length] == 46) {
                    byte[] bArr7 = new byte[length + 1];
                    System.arraycopy(bArr6, 0, bArr7, 0, length);
                    bArr7[length] = 90;
                    return bArr7;
                }
                byte[] bArr8 = new byte[length + 2];
                int i8 = length + 1;
                System.arraycopy(bArr6, 0, bArr8, 0, i8);
                bArr8[i8] = 90;
                return bArr8;
            }
            return this.f8826a;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.C1342i, R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 24, A());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.C1342i, R6.AbstractC1351s
    public int q() {
        int length = A().length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.C1342i, R6.AbstractC1351s
    public AbstractC1351s u() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.C1342i, R6.AbstractC1351s
    public AbstractC1351s v() {
        return this;
    }
}
