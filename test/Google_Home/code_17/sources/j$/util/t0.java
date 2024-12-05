package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class t0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f33874a;

    /* renamed from: b, reason: collision with root package name */
    private int f33875b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33876c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33877d;

    public t0(long[] jArr, int i8, int i9, int i10) {
        this.f33874a = jArr;
        this.f33875b = i8;
        this.f33876c = i9;
        this.f33877d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33877d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33876c - this.f33875b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.c(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i8;
        longConsumer.getClass();
        long[] jArr = this.f33874a;
        int length = jArr.length;
        int i9 = this.f33876c;
        if (length < i9 || (i8 = this.f33875b) < 0) {
            return;
        }
        this.f33875b = i9;
        if (i8 >= i9) {
            return;
        }
        do {
            longConsumer.accept(jArr[i8]);
            i8++;
        } while (i8 < i9);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC3027d.e(this, 4)) {
            return null;
        }
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
        int i8 = this.f33875b;
        if (i8 < 0 || i8 >= this.f33876c) {
            return false;
        }
        this.f33875b = i8 + 1;
        longConsumer.accept(this.f33874a[i8]);
        return true;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final c0 trySplit() {
        int i8 = this.f33875b;
        int i9 = (this.f33876c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f33875b = i9;
        return new t0(this.f33874a, i8, i9, this.f33877d);
    }
}
