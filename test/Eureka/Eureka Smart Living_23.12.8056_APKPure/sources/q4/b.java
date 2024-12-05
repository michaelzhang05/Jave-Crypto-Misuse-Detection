package q4;

import com.google.firebase.messaging.i0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f9038b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final q4.a f9039a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private q4.a f9040a = null;

        a() {
        }

        public b a() {
            return new b(this.f9040a);
        }

        public a b(q4.a aVar) {
            this.f9040a = aVar;
            return this;
        }
    }

    b(q4.a aVar) {
        this.f9039a = aVar;
    }

    public static a b() {
        return new a();
    }

    public q4.a a() {
        return this.f9039a;
    }

    public byte[] c() {
        return i0.a(this);
    }
}
