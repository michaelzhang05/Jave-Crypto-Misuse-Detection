package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3090j2 implements InterfaceC3110n2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3125q2 f33760a;

    public AbstractC3090j2(InterfaceC3125q2 interfaceC3125q2) {
        this.f33760a = (InterfaceC3125q2) Objects.requireNonNull(interfaceC3125q2);
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public void j() {
        this.f33760a.j();
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public void k(long j8) {
        this.f33760a.k(j8);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public boolean m() {
        return this.f33760a.m();
    }

    @Override // j$.util.stream.InterfaceC3110n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3163z0.e(this, d8);
    }
}
