package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class C3 extends D3 implements j$.util.c0, LongConsumer {

    /* renamed from: f, reason: collision with root package name */
    long f33479f;

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f33479f = j8;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new G3((j$.util.c0) spliterator, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f33479f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.c(this, consumer);
    }

    @Override // j$.util.stream.D3
    protected final AbstractC3096k3 g(int i8) {
        return new C3091j3(i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3027d.h(this, consumer);
    }
}
