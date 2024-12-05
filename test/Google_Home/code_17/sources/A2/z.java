package A2;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final a f279b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f280a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final z a(String str) {
            if (str == null || j6.n.u(str)) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            return new z(str);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public z(String value) {
        AbstractC3255y.i(value, "value");
        this.f280a = value;
    }

    public final String a() {
        return this.f280a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && AbstractC3255y.d(this.f280a, ((z) obj).f280a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f280a.hashCode();
    }

    public String toString() {
        return this.f280a;
    }
}
