package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2945k2 implements InterfaceC2965o2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC2975q2 f32569a;

    public AbstractC2945k2(InterfaceC2975q2 interfaceC2975q2) {
        this.f32569a = (InterfaceC2975q2) Objects.requireNonNull(interfaceC2975q2);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3013z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2975q2, j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3013z0.l();
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

    @Override // j$.util.stream.InterfaceC2975q2
    public void j() {
        this.f32569a.j();
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public void k(long j8) {
        this.f32569a.k(j8);
    }

    @Override // j$.util.stream.InterfaceC2965o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3013z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public boolean m() {
        return this.f32569a.m();
    }
}
