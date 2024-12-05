package v;

import java.util.Arrays;
import v.AbstractC4077f;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4072a extends AbstractC4077f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f40075a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f40076b;

    /* renamed from: v.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC4077f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f40077a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f40078b;

        @Override // v.AbstractC4077f.a
        public AbstractC4077f a() {
            String str = "";
            if (this.f40077a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C4072a(this.f40077a, this.f40078b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v.AbstractC4077f.a
        public AbstractC4077f.a b(Iterable iterable) {
            if (iterable != null) {
                this.f40077a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // v.AbstractC4077f.a
        public AbstractC4077f.a c(byte[] bArr) {
            this.f40078b = bArr;
            return this;
        }
    }

    @Override // v.AbstractC4077f
    public Iterable b() {
        return this.f40075a;
    }

    @Override // v.AbstractC4077f
    public byte[] c() {
        return this.f40076b;
    }

    public boolean equals(Object obj) {
        byte[] c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4077f)) {
            return false;
        }
        AbstractC4077f abstractC4077f = (AbstractC4077f) obj;
        if (this.f40075a.equals(abstractC4077f.b())) {
            byte[] bArr = this.f40076b;
            if (abstractC4077f instanceof C4072a) {
                c8 = ((C4072a) abstractC4077f).f40076b;
            } else {
                c8 = abstractC4077f.c();
            }
            if (Arrays.equals(bArr, c8)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f40075a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40076b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f40075a + ", extras=" + Arrays.toString(this.f40076b) + "}";
    }

    private C4072a(Iterable iterable, byte[] bArr) {
        this.f40075a = iterable;
        this.f40076b = bArr;
    }
}
