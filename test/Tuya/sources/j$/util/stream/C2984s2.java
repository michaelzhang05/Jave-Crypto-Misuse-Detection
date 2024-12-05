package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2984s2 extends AbstractC2930h2 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f32616m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f32617n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2984s2(AbstractC2897b abstractC2897b, int i8, long j8, long j9) {
        super(abstractC2897b, i8, 0);
        this.f32616m = j8;
        this.f32617n = j9;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC2897b
    final L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long C8 = abstractC2897b.C(spliterator);
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC3013z0.E(abstractC2897b, AbstractC3013z0.C(abstractC2897b.F(), spliterator, this.f32616m, this.f32617n), true, intFunction);
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return (L0) new A2(this, abstractC2897b, spliterator, intFunction, this.f32616m, this.f32617n).invoke();
        }
        Spliterator T7 = abstractC2897b.T(spliterator);
        long j10 = this.f32616m;
        long j11 = this.f32617n;
        if (j10 <= C8) {
            j9 = j11 >= 0 ? Math.min(j11, C8 - j10) : C8 - j10;
            j8 = 0;
        } else {
            j8 = j10;
            j9 = j11;
        }
        return AbstractC3013z0.E(this, new G3(T7, j8, j9), true, intFunction);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC2897b
    final Spliterator L(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        long j8;
        long j9;
        long C8 = abstractC2897b.C(spliterator);
        long j10 = this.f32617n;
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator T7 = abstractC2897b.T(spliterator);
            long j11 = this.f32616m;
            return new y3(T7, j11, AbstractC3013z0.B(j11, j10));
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return ((L0) new A2(this, abstractC2897b, spliterator, new C2918f0(8), this.f32616m, this.f32617n).invoke()).spliterator();
        }
        Spliterator T8 = abstractC2897b.T(spliterator);
        long j12 = this.f32616m;
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
        return new G3(T8, j9, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        return new C2979r2(this, interfaceC2975q2);
    }
}
