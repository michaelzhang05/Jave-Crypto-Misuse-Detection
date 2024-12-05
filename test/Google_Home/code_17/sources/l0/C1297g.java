package L0;

import L0.F;
import java.util.Arrays;

/* renamed from: L0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1297g extends F.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5539a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f5540b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5541a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f5542b;

        @Override // L0.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.f5541a;
            if (str != null && (bArr = this.f5542b) != null) {
                return new C1297g(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5541a == null) {
                sb.append(" filename");
            }
            if (this.f5542b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.f5542b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // L0.F.d.b.a
        public F.d.b.a c(String str) {
            if (str != null) {
                this.f5541a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // L0.F.d.b
    public byte[] b() {
        return this.f5540b;
    }

    @Override // L0.F.d.b
    public String c() {
        return this.f5539a;
    }

    public boolean equals(Object obj) {
        byte[] b8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d.b)) {
            return false;
        }
        F.d.b bVar = (F.d.b) obj;
        if (this.f5539a.equals(bVar.c())) {
            byte[] bArr = this.f5540b;
            if (bVar instanceof C1297g) {
                b8 = ((C1297g) bVar).f5540b;
            } else {
                b8 = bVar.b();
            }
            if (Arrays.equals(bArr, b8)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5539a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5540b);
    }

    public String toString() {
        return "File{filename=" + this.f5539a + ", contents=" + Arrays.toString(this.f5540b) + "}";
    }

    private C1297g(String str, byte[] bArr) {
        this.f5539a = str;
        this.f5540b = bArr;
    }
}
