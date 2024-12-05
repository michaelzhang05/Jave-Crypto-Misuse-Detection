package l2;

import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import b3.EnumC1870e;
import j2.C3062b;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33814a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Set f33815b = a0.i(4, 9, 14);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f33816c = Q.k(x.a(14, a0.i(4, 11)), x.a(15, a0.i(4, 11)), x.a(16, a0.i(4, 9, 14)), x.a(19, a0.i(4, 9, 14, 19)));

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final Set a(int i8) {
            Set set = (Set) f.f33816c.get(Integer.valueOf(i8));
            if (set == null) {
                return f.f33815b;
            }
            return set;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {

        /* renamed from: j, reason: collision with root package name */
        private static final a f33817j = new a(null);

        /* renamed from: k, reason: collision with root package name */
        private static final Set f33818k = a0.i('-', ' ');

        /* renamed from: d, reason: collision with root package name */
        private final String f33819d;

        /* renamed from: e, reason: collision with root package name */
        private final String f33820e;

        /* renamed from: f, reason: collision with root package name */
        private final int f33821f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f33822g;

        /* renamed from: h, reason: collision with root package name */
        private final C3166a f33823h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f33824i;

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String denormalized) {
            super(null);
            AbstractC3159y.i(denormalized, "denormalized");
            this.f33819d = denormalized;
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < denormalized.length(); i8++) {
                char charAt = denormalized.charAt(i8);
                if (!f33818k.contains(Character.valueOf(charAt))) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            this.f33820e = sb2;
            int length = sb2.length();
            this.f33821f = length;
            this.f33822g = length == 19;
            this.f33823h = C3166a.f33795b.a(sb2);
            this.f33824i = C3062b.f32966a.a(sb2);
        }

        private final String c(int i8) {
            Set a8 = f.f33814a.a(i8);
            String U02 = g6.n.U0(this.f33820e, i8);
            int size = a8.size() + 1;
            String[] strArr = new String[size];
            int length = U02.length();
            int i9 = 0;
            int i10 = 0;
            for (Object obj : AbstractC1246t.O0(AbstractC1246t.W0(a8))) {
                int i11 = i9 + 1;
                if (i9 < 0) {
                    AbstractC1246t.w();
                }
                int intValue = ((Number) obj).intValue() - i9;
                if (length > intValue) {
                    String substring = U02.substring(i10, intValue);
                    AbstractC3159y.h(substring, "substring(...)");
                    strArr[i9] = substring;
                    i10 = intValue;
                }
                i9 = i11;
            }
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    if (strArr[i12] == null) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i12);
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                String substring2 = U02.substring(i10);
                AbstractC3159y.h(substring2, "substring(...)");
                strArr[intValue2] = substring2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < size; i13++) {
                String str = strArr[i13];
                if (str == null) {
                    break;
                }
                arrayList.add(str);
            }
            return AbstractC1246t.w0(arrayList, " ", null, null, 0, null, null, 62, null);
        }

        public final C3166a d() {
            return this.f33823h;
        }

        public final String e(int i8) {
            return c(i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3159y.d(this.f33819d, ((b) obj).f33819d)) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f33821f;
        }

        public final String g() {
            return this.f33820e;
        }

        public final boolean h() {
            return this.f33822g;
        }

        public int hashCode() {
            return this.f33819d.hashCode();
        }

        public final boolean i(int i8) {
            if (this.f33820e.length() != i8 && (!g6.n.u(this.f33820e))) {
                return true;
            }
            return false;
        }

        public final boolean j() {
            if ((!g6.n.u(this.f33820e)) && AbstractC1246t.m0(EnumC1870e.f14436m.c(this.f33820e)) != EnumC1870e.f14446w) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            return this.f33824i;
        }

        public final c l(int i8) {
            if (i8 >= 14 && this.f33820e.length() == i8 && this.f33824i) {
                return new c(this.f33820e);
            }
            return null;
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.f33819d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends f {

        /* renamed from: d, reason: collision with root package name */
        private final String f33825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            AbstractC3159y.i(value, "value");
            this.f33825d = value;
        }

        public final String c() {
            return this.f33825d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f33825d, ((c) obj).f33825d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f33825d.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.f33825d + ")";
        }
    }

    public /* synthetic */ f(AbstractC3151p abstractC3151p) {
        this();
    }

    private f() {
    }
}
