package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2968p0 extends InterfaceC2927h {
    InterfaceC2968p0 a();

    G asDoubleStream();

    j$.util.C average();

    InterfaceC2968p0 b(C2892a c2892a);

    Stream boxed();

    InterfaceC2968p0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC2968p0 distinct();

    j$.util.E findAny();

    j$.util.E findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    G h();

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    j$.util.Q iterator();

    boolean j();

    InterfaceC2968p0 limit(long j8);

    Stream mapToObj(LongFunction longFunction);

    j$.util.E max();

    j$.util.E min();

    boolean n();

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    InterfaceC2968p0 parallel();

    InterfaceC2968p0 peek(LongConsumer longConsumer);

    long reduce(long j8, LongBinaryOperator longBinaryOperator);

    j$.util.E reduce(LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    InterfaceC2968p0 sequential();

    InterfaceC2968p0 skip(long j8);

    InterfaceC2968p0 sorted();

    @Override // j$.util.stream.InterfaceC2927h
    j$.util.c0 spliterator();

    long sum();

    j$.util.A summaryStatistics();

    IntStream t();

    long[] toArray();
}
