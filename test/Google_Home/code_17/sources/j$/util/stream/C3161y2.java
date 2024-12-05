package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3161y2 extends C {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f33856m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f33857n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3161y2(AbstractC3047b abstractC3047b, int i8, long j8, long j9) {
        super(abstractC3047b, i8, 0);
        this.f33856m = j8;
        this.f33857n = j9;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC3047b
    final L0 K(AbstractC3047b abstractC3047b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long C8 = abstractC3047b.C(spliterator);
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC3163z0.F(abstractC3047b, AbstractC3163z0.C(abstractC3047b.F(), spliterator, this.f33856m, this.f33857n), true);
        }
        if (EnumC3066e3.ORDERED.r(abstractC3047b.G())) {
            return (L0) new A2(this, abstractC3047b, spliterator, intFunction, this.f33856m, this.f33857n).invoke();
        }
        j$.util.W w8 = (j$.util.W) abstractC3047b.T(spliterator);
        long j10 = this.f33856m;
        long j11 = this.f33857n;
        if (j10 <= C8) {
            j8 = j11 >= 0 ? Math.min(j11, C8 - j10) : C8 - j10;
            j9 = 0;
        } else {
            j8 = j11;
            j9 = j10;
        }
        return AbstractC3163z0.F(this, new G3(w8, j9, j8), true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC3047b
    final Spliterator L(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        long j8;
        long j9;
        long C8 = abstractC3047b.C(spliterator);
        long j10 = this.f33857n;
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.W w8 = (j$.util.W) abstractC3047b.T(spliterator);
            long j11 = this.f33856m;
            return new x3(w8, j11, AbstractC3163z0.B(j11, j10));
        }
        if (EnumC3066e3.ORDERED.r(abstractC3047b.G())) {
            return ((L0) new A2(this, abstractC3047b, spliterator, new C3068f0(12), this.f33856m, this.f33857n).invoke()).spliterator();
        }
        j$.util.W w9 = (j$.util.W) abstractC3047b.T(spliterator);
        long j12 = this.f33856m;
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
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        return new C3157x2(this, interfaceC3125q2);
    }
}
