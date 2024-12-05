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
abstract class AbstractC2953m0 extends AbstractC2897b implements InterfaceC2968p0 {
    public static /* bridge */ /* synthetic */ j$.util.c0 U(Spliterator spliterator) {
        return V(spliterator);
    }

    public static j$.util.c0 V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.c0) {
            return (j$.util.c0) spliterator;
        }
        if (!N3.f32368a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        N3.a(AbstractC2897b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC2897b
    final L0 B(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3013z0.H(abstractC2897b, spliterator, z8);
    }

    @Override // j$.util.stream.AbstractC2897b
    final boolean D(Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        LongConsumer c2913e0;
        boolean m8;
        j$.util.c0 V7 = V(spliterator);
        if (interfaceC2975q2 instanceof LongConsumer) {
            c2913e0 = (LongConsumer) interfaceC2975q2;
        } else {
            if (N3.f32368a) {
                N3.a(AbstractC2897b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2975q2);
            c2913e0 = new C2913e0(interfaceC2975q2);
        }
        do {
            m8 = interfaceC2975q2.m();
            if (m8) {
                break;
            }
        } while (V7.tryAdvance(c2913e0));
        return m8;
    }

    @Override // j$.util.stream.AbstractC2897b
    public final EnumC2921f3 E() {
        return EnumC2921f3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC2897b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3013z0.V(j8);
    }

    @Override // j$.util.stream.AbstractC2897b
    final Spliterator Q(AbstractC2897b abstractC2897b, Supplier supplier, boolean z8) {
        return new AbstractC2926g3(abstractC2897b, supplier, z8);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 a() {
        Objects.requireNonNull(null);
        return new C3008y(this, EnumC2916e3.f32529t, 5);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final G asDoubleStream() {
        return new A(this, EnumC2916e3.f32523n, 4);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final j$.util.C average() {
        long j8 = ((long[]) collect(new C2918f0(2), new C2918f0(3), new C2918f0(4)))[0];
        return j8 > 0 ? j$.util.C.d(r0[1] / j8) : j$.util.C.a();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 b(C2892a c2892a) {
        Objects.requireNonNull(c2892a);
        return new C2938j0(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n | EnumC2916e3.f32529t, c2892a, 0);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final Stream boxed() {
        return new C2996v(this, 0, new C2918f0(1), 2);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 c() {
        Objects.requireNonNull(null);
        return new C3008y(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, 3);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C2986t c2986t = new C2986t(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c2986t);
        return z(new F1(EnumC2921f3.LONG_VALUE, (BinaryOperator) c2986t, (Object) objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final long count() {
        return ((Long) z(new H1(0))).longValue();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 distinct() {
        return ((AbstractC2935i2) ((AbstractC2935i2) boxed()).distinct()).mapToLong(new C2962o(28));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final j$.util.E findAny() {
        return (j$.util.E) z(K.f32339d);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final j$.util.E findFirst() {
        return (j$.util.E) z(K.f32338c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new Q(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new Q(longConsumer, true));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final G h() {
        Objects.requireNonNull(null);
        return new A(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, 5);
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final j$.util.Q iterator() {
        return j$.util.u0.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final boolean j() {
        return ((Boolean) z(AbstractC3013z0.c0(EnumC3001w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3013z0.b0(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C2996v(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final j$.util.E max() {
        return reduce(new C2918f0(5));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final j$.util.E min() {
        return reduce(new C2962o(27));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final boolean n() {
        return ((Boolean) z(AbstractC3013z0.c0(EnumC3001w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C2938j0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) z(new B1(EnumC2921f3.LONG_VALUE, longBinaryOperator, j8))).longValue();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.E) z(new D1(EnumC2921f3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final boolean s() {
        return ((Boolean) z(AbstractC3013z0.c0(EnumC3001w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3013z0.b0(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 sorted() {
        return new AbstractC2948l0(this, EnumC2916e3.f32526q | EnumC2916e3.f32524o, 0);
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h
    public final j$.util.c0 spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final long sum() {
        return reduce(0L, new C2918f0(6));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final j$.util.A summaryStatistics() {
        return (j$.util.A) collect(new C2947l(23), new C2962o(26), new C2962o(29));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final IntStream t() {
        Objects.requireNonNull(null);
        return new C3004x(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, 4);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final long[] toArray() {
        return (long[]) AbstractC3013z0.Q((J0) A(new C2918f0(0))).d();
    }
}
