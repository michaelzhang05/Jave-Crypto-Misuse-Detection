package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3134s2 extends AbstractC3080h2 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f33810m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f33811n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3134s2(AbstractC3047b abstractC3047b, int i8, long j8, long j9) {
        super(abstractC3047b, i8, 0);
        this.f33810m = j8;
        this.f33811n = j9;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC3047b
    final L0 K(AbstractC3047b abstractC3047b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long C8 = abstractC3047b.C(spliterator);
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC3163z0.E(abstractC3047b, AbstractC3163z0.C(abstractC3047b.F(), spliterator, this.f33810m, this.f33811n), true, intFunction);
        }
        if (EnumC3066e3.ORDERED.r(abstractC3047b.G())) {
            return (L0) new A2(this, abstractC3047b, spliterator, intFunction, this.f33810m, this.f33811n).invoke();
        }
        Spliterator T8 = abstractC3047b.T(spliterator);
        long j10 = this.f33810m;
        long j11 = this.f33811n;
        if (j10 <= C8) {
            j9 = j11 >= 0 ? Math.min(j11, C8 - j10) : C8 - j10;
            j8 = 0;
        } else {
            j8 = j10;
            j9 = j11;
        }
        return AbstractC3163z0.E(this, new G3(T8, j8, j9), true, intFunction);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC3047b
    final Spliterator L(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        long j8;
        long j9;
        long C8 = abstractC3047b.C(spliterator);
        long j10 = this.f33811n;
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator T8 = abstractC3047b.T(spliterator);
            long j11 = this.f33810m;
            return new y3(T8, j11, AbstractC3163z0.B(j11, j10));
        }
        if (EnumC3066e3.ORDERED.r(abstractC3047b.G())) {
            return ((L0) new A2(this, abstractC3047b, spliterator, new C3068f0(8), this.f33810m, this.f33811n).invoke()).spliterator();
        }
        Spliterator T9 = abstractC3047b.T(spliterator);
        long j12 = this.f33810m;
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
        return new G3(T9, j9, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        return new C3129r2(this, interfaceC3125q2);
    }
}
