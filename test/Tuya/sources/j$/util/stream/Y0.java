package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Y0 implements F0 {

    /* renamed from: a, reason: collision with root package name */
    final double[] f32462a;

    /* renamed from: b, reason: collision with root package name */
    int f32463b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y0(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f32462a = new double[(int) j8];
        this.f32463b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y0(double[] dArr) {
        this.f32462a = dArr;
        this.f32463b = dArr.length;
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
        return this.f32463b;
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        double[] dArr = this.f32462a;
        int length = dArr.length;
        int i8 = this.f32463b;
        return length == i8 ? dArr : Arrays.copyOf(dArr, i8);
    }

    @Override // j$.util.stream.K0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i8 = 0; i8 < this.f32463b; i8++) {
            doubleConsumer.accept(this.f32462a[i8]);
        }
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3013z0.q(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC3013z0.m(this, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final void q(int i8, Object obj) {
        int i9 = this.f32463b;
        System.arraycopy(this.f32462a, 0, (double[]) obj, i8, i9);
    }

    @Override // j$.util.stream.L0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(Double[] dArr, int i8) {
        AbstractC3013z0.n(this, dArr, i8);
    }

    @Override // j$.util.stream.L0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ F0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3013z0.t(this, j8, j9);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return j$.util.u0.j(this.f32462a, 0, this.f32463b);
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return j$.util.u0.j(this.f32462a, 0, this.f32463b);
    }

    public String toString() {
        double[] dArr = this.f32462a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f32463b), Arrays.toString(dArr));
    }
}
