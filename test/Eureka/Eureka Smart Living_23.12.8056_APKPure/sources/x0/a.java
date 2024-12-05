package x0;

import com.getcapacitor.g0;
import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9780c = g.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private final o f9781a = new o();

    /* renamed from: b, reason: collision with root package name */
    private final w0.i f9782b = new w0.i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0147a extends HashMap {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9783a;

        C0147a(String str) {
            this.f9783a = str;
            put("progress", str);
        }
    }

    private ArrayList c(w0.c cVar, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List a6 = cVar.I((("SELECT name,tbl_name,sql FROM sqlite_master WHERE ") + "type = 'index' AND tbl_name = '" + str) + "' AND sql NOTNULL;", new ArrayList()).a();
            if (a6.size() > 0) {
                for (int i6 = 0; i6 < a6.size(); i6++) {
                    i iVar = new i();
                    if (!Objects.equals(((j0) a6.get(i6)).getString("tbl_name"), str)) {
                        throw new Exception("GetIndexes: table name doesn't match");
                    }
                    iVar.h(((j0) a6.get(i6)).getString("name"));
                    String string = ((j0) a6.get(i6)).getString("sql");
                    if (string != null && string.contains("UNIQUE")) {
                        iVar.g("UNIQUE");
                    }
                    if (string == null) {
                        throw new Exception("GetIndexes: sql statement is null");
                    }
                    iVar.i(string.substring(string.lastIndexOf("(") + 1, string.lastIndexOf(")")));
                    arrayList.add(iVar);
                }
            }
            return arrayList;
        } catch (JSONException e6) {
            throw new Exception("GetIndexes: " + e6.getMessage());
        }
    }

    private List d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 != -1) {
            i6 = str.indexOf(str2, i6);
            if (i6 != -1) {
                arrayList.add(Integer.valueOf(i6));
                i6++;
            }
        }
        return arrayList;
    }

    private j0 f(w0.c cVar, g0 g0Var) {
        j0 j0Var = new j0();
        try {
            Long h6 = h(cVar);
            if (h6.longValue() == -1) {
                throw new Exception("GetPartialModeData: did not find a sync_date");
            }
            j0 j6 = j(cVar, g0Var, h6);
            j0Var.put("syncDate", h6);
            j0Var.put("modTables", j6);
            return j0Var;
        } catch (Exception e6) {
            throw new Exception("GetPartialModeData: " + e6.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8 A[Catch: JSONException -> 0x0136, TryCatch #0 {JSONException -> 0x0136, blocks: (B:3:0x0021, B:5:0x002e, B:20:0x008e, B:23:0x011f, B:25:0x009b, B:26:0x00b5, B:27:0x00f8, B:28:0x0064, B:31:0x006e, B:34:0x0078), top: B:2:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList g(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.g(java.lang.String):java.util.ArrayList");
    }

    private ArrayList i(w0.c cVar, g0 g0Var) {
        String str;
        String str2 = "sql";
        String str3 = "name";
        ArrayList arrayList = new ArrayList();
        try {
            List a6 = g0Var.a();
            int i6 = 0;
            while (i6 < a6.size()) {
                if (!((j0) a6.get(i6)).has(str3)) {
                    throw new Exception("GetTablesFull: no name");
                }
                String string = ((j0) a6.get(i6)).getString(str3);
                if (string == null) {
                    throw new Exception("GetTablesFull: no name");
                }
                if (!((j0) a6.get(i6)).has(str2)) {
                    throw new Exception("GetTablesFull: no sql");
                }
                String string2 = ((j0) a6.get(i6)).getString(str2);
                k kVar = new k();
                ArrayList g6 = g(string2);
                if (g6.size() == 0) {
                    throw new Exception("GetTablesFull: no Schema returned");
                }
                this.f9781a.b(g6);
                ArrayList c6 = c(cVar, string);
                if (c6.size() > 0) {
                    this.f9781a.a(c6);
                }
                ArrayList l6 = l(cVar, string);
                if (l6.size() > 0) {
                    str = str2;
                    this.f9781a.c(l6);
                } else {
                    str = str2;
                }
                StringBuilder sb = new StringBuilder();
                String str4 = str3;
                sb.append("SELECT * FROM ");
                sb.append(string);
                sb.append(";");
                ArrayList i7 = this.f9781a.i(cVar, sb.toString(), string);
                kVar.j(string);
                if (g6.size() == 0) {
                    throw new Exception("GetTablesFull: must contain schema");
                }
                kVar.k(g6);
                if (c6.size() != 0) {
                    kVar.i(c6);
                }
                if (l6.size() != 0) {
                    kVar.l(l6);
                }
                String concat = "Full: Table ".concat(string).concat(" schema export completed");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(concat);
                sb2.append(" ");
                i6++;
                sb2.append(i6);
                sb2.append("/");
                sb2.append(a6.size());
                sb2.append(" ...");
                n(sb2.toString());
                if (i7.size() != 0) {
                    kVar.m(i7);
                }
                if (kVar.b().size() <= 1) {
                    throw new Exception("GetTablesFull: table " + string + " is not a jsonTable");
                }
                arrayList.add(kVar);
                n("Full: Table ".concat(string).concat(" data export completed") + " " + i6 + "/" + a6.size() + " ...");
                str2 = str;
                str3 = str4;
            }
            n("Full: Table's export completed");
            return arrayList;
        } catch (Exception e6) {
            n("Full: Table's export failed");
            throw new Exception("GetTablesFull: " + e6.getMessage());
        }
    }

    private j0 j(w0.c cVar, g0 g0Var, Long l6) {
        j0 j0Var = new j0();
        try {
            List a6 = g0Var.a();
            for (int i6 = 0; i6 < a6.size(); i6++) {
                if (!((j0) a6.get(i6)).has("name")) {
                    throw new Exception("GetTablesModified: no name");
                }
                String string = ((j0) a6.get(i6)).getString("name");
                List a7 = cVar.I("SELECT count(*) AS count FROM " + string + ";", new ArrayList()).a();
                if (a7.size() != 1) {
                    break;
                }
                long j6 = ((j0) a7.get(0)).getLong("count");
                List a8 = cVar.I("SELECT count(*) AS count FROM " + string + " WHERE last_modified >= " + l6 + ";", new ArrayList()).a();
                if (a8.size() != 1) {
                    break;
                }
                long j7 = ((j0) a8.get(0)).getLong("count");
                j0Var.m(string, j7 == 0 ? "No" : j6 == j7 ? "Create" : "Modified");
            }
            return j0Var;
        } catch (Exception e6) {
            throw new Exception("GetTablesModified: " + e6.getMessage());
        }
    }

    private ArrayList k(w0.c cVar, g0 g0Var) {
        String str;
        String str2;
        String str3;
        j0 j0Var;
        ArrayList arrayList;
        String str4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        StringBuilder sb;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str5 = " ...";
        String str6 = "Create";
        String str7 = "sql";
        String str8 = "name";
        ArrayList arrayList8 = new ArrayList();
        try {
            j0 f6 = f(cVar, g0Var);
            if (!f6.has("syncDate")) {
                throw new Exception("GetTablesPartial: no syncDate");
            }
            long j6 = f6.getLong("syncDate");
            if (!f6.has("modTables")) {
                throw new Exception("GetTablesPartial: no modTables");
            }
            j0 f7 = f6.f("modTables");
            if (f7 == null) {
                throw new Exception("GetTablesPartial: no modTables");
            }
            ArrayList g6 = this.f9781a.g(f7);
            List a6 = g0Var.a();
            int i6 = 0;
            ArrayList arrayList9 = arrayList8;
            while (i6 < a6.size()) {
                String str9 = str5;
                if (!((j0) a6.get(i6)).has(str8)) {
                    throw new Exception("GetTablesPartial: no name");
                }
                String string = ((j0) a6.get(i6)).getString(str8);
                if (string == null) {
                    throw new Exception("GetTablesPartial: no name");
                }
                if (!((j0) a6.get(i6)).has(str7)) {
                    throw new Exception("GetTablesPartial: no sql");
                }
                String string2 = ((j0) a6.get(i6)).getString(str7);
                if (g6.size() == 0 || !g6.contains(string)) {
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                } else {
                    str2 = str7;
                    str3 = str8;
                    if (Objects.equals(f7.getString(string), "No")) {
                        str = str6;
                    } else {
                        k kVar = new k();
                        kVar.j(string);
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        if (Objects.equals(f7.getString(string), str6)) {
                            ArrayList g7 = g(string2);
                            if (g7.size() > 0) {
                                this.f9781a.b(g7);
                            }
                            ArrayList c6 = c(cVar, string);
                            if (c6.size() > 0) {
                                arrayList6 = g7;
                                this.f9781a.a(c6);
                            } else {
                                arrayList6 = g7;
                            }
                            ArrayList l6 = l(cVar, string);
                            if (l6.size() > 0) {
                                arrayList7 = c6;
                                this.f9781a.c(l6);
                            } else {
                                arrayList7 = c6;
                            }
                            arrayList4 = arrayList7;
                            arrayList = g6;
                            arrayList3 = arrayList6;
                            arrayList5 = l6;
                        } else {
                            arrayList3 = arrayList10;
                            arrayList4 = arrayList11;
                            arrayList5 = arrayList12;
                            arrayList = g6;
                        }
                        str = str6;
                        j0Var = f7;
                        if (Objects.equals(f7.getString(string), str6)) {
                            sb = new StringBuilder();
                            sb.append("SELECT * FROM ");
                            sb.append(string);
                            sb.append(";");
                        } else {
                            sb = new StringBuilder();
                            sb.append("SELECT * FROM ");
                            sb.append(string);
                            sb.append(" WHERE last_modified >= ");
                            sb.append(j6);
                            sb.append(";");
                        }
                        ArrayList i7 = this.f9781a.i(cVar, sb.toString(), string);
                        kVar.j(string);
                        if (arrayList3.size() != 0) {
                            kVar.k(arrayList3);
                        }
                        if (arrayList4.size() != 0) {
                            kVar.i(arrayList4);
                        }
                        if (arrayList5.size() != 0) {
                            kVar.l(arrayList5);
                        }
                        String concat = "Partial: Table ".concat(string).concat(" schema export completed");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(concat);
                        sb2.append(" ");
                        int i8 = i6 + 1;
                        sb2.append(i8);
                        sb2.append("/");
                        sb2.append(a6.size());
                        str4 = str9;
                        sb2.append(str4);
                        n(sb2.toString());
                        if (i7.size() != 0) {
                            kVar.m(i7);
                        }
                        if (kVar.b().size() <= 1) {
                            throw new Exception("GetTablesPartial: table " + string + " is not a jsonTable");
                        }
                        arrayList2 = arrayList9;
                        arrayList2.add(kVar);
                        n("Partial: Table ".concat(string).concat(" data export completed") + " " + i8 + "/" + a6.size() + str4);
                        i6++;
                        arrayList9 = arrayList2;
                        str5 = str4;
                        str7 = str2;
                        str8 = str3;
                        g6 = arrayList;
                        str6 = str;
                        f7 = j0Var;
                    }
                }
                j0Var = f7;
                arrayList = g6;
                arrayList2 = arrayList9;
                str4 = str9;
                i6++;
                arrayList9 = arrayList2;
                str5 = str4;
                str7 = str2;
                str8 = str3;
                g6 = arrayList;
                str6 = str;
                f7 = j0Var;
            }
            ArrayList arrayList13 = arrayList9;
            n("Partial: Table's export completed");
            return arrayList13;
        } catch (Exception e6) {
            n("Partial: Table's export failed");
            throw new Exception("GetTablesPartial: " + e6.getMessage());
        }
    }

    private ArrayList l(w0.c cVar, String str) {
        String trim;
        ArrayList arrayList = new ArrayList();
        try {
            List a6 = cVar.I((("SELECT name,tbl_name,sql FROM sqlite_master WHERE ") + "type = 'trigger' AND tbl_name = '" + str) + "' AND sql NOTNULL;", new ArrayList()).a();
            if (a6.size() > 0) {
                for (int i6 = 0; i6 < a6.size(); i6++) {
                    l lVar = new l();
                    if (!Objects.equals(((j0) a6.get(i6)).getString("tbl_name"), str)) {
                        throw new Exception("Error: getTriggers table name doesn't match");
                    }
                    String string = ((j0) a6.get(i6)).getString("name");
                    String string2 = ((j0) a6.get(i6)).getString("sql");
                    if (string2 == null || string == null) {
                        throw new Exception("Error: getTriggers sql statement or name is null");
                    }
                    String[] split = string2.split(string);
                    if (split.length != 2) {
                        throw new Exception("Error: getTriggers sql split name does not return 2 values");
                    }
                    if (!split[1].contains(str)) {
                        throw new Exception("Error: getTriggers sql split does not contains " + str);
                    }
                    String trim2 = split[1].split(str)[0].trim();
                    String[] split2 = split[1].split(trim2 + ' ' + str);
                    if (split2.length != 2) {
                        throw new Exception("Error: getTriggers sql split tableName does not return 2 values");
                    }
                    String str2 = "";
                    if (split2[1].trim().substring(0, 5).equalsIgnoreCase("BEGIN")) {
                        trim = split2[1].trim();
                    } else {
                        String[] split3 = split2[1].trim().split("BEGIN");
                        if (split3.length != 2) {
                            throw new Exception("Error: getTriggers sql split BEGIN does not return 2 values");
                        }
                        str2 = split3[0].trim();
                        trim = "BEGIN" + split3[1];
                    }
                    if (trim2.toUpperCase().endsWith(" ON")) {
                        trim2 = trim2.substring(0, trim2.length() - 3);
                    }
                    lVar.j(string);
                    lVar.k(trim2);
                    lVar.i(trim);
                    if (str2.length() > 0) {
                        lVar.h(str2);
                    }
                    arrayList.add(lVar);
                }
            }
            return arrayList;
        } catch (JSONException e6) {
            throw new Exception("Error: getTriggers " + e6.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "("
            java.util.List r0 = r8.d(r9, r0)
            java.lang.String r1 = ")"
            java.util.List r1 = r8.d(r9, r1)
            int r2 = r0.size()
            int r3 = r1.size()
            if (r2 != r3) goto Le3
            int r2 = r0.size()
            if (r2 != 0) goto L1d
            return r9
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = r4 + (-1)
            java.lang.String r4 = r9.substring(r3, r4)
            r2.<init>(r4)
        L33:
            int r4 = r0.size()
            if (r3 >= r4) goto Lc7
            int r4 = r0.size()
            int r4 = r4 + (-1)
            if (r3 >= r4) goto L74
            int r4 = r3 + 1
            java.lang.Object r5 = r0.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = r1.get(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r5 >= r6) goto L74
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + (-1)
            java.lang.Object r5 = r1.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r3 = r9.substring(r3, r5)
            goto L91
        L74:
            java.lang.Object r4 = r0.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = r4 + (-1)
            java.lang.Object r5 = r1.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r4 = r9.substring(r4, r5)
            r7 = r4
            r4 = r3
            r3 = r7
        L91:
            java.lang.String r5 = ","
            java.lang.String r6 = "§"
            java.lang.String r3 = r3.replaceAll(r5, r6)
            r2.append(r3)
            int r3 = r0.size()
            int r3 = r3 + (-1)
            if (r4 >= r3) goto Lc3
            java.lang.Object r3 = r1.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r5 = r4 + 1
            java.lang.Object r5 = r0.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 + (-1)
            java.lang.String r3 = r9.substring(r3, r5)
            r2.append(r3)
        Lc3:
            int r3 = r4 + 1
            goto L33
        Lc7:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r9 = r9.substring(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            return r9
        Le3:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r0 = "ModEmbeddedParentheses: Not same number of opening and closing parentheses"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.m(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:3:0x000c, B:6:0x002e, B:8:0x0034, B:10:0x0065, B:12:0x00a7, B:15:0x00b3, B:18:0x00be, B:19:0x00c5, B:21:0x00c6, B:29:0x00f0, B:30:0x0119, B:32:0x011f, B:34:0x0144, B:36:0x00f5, B:37:0x0114, B:38:0x0115, B:39:0x00da, B:42:0x00e4, B:45:0x0148, B:46:0x014f), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115 A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:3:0x000c, B:6:0x002e, B:8:0x0034, B:10:0x0065, B:12:0x00a7, B:15:0x00b3, B:18:0x00be, B:19:0x00c5, B:21:0x00c6, B:29:0x00f0, B:30:0x0119, B:32:0x011f, B:34:0x0144, B:36:0x00f5, B:37:0x0114, B:38:0x0115, B:39:0x00da, B:42:0x00e4, B:45:0x0148, B:46:0x014f), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x0.j a(w0.c r11, x0.j r12) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.a(w0.c, x0.j):x0.j");
    }

    public void b(w0.c cVar) {
        try {
            if (!this.f9781a.l(cVar, "sync_table")) {
                throw new Exception("DelExportedRows: No sync_table available");
            }
            long longValue = e(cVar).longValue();
            if (longValue < 0) {
                throw new Exception("DelExportedRows: No last exported date available");
            }
            List g6 = this.f9782b.g(cVar);
            if (g6.size() == 0) {
                throw new Exception("DelExportedRows: No table's names returned");
            }
            Iterator it = g6.iterator();
            while (it.hasNext()) {
                if (cVar.F("DELETE FROM " + ((String) it.next()) + " WHERE sql_deleted = 1 AND last_modified < " + longValue + ";", new ArrayList(), Boolean.TRUE, "no").getLong("lastId") < 0) {
                    throw new Exception("SetLastExportDate: lastId < 0");
                }
            }
        } catch (Exception e6) {
            throw new Exception("DelExportedRows: " + e6.getMessage());
        }
    }

    public Long e(w0.c cVar) {
        long j6;
        try {
            if (!this.f9781a.l(cVar, "sync_table")) {
                throw new Exception("GetSyncDate: No sync_table available");
            }
            List a6 = cVar.I("SELECT sync_date FROM sync_table WHERE id = 2;", new ArrayList()).a();
            if (a6.size() == 1) {
                j6 = ((j0) a6.get(0)).getLong("sync_date");
                if (j6 > 0) {
                    return Long.valueOf(j6);
                }
            }
            j6 = -1;
            return Long.valueOf(j6);
        } catch (Exception e6) {
            throw new Exception("GetSyncDate: " + e6.getMessage());
        }
    }

    public Long h(w0.c cVar) {
        long j6;
        try {
            if (!this.f9781a.l(cVar, "sync_table")) {
                throw new Exception("No sync_table available");
            }
            List a6 = cVar.I("SELECT sync_date FROM sync_table WHERE id = 1;", new ArrayList()).a();
            if (a6.size() == 1) {
                j6 = ((j0) a6.get(0)).getLong("sync_date");
                if (j6 > 0) {
                    return Long.valueOf(j6);
                }
            }
            j6 = -1;
            return Long.valueOf(j6);
        } catch (Exception e6) {
            throw new Exception("GetSyncDate: " + e6.getMessage());
        }
    }

    public void n(String str) {
        com.getcapacitor.community.database.sqlite.g.b().c("exportJsonProgress", new C0147a("Export: " + str));
    }

    public void o(w0.c cVar, Long l6) {
        StringBuilder sb;
        try {
            if (!this.f9781a.l(cVar, "sync_table")) {
                throw new Exception("SetLastExportDate: No sync_table available");
            }
            if (e(cVar).longValue() > 0) {
                sb = new StringBuilder();
                sb.append("UPDATE sync_table SET sync_date = ");
                sb.append(l6);
                sb.append(" WHERE id = 2;");
            } else {
                sb = new StringBuilder();
                sb.append("INSERT INTO sync_table (sync_date) VALUES (");
                sb.append(l6);
                sb.append(");");
            }
            if (cVar.F(sb.toString(), new ArrayList(), Boolean.FALSE, "no").getLong("lastId") < 0) {
                throw new Exception("SetLastExportDate: lastId < 0");
            }
        } catch (Exception e6) {
            throw new Exception("SetLastExportDate: " + e6.getMessage());
        }
    }
}
