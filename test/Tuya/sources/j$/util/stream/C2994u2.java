package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2994u2 extends AbstractC2903c0 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f32629m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f32630n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2994u2(AbstractC2897b abstractC2897b, int i8, long j8, long j9) {
        super(abstractC2897b, i8, 0);
        this.f32629m = j8;
        this.f32630n = j9;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC2897b
    final L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long C8 = abstractC2897b.C(spliterator);
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC3013z0.G(abstractC2897b, AbstractC3013z0.C(abstractC2897b.F(), spliterator, this.f32629m, this.f32630n), true);
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return (L0) new A2(this, abstractC2897b, spliterator, intFunction, this.f32629m, this.f32630n).invoke();
        }
        j$.util.Z z8 = (j$.util.Z) abstractC2897b.T(spliterator);
        long j10 = this.f32629m;
        long j11 = this.f32630n;
        if (j10 <= C8) {
            j8 = j11 >= 0 ? Math.min(j11, C8 - j10) : C8 - j10;
            j9 = 0;
        } else {
            j8 = j11;
            j9 = j10;
        }
        return AbstractC3013z0.G(this, new G3(z8, j9, j8), true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC2897b
    final Spliterator L(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        long j8;
        long j9;
        long C8 = abstractC2897b.C(spliterator);
        long j10 = this.f32630n;
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.Z z8 = (j$.util.Z) abstractC2897b.T(spliterator);
            long j11 = this.f32629m;
            return new x3(z8, j11, AbstractC3013z0.B(j11, j10));
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return ((L0) new A2(this, abstractC2897b, spliterator, new C2918f0(10), this.f32629m, this.f32630n).invoke()).spliterator();
        }
        j$.util.Z z9 = (j$.util.Z) abstractC2897b.T(spliterator);
        long j12 = this.f32629m;
        if (j12 <= C8) {
            long j13 = C8 - j12;
            if (j10 >= 0) {
                j13 = Math.min(j10, j13);
            }
            j8 = j13;
            j9 = 0;
        } else {
            j8 = j10;
            j9 = j12;
        }
        return new G3(z9, j9, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        return new C2989t2(this, interfaceC2975q2);
    }
}
