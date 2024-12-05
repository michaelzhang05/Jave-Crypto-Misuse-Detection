package com.getcapacitor.community.database.sqlite;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.u;
import androidx.security.crypto.a;
import androidx.security.crypto.c;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import com.getcapacitor.v0;
import java.io.File;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Objects;
import org.json.JSONObject;
import w0.j;
import w0.k;
import w0.l;
import w0.m;
import w0.o;
import w0.p;
import x0.n;

/* loaded from: classes.dex */
public class a {

    /* renamed from: v, reason: collision with root package name */
    private static final String f4300v = "com.getcapacitor.community.database.sqlite.a";

    /* renamed from: a, reason: collision with root package name */
    private final Context f4301a;

    /* renamed from: k, reason: collision with root package name */
    private p f4311k;

    /* renamed from: m, reason: collision with root package name */
    private androidx.security.crypto.c f4313m;

    /* renamed from: n, reason: collision with root package name */
    private u f4314n;

    /* renamed from: o, reason: collision with root package name */
    private final Boolean f4315o;

    /* renamed from: p, reason: collision with root package name */
    private final Boolean f4316p;

    /* renamed from: q, reason: collision with root package name */
    private final String f4317q;

    /* renamed from: r, reason: collision with root package name */
    private final String f4318r;

    /* renamed from: b, reason: collision with root package name */
    private final Dictionary f4302b = new Hashtable();

    /* renamed from: c, reason: collision with root package name */
    private final o f4303c = new o();

    /* renamed from: d, reason: collision with root package name */
    private final j f4304d = new j();

    /* renamed from: e, reason: collision with root package name */
    private final x0.o f4305e = new x0.o();

    /* renamed from: f, reason: collision with root package name */
    private final k f4306f = new k();

    /* renamed from: g, reason: collision with root package name */
    private final l f4307g = new l();

    /* renamed from: h, reason: collision with root package name */
    private final w0.h f4308h = new w0.h();

    /* renamed from: i, reason: collision with root package name */
    private final w0.d f4309i = new w0.d();

    /* renamed from: j, reason: collision with root package name */
    private final m f4310j = new m();

    /* renamed from: l, reason: collision with root package name */
    private SharedPreferences f4312l = null;

    /* renamed from: s, reason: collision with root package name */
    private final int f4319s = 5;

    /* renamed from: t, reason: collision with root package name */
    private final h f4320t = new h();

    /* renamed from: u, reason: collision with root package name */
    private v0 f4321u = this.f4321u;

    /* renamed from: u, reason: collision with root package name */
    private v0 f4321u = this.f4321u;

    /* renamed from: com.getcapacitor.community.database.sqlite.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0077a implements w0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f4322a;

        C0077a(Context context) {
            this.f4322a = context;
        }

        @Override // w0.a
        public void a(BiometricPrompt.b bVar) {
            a aVar;
            androidx.security.crypto.c a6;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.aliases().hasMoreElements()) {
                    aVar = a.this;
                    a6 = new c.b(this.f4322a).b(c.EnumC0065c.AES256_GCM).c(true, 5).a();
                } else {
                    aVar = a.this;
                    a6 = new c.b(this.f4322a).b(c.EnumC0065c.AES256_GCM).a();
                }
                aVar.f4313m = a6;
                a.this.d0();
                a.this.X(Boolean.TRUE, null);
            } catch (Exception e6) {
                String message = e6.getMessage();
                Log.e("MY_APP_TAG", message);
                a.this.X(Boolean.FALSE, message);
            }
        }

        @Override // w0.a
        public void b() {
            Log.e("MY_APP_TAG", "Error in authenticating biometric");
            a.this.X(Boolean.FALSE, "Error in authenticating biometric");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends HashMap {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f4324a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4325b;

        b(Boolean bool, String str) {
            this.f4324a = bool;
            this.f4325b = str;
            put("result", bool);
            put("message", str);
        }
    }

    /* loaded from: classes.dex */
    class c implements w0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4327a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v0 f4329c;

        c(String str, String str2, v0 v0Var) {
            this.f4327a = str;
            this.f4328b = str2;
            this.f4329c = v0Var;
        }

