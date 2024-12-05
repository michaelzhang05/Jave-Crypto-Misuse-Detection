package B1;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f774a;

    /* renamed from: b, reason: collision with root package name */
    private final String f775b;

    private l(String str, String str2) {
        this.f774a = str;
        this.f775b = str2;
    }

    public static l a(String str, String str2) {
        H1.g.f(str, "Name is null or empty");
        H1.g.f(str2, "Version is null or empty");
        return new l(str, str2);
    }

    public String b() {
        return this.f774a;
    }

    public String c() {
        return this.f775b;
    }
}
