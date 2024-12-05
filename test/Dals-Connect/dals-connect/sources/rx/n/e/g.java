package rx.n.e;

/* compiled from: PlatformDependent.java */
/* loaded from: classes3.dex */
public final class g {
    private static final int a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f23107b;

    static {
        int c2 = c();
        a = c2;
        f23107b = c2 != 0;
    }

    public static int a() {
        return a;
    }

    public static boolean b() {
        return f23107b;
    }

    private static int c() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
