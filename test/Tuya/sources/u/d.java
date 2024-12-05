package u;

import java.util.Arrays;
import s.EnumC3702d;
import u.p;

/* loaded from: classes3.dex */
final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f38441a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f38442b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3702d f38443c;

    /* loaded from: classes3.dex */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private String f38444a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f38445b;

        /* renamed from: c, reason: collision with root package name */
        private EnumC3702d f38446c;

        @Override // u.p.a
        public p a() {
            String str = "";
            if (this.f38444a == null) {
                str = " backendName";
            }
            if (this.f38446c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f38444a, this.f38445b, this.f38446c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.p.a
        public p.a b(String str) {
            if (str != null) {
                this.f38444a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // u.p.a
        public p.a c(byte[] bArr) {
            this.f38445b = bArr;
            return this;
        }

        @Override // u.p.a
        public p.a d(EnumC3702d enumC3702d) {
            if (enumC3702d != null) {
                this.f38446c = enumC3702d;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // u.p
    public String b() {
        return this.f38441a;
    }

    @Override // u.p
    public byte[] c() {
        return this.f38442b;
    }

    @Override // u.p
    public EnumC3702d d() {
        return this.f38443c;
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
        if (this.f38441a.equals(pVar.b())) {
            byte[] bArr = this.f38442b;
            if (pVar instanceof d) {
                c8 = ((d) pVar).f38442b;
            } else {
                c8 = pVar.c();
            }
            if (Arrays.equals(bArr, c8) && this.f38443c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f38441a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38442b)) * 1000003) ^ this.f38443c.hashCode();
    }

    private d(String str, byte[] bArr, EnumC3702d enumC3702d) {
        this.f38441a = str;
        this.f38442b = bArr;
        this.f38443c = enumC3702d;
    }
}
