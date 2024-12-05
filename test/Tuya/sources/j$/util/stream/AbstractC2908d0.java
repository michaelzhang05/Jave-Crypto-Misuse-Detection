package j$.util.stream;

import j$.util.C3021y;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.d0 */
/* loaded from: classes2.dex */
abstract class AbstractC2908d0 extends AbstractC2897b implements IntStream {
    public static /* bridge */ /* synthetic */ j$.util.Z U(Spliterator spliterator) {
        return V(spliterator);
    }

    public static j$.util.Z V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Z) {
            return (j$.util.Z) spliterator;
        }
        if (!N3.f32368a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        N3.a(AbstractC2897b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC2897b
    final L0 B(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3013z0.G(abstractC2897b, spliterator, z8);
    }

    @Override // j$.util.stream.AbstractC2897b
    final boolean D(Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        IntConsumer w8;
        boolean m8;
        j$.util.Z V7 = V(spliterator);
        if (interfaceC2975q2 instanceof IntConsumer) {
            w8 = (IntConsumer) interfaceC2975q2;
        } else {
            if (N3.f32368a) {
                N3.a(AbstractC2897b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2975q2);
            w8 = new W(interfaceC2975q2);
        }
        do {
            m8 = interfaceC2975q2.m();
            if (m8) {
                break;
            }
        } while (V7.tryAdvance(w8));
        return m8;
    }

    @Override // j$.util.stream.AbstractC2897b
    public final EnumC2921f3 E() {
        return EnumC2921f3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC2897b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3013z0.T(j8);
    }

    @Override // j$.util.stream.AbstractC2897b
    final Spliterator Q(AbstractC2897b abstractC2897b, Supplier supplier, boolean z8) {
        return new AbstractC2926g3(abstractC2897b, supplier, z8);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        Objects.requireNonNull(null);
        return new C3004x(this, EnumC2916e3.f32529t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final G asDoubleStream() {
        return new A(this, 0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC2968p0 asLongStream() {
        return new C3008y(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C average() {
        long j8 = ((long[]) collect(new C2962o(23), new C2962o(24), new C2962o(25)))[0];
        return j8 > 0 ? j$.util.C.d(r0[1] / j8) : j$.util.C.a();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C2996v(this, 0, new C2962o(17), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        Objects.requireNonNull(null);
        return new C3004x(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C2986t c2986t = new C2986t(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c2986t);
        return z(new F1(EnumC2921f3.INT_VALUE, (BinaryOperator) c2986t, (Object) objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) z(new H1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final G d() {
        Objects.requireNonNull(null);
        return new A(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC2935i2) ((AbstractC2935i2) boxed()).distinct()).mapToInt(new C2962o(16));
    }

    @Override // j$.util.stream.IntStream
    public final boolean e() {
        return ((Boolean) z(AbstractC3013z0.a0(EnumC3001w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D findAny() {
        return (j$.util.D) z(J.f32333d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D findFirst() {
        return (j$.util.D) z(J.f32332c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z(new P(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z(new P(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC2968p0 i() {
        Objects.requireNonNull(null);
        return new C3008y(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, 2);
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final j$.util.M iterator() {
        return j$.util.u0.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3013z0.Z(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream m(R0 r02) {
        Objects.requireNonNull(r02);
        return new Y(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n | EnumC2916e3.f32529t, r02, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C2996v(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D max() {
        return reduce(new C2962o(22));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D min() {
        return reduce(new C2962o(18));
    }

    @Override // j$.util.stream.IntStream
    public final boolean o() {
        return ((Boolean) z(AbstractC3013z0.a0(EnumC3001w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new Y(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) z(AbstractC3013z0.a0(EnumC3001w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i8, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) z(new Q1(EnumC2921f3.INT_VALUE, intBinaryOperator, i8))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.D) z(new D1(EnumC2921f3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3013z0.Z(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new AbstractC2903c0(this, EnumC2916e3.f32526q | EnumC2916e3.f32524o, 0);
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h
    public final j$.util.Z spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C2962o(21));
    }

    @Override // j$.util.stream.IntStream
    public final C3021y summaryStatistics() {
        return (C3021y) collect(new C2947l(22), new C2962o(19), new C2962o(20));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC3013z0.P((H0) A(new C2962o(15))).d();
    }
}
