package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3095k2 implements InterfaceC3115o2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3125q2 f33763a;

    public AbstractC3095k2(InterfaceC3125q2 interfaceC3125q2) {
        this.f33763a = (InterfaceC3125q2) Objects.requireNonNull(interfaceC3125q2);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3163z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3163z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public void j() {
        this.f33763a.j();
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public void k(long j8) {
        this.f33763a.k(j8);
    }

    @Override // j$.util.stream.InterfaceC3115o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3163z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public boolean m() {
        return this.f33763a.m();
    }
}
