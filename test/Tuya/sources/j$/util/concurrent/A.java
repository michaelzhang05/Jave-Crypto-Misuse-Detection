package j$.util.concurrent;

import j$.util.AbstractC2877d;
import j$.util.c0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class A implements c0 {

    /* renamed from: a, reason: collision with root package name */
    long f32123a;

    /* renamed from: b, reason: collision with root package name */
    final long f32124b;

    /* renamed from: c, reason: collision with root package name */
    final long f32125c;

    /* renamed from: d, reason: collision with root package name */
    final long f32126d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(long j8, long j9, long j10, long j11) {
        this.f32123a = j8;
        this.f32124b = j9;
        this.f32125c = j10;
        this.f32126d = j11;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A trySplit() {
        long j8 = this.f32123a;
        long j9 = (this.f32124b + j8) >>> 1;
        if (j9 <= j8) {
            return null;
        }
        this.f32123a = j9;
        return new A(j8, j9, this.f32125c, this.f32126d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f32124b - this.f32123a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2877d.c(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j8 = this.f32123a;
        long j9 = this.f32124b;
        if (j8 < j9) {
            this.f32123a = j9;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.e(this.f32125c, this.f32126d));
                j8++;
            } while (j8 < j9);
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2877d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2877d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2877d.h(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j8 = this.f32123a;
        if (j8 >= this.f32124b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().e(this.f32125c, this.f32126d));
        this.f32123a = j8 + 1;
        return true;
    }
}
