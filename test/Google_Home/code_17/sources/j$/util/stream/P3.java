package j$.util.stream;

/* loaded from: classes2.dex */
final class P3 extends AbstractC3105m2 {

    /* renamed from: b, reason: collision with root package name */
    long f33579b;

    /* renamed from: c, reason: collision with root package name */
    boolean f33580c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f33581d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q3 f33582e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(Q3 q32, InterfaceC3125q2 interfaceC3125q2, boolean z8) {
        super(interfaceC3125q2);
        this.f33582e = q32;
        this.f33581d = z8;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z8 = true;
        if (!this.f33580c) {
            boolean z9 = !this.f33582e.f33589m.test(obj);
            this.f33580c = z9;
            if (!z9) {
                z8 = false;
            }
        }
        boolean z10 = this.f33581d;
        if (z10 && !z8) {
            this.f33579b++;
        }
        if (z10 || z8) {
            this.f33772a.accept((InterfaceC3125q2) obj);
        }
    }
}
