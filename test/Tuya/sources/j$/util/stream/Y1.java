package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Y1 extends AbstractC2900b2 implements InterfaceC2965o2 {
    @Override // j$.util.stream.AbstractC2900b2, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        this.f32491b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f32491b += ((AbstractC2900b2) v12).f32491b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f32491b);
    }

    @Override // j$.util.stream.InterfaceC2965o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3013z0.g(this, num);
    }
}
