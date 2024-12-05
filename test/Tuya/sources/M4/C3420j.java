package m4;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.InterfaceC3433x;

/* renamed from: m4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3420j implements InterfaceC3433x {

    /* renamed from: a, reason: collision with root package name */
    private final List f35561a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35562b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35563c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35564d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35565e;

    /* renamed from: f, reason: collision with root package name */
    private final List f35566f;

    /* renamed from: g, reason: collision with root package name */
    private final List f35567g;

    /* renamed from: m4.j$a */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f35568a;

        /* renamed from: b, reason: collision with root package name */
        private final List f35569b;

        public /* synthetic */ a(int i8, List list, AbstractC3151p abstractC3151p) {
            this(i8, list);
        }

        public abstract List a();

        public abstract int b();

        private a(int i8, List list) {
            this.f35568a = i8;
            this.f35569b = list;
        }

        /* renamed from: m4.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0821a extends a {

            /* renamed from: c, reason: collision with root package name */
            private final int f35570c;

            /* renamed from: d, reason: collision with root package name */
            private final List f35571d;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ C0821a(int r17, java.util.List r18, int r19, kotlin.jvm.internal.AbstractC3151p r20) {
                /*
                    r16 = this;
                    r0 = 2
                    r1 = 1
                    r2 = r19 & 1
                    if (r2 == 0) goto L9
                    int r2 = r2.AbstractC3685e.f37581h
                    goto Lb
                L9:
                    r2 = r17
                Lb:
                    r3 = r19 & 2
                    if (r3 == 0) goto Lbb
                    L5.r r3 = new L5.r
                    java.lang.String r4 = "AB"
                    java.lang.String r5 = "Alberta"
                    r3.<init>(r4, r5)
                    L5.r r4 = new L5.r
                    java.lang.String r5 = "BC"
                    java.lang.String r6 = "British Columbia"
                    r4.<init>(r5, r6)
                    L5.r r5 = new L5.r
                    java.lang.String r6 = "MB"
                    java.lang.String r7 = "Manitoba"
                    r5.<init>(r6, r7)
                    L5.r r6 = new L5.r
                    java.lang.String r7 = "NB"
                    java.lang.String r8 = "New Brunswick"
                    r6.<init>(r7, r8)
                    L5.r r7 = new L5.r
                    java.lang.String r8 = "NL"
                    java.lang.String r9 = "Newfoundland and Labrador"
                    r7.<init>(r8, r9)
                    L5.r r8 = new L5.r
                    java.lang.String r9 = "NT"
                    java.lang.String r10 = "Northwest Territories"
                    r8.<init>(r9, r10)
                    L5.r r9 = new L5.r
                    java.lang.String r10 = "NS"
                    java.lang.String r11 = "Nova Scotia"
                    r9.<init>(r10, r11)
                    L5.r r10 = new L5.r
                    java.lang.String r11 = "NU"
                    java.lang.String r12 = "Nunavut"
                    r10.<init>(r11, r12)
                    L5.r r11 = new L5.r
                    java.lang.String r12 = "ON"
                    java.lang.String r13 = "Ontario"
                    r11.<init>(r12, r13)
                    L5.r r12 = new L5.r
                    java.lang.String r13 = "PE"
                    java.lang.String r14 = "Prince Edward Island"
                    r12.<init>(r13, r14)
                    L5.r r13 = new L5.r
                    java.lang.String r14 = "QC"
                    java.lang.String r15 = "Quebec"
                    r13.<init>(r14, r15)
                    L5.r r14 = new L5.r
                    java.lang.String r15 = "SK"
                    java.lang.String r0 = "Saskatchewan"
                    r14.<init>(r15, r0)
                    L5.r r0 = new L5.r
                    java.lang.String r15 = "YT"
                    java.lang.String r1 = "Yukon"
                    r0.<init>(r15, r1)
                    r1 = 13
                    L5.r[] r1 = new L5.r[r1]
                    r15 = 0
                    r1[r15] = r3
                    r3 = 1
                    r1[r3] = r4
                    r3 = 2
                    r1[r3] = r5
                    r3 = 3
                    r1[r3] = r6
                    r3 = 4
                    r1[r3] = r7
                    r3 = 5
                    r1[r3] = r8
                    r3 = 6
                    r1[r3] = r9
                    r3 = 7
                    r1[r3] = r10
                    r3 = 8
                    r1[r3] = r11
                    r3 = 9
                    r1[r3] = r12
                    r3 = 10
                    r1[r3] = r13
                    r3 = 11
                    r1[r3] = r14
                    r3 = 12
                    r1[r3] = r0
                    java.util.List r0 = M5.AbstractC1246t.p(r1)
                    r1 = r16
                    goto Lbf
                Lbb:
                    r1 = r16
                    r0 = r18
                Lbf:
                    r1.<init>(r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: m4.C3420j.a.C0821a.<init>(int, java.util.List, int, kotlin.jvm.internal.p):void");
            }

            @Override // m4.C3420j.a
            public List a() {
                return this.f35571d;
            }

            @Override // m4.C3420j.a
            public int b() {
                return this.f35570c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0821a)) {
                    return false;
                }
                C0821a c0821a = (C0821a) obj;
                if (this.f35570c == c0821a.f35570c && AbstractC3159y.d(this.f35571d, c0821a.f35571d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f35570c * 31) + this.f35571d.hashCode();
            }

            public String toString() {
                return "Canada(label=" + this.f35570c + ", administrativeAreas=" + this.f35571d + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0821a(int i8, List administrativeAreas) {
                super(i8, administrativeAreas, null);
                AbstractC3159y.i(administrativeAreas, "administrativeAreas");
                this.f35570c = i8;
                this.f35571d = administrativeAreas;
            }
        }

        /* renamed from: m4.j$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: c, reason: collision with root package name */
            private final int f35572c;

            /* renamed from: d, reason: collision with root package name */
            private final List f35573d;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ b(int r63, java.util.List r64, int r65, kotlin.jvm.internal.AbstractC3151p r66) {
                /*
                    Method dump skipped, instructions count: 932
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m4.C3420j.a.b.<init>(int, java.util.List, int, kotlin.jvm.internal.p):void");
            }

            @Override // m4.C3420j.a
            public List a() {
                return this.f35573d;
            }

            @Override // m4.C3420j.a
            public int b() {
                return this.f35572c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (this.f35572c == bVar.f35572c && AbstractC3159y.d(this.f35573d, bVar.f35573d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f35572c * 31) + this.f35573d.hashCode();
            }

            public String toString() {
                return "US(label=" + this.f35572c + ", administrativeAreas=" + this.f35573d + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i8, List administrativeAreas) {
                super(i8, administrativeAreas, null);
                AbstractC3159y.i(administrativeAreas, "administrativeAreas");
                this.f35572c = i8;
                this.f35573d = administrativeAreas;
            }
        }
    }

    public C3420j(a country) {
        AbstractC3159y.i(country, "country");
        List a8 = country.a();
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(a8, 10));
        Iterator it = a8.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((L5.r) it.next()).c());
        }
        this.f35561a = arrayList;
        List a9 = country.a();
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(a9, 10));
        Iterator it2 = a9.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((L5.r) it2.next()).d());
        }
        this.f35562b = arrayList2;
        this.f35564d = "administrativeArea";
        this.f35565e = country.b();
        this.f35566f = this.f35561a;
        this.f35567g = arrayList2;
    }

    @Override // m4.InterfaceC3433x
    public int b() {
        return this.f35565e;
    }

    @Override // m4.InterfaceC3433x
    public String f(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        if (this.f35561a.contains(rawValue)) {
            return (String) this.f35562b.get(this.f35561a.indexOf(rawValue));
        }
        return (String) this.f35562b.get(0);
    }

    @Override // m4.InterfaceC3433x
    public String g(int i8) {
        return (String) this.f35562b.get(i8);
    }

    @Override // m4.InterfaceC3433x
    public boolean h() {
        return InterfaceC3433x.a.a(this);
    }

    @Override // m4.InterfaceC3433x
    public List i() {
        return this.f35567g;
    }

    @Override // m4.InterfaceC3433x
    public List j() {
        return this.f35566f;
    }

    @Override // m4.InterfaceC3433x
    public boolean k() {
        return this.f35563c;
    }
}
