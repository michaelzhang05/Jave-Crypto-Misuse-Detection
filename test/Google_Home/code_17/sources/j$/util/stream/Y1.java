package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Y1 extends AbstractC3050b2 implements InterfaceC3115o2 {
    @Override // j$.util.stream.AbstractC3050b2, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        this.f33685b++;
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
        this.f33685b += ((AbstractC3050b2) v12).f33685b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f33685b);
    }

    @Override // j$.util.stream.InterfaceC3115o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3163z0.g(this, num);
    }
}
