package e1;

import e1.f;
import java.util.Arrays;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f6488a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f6489b;

    /* loaded from: classes.dex */
    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f6490a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f6491b;

        @Override // e1.f.a
        public f a() {
            String str = "";
            if (this.f6490a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f6490a, this.f6491b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e1.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f6490a = iterable;
            return this;
        }

        @Override // e1.f.a
        public f.a c(byte[] bArr) {
            this.f6491b = bArr;
            return this;
        }
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f6488a = iterable;
        this.f6489b = bArr;
    }

    @Override // e1.f
    public Iterable b() {
        return this.f6488a;
    }

    @Override // e1.f
    public byte[] c() {
        return this.f6489b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f6488a.equals(fVar.b())) {
            if (Arrays.equals(this.f6489b, fVar instanceof a ? ((a) fVar).f6489b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6488a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6489b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f6488a + ", extras=" + Arrays.toString(this.f6489b) + "}";
    }
}
