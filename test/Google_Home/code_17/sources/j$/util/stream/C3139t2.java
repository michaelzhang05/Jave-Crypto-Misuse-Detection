package j$.util.stream;

/* renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3139t2 extends AbstractC3095k2 {

    /* renamed from: b, reason: collision with root package name */
    long f33817b;

    /* renamed from: c, reason: collision with root package name */
    long f33818c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3144u2 f33819d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3139t2(C3144u2 c3144u2, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33819d = c3144u2;
        this.f33817b = c3144u2.f33823m;
        long j8 = c3144u2.f33824n;
        this.f33818c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC3115o2, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        long j8 = this.f33817b;
        if (j8 != 0) {
            this.f33817b = j8 - 1;
            return;
        }
        long j9 = this.f33818c;
        if (j9 > 0) {
            this.f33818c = j9 - 1;
            this.f33763a.accept(i8);
        }
    }

    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33763a.k(AbstractC3163z0.A(j8, this.f33819d.f33823m, this.f33818c));
    }

    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        return this.f33818c == 0 || this.f33763a.m();
    }
}
