package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class I1 extends W1 implements V1, InterfaceC3110n2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f33521b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f33522c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f33523d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BinaryOperator binaryOperator) {
        this.f33521b = supplier;
        this.f33522c = objDoubleConsumer;
        this.f33523d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        this.f33522c.accept(this.f33650a, d8);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void accept(int i8) {
        AbstractC3163z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3163z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f33650a = this.f33523d.apply(this.f33650a, ((I1) v12).f33650a);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33650a = this.f33521b.get();
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC3110n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3163z0.e(this, d8);
    }
}
