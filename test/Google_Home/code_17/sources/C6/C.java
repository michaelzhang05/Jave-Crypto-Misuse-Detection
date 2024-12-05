package C6;

import C6.C1049u;
import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y6.j;
import y6.k;

/* loaded from: classes5.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C1049u.a f1595a = new C1049u.a();

    /* renamed from: b, reason: collision with root package name */
    private static final C1049u.a f1596b = new C1049u.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y6.f f1597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B6.a f1598b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y6.f fVar, B6.a aVar) {
            super(0);
            this.f1597a = fVar;
            this.f1598b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return C.b(this.f1597a, this.f1598b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(y6.f fVar, B6.a aVar) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d8 = d(aVar, fVar);
        l(fVar, aVar);
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            List g8 = fVar.g(i8);
            ArrayList arrayList = new ArrayList();
            for (Object obj : g8) {
                if (obj instanceof B6.r) {
                    arrayList.add(obj);
                }
            }
            B6.r rVar = (B6.r) AbstractC1378t.M0(arrayList);
            if (rVar != null && (names = rVar.names()) != null) {
                for (String str2 : names) {
                    if (d8) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        AbstractC3255y.h(str2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, str2, i8);
                }
            }
            if (d8) {
                str = fVar.f(i8).toLowerCase(Locale.ROOT);
                AbstractC3255y.h(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                c(linkedHashMap, fVar, str, i8);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return P5.Q.h();
        }
        return linkedHashMap;
    }

    private static final void c(Map map, y6.f fVar, String str, int i8) {
        String str2;
        if (AbstractC3255y.d(fVar.getKind(), j.b.f41056a)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i8));
            return;
        }
        throw new A("The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i8) + " is already one of the names for " + str2 + ' ' + fVar.f(((Number) P5.Q.i(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(B6.a aVar, y6.f fVar) {
        if (aVar.d().f() && AbstractC3255y.d(fVar.getKind(), j.b.f41056a)) {
            return true;
        }
        return false;
    }

    public static final Map e(B6.a aVar, y6.f descriptor) {
        AbstractC3255y.i(aVar, "<this>");
        AbstractC3255y.i(descriptor, "descriptor");
        return (Map) B6.z.a(aVar).b(descriptor, f1595a, new a(descriptor, aVar));
    }

    public static final C1049u.a f() {
        return f1595a;
    }

    public static final String g(y6.f fVar, B6.a json, int i8) {
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(json, "json");
        l(fVar, json);
        return fVar.f(i8);
    }

    public static final int h(y6.f fVar, B6.a json, String name) {
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC3255y.h(lowerCase, "toLowerCase(...)");
            return k(fVar, json, lowerCase);
        }
        l(fVar, json);
        int d8 = fVar.d(name);
        if (d8 != -3) {
            return d8;
        }
        if (!json.d().m()) {
            return d8;
        }
        return k(fVar, json, name);
    }

    public static final int i(y6.f fVar, B6.a json, String name, String suffix) {
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(suffix, "suffix");
        int h8 = h(fVar, json, name);
        if (h8 != -3) {
            return h8;
        }
        throw new w6.h(fVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int j(y6.f fVar, B6.a aVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        return i(fVar, aVar, str, str2);
    }

    private static final int k(y6.f fVar, B6.a aVar, String str) {
        Integer num = (Integer) e(aVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final B6.s l(y6.f fVar, B6.a json) {
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(json, "json");
        if (AbstractC3255y.d(fVar.getKind(), k.a.f41057a)) {
            json.d().j();
            return null;
        }
        return null;
    }
}
