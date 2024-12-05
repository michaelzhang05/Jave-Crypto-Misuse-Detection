package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class r0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f32254a;

    /* renamed from: b, reason: collision with root package name */
    private int f32255b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32256c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32257d;

    public r0(int[] iArr, int i8, int i9, int i10) {
        this.f32254a = iArr;
        this.f32255b = i8;
        this.f32256c = i9;
        this.f32257d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f32257d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f32256c - this.f32255b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2877d.b(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i8;
        intConsumer.getClass();
        int[] iArr = this.f32254a;
        int length = iArr.length;
        int i9 = this.f32256c;
        if (length < i9 || (i8 = this.f32255b) < 0) {
            return;
        }
        this.f32255b = i9;
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
        if (AbstractC2877d.e(this, 4)) {
            return null;
        }
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
        return AbstractC2877d.g(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i8 = this.f32255b;
        if (i8 < 0 || i8 >= this.f32256c) {
            return false;
        }
        this.f32255b = i8 + 1;
        intConsumer.accept(this.f32254a[i8]);
        return true;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final Z trySplit() {
        int i8 = this.f32255b;
        int i9 = (this.f32256c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f32255b = i9;
        return new r0(this.f32254a, i8, i9, this.f32257d);
    }
}
