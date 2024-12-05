package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3003w2 extends AbstractC2948l0 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f32645m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f32646n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3003w2(AbstractC2897b abstractC2897b, int i8, long j8, long j9) {
        super(abstractC2897b, i8, 0);
        this.f32645m = j8;
        this.f32646n = j9;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC2897b
    final L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long C8 = abstractC2897b.C(spliterator);
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC3013z0.H(abstractC2897b, AbstractC3013z0.C(abstractC2897b.F(), spliterator, this.f32645m, this.f32646n), true);
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return (L0) new A2(this, abstractC2897b, spliterator, intFunction, this.f32645m, this.f32646n).invoke();
        }
        j$.util.c0 c0Var = (j$.util.c0) abstractC2897b.T(spliterator);
        long j10 = this.f32645m;
        long j11 = this.f32646n;
        if (j10 <= C8) {
            j8 = j11 >= 0 ? Math.min(j11, C8 - j10) : C8 - j10;
            j9 = 0;
        } else {
            j8 = j11;
            j9 = j10;
        }
        return AbstractC3013z0.H(this, new G3(c0Var, j9, j8), true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC2897b
    final Spliterator L(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        long j8;
        long j9;
        long C8 = abstractC2897b.C(spliterator);
        long j10 = this.f32646n;
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.c0 c0Var = (j$.util.c0) abstractC2897b.T(spliterator);
            long j11 = this.f32645m;
            return new x3(c0Var, j11, AbstractC3013z0.B(j11, j10));
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return ((L0) new A2(this, abstractC2897b, spliterator, new C2918f0(11), this.f32645m, this.f32646n).invoke()).spliterator();
        }
        j$.util.c0 c0Var2 = (j$.util.c0) abstractC2897b.T(spliterator);
        long j12 = this.f32645m;
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
        return new G3(c0Var2, j9, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        return new C2999v2(this, interfaceC2975q2);
    }
}
