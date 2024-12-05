package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class G2 extends C2 {

    /* renamed from: c, reason: collision with root package name */
    private V2 f33504c;

    @Override // j$.util.stream.InterfaceC3115o2, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        this.f33504c.accept(i8);
    }

    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public final void j() {
        int[] iArr = (int[]) this.f33504c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC3125q2 interfaceC3125q2 = this.f33763a;
        interfaceC3125q2.k(length);
        int i8 = 0;
        if (this.f33478b) {
            int length2 = iArr.length;
            while (i8 < length2) {
                int i9 = iArr[i8];
                if (interfaceC3125q2.m()) {
                    break;
                }
                interfaceC3125q2.accept(i9);
                i8++;
            }
        } else {
            int length3 = iArr.length;
            while (i8 < length3) {
                interfaceC3125q2.accept(iArr[i8]);
                i8++;
            }
        }
        interfaceC3125q2.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33504c = j8 > 0 ? new Z2((int) j8) : new Z2();
    }
}
