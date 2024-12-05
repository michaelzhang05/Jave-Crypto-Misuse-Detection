package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class L1 implements V1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33539a;

    /* renamed from: b, reason: collision with root package name */
    private Object f33540b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f33541c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L1(BinaryOperator binaryOperator) {
        this.f33541c = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3163z0.a();
        throw null;
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
    public final void o(Object obj) {
        if (this.f33539a) {
            this.f33539a = false;
        } else {
            obj = this.f33541c.apply(this.f33540b, obj);
        }
        this.f33540b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        L1 l12 = (L1) v12;
        if (l12.f33539a) {
            return;
        }
        o(l12.f33540b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f33539a ? j$.util.B.a() : j$.util.B.d(this.f33540b);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33539a = true;
        this.f33540b = null;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
