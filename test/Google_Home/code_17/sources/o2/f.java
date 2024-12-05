package o2;

import O5.x;
import P5.AbstractC1378t;
import P5.Q;
import P5.a0;
import e3.EnumC2791e;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.C3416b;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35815a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Set f35816b = a0.i(4, 9, 14);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f35817c = Q.k(x.a(14, a0.i(4, 11)), x.a(15, a0.i(4, 11)), x.a(16, a0.i(4, 9, 14)), x.a(19, a0.i(4, 9, 14, 19)));

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final Set a(int i8) {
            Set set = (Set) f.f35817c.get(Integer.valueOf(i8));
            if (set == null) {
                return f.f35816b;
            }
            return set;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {

        /* renamed from: j, reason: collision with root package name */
        private static final a f35818j = new a(null);

        /* renamed from: k, reason: collision with root package name */
        private static final Set f35819k = a0.i('-', ' ');

        /* renamed from: d, reason: collision with root package name */
        private final String f35820d;

        /* renamed from: e, reason: collision with root package name */
        private final String f35821e;

        /* renamed from: f, reason: collision with root package name */
        private final int f35822f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f35823g;

        /* renamed from: h, reason: collision with root package name */
        private final C3514a f35824h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f35825i;

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String denormalized) {
            super(null);
            AbstractC3255y.i(denormalized, "denormalized");
            this.f35820d = denormalized;
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < denormalized.length(); i8++) {
                char charAt = denormalized.charAt(i8);
                if (!f35819k.contains(Character.valueOf(charAt))) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3255y.h(sb2, "toString(...)");
            this.f35821e = sb2;
            int length = sb2.length();
            this.f35822f = length;
            this.f35823g = length == 19;
            this.f35824h = C3514a.f35796b.a(sb2);
            this.f35825i = C3416b.f34942a.a(sb2);
        }

        private final String c(int i8) {
            Set a8 = f.f35815a.a(i8);
            String U02 = j6.n.U0(this.f35821e, i8);
            int size = a8.size() + 1;
            String[] strArr = new String[size];
            int length = U02.length();
            int i9 = 0;
            int i10 = 0;
            for (Object obj : AbstractC1378t.O0(AbstractC1378t.W0(a8))) {
                int i11 = i9 + 1;
                if (i9 < 0) {
                    AbstractC1378t.w();
                }
                int intValue = ((Number) obj).intValue() - i9;
                if (length > intValue) {
                    String substring = U02.substring(i10, intValue);
                    AbstractC3255y.h(substring, "substring(...)");
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
                AbstractC3255y.h(substring2, "substring(...)");
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
            return AbstractC1378t.w0(arrayList, " ", null, null, 0, null, null, 62, null);
        }

        public final C3514a d() {
            return this.f35824h;
        }

        public final String e(int i8) {
            return c(i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3255y.d(this.f35820d, ((b) obj).f35820d)) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f35822f;
        }

        public final String g() {
            return this.f35821e;
        }

        public final boolean h() {
            return this.f35823g;
        }

        public int hashCode() {
            return this.f35820d.hashCode();
        }

        public final boolean i(int i8) {
            if (this.f35821e.length() != i8 && (!j6.n.u(this.f35821e))) {
                return true;
            }
            return false;
        }

        public final boolean j() {
            if ((!j6.n.u(this.f35821e)) && AbstractC1378t.m0(EnumC2791e.f31442m.c(this.f35821e)) != EnumC2791e.f31452w) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            return this.f35825i;
        }

        public final c l(int i8) {
            if (i8 >= 14 && this.f35821e.length() == i8 && this.f35825i) {
                return new c(this.f35821e);
            }
            return null;
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.f35820d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends f {

        /* renamed from: d, reason: collision with root package name */
        private final String f35826d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            AbstractC3255y.i(value, "value");
            this.f35826d = value;
        }

        public final String c() {
            return this.f35826d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f35826d, ((c) obj).f35826d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35826d.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.f35826d + ")";
        }
    }

    public /* synthetic */ f(AbstractC3247p abstractC3247p) {
        this();
    }

    private f() {
    }
}
