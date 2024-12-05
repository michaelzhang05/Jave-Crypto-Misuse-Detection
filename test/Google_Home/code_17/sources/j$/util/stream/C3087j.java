package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3087j implements Collector {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Collector f33757a;

    private /* synthetic */ C3087j(java.util.stream.Collector collector) {
        this.f33757a = collector;
    }

    public static /* synthetic */ Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C3092k ? ((C3092k) collector).f33762a : new C3087j(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f33757a.accumulator();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC3163z0.R(this.f33757a.characteristics());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f33757a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Collector collector = this.f33757a;
        if (obj instanceof C3087j) {
            obj = ((C3087j) obj).f33757a;
        }
        return collector.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f33757a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33757a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f33757a.supplier();
    }
}
