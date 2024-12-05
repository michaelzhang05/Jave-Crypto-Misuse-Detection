package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class F2 extends B2 {

    /* renamed from: c, reason: collision with root package name */
    private T2 f33498c;

    @Override // j$.util.stream.InterfaceC3110n2, j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        this.f33498c.accept(d8);
    }

    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public final void j() {
        double[] dArr = (double[]) this.f33498c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC3125q2 interfaceC3125q2 = this.f33760a;
        interfaceC3125q2.k(length);
        int i8 = 0;
        if (this.f33472b) {
            int length2 = dArr.length;
            while (i8 < length2) {
                double d8 = dArr[i8];
                if (interfaceC3125q2.m()) {
                    break;
                }
                interfaceC3125q2.accept(d8);
                i8++;
            }
        } else {
            int length3 = dArr.length;
            while (i8 < length3) {
                interfaceC3125q2.accept(dArr[i8]);
                i8++;
            }
        }
        interfaceC3125q2.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.T2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33498c = j8 > 0 ? new Z2((int) j8) : new Z2();
    }
}
