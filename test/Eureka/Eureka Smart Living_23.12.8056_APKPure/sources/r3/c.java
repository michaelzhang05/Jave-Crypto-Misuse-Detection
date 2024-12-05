package r3;

import g3.k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final r3.a f9115a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9116b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f9117c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList f9118a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private r3.a f9119b = r3.a.f9112b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f9120c = null;

        private boolean c(int i6) {
            Iterator it = this.f9118a.iterator();
            while (it.hasNext()) {
                if (((C0136c) it.next()).a() == i6) {
                    return true;
                }
            }
            return false;
        }

        public b a(k kVar, int i6, String str, String str2) {
            ArrayList arrayList = this.f9118a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C0136c(kVar, i6, str, str2));
            return this;
        }

        public c b() {
            if (this.f9118a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f9120c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c cVar = new c(this.f9119b, Collections.unmodifiableList(this.f9118a), this.f9120c);
            this.f9118a = null;
            return cVar;
        }

        public b d(r3.a aVar) {
            if (this.f9118a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f9119b = aVar;
            return this;
        }

        public b e(int i6) {
            if (this.f9118a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f9120c = Integer.valueOf(i6);
            return this;
        }
    }

    /* renamed from: r3.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0136c {

        /* renamed from: a, reason: collision with root package name */
        private final k f9121a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9122b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9123c;

        /* renamed from: d, reason: collision with root package name */
        private final String f9124d;

        private C0136c(k kVar, int i6, String str, String str2) {
            this.f9121a = kVar;
            this.f9122b = i6;
            this.f9123c = str;
            this.f9124d = str2;
        }

        public int a() {
            return this.f9122b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0136c)) {
                return false;
            }
            C0136c c0136c = (C0136c) obj;
            return this.f9121a == c0136c.f9121a && this.f9122b == c0136c.f9122b && this.f9123c.equals(c0136c.f9123c) && this.f9124d.equals(c0136c.f9124d);
        }

        public int hashCode() {
            return Objects.hash(this.f9121a, Integer.valueOf(this.f9122b), this.f9123c, this.f9124d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f9121a, Integer.valueOf(this.f9122b), this.f9123c, this.f9124d);
        }
    }

    private c(r3.a aVar, List list, Integer num) {
        this.f9115a = aVar;
        this.f9116b = list;
        this.f9117c = num;
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9115a.equals(cVar.f9115a) && this.f9116b.equals(cVar.f9116b) && Objects.equals(this.f9117c, cVar.f9117c);
    }

    public int hashCode() {
        return Objects.hash(this.f9115a, this.f9116b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f9115a, this.f9116b, this.f9117c);
    }
}
