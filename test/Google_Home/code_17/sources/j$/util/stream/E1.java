package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class E1 implements V1, InterfaceC3110n2 {

    /* renamed from: a, reason: collision with root package name */
    private double f33487a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ double f33488b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f33489c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E1(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        this.f33488b = d8;
        this.f33489c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        this.f33487a = this.f33489c.applyAsDouble(this.f33487a, d8);
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
        accept(((E1) v12).f33487a);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f33487a);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33487a = this.f33488b;
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
