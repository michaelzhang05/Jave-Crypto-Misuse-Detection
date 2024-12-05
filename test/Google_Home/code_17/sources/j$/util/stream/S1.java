package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class S1 extends W1 implements V1, InterfaceC3115o2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f33609b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjIntConsumer f33610c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f33611d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S1(Supplier supplier, ObjIntConsumer objIntConsumer, BinaryOperator binaryOperator) {
        this.f33609b = supplier;
        this.f33610c = objIntConsumer;
        this.f33611d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3163z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        this.f33610c.accept(this.f33650a, i8);
    }

    @Override // j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3163z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f33650a = this.f33611d.apply(this.f33650a, ((S1) v12).f33650a);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33650a = this.f33609b.get();
    }

    @Override // j$.util.stream.InterfaceC3115o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3163z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
