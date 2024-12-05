package X0;

import X0.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f12711a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f12712b = d.a.DEFAULT;

    /* renamed from: X0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0247a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f12713a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f12714b;

        C0247a(int i8, d.a aVar) {
            this.f12713a = i8;
            this.f12714b = aVar;
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
            if (this.f12713a == dVar.tag() && this.f12714b.equals(dVar.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f12713a) + (this.f12714b.hashCode() ^ 2041407134);
        }

        @Override // X0.d
        public d.a intEncoding() {
            return this.f12714b;
        }

        @Override // X0.d
        public int tag() {
            return this.f12713a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f12713a + "intEncoding=" + this.f12714b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0247a(this.f12711a, this.f12712b);
    }

    public a c(int i8) {
        this.f12711a = i8;
        return this;
    }
}
