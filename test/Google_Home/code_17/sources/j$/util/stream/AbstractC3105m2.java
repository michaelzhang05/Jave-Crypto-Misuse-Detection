package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3105m2 implements InterfaceC3125q2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3125q2 f33772a;

    public AbstractC3105m2(InterfaceC3125q2 interfaceC3125q2) {
        this.f33772a = (InterfaceC3125q2) Objects.requireNonNull(interfaceC3125q2);
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public void j() {
        this.f33772a.j();
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public void k(long j8) {
        this.f33772a.k(j8);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public boolean m() {
        return this.f33772a.m();
    }
}
