package b1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f3815a;

    private b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f3815a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f3815a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f3815a.equals(((b) obj).f3815a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3815a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f3815a + "\"}";
    }
}
