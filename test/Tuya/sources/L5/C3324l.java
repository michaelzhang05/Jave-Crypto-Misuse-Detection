package l5;

/* renamed from: l5.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3324l {

    /* renamed from: a, reason: collision with root package name */
    public static final C3324l f34500a = new C3324l();

    /* renamed from: b, reason: collision with root package name */
    private static String f34501b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f34502c = "";

    private C3324l() {
    }

    public final String a() {
        String str = f34501b;
        if (str.length() == 0) {
            return "https://www.uptodown.app:443";
        }
        return str;
    }

    public final String b() {
        String str = f34502c;
        if (str.length() == 0) {
            return "https://t.uptodown.app:443";
        }
        return str;
    }

    public final String c() {
        return "https://u.uptodown.app:443";
    }
}
