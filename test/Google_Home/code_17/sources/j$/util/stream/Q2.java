package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class Q2 extends E2 {

    /* renamed from: d, reason: collision with root package name */
    private Object[] f33587d;

    /* renamed from: e, reason: collision with root package name */
    private int f33588e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f33587d;
        int i8 = this.f33588e;
        this.f33588e = i8 + 1;
        objArr[i8] = obj;
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f33587d, 0, this.f33588e, this.f33490b);
        long j8 = this.f33588e;
        InterfaceC3125q2 interfaceC3125q2 = this.f33772a;
        interfaceC3125q2.k(j8);
        if (this.f33491c) {
            while (i8 < this.f33588e && !interfaceC3125q2.m()) {
                interfaceC3125q2.accept((InterfaceC3125q2) this.f33587d[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f33588e) {
                interfaceC3125q2.accept((InterfaceC3125q2) this.f33587d[i8]);
                i8++;
            }
        }
        interfaceC3125q2.j();
        this.f33587d = null;
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33587d = new Object[(int) j8];
    }
}
