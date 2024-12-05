package q6;

/* loaded from: classes5.dex */
abstract /* synthetic */ class H {

    /* renamed from: a, reason: collision with root package name */
    private static final int f38366a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f38366a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
