package V0;

import V0.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f11822a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f11823b = d.a.DEFAULT;

    /* renamed from: V0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0232a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f11824a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f11825b;

        C0232a(int i8, d.a aVar) {
            this.f11824a = i8;
            this.f11825b = aVar;
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
            if (this.f11824a == dVar.tag() && this.f11825b.equals(dVar.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f11824a) + (this.f11825b.hashCode() ^ 2041407134);
        }

        @Override // V0.d
        public d.a intEncoding() {
            return this.f11825b;
        }

        @Override // V0.d
        public int tag() {
            return this.f11824a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f11824a + "intEncoding=" + this.f11825b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0232a(this.f11822a, this.f11823b);
    }

    public a c(int i8) {
        this.f11822a = i8;
        return this;
    }
}
