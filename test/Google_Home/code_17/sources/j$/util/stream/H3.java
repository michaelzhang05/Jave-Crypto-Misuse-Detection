package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class H3 implements InterfaceC3125q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f33517b;

    public /* synthetic */ H3(Consumer consumer, int i8) {
        this.f33516a = i8;
        this.f33517b = consumer;
    }

    private final /* synthetic */ void b(long j8) {
    }

    private final /* synthetic */ void c(long j8) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void accept(double d8) {
        switch (this.f33516a) {
            case 0:
                AbstractC3163z0.a();
                throw null;
            default:
                AbstractC3163z0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void accept(int i8) {
        switch (this.f33516a) {
            case 0:
                AbstractC3163z0.k();
                throw null;
            default:
                AbstractC3163z0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        switch (this.f33516a) {
            case 0:
                AbstractC3163z0.l();
                throw null;
            default:
                AbstractC3163z0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        switch (this.f33516a) {
            case 0:
                ((C3046a3) this.f33517b).o(obj);
                return;
            default:
                this.f33517b.o(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33516a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
        int i8 = this.f33516a;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void k(long j8) {
        int i8 = this.f33516a;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ boolean m() {
        switch (this.f33516a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
