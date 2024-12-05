package f1;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2815b implements InterfaceC2814a {

    /* renamed from: a, reason: collision with root package name */
    private static C2815b f31855a;

    private C2815b() {
    }

    public static C2815b a() {
        if (f31855a == null) {
            f31855a = new C2815b();
        }
        return f31855a;
    }

    @Override // f1.InterfaceC2814a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
