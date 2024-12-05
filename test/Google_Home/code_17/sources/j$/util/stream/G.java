package j$.util.stream;

import j$.util.C3170x;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface G extends InterfaceC3077h {
    G a();

    j$.util.C average();

    G b(C3042a c3042a);

    Stream boxed();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    G distinct();

    boolean f();

    j$.util.C findAny();

    j$.util.C findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    InterfaceC3118p0 g();

    j$.util.I iterator();

    boolean l();

    G limit(long j8);

    G map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.C max();

    j$.util.C min();

    G parallel();

    G peek(DoubleConsumer doubleConsumer);

    IntStream q();

    double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator);

    G sequential();

    G skip(long j8);

    G sorted();

    @Override // j$.util.stream.InterfaceC3077h
    j$.util.W spliterator();

    double sum();

    C3170x summaryStatistics();

    double[] toArray();

    boolean u();
}
