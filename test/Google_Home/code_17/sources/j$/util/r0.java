package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class r0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f33448a;

    /* renamed from: b, reason: collision with root package name */
    private int f33449b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33450c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33451d;

    public r0(int[] iArr, int i8, int i9, int i10) {
        this.f33448a = iArr;
        this.f33449b = i8;
        this.f33450c = i9;
        this.f33451d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33451d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33450c - this.f33449b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.b(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i8;
        intConsumer.getClass();
        int[] iArr = this.f33448a;
        int length = iArr.length;
        int i9 = this.f33450c;
        if (length < i9 || (i8 = this.f33449b) < 0) {
            return;
        }
        this.f33449b = i9;
        if (i8 >= i9) {
            return;
        }
        do {
            intConsumer.accept(iArr[i8]);
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
        return AbstractC3027d.g(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i8 = this.f33449b;
        if (i8 < 0 || i8 >= this.f33450c) {
            return false;
        }
        this.f33449b = i8 + 1;
        intConsumer.accept(this.f33448a[i8]);
        return true;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final Z trySplit() {
        int i8 = this.f33449b;
        int i9 = (this.f33450c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f33449b = i9;
        return new r0(this.f33448a, i8, i9, this.f33451d);
    }
}
