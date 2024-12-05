package U0;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f10249a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f10250b;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f10251a;

        /* renamed from: b, reason: collision with root package name */
        private Map f10252b = null;

        b(String str) {
            this.f10251a = str;
        }

        public c a() {
            Map unmodifiableMap;
            String str = this.f10251a;
            if (this.f10252b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap(this.f10252b));
            }
            return new c(str, unmodifiableMap);
        }

        public b b(Annotation annotation) {
            if (this.f10252b == null) {
                this.f10252b = new HashMap();
            }
            this.f10252b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f10249a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f10250b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f10249a.equals(cVar.f10249a) && this.f10250b.equals(cVar.f10250b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f10249a.hashCode() * 31) + this.f10250b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f10249a + ", properties=" + this.f10250b.values() + "}";
    }

    private c(String str, Map map) {
        this.f10249a = str;
        this.f10250b = map;
    }
}
