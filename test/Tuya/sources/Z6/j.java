package Z6;

/* loaded from: classes5.dex */
public class j extends c {
    @Override // Y6.e
    public int a(byte[] bArr, int i8) {
        n();
        E7.f.i(this.f13437e, bArr, i8);
        E7.f.i(this.f13438f, bArr, i8 + 8);
        E7.f.i(this.f13439g, bArr, i8 + 16);
        E7.f.i(this.f13440h, bArr, i8 + 24);
        E7.f.i(this.f13441i, bArr, i8 + 32);
        E7.f.i(this.f13442j, bArr, i8 + 40);
        E7.f.i(this.f13443k, bArr, i8 + 48);
        E7.f.i(this.f13444l, bArr, i8 + 56);
        r();
        return 64;
    }

    @Override // Y6.e
    public String e() {
        return "SHA-512";
    }

    @Override // Y6.e
    public int f() {
        return 64;
    }

    @Override // Z6.c
    public void r() {
        super.r();
        this.f13437e = 7640891576956012808L;
        this.f13438f = -4942790177534073029L;
        this.f13439g = 4354685564936845355L;
        this.f13440h = -6534734903238641935L;
        this.f13441i = 5840696475078001361L;
        this.f13442j = -7276294671716946913L;
        this.f13443k = 2270897969802886507L;
        this.f13444l = 6620516959819538809L;
    }
}
