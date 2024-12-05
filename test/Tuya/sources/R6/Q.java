package R6;

/* loaded from: classes5.dex */
public class Q extends AbstractC1331b {
    public Q(InterfaceC1335d interfaceC1335d) {
        super(interfaceC1335d.d().l("DER"), 0);
    }

    static Q A(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b8 = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new Q(bArr2, b8);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static Q B(AbstractC1358z abstractC1358z, boolean z8) {
        AbstractC1351s x8 = abstractC1358z.x();
        if (!z8 && !(x8 instanceof Q)) {
            return A(AbstractC1348o.x(x8).y());
        }
        return C(x8);
    }

    public static Q C(Object obj) {
        if (obj != null && !(obj instanceof Q)) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                return new Q(n0Var.f8803a, n0Var.f8804b);
            }
            if (obj instanceof byte[]) {
                try {
                    return (Q) AbstractC1351s.s((byte[]) obj);
                } catch (Exception e8) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (Q) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        int i8;
        byte[] bArr = this.f8803a;
        int length = bArr.length;
        if (length != 0 && (i8 = this.f8804b) != 0) {
            int i9 = length - 1;
            byte b8 = bArr[i9];
            if (b8 != ((byte) ((255 << i8) & b8))) {
                c1350q.l(z8, 3, (byte) i8, bArr, 0, i9, (byte) (b8 & (255 << i8)));
                return;
            }
        }
        c1350q.k(z8, 3, (byte) this.f8804b, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8803a.length + 1) + 1 + this.f8803a.length + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }

    public Q(byte[] bArr) {
        this(bArr, 0);
    }

    public Q(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // R6.AbstractC1331b, R6.AbstractC1351s
    AbstractC1351s u() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s v() {
        return this;
    }
}
