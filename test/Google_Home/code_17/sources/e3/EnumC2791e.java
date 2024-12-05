package e3;

import P5.AbstractC1378t;
import P5.Q;
import P5.a0;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o2.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2791e {

    /* renamed from: m, reason: collision with root package name */
    public static final a f31442m;

    /* renamed from: n, reason: collision with root package name */
    private static final List f31443n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC2791e f31444o = new EnumC2791e("Visa", 0, "visa", "Visa", B4.a.f900s, 0, 0, null, 0, Pattern.compile("^(4)[0-9]*$"), Q.e(O5.x.a(1, Pattern.compile("^4$"))), null, false, 1, 1656, null);

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC2791e f31445p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC2791e f31446q;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC2791e f31447r;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC2791e f31448s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC2791e f31449t;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC2791e f31450u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC2791e f31451v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC2791e f31452w;

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ EnumC2791e[] f31453x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ U5.a f31454y;

    /* renamed from: a, reason: collision with root package name */
    private final String f31455a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31456b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31457c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31458d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31459e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f31460f;

    /* renamed from: g, reason: collision with root package name */
    private final int f31461g;

    /* renamed from: h, reason: collision with root package name */
    private final Pattern f31462h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f31463i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f31464j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f31465k;

    /* renamed from: l, reason: collision with root package name */
    private final int f31466l;

    /* renamed from: e3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final List d(String str) {
            Matcher matcher;
            U5.a i8 = EnumC2791e.i();
            ArrayList arrayList = new ArrayList();
            for (Object obj : i8) {
                Pattern o8 = ((EnumC2791e) obj).o(str);
                if (o8 != null && (matcher = o8.matcher(str)) != null && matcher.matches()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((EnumC2791e) obj2).f31465k) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }

        public final EnumC2791e a(String str) {
            if (str != null && !j6.n.u(str)) {
                List d8 = d(str);
                if (d8.size() != 1) {
                    d8 = null;
                }
                if (d8 == null) {
                    d8 = AbstractC1378t.e(EnumC2791e.f31452w);
                }
                return (EnumC2791e) AbstractC1378t.m0(d8);
            }
            return EnumC2791e.f31452w;
        }

        public final EnumC2791e b(String str) {
            Object obj;
            Iterator<E> it = EnumC2791e.i().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (j6.n.s(((EnumC2791e) obj).f(), str, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            EnumC2791e enumC2791e = (EnumC2791e) obj;
            if (enumC2791e == null) {
                return EnumC2791e.f31452w;
            }
            return enumC2791e;
        }

        public final List c(String str) {
            if (str != null && !j6.n.u(str)) {
                List d8 = d(str);
                if (!(!d8.isEmpty())) {
                    d8 = null;
                }
                if (d8 == null) {
                    return AbstractC1378t.e(EnumC2791e.f31452w);
                }
                return d8;
            }
            return e();
        }

        public final List e() {
            return EnumC2791e.f31443n;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        int i8 = 0;
        f31445p = new EnumC2791e("MasterCard", 1, "mastercard", "Mastercard", B4.a.f895n, 0, i8, null, 0, Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), Q.k(O5.x.a(1, Pattern.compile("^2|5|6$")), O5.x.a(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, false, 2, 1656, null);
        int i9 = 0;
        f31446q = new EnumC2791e("AmericanExpress", 2, "amex", "American Express", B4.a.f882a, B4.a.f887f, i9, a0.i(3, 4), 15, Pattern.compile("^(34|37)[0-9]*$"), Q.e(O5.x.a(1, Pattern.compile("^3$"))), null, false, 3, 1552, null);
        AbstractC3247p abstractC3247p = null;
        int i10 = 0;
        int i11 = 0;
        Set set = null;
        boolean z8 = false;
        f31447r = new EnumC2791e("Discover", 3, "discover", "Discover", B4.a.f890i, i10, i11, set, i8, Pattern.compile("^(60|64|65)[0-9]*$"), Q.e(O5.x.a(1, Pattern.compile("^6$"))), null, z8, 4, 1656, abstractC3247p);
        int i12 = 1656;
        AbstractC3247p abstractC3247p2 = null;
        int i13 = 0;
        int i14 = 0;
        Set set2 = null;
        Map map = null;
        boolean z9 = false;
        f31448s = new EnumC2791e("JCB", 4, "jcb", "JCB", B4.a.f893l, i13, i14, set2, i9, Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$"), Q.k(O5.x.a(1, Pattern.compile("^3$")), O5.x.a(2, Pattern.compile("^(35)$")), O5.x.a(3, Pattern.compile("^(35[2-8])$"))), map, z9, 5, i12, abstractC3247p2);
        f31449t = new EnumC2791e("DinersClub", 5, "diners", "Diners Club", B4.a.f888g, i10, i11, set, 16, Pattern.compile("^(36|30|38|39)[0-9]*$"), Q.e(O5.x.a(1, Pattern.compile("^3$"))), Q.e(O5.x.a(Pattern.compile("^(36)[0-9]*$"), 14)), z8, 6, 1080, abstractC3247p);
        f31450u = new EnumC2791e("UnionPay", 6, "unionpay", "UnionPay", B4.a.f897p, i13, i14, set2, i9, Pattern.compile("^(62|81)[0-9]*$"), Q.e(O5.x.a(1, Pattern.compile("^6|8$"))), map, z9, 7, i12, abstractC3247p2);
        f31451v = new EnumC2791e("CartesBancaires", 7, "cartes_bancaires", "Cartes Bancaires", B4.a.f884c, i10, i11, set, 0, Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), Q.k(O5.x.a(1, Pattern.compile("^4$")), O5.x.a(2, Pattern.compile("^2|5|6$")), O5.x.a(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, z8, 8, 632, abstractC3247p);
        f31452w = new EnumC2791e("Unknown", 8, EnvironmentCompat.MEDIA_UNKNOWN, "Unknown", B4.a.f899r, i13, i14, a0.i(3, 4), i9, null, Q.h(), map, z9, -1, 1752, abstractC3247p2);
        EnumC2791e[] a8 = a();
        f31453x = a8;
        f31454y = U5.b.a(a8);
        f31442m = new a(null);
        U5.a i15 = i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : i15) {
            if (((EnumC2791e) obj).f31465k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((EnumC2791e) obj2).f31466l > 0) {
                arrayList2.add(obj2);
            }
        }
        f31443n = AbstractC1378t.P0(arrayList2, new Comparator() { // from class: e3.e.b
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return R5.a.a(Integer.valueOf(((EnumC2791e) obj3).f31466l), Integer.valueOf(((EnumC2791e) obj4).f31466l));
            }
        });
    }

    private EnumC2791e(String str, int i8, String str2, String str3, int i9, int i10, int i11, Set set, int i12, Pattern pattern, Map map, Map map2, boolean z8, int i13) {
        this.f31455a = str2;
        this.f31456b = str3;
        this.f31457c = i9;
        this.f31458d = i10;
        this.f31459e = i11;
        this.f31460f = set;
        this.f31461g = i12;
        this.f31462h = pattern;
        this.f31463i = map;
        this.f31464j = map2;
        this.f31465k = z8;
        this.f31466l = i13;
    }

    private static final /* synthetic */ EnumC2791e[] a() {
        return new EnumC2791e[]{f31444o, f31445p, f31446q, f31447r, f31448s, f31449t, f31450u, f31451v, f31452w};
    }

    public static U5.a i() {
        return f31454y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pattern o(String str) {
        Pattern pattern = (Pattern) this.f31463i.get(Integer.valueOf(str.length()));
        if (pattern == null) {
            return this.f31462h;
        }
        return pattern;
    }

    public static EnumC2791e valueOf(String str) {
        return (EnumC2791e) Enum.valueOf(EnumC2791e.class, str);
    }

    public static EnumC2791e[] values() {
        return (EnumC2791e[]) f31453x.clone();
    }

    public final String f() {
        return this.f31455a;
    }

    public final int g() {
        return this.f31458d;
    }

    public final String h() {
        return this.f31456b;
    }

    public final int j() {
        return this.f31459e;
    }

    public final int k() {
        return this.f31457c;
    }

    public final int m() {
        Integer num = (Integer) AbstractC1378t.A0(this.f31460f);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final int n(String cardNumber) {
        Object obj;
        AbstractC3255y.i(cardNumber, "cardNumber");
        String g8 = new f.b(cardNumber).g();
        Iterator it = this.f31464j.entrySet().iterator();
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
        return this.f31461g;
    }

    public final boolean q(String str) {
        int i8;
        String obj;
        if (str != null && (obj = j6.n.M0(str).toString()) != null) {
            i8 = obj.length();
        } else {
            i8 = 0;
        }
        if (m() != i8) {
            return false;
        }
        return true;
    }

    /* synthetic */ EnumC2791e(String str, int i8, String str2, String str3, int i9, int i10, int i11, Set set, int i12, Pattern pattern, Map map, Map map2, boolean z8, int i13, int i14, AbstractC3247p abstractC3247p) {
        this(str, i8, str2, str3, i9, (i14 & 8) != 0 ? B4.a.f886e : i10, (i14 & 16) != 0 ? B4.a.f892k : i11, (i14 & 32) != 0 ? a0.d(3) : set, (i14 & 64) != 0 ? 16 : i12, (i14 & 128) != 0 ? null : pattern, map, (i14 & 512) != 0 ? Q.h() : map2, (i14 & 1024) != 0 ? true : z8, i13);
    }
}
