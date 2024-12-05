package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class O3 extends AbstractC2930h2 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Predicate f32377m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(AbstractC2897b abstractC2897b, int i8, Predicate predicate) {
        super(abstractC2897b, i8, 0);
        this.f32377m = predicate;
    }

    @Override // j$.util.stream.AbstractC2897b
    final L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        return (L0) new S3(this, abstractC2897b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC2897b
    final Spliterator L(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        return EnumC2916e3.ORDERED.r(abstractC2897b.G()) ? K(abstractC2897b, spliterator, new C2918f0(8)).spliterator() : new T3(abstractC2897b.T(spliterator), this.f32377m, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        return new C2967p(this, interfaceC2975q2);
    }
}
