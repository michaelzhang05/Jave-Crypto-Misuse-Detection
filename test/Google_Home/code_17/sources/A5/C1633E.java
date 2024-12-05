package a5;

/* renamed from: a5.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1633E {

    /* renamed from: a, reason: collision with root package name */
    private String f13962a;

    /* renamed from: b, reason: collision with root package name */
    private String f13963b;

    public final String a() {
        return this.f13962a;
    }

    public final String b() {
        return this.f13963b;
    }

    public final void c(String str) {
        this.f13962a = str;
    }

    public final void d(String str) {
        this.f13963b = str;
    }

    public String toString() {
        return "RecentSearch{query=" + this.f13962a + ", timestamp='" + this.f13963b + "'}";
    }
}
