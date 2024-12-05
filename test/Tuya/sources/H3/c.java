package H3;

import com.stripe.android.model.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3496a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3497b;

        public a(String id, String ephemeralKeySecret) {
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(ephemeralKeySecret, "ephemeralKeySecret");
            this.f3496a = id;
            this.f3497b = ephemeralKeySecret;
        }

        public final String a() {
            return this.f3497b;
        }

        public final String b() {
            return this.f3496a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f3496a, aVar.f3496a) && AbstractC3159y.d(this.f3497b, aVar.f3497b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f3496a.hashCode() * 31) + this.f3497b.hashCode();
        }

        public String toString() {
            return "CustomerInfo(id=" + this.f3496a + ", ephemeralKeySecret=" + this.f3497b + ")";
        }
    }

    Object a(a aVar, P5.d dVar);

    Object b(a aVar, String str, boolean z8, P5.d dVar);

    Object c(a aVar, List list, boolean z8, P5.d dVar);

    Object d(a aVar, String str, t tVar, P5.d dVar);
}
