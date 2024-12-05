package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.n0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3108n0 implements InterfaceC3118p0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f33779a;

    private /* synthetic */ C3108n0(LongStream longStream) {
        this.f33779a = longStream;
    }

    public static /* synthetic */ InterfaceC3118p0 w(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C3113o0 ? ((C3113o0) longStream).f33785a : new C3108n0(longStream);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ InterfaceC3118p0 a() {
        return w(this.f33779a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ G asDoubleStream() {
        return E.w(this.f33779a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ j$.util.C average() {
        return AbstractC3027d.j(this.f33779a.average());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final InterfaceC3118p0 b(C3042a c3042a) {
        LongStream longStream = this.f33779a;
        C3042a c3042a2 = new C3042a(10);
        c3042a2.f33668b = c3042a;
        return w(longStream.flatMap(c3042a2));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ Stream boxed() {
        return C3051b3.w(this.f33779a.boxed());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ InterfaceC3118p0 c() {
        return w(this.f33779a.map(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33779a.close();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f33779a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ long count() {
        return this.f33779a.count();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ InterfaceC3118p0 distinct() {
        return w(this.f33779a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f33779a;
        if (obj instanceof C3108n0) {
            obj = ((C3108n0) obj).f33779a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ j$.util.E findAny() {
        return AbstractC3027d.l(this.f33779a.findAny());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ j$.util.E findFirst() {
        return AbstractC3027d.l(this.f33779a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f33779a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f33779a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ G h() {
        return E.w(this.f33779a.mapToDouble(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f33779a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ boolean isParallel() {
        return this.f33779a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC3118p0, j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ j$.util.Q iterator() {
        return j$.util.O.a(this.f33779a.iterator());
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f33779a.iterator();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ boolean j() {
        return this.f33779a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ InterfaceC3118p0 limit(long j8) {
        return w(this.f33779a.limit(j8));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C3051b3.w(this.f33779a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ j$.util.E max() {
        return AbstractC3027d.l(this.f33779a.max());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ j$.util.E min() {
        return AbstractC3027d.l(this.f33779a.min());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ boolean n() {
        return this.f33779a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ InterfaceC3077h onClose(Runnable runnable) {
        return C3067f.w(this.f33779a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3077h parallel() {
        return C3067f.w(this.f33779a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3118p0, j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3118p0 parallel() {
        return w(this.f33779a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ InterfaceC3118p0 peek(LongConsumer longConsumer) {
        return w(this.f33779a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        return this.f33779a.reduce(j8, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC3027d.l(this.f33779a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ boolean s() {
        return this.f33779a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3077h sequential() {
        return C3067f.w(this.f33779a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3118p0, j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3118p0 sequential() {
        return w(this.f33779a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ InterfaceC3118p0 skip(long j8) {
        return w(this.f33779a.skip(j8));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ InterfaceC3118p0 sorted() {
        return w(this.f33779a.sorted());
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f33779a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC3118p0, j$.util.stream.InterfaceC3077h
    public final /* synthetic */ j$.util.c0 spliterator() {
        return j$.util.a0.a(this.f33779a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ long sum() {
        return this.f33779a.sum();
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final j$.util.A summaryStatistics() {
        this.f33779a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ IntStream t() {
        return IntStream.VivifiedWrapper.convert(this.f33779a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC3118p0
    public final /* synthetic */ long[] toArray() {
        return this.f33779a.toArray();
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ InterfaceC3077h unordered() {
        return C3067f.w(this.f33779a.unordered());
    }
}
