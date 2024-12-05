package Z6;

/* loaded from: classes5.dex */
public class h extends c {
    @Override // Y6.e
    public int a(byte[] bArr, int i8) {
        n();
        E7.f.i(this.f13437e, bArr, i8);
        E7.f.i(this.f13438f, bArr, i8 + 8);
        E7.f.i(this.f13439g, bArr, i8 + 16);
        E7.f.i(this.f13440h, bArr, i8 + 24);
        E7.f.i(this.f13441i, bArr, i8 + 32);
        E7.f.i(this.f13442j, bArr, i8 + 40);
        r();
        return 48;
    }

    @Override // Y6.e
    public String e() {
        return "SHA-384";
    }

    @Override // Y6.e
    public int f() {
        return 48;
    }

    @Override // Z6.c
    public void r() {
        super.r();
        this.f13437e = -3766243637369397544L;
        this.f13438f = 7105036623409894663L;
        this.f13439g = -7973340178411365097L;
        this.f13440h = 1526699215303891257L;
        this.f13441i = 7436329637833083697L;
        this.f13442j = -8163818279084223215L;
        this.f13443k = -2662702644619276377L;
        this.f13444l = 5167115440072839076L;
    }
}
