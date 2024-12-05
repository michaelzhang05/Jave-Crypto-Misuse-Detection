package K1;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class h implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f5748b = new h("JOSE");

    /* renamed from: c, reason: collision with root package name */
    public static final h f5749c = new h("JOSE+JSON");

    /* renamed from: d, reason: collision with root package name */
    public static final h f5750d = new h("JWT");

    /* renamed from: a, reason: collision with root package name */
    private final String f5751a;

    public h(String str) {
        if (str != null) {
            this.f5751a = str;
            return;
        }
        throw new IllegalArgumentException("The object type must not be null");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof h) && this.f5751a.equalsIgnoreCase(((h) obj).f5751a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5751a.toLowerCase().hashCode();
    }

    public String toString() {
        return this.f5751a;
    }
}
