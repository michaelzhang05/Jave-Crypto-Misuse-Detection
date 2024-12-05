package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class A3 extends D3 implements j$.util.W, DoubleConsumer {

    /* renamed from: f, reason: collision with root package name */
    double f33469f;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f33469f = d8;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new G3((j$.util.W) spliterator, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f33469f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.a(this, consumer);
    }

    @Override // j$.util.stream.D3
    protected final AbstractC3096k3 g(int i8) {
        return new C3081h3(i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3027d.f(this, consumer);
    }
}
