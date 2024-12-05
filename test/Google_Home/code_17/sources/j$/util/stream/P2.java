package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class P2 extends D2 {

    /* renamed from: c, reason: collision with root package name */
    private long[] f33577c;

    /* renamed from: d, reason: collision with root package name */
    private int f33578d;

    @Override // j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long[] jArr = this.f33577c;
        int i8 = this.f33578d;
        this.f33578d = i8 + 1;
        jArr[i8] = j8;
    }

    @Override // j$.util.stream.AbstractC3100l2, j$.util.stream.InterfaceC3125q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f33577c, 0, this.f33578d);
        long j8 = this.f33578d;
        InterfaceC3125q2 interfaceC3125q2 = this.f33767a;
        interfaceC3125q2.k(j8);
        if (this.f33484b) {
            while (i8 < this.f33578d && !interfaceC3125q2.m()) {
                interfaceC3125q2.accept(this.f33577c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f33578d) {
                interfaceC3125q2.accept(this.f33577c[i8]);
                i8++;
            }
        }
        interfaceC3125q2.j();
        this.f33577c = null;
    }

    @Override // j$.util.stream.AbstractC3100l2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33577c = new long[(int) j8];
    }
}
