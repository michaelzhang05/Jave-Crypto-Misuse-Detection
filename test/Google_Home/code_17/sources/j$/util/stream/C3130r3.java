package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3130r3 extends AbstractC3076g3 implements j$.util.Z {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.util.function.IntConsumer, java.lang.Object, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC3076g3
    final void d() {
        ?? z22 = new Z2();
        this.f33746h = z22;
        Objects.requireNonNull(z22);
        this.f33743e = this.f33740b.S(new C3126q3(z22, 0));
        this.f33744f = new C3042a(4, this);
    }

    @Override // j$.util.stream.AbstractC3076g3
    final AbstractC3076g3 e(Spliterator spliterator) {
        return new AbstractC3076g3(this.f33740b, spliterator, this.f33739a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.b(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f33746h != null || this.f33747i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        C3126q3 c3126q3 = new C3126q3(intConsumer, 1);
        this.f33740b.R(this.f33742d, c3126q3);
        this.f33747i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3027d.g(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a8 = a();
        if (a8) {
            V2 v22 = (V2) this.f33746h;
            long j8 = this.f33745g;
            int t8 = v22.t(j8);
            intConsumer.accept((v22.f33694c == 0 && t8 == 0) ? ((int[]) v22.f33665e)[(int) j8] : ((int[][]) v22.f33666f)[t8][(int) (j8 - v22.f33695d[t8])]);
        }
        return a8;
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final j$.util.Z trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3076g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.Z) super.trySplit();
    }
}
