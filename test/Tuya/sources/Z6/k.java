package Z6;

/* loaded from: classes5.dex */
public class k extends b implements Y6.i {
    public k(int i8) {
        super(s(i8));
    }

    private static int s(int i8) {
        if (i8 != 128 && i8 != 256) {
            throw new IllegalArgumentException("'bitLength' " + i8 + " not supported for SHAKE");
        }
        return i8;
    }

    @Override // Z6.b, Y6.e
    public int a(byte[] bArr, int i8) {
        return d(bArr, i8, f());
    }

    @Override // Y6.i
    public int d(byte[] bArr, int i8, int i9) {
        int t8 = t(bArr, i8, i9);
        q();
        return t8;
    }

    @Override // Y6.e
    public String e() {
        return "SHAKE" + this.f13430e;
    }

    @Override // Z6.b, Y6.e
    public int f() {
        return this.f13430e / 4;
    }

    public int t(byte[] bArr, int i8, int i9) {
        if (!this.f13431f) {
            l(15, 4);
        }
        r(bArr, i8, i9 * 8);
        return i9;
    }
}
