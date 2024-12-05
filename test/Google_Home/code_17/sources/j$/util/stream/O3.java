package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class O3 extends AbstractC3080h2 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Predicate f33571m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(AbstractC3047b abstractC3047b, int i8, Predicate predicate) {
        super(abstractC3047b, i8, 0);
        this.f33571m = predicate;
    }

    @Override // j$.util.stream.AbstractC3047b
    final L0 K(AbstractC3047b abstractC3047b, Spliterator spliterator, IntFunction intFunction) {
        return (L0) new S3(this, abstractC3047b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC3047b
    final Spliterator L(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        return EnumC3066e3.ORDERED.r(abstractC3047b.G()) ? K(abstractC3047b, spliterator, new C3068f0(8)).spliterator() : new T3(abstractC3047b.T(spliterator), this.f33571m, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        return new C3117p(this, interfaceC3125q2);
    }
}
