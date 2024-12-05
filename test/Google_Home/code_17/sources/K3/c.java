package K3;

import com.stripe.android.model.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5099a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5100b;

        public a(String id, String ephemeralKeySecret) {
            AbstractC3255y.i(id, "id");
            AbstractC3255y.i(ephemeralKeySecret, "ephemeralKeySecret");
            this.f5099a = id;
            this.f5100b = ephemeralKeySecret;
        }

        public final String a() {
            return this.f5100b;
        }

        public final String b() {
            return this.f5099a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f5099a, aVar.f5099a) && AbstractC3255y.d(this.f5100b, aVar.f5100b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f5099a.hashCode() * 31) + this.f5100b.hashCode();
        }

        public String toString() {
            return "CustomerInfo(id=" + this.f5099a + ", ephemeralKeySecret=" + this.f5100b + ")";
        }
    }

    Object a(a aVar, String str, t tVar, S5.d dVar);

    Object b(a aVar, S5.d dVar);

    Object c(a aVar, String str, boolean z8, S5.d dVar);

    Object d(a aVar, List list, boolean z8, S5.d dVar);
}
