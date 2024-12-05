package j$.util.stream;

/* renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2999v2 extends AbstractC2950l2 {

    /* renamed from: b, reason: collision with root package name */
    long f32636b;

    /* renamed from: c, reason: collision with root package name */
    long f32637c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3003w2 f32638d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2999v2(C3003w2 c3003w2, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32638d = c3003w2;
        this.f32636b = c3003w2.f32645m;
        long j8 = c3003w2.f32646n;
        this.f32637c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long j9 = this.f32636b;
        if (j9 != 0) {
            this.f32636b = j9 - 1;
            return;
        }
        long j10 = this.f32637c;
        if (j10 > 0) {
            this.f32637c = j10 - 1;
            this.f32573a.accept(j8);
        }
    }

    @Override // j$.util.stream.AbstractC2950l2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32573a.k(AbstractC3013z0.A(j8, this.f32638d.f32645m, this.f32637c));
    }

    @Override // j$.util.stream.AbstractC2950l2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        return this.f32637c == 0 || this.f32573a.m();
    }
}
