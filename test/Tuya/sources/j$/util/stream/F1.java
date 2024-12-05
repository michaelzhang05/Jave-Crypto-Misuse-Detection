package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class F1 extends AbstractC3013z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32300h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f32301i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Object f32302j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Object f32303k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(EnumC2921f3 enumC2921f3, Object obj, Object obj2, Object obj3, int i8) {
        super(enumC2921f3);
        this.f32300h = i8;
        this.f32301i = obj;
        this.f32303k = obj2;
        this.f32302j = obj3;
    }

    public /* synthetic */ F1(EnumC2921f3 enumC2921f3, BinaryOperator binaryOperator, Object obj, Supplier supplier, int i8) {
        this.f32300h = i8;
        this.f32301i = binaryOperator;
        this.f32303k = obj;
        this.f32302j = supplier;
    }

    @Override // j$.util.stream.AbstractC3013z0
    public final V1 f0() {
        switch (this.f32300h) {
            case 0:
                return new C1((Supplier) this.f32302j, (ObjLongConsumer) this.f32303k, (BinaryOperator) this.f32301i);
            case 1:
                return new I1((Supplier) this.f32302j, (ObjDoubleConsumer) this.f32303k, (BinaryOperator) this.f32301i);
            case 2:
                return new K1(this.f32302j, (BiFunction) this.f32303k, (BinaryOperator) this.f32301i);
            case 3:
                return new O1((Supplier) this.f32302j, (BiConsumer) this.f32303k, (BiConsumer) this.f32301i);
            default:
                return new S1((Supplier) this.f32302j, (ObjIntConsumer) this.f32303k, (BinaryOperator) this.f32301i);
        }
    }
}
