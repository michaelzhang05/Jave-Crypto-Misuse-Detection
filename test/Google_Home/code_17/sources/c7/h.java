package c7;

/* loaded from: classes5.dex */
public class h extends AbstractC2060c {
    @Override // b7.e
    public int a(byte[] bArr, int i8) {
        n();
        H7.f.i(this.f15761e, bArr, i8);
        H7.f.i(this.f15762f, bArr, i8 + 8);
        H7.f.i(this.f15763g, bArr, i8 + 16);
        H7.f.i(this.f15764h, bArr, i8 + 24);
        H7.f.i(this.f15765i, bArr, i8 + 32);
        H7.f.i(this.f15766j, bArr, i8 + 40);
        r();
        return 48;
    }

    @Override // b7.e
    public String e() {
        return "SHA-384";
    }

    @Override // b7.e
    public int f() {
        return 48;
    }

    @Override // c7.AbstractC2060c
    public void r() {
        super.r();
        this.f15761e = -3766243637369397544L;
        this.f15762f = 7105036623409894663L;
        this.f15763g = -7973340178411365097L;
        this.f15764h = 1526699215303891257L;
        this.f15765i = 7436329637833083697L;
        this.f15766j = -8163818279084223215L;
        this.f15767k = -2662702644619276377L;
        this.f15768l = 5167115440072839076L;
    }
}
