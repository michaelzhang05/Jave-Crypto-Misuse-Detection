package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q0 extends S0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f33584k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q0(AbstractC3047b abstractC3047b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i8) {
        super(abstractC3047b, spliterator, longFunction, binaryOperator);
        this.f33584k = i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.S0, j$.util.stream.AbstractC3062e
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f33584k) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.S0, j$.util.stream.AbstractC3062e
    public final AbstractC3062e e(Spliterator spliterator) {
        switch (this.f33584k) {
            case 0:
                return new S0(this, spliterator);
            case 1:
                return new S0(this, spliterator);
            case 2:
                return new S0(this, spliterator);
            default:
                return new S0(this, spliterator);
        }
    }
}
