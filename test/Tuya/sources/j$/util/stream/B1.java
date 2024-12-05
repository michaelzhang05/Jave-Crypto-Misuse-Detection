package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class B1 extends AbstractC3013z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f32276h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f32277i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(EnumC2921f3 enumC2921f3, LongBinaryOperator longBinaryOperator, long j8) {
        super(enumC2921f3);
        this.f32276h = longBinaryOperator;
        this.f32277i = j8;
    }

    @Override // j$.util.stream.AbstractC3013z0
    public final V1 f0() {
        return new T1(this.f32277i, this.f32276h);
    }
}
