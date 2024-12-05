package o2;

import P5.a0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final a f35830a = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends h {

        /* renamed from: b, reason: collision with root package name */
        private final String f35831b;

        /* renamed from: c, reason: collision with root package name */
        private final String f35832c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String denormalized) {
            super(null);
            AbstractC3255y.i(denormalized, "denormalized");
            this.f35831b = denormalized;
            StringBuilder sb = new StringBuilder();
            int length = denormalized.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = denormalized.charAt(i8);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3255y.h(sb2, "toString(...)");
            this.f35832c = sb2;
        }

        private final boolean b(int i8) {
            return a0.i(3, Integer.valueOf(i8)).contains(Integer.valueOf(this.f35832c.length()));
        }

        public final String a() {
            return this.f35832c;
        }

        public final boolean c(int i8) {
            if ((!j6.n.u(this.f35832c)) && !b(i8)) {
                return true;
            }
            return false;
        }

        public final c d(int i8) {
            if (b(i8)) {
                return new c(this.f35832c);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3255y.d(this.f35831b, ((b) obj).f35831b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35831b.hashCode();
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.f35831b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {

        /* renamed from: b, reason: collision with root package name */
        private final String f35833b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            AbstractC3255y.i(value, "value");
            this.f35833b = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f35833b, ((c) obj).f35833b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35833b.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.f35833b + ")";
        }
    }

    private h() {
    }

    public /* synthetic */ h(AbstractC3247p abstractC3247p) {
        this();
    }
}
