package j$.util.stream;

/* renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3149v2 extends AbstractC3100l2 {

    /* renamed from: b, reason: collision with root package name */
    long f33830b;

    /* renamed from: c, reason: collision with root package name */
    long f33831c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3153w2 f33832d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3149v2(C3153w2 c3153w2, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33832d = c3153w2;
        this.f33830b = c3153w2.f33839m;
        long j8 = c3153w2.f33840n;
        this.f33831c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long j9 = this.f33830b;
        if (j9 != 0) {
            this.f33830b = j9 - 1;
            return;
        }
        long j10 = this.f33831c;
        if (j10 > 0) {
            this.f33831c = j10 - 1;
            this.f33767a.accept(j8);
        }
    }

    @Override // j$.util.stream.AbstractC3100l2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33767a.k(AbstractC3163z0.A(j8, this.f33832d.f33839m, this.f33831c));
    }

    @Override // j$.util.stream.AbstractC3100l2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        return this.f33831c == 0 || this.f33767a.m();
    }
}
