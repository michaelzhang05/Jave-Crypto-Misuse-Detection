package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
final class Q1 extends AbstractC3013z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f32391h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f32392i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(EnumC2921f3 enumC2921f3, IntBinaryOperator intBinaryOperator, int i8) {
        super(enumC2921f3);
        this.f32391h = intBinaryOperator;
        this.f32392i = i8;
    }

    @Override // j$.util.stream.AbstractC3013z0
    public final V1 f0() {
        return new P1(this.f32392i, this.f32391h);
    }
}
