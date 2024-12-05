package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.m0 */
/* loaded from: classes2.dex */
abstract class AbstractC3103m0 extends AbstractC3047b implements InterfaceC3118p0 {
    public static /* bridge */ /* synthetic */ j$.util.c0 U(Spliterator spliterator) {
        return V(spliterator);
    }

    public static j$.util.c0 V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.c0) {
            return (j$.util.c0) spliterator;
        }
        if (!N3.f33562a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        N3.a(AbstractC3047b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC3047b
    final L0 B(AbstractC3047b abstractC3047b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3163z0.H(abstractC3047b, spliterator, z8);
    }

    @Override // j$.util.stream.AbstractC3047b
    final boolean D(Spliterator spliterator, InterfaceC3125q2 interfaceC3125q2) {
        LongConsumer c3063e0;
        boolean m8;
        j$.util.c0 V7 = V(spliterator);
        if (interfaceC3125q2 instanceof LongConsumer) {
            c3063e0 = (LongConsumer) interfaceC3125q2;
        } else {
            if (N3.f33562a) {
                N3.a(AbstractC3047b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3125q2);
            c3063e0 = new C3063e0(interfaceC3125q2);
        }
        do {
            m8 = interfaceC3125q2.m();
            if (m8) {
                break;
            }
        } while (V7.tryAdvance(c3063e0));
        return m8;
    }

    @Override // j$.util.stream.AbstractC3047b
    public final EnumC3071f3 E() {
        return EnumC3071f3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC3047b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3163z0.V(j8);
    }

    @Override // j$.util.stream.AbstractC3047b
    final Spliterator Q(AbstractC3047b abstractC3047b, Supplier supplier, boolean z8) {
        return new AbstractC3076g3(abstractC3047b, supplier, z8);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 a() {
        Objects.requireNonNull(null);
        return new C3158y(this, EnumC3066e3.f33723t, 5);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final G asDoubleStream() {
        return new A(this, EnumC3066e3.f33717n, 4);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final j$.util.C average() {
        long j8 = ((long[]) collect(new C3068f0(2), new C3068f0(3), new C3068f0(4)))[0];
        return j8 > 0 ? j$.util.C.d(r0[1] / j8) : j$.util.C.a();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 b(C3042a c3042a) {
        Objects.requireNonNull(c3042a);
        return new C3088j0(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n | EnumC3066e3.f33723t, c3042a, 0);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final Stream boxed() {
        return new C3146v(this, 0, new C3068f0(1), 2);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 c() {
        Objects.requireNonNull(null);
        return new C3158y(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n, 3);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3136t c3136t = new C3136t(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c3136t);
        return z(new F1(EnumC3071f3.LONG_VALUE, (BinaryOperator) c3136t, (Object) objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final long count() {
        return ((Long) z(new H1(0))).longValue();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 distinct() {
        return ((AbstractC3085i2) ((AbstractC3085i2) boxed()).distinct()).mapToLong(new C3112o(28));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final j$.util.E findAny() {
        return (j$.util.E) z(K.f33533d);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final j$.util.E findFirst() {
        return (j$.util.E) z(K.f33532c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new Q(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new Q(longConsumer, true));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final G h() {
        Objects.requireNonNull(null);
        return new A(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n, 5);
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final j$.util.Q iterator() {
        return j$.util.u0.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final boolean j() {
        return ((Boolean) z(AbstractC3163z0.c0(EnumC3151w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3163z0.b0(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C3146v(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final j$.util.E max() {
        return reduce(new C3068f0(5));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final j$.util.E min() {
        return reduce(new C3112o(27));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final boolean n() {
        return ((Boolean) z(AbstractC3163z0.c0(EnumC3151w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C3088j0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) z(new B1(EnumC3071f3.LONG_VALUE, longBinaryOperator, j8))).longValue();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.E) z(new D1(EnumC3071f3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final boolean s() {
        return ((Boolean) z(AbstractC3163z0.c0(EnumC3151w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3163z0.b0(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 sorted() {
        return new AbstractC3098l0(this, EnumC3066e3.f33720q | EnumC3066e3.f33718o, 0);
    }

    @Override // j$.util.stream.AbstractC3047b, j$.util.stream.InterfaceC3077h
    public final j$.util.c0 spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final long sum() {
        return reduce(0L, new C3068f0(6));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final j$.util.A summaryStatistics() {
        return (j$.util.A) collect(new C3097l(23), new C3112o(26), new C3112o(29));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final IntStream t() {
        Objects.requireNonNull(null);
        return new C3154x(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n, 4);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final long[] toArray() {
        return (long[]) AbstractC3163z0.Q((J0) A(new C3068f0(0))).d();
    }
}
