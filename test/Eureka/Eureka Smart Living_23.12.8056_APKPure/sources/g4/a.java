package g4;

import g4.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f6764a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f6765b = d.a.DEFAULT;

    /* renamed from: g4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0101a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f6766a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f6767b;

        C0101a(int i6, d.a aVar) {
            this.f6766a = i6;
            this.f6767b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f6766a == dVar.tag() && this.f6767b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f6766a) + (this.f6767b.hashCode() ^ 2041407134);
        }

        @Override // g4.d
        public d.a intEncoding() {
            return this.f6767b;
        }

        @Override // g4.d
        public int tag() {
            return this.f6766a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6766a + "intEncoding=" + this.f6767b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0101a(this.f6764a, this.f6765b);
    }

    public a c(int i6) {
        this.f6764a = i6;
        return this;
    }
}
