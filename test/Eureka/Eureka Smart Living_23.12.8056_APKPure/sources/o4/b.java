package o4;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f8276a;

    private b() {
    }

    public static b b() {
        if (f8276a == null) {
            f8276a = new b();
        }
        return f8276a;
    }

    @Override // o4.a
    public long a() {
        return System.currentTimeMillis();
    }
}
