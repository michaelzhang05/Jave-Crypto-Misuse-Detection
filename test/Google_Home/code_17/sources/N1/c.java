package N1;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f7506b = new c("DEF");

    /* renamed from: a, reason: collision with root package name */
    private final String f7507a;

    public c(String str) {
        if (str != null) {
            this.f7507a = str;
            return;
        }
        throw new IllegalArgumentException("The compression algorithm name must not be null");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof c) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7507a.hashCode();
    }

    public String toString() {
        return this.f7507a;
    }
}
