package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3140t3 extends AbstractC3076g3 implements j$.util.c0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.lang.Object, j$.util.stream.d, java.util.function.LongConsumer] */
    @Override // j$.util.stream.AbstractC3076g3
    final void d() {
        ?? z22 = new Z2();
        this.f33746h = z22;
        Objects.requireNonNull(z22);
        this.f33743e = this.f33740b.S(new C3135s3(z22, 0));
        this.f33744f = new C3042a(5, this);
    }

    @Override // j$.util.stream.AbstractC3076g3
    final AbstractC3076g3 e(Spliterator spliterator) {
        return new AbstractC3076g3(this.f33740b, spliterator, this.f33739a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.c(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f33746h != null || this.f33747i) {
            do {
            } while (tryAdvance(longConsumer));
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        C3135s3 c3135s3 = new C3135s3(longConsumer, 1);
        this.f33740b.R(this.f33742d, c3135s3);
        this.f33747i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3027d.h(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean a8 = a();
        if (a8) {
            X2 x22 = (X2) this.f33746h;
            long j8 = this.f33745g;
            int t8 = x22.t(j8);
            longConsumer.accept((x22.f33694c == 0 && t8 == 0) ? ((long[]) x22.f33665e)[(int) j8] : ((long[][]) x22.f33666f)[t8][(int) (j8 - x22.f33695d[t8])]);
        }
        return a8;
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }
}
