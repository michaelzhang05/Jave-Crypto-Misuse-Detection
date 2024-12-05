package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2992u0 extends AbstractC2997v0 implements InterfaceC2960n2 {
    @Override // j$.util.stream.AbstractC2997v0, j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        if (this.f32633a) {
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

    @Override // j$.util.stream.InterfaceC2960n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3013z0.e(this, d8);
    }
}
