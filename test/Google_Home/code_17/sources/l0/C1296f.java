package L0;

import L0.F;
import java.util.List;

/* renamed from: L0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1296f extends F.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f5535a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5536b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.d.a {

        /* renamed from: a, reason: collision with root package name */
        private List f5537a;

        /* renamed from: b, reason: collision with root package name */
        private String f5538b;

        @Override // L0.F.d.a
        public F.d a() {
            List list = this.f5537a;
            if (list != null) {
                return new C1296f(list, this.f5538b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // L0.F.d.a
        public F.d.a b(List list) {
            if (list != null) {
                this.f5537a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // L0.F.d.a
        public F.d.a c(String str) {
            this.f5538b = str;
            return this;
        }
    }

    @Override // L0.F.d
    public List b() {
        return this.f5535a;
    }

    @Override // L0.F.d
    public String c() {
        return this.f5536b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d)) {
            return false;
        }
        F.d dVar = (F.d) obj;
        if (this.f5535a.equals(dVar.b())) {
            String str = this.f5536b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5535a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5536b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f5535a + ", orgId=" + this.f5536b + "}";
    }

    private C1296f(List list, String str) {
        this.f5535a = list;
        this.f5536b = str;
    }
}
