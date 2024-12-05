package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
final class X extends AbstractC3095k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33652b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3047b f33653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC3047b abstractC3047b, InterfaceC3125q2 interfaceC3125q2, int i8) {
        super(interfaceC3125q2);
        this.f33652b = i8;
        this.f33653c = abstractC3047b;
    }

    @Override // j$.util.stream.InterfaceC3115o2, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        switch (this.f33652b) {
            case 0:
                this.f33763a.accept((InterfaceC3125q2) ((IntFunction) ((C3146v) this.f33653c).f33826n).apply(i8));
                return;
            case 1:
                ((IntConsumer) ((Y) this.f33653c).f33655n).accept(i8);
                this.f33763a.accept(i8);
                return;
            case 2:
                ((C3154x) this.f33653c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i8);
                throw null;
            case 3:
                ((C3158y) this.f33653c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i8);
                throw null;
            case 4:
                ((A) this.f33653c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i8);
                throw null;
            default:
                ((C3154x) this.f33653c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i8);
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public void k(long j8) {
        switch (this.f33652b) {
            case 5:
                this.f33763a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
