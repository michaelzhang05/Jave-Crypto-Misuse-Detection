package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.C3170x;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements G {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f33485a;

    private /* synthetic */ E(DoubleStream doubleStream) {
        this.f33485a = doubleStream;
    }

    public static /* synthetic */ G w(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof F ? ((F) doubleStream).f33493a : new E(doubleStream);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G a() {
        return w(this.f33485a.filter(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C average() {
        return AbstractC3027d.j(this.f33485a.average());
    }

    @Override // j$.util.stream.G
    public final G b(C3042a c3042a) {
        DoubleStream doubleStream = this.f33485a;
        C3042a c3042a2 = new C3042a(8);
        c3042a2.f33668b = c3042a;
        return w(doubleStream.flatMap(c3042a2));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream boxed() {
        return C3051b3.w(this.f33485a.boxed());
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33485a.close();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f33485a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ long count() {
        return this.f33485a.count();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G distinct() {
        return w(this.f33485a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f33485a;
        if (obj instanceof E) {
            obj = ((E) obj).f33485a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean f() {
        return this.f33485a.allMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C findAny() {
        return AbstractC3027d.j(this.f33485a.findAny());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C findFirst() {
        return AbstractC3027d.j(this.f33485a.findFirst());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f33485a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f33485a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC3118p0 g() {
        return C3108n0.w(this.f33485a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f33485a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ boolean isParallel() {
        return this.f33485a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.I iterator() {
        return j$.util.G.a(this.f33485a.iterator());
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f33485a.iterator();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean l() {
        return this.f33485a.anyMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G limit(long j8) {
        return w(this.f33485a.limit(j8));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G map(DoubleUnaryOperator doubleUnaryOperator) {
        return w(this.f33485a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C3051b3.w(this.f33485a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C max() {
        return AbstractC3027d.j(this.f33485a.max());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C min() {
        return AbstractC3027d.j(this.f33485a.min());
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ InterfaceC3077h onClose(Runnable runnable) {
        return C3067f.w(this.f33485a.onClose(runnable));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G parallel() {
        return w(this.f33485a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3077h parallel() {
        return C3067f.w(this.f33485a.parallel());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G peek(DoubleConsumer doubleConsumer) {
        return w(this.f33485a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ IntStream q() {
        return IntStream.VivifiedWrapper.convert(this.f33485a.mapToInt(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f33485a.reduce(d8, doubleBinaryOperator);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC3027d.j(this.f33485a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sequential() {
        return w(this.f33485a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3077h sequential() {
        return C3067f.w(this.f33485a.sequential());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G skip(long j8) {
        return w(this.f33485a.skip(j8));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sorted() {
        return w(this.f33485a.sorted());
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f33485a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.G, j$.util.stream.InterfaceC3077h
    public final /* synthetic */ j$.util.W spliterator() {
        return j$.util.U.a(this.f33485a.spliterator());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double sum() {
        return this.f33485a.sum();
    }

    @Override // j$.util.stream.G
    public final C3170x summaryStatistics() {
        this.f33485a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double[] toArray() {
        return this.f33485a.toArray();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean u() {
        return this.f33485a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ InterfaceC3077h unordered() {
        return C3067f.w(this.f33485a.unordered());
    }
}
