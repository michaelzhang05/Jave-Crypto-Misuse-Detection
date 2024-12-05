package b3;

import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l2.f;
import y4.AbstractC3993a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1870e {

    /* renamed from: m, reason: collision with root package name */
    public static final a f14436m;

    /* renamed from: n, reason: collision with root package name */
    private static final List f14437n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC1870e f14438o = new EnumC1870e("Visa", 0, "visa", "Visa", AbstractC3993a.f39856s, 0, 0, null, 0, Pattern.compile("^(4)[0-9]*$"), Q.e(L5.x.a(1, Pattern.compile("^4$"))), null, false, 1, 1656, null);

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC1870e f14439p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC1870e f14440q;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC1870e f14441r;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC1870e f14442s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC1870e f14443t;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC1870e f14444u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC1870e f14445v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC1870e f14446w;

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ EnumC1870e[] f14447x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14448y;

    /* renamed from: a, reason: collision with root package name */
    private final String f14449a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14450b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14451c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14452d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14453e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f14454f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14455g;

    /* renamed from: h, reason: collision with root package name */
    private final Pattern f14456h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f14457i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f14458j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f14459k;

    /* renamed from: l, reason: collision with root package name */
    private final int f14460l;

    /* renamed from: b3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final List d(String str) {
            Matcher matcher;
            R5.a j8 = EnumC1870e.j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : j8) {
                Pattern o8 = ((EnumC1870e) obj).o(str);
                if (o8 != null && (matcher = o8.matcher(str)) != null && matcher.matches()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((EnumC1870e) obj2).f14459k) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }

        public final EnumC1870e a(String str) {
            if (str != null && !g6.n.u(str)) {
                List d8 = d(str);
                if (d8.size() != 1) {
                    d8 = null;
                }
                if (d8 == null) {
                    d8 = AbstractC1246t.e(EnumC1870e.f14446w);
                }
                return (EnumC1870e) AbstractC1246t.m0(d8);
            }
            return EnumC1870e.f14446w;
        }

        public final EnumC1870e b(String str) {
            Object obj;
            Iterator<E> it = EnumC1870e.j().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (g6.n.s(((EnumC1870e) obj).f(), str, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            EnumC1870e enumC1870e = (EnumC1870e) obj;
            if (enumC1870e == null) {
                return EnumC1870e.f14446w;
            }
            return enumC1870e;
        }

        public final List c(String str) {
            if (str != null && !g6.n.u(str)) {
                List d8 = d(str);
                if (!(!d8.isEmpty())) {
                    d8 = null;
                }
                if (d8 == null) {
                    return AbstractC1246t.e(EnumC1870e.f14446w);
                }
                return d8;
            }
            return e();
        }

        public final List e() {
            return EnumC1870e.f14437n;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        int i8 = 0;
        f14439p = new EnumC1870e("MasterCard", 1, "mastercard", "Mastercard", AbstractC3993a.f39851n, 0, i8, null, 0, Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), Q.k(L5.x.a(1, Pattern.compile("^2|5|6$")), L5.x.a(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, false, 2, 1656, null);
        int i9 = 0;
        f14440q = new EnumC1870e("AmericanExpress", 2, "amex", "American Express", AbstractC3993a.f39838a, AbstractC3993a.f39843f, i9, a0.i(3, 4), 15, Pattern.compile("^(34|37)[0-9]*$"), Q.e(L5.x.a(1, Pattern.compile("^3$"))), null, false, 3, 1552, null);
        AbstractC3151p abstractC3151p = null;
        int i10 = 0;
        int i11 = 0;
        Set set = null;
        boolean z8 = false;
        f14441r = new EnumC1870e("Discover", 3, "discover", "Discover", AbstractC3993a.f39846i, i10, i11, set, i8, Pattern.compile("^(60|64|65)[0-9]*$"), Q.e(L5.x.a(1, Pattern.compile("^6$"))), null, z8, 4, 1656, abstractC3151p);
        int i12 = 1656;
        AbstractC3151p abstractC3151p2 = null;
        int i13 = 0;
        int i14 = 0;
        Set set2 = null;
        Map map = null;
        boolean z9 = false;
        f14442s = new EnumC1870e("JCB", 4, "jcb", "JCB", AbstractC3993a.f39849l, i13, i14, set2, i9, Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$"), Q.k(L5.x.a(1, Pattern.compile("^3$")), L5.x.a(2, Pattern.compile("^(35)$")), L5.x.a(3, Pattern.compile("^(35[2-8])$"))), map, z9, 5, i12, abstractC3151p2);
        f14443t = new EnumC1870e("DinersClub", 5, "diners", "Diners Club", AbstractC3993a.f39844g, i10, i11, set, 16, Pattern.compile("^(36|30|38|39)[0-9]*$"), Q.e(L5.x.a(1, Pattern.compile("^3$"))), Q.e(L5.x.a(Pattern.compile("^(36)[0-9]*$"), 14)), z8, 6, 1080, abstractC3151p);
        f14444u = new EnumC1870e("UnionPay", 6, "unionpay", "UnionPay", AbstractC3993a.f39853p, i13, i14, set2, i9, Pattern.compile("^(62|81)[0-9]*$"), Q.e(L5.x.a(1, Pattern.compile("^6|8$"))), map, z9, 7, i12, abstractC3151p2);
        f14445v = new EnumC1870e("CartesBancaires", 7, "cartes_bancaires", "Cartes Bancaires", AbstractC3993a.f39840c, i10, i11, set, 0, Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), Q.k(L5.x.a(1, Pattern.compile("^4$")), L5.x.a(2, Pattern.compile("^2|5|6$")), L5.x.a(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, z8, 8, 632, abstractC3151p);
        f14446w = new EnumC1870e("Unknown", 8, EnvironmentCompat.MEDIA_UNKNOWN, "Unknown", AbstractC3993a.f39855r, i13, i14, a0.i(3, 4), i9, null, Q.h(), map, z9, -1, 1752, abstractC3151p2);
        EnumC1870e[] a8 = a();
        f14447x = a8;
        f14448y = R5.b.a(a8);
        f14436m = new a(null);
        R5.a j8 = j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : j8) {
            if (((EnumC1870e) obj).f14459k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((EnumC1870e) obj2).f14460l > 0) {
                arrayList2.add(obj2);
            }
        }
        f14437n = AbstractC1246t.P0(arrayList2, new Comparator() { // from class: b3.e.b
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return O5.a.a(Integer.valueOf(((EnumC1870e) obj3).f14460l), Integer.valueOf(((EnumC1870e) obj4).f14460l));
            }
        });
    }

    private EnumC1870e(String str, int i8, String str2, String str3, int i9, int i10, int i11, Set set, int i12, Pattern pattern, Map map, Map map2, boolean z8, int i13) {
        this.f14449a = str2;
        this.f14450b = str3;
        this.f14451c = i9;
        this.f14452d = i10;
        this.f14453e = i11;
        this.f14454f = set;
        this.f14455g = i12;
        this.f14456h = pattern;
        this.f14457i = map;
        this.f14458j = map2;
        this.f14459k = z8;
        this.f14460l = i13;
    }

    private static final /* synthetic */ EnumC1870e[] a() {
        return new EnumC1870e[]{f14438o, f14439p, f14440q, f14441r, f14442s, f14443t, f14444u, f14445v, f14446w};
    }

    public static R5.a j() {
        return f14448y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pattern o(String str) {
        Pattern pattern = (Pattern) this.f14457i.get(Integer.valueOf(str.length()));
        if (pattern == null) {
            return this.f14456h;
        }
        return pattern;
    }

    public static EnumC1870e valueOf(String str) {
        return (EnumC1870e) Enum.valueOf(EnumC1870e.class, str);
    }

    public static EnumC1870e[] values() {
        return (EnumC1870e[]) f14447x.clone();
    }

    public final String f() {
        return this.f14449a;
    }

    public final int g() {
        return this.f14452d;
    }

    public final String h() {
        return this.f14450b;
    }

    public final int k() {
        return this.f14453e;
    }

    public final int l() {
        return this.f14451c;
    }

    public final int m() {
        Integer num = (Integer) AbstractC1246t.A0(this.f14454f);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final int n(String cardNumber) {
        Object obj;
        AbstractC3159y.i(cardNumber, "cardNumber");
        String g8 = new f.b(cardNumber).g();
        Iterator it = this.f14458j.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Pattern) ((Map.Entry) obj).getKey()).matcher(g8).matches()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ((Number) entry.getValue()).intValue();
        }
        return this.f14455g;
    }

    public final boolean p(String str) {
        int i8;
        String obj;
        if (str != null && (obj = g6.n.M0(str).toString()) != null) {
            i8 = obj.length();
        } else {
            i8 = 0;
        }
        if (m() != i8) {
            return false;
        }
        return true;
    }

    /* synthetic */ EnumC1870e(String str, int i8, String str2, String str3, int i9, int i10, int i11, Set set, int i12, Pattern pattern, Map map, Map map2, boolean z8, int i13, int i14, AbstractC3151p abstractC3151p) {
        this(str, i8, str2, str3, i9, (i14 & 8) != 0 ? AbstractC3993a.f39842e : i10, (i14 & 16) != 0 ? AbstractC3993a.f39848k : i11, (i14 & 32) != 0 ? a0.d(3) : set, (i14 & 64) != 0 ? 16 : i12, (i14 & 128) != 0 ? null : pattern, map, (i14 & 512) != 0 ? Q.h() : map2, (i14 & 1024) != 0 ? true : z8, i13);
    }
}
