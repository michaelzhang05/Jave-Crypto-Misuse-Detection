package i.a.g.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: DNSState.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final g f18411f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f18412g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f18413h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f18414i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f18415j;

    /* renamed from: k, reason: collision with root package name */
    public static final g f18416k;
    public static final g l;
    public static final g m;
    public static final g n;
    public static final g o;
    public static final g p;
    public static final g q;
    private static final /* synthetic */ g[] r;
    private final String s;
    private final b t;

    /* compiled from: DNSState.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.f18411f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.f18412g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.f18413h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.f18414i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.f18415j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.f18416k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[g.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[g.p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[g.q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: DNSState.java */
    /* loaded from: classes2.dex */
    private enum b {
        probing,
        announcing,
        announced,
        canceling,
        canceled,
        closing,
        closed
    }

    static {
        b bVar = b.probing;
        g gVar = new g("PROBING_1", 0, "probing 1", bVar);
        f18411f = gVar;
        g gVar2 = new g("PROBING_2", 1, "probing 2", bVar);
        f18412g = gVar2;
        g gVar3 = new g("PROBING_3", 2, "probing 3", bVar);
        f18413h = gVar3;
        b bVar2 = b.announcing;
        g gVar4 = new g("ANNOUNCING_1", 3, "announcing 1", bVar2);
        f18414i = gVar4;
        g gVar5 = new g("ANNOUNCING_2", 4, "announcing 2", bVar2);
        f18415j = gVar5;
        g gVar6 = new g("ANNOUNCED", 5, "announced", b.announced);
        f18416k = gVar6;
        b bVar3 = b.canceling;
        g gVar7 = new g("CANCELING_1", 6, "canceling 1", bVar3);
        l = gVar7;
        g gVar8 = new g("CANCELING_2", 7, "canceling 2", bVar3);
        m = gVar8;
        g gVar9 = new g("CANCELING_3", 8, "canceling 3", bVar3);
        n = gVar9;
        g gVar10 = new g("CANCELED", 9, "canceled", b.canceled);
        o = gVar10;
        g gVar11 = new g("CLOSING", 10, "closing", b.closing);
        p = gVar11;
        g gVar12 = new g("CLOSED", 11, "closed", b.closed);
        q = gVar12;
        r = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12};
    }

    private g(String str, int i2, String str2, b bVar) {
        this.s = str2;
        this.t = bVar;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) r.clone();
    }

    public final boolean B() {
        return this.t == b.closing;
    }

    public final boolean C() {
        return this.t == b.probing;
    }

    public final g D() {
        switch (a.a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return f18411f;
            case 7:
            case 8:
            case 9:
                return l;
            case 10:
                return o;
            case 11:
                return p;
            case 12:
                return q;
            default:
                return this;
        }
    }

    public final g d() {
        switch (a.a[ordinal()]) {
            case 1:
                return f18412g;
            case 2:
                return f18413h;
            case 3:
                return f18414i;
            case 4:
                return f18415j;
            case 5:
                return f18416k;
            case 6:
                return f18416k;
            case 7:
                return m;
            case 8:
                return n;
            case 9:
                return o;
            case 10:
                return o;
            case 11:
                return q;
            case 12:
                return q;
            default:
                return this;
        }
    }

    public final boolean f() {
        return this.t == b.announced;
    }

    public final boolean i() {
        return this.t == b.announcing;
    }

    public final boolean n() {
        return this.t == b.canceled;
    }

    public final boolean o() {
        return this.t == b.canceling;
    }

    public final boolean r() {
        return this.t == b.closed;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.s;
    }
}
