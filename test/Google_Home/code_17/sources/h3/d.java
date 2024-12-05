package H3;

import com.stripe.android.model.o;
import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3533c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f3534a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2791e f3535b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(o.g gVar) {
            if (gVar != null) {
                return new d(gVar.f25537h, gVar.f25530a);
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public d(String str, EnumC2791e brand) {
        AbstractC3255y.i(brand, "brand");
        this.f3534a = str;
        this.f3535b = brand;
    }

    public final EnumC2791e a() {
        return this.f3535b;
    }

    public final String b() {
        return this.f3534a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3255y.d(this.f3534a, dVar.f3534a) && this.f3535b == dVar.f3535b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f3534a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f3535b.hashCode();
    }

    public String toString() {
        return "CvcRecollectionData(lastFour=" + this.f3534a + ", brand=" + this.f3535b + ")";
    }
}
