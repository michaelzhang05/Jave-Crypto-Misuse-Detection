package R1;

import K1.x;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class g implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final g f8684c = new g("EC", x.RECOMMENDED);

    /* renamed from: d, reason: collision with root package name */
    public static final g f8685d = new g("RSA", x.REQUIRED);

    /* renamed from: e, reason: collision with root package name */
    public static final g f8686e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f8687f;

    /* renamed from: a, reason: collision with root package name */
    private final String f8688a;

    /* renamed from: b, reason: collision with root package name */
    private final x f8689b;

    static {
        x xVar = x.OPTIONAL;
        f8686e = new g("oct", xVar);
        f8687f = new g("OKP", xVar);
    }

    public g(String str, x xVar) {
        if (str != null) {
            this.f8688a = str;
            this.f8689b = xVar;
            return;
        }
        throw new IllegalArgumentException("The key type value must not be null");
    }

    public static g b(String str) {
        if (str != null) {
            g gVar = f8684c;
            if (str.equals(gVar.a())) {
                return gVar;
            }
            g gVar2 = f8685d;
            if (str.equals(gVar2.a())) {
                return gVar2;
            }
            g gVar3 = f8686e;
            if (str.equals(gVar3.a())) {
                return gVar3;
            }
            g gVar4 = f8687f;
            if (str.equals(gVar4.a())) {
                return gVar4;
            }
            return new g(str, null);
        }
        throw new IllegalArgumentException("The key type to parse must not be null");
    }

    public String a() {
        return this.f8688a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof g) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8688a.hashCode();
    }

    public String toString() {
        return this.f8688a;
    }
}
