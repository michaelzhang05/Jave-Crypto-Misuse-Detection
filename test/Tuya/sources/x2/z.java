package x2;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final a f39284b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f39285a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final z a(String str) {
            if (str == null || g6.n.u(str)) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            return new z(str);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public z(String value) {
        AbstractC3159y.i(value, "value");
        this.f39285a = value;
    }

    public final String a() {
        return this.f39285a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && AbstractC3159y.d(this.f39285a, ((z) obj).f39285a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39285a.hashCode();
    }

    public String toString() {
        return this.f39285a;
    }
}
