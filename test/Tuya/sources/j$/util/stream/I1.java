package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class I1 extends W1 implements V1, InterfaceC2960n2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f32327b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f32328c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f32329d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BinaryOperator binaryOperator) {
        this.f32327b = supplier;
        this.f32328c = objDoubleConsumer;
        this.f32329d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        this.f32328c.accept(this.f32456a, d8);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void accept(int i8) {
        AbstractC3013z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2975q2, j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3013z0.l();
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
        this.f32456a = this.f32329d.apply(this.f32456a, ((I1) v12).f32456a);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32456a = this.f32327b.get();
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2960n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3013z0.e(this, d8);
    }
}
