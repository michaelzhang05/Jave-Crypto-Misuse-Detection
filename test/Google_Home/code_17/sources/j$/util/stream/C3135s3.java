package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3135s3 implements InterfaceC3120p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f33813b;

    public /* synthetic */ C3135s3(LongConsumer longConsumer, int i8) {
        this.f33812a = i8;
        this.f33813b = longConsumer;
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
        switch (this.f33812a) {
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
        switch (this.f33812a) {
            case 0:
                AbstractC3163z0.k();
                throw null;
            default:
                AbstractC3163z0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        switch (this.f33812a) {
            case 0:
                ((X2) this.f33813b).accept(j8);
                return;
            default:
                this.f33813b.accept(j8);
                return;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f33812a) {
            case 0:
                i((Long) obj);
                return;
            default:
                i((Long) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33812a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f33812a) {
            case 0:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
            default:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3120p2
    public final /* synthetic */ void i(Long l8) {
        switch (this.f33812a) {
            case 0:
                AbstractC3163z0.i(this, l8);
                return;
            default:
                AbstractC3163z0.i(this, l8);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
        int i8 = this.f33812a;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void k(long j8) {
        int i8 = this.f33812a;
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ boolean m() {
        switch (this.f33812a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
