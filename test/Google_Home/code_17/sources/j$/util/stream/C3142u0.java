package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3142u0 extends AbstractC3147v0 implements InterfaceC3110n2 {
    @Override // j$.util.stream.AbstractC3147v0, j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        if (this.f33827a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d8);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3110n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3163z0.e(this, d8);
    }
}
