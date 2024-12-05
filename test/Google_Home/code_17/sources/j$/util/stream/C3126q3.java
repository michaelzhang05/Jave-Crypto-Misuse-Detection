package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3126q3 implements InterfaceC3115o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f33803b;

    public /* synthetic */ C3126q3(IntConsumer intConsumer, int i8) {
        this.f33802a = i8;
        this.f33803b = intConsumer;
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
        switch (this.f33802a) {
            case 0:
                AbstractC3163z0.a();
                throw null;
            default:
                AbstractC3163z0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3115o2, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        switch (this.f33802a) {
            case 0:
                ((V2) this.f33803b).accept(i8);
                return;
            default:
                this.f33803b.accept(i8);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        switch (this.f33802a) {
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
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f33802a) {
            case 0:
                l((Integer) obj);
                return;
            default:
                l((Integer) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33802a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f33802a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
        int i8 = this.f33802a;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void k(long j8) {
        int i8 = this.f33802a;
    }

    @Override // j$.util.stream.InterfaceC3115o2
    public final /* synthetic */ void l(Integer num) {
        switch (this.f33802a) {
            case 0:
                AbstractC3163z0.g(this, num);
                return;
            default:
                AbstractC3163z0.g(this, num);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ boolean m() {
        switch (this.f33802a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
