package e3;

import O5.s;
import com.stripe.android.view.X;
import j6.AbstractC3202a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class w {

    /* loaded from: classes4.dex */
    public static final class a extends w {

        /* renamed from: f, reason: collision with root package name */
        public static final C0728a f31591f = new C0728a(null);

        /* renamed from: g, reason: collision with root package name */
        private static final a f31592g = new a("", "");

        /* renamed from: a, reason: collision with root package name */
        private final String f31593a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31594b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f31595c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f31596d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f31597e;

        /* renamed from: e3.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0728a {
            private C0728a() {
            }

            public final a a(String input) {
                AbstractC3255y.i(input, "input");
                for (int i8 = 0; i8 < input.length(); i8++) {
                    char charAt = input.charAt(i8);
                    if (!Character.isDigit(charAt) && !AbstractC3202a.c(charAt) && charAt != '/') {
                        return b();
                    }
                }
                StringBuilder sb = new StringBuilder();
                int length = input.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt2 = input.charAt(i9);
                    if (Character.isDigit(charAt2)) {
                        sb.append(charAt2);
                    }
                }
                String sb2 = sb.toString();
                AbstractC3255y.h(sb2, "toString(...)");
                return new a(j6.n.U0(sb2, 2), j6.n.P0(sb2, 2));
            }

            public final a b() {
                return a.f31592g;
            }

            public /* synthetic */ C0728a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String month, String year) {
            super(null);
            Object b8;
            boolean z8;
            boolean z9;
            AbstractC3255y.i(month, "month");
            AbstractC3255y.i(year, "year");
            this.f31593a = month;
            this.f31594b = year;
            boolean z10 = false;
            try {
                s.a aVar = O5.s.f8302b;
                int parseInt = Integer.parseInt(month);
                if (1 <= parseInt && parseInt < 13) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b8 = O5.s.b(Boolean.valueOf(z9));
            } catch (Throwable th) {
                s.a aVar2 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(th));
            }
            this.f31595c = ((Boolean) (O5.s.g(b8) ? Boolean.FALSE : b8)).booleanValue();
            if (this.f31593a.length() + this.f31594b.length() == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f31596d = z8;
            if (!z8 && this.f31593a.length() + this.f31594b.length() > 0) {
                z10 = true;
            }
            this.f31597e = z10;
        }

        public final String b() {
            return this.f31593a;
        }

        public final String c() {
            return this.f31594b;
        }

        public final boolean d() {
            return this.f31596d;
        }

        public final boolean e() {
            return this.f31595c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f31593a, aVar.f31593a) && AbstractC3255y.d(this.f31594b, aVar.f31594b)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f31597e;
        }

        public final b g() {
            Object b8;
            String str = this.f31593a;
            String str2 = this.f31594b;
            try {
                s.a aVar = O5.s.f8302b;
                b8 = O5.s.b(new b(Integer.parseInt(str), X.f28694a.a(Integer.parseInt(str2))));
            } catch (Throwable th) {
                s.a aVar2 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(th));
            }
            if (O5.s.g(b8)) {
                b8 = null;
            }
            return (b) b8;
        }

        public int hashCode() {
            return (this.f31593a.hashCode() * 31) + this.f31594b.hashCode();
        }

        public String toString() {
            return "Unvalidated(month=" + this.f31593a + ", year=" + this.f31594b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends w {

        /* renamed from: a, reason: collision with root package name */
        private final int f31598a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31599b;

        public b(int i8, int i9) {
            super(null);
            this.f31598a = i8;
            this.f31599b = i9;
        }

        public final int a() {
            return this.f31598a;
        }

        public final int b() {
            return this.f31599b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f31598a == bVar.f31598a && this.f31599b == bVar.f31599b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f31598a * 31) + this.f31599b;
        }

        public String toString() {
            return "Validated(month=" + this.f31598a + ", year=" + this.f31599b + ")";
        }
    }

    private w() {
    }

    public /* synthetic */ w(AbstractC3247p abstractC3247p) {
        this();
    }
}
