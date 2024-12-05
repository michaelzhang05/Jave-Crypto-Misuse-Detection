package j$.util.stream;

/* renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3129r2 extends AbstractC3105m2 {

    /* renamed from: b, reason: collision with root package name */
    long f33806b;

    /* renamed from: c, reason: collision with root package name */
    long f33807c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3134s2 f33808d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3129r2(C3134s2 c3134s2, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33808d = c3134s2;
        this.f33806b = c3134s2.f33810m;
        long j8 = c3134s2.f33811n;
        this.f33807c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        long j8 = this.f33806b;
        if (j8 != 0) {
            this.f33806b = j8 - 1;
            return;
        }
        long j9 = this.f33807c;
        if (j9 > 0) {
            this.f33807c = j9 - 1;
            this.f33772a.o((InterfaceC3125q2) obj);
        }
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33772a.k(AbstractC3163z0.A(j8, this.f33808d.f33810m, this.f33807c));
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        return this.f33807c == 0 || this.f33772a.m();
    }
}
