package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3141u extends AbstractC3090j2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33820b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3047b f33821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3141u(AbstractC3047b abstractC3047b, InterfaceC3125q2 interfaceC3125q2, int i8) {
        super(interfaceC3125q2);
        this.f33820b = i8;
        this.f33821c = abstractC3047b;
    }

    @Override // j$.util.stream.InterfaceC3110n2, j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        switch (this.f33820b) {
            case 0:
                this.f33760a.accept((InterfaceC3125q2) ((DoubleFunction) ((C3146v) this.f33821c).f33826n).apply(d8));
                return;
            case 1:
                this.f33760a.accept(((DoubleUnaryOperator) ((C3150w) this.f33821c).f33834n).applyAsDouble(d8));
                return;
            case 2:
                ((C3154x) this.f33821c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d8);
                throw null;
            case 3:
                ((C3158y) this.f33821c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d8);
                throw null;
            case 4:
                ((A) this.f33821c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d8);
                throw null;
            default:
                ((DoubleConsumer) ((C3150w) this.f33821c).f33834n).accept(d8);
                this.f33760a.accept(d8);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public void k(long j8) {
        switch (this.f33820b) {
            case 4:
                this.f33760a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
