package kotlinx.coroutines.internal;

/* compiled from: SystemProps.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class x {
    private static final int a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
