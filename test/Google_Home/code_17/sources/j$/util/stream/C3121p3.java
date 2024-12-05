package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3121p3 extends AbstractC3076g3 implements j$.util.W {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.lang.Object, java.util.function.DoubleConsumer, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC3076g3
    final void d() {
        ?? z22 = new Z2();
        this.f33746h = z22;
        Objects.requireNonNull(z22);
        this.f33743e = this.f33740b.S(new C3116o3(z22, 0));
        this.f33744f = new C3042a(3, this);
    }

    @Override // j$.util.stream.AbstractC3076g3
    final AbstractC3076g3 e(Spliterator spliterator) {
        return new AbstractC3076g3(this.f33740b, spliterator, this.f33739a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.a(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f33746h != null || this.f33747i) {
            do {
            } while (tryAdvance(doubleConsumer));
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        C3116o3 c3116o3 = new C3116o3(doubleConsumer, 1);
        this.f33740b.R(this.f33742d, c3116o3);
        this.f33747i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3027d.f(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean a8 = a();
        if (a8) {
            T2 t22 = (T2) this.f33746h;
            long j8 = this.f33745g;
            int t8 = t22.t(j8);
            doubleConsumer.accept((t22.f33694c == 0 && t8 == 0) ? ((double[]) t22.f33665e)[(int) j8] : ((double[][]) t22.f33666f)[t8][(int) (j8 - t22.f33695d[t8])]);
        }
        return a8;
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final j$.util.W trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.W) super.trySplit();
    }
}
