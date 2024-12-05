package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3107n implements Collector {

    /* renamed from: a, reason: collision with root package name */
    private final Supplier f33774a;

    /* renamed from: b, reason: collision with root package name */
    private final BiConsumer f33775b;

    /* renamed from: c, reason: collision with root package name */
    private final BinaryOperator f33776c;

    /* renamed from: d, reason: collision with root package name */
    private final Function f33777d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f33778e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3107n(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this(supplier, biConsumer, binaryOperator, new C3097l(2), Collectors.f33480a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3107n(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f33774a = supplier;
        this.f33775b = biConsumer;
        this.f33776c = binaryOperator;
        this.f33777d = function;
        this.f33778e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f33775b;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f33778e;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f33776c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f33777d;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f33774a;
    }
}
