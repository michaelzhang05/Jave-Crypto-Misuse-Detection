package x2;

import M5.AbstractC1246t;
import g6.C2728d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f39247a = new v();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f39248a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39249b;

        public a(String key, String value) {
            AbstractC3159y.i(key, "key");
            AbstractC3159y.i(value, "value");
            this.f39248a = key;
            this.f39249b = value;
        }

        private final String a(String str) {
            String encode = URLEncoder.encode(str, C2728d.f31293b.name());
            AbstractC3159y.h(encode, "encode(...)");
            return encode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f39248a, aVar.f39248a) && AbstractC3159y.d(this.f39249b, aVar.f39249b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f39248a.hashCode() * 31) + this.f39249b.hashCode();
        }

        public String toString() {
            return a(this.f39248a) + "=" + a(this.f39249b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39250a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(a it) {
            AbstractC3159y.i(it, "it");
            return it.toString();
        }
    }

    private v() {
    }

    private final List d(Map map) {
        return g(this, map, null, 2, null);
    }

    private final List e(List list, String str) {
        ArrayList arrayList;
        if (list.isEmpty()) {
            return AbstractC1246t.e(new a(str, ""));
        }
        if (j(list)) {
            String str2 = str + "[]";
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC1246t.D(arrayList, f39247a.h(it.next(), str2));
            }
        } else {
            arrayList = new ArrayList();
            int i8 = 0;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1246t.w();
                }
                AbstractC1246t.D(arrayList, f39247a.h(obj, str + "[" + i8 + "]"));
                i8 = i9;
            }
        }
        return arrayList;
    }

    private final List f(Map map, String str) {
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (str != null) {
                    String str3 = str + "[" + str2 + "]";
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
                AbstractC1246t.D(arrayList, f39247a.h(value, str2));
            }
            return arrayList;
        }
        return AbstractC1246t.m();
    }

    static /* synthetic */ List g(v vVar, Map map, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        return vVar.f(map, str);
    }

    private final List h(Object obj, String str) {
        if (obj instanceof Map) {
            return f((Map) obj, str);
        }
        if (obj instanceof List) {
            return e((List) obj, str);
        }
        if (obj == null) {
            return AbstractC1246t.e(new a(str, ""));
        }
        return AbstractC1246t.e(new a(str, obj.toString()));
    }

    private final boolean i(Object obj) {
        if (!(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            return false;
        }
        return true;
    }

    private final boolean j(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!f39247a.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Map a(Map params) {
        AbstractC3159y.i(params, "params");
        HashMap hashMap = new HashMap(params);
        Iterator it = new HashSet(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = hashMap.get(str);
            if (obj instanceof Map) {
                AbstractC3159y.f(str);
                hashMap.put(str, a((Map) obj));
            } else if (obj == null) {
                hashMap.remove(str);
            }
        }
        return hashMap;
    }

    public final String b(Map map) {
        return AbstractC1246t.w0(d(map), "&", null, null, 0, null, b.f39250a, 30, null);
    }

    public final String c(Map map) {
        v vVar;
        Map a8;
        String b8;
        if (map == null || (a8 = (vVar = f39247a).a(map)) == null || (b8 = vVar.b(a8)) == null) {
            return "";
        }
        return b8;
    }
}
