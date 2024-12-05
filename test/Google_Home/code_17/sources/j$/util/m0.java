package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class m0 implements W {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f33439a;

    /* renamed from: b, reason: collision with root package name */
    private int f33440b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33441c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33442d;

    public m0(double[] dArr, int i8, int i9, int i10) {
        this.f33439a = dArr;
        this.f33440b = i8;
        this.f33441c = i9;
        this.f33442d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33442d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33441c - this.f33440b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3027d.a(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i8;
        doubleConsumer.getClass();
        double[] dArr = this.f33439a;
        int length = dArr.length;
        int i9 = this.f33441c;
        if (length < i9 || (i8 = this.f33440b) < 0) {
            return;
        }
        this.f33440b = i9;
        if (i8 >= i9) {
            return;
        }
        do {
            doubleConsumer.accept(dArr[i8]);
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
        return AbstractC3027d.f(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i8 = this.f33440b;
        if (i8 < 0 || i8 >= this.f33441c) {
            return false;
        }
        this.f33440b = i8 + 1;
        doubleConsumer.accept(this.f33439a[i8]);
        return true;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final W trySplit() {
        int i8 = this.f33440b;
        int i9 = (this.f33441c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f33440b = i9;
        return new m0(this.f33439a, i8, i9, this.f33442d);
    }
}
