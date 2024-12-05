package g4;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements d4.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6790a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6791b = false;

    /* renamed from: c, reason: collision with root package name */
    private d4.c f6792c;

    /* renamed from: d, reason: collision with root package name */
    private final f f6793d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f6793d = fVar;
    }

    private void c() {
        if (this.f6790a) {
            throw new d4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6790a = true;
    }

    @Override // d4.g
    public d4.g a(String str) {
        c();
        this.f6793d.g(this.f6792c, str, this.f6791b);
        return this;
    }

    @Override // d4.g
    public d4.g b(boolean z5) {
        c();
        this.f6793d.l(this.f6792c, z5, this.f6791b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(d4.c cVar, boolean z5) {
        this.f6790a = false;
        this.f6792c = cVar;
        this.f6791b = z5;
    }
}
