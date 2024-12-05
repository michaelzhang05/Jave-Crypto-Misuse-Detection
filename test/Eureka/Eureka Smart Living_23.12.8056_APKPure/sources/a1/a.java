package a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: a1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0004a implements a {

        /* renamed from: a, reason: collision with root package name */
        private final List f30a;

        C0004a(List list) {
            this.f30a = list;
        }

        static C0004a b(String... strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add(d.b(str));
            }
            return new C0004a(arrayList);
        }

        @Override // a1.a
        public boolean a(String str) {
            Iterator it = this.f30a.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).a(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements a {
        @Override // a1.a
        public boolean a(String str) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private static a f31a = new b();

        public static a a(String str) {
            return str == null ? f31a : d.b(str);
        }

        public static a b(String[] strArr) {
            return strArr == null ? f31a : C0004a.b(strArr);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements a {

        /* renamed from: a, reason: collision with root package name */
        private final List f32a;

        private d(List list) {
            if (list == null) {
                throw new IllegalArgumentException("Mask parts can not be null");
            }
            this.f32a = list;
        }

        static d b(String str) {
            return new d(e.b(str));
        }

        @Override // a1.a
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            List b6 = e.b(str);
            int size = b6.size();
            int size2 = this.f32a.size();
            if (size2 > 1 && size != size2) {
                return false;
            }
            int min = Math.min(size, size2);
            for (int i6 = 0; i6 < min; i6++) {
                if (!e.a((String) this.f32a.get(i6), (String) b6.get(i6))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        static boolean a(String str, String str2) {
            if (str == null) {
                return false;
            }
            if ("*".equals(str)) {
                return true;
            }
            if (str2 == null) {
                return false;
            }
            return str.toUpperCase().equals(str2.toUpperCase());
        }

        static List b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Can not split null argument");
            }
            List asList = Arrays.asList(str.split("\\."));
            Collections.reverse(asList);
            return asList;
        }
    }

    boolean a(String str);
}
