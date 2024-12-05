package R1;

import j$.util.Objects;
import java.io.Serializable;
import java.text.ParseException;

/* loaded from: classes4.dex */
public final class h implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f8690b = new h("sig");

    /* renamed from: c, reason: collision with root package name */
    public static final h f8691c = new h("enc");

    /* renamed from: a, reason: collision with root package name */
    private final String f8692a;

    public h(String str) {
        if (str != null) {
            this.f8692a = str;
            return;
        }
        throw new IllegalArgumentException("The key use identifier must not be null");
    }

    public static h b(String str) {
        if (str == null) {
            return null;
        }
        h hVar = f8690b;
        if (str.equals(hVar.a())) {
            return hVar;
        }
        h hVar2 = f8691c;
        if (str.equals(hVar2.a())) {
            return hVar2;
        }
        if (!str.trim().isEmpty()) {
            return new h(str);
        }
        throw new ParseException("JWK use value must not be empty or blank", 0);
    }

    public String a() {
        return this.f8692a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return Objects.equals(this.f8692a, ((h) obj).f8692a);
    }

    public int hashCode() {
        return Objects.hash(this.f8692a);
    }

    public String toString() {
        return a();
    }
}
