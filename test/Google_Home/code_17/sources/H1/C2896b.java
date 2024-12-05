package h1;

import com.google.firebase.messaging.K;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2896b {

    /* renamed from: b, reason: collision with root package name */
    private static final C2896b f32146b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C2895a f32147a;

    /* renamed from: h1.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C2895a f32148a = null;

        a() {
        }

        public C2896b a() {
            return new C2896b(this.f32148a);
        }

        public a b(C2895a c2895a) {
            this.f32148a = c2895a;
            return this;
        }
    }

    C2896b(C2895a c2895a) {
        this.f32147a = c2895a;
    }

    public static a b() {
        return new a();
    }

    public C2895a a() {
        return this.f32147a;
    }

    public byte[] c() {
        return K.a(this);
    }
}
