package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3100l2 implements InterfaceC3120p2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3125q2 f33767a;

    public AbstractC3100l2(InterfaceC3125q2 interfaceC3125q2) {
        this.f33767a = (InterfaceC3125q2) Objects.requireNonNull(interfaceC3125q2);
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3120p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3163z0.i(this, l8);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public void j() {
        this.f33767a.j();
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public void k(long j8) {
        this.f33767a.k(j8);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public boolean m() {
        return this.f33767a.m();
    }
}
