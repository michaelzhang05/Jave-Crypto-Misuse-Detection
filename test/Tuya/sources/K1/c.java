package K1;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f5727b = new c("DEF");

    /* renamed from: a, reason: collision with root package name */
    private final String f5728a;

    public c(String str) {
        if (str != null) {
            this.f5728a = str;
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
        return this.f5728a.hashCode();
    }

    public String toString() {
        return this.f5728a;
    }
}
