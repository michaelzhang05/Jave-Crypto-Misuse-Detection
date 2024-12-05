package kotlin.reflect.x.internal.l0.b.p;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.f.f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: FunctionClassKind.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f19741f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f19742g = new c("Function", 0, k.r, "Function", false, false);

    /* renamed from: h, reason: collision with root package name */
    public static final c f19743h = new c("SuspendFunction", 1, k.f19708j, "SuspendFunction", true, false);

    /* renamed from: i, reason: collision with root package name */
    public static final c f19744i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f19745j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ c[] f19746k;
    private final kotlin.reflect.x.internal.l0.f.c l;
    private final String m;
    private final boolean n;
    private final boolean o;

    /* compiled from: FunctionClassKind.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: FunctionClassKind.kt */
        /* renamed from: kotlin.f0.x.e.l0.b.p.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0282a {
            private final c a;

            /* renamed from: b, reason: collision with root package name */
            private final int f19747b;

            public C0282a(c cVar, int i2) {
                l.f(cVar, "kind");
                this.a = cVar;
                this.f19747b = i2;
            }

            public final c a() {
                return this.a;
            }

            public final int b() {
                return this.f19747b;
            }

            public final c c() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0282a)) {
                    return false;
                }
                C0282a c0282a = (C0282a) obj;
                return this.a == c0282a.a && this.f19747b == c0282a.f19747b;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.f19747b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.a + ", arity=" + this.f19747b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final Integer d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                int charAt = str.charAt(i3) - '0';
                if (!(charAt >= 0 && charAt < 10)) {
                    return null;
                }
                i2 = (i2 * 10) + charAt;
            }
            return Integer.valueOf(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[LOOP:0: B:2:0x0011->B:10:0x0032, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.x.internal.l0.b.p.c a(kotlin.reflect.x.internal.l0.f.c r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "packageFqName"
                kotlin.jvm.internal.l.f(r9, r0)
                java.lang.String r0 = "className"
                kotlin.jvm.internal.l.f(r10, r0)
                kotlin.f0.x.e.l0.b.p.c[] r0 = kotlin.reflect.x.internal.l0.b.p.c.values()
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L11:
                r4 = 0
                if (r3 >= r1) goto L35
                r5 = r0[r3]
                kotlin.f0.x.e.l0.f.c r6 = r5.i()
                boolean r6 = kotlin.jvm.internal.l.a(r6, r9)
                if (r6 == 0) goto L2d
                java.lang.String r6 = r5.f()
                r7 = 2
                boolean r4 = kotlin.text.l.A(r10, r6, r2, r7, r4)
                if (r4 == 0) goto L2d
                r4 = 1
                goto L2e
            L2d:
                r4 = 0
            L2e:
                if (r4 == 0) goto L32
                r4 = r5
                goto L35
            L32:
                int r3 = r3 + 1
                goto L11
            L35:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.b.p.c.a.a(kotlin.f0.x.e.l0.f.c, java.lang.String):kotlin.f0.x.e.l0.b.p.c");
        }

        public final c b(String str, kotlin.reflect.x.internal.l0.f.c cVar) {
            l.f(str, "className");
            l.f(cVar, "packageFqName");
            C0282a c2 = c(str, cVar);
            if (c2 != null) {
                return c2.c();
            }
            return null;
        }

        public final C0282a c(String str, kotlin.reflect.x.internal.l0.f.c cVar) {
            l.f(str, "className");
            l.f(cVar, "packageFqName");
            c a = a(cVar, str);
            if (a == null) {
                return null;
            }
            String substring = str.substring(a.f().length());
            l.e(substring, "this as java.lang.String).substring(startIndex)");
            Integer d2 = d(substring);
            if (d2 != null) {
                return new C0282a(a, d2.intValue());
            }
            return null;
        }
    }

    static {
        kotlin.reflect.x.internal.l0.f.c cVar = k.o;
        f19744i = new c("KFunction", 2, cVar, "KFunction", false, true);
        f19745j = new c("KSuspendFunction", 3, cVar, "KSuspendFunction", true, true);
        f19746k = d();
        f19741f = new a(null);
    }

    private c(String str, int i2, kotlin.reflect.x.internal.l0.f.c cVar, String str2, boolean z, boolean z2) {
        this.l = cVar;
        this.m = str2;
        this.n = z;
        this.o = z2;
    }

    private static final /* synthetic */ c[] d() {
        return new c[]{f19742g, f19743h, f19744i, f19745j};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f19746k.clone();
    }

    public final String f() {
        return this.m;
    }

    public final kotlin.reflect.x.internal.l0.f.c i() {
        return this.l;
    }

    public final f n(int i2) {
        f r = f.r(this.m + i2);
        l.e(r, "identifier(\"$classNamePrefix$arity\")");
        return r;
    }
}
