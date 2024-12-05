package R6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC1353u f8843a = new s0();

    /* renamed from: b, reason: collision with root package name */
    static final AbstractC1355w f8844b = new u0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1353u a(C1337e c1337e) {
        if (c1337e.f() < 1) {
            return f8843a;
        }
        return new s0(c1337e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1355w b(C1337e c1337e) {
        if (c1337e.f() < 1) {
            return f8844b;
        }
        return new u0(c1337e);
    }
}
