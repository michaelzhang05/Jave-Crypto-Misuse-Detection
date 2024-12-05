package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class P1 implements V1, InterfaceC3115o2 {

    /* renamed from: a, reason: collision with root package name */
    private int f33574a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f33575b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f33576c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P1(int i8, IntBinaryOperator intBinaryOperator) {
        this.f33575b = i8;
        this.f33576c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3163z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        this.f33574a = this.f33576c.applyAsInt(this.f33574a, i8);
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
        accept(((P1) v12).f33574a);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f33574a);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33574a = this.f33575b;
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
