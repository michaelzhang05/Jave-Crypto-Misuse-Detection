package N1;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class h implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f7527b = new h("JOSE");

    /* renamed from: c, reason: collision with root package name */
    public static final h f7528c = new h("JOSE+JSON");

    /* renamed from: d, reason: collision with root package name */
    public static final h f7529d = new h("JWT");

    /* renamed from: a, reason: collision with root package name */
    private final String f7530a;

    public h(String str) {
        if (str != null) {
            this.f7530a = str;
            return;
        }
        throw new IllegalArgumentException("The object type must not be null");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof h) && this.f7530a.equalsIgnoreCase(((h) obj).f7530a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7530a.toLowerCase().hashCode();
    }

    public String toString() {
        return this.f7530a;
    }
}
