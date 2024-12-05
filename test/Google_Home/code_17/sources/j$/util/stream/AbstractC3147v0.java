package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3147v0 implements InterfaceC3125q2 {

    /* renamed from: a, reason: collision with root package name */
    boolean f33827a;

    /* renamed from: b, reason: collision with root package name */
    boolean f33828b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3147v0(EnumC3151w0 enumC3151w0) {
        boolean z8;
        z8 = enumC3151w0.f33837b;
        this.f33828b = !z8;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public /* synthetic */ void accept(double d8) {
        AbstractC3163z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public /* synthetic */ void accept(int i8) {
        AbstractC3163z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j8) {
        AbstractC3163z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void k(long j8) {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        return this.f33827a;
    }
}
