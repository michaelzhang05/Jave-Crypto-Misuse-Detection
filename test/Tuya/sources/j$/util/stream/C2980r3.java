package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2980r3 extends AbstractC2926g3 implements j$.util.Z {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.util.function.IntConsumer, java.lang.Object, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC2926g3
    final void d() {
        ?? z22 = new Z2();
        this.f32552h = z22;
        Objects.requireNonNull(z22);
        this.f32549e = this.f32546b.S(new C2976q3(z22, 0));
        this.f32550f = new C2892a(4, this);
    }

    @Override // j$.util.stream.AbstractC2926g3
    final AbstractC2926g3 e(Spliterator spliterator) {
        return new AbstractC2926g3(this.f32546b, spliterator, this.f32545a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2877d.b(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f32552h != null || this.f32553i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        C2976q3 c2976q3 = new C2976q3(intConsumer, 1);
        this.f32546b.R(this.f32548d, c2976q3);
        this.f32553i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2877d.g(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a8 = a();
        if (a8) {
            V2 v22 = (V2) this.f32552h;
            long j8 = this.f32551g;
            int t8 = v22.t(j8);
            intConsumer.accept((v22.f32500c == 0 && t8 == 0) ? ((int[]) v22.f32471e)[(int) j8] : ((int[][]) v22.f32472f)[t8][(int) (j8 - v22.f32501d[t8])]);
        }
        return a8;
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final j$.util.Z trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.Z) super.trySplit();
    }
}
