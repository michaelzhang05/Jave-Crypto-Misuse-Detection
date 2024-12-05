package V0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i implements S0.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11848a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11849b = false;

    /* renamed from: c, reason: collision with root package name */
    private S0.c f11850c;

    /* renamed from: d, reason: collision with root package name */
    private final f f11851d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f11851d = fVar;
    }

    private void a() {
        if (!this.f11848a) {
            this.f11848a = true;
            return;
        }
        throw new S0.b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(S0.c cVar, boolean z8) {
        this.f11848a = false;
        this.f11850c = cVar;
        this.f11849b = z8;
    }

    @Override // S0.g
    public S0.g f(String str) {
        a();
        this.f11851d.i(this.f11850c, str, this.f11849b);
        return this;
    }

    @Override // S0.g
    public S0.g g(boolean z8) {
        a();
        this.f11851d.o(this.f11850c, z8, this.f11849b);
        return this;
    }
}
