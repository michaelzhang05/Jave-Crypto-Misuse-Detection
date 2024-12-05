package j$.util.concurrent;

import j$.util.AbstractC3027d;
import j$.util.Z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class z implements Z {

    /* renamed from: a, reason: collision with root package name */
    long f33388a;

    /* renamed from: b, reason: collision with root package name */
    final long f33389b;

    /* renamed from: c, reason: collision with root package name */
    final int f33390c;

    /* renamed from: d, reason: collision with root package name */
    final int f33391d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(long j8, long j9, int i8, int i9) {
        this.f33388a = j8;
        this.f33389b = j9;
        this.f33390c = i8;
        this.f33391d = i9;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z trySplit() {
        long j8 = this.f33388a;
        long j9 = (this.f33389b + j8) >>> 1;
        if (j9 <= j8) {
            return null;
        }
        this.f33388a = j9;
        return new z(j8, j9, this.f33390c, this.f33391d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33389b - this.f33388a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.b(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j8 = this.f33388a;
        long j9 = this.f33389b;
        if (j8 < j9) {
            this.f33388a = j9;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.d(this.f33390c, this.f33391d));
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
        return AbstractC3027d.g(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j8 = this.f33388a;
        if (j8 >= this.f33389b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().d(this.f33390c, this.f33391d));
        this.f33388a = j8 + 1;
        return true;
    }
}
