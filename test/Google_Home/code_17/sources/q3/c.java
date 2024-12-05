package Q3;

import S5.d;
import kotlin.jvm.internal.AbstractC3255y;
import l6.M;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f9157a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9158b;

        public a(String clientSecret, int i8) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            this.f9157a = clientSecret;
            this.f9158b = i8;
        }

        public final String a() {
            return this.f9157a;
        }

        public final int b() {
            return this.f9158b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f9157a, aVar.f9157a) && this.f9158b == aVar.f9158b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f9157a.hashCode() * 31) + this.f9158b;
        }

        public String toString() {
            return "Config(clientSecret=" + this.f9157a + ", maxAttempts=" + this.f9158b + ")";
        }
    }

    void a(M m8);

    Object b(d dVar);

    void c();

    InterfaceC3698L getState();
}
