package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2935i2 extends AbstractC2897b implements Stream {
    @Override // j$.util.stream.AbstractC2897b
    final L0 B(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3013z0.E(abstractC2897b, spliterator, z8, intFunction);
    }

    @Override // j$.util.stream.AbstractC2897b
    final boolean D(Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        boolean m8;
        do {
            m8 = interfaceC2975q2.m();
            if (m8) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC2975q2));
        return m8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final EnumC2921f3 E() {
        return EnumC2921f3.REFERENCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3013z0.D(j8, intFunction);
    }

    @Override // j$.util.stream.AbstractC2897b
    final Spliterator Q(AbstractC2897b abstractC2897b, Supplier supplier, boolean z8) {
        return new AbstractC2926g3(abstractC2897b, supplier, z8);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC3013z0.d0(EnumC3001w0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC3013z0.d0(EnumC3001w0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream b(C2892a c2892a) {
        Objects.requireNonNull(c2892a);
        return new C2920f2(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n | EnumC2916e3.f32529t, c2892a, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object z8;
        if (isParallel() && collector.characteristics().contains(EnumC2932i.CONCURRENT) && (!H() || collector.characteristics().contains(EnumC2932i.UNORDERED))) {
            z8 = collector.supplier().get();
            forEach(new C2952m(4, collector.accumulator(), z8));
        } else {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            z8 = z(new M1(EnumC2921f3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        }
        return collector.characteristics().contains(EnumC2932i.IDENTITY_FINISH) ? z8 : collector.finisher().apply(z8);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return z(new F1(EnumC2921f3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) z(new H1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new AbstractC2930h2(this, EnumC2916e3.f32522m | EnumC2916e3.f32529t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i8 = U3.f32449a;
        Objects.requireNonNull(predicate);
        return new Q3(this, U3.f32450b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C2996v(this, EnumC2916e3.f32529t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B findAny() {
        return (j$.util.B) z(L.f32344d);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B findFirst() {
        return (j$.util.B) z(L.f32343c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z(new S(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z(new S(consumer, true));
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final Iterator iterator() {
        return j$.util.u0.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC2968p0 k(C2892a c2892a) {
        Objects.requireNonNull(c2892a);
        return new C2938j0(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n | EnumC2916e3.f32529t, c2892a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3013z0.e0(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C2920f2(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final G mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C3000w(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new Y(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC2968p0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C2938j0(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(0, comparator));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(1, comparator));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC3013z0.d0(EnumC3001w0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final IntStream p(C2892a c2892a) {
        Objects.requireNonNull(c2892a);
        return new Y(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n | EnumC2916e3.f32529t, c2892a, 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C2996v(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (j$.util.B) z(new D1(EnumC2921f3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return z(new F1(EnumC2921f3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return z(new F1(EnumC2921f3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3013z0.e0(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new L2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i8 = U3.f32449a;
        Objects.requireNonNull(predicate);
        return new O3(this, U3.f32449a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C2918f0(9));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC3013z0.N(A(intFunction), intFunction).n(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final G v(C2892a c2892a) {
        Objects.requireNonNull(c2892a);
        return new C3000w(this, EnumC2916e3.f32525p | EnumC2916e3.f32523n | EnumC2916e3.f32529t, c2892a, 4);
    }
}
