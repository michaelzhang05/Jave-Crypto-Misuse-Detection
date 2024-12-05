package u;

import java.util.Arrays;
import u.p;

/* loaded from: classes3.dex */
final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f39868a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f39869b;

    /* renamed from: c, reason: collision with root package name */
    private final s.f f39870c;

    /* loaded from: classes3.dex */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private String f39871a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f39872b;

        /* renamed from: c, reason: collision with root package name */
        private s.f f39873c;

        @Override // u.p.a
        public p a() {
            String str = "";
            if (this.f39871a == null) {
                str = " backendName";
            }
            if (this.f39873c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f39871a, this.f39872b, this.f39873c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.p.a
        public p.a b(String str) {
            if (str != null) {
                this.f39871a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // u.p.a
        public p.a c(byte[] bArr) {
            this.f39872b = bArr;
            return this;
        }

        @Override // u.p.a
        public p.a d(s.f fVar) {
            if (fVar != null) {
                this.f39873c = fVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // u.p
    public String b() {
        return this.f39868a;
    }

    @Override // u.p
    public byte[] c() {
        return this.f39869b;
    }

    @Override // u.p
    public s.f d() {
        return this.f39870c;
    }

    public boolean equals(Object obj) {
        byte[] c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f39868a.equals(pVar.b())) {
            byte[] bArr = this.f39869b;
            if (pVar instanceof d) {
                c8 = ((d) pVar).f39869b;
            } else {
                c8 = pVar.c();
            }
            if (Arrays.equals(bArr, c8) && this.f39870c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f39868a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f39869b)) * 1000003) ^ this.f39870c.hashCode();
    }

    private d(String str, byte[] bArr, s.f fVar) {
        this.f39868a = str;
        this.f39869b = bArr;
        this.f39870c = fVar;
    }
}
