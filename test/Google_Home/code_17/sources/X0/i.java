package X0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i implements U0.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12737a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12738b = false;

    /* renamed from: c, reason: collision with root package name */
    private U0.c f12739c;

    /* renamed from: d, reason: collision with root package name */
    private final f f12740d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f12740d = fVar;
    }

    private void a() {
        if (!this.f12737a) {
            this.f12737a = true;
            return;
        }
        throw new U0.b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(U0.c cVar, boolean z8) {
        this.f12737a = false;
        this.f12739c = cVar;
        this.f12738b = z8;
    }

    @Override // U0.g
    public U0.g e(String str) {
        a();
        this.f12740d.i(this.f12739c, str, this.f12738b);
        return this;
    }

    @Override // U0.g
    public U0.g f(boolean z8) {
        a();
        this.f12740d.o(this.f12739c, z8, this.f12738b);
        return this;
    }
}
