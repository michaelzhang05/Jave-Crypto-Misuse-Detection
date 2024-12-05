package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3092k implements java.util.stream.Collector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f33762a;

    private /* synthetic */ C3092k(Collector collector) {
        this.f33762a = collector;
    }

    public static /* synthetic */ java.util.stream.Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C3087j ? ((C3087j) collector).f33757a : new C3092k(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f33762a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC3163z0.R(this.f33762a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f33762a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f33762a;
        if (obj instanceof C3092k) {
            obj = ((C3092k) obj).f33762a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f33762a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33762a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f33762a.supplier();
    }
}