        @Override // w0.a
        public void a(BiometricPrompt.b bVar) {
            try {
                a.this.f4311k.a(this.f4327a, this.f4328b);
                a.this.f4320t.d(this.f4329c, null, null);
            } catch (Exception e6) {
                String message = e6.getMessage();
                Log.e("MY_APP_TAG", message);
                Toast.makeText(a.this.f4301a, message, 1).show();
                a.this.f4320t.d(this.f4329c, null, e6.getMessage());
            }
        }

        @Override // w0.a
        public void b() {
            Log.e("MY_APP_TAG", "Error in authenticating biometric");
            Toast.makeText(a.this.f4301a, "Error in authenticating biometric", 1).show();
            a.this.f4320t.d(this.f4329c, null, "Error in authenticating biometric");
        }
    }

    public a(Context context, w0.e eVar) {
        this.f4301a = context;
        Boolean valueOf = Boolean.valueOf(eVar.d());
        this.f4315o = valueOf;
        Boolean valueOf2 = Boolean.valueOf(eVar.a());
        this.f4316p = valueOf2;
        String c6 = eVar.c();
        this.f4317q = c6;
        String b6 = eVar.b();
        this.f4318r = b6;
        try {
            if (valueOf.booleanValue()) {
                if (valueOf2.booleanValue()) {
                    this.f4314n = u.g(context);
                    w0.f fVar = new w0.f(context, this.f4314n, new C0077a(context));
                    if (fVar.c()) {
                        fVar.e(c6, b6);
                        return;
                    }
                    this.f4313m = new c.b(context).b(c.EnumC0065c.AES256_GCM).a();
                } else {
                    this.f4313m = new c.b(context).b(c.EnumC0065c.AES256_GCM).a();
                }
                d0();
            }
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    private String E(String str) {
        return (str.contains("/") || !str.endsWith(".db")) ? str : str.substring(0, str.length() - 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(Boolean bool, String str) {
        b bVar = new b(bool, str);
        Log.v(f4300v, "$$$$$ in notifyBiometricEvent " + bVar);
        g.b().c("biometricResults", bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        try {
            this.f4312l = androidx.security.crypto.a.a(this.f4301a, "sqlite_encrypted_shared_prefs", this.f4313m, a.d.AES256_SIV, a.e.AES256_GCM);
            this.f4311k = new p(this.f4301a, this.f4312l);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    private void o() {
        try {
            Enumeration keys = this.f4302b.keys();
            while (keys.hasMoreElements()) {
                String str = (String) keys.nextElement();
                p(str.substring(3), Boolean.valueOf(str.startsWith("RO_")));
            }
        } catch (Exception e6) {
            throw new Exception("close all connections " + e6.getMessage());
        }
    }

    public j0 A(String str, String str2, Boolean bool, Boolean bool2) {
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (bool2.booleanValue()) {
            throw new Exception("not allowed in read-only mode");
        }
        if (!cVar.y().booleanValue() && cVar.z().booleanValue()) {
            try {
                return cVar.j(this.f4303c.h(str2), bool);
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        throw new Exception("database " + E + " not opened");
    }

    public j0 B(String str, g0 g0Var, Boolean bool, Boolean bool2, String str2) {
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (bool2.booleanValue()) {
            throw new Exception("not allowed in read-only mode");
        }
        if (!cVar.y().booleanValue() && cVar.z().booleanValue()) {
            try {
                return cVar.k(g0Var, bool, str2);
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        throw new Exception("database " + E + " not opened");
    }

    public j0 C(String str, String str2, Boolean bool, Boolean bool2) {
        StringBuilder sb;
        String str3;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str3 = "RO_";
        } else {
            sb = new StringBuilder();
            str3 = "RW_";
        }
        sb.append(str3);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        try {
            if (!cVar.z().booleanValue()) {
                throw new Exception("ExportToJson: db not opened");
            }
            j0 l6 = cVar.l(str2, bool2);
            if (l6.length() == 0) {
                throw new Exception("ExportToJson: : return Object is empty No data to synchronize");
            }
            if ((l6.length() != 1 || !l6.has("expData")) && l6.length() != 5 && l6.length() != 6 && l6.length() != 7) {
                throw new Exception("ExportToJson: return Obj is not a JsonSQLite Obj");
            }
            return l6;
        } catch (Exception e6) {
            throw new Exception("ExportToJson " + e6.getMessage());
        }
    }

    public g0 D() {
        String[] n6 = this.f4304d.n(this.f4301a);
        g0 g0Var = new g0();
        for (String str : n6) {
            if (str.contains("SQLite")) {
                g0Var.put(str);
            }
        }
        if (g0Var.length() > 0) {
            return g0Var;
        }
        throw new Exception("No databases available ");
    }

    public void F(String str) {
        try {
            this.f4308h.a(this.f4301a, str);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public g0 G(String str) {
        String[] d6 = this.f4306f.d(this.f4301a, str);
        g0 g0Var = new g0();
        for (String str2 : d6) {
            if (!str2.contains("SQLite")) {
                g0Var.put(str2);
            }
        }
        if (g0Var.length() > 0) {
            return g0Var;
        }
        throw new Exception("No databases available ");
    }

    public String H(String str, String str2) {
        try {
            return this.f4307g.a(this.f4301a, str, str2);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public Long I(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        try {
            if (cVar.z().booleanValue()) {
                return cVar.q();
            }
            throw new Exception("GetSyncDate: db not opened");
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public g0 J(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(str);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar == null) {
            throw new Exception("No available connection for database " + str);
        }
        if (cVar.z().booleanValue()) {
            return cVar.r();
        }
        throw new Exception("database " + str + " not opened");
    }

    public String K(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar != null) {
            try {
                return cVar.t();
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        throw new Exception("No available connection for database " + E);
    }

    public Integer L(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar != null) {
            try {
                return cVar.u();
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        throw new Exception("No available connection for database " + E);
    }

    public j0 M(String str) {
        try {
            j0 j0Var = new j0(str);
            if (j0Var.has("expData")) {
                j0Var = n.a(this.f4301a, j0Var.getString("expData"));
            }
            x0.j jVar = new x0.j();
            if (!jVar.k(j0Var, this.f4315o)) {
                throw new Exception("Stringify Json Object not Valid");
            }
            String str2 = E(jVar.a()) + "SQLite.db";
            Integer h6 = jVar.h();
            String d6 = jVar.d();
            Boolean e6 = jVar.e();
            Boolean b6 = jVar.b();
            w0.c cVar = new w0.c(this.f4301a, str2, b6, b6.booleanValue() ? "secret" : "no-encryption", h6.intValue(), this.f4315o, new Hashtable(), this.f4312l, Boolean.FALSE);
            if (e6.booleanValue() && d6.equals("full") && this.f4304d.o(this.f4301a, str2).booleanValue()) {
                this.f4304d.i(this.f4301a, str2);
            }
            cVar.E();
            if (!cVar.z().booleanValue()) {
                throw new Exception(str2 + "SQLite.db not opened");
            }
            g0 r5 = cVar.r();
            if (d6.equals("full") && r5.length() > 0) {
                Integer u5 = cVar.u();
                if (h6.intValue() < u5.intValue()) {
                    throw new Exception("ImportFromJson: Cannot import a version lower than" + u5);
                }
                if (u5.equals(h6)) {
                    j0 j0Var2 = new j0();
                    j0Var2.put("changes", 0);
                    return j0Var2;
                }
            }
            j0 v5 = cVar.v(jVar);
            cVar.d();
            if (Objects.equals(v5.d("changes"), -1)) {
                throw new Exception("importFromJson: import JsonObject not successful");
            }
            return v5;
        } catch (Exception e7) {
            throw new Exception("importFromJson : " + e7.getMessage());
        }
    }

    public Boolean N(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(E);
        if (((w0.c) this.f4302b.get(sb.toString())) == null) {
            throw new Exception("No available connection for database " + E);
        }
        return Boolean.valueOf(this.f4301a.getDatabasePath(E + "SQLite.db").exists());
    }

    public Boolean O(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar != null) {
            return cVar.z();
        }
        throw new Exception("No available connection for database " + E);
    }

    public Boolean P(String str) {
        String E = E(str);
        return this.f4304d.o(this.f4301a, E + "SQLite.db");
    }

    public Boolean Q(String str) {
        String E = E(str);
        File databasePath = this.f4301a.getDatabasePath(E + "SQLite.db");
        if (!this.f4304d.o(this.f4301a, E + "SQLite.db").booleanValue()) {
            throw new Exception("Database does not exist");
        }
        m.a d6 = this.f4310j.d(this.f4301a, databasePath, this.f4312l, this.f4309i);
        if (d6 == m.a.ENCRYPTED_GLOBAL_SECRET || d6 == m.a.ENCRYPTED_SECRET) {
            return Boolean.TRUE;
        }
        if (d6 == m.a.UNENCRYPTED) {
            return Boolean.FALSE;
        }
        throw new Exception("Database unknown");
    }

    public Boolean R(String str) {
        try {
            return Boolean.valueOf(new x0.j().k(new j0(str), this.f4315o));
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public Boolean S(String str) {
        return this.f4304d.q(str);
    }

    public Boolean T() {
        if (!this.f4315o.booleanValue()) {
            throw new Exception("No Encryption set in capacitor.config");
        }
        try {
            return Boolean.valueOf(p.e().length() > 0);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public Boolean U(String str, String str2, Boolean bool) {
        StringBuilder sb;
        String str3;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str3 = "RO_";
        } else {
            sb = new StringBuilder();
            str3 = "RW_";
        }
        sb.append(str3);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar != null) {
            return Boolean.valueOf(this.f4305e.l(cVar, str2));
        }
        throw new Exception("No available connection for database " + E);
    }

    public Boolean V(String str) {
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (!cVar.y().booleanValue() && cVar.z().booleanValue()) {
            try {
                return Boolean.valueOf(cVar.x());
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        throw new Exception("database " + E + " not opened");
    }

    public void W(String str, g0 g0Var) {
        try {
            this.f4306f.e(this.f4301a, str, this.f4303c.k(g0Var));
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void Y(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar != null) {
            try {
                cVar.E();
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        } else {
            throw new Exception("No available connection for database " + E);
        }
    }

    public g0 Z(String str, String str2, g0 g0Var, Boolean bool) {
        StringBuilder sb;
        String str3;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str3 = "RO_";
        } else {
            sb = new StringBuilder();
            str3 = "RW_";
        }
        sb.append(str3);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (!cVar.z().booleanValue()) {
            throw new Exception("database " + E + " not opened");
        }
        if (g0Var.length() > 0) {
            try {
                return cVar.I(str2, this.f4303c.i(g0Var));
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        try {
            return cVar.I(str2, new ArrayList());
        } catch (Exception e7) {
            throw new Exception(e7.getMessage());
        }
    }

    public j0 a0(String str) {
        j0 j0Var = new j0();
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (!cVar.y().booleanValue() && cVar.z().booleanValue()) {
            try {
                j0Var.put("changes", cVar.G());
                return j0Var;
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        throw new Exception("database " + E + " not opened");
    }

    public j0 b0(String str, String str2, g0 g0Var, Boolean bool, Boolean bool2, String str3) {
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (bool2.booleanValue()) {
            throw new Exception("not allowed in read-only mode");
        }
        if (cVar.y().booleanValue() || !cVar.z().booleanValue()) {
            throw new Exception("database " + E + " not opened");
        }
        if (g0Var.length() > 0) {
            try {
                return cVar.H(str2, this.f4303c.i(g0Var), bool, str3);
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        try {
            return cVar.H(str2, new ArrayList(), bool, str3);
        } catch (Exception e7) {
            throw new Exception(e7.getMessage());
        }
    }

    public void c0(String str) {
        if (!this.f4315o.booleanValue()) {
            throw new Exception("No Encryption set in capacitor.config");
        }
        try {
            o();
            this.f4311k.g(str);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void e0(String str, String str2, Boolean bool) {
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (bool.booleanValue()) {
            throw new Exception("not allowed in read-only mode");
        }
        try {
            if (!cVar.z().booleanValue()) {
                throw new Exception("SetSyncDate: db not opened");
            }
            cVar.J(str2);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void g(String str, g0 g0Var) {
        try {
            this.f4306f.a(this.f4301a, str, this.f4303c.k(g0Var));
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public Dictionary h(g0 g0Var) {
        Hashtable hashtable = new Hashtable();
        for (int i6 = 0; i6 < g0Var.length(); i6++) {
            try {
                JSONObject jSONObject = (JSONObject) g0Var.get(i6);
                if (jSONObject == null || !jSONObject.has("toVersion") || !jSONObject.has("statements")) {
                    throw new Exception("Must provide an upgrade statement {toVersion,statement}");
                }
                try {
                    hashtable.put(Integer.valueOf(jSONObject.getInt("toVersion")), jSONObject);
                } catch (Exception e6) {
                    throw new Exception("Must provide toVersion as Integer" + e6.getMessage());
                }
            } catch (Exception e7) {
                throw new Exception("Must provide an upgrade statement " + e7.getMessage());
            }
        }
        return hashtable;
    }

    public j0 i(String str) {
        j0 j0Var = new j0();
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (!cVar.y().booleanValue() && cVar.z().booleanValue()) {
            try {
                j0Var.put("changes", cVar.c());
                return j0Var;
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        throw new Exception("database " + E + " not opened");
    }

    public void j(v0 v0Var, String str, String str2) {
        this.f4321u = v0Var;
        if (!this.f4315o.booleanValue()) {
            throw new Exception("No Encryption set in capacitor.config");
        }
        try {
            o();
            if (!this.f4316p.booleanValue()) {
                this.f4311k.a(str, str2);
                return;
            }
            w0.f fVar = new w0.f(this.f4301a, this.f4314n, new c(str, str2, v0Var));
            if (!fVar.c()) {
                throw new Exception("Biometric features are currently unavailable.");
            }
            fVar.e(this.f4317q, this.f4318r);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public Boolean k(g0 g0Var, g0 g0Var2) {
        HashSet<String> hashSet = new HashSet(Collections.list(this.f4302b.keys()));
        g0 g0Var3 = new g0();
        for (int i6 = 0; i6 < g0Var.length(); i6++) {
            g0Var3.put(g0Var2.getString(i6) + "_" + g0Var.getString(i6));
        }
        HashSet hashSet2 = new HashSet(this.f4303c.k(g0Var3));
        try {
            if (hashSet2.size() == 0) {
                o();
                return Boolean.FALSE;
            }
            if (hashSet.size() < hashSet2.size()) {
                o();
                return Boolean.FALSE;
            }
            if (hashSet.size() > hashSet2.size()) {
                for (String str : hashSet) {
                    if (!hashSet2.contains(str)) {
                        this.f4302b.remove(str);
                    }
                }
            }
            HashSet hashSet3 = new HashSet(Collections.list(this.f4302b.keys()));
            if (hashSet3.size() != hashSet2.size()) {
                o();
                return Boolean.FALSE;
            }
            HashSet hashSet4 = new HashSet(hashSet3);
            hashSet4.addAll(hashSet2);
            HashSet hashSet5 = new HashSet(hashSet3);
            hashSet5.retainAll(hashSet2);
            hashSet4.removeAll(hashSet5);
            if (hashSet4.size() == 0) {
                return Boolean.TRUE;
            }
            o();
            return Boolean.FALSE;
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public Boolean l(String str) {
        if (!this.f4315o.booleanValue()) {
            throw new Exception("No Encryption set in capacitor.config");
        }
        try {
            o();
            return this.f4311k.b(str);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void m() {
        if (!this.f4315o.booleanValue()) {
            throw new Exception("No Encryption set in capacitor.config");
        }
        try {
            o();
            this.f4311k.c();
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void n(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(E);
        w0.c cVar = (w0.c) this.f4302b.get(sb.toString());
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (!cVar.z().booleanValue()) {
            throw new Exception("database " + E + " not opened");
        }
        if (!cVar.w()) {
            try {
                cVar.d();
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        } else {
            throw new Exception("database " + E + " failed to close still in transaction");
        }
    }

    public void p(String str, Boolean bool) {
        StringBuilder sb;
        String str2;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str2 = "RO_";
        } else {
            sb = new StringBuilder();
            str2 = "RW_";
        }
        sb.append(str2);
        sb.append(E);
        String sb2 = sb.toString();
        w0.c cVar = (w0.c) this.f4302b.get(sb2);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (cVar.z().booleanValue()) {
            try {
                cVar.d();
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        this.f4302b.remove(sb2);
    }

    public void q(String str) {
        String str2 = "RO_" + str;
        w0.c cVar = (w0.c) this.f4302b.get(str2);
        if (cVar == null) {
            throw new Exception("No available connection for database " + str);
        }
        if (cVar.z().booleanValue()) {
            try {
                cVar.d();
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        this.f4302b.remove(str2);
    }

    public j0 r(String str) {
        j0 j0Var = new j0();
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (!cVar.y().booleanValue() && cVar.z().booleanValue()) {
            try {
                j0Var.put("changes", cVar.e());
                return j0Var;
            } catch (Exception e6) {
                throw new Exception(e6.getMessage());
            }
        }
        throw new Exception("database " + E + " not opened");
    }

    public void s(Boolean bool) {
        try {
            this.f4304d.e(this.f4301a, bool);
        } catch (Exception e6) {
            throw new Exception("copy failed : " + e6.getMessage());
        }
    }

    public void t(String str, boolean z5, String str2, int i6, Dictionary dictionary, Boolean bool) {
        StringBuilder sb;
        String str3;
        String E = E(str);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            str3 = "RO_";
        } else {
            sb = new StringBuilder();
            str3 = "RW_";
        }
        sb.append(str3);
        sb.append(E);
        String sb2 = sb.toString();
        if (((w0.c) this.f4302b.get(sb2)) != null) {
            throw new Exception("Connection " + E + " already exists");
        }
        if (z5 && !this.f4315o.booleanValue()) {
            throw new Exception("Database cannot be encrypted as 'No Encryption' set in capacitor.config");
        }
        try {
            this.f4302b.put(sb2, new w0.c(this.f4301a, E + "SQLite.db", Boolean.valueOf(z5), str2, i6, this.f4315o, dictionary, this.f4312l, bool));
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void u(String str, int i6) {
        String str2 = "RO_" + str;
        if (((w0.c) this.f4302b.get(str2)) != null) {
            throw new Exception("Connection " + str + " already exists");
        }
        try {
            if (this.f4304d.q(str).booleanValue()) {
                this.f4302b.put(str2, new w0.c(this.f4301a, str, Boolean.FALSE, "no-encryption", i6, this.f4315o, new Hashtable(), this.f4312l, Boolean.TRUE));
            } else {
                throw new Exception("Database " + str + " does not exist");
            }
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public j0 v(String str, Boolean bool) {
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (bool.booleanValue()) {
            throw new Exception("not allowed in read-only mode");
        }
        try {
            if (cVar.z().booleanValue()) {
                return cVar.f();
            }
            throw new Exception("CreateSyncTable: db not opened");
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void w(String str, Boolean bool) {
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (bool.booleanValue()) {
            throw new Exception("not allowed in read-only mode");
        }
        try {
            cVar.g(E + "SQLite.db");
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public void x(String str, Boolean bool) {
        String E = E(str);
        w0.c cVar = (w0.c) this.f4302b.get("RW_" + E);
        if (cVar == null) {
            throw new Exception("No available connection for database " + E);
        }
        if (bool.booleanValue()) {
            throw new Exception("not allowed in read-only mode");
        }
        try {
            if (!cVar.z().booleanValue()) {
                throw new Exception("deleteExportedRows: db not opened");
            }
            cVar.h();
        } catch (Exception e6) {
            throw new Exception("DeleteExportedRows " + e6.getMessage());
        }
    }

    public void y(String str, g0 g0Var) {
        try {
            this.f4306f.b(this.f4301a, str, this.f4303c.k(g0Var));
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public String z(String str) {
        return str;
    }
}
