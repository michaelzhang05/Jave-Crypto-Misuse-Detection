package kotlin.reflect.jvm.internal.impl.descriptors.n1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.collections.s;
import kotlin.collections.t;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'z' uses external variables
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
/* compiled from: KotlinTarget.kt */
/* loaded from: classes2.dex */
public final class n {
    public static final n A;
    public static final n B;
    public static final n C;
    public static final n D;
    public static final n E;
    public static final n F;
    public static final n G;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<n> f21693h;

    /* renamed from: i, reason: collision with root package name */
    private static final Set<n> f21694i;

    /* renamed from: j, reason: collision with root package name */
    private static final List<n> f21695j;

    /* renamed from: k, reason: collision with root package name */
    private static final List<n> f21696k;
    private static final List<n> l;
    private static final List<n> m;
    private static final List<n> n;
    private static final List<n> o;
    private static final List<n> p;
    private static final List<n> q;
    private static final List<n> r;
    private static final List<n> s;
    private static final List<n> t;
    private static final List<n> u;
    private static final Map<e, n> v;
    public static final n z;
    private final String n0;
    private final boolean o0;
    public static final n w = new n("CLASS", 0, "class", false, 2, null);
    public static final n x = new n("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final n y = new n("TYPE_PARAMETER", 2, "type parameter", false);
    public static final n H = new n("TYPE", 11, "type usage", false);
    public static final n I = new n("EXPRESSION", 12, "expression", false);
    public static final n J = new n("FILE", 13, "file", false);
    public static final n K = new n("TYPEALIAS", 14, "typealias", false);
    public static final n L = new n("TYPE_PROJECTION", 15, "type projection", false);
    public static final n M = new n("STAR_PROJECTION", 16, "star projection", false);
    public static final n N = new n("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final n O = new n("CLASS_ONLY", 18, "class", false);
    public static final n P = new n("OBJECT", 19, "object", false);
    public static final n Q = new n("COMPANION_OBJECT", 20, "companion object", false);
    public static final n R = new n("INTERFACE", 21, "interface", false);
    public static final n S = new n("ENUM_CLASS", 22, "enum class", false);
    public static final n T = new n("ENUM_ENTRY", 23, "enum entry", false);
    public static final n U = new n("LOCAL_CLASS", 24, "local class", false);
    public static final n V = new n("LOCAL_FUNCTION", 25, "local function", false);
    public static final n W = new n("MEMBER_FUNCTION", 26, "member function", false);
    public static final n X = new n("TOP_LEVEL_FUNCTION", 27, "top level function", false);
    public static final n Y = new n("MEMBER_PROPERTY", 28, "member property", false);
    public static final n Z = new n("MEMBER_PROPERTY_WITH_BACKING_FIELD", 29, "member property with backing field", false);
    public static final n a0 = new n("MEMBER_PROPERTY_WITH_DELEGATE", 30, "member property with delegate", false);
    public static final n b0 = new n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 31, "member property without backing field or delegate", false);
    public static final n c0 = new n("TOP_LEVEL_PROPERTY", 32, "top level property", false);
    public static final n d0 = new n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 33, "top level property with backing field", false);
    public static final n e0 = new n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 34, "top level property with delegate", false);
    public static final n f0 = new n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 35, "top level property without backing field or delegate", false);
    public static final n g0 = new n("BACKING_FIELD", 36, "backing field", false, 2, null);
    public static final n h0 = new n("INITIALIZER", 37, "initializer", false);
    public static final n i0 = new n("DESTRUCTURING_DECLARATION", 38, "destructuring declaration", false);
    public static final n j0 = new n("LAMBDA_EXPRESSION", 39, "lambda expression", false);
    public static final n k0 = new n("ANONYMOUS_FUNCTION", 40, "anonymous function", false);
    public static final n l0 = new n("OBJECT_LITERAL", 41, "object literal", false);
    private static final /* synthetic */ n[] m0 = d();

    /* renamed from: f, reason: collision with root package name */
    public static final a f21691f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, n> f21692g = new HashMap<>();

    /* compiled from: KotlinTarget.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    static {
        Set<n> C0;
        Set<n> j02;
        List<n> l2;
        List<n> l3;
        List<n> l4;
        List<n> l5;
        List<n> l6;
        List<n> l7;
        List<n> l8;
        List<n> l9;
        List<n> e2;
        List<n> e3;
        List<n> e4;
        List<n> e5;
        Map<e, n> l10;
        boolean z2 = false;
        int i2 = 2;
        kotlin.jvm.internal.g gVar = null;
        z = new n("PROPERTY", 3, "property", z2, i2, gVar);
        boolean z3 = false;
        int i3 = 2;
        kotlin.jvm.internal.g gVar2 = null;
        A = new n("FIELD", 4, "field", z3, i3, gVar2);
        B = new n("LOCAL_VARIABLE", 5, "local variable", z2, i2, gVar);
        C = new n("VALUE_PARAMETER", 6, "value parameter", z3, i3, gVar2);
        D = new n("CONSTRUCTOR", 7, "constructor", z2, i2, gVar);
        E = new n("FUNCTION", 8, "function", z3, i3, gVar2);
        F = new n("PROPERTY_GETTER", 9, "getter", z2, i2, gVar);
        G = new n("PROPERTY_SETTER", 10, "setter", z3, i3, gVar2);
        for (n nVar : values()) {
            f21692g.put(nVar.name(), nVar);
        }
        n[] values = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : values) {
            if (nVar2.o0) {
                arrayList.add(nVar2);
            }
        }
        C0 = b0.C0(arrayList);
        f21693h = C0;
        j02 = kotlin.collections.n.j0(values());
        f21694i = j02;
        n nVar3 = w;
        l2 = t.l(x, nVar3);
        f21695j = l2;
        l3 = t.l(U, nVar3);
        f21696k = l3;
        l4 = t.l(O, nVar3);
        l = l4;
        n nVar4 = P;
        l5 = t.l(Q, nVar4, nVar3);
        m = l5;
        l6 = t.l(nVar4, nVar3);
        n = l6;
        l7 = t.l(R, nVar3);
        o = l7;
        l8 = t.l(S, nVar3);
        p = l8;
        n nVar5 = z;
        n nVar6 = A;
        l9 = t.l(T, nVar5, nVar6);
        q = l9;
        n nVar7 = G;
        e2 = s.e(nVar7);
        r = e2;
        n nVar8 = F;
        e3 = s.e(nVar8);
        s = e3;
        e4 = s.e(E);
        t = e4;
        n nVar9 = J;
        e5 = s.e(nVar9);
        u = e5;
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar10 = C;
        l10 = o0.l(kotlin.s.a(eVar, nVar10), kotlin.s.a(e.FIELD, nVar6), kotlin.s.a(e.PROPERTY, nVar5), kotlin.s.a(e.FILE, nVar9), kotlin.s.a(e.PROPERTY_GETTER, nVar8), kotlin.s.a(e.PROPERTY_SETTER, nVar7), kotlin.s.a(e.RECEIVER, nVar10), kotlin.s.a(e.SETTER_PARAMETER, nVar10), kotlin.s.a(e.PROPERTY_DELEGATE_FIELD, nVar6));
        v = l10;
    }

    private n(String str, int i2, String str2, boolean z2) {
        this.n0 = str2;
        this.o0 = z2;
    }

    private static final /* synthetic */ n[] d() {
        return new n[]{w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0, e0, f0, g0, h0, i0, j0, k0, l0};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) m0.clone();
    }

    /* synthetic */ n(String str, int i2, String str2, boolean z2, int i3, kotlin.jvm.internal.g gVar) {
        this(str, i2, str2, (i3 & 2) != 0 ? true : z2);
    }
}
