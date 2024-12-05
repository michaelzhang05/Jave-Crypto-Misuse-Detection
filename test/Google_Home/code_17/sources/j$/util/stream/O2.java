package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class O2 extends C2 {

    /* renamed from: c, reason: collision with root package name */
    private int[] f33569c;

    /* renamed from: d, reason: collision with root package name */
    private int f33570d;

    @Override // j$.util.stream.InterfaceC3115o2, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        int[] iArr = this.f33569c;
        int i9 = this.f33570d;
        this.f33570d = i9 + 1;
        iArr[i9] = i8;
    }

    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f33569c, 0, this.f33570d);
        long j8 = this.f33570d;
        InterfaceC3125q2 interfaceC3125q2 = this.f33763a;
        interfaceC3125q2.k(j8);
        if (this.f33478b) {
            while (i8 < this.f33570d && !interfaceC3125q2.m()) {
                interfaceC3125q2.accept(this.f33569c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f33570d) {
                interfaceC3125q2.accept(this.f33569c[i8]);
                i8++;
            }
        }
        interfaceC3125q2.j();
        this.f33569c = null;
    }

    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33569c = new int[(int) j8];
    }
}
