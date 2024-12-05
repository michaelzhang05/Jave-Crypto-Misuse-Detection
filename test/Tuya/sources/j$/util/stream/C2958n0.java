package j$.util.stream;

import j$.util.AbstractC2877d;
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
public final /* synthetic */ class C2958n0 implements InterfaceC2968p0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f32585a;

    private /* synthetic */ C2958n0(LongStream longStream) {
        this.f32585a = longStream;
    }

    public static /* synthetic */ InterfaceC2968p0 w(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C2963o0 ? ((C2963o0) longStream).f32591a : new C2958n0(longStream);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ InterfaceC2968p0 a() {
        return w(this.f32585a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ G asDoubleStream() {
        return E.w(this.f32585a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ j$.util.C average() {
        return AbstractC2877d.j(this.f32585a.average());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final InterfaceC2968p0 b(C2892a c2892a) {
        LongStream longStream = this.f32585a;
        C2892a c2892a2 = new C2892a(10);
        c2892a2.f32474b = c2892a;
        return w(longStream.flatMap(c2892a2));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ Stream boxed() {
        return C2901b3.w(this.f32585a.boxed());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ InterfaceC2968p0 c() {
        return w(this.f32585a.map(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f32585a.close();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f32585a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ long count() {
        return this.f32585a.count();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ InterfaceC2968p0 distinct() {
        return w(this.f32585a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f32585a;
        if (obj instanceof C2958n0) {
            obj = ((C2958n0) obj).f32585a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ j$.util.E findAny() {
        return AbstractC2877d.l(this.f32585a.findAny());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ j$.util.E findFirst() {
        return AbstractC2877d.l(this.f32585a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f32585a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f32585a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ G h() {
        return E.w(this.f32585a.mapToDouble(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f32585a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ boolean isParallel() {
        return this.f32585a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC2968p0, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ j$.util.Q iterator() {
        return j$.util.O.a(this.f32585a.iterator());
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f32585a.iterator();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ boolean j() {
        return this.f32585a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ InterfaceC2968p0 limit(long j8) {
        return w(this.f32585a.limit(j8));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C2901b3.w(this.f32585a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ j$.util.E max() {
        return AbstractC2877d.l(this.f32585a.max());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ j$.util.E min() {
        return AbstractC2877d.l(this.f32585a.min());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ boolean n() {
        return this.f32585a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ InterfaceC2927h onClose(Runnable runnable) {
        return C2917f.w(this.f32585a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2927h parallel() {
        return C2917f.w(this.f32585a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2968p0, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2968p0 parallel() {
        return w(this.f32585a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ InterfaceC2968p0 peek(LongConsumer longConsumer) {
        return w(this.f32585a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        return this.f32585a.reduce(j8, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC2877d.l(this.f32585a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ boolean s() {
        return this.f32585a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2927h sequential() {
        return C2917f.w(this.f32585a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2968p0, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2968p0 sequential() {
        return w(this.f32585a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ InterfaceC2968p0 skip(long j8) {
        return w(this.f32585a.skip(j8));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ InterfaceC2968p0 sorted() {
        return w(this.f32585a.sorted());
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f32585a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC2968p0, j$.util.stream.InterfaceC2927h
    public final /* synthetic */ j$.util.c0 spliterator() {
        return j$.util.a0.a(this.f32585a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ long sum() {
        return this.f32585a.sum();
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final j$.util.A summaryStatistics() {
        this.f32585a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ IntStream t() {
        return IntStream.VivifiedWrapper.convert(this.f32585a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC2968p0
    public final /* synthetic */ long[] toArray() {
        return this.f32585a.toArray();
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ InterfaceC2927h unordered() {
        return C2917f.w(this.f32585a.unordered());
    }
}
