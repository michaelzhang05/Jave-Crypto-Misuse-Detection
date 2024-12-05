package d1;

import d1.o;
import java.util.Arrays;

/* loaded from: classes.dex */
final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    private final String f6429a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f6430b;

    /* renamed from: c, reason: collision with root package name */
    private final b1.d f6431c;

    /* loaded from: classes.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6432a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f6433b;

        /* renamed from: c, reason: collision with root package name */
        private b1.d f6434c;

        @Override // d1.o.a
        public o a() {
            String str = "";
            if (this.f6432a == null) {
                str = " backendName";
            }
            if (this.f6434c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f6432a, this.f6433b, this.f6434c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d1.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f6432a = str;
            return this;
        }

        @Override // d1.o.a
        public o.a c(byte[] bArr) {
            this.f6433b = bArr;
            return this;
        }

        @Override // d1.o.a
        public o.a d(b1.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f6434c = dVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, b1.d dVar) {
        this.f6429a = str;
        this.f6430b = bArr;
        this.f6431c = dVar;
    }

    @Override // d1.o
    public String b() {
        return this.f6429a;
    }

    @Override // d1.o
    public byte[] c() {
        return this.f6430b;
    }

    @Override // d1.o
    public b1.d d() {
        return this.f6431c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f6429a.equals(oVar.b())) {
            if (Arrays.equals(this.f6430b, oVar instanceof d ? ((d) oVar).f6430b : oVar.c()) && this.f6431c.equals(oVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f6429a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6430b)) * 1000003) ^ this.f6431c.hashCode();
    }
}
