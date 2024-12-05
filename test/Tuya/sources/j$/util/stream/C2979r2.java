package j$.util.stream;

/* renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2979r2 extends AbstractC2955m2 {

    /* renamed from: b, reason: collision with root package name */
    long f32612b;

    /* renamed from: c, reason: collision with root package name */
    long f32613c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2984s2 f32614d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2979r2(C2984s2 c2984s2, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32614d = c2984s2;
        this.f32612b = c2984s2.f32616m;
        long j8 = c2984s2.f32617n;
        this.f32613c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        long j8 = this.f32612b;
        if (j8 != 0) {
            this.f32612b = j8 - 1;
            return;
        }
        long j9 = this.f32613c;
        if (j9 > 0) {
            this.f32613c = j9 - 1;
            this.f32578a.o((InterfaceC2975q2) obj);
        }
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32578a.k(AbstractC3013z0.A(j8, this.f32614d.f32616m, this.f32613c));
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        return this.f32613c == 0 || this.f32578a.m();
    }
}
