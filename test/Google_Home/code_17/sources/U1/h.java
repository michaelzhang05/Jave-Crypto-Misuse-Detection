package U1;

import j$.util.Objects;
import java.io.Serializable;
import java.text.ParseException;

/* loaded from: classes4.dex */
public final class h implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f10316b = new h("sig");

    /* renamed from: c, reason: collision with root package name */
    public static final h f10317c = new h("enc");

    /* renamed from: a, reason: collision with root package name */
    private final String f10318a;

    public h(String str) {
        if (str != null) {
            this.f10318a = str;
            return;
        }
        throw new IllegalArgumentException("The key use identifier must not be null");
    }

    public static h b(String str) {
        if (str == null) {
            return null;
        }
        h hVar = f10316b;
        if (str.equals(hVar.a())) {
            return hVar;
        }
        h hVar2 = f10317c;
        if (str.equals(hVar2.a())) {
            return hVar2;
        }
        if (!str.trim().isEmpty()) {
            return new h(str);
        }
        throw new ParseException("JWK use value must not be empty or blank", 0);
    }

    public String a() {
        return this.f10318a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return Objects.equals(this.f10318a, ((h) obj).f10318a);
    }

    public int hashCode() {
        return Objects.hash(this.f10318a);
    }

    public String toString() {
        return a();
    }
}
