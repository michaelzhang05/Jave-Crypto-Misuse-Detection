package j$.util.stream;

/* renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3007x2 extends AbstractC2940j2 {

    /* renamed from: b, reason: collision with root package name */
    long f32657b;

    /* renamed from: c, reason: collision with root package name */
    long f32658c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3011y2 f32659d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3007x2(C3011y2 c3011y2, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32659d = c3011y2;
        this.f32657b = c3011y2.f32662m;
        long j8 = c3011y2.f32663n;
        this.f32658c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC2960n2, j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        long j8 = this.f32657b;
        if (j8 != 0) {
            this.f32657b = j8 - 1;
            return;
        }
        long j9 = this.f32658c;
        if (j9 > 0) {
            this.f32658c = j9 - 1;
            this.f32566a.accept(d8);
        }
    }

    @Override // j$.util.stream.AbstractC2940j2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32566a.k(AbstractC3013z0.A(j8, this.f32659d.f32662m, this.f32658c));
    }

    @Override // j$.util.stream.AbstractC2940j2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        return this.f32658c == 0 || this.f32566a.m();
    }
}
