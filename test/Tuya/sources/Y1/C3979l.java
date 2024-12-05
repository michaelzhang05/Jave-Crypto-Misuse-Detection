package y1;

/* renamed from: y1.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3979l {

    /* renamed from: a, reason: collision with root package name */
    private final String f39730a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39731b;

    private C3979l(String str, String str2) {
        this.f39730a = str;
        this.f39731b = str2;
    }

    public static C3979l a(String str, String str2) {
        E1.g.d(str, "Name is null or empty");
        E1.g.d(str2, "Version is null or empty");
        return new C3979l(str, str2);
    }

    public String b() {
        return this.f39730a;
    }

    public String c() {
        return this.f39731b;
    }
}
