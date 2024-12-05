package j$.util.stream;

import j$.util.C3170x;
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
abstract class D extends AbstractC3047b implements G {
    public static /* bridge */ /* synthetic */ j$.util.W U(Spliterator spliterator) {
        return V(spliterator);
    }

    public static j$.util.W V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.W) {
            return (j$.util.W) spliterator;
        }
        if (!N3.f33562a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        N3.a(AbstractC3047b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC3047b
    final L0 B(AbstractC3047b abstractC3047b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3163z0.F(abstractC3047b, spliterator, z8);
    }

    @Override // j$.util.stream.AbstractC3047b
    final boolean D(Spliterator spliterator, InterfaceC3125q2 interfaceC3125q2) {
        DoubleConsumer c3131s;
        boolean m8;
        j$.util.W V7 = V(spliterator);
        if (interfaceC3125q2 instanceof DoubleConsumer) {
            c3131s = (DoubleConsumer) interfaceC3125q2;
        } else {
            if (N3.f33562a) {
                N3.a(AbstractC3047b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3125q2);
            c3131s = new C3131s(interfaceC3125q2);
        }
        do {
            m8 = interfaceC3125q2.m();
            if (m8) {
                break;
            }
        } while (V7.tryAdvance(c3131s));
        return m8;
    }

    @Override // j$.util.stream.AbstractC3047b
    public final EnumC3071f3 E() {
        return EnumC3071f3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC3047b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3163z0.J(j8);
    }

    @Override // j$.util.stream.AbstractC3047b
    final Spliterator Q(AbstractC3047b abstractC3047b, Supplier supplier, boolean z8) {
        return new AbstractC3076g3(abstractC3047b, supplier, z8);
    }

    @Override // j$.util.stream.G
    public final G a() {
        Objects.requireNonNull(null);
        return new A(this, EnumC3066e3.f33723t, 1);
    }

    @Override // j$.util.stream.G
    public final j$.util.C average() {
        double[] dArr = (double[]) collect(new C3112o(2), new C3097l(4), new C3097l(5));
        if (dArr[2] <= 0.0d) {
            return j$.util.C.a();
        }
        Set set = Collectors.f33480a;
        double d8 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        if (Double.isNaN(d8) && Double.isInfinite(d9)) {
            d8 = d9;
        }
        return j$.util.C.d(d8 / dArr[2]);
    }

    @Override // j$.util.stream.G
    public final G b(C3042a c3042a) {
        Objects.requireNonNull(c3042a);
        return new C3150w(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n | EnumC3066e3.f33723t, c3042a, 1);
    }

    @Override // j$.util.stream.G
    public final Stream boxed() {
        return new C3146v(this, 0, new C3112o(5), 0);
    }

    @Override // j$.util.stream.G
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3136t c3136t = new C3136t(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c3136t);
        return z(new F1(EnumC3071f3.DOUBLE_VALUE, (BinaryOperator) c3136t, (Object) objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.G
    public final long count() {
        return ((Long) z(new H1(1))).longValue();
    }

    @Override // j$.util.stream.G
    public final G distinct() {
        return ((AbstractC3085i2) ((AbstractC3085i2) boxed()).distinct()).mapToDouble(new C3112o(6));
    }

    @Override // j$.util.stream.G
    public final boolean f() {
        return ((Boolean) z(AbstractC3163z0.Y(EnumC3151w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final j$.util.C findAny() {
        return (j$.util.C) z(I.f33519d);
    }

    @Override // j$.util.stream.G
    public final j$.util.C findFirst() {
        return (j$.util.C) z(I.f33518c);
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
    public final InterfaceC3118p0 g() {
        Objects.requireNonNull(null);
        return new C3158y(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n, 0);
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final j$.util.I iterator() {
        return j$.util.u0.f(spliterator());
    }

    @Override // j$.util.stream.G
    public final boolean l() {
        return ((Boolean) z(AbstractC3163z0.Y(EnumC3151w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final G limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3163z0.X(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.G
    public final G map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new C3150w(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.G
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C3146v(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n, doubleFunction, 0);
    }

    @Override // j$.util.stream.G
    public final j$.util.C max() {
        return reduce(new C3112o(8));
    }

    @Override // j$.util.stream.G
    public final j$.util.C min() {
        return reduce(new C3112o(1));
    }

    @Override // j$.util.stream.G
    public final G peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C3150w(this, doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final IntStream q() {
        Objects.requireNonNull(null);
        return new C3154x(this, EnumC3066e3.f33719p | EnumC3066e3.f33717n, 0);
    }

    @Override // j$.util.stream.G
    public final double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) z(new J1(EnumC3071f3.DOUBLE_VALUE, doubleBinaryOperator, d8))).doubleValue();
    }

    @Override // j$.util.stream.G
    public final j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.C) z(new D1(EnumC3071f3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.G
    public final G skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3163z0.X(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.G
    public final G sorted() {
        return new C(this, EnumC3066e3.f33720q | EnumC3066e3.f33718o, 0);
    }

    @Override // j$.util.stream.AbstractC3047b, j$.util.stream.InterfaceC3077h
    public final j$.util.W spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.G
    public final double sum() {
        double[] dArr = (double[]) collect(new C3112o(9), new C3097l(6), new C3097l(3));
        Set set = Collectors.f33480a;
        double d8 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        return (Double.isNaN(d8) && Double.isInfinite(d9)) ? d9 : d8;
    }

    @Override // j$.util.stream.G
    public final C3170x summaryStatistics() {
        return (C3170x) collect(new C3097l(19), new C3112o(3), new C3112o(4));
    }

    @Override // j$.util.stream.G
    public final double[] toArray() {
        return (double[]) AbstractC3163z0.O((F0) A(new C3112o(7))).d();
    }

    @Override // j$.util.stream.G
    public final boolean u() {
        return ((Boolean) z(AbstractC3163z0.Y(EnumC3151w0.NONE))).booleanValue();
    }
}
