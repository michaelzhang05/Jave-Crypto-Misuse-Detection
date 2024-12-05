package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2997v0 implements InterfaceC2975q2 {

    /* renamed from: a, reason: collision with root package name */
    boolean f32633a;

    /* renamed from: b, reason: collision with root package name */
    boolean f32634b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2997v0(EnumC3001w0 enumC3001w0) {
        boolean z8;
        z8 = enumC3001w0.f32643b;
        this.f32634b = !z8;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public /* synthetic */ void accept(double d8) {
        AbstractC3013z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public /* synthetic */ void accept(int i8) {
        AbstractC3013z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2975q2, j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j8) {
        AbstractC3013z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void k(long j8) {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        return this.f32633a;
    }
}
