package H3;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f3531a;

        public a(String cvc) {
            AbstractC3255y.i(cvc, "cvc");
            this.f3531a = cvc;
        }

        public final String a() {
            return this.f3531a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3255y.d(this.f3531a, ((a) obj).f3531a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f3531a.hashCode();
        }

        public String toString() {
            return "Completed(cvc=" + this.f3531a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3532a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -481114568;
        }

        public String toString() {
            return "Incomplete";
        }
    }
}
