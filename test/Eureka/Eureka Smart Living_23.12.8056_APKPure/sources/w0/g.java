package w0;

import com.getcapacitor.g0;
import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f9719a;

        /* renamed from: b, reason: collision with root package name */
        List f9720b;

        /* renamed from: c, reason: collision with root package name */
        List f9721c;

        /* renamed from: d, reason: collision with root package name */
        String f9722d;

        public a(List list, String str, List list2, String str2) {
            this.f9719a = str;
            this.f9720b = list;
            this.f9721c = list2;
            this.f9722d = str2;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        String f9723a;

        /* renamed from: b, reason: collision with root package name */
        List f9724b;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f9725a;

        /* renamed from: b, reason: collision with root package name */
        private String f9726b;

        public c() {
            this.f9725a = "";
            this.f9726b = "";
        }

        public String a() {
            return this.f9725a;
        }

        public String b() {
            return this.f9726b;
        }

        public c(String str, String str2) {
            this.f9725a = str;
            this.f9726b = str2;
        }
    }

    public static List a(g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < g0Var.length(); i6++) {
            j0 j0Var = (j0) g0Var.get(i6);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = j0Var.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, j0Var.get(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static boolean b(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        int i6 = 0;
        while (true) {
            boolean z5 = true;
            if (i6 >= length) {
                return true;
            }
            String str = strArr[i6];
            int length2 = strArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    z5 = false;
                    break;
                }
                if (str.equals(strArr2[i7])) {
                    break;
                }
                i7++;
            }
            if (!z5) {
                return false;
            }
            i6++;
        }
    }

    public static void c(w0.c cVar, String str, String str2, String str3, List list, ArrayList arrayList) {
        try {
            if (cVar.F("UPDATE " + str + " SET " + str3 + " " + str2, g(arrayList, str2, list), Boolean.FALSE, "no").getLong("lastId") != -1) {
                return;
            }
            throw new Exception("UPDATE sql_deleted failed for table: " + str);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage() != null ? e6.getMessage() : "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:3:0x0002, B:7:0x0012, B:10:0x0019, B:11:0x001d, B:13:0x0023, B:20:0x0035, B:23:0x003c, B:25:0x004a, B:28:0x0055, B:30:0x006b, B:32:0x0098, B:35:0x00a8, B:37:0x00ae, B:45:0x00d5, B:46:0x00da, B:47:0x00df, B:48:0x00bd, B:51:0x00c7, B:54:0x00e3, B:57:0x00ed, B:60:0x00f7, B:69:0x010a, B:70:0x0111, B:75:0x0112, B:76:0x0119), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(w0.c r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19, java.util.ArrayList r20) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.g.d(w0.c, java.lang.String, java.lang.String, java.lang.String[], java.util.ArrayList):boolean");
    }

    public static b e(w0.c cVar, String str) {
        try {
            g0 I = cVar.I("SELECT sql FROM sqlite_master WHERE sql LIKE('%FOREIGN KEY%') AND sql LIKE('%REFERENCES%') AND sql LIKE('%" + str + "%') AND sql LIKE('%ON DELETE%');", new ArrayList());
            b bVar = new b();
            List arrayList = new ArrayList();
            String str2 = "";
            if (I.length() > 0) {
                Map f6 = f(I.getJSONObject(0).getString("sql"));
                arrayList = (List) f6.get("foreignKeys");
                str2 = (String) f6.get("tableName");
            }
            bVar.f9723a = str2;
            bVar.f9724b = arrayList;
            return bVar;
        } catch (Exception e6) {
            throw new Exception("getReferences: " + (e6.getMessage() != null ? e6.getMessage() : e6.toString()));
        }
    }

    public static Map f(String str) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String g6 = n.g(str);
        try {
            Matcher matcher = Pattern.compile("CREATE\\s+TABLE\\s+(\\w+)\\s+\\(").matcher(g6);
            String group = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = Pattern.compile("FOREIGN\\s+KEY\\s+\\([^)]+\\)\\s+REFERENCES\\s+(\\w+)\\s*\\([^)]+\\)\\s+ON\\s+DELETE\\s+(CASCADE|RESTRICT|SET\\s+DEFAULT|SET\\s+NULL|NO\\s+ACTION)").matcher(g6);
            while (matcher2.find()) {
                arrayList.add(matcher2.group(0));
            }
            hashMap.put("tableName", group);
            hashMap.put("foreignKeys", arrayList);
            return hashMap;
        } catch (Exception e6) {
            throw new Exception("getRefs: Error creating regular expression: " + e6.toString());
        }
    }

    public static ArrayList g(ArrayList arrayList, String str, List list) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0) {
            String[] split = str.split("\\?");
            if (split[split.length - 1].equals(";")) {
                split[split.length - 1] = "";
            }
            for (int i6 = 0; i6 < split.length; i6++) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!n.i(split[i6], (String) it.next(), 0).isEmpty()) {
                        arrayList2.add(arrayList.get(i6));
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Map h(w0.c cVar, String str, String str2, String str3, String[] strArr, String[] strArr2, ArrayList arrayList) {
        String str4;
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String[] strArr3 = new String[length];
        String[] strArr4 = new String[strArr2.length];
        for (int i6 = 0; i6 < strArr.length; i6++) {
            strArr3[i6] = "t1." + strArr[i6];
            strArr4[i6] = "t2." + strArr2[i6];
        }
        try {
            String a6 = n.a(str3, strArr2, strArr, "t2.");
            if (a6.endsWith(";")) {
                a6 = a6.substring(0, a6.length() - 1);
            }
            StringBuilder sb = new StringBuilder();
            for (int i7 = 0; i7 < length; i7++) {
                sb.append(strArr3[i7]);
                sb.append(" = ");
                sb.append(strArr4[i7]);
                if (i7 < length - 1) {
                    sb.append(" AND ");
                }
            }
            g0 I = cVar.I("SELECT t1.rowid FROM " + str + " t1 JOIN " + str2 + " t2 ON " + sb.toString() + " WHERE " + a6 + " AND t1.sql_deleted = 0;", arrayList);
            if (I.length() > 0) {
                List a7 = a(I);
                str4 = (String) ((Map) a7.get(0)).keySet().iterator().next();
                arrayList2.addAll(a7);
            } else {
                str4 = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("key", str4);
            hashMap.put("relatedItems", arrayList2);
            return hashMap;
        } catch (Exception e6) {
            throw new Exception(e6.getMessage() != null ? e6.getMessage() : e6.toString());
        }
    }

    public static c i(Map map) {
        try {
            String str = (String) map.get("key");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get("relatedItems")).iterator();
            while (it.hasNext()) {
                Object obj = ((Map) it.next()).get(str);
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            String str2 = "sql_deleted = 1";
            StringBuilder sb = new StringBuilder("WHERE " + str + " IN (");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(",");
            }
            if (sb.toString().endsWith(",")) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(");");
            return new c(str2, sb.toString());
        } catch (Exception e6) {
            throw new Exception(e6.getMessage() != null ? e6.getMessage() : "");
        }
    }

    public static c j(List list, Map map) {
        try {
            String str = (String) map.get("key");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get("relatedItems")).iterator();
            while (it.hasNext()) {
                Object obj = ((Map) it.next()).get(str);
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = list.iterator();
            String str2 = "";
            while (it2.hasNext()) {
                str2 = str2 + ((String) it2.next()) + " = NULL, ";
            }
            String str3 = str2 + "sql_deleted = 0";
            StringBuilder sb = new StringBuilder("WHERE " + str + " IN (");
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next());
                sb.append(",");
            }
            if (sb.toString().endsWith(",")) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(");");
            return new c(str3, sb.toString());
        } catch (Exception e6) {
            throw new Exception(e6.getMessage() != null ? e6.getMessage() : "");
        }
    }

    public static c k(Map map) {
        try {
            if (((List) map.get("relatedItems")).size() <= 0) {
                return new c();
            }
            throw new Exception("Restrict mode related items exist, please delete them first");
        } catch (Exception e6) {
            throw new Exception(e6.getMessage() != null ? e6.getMessage() : "");
        }
    }
}
