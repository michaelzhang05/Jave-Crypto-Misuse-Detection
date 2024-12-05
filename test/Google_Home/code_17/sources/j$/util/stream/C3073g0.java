package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3073g0 extends AbstractC3100l2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33737b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3047b f33738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3073g0(AbstractC3047b abstractC3047b, InterfaceC3125q2 interfaceC3125q2, int i8) {
        super(interfaceC3125q2);
        this.f33737b = i8;
        this.f33738c = abstractC3047b;
    }

    @Override // j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        switch (this.f33737b) {
            case 0:
                this.f33767a.accept((InterfaceC3125q2) ((LongFunction) ((C3146v) this.f33738c).f33826n).apply(j8));
                return;
            case 1:
                ((C3158y) this.f33738c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j8);
                throw null;
            case 2:
                ((C3154x) this.f33738c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j8);
                throw null;
            case 3:
                ((A) this.f33738c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j8);
                throw null;
            case 4:
                ((C3158y) this.f33738c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j8);
                throw null;
            default:
                ((LongConsumer) ((C3088j0) this.f33738c).f33759n).accept(j8);
                this.f33767a.accept(j8);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3100l2, j$.util.stream.InterfaceC3125q2
    public void k(long j8) {
        switch (this.f33737b) {
            case 4:
                this.f33767a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
