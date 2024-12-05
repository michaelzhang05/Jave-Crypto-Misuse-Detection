package j$.util.stream;

/* renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3157x2 extends AbstractC3090j2 {

    /* renamed from: b, reason: collision with root package name */
    long f33851b;

    /* renamed from: c, reason: collision with root package name */
    long f33852c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3161y2 f33853d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3157x2(C3161y2 c3161y2, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33853d = c3161y2;
        this.f33851b = c3161y2.f33856m;
        long j8 = c3161y2.f33857n;
        this.f33852c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC3110n2, j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        long j8 = this.f33851b;
        if (j8 != 0) {
            this.f33851b = j8 - 1;
            return;
        }
        long j9 = this.f33852c;
        if (j9 > 0) {
            this.f33852c = j9 - 1;
            this.f33760a.accept(d8);
        }
    }

    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33760a.k(AbstractC3163z0.A(j8, this.f33853d.f33856m, this.f33852c));
    }

    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        return this.f33852c == 0 || this.f33760a.m();
    }
}
