package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2923g0 extends AbstractC2950l2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32543b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2897b f32544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2923g0(AbstractC2897b abstractC2897b, InterfaceC2975q2 interfaceC2975q2, int i8) {
        super(interfaceC2975q2);
        this.f32543b = i8;
        this.f32544c = abstractC2897b;
    }

    @Override // j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        switch (this.f32543b) {
            case 0:
                this.f32573a.accept((InterfaceC2975q2) ((LongFunction) ((C2996v) this.f32544c).f32632n).apply(j8));
                return;
            case 1:
                ((C3008y) this.f32544c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j8);
                throw null;
            case 2:
                ((C3004x) this.f32544c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j8);
                throw null;
            case 3:
                ((A) this.f32544c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j8);
                throw null;
            case 4:
                ((C3008y) this.f32544c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j8);
                throw null;
            default:
                ((LongConsumer) ((C2938j0) this.f32544c).f32565n).accept(j8);
                this.f32573a.accept(j8);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2950l2, j$.util.stream.InterfaceC2975q2
    public void k(long j8) {
        switch (this.f32543b) {
            case 4:
                this.f32573a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
