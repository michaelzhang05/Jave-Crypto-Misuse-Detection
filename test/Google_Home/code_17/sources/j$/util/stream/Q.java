package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q extends T implements InterfaceC3120p2 {

    /* renamed from: b, reason: collision with root package name */
    final LongConsumer f33583b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(LongConsumer longConsumer, boolean z8) {
        super(z8);
        this.f33583b = longConsumer;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f33583b.accept(j8);
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
    public final Object b(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        abstractC3047b.R(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        e(abstractC3047b, spliterator);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC3120p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3163z0.i(this, l8);
    }
}
