package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q extends T implements InterfaceC2970p2 {

    /* renamed from: b, reason: collision with root package name */
    final LongConsumer f32389b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(LongConsumer longConsumer, boolean z8) {
        super(z8);
        this.f32389b = longConsumer;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC2975q2, j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f32389b.accept(j8);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
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

    @Override // j$.util.stream.InterfaceC2970p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3013z0.i(this, l8);
    }
}
