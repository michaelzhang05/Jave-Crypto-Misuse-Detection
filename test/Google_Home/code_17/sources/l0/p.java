package L0;

import L0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class p extends F.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5646a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5647b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5648c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.c f5649d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5650e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.c.AbstractC0088a {

        /* renamed from: a, reason: collision with root package name */
        private String f5651a;

        /* renamed from: b, reason: collision with root package name */
        private String f5652b;

        /* renamed from: c, reason: collision with root package name */
        private List f5653c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.c f5654d;

        /* renamed from: e, reason: collision with root package name */
        private int f5655e;

        /* renamed from: f, reason: collision with root package name */
        private byte f5656f;

        @Override // L0.F.e.d.a.b.c.AbstractC0088a
        public F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f5656f == 1 && (str = this.f5651a) != null && (list = this.f5653c) != null) {
                return new p(str, this.f5652b, list, this.f5654d, this.f5655e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5651a == null) {
                sb.append(" type");
            }
            if (this.f5653c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f5656f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.a.b.c.AbstractC0088a
        public F.e.d.a.b.c.AbstractC0088a b(F.e.d.a.b.c cVar) {
            this.f5654d = cVar;
            return this;
        }

        @Override // L0.F.e.d.a.b.c.AbstractC0088a
        public F.e.d.a.b.c.AbstractC0088a c(List list) {
            if (list != null) {
                this.f5653c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // L0.F.e.d.a.b.c.AbstractC0088a
        public F.e.d.a.b.c.AbstractC0088a d(int i8) {
            this.f5655e = i8;
            this.f5656f = (byte) (this.f5656f | 1);
            return this;
        }

        @Override // L0.F.e.d.a.b.c.AbstractC0088a
        public F.e.d.a.b.c.AbstractC0088a e(String str) {
            this.f5652b = str;
            return this;
        }

        @Override // L0.F.e.d.a.b.c.AbstractC0088a
        public F.e.d.a.b.c.AbstractC0088a f(String str) {
            if (str != null) {
                this.f5651a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // L0.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.f5649d;
    }

    @Override // L0.F.e.d.a.b.c
    public List c() {
        return this.f5648c;
    }

    @Override // L0.F.e.d.a.b.c
    public int d() {
        return this.f5650e;
    }

    @Override // L0.F.e.d.a.b.c
    public String e() {
        return this.f5647b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.c)) {
            return false;
        }
        F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
        if (this.f5646a.equals(cVar2.f()) && ((str = this.f5647b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f5648c.equals(cVar2.c()) && ((cVar = this.f5649d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f5650e == cVar2.d()) {
            return true;
        }
        return false;
    }

    @Override // L0.F.e.d.a.b.c
    public String f() {
        return this.f5646a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5646a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5647b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f5648c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f5649d;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return ((hashCode3 ^ i8) * 1000003) ^ this.f5650e;
    }

    public String toString() {
        return "Exception{type=" + this.f5646a + ", reason=" + this.f5647b + ", frames=" + this.f5648c + ", causedBy=" + this.f5649d + ", overflowCount=" + this.f5650e + "}";
    }

    private p(String str, String str2, List list, F.e.d.a.b.c cVar, int i8) {
        this.f5646a = str;
        this.f5647b = str2;
        this.f5648c = list;
        this.f5649d = cVar;
        this.f5650e = i8;
    }
}
