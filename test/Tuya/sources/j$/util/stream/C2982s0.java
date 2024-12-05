package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2982s0 extends AbstractC2997v0 implements InterfaceC2965o2 {
    @Override // j$.util.stream.AbstractC2997v0, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        if (this.f32633a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i8);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2965o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3013z0.g(this, num);
    }
}
