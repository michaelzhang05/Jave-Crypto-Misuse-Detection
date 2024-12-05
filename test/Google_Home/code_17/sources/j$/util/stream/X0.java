package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class X0 extends N0 {
    @Override // j$.util.stream.L0
    public final void forEach(Consumer consumer) {
        this.f33554a.forEach(consumer);
        this.f33555b.forEach(consumer);
    }

    @Override // j$.util.stream.L0
    public final L0 g(long j8, long j9, IntFunction intFunction) {
        if (j8 == 0 && j9 == count()) {
            return this;
        }
        long count = this.f33554a.count();
        if (j8 >= count) {
            return this.f33555b.g(j8 - count, j9 - count, intFunction);
        }
        if (j9 <= count) {
            return this.f33554a.g(j8, j9, intFunction);
        }
        return AbstractC3163z0.I(EnumC3071f3.REFERENCE, this.f33554a.g(j8, count, intFunction), this.f33555b.g(0L, j9 - count, intFunction));
    }

    @Override // j$.util.stream.L0
    public final void h(Object[] objArr, int i8) {
        Objects.requireNonNull(objArr);
        L0 l02 = this.f33554a;
        l02.h(objArr, i8);
        this.f33555b.h(objArr, i8 + ((int) l02.count()));
    }

    @Override // j$.util.stream.L0
    public final Object[] n(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return new AbstractC3119p1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f33554a, this.f33555b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
