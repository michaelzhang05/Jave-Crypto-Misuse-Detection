package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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

/* renamed from: j$.util.stream.b3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3051b3 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Stream f33686a;

    private /* synthetic */ C3051b3(java.util.stream.Stream stream) {
        this.f33686a = stream;
    }

    public static /* synthetic */ Stream w(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C3051b3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f33686a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f33686a.anyMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream b(C3042a c3042a) {
        return w(this.f33686a.flatMap(AbstractC3163z0.S(c3042a)));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33686a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f33686a.collect(C3092k.a(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f33686a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f33686a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return w(this.f33686a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return w(this.f33686a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f33686a;
        if (obj instanceof C3051b3) {
            obj = ((C3051b3) obj).f33686a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return w(this.f33686a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B findAny() {
        return AbstractC3027d.i(this.f33686a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B findFirst() {
        return AbstractC3027d.i(this.f33686a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f33686a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f33686a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33686a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ boolean isParallel() {
        return this.f33686a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f33686a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC3118p0 k(C3042a c3042a) {
        return C3108n0.w(this.f33686a.flatMapToLong(AbstractC3163z0.S(c3042a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j8) {
        return w(this.f33686a.limit(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return w(this.f33686a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G mapToDouble(ToDoubleFunction toDoubleFunction) {
        return E.w(this.f33686a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f33686a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC3118p0 mapToLong(ToLongFunction toLongFunction) {
        return C3108n0.w(this.f33686a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B max(Comparator comparator) {
        return AbstractC3027d.i(this.f33686a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B min(Comparator comparator) {
        return AbstractC3027d.i(this.f33686a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f33686a.noneMatch(predicate);
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ InterfaceC3077h onClose(Runnable runnable) {
        return C3067f.w(this.f33686a.onClose(runnable));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream p(C3042a c3042a) {
        return IntStream.VivifiedWrapper.convert(this.f33686a.flatMapToInt(AbstractC3163z0.S(c3042a)));
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3077h parallel() {
        return C3067f.w(this.f33686a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return w(this.f33686a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B reduce(BinaryOperator binaryOperator) {
        return AbstractC3027d.i(this.f33686a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f33686a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f33686a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3077h sequential() {
        return C3067f.w(this.f33686a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j8) {
        return w(this.f33686a.skip(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return w(this.f33686a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return w(this.f33686a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f33686a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return w(this.f33686a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f33686a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f33686a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ InterfaceC3077h unordered() {
        return C3067f.w(this.f33686a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G v(C3042a c3042a) {
        return E.w(this.f33686a.flatMapToDouble(AbstractC3163z0.S(c3042a)));
    }
}
