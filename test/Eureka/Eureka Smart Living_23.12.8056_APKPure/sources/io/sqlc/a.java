package io.sqlc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f7036d = Pattern.compile("^[\\s;]*([^\\s;]+)", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f7037e = Pattern.compile("\\s+WHERE\\s+(.+)$", 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f7038f = Pattern.compile("^\\s*UPDATE\\s+(\\S+)", 2);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f7039g = Pattern.compile("^\\s*DELETE\\s+FROM\\s+(\\S+)", 2);

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f7040h = true;

    /* renamed from: a, reason: collision with root package name */
    File f7041a;

    /* renamed from: b, reason: collision with root package name */
    SQLiteDatabase f7042b;

    /* renamed from: c, reason: collision with root package name */
    boolean f7043c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sqlc.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0106a {
        update,
        insert,
        delete,
        select,
        begin,
        commit,
        rollback,
        other
    }

    private void a(SQLiteStatement sQLiteStatement, JSONArray jSONArray) {
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            if ((jSONArray.get(i6) instanceof Float) || (jSONArray.get(i6) instanceof Double)) {
                sQLiteStatement.bindDouble(i6 + 1, jSONArray.getDouble(i6));
            } else if (jSONArray.get(i6) instanceof Number) {
                sQLiteStatement.bindLong(i6 + 1, jSONArray.getLong(i6));
            } else if (jSONArray.isNull(i6)) {
                sQLiteStatement.bindNull(i6 + 1);
            } else {
                sQLiteStatement.bindString(i6 + 1, jSONArray.getString(i6));
            }
        }
    }

    private void b(JSONObject jSONObject, String str, Cursor cursor, int i6) {
        Object obj;
        int type = cursor.getType(i6);
        if (type == 0) {
            obj = JSONObject.NULL;
        } else if (type == 1) {
            jSONObject.put(str, cursor.getLong(i6));
            return;
        } else {
            if (type == 2) {
                jSONObject.put(str, cursor.getDouble(i6));
                return;
            }
            obj = cursor.getString(i6);
        }
        jSONObject.put(str, obj);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:(3:192|193|(18:195|26|27|28|(1:160)(12:31|32|33|34|35|36|37|38|(2:143|144)(1:40)|41|42|43)|44|(7:117|118|119|120|121|122|123)|46|(6:105|106|107|108|109|110)|48|(9:83|84|85|86|87|89|90|91|92)(1:50)|(5:64|65|66|67|68)|52|53|54|(1:56)(1:60)|57|59))|13|14|15|16|17|18|(4:20|22|23|24)(1:168)|25|26|27|28|(0)|160|44|(0)|46|(0)|48|(0)(0)|(0)|52|53|54|(0)(0)|57|59) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:5|6|7|(3:192|193|(18:195|26|27|28|(1:160)(12:31|32|33|34|35|36|37|38|(2:143|144)(1:40)|41|42|43)|44|(7:117|118|119|120|121|122|123)|46|(6:105|106|107|108|109|110)|48|(9:83|84|85|86|87|89|90|91|92)(1:50)|(5:64|65|66|67|68)|52|53|54|(1:56)(1:60)|57|59))|9|(1:11)|12|13|14|15|16|17|18|(4:20|22|23|24)(1:168)|25|26|27|28|(0)|160|44|(0)|46|(0)|48|(0)(0)|(0)|52|53|54|(0)(0)|57|59) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0288, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0289, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x028c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x028d, code lost:
    
        r19 = "SQLiteAndroidDatabase.executeSql[Batch](): Error=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0293, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0294, code lost:
    
        r19 = "SQLiteAndroidDatabase.executeSql[Batch](): Error=";
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x006c, code lost:
    
        r0.printStackTrace();
        r0 = r0.getMessage();
        android.util.Log.v("executeSqlBatch", "SQLiteStatement.executeUpdateDelete(): Error=" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0087, code lost:
    
        r7 = r0;
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x008a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x008c, code lost:
    
        r0.printStackTrace();
        r0 = "constraint failure: " + r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x00a2, code lost:
    
        android.util.Log.v("executeSqlBatch", "SQLiteStatement.executeUpdateDelete(): Error=" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00b4, code lost:
    
        r7 = r0;
        r0 = -1;
        r15 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0298, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0299, code lost:
    
        r19 = "SQLiteAndroidDatabase.executeSql[Batch](): Error=";
        r10 = 6;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c5 A[Catch: JSONException -> 0x02f3, TRY_ENTER, TryCatch #2 {JSONException -> 0x02f3, blocks: (B:56:0x02c5, B:57:0x02d2, B:60:0x02d6), top: B:54:0x02c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d6 A[Catch: JSONException -> 0x02f3, TRY_LEAVE, TryCatch #2 {JSONException -> 0x02f3, blocks: (B:56:0x02c5, B:57:0x02d2, B:60:0x02d6), top: B:54:0x02c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.lang.String r23, org.json.JSONArray r24, org.json.JSONArray r25) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sqlc.a.f(java.lang.String, org.json.JSONArray, org.json.JSONArray):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        r10.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject g(android.database.sqlite.SQLiteDatabase r9, java.lang.String r10, org.json.JSONArray r11) {
        /*
            r8 = this;
            java.lang.String r0 = "INTERNAL PLUGIN ERROR: deprecated android.os.Build.VERSION not supported: "
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            int r2 = r11.length()     // Catch: java.lang.Exception -> Lb7
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Exception -> Lb7
            r3 = 0
            r4 = 0
        Lf:
            int r5 = r11.length()     // Catch: java.lang.Exception -> Lb7
            if (r4 >= r5) goto L29
            boolean r5 = r11.isNull(r4)     // Catch: java.lang.Exception -> Lb7
            if (r5 == 0) goto L20
            java.lang.String r5 = ""
            r2[r4] = r5     // Catch: java.lang.Exception -> Lb7
            goto L26
        L20:
            java.lang.String r5 = r11.getString(r4)     // Catch: java.lang.Exception -> Lb7
            r2[r4] = r5     // Catch: java.lang.Exception -> Lb7
        L26:
            int r4 = r4 + 1
            goto Lf
        L29:
            android.database.Cursor r9 = r9.rawQuery(r10, r2)     // Catch: java.lang.Exception -> Lb7
            if (r9 == 0) goto Lb1
            boolean r10 = r9.moveToFirst()
            if (r10 == 0) goto Lb1
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
            int r11 = r9.getColumnCount()
        L3e:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r4 = 0
        L44:
            if (r4 >= r11) goto L99
            java.lang.String r5 = r9.getColumnName(r4)     // Catch: org.json.JSONException -> L9d
            boolean r6 = io.sqlc.a.f7040h     // Catch: org.json.JSONException -> L9d
            java.lang.String r7 = "SQLiteAndroidDatabase.executeSqlStatementQuery"
            if (r6 == 0) goto L70
            r8.b(r2, r5, r9, r4)     // Catch: java.lang.Exception -> L56
            int r4 = r4 + 1
            goto L44
        L56:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L9d
            r4.<init>()     // Catch: org.json.JSONException -> L9d
            java.lang.String r5 = "INTERNAL PLUGIN ERROR: could not bindPostHoneycomb: "
            r4.append(r5)     // Catch: org.json.JSONException -> L9d
            java.lang.String r5 = r2.getMessage()     // Catch: org.json.JSONException -> L9d
            r4.append(r5)     // Catch: org.json.JSONException -> L9d
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L9d
            android.util.Log.v(r7, r4)     // Catch: org.json.JSONException -> L9d
            throw r2     // Catch: org.json.JSONException -> L9d
        L70:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L9d
            r2.<init>()     // Catch: org.json.JSONException -> L9d
            r2.append(r0)     // Catch: org.json.JSONException -> L9d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: org.json.JSONException -> L9d
            r2.append(r4)     // Catch: org.json.JSONException -> L9d
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L9d
            android.util.Log.v(r7, r2)     // Catch: org.json.JSONException -> L9d
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: org.json.JSONException -> L9d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L9d
            r5.<init>()     // Catch: org.json.JSONException -> L9d
            r5.append(r0)     // Catch: org.json.JSONException -> L9d
            r5.append(r4)     // Catch: org.json.JSONException -> L9d
            java.lang.String r4 = r5.toString()     // Catch: org.json.JSONException -> L9d
            r2.<init>(r4)     // Catch: org.json.JSONException -> L9d
            throw r2     // Catch: org.json.JSONException -> L9d
        L99:
            r10.put(r2)     // Catch: org.json.JSONException -> L9d
            goto La1
        L9d:
            r2 = move-exception
            r2.printStackTrace()
        La1:
            boolean r2 = r9.moveToNext()
            if (r2 != 0) goto L3e
            java.lang.String r11 = "rows"
            r1.put(r11, r10)     // Catch: org.json.JSONException -> Lad
            goto Lb1
        Lad:
            r10 = move-exception
            r10.printStackTrace()
        Lb1:
            if (r9 == 0) goto Lb6
            r9.close()
        Lb6:
            return r1
        Lb7:
            r9 = move-exception
            r9.printStackTrace()
            java.lang.String r10 = r9.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "SQLiteAndroidDatabase.executeSql[Batch](): Error="
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "executeSqlBatch"
            android.util.Log.v(r11, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sqlc.a.g(android.database.sqlite.SQLiteDatabase, java.lang.String, org.json.JSONArray):org.json.JSONObject");
    }

    static EnumC0106a h(String str) {
        Matcher matcher = f7036d.matcher(str);
        if (!matcher.find()) {
            throw new RuntimeException("query not found");
        }
        try {
            String group = matcher.group(1);
            if (group.length() != 0) {
                return EnumC0106a.valueOf(group.toLowerCase(Locale.ENGLISH));
            }
            throw new RuntimeException("query not found");
        } catch (IllegalArgumentException unused) {
            return EnumC0106a.other;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        d();
        i(this.f7041a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        SQLiteDatabase sQLiteDatabase = this.f7042b;
        if (sQLiteDatabase != null) {
            if (this.f7043c) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e6) {
                    Log.v("closeDatabaseNow", "INTERNAL PLUGIN ERROR IGNORED: Not able to end active transaction before closing database: " + e6.getMessage());
                    e6.printStackTrace();
                }
                this.f7043c = false;
            }
            this.f7042b.close();
            this.f7042b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String[] strArr, JSONArray[] jSONArrayArr, org.apache.cordova.a aVar) {
        if (this.f7042b == null) {
            aVar.error("INTERNAL PLUGIN ERROR: database not open");
            return;
        }
        int length = strArr.length;
        JSONArray jSONArray = new JSONArray();
        for (int i6 = 0; i6 < length; i6++) {
            f(strArr[i6], jSONArrayArr[i6], jSONArray);
        }
        aVar.success(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(File file) {
        if (f7040h) {
            this.f7041a = file;
            this.f7042b = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("INTERNAL PLUGIN ERROR: deprecated android.os.Build.VERSION not supported: ");
        int i6 = Build.VERSION.SDK_INT;
        sb.append(i6);
        Log.v("SQLiteAndroidDatabase.open", sb.toString());
        throw new RuntimeException("INTERNAL PLUGIN ERROR: deprecated android.os.Build.VERSION not supported: " + i6);
    }
}
