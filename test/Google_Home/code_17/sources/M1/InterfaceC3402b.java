package m1;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3402b {

    /* renamed from: m1.b$a */
    /* loaded from: classes4.dex */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: m1.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0794b {

        /* renamed from: a, reason: collision with root package name */
        private final String f34712a;

        public C0794b(String sessionId) {
            AbstractC3255y.i(sessionId, "sessionId");
            this.f34712a = sessionId;
        }

        public final String a() {
            return this.f34712a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0794b) && AbstractC3255y.d(this.f34712a, ((C0794b) obj).f34712a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f34712a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f34712a + ')';
        }
    }

    boolean a();

    a b();

    void c(C0794b c0794b);
}
