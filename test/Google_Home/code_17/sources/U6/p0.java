package U6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC1462u f10469a = new s0();

    /* renamed from: b, reason: collision with root package name */
    static final AbstractC1464w f10470b = new u0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1462u a(C1446e c1446e) {
        if (c1446e.f() < 1) {
            return f10469a;
        }
        return new s0(c1446e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1464w b(C1446e c1446e) {
        if (c1446e.f() < 1) {
            return f10470b;
        }
        return new u0(c1446e);
    }
}
