package u;

import java.util.Arrays;
import java.util.Map;
import u.i;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4045b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f39838a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f39839b;

    /* renamed from: c, reason: collision with root package name */
    private final h f39840c;

    /* renamed from: d, reason: collision with root package name */
    private final long f39841d;

    /* renamed from: e, reason: collision with root package name */
    private final long f39842e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f39843f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f39844g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39845h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f39846i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f39847j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0892b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f39848a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f39849b;

        /* renamed from: c, reason: collision with root package name */
        private h f39850c;

        /* renamed from: d, reason: collision with root package name */
        private Long f39851d;

        /* renamed from: e, reason: collision with root package name */
        private Long f39852e;

        /* renamed from: f, reason: collision with root package name */
        private Map f39853f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f39854g;

        /* renamed from: h, reason: collision with root package name */
        private String f39855h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f39856i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f39857j;

        @Override // u.i.a
        public i d() {
            String str = "";
            if (this.f39848a == null) {
                str = " transportName";
            }
            if (this.f39850c == null) {
                str = str + " encodedPayload";
            }
            if (this.f39851d == null) {
                str = str + " eventMillis";
            }
            if (this.f39852e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f39853f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C4045b(this.f39848a, this.f39849b, this.f39850c, this.f39851d.longValue(), this.f39852e.longValue(), this.f39853f, this.f39854g, this.f39855h, this.f39856i, this.f39857j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.i.a
        protected Map e() {
            Map map = this.f39853f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u.i.a
        public i.a f(Map map) {
            if (map != null) {
                this.f39853f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // u.i.a
        public i.a g(Integer num) {
            this.f39849b = num;
            return this;
        }

        @Override // u.i.a
        public i.a h(h hVar) {
            if (hVar != null) {
                this.f39850c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // u.i.a
        public i.a i(long j8) {
            this.f39851d = Long.valueOf(j8);
            return this;
        }

        @Override // u.i.a
        public i.a j(byte[] bArr) {
            this.f39856i = bArr;
            return this;
        }

        @Override // u.i.a
        public i.a k(byte[] bArr) {
            this.f39857j = bArr;
            return this;
        }

        @Override // u.i.a
        public i.a l(Integer num) {
            this.f39854g = num;
            return this;
        }

        @Override // u.i.a
        public i.a m(String str) {
            this.f39855h = str;
            return this;
        }

        @Override // u.i.a
        public i.a n(String str) {
            if (str != null) {
                this.f39848a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // u.i.a
        public i.a o(long j8) {
            this.f39852e = Long.valueOf(j8);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u.i
    public Map c() {
        return this.f39843f;
    }

    @Override // u.i
    public Integer d() {
        return this.f39839b;
    }

    @Override // u.i
    public h e() {
        return this.f39840c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        byte[] g8;
        byte[] h8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f39838a.equals(iVar.n()) && ((num = this.f39839b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f39840c.equals(iVar.e()) && this.f39841d == iVar.f() && this.f39842e == iVar.o() && this.f39843f.equals(iVar.c()) && ((num2 = this.f39844g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f39845h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
            byte[] bArr = this.f39846i;
            boolean z8 = iVar instanceof C4045b;
            if (z8) {
                g8 = ((C4045b) iVar).f39846i;
            } else {
                g8 = iVar.g();
            }
            if (Arrays.equals(bArr, g8)) {
                byte[] bArr2 = this.f39847j;
                if (z8) {
                    h8 = ((C4045b) iVar).f39847j;
                } else {
                    h8 = iVar.h();
                }
                if (Arrays.equals(bArr2, h8)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // u.i
    public long f() {
        return this.f39841d;
    }

    @Override // u.i
    public byte[] g() {
        return this.f39846i;
    }

    @Override // u.i
    public byte[] h() {
        return this.f39847j;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f39838a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f39839b;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ hashCode) * 1000003) ^ this.f39840c.hashCode()) * 1000003;
        long j8 = this.f39841d;
        int i9 = (hashCode4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f39842e;
        int hashCode5 = (((i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f39843f.hashCode()) * 1000003;
        Integer num2 = this.f39844g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode2) * 1000003;
        String str = this.f39845h;
        if (str != null) {
            i8 = str.hashCode();
        }
        return ((((i10 ^ i8) * 1000003) ^ Arrays.hashCode(this.f39846i)) * 1000003) ^ Arrays.hashCode(this.f39847j);
    }

    @Override // u.i
    public Integer l() {
        return this.f39844g;
    }

    @Override // u.i
    public String m() {
        return this.f39845h;
    }

    @Override // u.i
    public String n() {
        return this.f39838a;
    }

    @Override // u.i
    public long o() {
        return this.f39842e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f39838a + ", code=" + this.f39839b + ", encodedPayload=" + this.f39840c + ", eventMillis=" + this.f39841d + ", uptimeMillis=" + this.f39842e + ", autoMetadata=" + this.f39843f + ", productId=" + this.f39844g + ", pseudonymousId=" + this.f39845h + ", experimentIdsClear=" + Arrays.toString(this.f39846i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f39847j) + "}";
    }

    private C4045b(String str, Integer num, h hVar, long j8, long j9, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f39838a = str;
        this.f39839b = num;
        this.f39840c = hVar;
        this.f39841d = j8;
        this.f39842e = j9;
        this.f39843f = map;
        this.f39844g = num2;
        this.f39845h = str2;
        this.f39846i = bArr;
        this.f39847j = bArr2;
    }
}
