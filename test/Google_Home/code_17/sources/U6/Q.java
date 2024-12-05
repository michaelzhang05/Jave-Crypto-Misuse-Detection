package U6;

/* loaded from: classes5.dex */
public class Q extends AbstractC1440b {
    public Q(InterfaceC1444d interfaceC1444d) {
        super(interfaceC1444d.d().k("DER"), 0);
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

    public static Q B(AbstractC1467z abstractC1467z, boolean z8) {
        AbstractC1460s v8 = abstractC1467z.v();
        if (!z8 && !(v8 instanceof Q)) {
            return A(AbstractC1457o.v(v8).y());
        }
        return C(v8);
    }

    public static Q C(Object obj) {
        if (obj != null && !(obj instanceof Q)) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                return new Q(n0Var.f10429a, n0Var.f10430b);
            }
            if (obj instanceof byte[]) {
                try {
                    return (Q) AbstractC1460s.p((byte[]) obj);
                } catch (Exception e8) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (Q) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        int i8;
        byte[] bArr = this.f10429a;
        int length = bArr.length;
        if (length != 0 && (i8 = this.f10430b) != 0) {
            int i9 = length - 1;
            byte b8 = bArr[i9];
            if (b8 != ((byte) ((255 << i8) & b8))) {
                c1459q.l(z8, 3, (byte) i8, bArr, 0, i9, (byte) (b8 & (255 << i8)));
                return;
            }
        }
        c1459q.k(z8, 3, (byte) this.f10430b, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return E0.a(this.f10429a.length + 1) + 1 + this.f10429a.length + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return false;
    }

    public Q(byte[] bArr) {
        this(bArr, 0);
    }

    public Q(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // U6.AbstractC1440b, U6.AbstractC1460s
    AbstractC1460s r() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s t() {
        return this;
    }
}
