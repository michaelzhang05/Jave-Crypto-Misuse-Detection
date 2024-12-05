package w0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Dictionary;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: w, reason: collision with root package name */
    private static final String f9683w = "w0.c";

    /* renamed from: a, reason: collision with root package name */
    private Boolean f9684a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9685b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9686c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9687d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f9688e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f9689f;

    /* renamed from: g, reason: collision with root package name */
    private final Boolean f9690g;

    /* renamed from: h, reason: collision with root package name */
    private final File f9691h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9692i;

    /* renamed from: j, reason: collision with root package name */
    private j0.b f9693j;

    /* renamed from: k, reason: collision with root package name */
    private final o f9694k;

    /* renamed from: l, reason: collision with root package name */
    private final m f9695l;

    /* renamed from: m, reason: collision with root package name */
    private final j f9696m;

    /* renamed from: n, reason: collision with root package name */
    private final x0.o f9697n;

    /* renamed from: o, reason: collision with root package name */
    private final q f9698o;

    /* renamed from: p, reason: collision with root package name */
    private final i f9699p;

    /* renamed from: q, reason: collision with root package name */
    private final p f9700q;

    /* renamed from: r, reason: collision with root package name */
    private final Dictionary f9701r;

    /* renamed from: s, reason: collision with root package name */
    private final x0.g f9702s;

    /* renamed from: t, reason: collision with root package name */
    private final x0.a f9703t;

    /* renamed from: u, reason: collision with root package name */
    private Boolean f9704u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f9705v;

    public c(Context context, String str, Boolean bool, String str2, int i6, Boolean bool2, Dictionary dictionary, SharedPreferences sharedPreferences, Boolean bool3) {
        Boolean bool4 = Boolean.FALSE;
        this.f9684a = bool4;
        this.f9693j = null;
        this.f9702s = new x0.g();
        this.f9703t = new x0.a();
        this.f9704u = bool4;
        this.f9705v = false;
        this.f9686c = context;
        this.f9685b = str;
        this.f9687d = str2;
        this.f9688e = bool;
        this.f9689f = bool2;
        this.f9692i = i6;
        this.f9701r = dictionary;
        this.f9690g = bool3;
        if (str.contains("/") && str.endsWith("SQLite.db")) {
            this.f9704u = Boolean.TRUE;
            this.f9691h = new File(str);
        } else {
            this.f9691h = context.getDatabasePath(str);
        }
        this.f9694k = new o();
        this.f9695l = new m();
        this.f9696m = new j();
        this.f9697n = new x0.o();
        this.f9698o = new q();
        this.f9699p = new i();
        this.f9700q = bool2.booleanValue() ? new p(context, sharedPreferences) : null;
        a();
        File parentFile = this.f9691h.getParentFile();
        Objects.requireNonNull(parentFile);
        if (!parentFile.exists() && !this.f9691h.getParentFile().mkdirs()) {
            System.out.println("Failed to create parent directories.");
        }
        Log.v(f9683w, "&&& file path " + this.f9691h.getAbsolutePath());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private j0 A(String str) {
        char c6;
        j0 j0Var = new j0();
        String trim = str.replace("\n", "").trim();
        boolean z5 = false;
        if (trim.endsWith(";")) {
            trim = trim.substring(0, trim.length() - 1).trim();
        }
        j0Var.put("isReturning", false);
        j0Var.m("stmt", trim);
        j0Var.m("names", "");
        String upperCase = trim.substring(0, Math.min(trim.length(), 6)).toUpperCase();
        upperCase.hashCode();
        switch (upperCase.hashCode()) {
            case -2130463047:
                if (upperCase.equals("INSERT")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case -1785516855:
                if (upperCase.equals("UPDATE")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case 2012838315:
                if (upperCase.equals("DELETE")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        switch (c6) {
            case 0:
                int indexOf = trim.toUpperCase().indexOf("VALUES");
                if (indexOf != -1) {
                    int length = trim.length() - 1;
                    while (true) {
                        if (length < indexOf) {
                            length = -1;
                        } else if (trim.charAt(length) != ')') {
                            length--;
                        }
                    }
                    if (length != -1) {
                        StringBuilder sb = new StringBuilder();
                        int i6 = length + 1;
                        sb.append(trim.substring(0, i6).trim());
                        sb.append(";");
                        String sb2 = sb.toString();
                        String trim2 = trim.substring(i6).trim();
                        if (trim2.length() > 0 && !trim2.endsWith(";")) {
                            trim2 = trim2 + ";";
                        }
                        if (trim2.toLowerCase().contains("returning")) {
                            j0Var.put("isReturning", true);
                            j0Var.m("stmt", sb2);
                            j0Var.m("names", trim2);
                        }
                    }
                }
                return j0Var;
            case 1:
            case 2:
                String[] split = trim.split("\\s+");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length2 = split.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length2) {
                        String str2 = split[i7];
                        if (str2.toLowerCase().equals("returning")) {
                            arrayList2.add(str2);
                            arrayList2.addAll(K(str2, split));
                            z5 = true;
                        } else {
                            arrayList.add(str2);
                            i7++;
                        }
                    }
                }
                if (z5) {
                    String str3 = b.a(" ", arrayList) + ";";
                    String a6 = b.a(" ", arrayList2);
                    if (a6.length() > 0 && !a6.endsWith(";")) {
                        a6 = a6 + ";";
                    }
                    j0Var.put("isReturning", true);
                    j0Var.m("stmt", str3);
                    j0Var.m("names", a6);
                }
                return j0Var;
            default:
                return j0Var;
        }
    }

    public static void B(JSONArray jSONArray, JSONArray jSONArray2) {
        for (int i6 = 0; i6 < jSONArray2.length(); i6++) {
            jSONArray.put(jSONArray2.get(i6));
        }
    }

    private List K(String str, String[] strArr) {
        List asList = Arrays.asList(strArr);
        int indexOf = asList.indexOf(str);
        return indexOf == -1 ? new ArrayList() : new ArrayList(asList.subList(indexOf + 1, asList.size()));
    }

    private void a() {
        SQLiteDatabase.Z(this.f9686c);
    }

    private g0 o(c cVar, String str, String str2, Long l6, Long l7, String str3) {
        g0 g0Var = new g0();
        if (l6.longValue() < 0 || str.length() == 0) {
            return g0Var;
        }
        Long valueOf = Long.valueOf(l6.longValue() + 1);
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(str);
        sb.append(" FROM ");
        sb.append(str2);
        sb.append(" WHERE ");
        sb.append("rowid ");
        if (str3.equals("wAone")) {
            sb.append("= ");
            sb.append(valueOf);
        }
        if (str3.equals("wAall")) {
            sb.append("BETWEEN ");
            sb.append(valueOf);
            sb.append(" AND ");
            sb.append(l7);
        }
        sb.append(";");
        return cVar.I(sb.toString(), new ArrayList());
    }

    private j0 p(String str, String str2) {
        j0 j0Var = new j0();
        j0 A = A(str);
        Boolean valueOf = Boolean.valueOf(A.getBoolean("isReturning"));
        String string = A.getString("stmt");
        String string2 = A.getString("names");
        j0Var.m("stmt", string);
        j0Var.m("names", "");
        if (valueOf.booleanValue() && str2.startsWith("wA")) {
            int indexOf = (string2 != null ? string2.toLowerCase() : "").indexOf("returning");
            if (indexOf != -1) {
                String trim = string2.substring(indexOf + 9).trim();
                if (trim.endsWith(";")) {
                    j0Var.m("names", trim.substring(0, trim.length() - 1));
                }
            }
        }
        return j0Var;
    }

    private g0 s(c cVar, String str, String str2) {
        g0 g0Var = new g0();
        String d6 = n.d(str);
        String e6 = n.e(str);
        if (e6 == null || d6 == null) {
            return g0Var;
        }
        return cVar.I("SELECT " + str2 + " FROM " + d6 + " WHERE " + e6 + ";", new ArrayList());
    }

    public j0 C(String str, JSONArray jSONArray, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            try {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i6);
                StringBuilder sb2 = new StringBuilder();
                for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                    Object obj = jSONArray2.get(i7);
                    sb2.append(obj instanceof String ? "'" + obj + "'" : String.valueOf(obj));
                    if (i7 < jSONArray2.length() - 1) {
                        sb2.append(",");
                    }
                }
                sb.append("(");
                sb.append(sb2.toString());
                sb.append(")");
                if (i6 < jSONArray.length() - 1) {
                    sb.append(",");
                }
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        sb.append(";");
        String m6 = m(str);
        if (m6 != null) {
            str = str.replace(m6, sb.toString());
        }
        return F(str, new ArrayList(), Boolean.FALSE, str2);
    }

    public j0 D(String str, JSONArray jSONArray, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            arrayList.add(jSONArray.get(i6));
        }
        try {
            return F(str, arrayList, Boolean.FALSE, str2);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void E() {
        String str;
        Dictionary dictionary;
        String str2 = "";
        if (!this.f9688e.booleanValue() || (!this.f9687d.equals("secret") && !this.f9687d.equals("encryption") && !this.f9687d.equals("decryption"))) {
            str = "";
        } else {
            if (!p.f().booleanValue()) {
                throw new Exception("No Passphrase stored");
            }
            str = p.e();
        }
        if (this.f9687d.equals("encryption")) {
            if (!this.f9689f.booleanValue()) {
                throw new Exception("No Encryption set in capacitor.config");
            }
            try {
                this.f9695l.c(this.f9686c, this.f9691h, SQLiteDatabase.T(str.toCharArray()));
            } catch (Exception e6) {
                String str3 = "Failed in encryption " + e6.getMessage();
                Log.v(f9683w, str3);
                throw new Exception(str3);
            }
        }
        if (!this.f9687d.equals("decryption")) {
            str2 = str;
        } else {
            if (!this.f9689f.booleanValue()) {
                throw new Exception("No Encryption set in capacitor.config");
            }
            try {
                this.f9695l.b(this.f9686c, this.f9691h, SQLiteDatabase.T(str.toCharArray()));
            } catch (Exception e7) {
                String str4 = "Failed in decryption " + e7.getMessage();
                Log.v(f9683w, str4);
                throw new Exception(str4);
            }
        }
        try {
            this.f9693j = (y().booleanValue() || this.f9690g.booleanValue()) ? SQLiteDatabase.e0(String.valueOf(this.f9691h), str2, null, 1) : SQLiteDatabase.k0(this.f9691h, str2, null);
            j0.b bVar = this.f9693j;
            if (bVar == null) {
                this.f9684a = Boolean.FALSE;
                this.f9693j = null;
                throw new Exception("No database returned");
            }
            if (!bVar.k()) {
                this.f9684a = Boolean.FALSE;
                this.f9693j = null;
                throw new Exception("Database not opened");
            }
            try {
                this.f9693j.m(true);
                if (y().booleanValue() || this.f9690g.booleanValue()) {
                    this.f9684a = Boolean.TRUE;
                    return;
                }
                try {
                    int y5 = this.f9693j.y();
                    if (this.f9692i > y5 && (dictionary = this.f9701r) != null && dictionary.size() > 0) {
                        try {
                            this.f9696m.c(this.f9686c, this.f9685b, "backup-" + this.f9685b);
                            this.f9698o.b(this, this.f9701r, Integer.valueOf(y5), Integer.valueOf(this.f9692i));
                            if (!this.f9696m.g(this.f9686c, this.f9685b).booleanValue()) {
                                Log.v(f9683w, "Failed in deleteBackupDB backup-\" + _dbName");
                                d();
                                this.f9693j = null;
                                throw new Exception("Failed in deleteBackupDB backup-\" + _dbName");
                            }
                        } catch (Exception e8) {
                            boolean booleanValue = this.f9696m.t(this.f9686c, this.f9685b).booleanValue();
                            String message = e8.getMessage();
                            if (!booleanValue) {
                                message = message + "Failed in restoreDatabase " + this.f9685b;
                            }
                            Log.v(f9683w, message);
                            d();
                            this.f9693j = null;
                            throw new Exception(message);
                        }
                    }
                    this.f9684a = Boolean.TRUE;
                } catch (IllegalStateException e9) {
                    String str5 = "Failed in get/setVersion " + e9.getMessage();
                    Log.v(f9683w, str5);
                    d();
                    this.f9693j = null;
                    throw new Exception(str5);
                } catch (l5.c e10) {
                    String str6 = "Failed in setVersion " + e10.getMessage();
                    Log.v(f9683w, str6);
                    d();
                    this.f9693j = null;
                    throw new Exception(str6);
                }
            } catch (IllegalStateException e11) {
                String str7 = "Failed in setForeignKeyConstraintsEnabled " + e11.getMessage();
                Log.v(f9683w, str7);
                d();
                this.f9693j = null;
                throw new Exception(str7);
            }
        } catch (Exception e12) {
            String str8 = "Error in creating the database" + e12.getMessage();
            this.f9684a = Boolean.FALSE;
            this.f9693j = null;
            throw new Exception(str8);
        }
    }

    public j0 F(String str, ArrayList arrayList, Boolean bool, String str2) {
        String str3 = str;
        String str4 = str2;
        String str5 = "";
        String upperCase = str3.replaceAll("\n", "").trim().substring(0, 6).toUpperCase();
        g0 g0Var = new g0();
        j0 j0Var = new j0();
        if (!str4.equals("no")) {
            str4 = "wA" + str4;
        }
        String str6 = str4;
        if (str6.equals("no") || str6.substring(0, Math.min(str6.length(), 2)).equals("wA")) {
            try {
                j0 p6 = p(str3, str6);
                str3 = p6.h("stmt", str3);
                str5 = p6.h("names", "");
            } catch (JSONException e6) {
                throw new Exception(e6.getMessage());
            }
        }
        j0.d dVar = null;
        try {
            try {
                if (!bool.booleanValue() && upperCase.equals("DELETE")) {
                    str3 = i(this, str3, arrayList);
                }
                if (str3 == null) {
                    throw new Exception("sqlStmt is null");
                }
                j0.d u5 = this.f9693j.u(str3);
                if (arrayList != null) {
                    try {
                        if (arrayList.size() > 0) {
                            Object[] objArr = new Object[arrayList.size()];
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                if (arrayList.get(i6) == null) {
                                    objArr[i6] = dVar;
                                } else if (JSONObject.NULL == arrayList.get(i6)) {
                                    dVar = null;
                                    objArr[i6] = null;
                                } else {
                                    dVar = null;
                                    objArr[i6] = arrayList.get(i6);
                                }
                            }
                            j0.a.a(u5, objArr);
                        }
                    } catch (Exception e7) {
                        e = e7;
                        throw new Exception(e.getMessage());
                    } catch (Throwable th) {
                        th = th;
                        dVar = u5;
                        if (dVar != null) {
                            dVar.close();
                        }
                        throw th;
                    }
                }
                long f6 = this.f9694k.f(this.f9693j);
                if (upperCase.equals("INSERT")) {
                    u5.A();
                } else {
                    if (str6.startsWith("wA") && str5.length() > 0 && upperCase.equals("DELETE")) {
                        g0Var = s(this, str3, str5);
                    }
                    u5.t();
                }
                Long valueOf = Long.valueOf(this.f9694k.f(this.f9693j));
                if (str6.startsWith("wA") && str5.length() > 0) {
                    if (upperCase.equals("INSERT")) {
                        String d6 = n.d(str3);
                        if (d6 != null) {
                            g0Var = o(this, str5, d6, Long.valueOf(f6), valueOf, str6);
                        }
                    } else if (upperCase.equals("UPDATE")) {
                        g0Var = s(this, str3, str5);
                    }
                }
                j0Var.put("lastId", valueOf);
                j0Var.put("values", g0Var);
                if (u5 != null) {
                    u5.close();
                }
                return j0Var;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Integer G() {
        if (!this.f9693j.k()) {
            throw new Exception("Database not opened");
        }
        try {
            if (x()) {
                this.f9693j.d();
            }
            return 0;
        } catch (Exception e6) {
            String str = "Failed in rollbackTransaction" + e6.getMessage();
            Log.v(f9683w, str);
            throw new Exception(str);
        }
    }

    public j0 H(String str, ArrayList arrayList, Boolean bool, String str2) {
        j0 j0Var = new j0();
        try {
            try {
                j0.b bVar = this.f9693j;
                if (bVar == null || !bVar.k() || str.length() <= 0) {
                    throw new Exception("Database not opened");
                }
                int e6 = this.f9694k.e(this.f9693j);
                if (bool.booleanValue()) {
                    c();
                }
                j0 F = F(str, arrayList, Boolean.FALSE, str2);
                long j6 = F.getLong("lastId");
                if (j6 != -1 && bool.booleanValue()) {
                    e();
                }
                j0Var.put("changes", this.f9694k.e(this.f9693j) - e6);
                j0Var.put("lastId", j6);
                j0Var.put("values", F.getJSONArray("values"));
                return j0Var;
            } catch (Exception e7) {
                throw new Exception(e7.getMessage());
            }
        } finally {
            if (this.f9693j != null && bool.booleanValue() && this.f9693j.C()) {
                G();
            }
        }
    }

    public g0 I(String str, ArrayList arrayList) {
        Object obj;
        g0 g0Var = new g0();
        j0.b bVar = this.f9693j;
        if (bVar == null) {
            return g0Var;
        }
        k5.d dVar = null;
        try {
            try {
                k5.d dVar2 = (k5.d) bVar.l(str, arrayList.toArray(new Object[0]));
                while (dVar2.moveToNext()) {
                    try {
                        j0 j0Var = new j0();
                        for (int i6 = 0; i6 < dVar2.getColumnCount(); i6++) {
                            String columnName = dVar2.getColumnName(i6);
                            int columnIndex = dVar2.getColumnIndex(columnName);
                            int type = dVar2.getType(i6);
                            if (type != 0) {
                                if (type == 1) {
                                    j0Var.put(columnName, dVar2.getLong(columnIndex));
                                } else if (type == 2) {
                                    j0Var.put(columnName, dVar2.getDouble(columnIndex));
                                } else if (type == 3) {
                                    j0Var.m(columnName, dVar2.getString(columnIndex));
                                } else if (type == 4) {
                                    obj = this.f9694k.a(dVar2.getBlob(columnIndex));
                                }
                            } else {
                                obj = JSONObject.NULL;
                            }
                            j0Var.put(columnName, obj);
                        }
                        g0Var.put(j0Var);
                    } catch (Exception e6) {
                        e = e6;
                        dVar = dVar2;
                        throw new Exception("in selectSQL cursor " + e.getMessage());
                    } catch (Throwable th) {
                        th = th;
                        dVar = dVar2;
                        if (dVar != null) {
                            dVar.close();
                        }
                        throw th;
                    }
                }
                dVar2.close();
                return g0Var;
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void J(String str) {
        new j0();
        try {
            if (!this.f9697n.l(this, "sync_table")) {
                throw new Exception("No sync_table available");
            }
            if (j(new String[]{"UPDATE sync_table SET sync_date = " + (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(str.replaceAll("Z$", "+0000")).getTime() / 1000) + " WHERE id = 1;"}, new Boolean[0]).d("changes") == -1) {
                throw new Exception("changes < 0");
            }
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public j0 b(j0 j0Var, j0 j0Var2) {
        long j6 = j0Var2.getLong("lastId");
        JSONArray jSONArray = j0Var2.getJSONArray("values");
        if (j0Var.keys().hasNext()) {
            JSONArray jSONArray2 = j0Var2.getJSONArray("values");
            jSONArray = j0Var.getJSONArray("values");
            B(jSONArray, jSONArray2);
        }
        j0Var.put("lastId", j6);
        j0Var.put("values", jSONArray);
        return j0Var;
    }

    public Integer c() {
        if (!this.f9693j.k()) {
            throw new Exception("Database not opened");
        }
        try {
            if (x()) {
                throw new Exception("Already in transaction");
            }
            this.f9693j.e();
            return 0;
        } catch (Exception e6) {
            String str = "Failed in beginTransaction" + e6.getMessage();
            Log.v(f9683w, str);
            throw new Exception(str);
        }
    }

    public void d() {
        if (!this.f9693j.k()) {
            throw new Exception("Database not opened");
        }
        try {
            this.f9693j.close();
            this.f9684a = Boolean.FALSE;
        } catch (Exception e6) {
            String str = "Failed in database close" + e6.getMessage();
            Log.v(f9683w, str);
            throw new Exception(str);
        }
    }

    public Integer e() {
        try {
            if (!this.f9693j.k()) {
                throw new Exception("Database not opened");
            }
            try {
                if (!x()) {
                    throw new Exception("No transaction active");
                }
                this.f9693j.r();
                return 0;
            } catch (Exception e6) {
                String str = "Failed in commitTransaction" + e6.getMessage();
                Log.v(f9683w, str);
                throw new Exception(str);
            }
        } finally {
            this.f9693j.d();
        }
    }

    public j0 f() {
        j0 j0Var = new j0();
        if (this.f9697n.l(this, "sync_table")) {
            j0Var.put("changes", 0);
            return j0Var;
        }
        boolean j6 = this.f9697n.j(this);
        boolean k6 = this.f9697n.k(this);
        if (!j6 || !k6) {
            throw new Exception("No last_modified/sql_deleted columns in tables");
        }
        try {
            return j(new String[]{"CREATE TABLE IF NOT EXISTS sync_table (id INTEGER PRIMARY KEY NOT NULL,sync_date INTEGER);", "INSERT INTO sync_table (sync_date) VALUES ('" + (new Date().getTime() / 1000) + "');"}, new Boolean[0]);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void g(String str) {
        try {
            if (this.f9691h.exists() && !this.f9684a.booleanValue()) {
                E();
            }
            if (this.f9684a.booleanValue()) {
                d();
            }
            if (this.f9691h.exists()) {
                if (!this.f9696m.h(this.f9686c, str).booleanValue()) {
                    throw new Exception("Failed in deleteDB ");
                }
                this.f9684a = Boolean.FALSE;
            }
        } catch (Exception e6) {
            throw new Exception("Failed in deleteDB " + e6.getMessage());
        }
    }

    public void h() {
        try {
            this.f9703t.b(this);
        } catch (Exception e6) {
            Log.e(f9683w, "Error: exportToJson " + e6.getMessage());
            throw new Exception(e6.getMessage());
        }
    }

    public String i(c cVar, String str, ArrayList arrayList) {
        try {
            boolean j6 = this.f9697n.j(cVar);
            boolean k6 = this.f9697n.k(cVar);
            if (j6 && k6) {
                String e6 = n.e(str);
                if (e6 == null) {
                    throw new Exception("deleteSQL: cannot find a WHERE clause");
                }
                String d6 = n.d(str);
                if (d6 == null) {
                    throw new Exception("deleteSQL: cannot find a WHERE clause");
                }
                String[] strArr = (String[]) n.b(e6).toArray(new String[0]);
                if (strArr.length == 0) {
                    throw new Exception("deleteSQL: Did not find column names in the WHERE Statement");
                }
                if (!g.d(cVar, d6, e6, strArr, arrayList)) {
                    return "";
                }
                if (e6.endsWith(";")) {
                    e6 = e6.substring(0, e6.length() - 1);
                }
                return "UPDATE " + d6 + " SET sql_deleted = 1 WHERE " + e6 + " AND sql_deleted = 0;";
            }
            return str;
        } catch (Exception e7) {
            throw new Exception("DeleteSQL " + (e7.getMessage() != null ? e7.getMessage() : e7.toString()));
        }
    }

    public j0 j(String[] strArr, Boolean... boolArr) {
        Boolean valueOf = Boolean.valueOf(boolArr.length == 1 ? boolArr[0].booleanValue() : true);
        j0 j0Var = new j0();
        try {
            try {
                j0.b bVar = this.f9693j;
                if (bVar == null || !bVar.k()) {
                    throw new Exception("Database not opened");
                }
                Integer valueOf2 = Integer.valueOf(this.f9694k.e(this.f9693j));
                if (valueOf.booleanValue()) {
                    c();
                }
                int length = strArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    String str = strArr[i6];
                    if (!str.endsWith(";")) {
                        str = str + ";";
                    }
                    if (str.trim().substring(0, Math.min(str.trim().length(), 11)).toUpperCase().equals("DELETE FROM") && str.toLowerCase().contains("WHERE".toLowerCase())) {
                        str = i(this, str.trim(), new ArrayList());
                    }
                    this.f9693j.o(str);
                }
                Integer valueOf3 = Integer.valueOf(this.f9694k.e(this.f9693j) - valueOf2.intValue());
                if (valueOf3.intValue() != -1) {
                    if (valueOf.booleanValue()) {
                        e();
                    }
                    j0Var.put("changes", valueOf3);
                }
                return j0Var;
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        } finally {
            if (this.f9693j != null && valueOf.booleanValue() && this.f9693j.C()) {
                G();
            }
        }
    }

    public j0 k(g0 g0Var, Boolean bool, String str) {
        j0 j0Var = new j0();
        j0 j0Var2 = new j0();
        try {
            try {
                j0.b bVar = this.f9693j;
                if (bVar == null || !bVar.k()) {
                    throw new Exception("Database not opened");
                }
                int e6 = this.f9694k.e(this.f9693j);
                if (bool.booleanValue()) {
                    c();
                }
                Long l6 = -1L;
                int i6 = 0;
                while (true) {
                    if (i6 >= g0Var.length()) {
                        break;
                    }
                    JSONObject jSONObject = g0Var.getJSONObject(i6);
                    new j0();
                    String string = jSONObject.getString("statement");
                    JSONArray jSONArray = jSONObject.getJSONArray("values");
                    j0 C = Boolean.valueOf(jSONArray.length() > 0 ? this.f9694k.j(jSONArray.get(0)).booleanValue() : false).booleanValue() ? C(string, jSONArray, str) : D(string, jSONArray, str);
                    Long valueOf = Long.valueOf(C.getLong("lastId"));
                    if (valueOf.equals(-1L)) {
                        l6 = valueOf;
                        break;
                    }
                    j0Var2 = b(j0Var2, C);
                    i6++;
                    l6 = valueOf;
                }
                if (l6.equals(-1L)) {
                    throw new Exception("lastId equals -1");
                }
                if (bool.booleanValue()) {
                    e();
                }
                j0Var.put("changes", Integer.valueOf(this.f9694k.e(this.f9693j) - e6));
                j0Var.put("lastId", l6);
                j0Var.put("values", j0Var2.getJSONArray("values"));
                return j0Var;
            } catch (Exception e7) {
                throw new Exception(e7.getMessage());
            }
        } finally {
            if (this.f9693j != null && bool.booleanValue() && this.f9693j.C()) {
                G();
            }
        }
    }

    public j0 l(String str, Boolean bool) {
        x0.j jVar = new x0.j();
        j0 j0Var = new j0();
        jVar.l(this.f9685b.substring(0, r4.length() - 9));
        jVar.p(Integer.valueOf(this.f9692i));
        jVar.m(this.f9688e);
        jVar.n(str);
        try {
            if (this.f9697n.l(this, "sync_table")) {
                this.f9703t.o(this, Long.valueOf(new Date().getTime() / 1000));
            } else if (jVar.d().equals("partial")) {
                throw new Exception("No sync_table available");
            }
            x0.j a6 = this.f9703t.a(this, jVar);
            ArrayList c6 = a6.c();
            if (c6.contains("tables") && a6.f().size() > 0) {
                j0Var.m("database", a6.a());
                j0Var.put("version", a6.h());
                j0Var.put("encrypted", a6.b());
                j0Var.m("mode", a6.d());
                j0Var.put("tables", a6.g());
                if (c6.contains("views") && a6.i().size() > 0) {
                    j0Var.put("views", a6.j());
                }
            }
            if (!this.f9688e.booleanValue() || !this.f9689f.booleanValue() || !bool.booleanValue()) {
                return j0Var;
            }
            j0Var.put("encrypted", true);
            j0Var.put("overwrite", true);
            String b6 = x0.n.b(this.f9686c, j0Var);
            j0 j0Var2 = new j0();
            j0Var2.m("expData", b6);
            return j0Var2;
        } catch (Exception e6) {
            Log.e(f9683w, "Error: exportToJson " + e6.getMessage());
            throw new Exception(e6.getMessage());
        }
    }

    public String m(String str) {
        Matcher matcher = Pattern.compile("VALUES \\((\\?(?:,\\s*\\?\\s*)*)\\)").matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return "(" + matcher.group(1).replaceAll("\\s*,\\s*", ",") + ")";
    }

    public j0.b n() {
        return this.f9693j;
    }

    public Long q() {
        try {
            if (this.f9697n.l(this, "sync_table")) {
                return Long.valueOf(this.f9703t.h(this).longValue());
            }
            throw new Exception("No sync_table available");
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public g0 r() {
        g0 g0Var = new g0();
        try {
            List g6 = this.f9699p.g(this);
            for (int i6 = 0; i6 < g6.size(); i6++) {
                g0Var.put(g6.get(i6));
            }
            return g0Var;
        } catch (Exception e6) {
            throw new Exception("in getTableNames " + e6.getMessage());
        }
    }

    public String t() {
        return "file://" + this.f9691h.getAbsolutePath();
    }

    public Integer u() {
        if (!this.f9693j.k()) {
            throw new Exception("Database not opened");
        }
        try {
            return Integer.valueOf(this.f9693j.y());
        } catch (Exception e6) {
            String str = "Failed in database getVersion" + e6.getMessage();
            Log.v(f9683w, str);
            throw new Exception(str);
        }
    }

    public j0 v(x0.j jVar) {
        j0 j0Var = new j0();
        Integer num = 0;
        int intValue = num.intValue();
        try {
            this.f9693j.m(false);
            if (jVar.f().size() > 0 && (intValue = this.f9702s.d(this, jVar).intValue()) != -1) {
                intValue += this.f9702s.c(this, jVar).intValue();
            }
            if (jVar.i().size() > 0) {
                intValue += this.f9702s.k(this, jVar.i()).intValue();
            }
            this.f9693j.m(true);
            j0Var.put("changes", intValue);
            return j0Var;
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public boolean w() {
        return this.f9693j.C();
    }

    public boolean x() {
        return this.f9693j.C();
    }

    public Boolean y() {
        return this.f9704u;
    }

    public Boolean z() {
        return this.f9684a;
    }
}
