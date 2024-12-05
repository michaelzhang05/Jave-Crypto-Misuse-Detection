package v;

import java.util.Arrays;
import v.f;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3809a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f38579a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f38580b;

    /* renamed from: v.a$b */
    /* loaded from: classes3.dex */
    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f38581a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f38582b;

        @Override // v.f.a
        public f a() {
            String str = "";
            if (this.f38581a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C3809a(this.f38581a, this.f38582b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v.f.a
        public f.a b(Iterable iterable) {
            if (iterable != null) {
                this.f38581a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // v.f.a
        public f.a c(byte[] bArr) {
            this.f38582b = bArr;
            return this;
        }
    }

    @Override // v.f
    public Iterable b() {
        return this.f38579a;
    }

    @Override // v.f
    public byte[] c() {
        return this.f38580b;
    }

    public boolean equals(Object obj) {
        byte[] c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f38579a.equals(fVar.b())) {
            byte[] bArr = this.f38580b;
            if (fVar instanceof C3809a) {
                c8 = ((C3809a) fVar).f38580b;
            } else {
                c8 = fVar.c();
            }
            if (Arrays.equals(bArr, c8)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f38579a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38580b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f38579a + ", extras=" + Arrays.toString(this.f38580b) + "}";
    }

    private C3809a(Iterable iterable, byte[] bArr) {
        this.f38579a = iterable;
        this.f38580b = bArr;
    }
}
