package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class S extends T {

    /* renamed from: b, reason: collision with root package name */
    final Consumer f33605b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(Consumer consumer, boolean z8) {
        super(z8);
        this.f33605b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33605b.accept(obj);
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
}
