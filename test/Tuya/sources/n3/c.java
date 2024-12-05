package N3;

import P5.d;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f7197a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7198b;

        public a(String clientSecret, int i8) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            this.f7197a = clientSecret;
            this.f7198b = i8;
        }

        public final String a() {
            return this.f7197a;
        }

        public final int b() {
            return this.f7198b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f7197a, aVar.f7197a) && this.f7198b == aVar.f7198b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f7197a.hashCode() * 31) + this.f7198b;
        }

        public String toString() {
            return "Config(clientSecret=" + this.f7197a + ", maxAttempts=" + this.f7198b + ")";
        }
    }

    Object a(d dVar);

    void b(M m8);

    void c();

    InterfaceC3349K getState();
}
