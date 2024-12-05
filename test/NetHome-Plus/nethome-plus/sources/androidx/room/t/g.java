package androidx.room.t;

import android.database.Cursor;
import android.os.Build;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo.java */
/* loaded from: classes.dex */
public class g {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, a> f1707b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<b> f1708c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<d> f1709d;

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class a {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1710b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1711c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1712d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1713e;

        /* renamed from: f, reason: collision with root package name */
        public final String f1714f;

        /* renamed from: g, reason: collision with root package name */
        private final int f1715g;

        public a(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.a = str;
            this.f1710b = str2;
            this.f1712d = z;
            this.f1713e = i2;
            this.f1711c = a(str2);
            this.f1714f = str3;
            this.f1715g = i3;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f1713e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f1713e != aVar.f1713e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (!this.a.equals(aVar.a) || this.f1712d != aVar.f1712d) {
                return false;
            }
            if (this.f1715g == 1 && aVar.f1715g == 2 && (str3 = this.f1714f) != null && !str3.equals(aVar.f1714f)) {
                return false;
            }
            if (this.f1715g == 2 && aVar.f1715g == 1 && (str2 = aVar.f1714f) != null && !str2.equals(this.f1714f)) {
                return false;
            }
            int i2 = this.f1715g;
            return (i2 == 0 || i2 != aVar.f1715g || ((str = this.f1714f) == null ? aVar.f1714f == null : str.equals(aVar.f1714f))) && this.f1711c == aVar.f1711c;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.f1711c) * 31) + (this.f1712d ? 1231 : 1237)) * 31) + this.f1713e;
        }

        public String toString() {
            return "Column{name='" + this.a + "', type='" + this.f1710b + "', affinity='" + this.f1711c + "', notNull=" + this.f1712d + ", primaryKeyPosition=" + this.f1713e + ", defaultValue='" + this.f1714f + "'}";
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class b {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1716b;

        /* renamed from: c, reason: collision with root package name */
        public final String f1717c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f1718d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f1719e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.f1716b = str2;
            this.f1717c = str3;
            this.f1718d = Collections.unmodifiableList(list);
            this.f1719e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.f1716b.equals(bVar.f1716b) && this.f1717c.equals(bVar.f1717c) && this.f1718d.equals(bVar.f1718d)) {
                return this.f1719e.equals(bVar.f1719e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.f1716b.hashCode()) * 31) + this.f1717c.hashCode()) * 31) + this.f1718d.hashCode()) * 31) + this.f1719e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.f1716b + "', onUpdate='" + this.f1717c + "', columnNames=" + this.f1718d + ", referenceColumnNames=" + this.f1719e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: f, reason: collision with root package name */
        final int f1720f;

        /* renamed from: g, reason: collision with root package name */
        final int f1721g;

        /* renamed from: h, reason: collision with root package name */
        final String f1722h;

        /* renamed from: i, reason: collision with root package name */
        final String f1723i;

        c(int i2, int i3, String str, String str2) {
            this.f1720f = i2;
            this.f1721g = i3;
            this.f1722h = str;
            this.f1723i = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i2 = this.f1720f - cVar.f1720f;
            return i2 == 0 ? this.f1721g - cVar.f1721g : i2;
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class d {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1724b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f1725c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.f1724b = z;
            this.f1725c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f1724b != dVar.f1724b || !this.f1725c.equals(dVar.f1725c)) {
                return false;
            }
            if (this.a.startsWith("index_")) {
                return dVar.a.startsWith("index_");
            }
            return this.a.equals(dVar.a);
        }

        public int hashCode() {
            return ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.f1724b ? 1 : 0)) * 31) + this.f1725c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + "', unique=" + this.f1724b + ", columns=" + this.f1725c + '}';
        }
    }

    public g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.f1707b = Collections.unmodifiableMap(map);
        this.f1708c = Collections.unmodifiableSet(set);
        this.f1709d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static g a(c.q.a.b bVar, String str) {
        return new g(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(c.q.a.b bVar, String str) {
        Cursor O = bVar.O("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (O.getColumnCount() > 0) {
                int columnIndex = O.getColumnIndex("name");
                int columnIndex2 = O.getColumnIndex("type");
                int columnIndex3 = O.getColumnIndex("notnull");
                int columnIndex4 = O.getColumnIndex("pk");
                int columnIndex5 = O.getColumnIndex("dflt_value");
                while (O.moveToNext()) {
                    String string = O.getString(columnIndex);
                    hashMap.put(string, new a(string, O.getString(columnIndex2), O.getInt(columnIndex3) != 0, O.getInt(columnIndex4), O.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            O.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(DeepLinkIntentReceiver.DeepLinksKeys.ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(c.q.a.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor O = bVar.O("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = O.getColumnIndex(DeepLinkIntentReceiver.DeepLinksKeys.ID);
            int columnIndex2 = O.getColumnIndex("seq");
            int columnIndex3 = O.getColumnIndex("table");
            int columnIndex4 = O.getColumnIndex("on_delete");
            int columnIndex5 = O.getColumnIndex("on_update");
            List<c> c2 = c(O);
            int count = O.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                O.moveToPosition(i2);
                if (O.getInt(columnIndex2) == 0) {
                    int i3 = O.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c2) {
                        if (cVar.f1720f == i3) {
                            arrayList.add(cVar.f1722h);
                            arrayList2.add(cVar.f1723i);
                        }
                    }
                    hashSet.add(new b(O.getString(columnIndex3), O.getString(columnIndex4), O.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            O.close();
        }
    }

    private static d e(c.q.a.b bVar, String str, boolean z) {
        Cursor O = bVar.O("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = O.getColumnIndex("seqno");
            int columnIndex2 = O.getColumnIndex("cid");
            int columnIndex3 = O.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (O.moveToNext()) {
                    if (O.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(O.getInt(columnIndex)), O.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            O.close();
        }
    }

    private static Set<d> f(c.q.a.b bVar, String str) {
        Cursor O = bVar.O("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = O.getColumnIndex("name");
            int columnIndex2 = O.getColumnIndex("origin");
            int columnIndex3 = O.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (O.moveToNext()) {
                    if ("c".equals(O.getString(columnIndex2))) {
                        String string = O.getString(columnIndex);
                        boolean z = true;
                        if (O.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d e2 = e(bVar, string, z);
                        if (e2 == null) {
                            return null;
                        }
                        hashSet.add(e2);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            O.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.a;
        if (str == null ? gVar.a != null : !str.equals(gVar.a)) {
            return false;
        }
        Map<String, a> map = this.f1707b;
        if (map == null ? gVar.f1707b != null : !map.equals(gVar.f1707b)) {
            return false;
        }
        Set<b> set2 = this.f1708c;
        if (set2 == null ? gVar.f1708c != null : !set2.equals(gVar.f1708c)) {
            return false;
        }
        Set<d> set3 = this.f1709d;
        if (set3 == null || (set = gVar.f1709d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f1707b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f1708c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.f1707b + ", foreignKeys=" + this.f1708c + ", indices=" + this.f1709d + '}';
    }
}
