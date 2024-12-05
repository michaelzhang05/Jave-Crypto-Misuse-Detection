package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class F1 extends AbstractC3163z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33494h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f33495i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Object f33496j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Object f33497k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(EnumC3071f3 enumC3071f3, Object obj, Object obj2, Object obj3, int i8) {
        super(enumC3071f3);
        this.f33494h = i8;
        this.f33495i = obj;
        this.f33497k = obj2;
        this.f33496j = obj3;
    }

    public /* synthetic */ F1(EnumC3071f3 enumC3071f3, BinaryOperator binaryOperator, Object obj, Supplier supplier, int i8) {
        this.f33494h = i8;
        this.f33495i = binaryOperator;
        this.f33497k = obj;
        this.f33496j = supplier;
    }

    @Override // j$.util.stream.AbstractC3163z0
    public final V1 f0() {
        switch (this.f33494h) {
            case 0:
                return new C1((Supplier) this.f33496j, (ObjLongConsumer) this.f33497k, (BinaryOperator) this.f33495i);
            case 1:
                return new I1((Supplier) this.f33496j, (ObjDoubleConsumer) this.f33497k, (BinaryOperator) this.f33495i);
            case 2:
                return new K1(this.f33496j, (BiFunction) this.f33497k, (BinaryOperator) this.f33495i);
            case 3:
                return new O1((Supplier) this.f33496j, (BiConsumer) this.f33497k, (BiConsumer) this.f33495i);
            default:
                return new S1((Supplier) this.f33496j, (ObjIntConsumer) this.f33497k, (BinaryOperator) this.f33495i);
        }
    }
}
