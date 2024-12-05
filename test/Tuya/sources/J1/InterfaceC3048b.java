package j1;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3048b {

    /* renamed from: j1.b$a */
    /* loaded from: classes3.dex */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: j1.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0764b {

        /* renamed from: a, reason: collision with root package name */
        private final String f32736a;

        public C0764b(String sessionId) {
            AbstractC3159y.i(sessionId, "sessionId");
            this.f32736a = sessionId;
        }

        public final String a() {
            return this.f32736a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0764b) && AbstractC3159y.d(this.f32736a, ((C0764b) obj).f32736a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f32736a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f32736a + ')';
        }
    }

    void a(C0764b c0764b);

    boolean b();

    a c();
}
