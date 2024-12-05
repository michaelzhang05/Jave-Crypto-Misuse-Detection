package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class Q2 extends E2 {

    /* renamed from: d, reason: collision with root package name */
    private Object[] f32393d;

    /* renamed from: e, reason: collision with root package name */
    private int f32394e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f32393d;
        int i8 = this.f32394e;
        this.f32394e = i8 + 1;
        objArr[i8] = obj;
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f32393d, 0, this.f32394e, this.f32296b);
        long j8 = this.f32394e;
        InterfaceC2975q2 interfaceC2975q2 = this.f32578a;
        interfaceC2975q2.k(j8);
        if (this.f32297c) {
            while (i8 < this.f32394e && !interfaceC2975q2.m()) {
                interfaceC2975q2.accept((InterfaceC2975q2) this.f32393d[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f32394e) {
                interfaceC2975q2.accept((InterfaceC2975q2) this.f32393d[i8]);
                i8++;
            }
        }
        interfaceC2975q2.j();
        this.f32393d = null;
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f32393d = new Object[(int) j8];
    }
}
