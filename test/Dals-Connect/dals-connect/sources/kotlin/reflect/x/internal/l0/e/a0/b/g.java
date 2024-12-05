package kotlin.reflect.x.internal.l0.e.a0.b;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.IndexedValue;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.ranges.f;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.z.c;
import okhttp3.HttpUrl;

/* compiled from: JvmNameResolverBase.kt */
/* loaded from: classes2.dex */
public class g implements c {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final String f20402b;

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f20403c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f20404d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f20405e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Integer> f20406f;

    /* renamed from: g, reason: collision with root package name */
    private final List<a.e.c> f20407g;

    /* compiled from: JvmNameResolverBase.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* compiled from: JvmNameResolverBase.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.e.c.EnumC0318c.values().length];
            iArr[a.e.c.EnumC0318c.NONE.ordinal()] = 1;
            iArr[a.e.c.EnumC0318c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[a.e.c.EnumC0318c.DESC_TO_CLASS_ID.ordinal()] = 3;
            a = iArr;
        }
    }

    static {
        List l;
        String b0;
        List<String> l2;
        Iterable<IndexedValue> E0;
        int t;
        int e2;
        int b2;
        l = t.l('k', 'o', 't', 'l', 'i', 'n');
        b0 = b0.b0(l, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);
        f20402b = b0;
        l2 = t.l(b0 + "/Any", b0 + "/Nothing", b0 + "/Unit", b0 + "/Throwable", b0 + "/Number", b0 + "/Byte", b0 + "/Double", b0 + "/Float", b0 + "/Int", b0 + "/Long", b0 + "/Short", b0 + "/Boolean", b0 + "/Char", b0 + "/CharSequence", b0 + "/String", b0 + "/Comparable", b0 + "/Enum", b0 + "/Array", b0 + "/ByteArray", b0 + "/DoubleArray", b0 + "/FloatArray", b0 + "/IntArray", b0 + "/LongArray", b0 + "/ShortArray", b0 + "/BooleanArray", b0 + "/CharArray", b0 + "/Cloneable", b0 + "/Annotation", b0 + "/collections/Iterable", b0 + "/collections/MutableIterable", b0 + "/collections/Collection", b0 + "/collections/MutableCollection", b0 + "/collections/List", b0 + "/collections/MutableList", b0 + "/collections/Set", b0 + "/collections/MutableSet", b0 + "/collections/Map", b0 + "/collections/MutableMap", b0 + "/collections/Map.Entry", b0 + "/collections/MutableMap.MutableEntry", b0 + "/collections/Iterator", b0 + "/collections/MutableIterator", b0 + "/collections/ListIterator", b0 + "/collections/MutableListIterator");
        f20403c = l2;
        E0 = b0.E0(l2);
        t = u.t(E0, 10);
        e2 = n0.e(t);
        b2 = f.b(e2, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
        for (IndexedValue indexedValue : E0) {
            linkedHashMap.put((String) indexedValue.d(), Integer.valueOf(indexedValue.c()));
        }
        f20404d = linkedHashMap;
    }

    public g(String[] strArr, Set<Integer> set, List<a.e.c> list) {
        l.f(strArr, "strings");
        l.f(set, "localNameIndices");
        l.f(list, "records");
        this.f20405e = strArr;
        this.f20406f = set;
        this.f20407g = list;
    }

    @Override // kotlin.reflect.x.internal.l0.e.z.c
    public String a(int i2) {
        return getString(i2);
    }

    @Override // kotlin.reflect.x.internal.l0.e.z.c
    public boolean b(int i2) {
        return this.f20406f.contains(Integer.valueOf(i2));
    }

    @Override // kotlin.reflect.x.internal.l0.e.z.c
    public String getString(int i2) {
        String str;
        a.e.c cVar = this.f20407g.get(i2);
        if (cVar.R()) {
            str = cVar.K();
        } else {
            if (cVar.P()) {
                List<String> list = f20403c;
                int size = list.size();
                int G = cVar.G();
                if (G >= 0 && G < size) {
                    str = list.get(cVar.G());
                }
            }
            str = this.f20405e[i2];
        }
        if (cVar.M() >= 2) {
            List<Integer> N = cVar.N();
            l.e(N, "substringIndexList");
            Integer num = N.get(0);
            Integer num2 = N.get(1);
            l.e(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                l.e(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    l.e(str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String str2 = str;
        if (cVar.I() >= 2) {
            List<Integer> J = cVar.J();
            l.e(J, "replaceCharList");
            Integer num3 = J.get(0);
            Integer num4 = J.get(1);
            l.e(str2, "string");
            str2 = kotlin.text.u.v(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String str3 = str2;
        a.e.c.EnumC0318c F = cVar.F();
        if (F == null) {
            F = a.e.c.EnumC0318c.NONE;
        }
        int i3 = b.a[F.ordinal()];
        if (i3 == 2) {
            l.e(str3, "string");
            str3 = kotlin.text.u.v(str3, '$', '.', false, 4, null);
        } else if (i3 == 3) {
            if (str3.length() >= 2) {
                l.e(str3, "string");
                str3 = str3.substring(1, str3.length() - 1);
                l.e(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String str4 = str3;
            l.e(str4, "string");
            str3 = kotlin.text.u.v(str4, '$', '.', false, 4, null);
        }
        l.e(str3, "string");
        return str3;
    }
}
