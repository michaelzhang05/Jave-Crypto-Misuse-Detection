package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class M implements L3 {

    /* renamed from: a, reason: collision with root package name */
    boolean f33544a;

    /* renamed from: b, reason: collision with root package name */
    Object f33545b;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void o(Object obj) {
        if (this.f33544a) {
            return;
        }
        this.f33544a = true;
        this.f33545b = obj;
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
        return this.f33544a;
    }
}
