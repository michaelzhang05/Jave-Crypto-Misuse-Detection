package z6;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v6.j;
import v6.k;
import y6.AbstractC3999a;
import z6.C4060u;

/* renamed from: z6.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4032C {

    /* renamed from: a, reason: collision with root package name */
    private static final C4060u.a f40477a = new C4060u.a();

    /* renamed from: b, reason: collision with root package name */
    private static final C4060u.a f40478b = new C4060u.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.C$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6.f f40479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3999a f40480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v6.f fVar, AbstractC3999a abstractC3999a) {
            super(0);
            this.f40479a = fVar;
            this.f40480b = abstractC3999a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return AbstractC4032C.b(this.f40479a, this.f40480b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(v6.f fVar, AbstractC3999a abstractC3999a) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d8 = d(abstractC3999a, fVar);
        l(fVar, abstractC3999a);
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            List g8 = fVar.g(i8);
            ArrayList arrayList = new ArrayList();
            for (Object obj : g8) {
                if (obj instanceof y6.r) {
                    arrayList.add(obj);
                }
            }
            y6.r rVar = (y6.r) AbstractC1246t.M0(arrayList);
            if (rVar != null && (names = rVar.names()) != null) {
                for (String str2 : names) {
                    if (d8) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        AbstractC3159y.h(str2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, str2, i8);
                }
            }
            if (d8) {
                str = fVar.f(i8).toLowerCase(Locale.ROOT);
                AbstractC3159y.h(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                c(linkedHashMap, fVar, str, i8);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return M5.Q.h();
        }
        return linkedHashMap;
    }

    private static final void c(Map map, v6.f fVar, String str, int i8) {
        String str2;
        if (AbstractC3159y.d(fVar.getKind(), j.b.f38925a)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i8));
            return;
        }
        throw new C4030A("The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i8) + " is already one of the names for " + str2 + ' ' + fVar.f(((Number) M5.Q.i(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(AbstractC3999a abstractC3999a, v6.f fVar) {
        if (abstractC3999a.d().f() && AbstractC3159y.d(fVar.getKind(), j.b.f38925a)) {
            return true;
        }
        return false;
    }

    public static final Map e(AbstractC3999a abstractC3999a, v6.f descriptor) {
        AbstractC3159y.i(abstractC3999a, "<this>");
        AbstractC3159y.i(descriptor, "descriptor");
        return (Map) y6.z.a(abstractC3999a).b(descriptor, f40477a, new a(descriptor, abstractC3999a));
    }

    public static final C4060u.a f() {
        return f40477a;
    }

    public static final String g(v6.f fVar, AbstractC3999a json, int i8) {
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(json, "json");
        l(fVar, json);
        return fVar.f(i8);
    }

    public static final int h(v6.f fVar, AbstractC3999a json, String name) {
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC3159y.h(lowerCase, "toLowerCase(...)");
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

    public static final int i(v6.f fVar, AbstractC3999a json, String name, String suffix) {
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(suffix, "suffix");
        int h8 = h(fVar, json, name);
        if (h8 != -3) {
            return h8;
        }
        throw new t6.h(fVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int j(v6.f fVar, AbstractC3999a abstractC3999a, String str, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        return i(fVar, abstractC3999a, str, str2);
    }

    private static final int k(v6.f fVar, AbstractC3999a abstractC3999a, String str) {
        Integer num = (Integer) e(abstractC3999a, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final y6.s l(v6.f fVar, AbstractC3999a json) {
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(json, "json");
        if (AbstractC3159y.d(fVar.getKind(), k.a.f38926a)) {
            json.d().j();
            return null;
        }
        return null;
    }
}
