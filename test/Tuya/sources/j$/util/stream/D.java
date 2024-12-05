package j$.util.stream;

import j$.util.C3020x;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class D extends AbstractC2897b implements G {
    public static /* bridge */ /* synthetic */ j$.util.W U(Spliterator spliterator) {
        return V(spliterator);
    }

    public static j$.util.W V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.W) {
            return (j$.util.W) spliterator;
        }
        if (!N3.f32368a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        N3.a(AbstractC2897b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC2897b
    final L0 B(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3013z0.F(abstractC2897b, spliterator, z8);
    }

    @Override // j$.util.stream.AbstractC2897b
    final boolean D(Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        DoubleConsumer c2981s;
        boolean m8;
        j$.util.W V7 = V(spliterator);
        if (interfaceC2975q2 instanceof DoubleConsumer) {
            c2981s = (DoubleConsumer) interfaceC2975q2;
        } else {
            if (N3.f32368a) {
                N3.a(AbstractC2897b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2975q2);
            c2981s = new C2981s(interfaceC2975q2);
        }
        do {
            m8 = interfaceC2975q2.m();
            if (m8) {
                break;
            }
        } while (V7.tryAdvance(c2981s));
        return m8;
    }

    @Override // j$.util.stream.AbstractC2897b
    public final EnumC2921f3 E() {
        return EnumC2921f3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC2897b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3013z0.J(j8);
    }

    @Override // j$.util.stream.AbstractC2897b
    final Spliterator Q(AbstractC2897b abstractC2897b, Supplier supplier, boolean z8) {
        return new AbstractC2926g3(abstractC2897b, supplier, z8);
    }

    @Override // j$.util.stream.G
    public final G a() {
        Objects.requireNonNull(null);
        return new A(this, EnumC2916e3.f32529t, 1);
    }

    @Override // j$.util.stream.G
    public final j$.util.C average() {
        double[] dArr = (double[]) collect(new C2962o(2), new C2947l(4), new C2947l(5));
        if (dArr[2] <= 0.0d) {
            return j$.util.C.a();
        }
        Set set = Collectors.f32286a;
        double d8 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        if (Double.isNaN(d8) && Double.isInfinite(d9)) {
            d8 = d9;
        }
        return j$.util.C.d(d8 / dArr[2]);
    }

    @Override // j$.util.stream.G
    public final G b(C2892a c2892a) {
        Objects.requireNonNull(c2892a);
        return new C3000w(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n | EnumC2916e3.f32529t, c2892a, 1);
    }

    @Override // j$.util.stream.G
    public final Stream boxed() {
        return new C2996v(this, 0, new C2962o(5), 0);
    }

    @Override // j$.util.stream.G
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C2986t c2986t = new C2986t(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c2986t);
        return z(new F1(EnumC2921f3.DOUBLE_VALUE, (BinaryOperator) c2986t, (Object) objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.G
    public final long count() {
        return ((Long) z(new H1(1))).longValue();
    }

    @Override // j$.util.stream.G
    public final G distinct() {
        return ((AbstractC2935i2) ((AbstractC2935i2) boxed()).distinct()).mapToDouble(new C2962o(6));
    }

    @Override // j$.util.stream.G
    public final boolean f() {
        return ((Boolean) z(AbstractC3013z0.Y(EnumC3001w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final j$.util.C findAny() {
        return (j$.util.C) z(I.f32325d);
    }

    @Override // j$.util.stream.G
    public final j$.util.C findFirst() {
        return (j$.util.C) z(I.f32324c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z(new O(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z(new O(doubleConsumer, true));
    }

    @Override // j$.util.stream.G
    public final InterfaceC2968p0 g() {
        Objects.requireNonNull(null);
        return new C3008y(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, 0);
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final j$.util.I iterator() {
        return j$.util.u0.f(spliterator());
    }

    @Override // j$.util.stream.G
    public final boolean l() {
        return ((Boolean) z(AbstractC3013z0.Y(EnumC3001w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final G limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3013z0.X(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.G
    public final G map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new C3000w(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.G
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C2996v(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, doubleFunction, 0);
    }

    @Override // j$.util.stream.G
    public final j$.util.C max() {
        return reduce(new C2962o(8));
    }

    @Override // j$.util.stream.G
    public final j$.util.C min() {
        return reduce(new C2962o(1));
    }

    @Override // j$.util.stream.G
    public final G peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C3000w(this, doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final IntStream q() {
        Objects.requireNonNull(null);
        return new C3004x(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, 0);
    }

    @Override // j$.util.stream.G
    public final double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) z(new J1(EnumC2921f3.DOUBLE_VALUE, doubleBinaryOperator, d8))).doubleValue();
    }

    @Override // j$.util.stream.G
    public final j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.C) z(new D1(EnumC2921f3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.G
    public final G skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3013z0.X(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.G
    public final G sorted() {
        return new C(this, EnumC2916e3.f32526q | EnumC2916e3.f32524o, 0);
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h
    public final j$.util.W spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.G
    public final double sum() {
        double[] dArr = (double[]) collect(new C2962o(9), new C2947l(6), new C2947l(3));
        Set set = Collectors.f32286a;
        double d8 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        return (Double.isNaN(d8) && Double.isInfinite(d9)) ? d9 : d8;
    }

    @Override // j$.util.stream.G
    public final C3020x summaryStatistics() {
        return (C3020x) collect(new C2947l(19), new C2962o(3), new C2962o(4));
    }

    @Override // j$.util.stream.G
    public final double[] toArray() {
        return (double[]) AbstractC3013z0.O((F0) A(new C2962o(7))).d();
    }

    @Override // j$.util.stream.G
    public final boolean u() {
        return ((Boolean) z(AbstractC3013z0.Y(EnumC3001w0.NONE))).booleanValue();
    }
}
