package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class M1 extends AbstractC3163z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f33547h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ BiConsumer f33548i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Supplier f33549j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Collector f33550k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(EnumC3071f3 enumC3071f3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(enumC3071f3);
        this.f33547h = binaryOperator;
        this.f33548i = biConsumer;
        this.f33549j = supplier;
        this.f33550k = collector;
    }

    @Override // j$.util.stream.AbstractC3163z0, j$.util.stream.K3
    public final int d() {
        if (this.f33550k.characteristics().contains(EnumC3082i.UNORDERED)) {
            return EnumC3066e3.f33721r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC3163z0
    public final V1 f0() {
        return new N1(this.f33549j, this.f33548i, this.f33547h);
    }
}
