package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class O0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    final Object[] f33564a;

    /* renamed from: b, reason: collision with root package name */
    int f33565b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O0(long j8, IntFunction intFunction) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33564a = (Object[]) intFunction.apply((int) j8);
        this.f33565b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public O0(Object[] objArr) {
        this.f33564a = objArr;
        this.f33565b = objArr.length;
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return this.f33565b;
    }

    @Override // j$.util.stream.L0
    public final void forEach(Consumer consumer) {
        for (int i8 = 0; i8 < this.f33565b; i8++) {
            consumer.accept(this.f33564a[i8]);
        }
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3163z0.w(this, j8, j9, intFunction);
    }

    @Override // j$.util.stream.L0
    public final void h(Object[] objArr, int i8) {
        System.arraycopy(this.f33564a, 0, objArr, i8, this.f33565b);
    }

    @Override // j$.util.stream.L0
    public final Object[] n(IntFunction intFunction) {
        Object[] objArr = this.f33564a;
        if (objArr.length == this.f33565b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return j$.util.u0.m(this.f33564a, 0, this.f33565b);
    }

    public String toString() {
        Object[] objArr = this.f33564a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f33565b), Arrays.toString(objArr));
    }
}
