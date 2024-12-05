package d4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f6483a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6484b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f6485a;

        /* renamed from: b, reason: collision with root package name */
        private Map f6486b = null;

        b(String str) {
            this.f6485a = str;
        }

        public c a() {
            return new c(this.f6485a, this.f6486b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f6486b)));
        }

        public b b(Annotation annotation) {
            if (this.f6486b == null) {
                this.f6486b = new HashMap();
            }
            this.f6486b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    private c(String str, Map map) {
        this.f6483a = str;
        this.f6484b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f6483a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f6484b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6483a.equals(cVar.f6483a) && this.f6484b.equals(cVar.f6484b);
    }

    public int hashCode() {
        return (this.f6483a.hashCode() * 31) + this.f6484b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f6483a + ", properties=" + this.f6484b.values() + "}";
    }
}
