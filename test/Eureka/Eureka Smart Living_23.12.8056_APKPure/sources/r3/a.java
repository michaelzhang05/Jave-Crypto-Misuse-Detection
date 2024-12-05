package r3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9112b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f9113a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private HashMap f9114a = new HashMap();

        public a a() {
            if (this.f9114a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            a aVar = new a(Collections.unmodifiableMap(this.f9114a));
            this.f9114a = null;
            return aVar;
        }
    }

    private a(Map map) {
        this.f9113a = map;
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.f9113a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f9113a.equals(((a) obj).f9113a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9113a.hashCode();
    }

    public String toString() {
        return this.f9113a.toString();
    }
}
