package t;

import java.util.Arrays;
import t.q;

/* loaded from: classes3.dex */
final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f39425a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f39426b;

    /* loaded from: classes3.dex */
    static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f39427a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f39428b;

        @Override // t.q.a
        public q a() {
            return new g(this.f39427a, this.f39428b);
        }

        @Override // t.q.a
        public q.a b(byte[] bArr) {
            this.f39427a = bArr;
            return this;
        }

        @Override // t.q.a
        public q.a c(byte[] bArr) {
            this.f39428b = bArr;
            return this;
        }
    }

    @Override // t.q
    public byte[] b() {
        return this.f39425a;
    }

    @Override // t.q
    public byte[] c() {
        return this.f39426b;
    }

    public boolean equals(Object obj) {
        byte[] b8;
        byte[] c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        byte[] bArr = this.f39425a;
        boolean z8 = qVar instanceof g;
        if (z8) {
            b8 = ((g) qVar).f39425a;
        } else {
            b8 = qVar.b();
        }
        if (Arrays.equals(bArr, b8)) {
            byte[] bArr2 = this.f39426b;
            if (z8) {
                c8 = ((g) qVar).f39426b;
            } else {
                c8 = qVar.c();
            }
            if (Arrays.equals(bArr2, c8)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f39425a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f39426b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f39425a) + ", encryptedBlob=" + Arrays.toString(this.f39426b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f39425a = bArr;
        this.f39426b = bArr2;
    }
}
