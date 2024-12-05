package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class N2 extends B2 {

    /* renamed from: c, reason: collision with root package name */
    private double[] f33560c;

    /* renamed from: d, reason: collision with root package name */
    private int f33561d;

    @Override // j$.util.stream.InterfaceC3110n2, j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        double[] dArr = this.f33560c;
        int i8 = this.f33561d;
        this.f33561d = i8 + 1;
        dArr[i8] = d8;
    }

    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f33560c, 0, this.f33561d);
        long j8 = this.f33561d;
        InterfaceC3125q2 interfaceC3125q2 = this.f33760a;
        interfaceC3125q2.k(j8);
        if (this.f33472b) {
            while (i8 < this.f33561d && !interfaceC3125q2.m()) {
                interfaceC3125q2.accept(this.f33560c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f33561d) {
                interfaceC3125q2.accept(this.f33560c[i8]);
                i8++;
            }
        }
        interfaceC3125q2.j();
        this.f33560c = null;
    }

    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33560c = new double[(int) j8];
    }
}
