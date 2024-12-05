package J0;

import J0.B;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class g extends B.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f4517a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4518b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f4519a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f4520b;

        @Override // J0.B.d.b.a
        public B.d.b a() {
            String str = "";
            if (this.f4519a == null) {
                str = " filename";
            }
            if (this.f4520b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new g(this.f4519a, this.f4520b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.d.b.a
        public B.d.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.f4520b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // J0.B.d.b.a
        public B.d.b.a c(String str) {
            if (str != null) {
                this.f4519a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // J0.B.d.b
    public byte[] b() {
        return this.f4518b;
    }

    @Override // J0.B.d.b
    public String c() {
        return this.f4517a;
    }

    public boolean equals(Object obj) {
        byte[] b8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.d.b)) {
            return false;
        }
        B.d.b bVar = (B.d.b) obj;
        if (this.f4517a.equals(bVar.c())) {
            byte[] bArr = this.f4518b;
            if (bVar instanceof g) {
                b8 = ((g) bVar).f4518b;
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
        return ((this.f4517a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4518b);
    }

    public String toString() {
        return "File{filename=" + this.f4517a + ", contents=" + Arrays.toString(this.f4518b) + "}";
    }

    private g(String str, byte[] bArr) {
        this.f4517a = str;
        this.f4518b = bArr;
    }
}
