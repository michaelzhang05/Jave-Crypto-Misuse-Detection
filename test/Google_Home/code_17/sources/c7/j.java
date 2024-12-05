package c7;

/* loaded from: classes5.dex */
public class j extends AbstractC2060c {
    @Override // b7.e
    public int a(byte[] bArr, int i8) {
        n();
        H7.f.i(this.f15761e, bArr, i8);
        H7.f.i(this.f15762f, bArr, i8 + 8);
        H7.f.i(this.f15763g, bArr, i8 + 16);
        H7.f.i(this.f15764h, bArr, i8 + 24);
        H7.f.i(this.f15765i, bArr, i8 + 32);
        H7.f.i(this.f15766j, bArr, i8 + 40);
        H7.f.i(this.f15767k, bArr, i8 + 48);
        H7.f.i(this.f15768l, bArr, i8 + 56);
        r();
        return 64;
    }

    @Override // b7.e
    public String e() {
        return "SHA-512";
    }

    @Override // b7.e
    public int f() {
        return 64;
    }

    @Override // c7.AbstractC2060c
    public void r() {
        super.r();
        this.f15761e = 7640891576956012808L;
        this.f15762f = -4942790177534073029L;
        this.f15763g = 4354685564936845355L;
        this.f15764h = -6534734903238641935L;
        this.f15765i = 5840696475078001361L;
        this.f15766j = -7276294671716946913L;
        this.f15767k = 2270897969802886507L;
        this.f15768l = 6620516959819538809L;
    }
}
