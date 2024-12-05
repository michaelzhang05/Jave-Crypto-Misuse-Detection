package j$.util.stream;

import j$.util.AbstractC2877d;
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
public final /* synthetic */ class C2901b3 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Stream f32492a;

    private /* synthetic */ C2901b3(java.util.stream.Stream stream) {
        this.f32492a = stream;
    }

    public static /* synthetic */ Stream w(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C2901b3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f32492a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f32492a.anyMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream b(C2892a c2892a) {
        return w(this.f32492a.flatMap(AbstractC3013z0.S(c2892a)));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f32492a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f32492a.collect(C2942k.a(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f32492a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f32492a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return w(this.f32492a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return w(this.f32492a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f32492a;
        if (obj instanceof C2901b3) {
            obj = ((C2901b3) obj).f32492a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return w(this.f32492a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B findAny() {
        return AbstractC2877d.i(this.f32492a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B findFirst() {
        return AbstractC2877d.i(this.f32492a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f32492a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f32492a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32492a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ boolean isParallel() {
        return this.f32492a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f32492a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC2968p0 k(C2892a c2892a) {
        return C2958n0.w(this.f32492a.flatMapToLong(AbstractC3013z0.S(c2892a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j8) {
        return w(this.f32492a.limit(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return w(this.f32492a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G mapToDouble(ToDoubleFunction toDoubleFunction) {
        return E.w(this.f32492a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f32492a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC2968p0 mapToLong(ToLongFunction toLongFunction) {
        return C2958n0.w(this.f32492a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B max(Comparator comparator) {
        return AbstractC2877d.i(this.f32492a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B min(Comparator comparator) {
        return AbstractC2877d.i(this.f32492a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f32492a.noneMatch(predicate);
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ InterfaceC2927h onClose(Runnable runnable) {
        return C2917f.w(this.f32492a.onClose(runnable));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream p(C2892a c2892a) {
        return IntStream.VivifiedWrapper.convert(this.f32492a.flatMapToInt(AbstractC3013z0.S(c2892a)));
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2927h parallel() {
        return C2917f.w(this.f32492a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return w(this.f32492a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B reduce(BinaryOperator binaryOperator) {
        return AbstractC2877d.i(this.f32492a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f32492a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f32492a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2927h sequential() {
        return C2917f.w(this.f32492a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j8) {
        return w(this.f32492a.skip(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return w(this.f32492a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return w(this.f32492a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f32492a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return w(this.f32492a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f32492a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f32492a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ InterfaceC2927h unordered() {
        return C2917f.w(this.f32492a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G v(C2892a c2892a) {
        return E.w(this.f32492a.flatMapToDouble(AbstractC3013z0.S(c2892a)));
    }
}
