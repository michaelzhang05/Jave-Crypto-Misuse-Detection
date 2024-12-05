package N1;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7496c = new a("none", x.REQUIRED);

    /* renamed from: a, reason: collision with root package name */
    private final String f7497a;

    /* renamed from: b, reason: collision with root package name */
    private final x f7498b;

    public a(String str, x xVar) {
        if (str != null) {
            this.f7497a = str;
            this.f7498b = xVar;
            return;
        }
        throw new IllegalArgumentException("The algorithm name must not be null");
    }

    public static a b(String str) {
        if (str == null) {
            return null;
        }
        return new a(str);
    }

    public final String a() {
        return this.f7497a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7497a.hashCode();
    }

    public final String toString() {
        return this.f7497a;
    }

    public a(String str) {
        this(str, null);
    }
}
