package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2966o3 implements InterfaceC2960n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f32593b;

    public /* synthetic */ C2966o3(DoubleConsumer doubleConsumer, int i8) {
        this.f32592a = i8;
        this.f32593b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j8) {
    }

    private final /* synthetic */ void c(long j8) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC2960n2, j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        switch (this.f32592a) {
            case 0:
                ((T2) this.f32593b).accept(d8);
                return;
            default:
                this.f32593b.accept(d8);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void accept(int i8) {
        switch (this.f32592a) {
            case 0:
                AbstractC3013z0.k();
                throw null;
            default:
                AbstractC3013z0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2975q2, j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        switch (this.f32592a) {
            case 0:
                AbstractC3013z0.l();
                throw null;
            default:
                AbstractC3013z0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f32592a) {
            case 0:
                o((Double) obj);
                return;
            default:
                o((Double) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f32592a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f32592a) {
            case 0:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
        int i8 = this.f32592a;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void k(long j8) {
        int i8 = this.f32592a;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ boolean m() {
        switch (this.f32592a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC2960n2
    public final /* synthetic */ void o(Double d8) {
        switch (this.f32592a) {
            case 0:
                AbstractC3013z0.e(this, d8);
                return;
            default:
                AbstractC3013z0.e(this, d8);
                return;
        }
    }
}
