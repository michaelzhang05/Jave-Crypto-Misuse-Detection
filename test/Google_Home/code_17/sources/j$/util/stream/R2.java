package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R2 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    int f33594a;

    /* renamed from: b, reason: collision with root package name */
    final int f33595b;

    /* renamed from: c, reason: collision with root package name */
    int f33596c;

    /* renamed from: d, reason: collision with root package name */
    final int f33597d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f33598e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3046a3 f33599f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(C3046a3 c3046a3, int i8, int i9, int i10, int i11) {
        this.f33599f = c3046a3;
        this.f33594a = i8;
        this.f33595b = i9;
        this.f33596c = i10;
        this.f33597d = i11;
        Object[][] objArr = c3046a3.f33673f;
        this.f33598e = objArr == null ? c3046a3.f33672e : objArr[i8];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i8 = this.f33594a;
        int i9 = this.f33597d;
        int i10 = this.f33595b;
        if (i8 == i10) {
            return i9 - this.f33596c;
        }
        long[] jArr = this.f33599f.f33695d;
        return ((jArr[i10] + i9) - jArr[i8]) - this.f33596c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C3046a3 c3046a3;
        Objects.requireNonNull(consumer);
        int i8 = this.f33594a;
        int i9 = this.f33597d;
        int i10 = this.f33595b;
        if (i8 < i10 || (i8 == i10 && this.f33596c < i9)) {
            int i11 = this.f33596c;
            while (true) {
                c3046a3 = this.f33599f;
                if (i8 >= i10) {
                    break;
                }
                Object[] objArr = c3046a3.f33673f[i8];
                while (i11 < objArr.length) {
                    consumer.accept(objArr[i11]);
                    i11++;
                }
                i8++;
                i11 = 0;
            }
            Object[] objArr2 = this.f33594a == i10 ? this.f33598e : c3046a3.f33673f[i10];
            while (i11 < i9) {
                consumer.accept(objArr2[i11]);
                i11++;
            }
            this.f33594a = i10;
            this.f33596c = i9;
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
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i8 = this.f33594a;
        int i9 = this.f33595b;
        if (i8 >= i9 && (i8 != i9 || this.f33596c >= this.f33597d)) {
            return false;
        }
        Object[] objArr = this.f33598e;
        int i10 = this.f33596c;
        this.f33596c = i10 + 1;
        consumer.accept(objArr[i10]);
        if (this.f33596c == this.f33598e.length) {
            this.f33596c = 0;
            int i11 = this.f33594a + 1;
            this.f33594a = i11;
            Object[][] objArr2 = this.f33599f.f33673f;
            if (objArr2 != null && i11 <= i9) {
                this.f33598e = objArr2[i11];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f33594a;
        int i9 = this.f33595b;
        if (i8 < i9) {
            int i10 = i9 - 1;
            int i11 = this.f33596c;
            C3046a3 c3046a3 = this.f33599f;
            R2 r22 = new R2(c3046a3, i8, i10, i11, c3046a3.f33673f[i10].length);
            this.f33594a = i9;
            this.f33596c = 0;
            this.f33598e = c3046a3.f33673f[i9];
            return r22;
        }
        if (i8 != i9) {
            return null;
        }
        int i12 = this.f33596c;
        int i13 = (this.f33597d - i12) / 2;
        if (i13 == 0) {
            return null;
        }
        Spliterator m8 = j$.util.u0.m(this.f33598e, i12, i12 + i13);
        this.f33596c += i13;
        return m8;
    }
}
