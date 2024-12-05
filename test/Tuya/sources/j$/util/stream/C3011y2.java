package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3011y2 extends C {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f32662m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f32663n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3011y2(AbstractC2897b abstractC2897b, int i8, long j8, long j9) {
        super(abstractC2897b, i8, 0);
        this.f32662m = j8;
        this.f32663n = j9;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC2897b
    final L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long C8 = abstractC2897b.C(spliterator);
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC3013z0.F(abstractC2897b, AbstractC3013z0.C(abstractC2897b.F(), spliterator, this.f32662m, this.f32663n), true);
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return (L0) new A2(this, abstractC2897b, spliterator, intFunction, this.f32662m, this.f32663n).invoke();
        }
        j$.util.W w8 = (j$.util.W) abstractC2897b.T(spliterator);
        long j10 = this.f32662m;
        long j11 = this.f32663n;
        if (j10 <= C8) {
            j8 = j11 >= 0 ? Math.min(j11, C8 - j10) : C8 - j10;
            j9 = 0;
        } else {
            j8 = j11;
            j9 = j10;
        }
        return AbstractC3013z0.F(this, new G3(w8, j9, j8), true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC2897b
    final Spliterator L(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        long j8;
        long j9;
        long C8 = abstractC2897b.C(spliterator);
        long j10 = this.f32663n;
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.W w8 = (j$.util.W) abstractC2897b.T(spliterator);
            long j11 = this.f32662m;
            return new x3(w8, j11, AbstractC3013z0.B(j11, j10));
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return ((L0) new A2(this, abstractC2897b, spliterator, new C2918f0(12), this.f32662m, this.f32663n).invoke()).spliterator();
        }
        j$.util.W w9 = (j$.util.W) abstractC2897b.T(spliterator);
        long j12 = this.f32662m;
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
        return new G3(w9, j9, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        return new C3007x2(this, interfaceC2975q2);
    }
}
