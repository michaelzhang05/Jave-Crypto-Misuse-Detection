package o5;

/* renamed from: o5.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3672l {

    /* renamed from: a, reason: collision with root package name */
    public static final C3672l f36501a = new C3672l();

    /* renamed from: b, reason: collision with root package name */
    private static String f36502b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f36503c = "";

    private C3672l() {
    }

    public final String a() {
        String str = f36502b;
        if (str.length() == 0) {
            return "https://www.uptodown.app:443";
        }
        return str;
    }

    public final String b() {
        String str = f36503c;
        if (str.length() == 0) {
            return "https://t.uptodown.app:443";
        }
        return str;
    }

    public final String c() {
        return "https://u.uptodown.app:443";
    }
}
