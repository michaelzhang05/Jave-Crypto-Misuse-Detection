package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class D1 extends AbstractC3013z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32288h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f32289i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(EnumC2921f3 enumC2921f3, Object obj, int i8) {
        super(enumC2921f3);
        this.f32288h = i8;
        this.f32289i = obj;
    }

    @Override // j$.util.stream.AbstractC3013z0
    public final V1 f0() {
        switch (this.f32288h) {
            case 0:
                return new U1((LongBinaryOperator) this.f32289i);
            case 1:
                return new G1((DoubleBinaryOperator) this.f32289i);
            case 2:
                return new L1((BinaryOperator) this.f32289i);
            default:
                return new R1((IntBinaryOperator) this.f32289i);
        }
    }
}
