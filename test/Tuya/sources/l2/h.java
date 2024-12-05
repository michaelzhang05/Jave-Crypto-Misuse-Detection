package l2;

import M5.a0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final a f33829a = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends h {

        /* renamed from: b, reason: collision with root package name */
        private final String f33830b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33831c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String denormalized) {
            super(null);
            AbstractC3159y.i(denormalized, "denormalized");
            this.f33830b = denormalized;
            StringBuilder sb = new StringBuilder();
            int length = denormalized.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = denormalized.charAt(i8);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            this.f33831c = sb2;
        }

        private final boolean b(int i8) {
            return a0.i(3, Integer.valueOf(i8)).contains(Integer.valueOf(this.f33831c.length()));
        }

        public final String a() {
            return this.f33831c;
        }

        public final boolean c(int i8) {
            if ((!g6.n.u(this.f33831c)) && !b(i8)) {
                return true;
            }
            return false;
        }

        public final c d(int i8) {
            if (b(i8)) {
                return new c(this.f33831c);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3159y.d(this.f33830b, ((b) obj).f33830b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f33830b.hashCode();
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.f33830b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {

        /* renamed from: b, reason: collision with root package name */
        private final String f33832b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            AbstractC3159y.i(value, "value");
            this.f33832b = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f33832b, ((c) obj).f33832b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f33832b.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.f33832b + ")";
        }
    }

    private h() {
    }

    public /* synthetic */ h(AbstractC3151p abstractC3151p) {
        this();
    }
}
