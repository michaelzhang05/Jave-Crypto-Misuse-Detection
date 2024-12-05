package s;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3982c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39169a;

    private C3982c(String str) {
        if (str != null) {
            this.f39169a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static C3982c b(String str) {
        return new C3982c(str);
    }

    public String a() {
        return this.f39169a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3982c)) {
            return false;
        }
        return this.f39169a.equals(((C3982c) obj).f39169a);
    }

    public int hashCode() {
        return this.f39169a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f39169a + "\"}";
    }
}
