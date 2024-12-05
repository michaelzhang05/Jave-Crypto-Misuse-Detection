package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3132s0 extends AbstractC3147v0 implements InterfaceC3115o2 {
    @Override // j$.util.stream.AbstractC3147v0, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        if (this.f33827a) {
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

    @Override // j$.util.stream.InterfaceC3115o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3163z0.g(this, num);
    }
}
