package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class D1 extends AbstractC3163z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33482h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f33483i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(EnumC3071f3 enumC3071f3, Object obj, int i8) {
        super(enumC3071f3);
        this.f33482h = i8;
        this.f33483i = obj;
    }

    @Override // j$.util.stream.AbstractC3163z0
    public final V1 f0() {
        switch (this.f33482h) {
            case 0:
                return new U1((LongBinaryOperator) this.f33483i);
            case 1:
                return new G1((DoubleBinaryOperator) this.f33483i);
            case 2:
                return new L1((BinaryOperator) this.f33483i);
            default:
                return new R1((IntBinaryOperator) this.f33483i);
        }
    }
}
