package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3079h1 implements H0 {

    /* renamed from: a, reason: collision with root package name */
    final int[] f33748a;

    /* renamed from: b, reason: collision with root package name */
    int f33749b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3079h1(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33748a = new int[(int) j8];
        this.f33749b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3079h1(int[] iArr) {
        this.f33748a = iArr;
        this.f33749b = iArr.length;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i8) {
        b(i8);
        throw null;
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return this.f33749b;
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        int[] iArr = this.f33748a;
        int length = iArr.length;
        int i8 = this.f33749b;
        return length == i8 ? iArr : Arrays.copyOf(iArr, i8);
    }

    @Override // j$.util.stream.K0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i8 = 0; i8 < this.f33749b; i8++) {
            intConsumer.accept(this.f33748a[i8]);
        }
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3163z0.r(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC3163z0.m(this, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final void q(int i8, Object obj) {
        int i9 = this.f33749b;
        System.arraycopy(this.f33748a, 0, (int[]) obj, i8, i9);
    }

    @Override // j$.util.stream.L0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(Integer[] numArr, int i8) {
        AbstractC3163z0.o(this, numArr, i8);
    }

    @Override // j$.util.stream.L0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ H0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3163z0.u(this, j8, j9);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return j$.util.u0.k(this.f33748a, 0, this.f33749b);
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return j$.util.u0.k(this.f33748a, 0, this.f33749b);
    }

    public String toString() {
        int[] iArr = this.f33748a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f33749b), Arrays.toString(iArr));
    }
}
