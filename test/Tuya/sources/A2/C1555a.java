package a2;

import Z1.j;
import Z1.k;
import b2.AbstractC1855a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1555a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f13493b;

    /* renamed from: a, reason: collision with root package name */
    private final Map f13494a;

    /* renamed from: a2.a$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map f13495a = new LinkedHashMap();

        public b a(String str) {
            if (str == null) {
                this.f13495a.put("aud", null);
            } else {
                this.f13495a.put("aud", Collections.singletonList(str));
            }
            return this;
        }

        public b b(List list) {
            this.f13495a.put("aud", list);
            return this;
        }

        public C1555a c() {
            return new C1555a(this.f13495a);
        }

        public b d(String str, Object obj) {
            this.f13495a.put(str, obj);
            return this;
        }

        public b e(Date date) {
            this.f13495a.put("exp", date);
            return this;
        }

        public b f(Date date) {
            this.f13495a.put("iat", date);
            return this;
        }

        public b g(String str) {
            this.f13495a.put("iss", str);
            return this;
        }

        public b h(String str) {
            this.f13495a.put("jti", str);
            return this;
        }

        public b i(Date date) {
            this.f13495a.put("nbf", date);
            return this;
        }

        public b j(String str) {
            this.f13495a.put("sub", str);
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        f13493b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public static C1555a e(String str) {
        return f(k.m(str));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0031. Please report as an issue. */
    public static C1555a f(Map map) {
        b bVar = new b();
        for (String str : map.keySet()) {
            str.hashCode();
            char c8 = 65535;
            switch (str.hashCode()) {
                case 96944:
                    if (str.equals("aud")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 100893:
                    if (str.equals("exp")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 104028:
                    if (str.equals("iat")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 104585:
                    if (str.equals("iss")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 105567:
                    if (str.equals("jti")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 108850:
                    if (str.equals("nbf")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 114240:
                    if (str.equals("sub")) {
                        c8 = 6;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    Object obj = map.get("aud");
                    if (obj instanceof String) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(k.h(map, "aud"));
                        bVar.b(arrayList);
                        break;
                    } else if (obj instanceof List) {
                        bVar.b(k.j(map, "aud"));
                        break;
                    } else if (obj == null) {
                        bVar.a(null);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    bVar.e(new Date(k.g(map, "exp") * 1000));
                    break;
                case 2:
                    bVar.f(new Date(k.g(map, "iat") * 1000));
                    break;
                case 3:
                    bVar.g(k.h(map, "iss"));
                    break;
                case 4:
                    bVar.h(k.h(map, "jti"));
                    break;
                case 5:
                    bVar.i(new Date(k.g(map, "nbf") * 1000));
                    break;
                case 6:
                    bVar.j(k.h(map, "sub"));
                    break;
                default:
                    bVar.d(str, map.get(str));
                    break;
            }
        }
        return bVar.c();
    }

    public List a() {
        Object b8 = b("aud");
        if (b8 instanceof String) {
            return Collections.singletonList((String) b8);
        }
        try {
            List d8 = d("aud");
            if (d8 == null) {
                return Collections.emptyList();
            }
            return d8;
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    public Object b(String str) {
        return this.f13494a.get(str);
    }

    public String[] c(String str) {
        if (b(str) == null) {
            return null;
        }
        try {
            List list = (List) b(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i8 = 0; i8 < size; i8++) {
                try {
                    strArr[i8] = (String) list.get(i8);
                } catch (ClassCastException unused) {
                    throw new ParseException("The " + str + " claim is not a list / JSON array of strings", 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException("The " + str + " claim is not a list / JSON array", 0);
        }
    }

    public List d(String str) {
        String[] c8 = c(str);
        if (c8 == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(Arrays.asList(c8));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555a)) {
            return false;
        }
        return Objects.equals(this.f13494a, ((C1555a) obj).f13494a);
    }

    public Map g() {
        return h(false);
    }

    public Map h(boolean z8) {
        Map l8 = k.l();
        for (Map.Entry entry : this.f13494a.entrySet()) {
            if (entry.getValue() instanceof Date) {
                l8.put(entry.getKey(), Long.valueOf(AbstractC1855a.a((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List a8 = a();
                if (a8 != null && !a8.isEmpty()) {
                    if (a8.size() == 1) {
                        l8.put("aud", a8.get(0));
                    } else {
                        List a9 = j.a();
                        a9.addAll(a8);
                        l8.put("aud", a9);
                    }
                } else if (z8) {
                    l8.put("aud", null);
                }
            } else if (entry.getValue() != null) {
                l8.put(entry.getKey(), entry.getValue());
            } else if (z8) {
                l8.put(entry.getKey(), null);
            }
        }
        return l8;
    }

    public int hashCode() {
        return Objects.hash(this.f13494a);
    }

    public String toString() {
        return k.o(g());
    }

    private C1555a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13494a = linkedHashMap;
        linkedHashMap.putAll(map);
    }
}
