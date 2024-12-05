package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
final class J1 extends AbstractC3013z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f32334h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ double f32335i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(EnumC2921f3 enumC2921f3, DoubleBinaryOperator doubleBinaryOperator, double d8) {
        super(enumC2921f3);
        this.f32334h = doubleBinaryOperator;
        this.f32335i = d8;
    }

    @Override // j$.util.stream.AbstractC3013z0
    public final V1 f0() {
        return new E1(this.f32335i, this.f32334h);
    }
}
