package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class l0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f33433a;

    /* renamed from: b, reason: collision with root package name */
    private int f33434b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33435c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33436d;

    public l0(Object[] objArr, int i8, int i9, int i10) {
        this.f33433a = objArr;
        this.f33434b = i8;
        this.f33435c = i9;
        this.f33436d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33436d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33435c - this.f33434b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i8;
        consumer.getClass();
        Object[] objArr = this.f33433a;
        int length = objArr.length;
        int i9 = this.f33435c;
        if (length < i9 || (i8 = this.f33434b) < 0) {
            return;
        }
        this.f33434b = i9;
        if (i8 >= i9) {
            return;
        }
        do {
            consumer.accept(objArr[i8]);
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
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i8 = this.f33434b;
        if (i8 < 0 || i8 >= this.f33435c) {
            return false;
        }
        this.f33434b = i8 + 1;
        consumer.accept(this.f33433a[i8]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f33434b;
        int i9 = (this.f33435c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f33434b = i9;
        return new l0(this.f33433a, i8, i9, this.f33436d);
    }
}
