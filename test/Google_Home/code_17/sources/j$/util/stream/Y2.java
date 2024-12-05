package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class Y2 implements j$.util.f0 {

    /* renamed from: a, reason: collision with root package name */
    int f33658a;

    /* renamed from: b, reason: collision with root package name */
    final int f33659b;

    /* renamed from: c, reason: collision with root package name */
    int f33660c;

    /* renamed from: d, reason: collision with root package name */
    final int f33661d;

    /* renamed from: e, reason: collision with root package name */
    Object f33662e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Z2 f33663f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y2(Z2 z22, int i8, int i9, int i10, int i11) {
        this.f33663f = z22;
        this.f33658a = i8;
        this.f33659b = i9;
        this.f33660c = i10;
        this.f33661d = i11;
        Object[] objArr = z22.f33666f;
        this.f33662e = objArr == null ? z22.f33665e : objArr[i8];
    }

    abstract void a(int i8, Object obj, Object obj2);

    abstract j$.util.f0 b(Object obj, int i8, int i9);

    abstract j$.util.f0 c(int i8, int i9, int i10, int i11);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i8 = this.f33658a;
        int i9 = this.f33661d;
        int i10 = this.f33659b;
        if (i8 == i10) {
            return i9 - this.f33660c;
        }
        long[] jArr = this.f33663f.f33695d;
        return ((jArr[i10] + i9) - jArr[i8]) - this.f33660c;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        Z2 z22;
        Objects.requireNonNull(obj);
        int i8 = this.f33658a;
        int i9 = this.f33661d;
        int i10 = this.f33659b;
        if (i8 < i10 || (i8 == i10 && this.f33660c < i9)) {
            int i11 = this.f33660c;
            while (true) {
                z22 = this.f33663f;
                if (i8 >= i10) {
                    break;
                }
                Object obj2 = z22.f33666f[i8];
                z22.r(obj2, i11, z22.s(obj2), obj);
                i8++;
                i11 = 0;
            }
            z22.r(this.f33658a == i10 ? this.f33662e : z22.f33666f[i10], i11, i9, obj);
            this.f33658a = i10;
            this.f33660c = i9;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
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

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i8 = this.f33658a;
        int i9 = this.f33659b;
        if (i8 >= i9 && (i8 != i9 || this.f33660c >= this.f33661d)) {
            return false;
        }
        Object obj2 = this.f33662e;
        int i10 = this.f33660c;
        this.f33660c = i10 + 1;
        a(i10, obj2, obj);
        int i11 = this.f33660c;
        Object obj3 = this.f33662e;
        Z2 z22 = this.f33663f;
        if (i11 == z22.s(obj3)) {
            this.f33660c = 0;
            int i12 = this.f33658a + 1;
            this.f33658a = i12;
            Object[] objArr = z22.f33666f;
            if (objArr != null && i12 <= i9) {
                this.f33662e = objArr[i12];
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        int i8 = this.f33658a;
        int i9 = this.f33659b;
        if (i8 < i9) {
            int i10 = i9 - 1;
            int i11 = this.f33660c;
            Z2 z22 = this.f33663f;
            j$.util.f0 c8 = c(i8, i10, i11, z22.s(z22.f33666f[i10]));
            this.f33658a = i9;
            this.f33660c = 0;
            this.f33662e = z22.f33666f[i9];
            return c8;
        }
        if (i8 != i9) {
            return null;
        }
        int i12 = this.f33660c;
        int i13 = (this.f33661d - i12) / 2;
        if (i13 == 0) {
            return null;
        }
        j$.util.f0 b8 = b(this.f33662e, i12, i13);
        this.f33660c += i13;
        return b8;
    }
}
