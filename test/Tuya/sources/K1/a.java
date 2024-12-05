package K1;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5717c = new a("none", x.REQUIRED);

    /* renamed from: a, reason: collision with root package name */
    private final String f5718a;

    /* renamed from: b, reason: collision with root package name */
    private final x f5719b;

    public a(String str, x xVar) {
        if (str != null) {
            this.f5718a = str;
            this.f5719b = xVar;
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
        return this.f5718a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5718a.hashCode();
    }

    public final String toString() {
        return this.f5718a;
    }

    public a(String str) {
        this(str, null);
    }
}
