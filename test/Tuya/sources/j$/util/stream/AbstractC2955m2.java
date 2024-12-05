package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2955m2 implements InterfaceC2975q2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC2975q2 f32578a;

    public AbstractC2955m2(InterfaceC2975q2 interfaceC2975q2) {
        this.f32578a = (InterfaceC2975q2) Objects.requireNonNull(interfaceC2975q2);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3013z0.a();
        throw null;
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public void j() {
        this.f32578a.j();
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public void k(long j8) {
        this.f32578a.k(j8);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public boolean m() {
        return this.f32578a.m();
    }
}
