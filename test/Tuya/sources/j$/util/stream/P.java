package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class P extends T implements InterfaceC2965o2 {

    /* renamed from: b, reason: collision with root package name */
    final IntConsumer f32378b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(IntConsumer intConsumer, boolean z8) {
        super(z8);
        this.f32378b = intConsumer;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        this.f32378b.accept(i8);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        abstractC2897b.R(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        e(abstractC2897b, spliterator);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC2965o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3013z0.g(this, num);
    }
}
