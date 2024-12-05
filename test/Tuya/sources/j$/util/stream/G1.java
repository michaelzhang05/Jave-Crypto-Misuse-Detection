package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class G1 implements V1, InterfaceC2960n2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f32307a;

    /* renamed from: b, reason: collision with root package name */
    private double f32308b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f32309c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f32309c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        if (this.f32307a) {
            this.f32307a = false;
        } else {
            d8 = this.f32309c.applyAsDouble(this.f32308b, d8);
        }
        this.f32308b = d8;
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
        G1 g12 = (G1) v12;
        if (g12.f32307a) {
            return;
        }
        accept(g12.f32308b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f32307a ? j$.util.C.a() : j$.util.C.d(this.f32308b);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32307a = true;
        this.f32308b = 0.0d;
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
