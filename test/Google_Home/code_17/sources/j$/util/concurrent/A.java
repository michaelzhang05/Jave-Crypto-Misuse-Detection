package j$.util.concurrent;

import j$.util.AbstractC3027d;
import j$.util.c0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class A implements c0 {

    /* renamed from: a, reason: collision with root package name */
    long f33317a;

    /* renamed from: b, reason: collision with root package name */
    final long f33318b;

    /* renamed from: c, reason: collision with root package name */
    final long f33319c;

    /* renamed from: d, reason: collision with root package name */
    final long f33320d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(long j8, long j9, long j10, long j11) {
        this.f33317a = j8;
        this.f33318b = j9;
        this.f33319c = j10;
        this.f33320d = j11;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A trySplit() {
        long j8 = this.f33317a;
        long j9 = (this.f33318b + j8) >>> 1;
        if (j9 <= j8) {
            return null;
        }
        this.f33317a = j9;
        return new A(j8, j9, this.f33319c, this.f33320d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33318b - this.f33317a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.c(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j8 = this.f33317a;
        long j9 = this.f33318b;
        if (j8 < j9) {
            this.f33317a = j9;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.e(this.f33319c, this.f33320d));
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
        return AbstractC3027d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC3027d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3027d.h(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j8 = this.f33317a;
        if (j8 >= this.f33318b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().e(this.f33319c, this.f33320d));
        this.f33317a = j8 + 1;
        return true;
    }
}
