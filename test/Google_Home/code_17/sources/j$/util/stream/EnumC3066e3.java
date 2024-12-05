package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC3066e3 {
    public static final EnumC3066e3 DISTINCT;
    public static final EnumC3066e3 ORDERED;
    public static final EnumC3066e3 SHORT_CIRCUIT;
    public static final EnumC3066e3 SIZED;
    public static final EnumC3066e3 SORTED;

    /* renamed from: f, reason: collision with root package name */
    static final int f33709f;

    /* renamed from: g, reason: collision with root package name */
    static final int f33710g;

    /* renamed from: h, reason: collision with root package name */
    static final int f33711h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f33712i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f33713j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f33714k;

    /* renamed from: l, reason: collision with root package name */
    static final int f33715l;

    /* renamed from: m, reason: collision with root package name */
    static final int f33716m;

    /* renamed from: n, reason: collision with root package name */
    static final int f33717n;

    /* renamed from: o, reason: collision with root package name */
    static final int f33718o;

    /* renamed from: p, reason: collision with root package name */
    static final int f33719p;

    /* renamed from: q, reason: collision with root package name */
    static final int f33720q;

    /* renamed from: r, reason: collision with root package name */
    static final int f33721r;

    /* renamed from: s, reason: collision with root package name */
    static final int f33722s;

    /* renamed from: t, reason: collision with root package name */
    static final int f33723t;

    /* renamed from: u, reason: collision with root package name */
    static final int f33724u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumC3066e3[] f33725v;

    /* renamed from: a, reason: collision with root package name */
    private final Map f33726a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33727b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33728c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33729d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33730e;

    static {
        EnumC3061d3 enumC3061d3 = EnumC3061d3.SPLITERATOR;
        C3056c3 v8 = v(enumC3061d3);
        EnumC3061d3 enumC3061d32 = EnumC3061d3.STREAM;
        v8.a(enumC3061d32);
        EnumC3061d3 enumC3061d33 = EnumC3061d3.OP;
        v8.f33691a.put(enumC3061d33, 3);
        EnumC3066e3 enumC3066e3 = new EnumC3066e3("DISTINCT", 0, 0, v8);
        DISTINCT = enumC3066e3;
        C3056c3 v9 = v(enumC3061d3);
        v9.a(enumC3061d32);
        v9.f33691a.put(enumC3061d33, 3);
        EnumC3066e3 enumC3066e32 = new EnumC3066e3("SORTED", 1, 1, v9);
        SORTED = enumC3066e32;
        C3056c3 v10 = v(enumC3061d3);
        v10.a(enumC3061d32);
        Map map = v10.f33691a;
        map.put(enumC3061d33, 3);
        EnumC3061d3 enumC3061d34 = EnumC3061d3.TERMINAL_OP;
        map.put(enumC3061d34, 2);
        EnumC3061d3 enumC3061d35 = EnumC3061d3.UPSTREAM_TERMINAL_OP;
        map.put(enumC3061d35, 2);
        EnumC3066e3 enumC3066e33 = new EnumC3066e3("ORDERED", 2, 2, v10);
        ORDERED = enumC3066e33;
        C3056c3 v11 = v(enumC3061d3);
        v11.a(enumC3061d32);
        v11.f33691a.put(enumC3061d33, 2);
        EnumC3066e3 enumC3066e34 = new EnumC3066e3("SIZED", 3, 3, v11);
        SIZED = enumC3066e34;
        C3056c3 v12 = v(enumC3061d33);
        v12.a(enumC3061d34);
        EnumC3066e3 enumC3066e35 = new EnumC3066e3("SHORT_CIRCUIT", 4, 12, v12);
        SHORT_CIRCUIT = enumC3066e35;
        f33725v = new EnumC3066e3[]{enumC3066e3, enumC3066e32, enumC3066e33, enumC3066e34, enumC3066e35};
        f33709f = l(enumC3061d3);
        f33710g = l(enumC3061d32);
        f33711h = l(enumC3061d33);
        l(enumC3061d34);
        l(enumC3061d35);
        int i8 = 0;
        for (EnumC3066e3 enumC3066e36 : values()) {
            i8 |= enumC3066e36.f33730e;
        }
        f33712i = i8;
        int i9 = f33710g;
        f33713j = i9;
        int i10 = i9 << 1;
        f33714k = i10;
        f33715l = i9 | i10;
        EnumC3066e3 enumC3066e37 = DISTINCT;
        f33716m = enumC3066e37.f33728c;
        f33717n = enumC3066e37.f33729d;
        EnumC3066e3 enumC3066e38 = SORTED;
        f33718o = enumC3066e38.f33728c;
        f33719p = enumC3066e38.f33729d;
        EnumC3066e3 enumC3066e39 = ORDERED;
        f33720q = enumC3066e39.f33728c;
        f33721r = enumC3066e39.f33729d;
        EnumC3066e3 enumC3066e310 = SIZED;
        f33722s = enumC3066e310.f33728c;
        f33723t = enumC3066e310.f33729d;
        f33724u = SHORT_CIRCUIT.f33728c;
    }

    private EnumC3066e3(String str, int i8, int i9, C3056c3 c3056c3) {
        EnumC3061d3[] values = EnumC3061d3.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            Map map = c3056c3.f33691a;
            if (i10 >= length) {
                this.f33726a = map;
                int i11 = i9 * 2;
                this.f33727b = i11;
                this.f33728c = 1 << i11;
                this.f33729d = 2 << i11;
                this.f33730e = 3 << i11;
                return;
            }
            AbstractC3027d.t(map, values[i10], 0);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i8, int i9) {
        return i8 | (i9 & (i8 == 0 ? f33712i : ~(((f33713j & i8) << 1) | i8 | ((f33714k & i8) >> 1))));
    }

    private static int l(EnumC3061d3 enumC3061d3) {
        int i8 = 0;
        for (EnumC3066e3 enumC3066e3 : values()) {
            i8 |= ((Integer) enumC3066e3.f33726a.get(enumC3061d3)).intValue() << enumC3066e3.f33727b;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i8 = characteristics & 4;
        int i9 = f33709f;
        return (i8 == 0 || spliterator.getComparator() == null) ? characteristics & i9 : characteristics & i9 & (-5);
    }

    private static C3056c3 v(EnumC3061d3 enumC3061d3) {
        C3056c3 c3056c3 = new C3056c3(new EnumMap(EnumC3061d3.class));
        c3056c3.a(enumC3061d3);
        return c3056c3;
    }

    public static EnumC3066e3 valueOf(String str) {
        return (EnumC3066e3) Enum.valueOf(EnumC3066e3.class, str);
    }

    public static EnumC3066e3[] values() {
        return (EnumC3066e3[]) f33725v.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i8) {
        return i8 & ((~i8) >> 1) & f33713j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(int i8) {
        return (i8 & this.f33730e) == this.f33728c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(int i8) {
        int i9 = this.f33730e;
        return (i8 & i9) == i9;
    }
}
