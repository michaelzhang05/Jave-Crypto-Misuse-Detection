package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R2 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    int f32400a;

    /* renamed from: b, reason: collision with root package name */
    final int f32401b;

    /* renamed from: c, reason: collision with root package name */
    int f32402c;

    /* renamed from: d, reason: collision with root package name */
    final int f32403d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f32404e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2896a3 f32405f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(C2896a3 c2896a3, int i8, int i9, int i10, int i11) {
        this.f32405f = c2896a3;
        this.f32400a = i8;
        this.f32401b = i9;
        this.f32402c = i10;
        this.f32403d = i11;
        Object[][] objArr = c2896a3.f32479f;
        this.f32404e = objArr == null ? c2896a3.f32478e : objArr[i8];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i8 = this.f32400a;
        int i9 = this.f32403d;
        int i10 = this.f32401b;
        if (i8 == i10) {
            return i9 - this.f32402c;
        }
        long[] jArr = this.f32405f.f32501d;
        return ((jArr[i10] + i9) - jArr[i8]) - this.f32402c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C2896a3 c2896a3;
        Objects.requireNonNull(consumer);
        int i8 = this.f32400a;
        int i9 = this.f32403d;
        int i10 = this.f32401b;
        if (i8 < i10 || (i8 == i10 && this.f32402c < i9)) {
            int i11 = this.f32402c;
            while (true) {
                c2896a3 = this.f32405f;
                if (i8 >= i10) {
                    break;
                }
                Object[] objArr = c2896a3.f32479f[i8];
                while (i11 < objArr.length) {
                    consumer.accept(objArr[i11]);
                    i11++;
                }
                i8++;
                i11 = 0;
            }
            Object[] objArr2 = this.f32400a == i10 ? this.f32404e : c2896a3.f32479f[i10];
            while (i11 < i9) {
                consumer.accept(objArr2[i11]);
                i11++;
            }
            this.f32400a = i10;
            this.f32402c = i9;
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
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i8 = this.f32400a;
        int i9 = this.f32401b;
        if (i8 >= i9 && (i8 != i9 || this.f32402c >= this.f32403d)) {
            return false;
        }
        Object[] objArr = this.f32404e;
        int i10 = this.f32402c;
        this.f32402c = i10 + 1;
        consumer.accept(objArr[i10]);
        if (this.f32402c == this.f32404e.length) {
            this.f32402c = 0;
            int i11 = this.f32400a + 1;
            this.f32400a = i11;
            Object[][] objArr2 = this.f32405f.f32479f;
            if (objArr2 != null && i11 <= i9) {
                this.f32404e = objArr2[i11];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f32400a;
        int i9 = this.f32401b;
        if (i8 < i9) {
            int i10 = i9 - 1;
            int i11 = this.f32402c;
            C2896a3 c2896a3 = this.f32405f;
            R2 r22 = new R2(c2896a3, i8, i10, i11, c2896a3.f32479f[i10].length);
            this.f32400a = i9;
            this.f32402c = 0;
            this.f32404e = c2896a3.f32479f[i9];
            return r22;
        }
        if (i8 != i9) {
            return null;
        }
        int i12 = this.f32402c;
        int i13 = (this.f32403d - i12) / 2;
        if (i13 == 0) {
            return null;
        }
        Spliterator m8 = j$.util.u0.m(this.f32404e, i12, i12 + i13);
        this.f32402c += i13;
        return m8;
    }
}
