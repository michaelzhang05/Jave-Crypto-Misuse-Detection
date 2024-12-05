package p4;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.InterfaceC3776x;

/* renamed from: p4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3763j implements InterfaceC3776x {

    /* renamed from: a, reason: collision with root package name */
    private final List f37587a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37588b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37589c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37590d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37591e;

    /* renamed from: f, reason: collision with root package name */
    private final List f37592f;

    /* renamed from: g, reason: collision with root package name */
    private final List f37593g;

    /* renamed from: p4.j$a */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f37594a;

        /* renamed from: b, reason: collision with root package name */
        private final List f37595b;

        public /* synthetic */ a(int i8, List list, AbstractC3247p abstractC3247p) {
            this(i8, list);
        }

        public abstract List a();

        public abstract int b();

        private a(int i8, List list) {
            this.f37594a = i8;
            this.f37595b = list;
        }

        /* renamed from: p4.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0851a extends a {

            /* renamed from: c, reason: collision with root package name */
            private final int f37596c;

            /* renamed from: d, reason: collision with root package name */
            private final List f37597d;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ C0851a(int r17, java.util.List r18, int r19, kotlin.jvm.internal.AbstractC3247p r20) {
                /*
                    r16 = this;
                    r0 = 2
                    r1 = 1
                    r2 = r19 & 1
                    if (r2 == 0) goto L9
                    int r2 = u2.AbstractC4058e.f39961h
                    goto Lb
                L9:
                    r2 = r17
                Lb:
                    r3 = r19 & 2
                    if (r3 == 0) goto Lbb
                    O5.r r3 = new O5.r
                    java.lang.String r4 = "AB"
                    java.lang.String r5 = "Alberta"
                    r3.<init>(r4, r5)
                    O5.r r4 = new O5.r
                    java.lang.String r5 = "BC"
                    java.lang.String r6 = "British Columbia"
                    r4.<init>(r5, r6)
                    O5.r r5 = new O5.r
                    java.lang.String r6 = "MB"
                    java.lang.String r7 = "Manitoba"
                    r5.<init>(r6, r7)
                    O5.r r6 = new O5.r
                    java.lang.String r7 = "NB"
                    java.lang.String r8 = "New Brunswick"
                    r6.<init>(r7, r8)
                    O5.r r7 = new O5.r
                    java.lang.String r8 = "NL"
                    java.lang.String r9 = "Newfoundland and Labrador"
                    r7.<init>(r8, r9)
                    O5.r r8 = new O5.r
                    java.lang.String r9 = "NT"
                    java.lang.String r10 = "Northwest Territories"
                    r8.<init>(r9, r10)
                    O5.r r9 = new O5.r
                    java.lang.String r10 = "NS"
                    java.lang.String r11 = "Nova Scotia"
                    r9.<init>(r10, r11)
                    O5.r r10 = new O5.r
                    java.lang.String r11 = "NU"
                    java.lang.String r12 = "Nunavut"
                    r10.<init>(r11, r12)
                    O5.r r11 = new O5.r
                    java.lang.String r12 = "ON"
                    java.lang.String r13 = "Ontario"
                    r11.<init>(r12, r13)
                    O5.r r12 = new O5.r
                    java.lang.String r13 = "PE"
                    java.lang.String r14 = "Prince Edward Island"
                    r12.<init>(r13, r14)
                    O5.r r13 = new O5.r
                    java.lang.String r14 = "QC"
                    java.lang.String r15 = "Quebec"
                    r13.<init>(r14, r15)
                    O5.r r14 = new O5.r
                    java.lang.String r15 = "SK"
                    java.lang.String r0 = "Saskatchewan"
                    r14.<init>(r15, r0)
                    O5.r r0 = new O5.r
                    java.lang.String r15 = "YT"
                    java.lang.String r1 = "Yukon"
                    r0.<init>(r15, r1)
                    r1 = 13
                    O5.r[] r1 = new O5.r[r1]
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
                    java.util.List r0 = P5.AbstractC1378t.p(r1)
                    r1 = r16
                    goto Lbf
                Lbb:
                    r1 = r16
                    r0 = r18
                Lbf:
                    r1.<init>(r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p4.C3763j.a.C0851a.<init>(int, java.util.List, int, kotlin.jvm.internal.p):void");
            }

            @Override // p4.C3763j.a
            public List a() {
                return this.f37597d;
            }

            @Override // p4.C3763j.a
            public int b() {
                return this.f37596c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0851a)) {
                    return false;
                }
                C0851a c0851a = (C0851a) obj;
                if (this.f37596c == c0851a.f37596c && AbstractC3255y.d(this.f37597d, c0851a.f37597d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f37596c * 31) + this.f37597d.hashCode();
            }

            public String toString() {
                return "Canada(label=" + this.f37596c + ", administrativeAreas=" + this.f37597d + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0851a(int i8, List administrativeAreas) {
                super(i8, administrativeAreas, null);
                AbstractC3255y.i(administrativeAreas, "administrativeAreas");
                this.f37596c = i8;
                this.f37597d = administrativeAreas;
            }
        }

        /* renamed from: p4.j$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: c, reason: collision with root package name */
            private final int f37598c;

            /* renamed from: d, reason: collision with root package name */
            private final List f37599d;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ b(int r63, java.util.List r64, int r65, kotlin.jvm.internal.AbstractC3247p r66) {
                /*
                    Method dump skipped, instructions count: 932
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p4.C3763j.a.b.<init>(int, java.util.List, int, kotlin.jvm.internal.p):void");
            }

            @Override // p4.C3763j.a
            public List a() {
                return this.f37599d;
            }

            @Override // p4.C3763j.a
            public int b() {
                return this.f37598c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (this.f37598c == bVar.f37598c && AbstractC3255y.d(this.f37599d, bVar.f37599d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f37598c * 31) + this.f37599d.hashCode();
            }

            public String toString() {
                return "US(label=" + this.f37598c + ", administrativeAreas=" + this.f37599d + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i8, List administrativeAreas) {
                super(i8, administrativeAreas, null);
                AbstractC3255y.i(administrativeAreas, "administrativeAreas");
                this.f37598c = i8;
                this.f37599d = administrativeAreas;
            }
        }
    }

    public C3763j(a country) {
        AbstractC3255y.i(country, "country");
        List a8 = country.a();
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(a8, 10));
        Iterator it = a8.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((O5.r) it.next()).c());
        }
        this.f37587a = arrayList;
        List a9 = country.a();
        ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(a9, 10));
        Iterator it2 = a9.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((O5.r) it2.next()).d());
        }
        this.f37588b = arrayList2;
        this.f37590d = "administrativeArea";
        this.f37591e = country.b();
        this.f37592f = this.f37587a;
        this.f37593g = arrayList2;
    }

    @Override // p4.InterfaceC3776x
    public int b() {
        return this.f37591e;
    }

    @Override // p4.InterfaceC3776x
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        if (this.f37587a.contains(rawValue)) {
            return (String) this.f37588b.get(this.f37587a.indexOf(rawValue));
        }
        return (String) this.f37588b.get(0);
    }

    @Override // p4.InterfaceC3776x
    public String d(int i8) {
        return (String) this.f37588b.get(i8);
    }

    @Override // p4.InterfaceC3776x
    public boolean e() {
        return InterfaceC3776x.a.a(this);
    }

    @Override // p4.InterfaceC3776x
    public List f() {
        return this.f37593g;
    }

    @Override // p4.InterfaceC3776x
    public List g() {
        return this.f37592f;
    }

    @Override // p4.InterfaceC3776x
    public boolean h() {
        return this.f37589c;
    }
}
