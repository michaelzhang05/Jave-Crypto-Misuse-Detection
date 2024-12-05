package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class T implements K3, L3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32426a;

    /* JADX INFO: Access modifiers changed from: protected */
    public T(boolean z8) {
        this.f32426a = z8;
    }

    public /* synthetic */ void accept(double d8) {
        AbstractC3013z0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i8) {
        AbstractC3013z0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j8) {
        AbstractC3013z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K3
    public final int d() {
        if (this.f32426a) {
            return 0;
        }
        return EnumC2916e3.f32527r;
    }

    public final void e(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        (this.f32426a ? new U(abstractC2897b, spliterator, this) : new V(abstractC2897b, spliterator, abstractC2897b.S(this))).invoke();
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void k(long j8) {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
