package com.getcapacitor.community.database.sqlite;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.getcapacitor.a1;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import org.json.JSONArray;
import org.json.JSONObject;

@v0.b(name = "CapacitorSQLite")
/* loaded from: classes.dex */
public class CapacitorSQLitePlugin extends u0 {
    private static final String TAG = "com.getcapacitor.community.database.sqlite.CapacitorSQLitePlugin";
    private w0.e config;
    private com.getcapacitor.community.database.sqlite.a implementation;
    private final Dictionary<String, Dictionary<Integer, JSONObject>> versionUpgrades = new Hashtable();
    private final h rHandler = new h();
    private String passphrase = null;
    private String oldpassphrase = null;
    private String loadMessage = "";
    private final ArrayList<String> modeList = new ArrayList<>(Arrays.asList("no-encryption", "encryption", "secret", "decryption", "wrongsecret"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f {
        a() {
        }

        @Override // com.getcapacitor.community.database.sqlite.f, java.lang.Runnable
        public void run() {
            j0 j0Var = new j0();
            j0Var.put("progress", a().get("progress"));
            CapacitorSQLitePlugin.this.notifyListeners("sqliteImportProgressEvent", j0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f {
        b() {
        }

        @Override // com.getcapacitor.community.database.sqlite.f, java.lang.Runnable
        public void run() {
            j0 j0Var = new j0();
            j0Var.put("progress", a().get("progress"));
            CapacitorSQLitePlugin.this.notifyListeners("sqliteExportProgressEvent", j0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends f {
        c() {
        }

        @Override // com.getcapacitor.community.database.sqlite.f, java.lang.Runnable
        public void run() {
            j0 j0Var = new j0();
            j0Var.put("result", a().get("result"));
            j0Var.put("message", a().get("message"));
            CapacitorSQLitePlugin.this.notifyListeners("sqliteBiometricEvent", j0Var);
        }
    }

    private void AddObserversToNotificationCenter() {
        g.b().a("importJsonProgress", new a());
        g.b().a("exportJsonProgress", new b());
        g.b().a("biometricResults", new c());
    }

    private w0.e getSqliteConfig() {
        w0.e eVar = new w0.e();
        JSONObject d6 = getConfig().d();
        boolean z5 = d6.has("androidIsEncryption") ? d6.getBoolean("androidIsEncryption") : eVar.d();
        eVar.h(z5);
        JSONObject jSONObject = d6.has("androidBiometric") ? d6.getJSONObject("androidBiometric") : null;
        if (jSONObject != null) {
            eVar.e((jSONObject.has("biometricAuth") && z5) ? jSONObject.getBoolean("biometricAuth") : eVar.a());
            eVar.g(jSONObject.has("biometricTitle") ? jSONObject.getString("biometricTitle") : eVar.c());
            eVar.f(jSONObject.has("biometricSubTitle") ? jSONObject.getString("biometricSubTitle") : eVar.b());
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeEncryptionSecret$0(v0 v0Var) {
        try {
            this.implementation.j(v0Var, this.passphrase, this.oldpassphrase);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "ChangeEncryptionSecret: " + e6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getFromHTTPRequest$1(v0 v0Var) {
        this.rHandler.d(v0Var, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getFromHTTPRequest$2(Exception exc, v0 v0Var) {
        this.rHandler.d(v0Var, null, "GetFromHTTPRequest: " + exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getFromHTTPRequest$3(String str, final v0 v0Var) {
        Process.setThreadPriority(10);
        try {
            this.implementation.F(str);
            getActivity().runOnUiThread(new Runnable() { // from class: com.getcapacitor.community.database.sqlite.b
                @Override // java.lang.Runnable
                public final void run() {
                    CapacitorSQLitePlugin.this.lambda$getFromHTTPRequest$1(v0Var);
                }
            });
        } catch (Exception e6) {
            getActivity().runOnUiThread(new Runnable() { // from class: com.getcapacitor.community.database.sqlite.c
                @Override // java.lang.Runnable
                public final void run() {
                    CapacitorSQLitePlugin.this.lambda$getFromHTTPRequest$2(e6, v0Var);
                }
            });
        }
    }

    @a1
    public void addSQLiteSuffix(v0 v0Var) {
        String n6 = !v0Var.h().has("folderPath") ? "default" : v0Var.n("folderPath");
        g0 c6 = !v0Var.h().has("dbNameList") ? null : v0Var.c("dbNameList");
        if (c6 == null) {
            this.rHandler.d(v0Var, null, "AddSQLiteSuffix: dbNameList not given or empty");
            return;
        }
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.g(n6, c6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "addSQLiteSuffix: " + e6.getMessage());
        }
    }

    @a1
    public void addUpgradeStatement(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "AddUpgradeStatement: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        if (!v0Var.h().has("upgrade")) {
            this.rHandler.d(v0Var, null, "AddUpgradeStatement: Must provide an array with upgrade statement");
            return;
        }
        g0 c6 = v0Var.c("upgrade");
        if (c6 == null) {
            this.rHandler.d(v0Var, null, "AddUpgradeStatement: Must provide an array with upgrade statement");
            return;
        }
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            Dictionary<Integer, JSONObject> h6 = aVar.h(c6);
            if (this.versionUpgrades.get(n6) != null) {
                for (Integer num : Collections.list(h6.keys())) {
                    this.versionUpgrades.get(n6).put(num, h6.get(num));
                }
            } else {
                this.versionUpgrades.put(n6, h6);
            }
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "AddUpgradeStatement: " + e6.getMessage());
        }
    }

    @a1
    public void beginTransaction(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("changes", -1);
        if (!v0Var.h().has("database")) {
            this.rHandler.a(v0Var, j0Var, "BeginTransaction: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.a(v0Var, j0Var, this.loadMessage);
            return;
        }
        try {
            this.rHandler.a(v0Var, aVar.i(n6), null);
        } catch (Exception e6) {
            this.rHandler.a(v0Var, j0Var, "BeginTransaction: " + e6.getMessage());
        }
    }

    @a1
    public void changeEncryptionSecret(final v0 v0Var) {
        String str;
        if (v0Var.h().has("passphrase")) {
            this.passphrase = v0Var.n("passphrase");
            if (v0Var.h().has("oldpassphrase")) {
                this.oldpassphrase = v0Var.n("oldpassphrase");
                if (this.implementation != null) {
                    getActivity().runOnUiThread(new Runnable() { // from class: com.getcapacitor.community.database.sqlite.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            CapacitorSQLitePlugin.this.lambda$changeEncryptionSecret$0(v0Var);
                        }
                    });
                    return;
                } else {
                    this.rHandler.d(v0Var, null, this.loadMessage);
                    return;
                }
            }
            str = "SetEncryptionSecret: Must provide a oldpassphrase";
        } else {
            str = "SetEncryptionSecret: Must provide a passphrase";
        }
        this.rHandler.d(v0Var, null, str);
    }

    @a1
    public void checkConnectionsConsistency(v0 v0Var) {
        String str;
        if (v0Var.h().has("dbNames")) {
            g0 c6 = v0Var.c("dbNames");
            if (v0Var.h().has("openModes")) {
                g0 c7 = v0Var.c("openModes");
                if (c6 != null && c7 != null) {
                    com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
                    if (aVar == null) {
                        this.rHandler.d(v0Var, null, this.loadMessage);
                        return;
                    }
                    try {
                        this.rHandler.d(v0Var, aVar.k(c6, c7), null);
                        return;
                    } catch (Exception e6) {
                        this.rHandler.d(v0Var, null, "CheckConnectionsConsistency: " + e6.getMessage());
                        return;
                    }
                }
                str = "CheckConnectionsConsistency: No dbNames or openModes given";
            } else {
                str = "CheckConnectionsConsistency: Must provide a openModes Array";
            }
        } else {
            str = "CheckConnectionsConsistency: Must provide a connection Array";
        }
        this.rHandler.d(v0Var, null, str);
    }

    @a1
    public void checkEncryptionSecret(v0 v0Var) {
        if (!v0Var.h().has("passphrase")) {
            this.rHandler.d(v0Var, null, "checkEncryptionSecret: Must provide a passphrase");
            return;
        }
        String n6 = v0Var.n("passphrase");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.l(n6), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "CheckEncryptionSecret: " + e6.getMessage());
        }
    }

    @a1
    public void clearEncryptionSecret(v0 v0Var) {
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.m();
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "ClearEncryptionSecret: " + e6.getMessage());
        }
    }

    @a1
    public void close(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "Close: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.n(n6, f6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "Close: " + e6.getMessage());
        }
    }

    @a1
    public void closeConnection(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "CloseConnection: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.p(n6, f6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "CloseConnection: " + e6.getMessage());
        }
    }

    @a1
    public void closeNCConnection(v0 v0Var) {
        if (!v0Var.h().has("databasePath")) {
            this.rHandler.d(v0Var, null, "CloseNCConnection: Must provide a database path");
            return;
        }
        String n6 = v0Var.n("databasePath");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.q(n6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "CloseNCConnection: " + e6.getMessage());
        }
    }

    @a1
    public void commitTransaction(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("changes", -1);
        if (!v0Var.h().has("database")) {
            this.rHandler.a(v0Var, j0Var, "CommitTransaction: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.a(v0Var, j0Var, this.loadMessage);
            return;
        }
        try {
            this.rHandler.a(v0Var, aVar.r(n6), null);
        } catch (Exception e6) {
            this.rHandler.a(v0Var, j0Var, "CommitTransaction: " + e6.getMessage());
        }
    }

    @a1
    public void copyFromAssets(v0 v0Var) {
        Boolean valueOf = Boolean.valueOf(v0Var.h().has("overwrite") ? v0Var.e("overwrite").booleanValue() : true);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.s(valueOf);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "CopyFromAssets: " + e6.getMessage());
        }
    }

    @a1
    public void createConnection(v0 v0Var) {
        String str;
        String str2;
        if (v0Var.h().has("database")) {
            String n6 = v0Var.n("database");
            int intValue = v0Var.j("version", 1).intValue();
            Boolean bool = Boolean.FALSE;
            Boolean f6 = v0Var.f("encrypted", bool);
            if (f6.booleanValue()) {
                String o6 = v0Var.o("mode", "no-encryption");
                if (this.modeList.contains(o6)) {
                    str = o6;
                } else {
                    str2 = "CreateConnection: inMode must be in ['encryption','secret', 'decryption'] ";
                }
            } else {
                str = "no-encryption";
            }
            boolean booleanValue = v0Var.f("readonly", bool).booleanValue();
            Dictionary<Integer, JSONObject> dictionary = this.versionUpgrades.get(n6);
            com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
            if (aVar == null) {
                this.rHandler.d(v0Var, null, this.loadMessage);
                return;
            }
            try {
                aVar.t(n6, f6.booleanValue(), str, intValue, dictionary, Boolean.valueOf(booleanValue));
                this.rHandler.d(v0Var, null, null);
                return;
            } catch (Exception e6) {
                this.rHandler.d(v0Var, null, "CreateConnection: " + e6.getMessage());
                return;
            }
        }
        str2 = "CreateConnection: Must provide a database name";
        this.rHandler.d(v0Var, null, str2);
    }

    @a1
    public void createNCConnection(v0 v0Var) {
        if (!v0Var.h().has("databasePath")) {
            this.rHandler.d(v0Var, null, "CreateNCConnection: Must provide a database path");
            return;
        }
        if (this.implementation == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.implementation.u(v0Var.n("databasePath"), v0Var.j("version", 1).intValue());
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "CreateNCConnection: " + e6.getMessage());
        }
    }

    @a1
    public void createSyncTable(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("changes", -1);
        if (!v0Var.h().has("database")) {
            this.rHandler.a(v0Var, j0Var, "CreateSyncTable: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.a(v0Var, j0Var, this.loadMessage);
            return;
        }
        try {
            this.rHandler.a(v0Var, aVar.v(n6, f6), null);
        } catch (Exception e6) {
            this.rHandler.a(v0Var, j0Var, "CreateSyncTable: " + e6.getMessage());
        }
    }

    @a1
    public void deleteDatabase(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "deleteDatabase: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.w(n6, f6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "deleteDatabase: " + e6.getMessage());
        }
    }

    @a1
    public void deleteExportedRows(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "DeleteExportedRows: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.x(n6, f6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "DeleteExportedRows: " + e6.getMessage());
        }
    }

    @a1
    public void deleteOldDatabases(v0 v0Var) {
        String n6 = !v0Var.h().has("folderPath") ? "default" : v0Var.n("folderPath");
        g0 c6 = !v0Var.h().has("dbNameList") ? null : v0Var.c("dbNameList");
        if (c6 == null) {
            this.rHandler.d(v0Var, null, "deleteOldDatabases: dbNameList not given or empty");
            return;
        }
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.y(n6, c6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "deleteOldDatabases: " + e6.getMessage());
        }
    }

    @a1
    public void echo(v0 v0Var) {
        String message;
        String n6 = v0Var.n("value");
        if (this.implementation != null) {
            try {
                j0 j0Var = new j0();
                j0Var.m("value", this.implementation.z(n6));
                v0Var.x(j0Var);
                return;
            } catch (Exception e6) {
                message = e6.getMessage();
            }
        } else {
            message = this.loadMessage;
        }
        v0Var.r(message);
    }

    @a1
    public void execute(v0 v0Var) {
        String str;
        j0 j0Var = new j0();
        j0Var.put("changes", -1);
        if (v0Var.h().has("database")) {
            String n6 = v0Var.n("database");
            if (v0Var.h().has("statements")) {
                String n7 = v0Var.n("statements");
                Boolean f6 = v0Var.f("transaction", Boolean.TRUE);
                Boolean f7 = v0Var.f("readonly", Boolean.FALSE);
                com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
                if (aVar == null) {
                    this.rHandler.a(v0Var, j0Var, this.loadMessage);
                    return;
                }
                try {
                    this.rHandler.a(v0Var, aVar.A(n6, n7, f6, f7), null);
                    return;
                } catch (Exception e6) {
                    this.rHandler.a(v0Var, j0Var, "Execute: " + e6.getMessage());
                    return;
                }
            }
            str = "Execute: Must provide raw SQL statements";
        } else {
            str = "Execute: Must provide a database name";
        }
        this.rHandler.a(v0Var, j0Var, str);
    }

    @a1
    public void executeSet(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("changes", -1);
        if (!v0Var.h().has("database")) {
            this.rHandler.a(v0Var, j0Var, "ExecuteSet: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        if (!v0Var.h().has("set")) {
            this.rHandler.a(v0Var, j0Var, "ExecuteSet: Must provide a set of SQL statements");
            return;
        }
        g0 c6 = v0Var.c("set");
        if (c6 == null) {
            this.rHandler.a(v0Var, j0Var, "ExecuteSet: Must provide a set of SQL statements");
            return;
        }
        if (c6.length() == 0) {
            this.rHandler.a(v0Var, j0Var, "ExecuteSet: Must provide a non-empty set of SQL statements");
            return;
        }
        for (int i6 = 0; i6 < c6.length(); i6++) {
            JSONArray names = c6.getJSONObject(i6).names();
            for (int i7 = 0; i7 < names.length(); i7++) {
                String string = names.getString(i7);
                if (!string.equals("statement") && !string.equals("values")) {
                    this.rHandler.a(v0Var, j0Var, "ExecuteSet: Must provide a set as Array of {statement,values}");
                    return;
                }
            }
        }
        Boolean f6 = v0Var.f("transaction", Boolean.TRUE);
        Boolean f7 = v0Var.f("readonly", Boolean.FALSE);
        String o6 = v0Var.o("returnMode", "no");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.a(v0Var, j0Var, this.loadMessage);
            return;
        }
        try {
            this.rHandler.a(v0Var, aVar.B(n6, c6, f6, f7, o6), null);
        } catch (Exception e6) {
            this.rHandler.a(v0Var, j0Var, "ExecuteSet: " + e6.getMessage());
        }
    }

    @a1
    public void exportToJson(v0 v0Var) {
        String str;
        j0 j0Var = new j0();
        if (v0Var.h().has("database")) {
            String n6 = v0Var.n("database");
            if (v0Var.h().has("jsonexportmode")) {
                String n7 = v0Var.n("jsonexportmode");
                if (n7.equals("full") || n7.equals("partial")) {
                    Boolean bool = Boolean.FALSE;
                    Boolean f6 = v0Var.f("readonly", bool);
                    Boolean f7 = v0Var.f("encrypted", bool);
                    com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
                    if (aVar == null) {
                        this.rHandler.b(v0Var, j0Var, this.loadMessage);
                        return;
                    }
                    try {
                        this.rHandler.b(v0Var, aVar.C(n6, n7, f6, f7), null);
                        return;
                    } catch (Exception e6) {
                        this.rHandler.b(v0Var, j0Var, "ExportToJson: " + e6.getMessage());
                        return;
                    }
                }
                str = "ExportToJson: Json export mode should be 'full' or 'partial'";
            } else {
                str = "ExportToJson: Must provide an export mode";
            }
        } else {
            str = "ExportToJson: Must provide a database name";
        }
        this.rHandler.b(v0Var, j0Var, str);
    }

    @a1
    public void getDatabaseList(v0 v0Var) {
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.g(v0Var, new g0(), this.loadMessage);
            return;
        }
        try {
            this.rHandler.g(v0Var, aVar.D(), null);
        } catch (Exception e6) {
            this.rHandler.g(v0Var, new g0(), "getDatabaseList: " + e6.getMessage());
        }
    }

    @a1
    public void getFromHTTPRequest(final v0 v0Var) {
        if (!v0Var.h().has("url")) {
            this.rHandler.d(v0Var, null, "GetFromHTTPRequest: Must provide a database url");
            return;
        }
        final String n6 = v0Var.n("url");
        if (this.implementation == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.getcapacitor.community.database.sqlite.e
            @Override // java.lang.Runnable
            public final void run() {
                CapacitorSQLitePlugin.this.lambda$getFromHTTPRequest$3(n6, v0Var);
            }
        });
        thread.start();
        do {
        } while (thread.isAlive());
        System.out.println("Thread Exiting!");
    }

    @a1
    public void getMigratableDbList(v0 v0Var) {
        String n6 = !v0Var.h().has("folderPath") ? "default" : v0Var.n("folderPath");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.g(v0Var, new g0(), this.loadMessage);
            return;
        }
        try {
            this.rHandler.g(v0Var, aVar.G(n6), null);
        } catch (Exception e6) {
            this.rHandler.g(v0Var, new g0(), "getMigratableDbList: " + e6.getMessage());
        }
    }

    @a1
    public void getNCDatabasePath(v0 v0Var) {
        String str;
        if (v0Var.h().has("path")) {
            String n6 = v0Var.n("path");
            if (v0Var.h().has("database")) {
                String n7 = v0Var.n("database");
                com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
                if (aVar == null) {
                    this.rHandler.d(v0Var, null, this.loadMessage);
                    return;
                }
                try {
                    this.rHandler.c(v0Var, aVar.H(n6, n7), null);
                    return;
                } catch (Exception e6) {
                    this.rHandler.d(v0Var, null, "getNCDatabasePath: " + e6.getMessage());
                    return;
                }
            }
            str = "getNCDatabasePath: Must provide a database name";
        } else {
            str = "getNCDatabasePath: Must provide a folder path";
        }
        this.rHandler.c(v0Var, null, str);
    }

    @a1
    public void getSyncDate(v0 v0Var) {
        j0 j0Var = new j0();
        if (!v0Var.h().has("database")) {
            j0Var.put("changes", -1);
            this.rHandler.e(v0Var, 0L, "GetSyncDate : Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.e(v0Var, 0L, this.loadMessage);
            return;
        }
        try {
            this.rHandler.e(v0Var, Long.valueOf(aVar.I(n6, f6).longValue()), null);
        } catch (Exception e6) {
            this.rHandler.e(v0Var, 0L, "GetSyncDate: " + e6.getMessage());
        }
    }

    @a1
    public void getTableList(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.g(v0Var, new g0(), "getTableList: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.g(v0Var, new g0(), this.loadMessage);
            return;
        }
        try {
            this.rHandler.g(v0Var, aVar.J(n6, f6), null);
        } catch (Exception e6) {
            this.rHandler.g(v0Var, new g0(), "GetTableList: " + e6.getMessage());
        }
    }

    @a1
    public void getUrl(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.f(v0Var, null, "GetUrl: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.f(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.f(v0Var, aVar.K(n6, f6), null);
        } catch (Exception e6) {
            this.rHandler.f(v0Var, null, "GetUrl: " + e6.getMessage());
        }
    }

    @a1
    public void getVersion(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.h(v0Var, null, "GetVersion: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.h(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.h(v0Var, aVar.L(n6, f6), null);
        } catch (Exception e6) {
            this.rHandler.h(v0Var, null, "GetVersion: " + e6.getMessage());
        }
    }

    @a1
    public void importFromJson(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("changes", -1);
        if (!v0Var.h().has("jsonstring")) {
            this.rHandler.a(v0Var, j0Var, "ImportFromJson: Must provide a Stringify Json Object");
            return;
        }
        String n6 = v0Var.n("jsonstring");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.a(v0Var, j0Var, this.loadMessage);
            return;
        }
        try {
            this.rHandler.a(v0Var, aVar.M(n6), null);
        } catch (Exception e6) {
            this.rHandler.a(v0Var, j0Var, "ImportFromJson: " + e6.getMessage());
        }
    }

    @a1
    public void isDBExists(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, Boolean.FALSE, "isDBExists: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.N(n6, f6), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, Boolean.FALSE, "isDBExists: " + e6.getMessage());
        }
    }

    @a1
    public void isDBOpen(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, Boolean.FALSE, "isDBOpen: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.O(n6, f6), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, Boolean.FALSE, "isDBOpen: " + e6.getMessage());
        }
    }

    @a1
    public void isDatabase(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.P(n6), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "isDatabase: " + e6.getMessage());
        }
    }

    @a1
    public void isDatabaseEncrypted(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.Q(n6), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "isDatabaseEncrypted: " + e6.getMessage());
        }
    }

    @a1
    public void isInConfigBiometricAuth(v0 v0Var) {
        this.rHandler.d(v0Var, Boolean.valueOf(this.config.a()), null);
    }

    @a1
    public void isInConfigEncryption(v0 v0Var) {
        this.rHandler.d(v0Var, Boolean.valueOf(this.config.d()), null);
    }

    @a1
    public void isJsonValid(v0 v0Var) {
        if (!v0Var.h().has("jsonstring")) {
            this.rHandler.d(v0Var, Boolean.FALSE, "IsJsonValid: Must provide a Stringify Json Object");
            return;
        }
        String n6 = v0Var.n("jsonstring");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.R(n6), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, Boolean.FALSE, "IsJsonValid: " + e6.getMessage());
        }
    }

    @a1
    public void isNCDatabase(v0 v0Var) {
        if (!v0Var.h().has("databasePath")) {
            this.rHandler.d(v0Var, null, "Must provide a database path");
            return;
        }
        String n6 = v0Var.n("databasePath");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.S(n6), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "isNCDatabase: " + e6.getMessage());
        }
    }

    @a1
    public void isSecretStored(v0 v0Var) {
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.T(), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "IsSecretStored: " + e6.getMessage());
        }
    }

    @a1
    public void isTableExists(v0 v0Var) {
        h hVar;
        String str;
        if (v0Var.h().has("database")) {
            String n6 = v0Var.n("database");
            if (v0Var.h().has("table")) {
                String n7 = v0Var.n("table");
                Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
                com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
                if (aVar == null) {
                    this.rHandler.d(v0Var, null, this.loadMessage);
                    return;
                }
                try {
                    this.rHandler.d(v0Var, aVar.U(n6, n7, f6), null);
                    return;
                } catch (Exception e6) {
                    this.rHandler.d(v0Var, null, "isTableExists: " + e6.getMessage());
                    return;
                }
            }
            hVar = this.rHandler;
            str = "Must provide a table name";
        } else {
            hVar = this.rHandler;
            str = "Must provide a database name";
        }
        hVar.d(v0Var, null, str);
    }

    @a1
    public void isTransactionActive(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            this.rHandler.d(v0Var, aVar.V(n6), null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "IsTransactionActive: " + e6.getMessage());
        }
    }

    @Override // com.getcapacitor.u0
    public void load() {
        Context context = getContext();
        try {
            this.config = getSqliteConfig();
            AddObserversToNotificationCenter();
            this.implementation = new com.getcapacitor.community.database.sqlite.a(context, this.config);
        } catch (Exception e6) {
            this.implementation = null;
            String str = "CapacitorSQLitePlugin: " + e6.getMessage();
            this.loadMessage = str;
            Log.e(TAG, str);
        }
    }

    @a1
    public void moveDatabasesAndAddSuffix(v0 v0Var) {
        String n6 = !v0Var.h().has("folderPath") ? "default" : v0Var.n("folderPath");
        g0 c6 = !v0Var.h().has("dbNameList") ? null : v0Var.c("dbNameList");
        if (c6 == null) {
            this.rHandler.d(v0Var, null, "moveDatabasesAndAddSuffix: dbNameList not given or empty");
            return;
        }
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.W(n6, c6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "moveDatabasesAndAddSuffix: " + e6.getMessage());
        }
    }

    @a1
    public void open(v0 v0Var) {
        if (!v0Var.h().has("database")) {
            this.rHandler.d(v0Var, null, "Open: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.Y(n6, f6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "Open: " + e6.getMessage());
        }
    }

    @a1
    public void query(v0 v0Var) {
        h hVar;
        g0 g0Var;
        String str;
        if (v0Var.h().has("database")) {
            String n6 = v0Var.n("database");
            if (v0Var.h().has("statement")) {
                String n7 = v0Var.n("statement");
                if (v0Var.h().has("values")) {
                    g0 c6 = v0Var.c("values");
                    if (c6 != null) {
                        Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
                        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
                        if (aVar == null) {
                            this.rHandler.g(v0Var, new g0(), this.loadMessage);
                            return;
                        }
                        try {
                            this.rHandler.g(v0Var, aVar.Z(n6, n7, c6, f6), null);
                            return;
                        } catch (Exception e6) {
                            this.rHandler.g(v0Var, new g0(), "Query: " + e6.getMessage());
                            return;
                        }
                    }
                    hVar = this.rHandler;
                    g0Var = new g0();
                    str = "Query: Must provide an Array of values";
                } else {
                    hVar = this.rHandler;
                    g0Var = new g0();
                    str = "Query: Must provide an Array of Strings";
                }
            } else {
                hVar = this.rHandler;
                g0Var = new g0();
                str = "Query: Must provide a SQL statement";
            }
        } else {
            hVar = this.rHandler;
            g0Var = new g0();
            str = "Query: Must provide a database name";
        }
        hVar.g(v0Var, g0Var, str);
    }

    @a1
    public void rollbackTransaction(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("changes", -1);
        if (!v0Var.h().has("database")) {
            this.rHandler.a(v0Var, j0Var, "RollbackTransaction: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.a(v0Var, j0Var, this.loadMessage);
            return;
        }
        try {
            this.rHandler.a(v0Var, aVar.a0(n6), null);
        } catch (Exception e6) {
            this.rHandler.a(v0Var, j0Var, "RollbackTransaction: " + e6.getMessage());
        }
    }

    @a1
    public void run(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("changes", -1);
        if (!v0Var.h().has("database")) {
            this.rHandler.a(v0Var, j0Var, "Run: Must provide a database name");
            return;
        }
        String n6 = v0Var.n("database");
        if (!v0Var.h().has("statement")) {
            this.rHandler.a(v0Var, j0Var, "Run: Must provide a SQL statement");
            return;
        }
        String n7 = v0Var.n("statement");
        if (!v0Var.h().has("values")) {
            this.rHandler.a(v0Var, j0Var, "Run: Must provide an Array of values");
            return;
        }
        g0 c6 = v0Var.c("values");
        if (c6 == null) {
            this.rHandler.a(v0Var, j0Var, "Run: Must provide an Array of values");
            return;
        }
        Boolean f6 = v0Var.f("transaction", Boolean.TRUE);
        Boolean f7 = v0Var.f("readonly", Boolean.FALSE);
        String o6 = v0Var.o("returnMode", "no");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.a(v0Var, j0Var, this.loadMessage);
            return;
        }
        try {
            this.rHandler.a(v0Var, aVar.b0(n6, n7, c6, f6, f7, o6), null);
        } catch (Exception e6) {
            this.rHandler.a(v0Var, j0Var, "Run: " + e6.getMessage());
        }
    }

    @a1
    public void setEncryptionSecret(v0 v0Var) {
        if (!v0Var.h().has("passphrase")) {
            this.rHandler.d(v0Var, null, "SetEncryptionSecret: Must provide a passphrase");
            return;
        }
        String n6 = v0Var.n("passphrase");
        com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
        if (aVar == null) {
            this.rHandler.d(v0Var, null, this.loadMessage);
            return;
        }
        try {
            aVar.c0(n6);
            this.rHandler.d(v0Var, null, null);
        } catch (Exception e6) {
            this.rHandler.d(v0Var, null, "SetEncryptionSecret: " + e6.getMessage());
        }
    }

    @a1
    public void setSyncDate(v0 v0Var) {
        String str;
        if (v0Var.h().has("database")) {
            String n6 = v0Var.n("database");
            if (v0Var.h().has("syncdate")) {
                String n7 = v0Var.n("syncdate");
                Boolean f6 = v0Var.f("readonly", Boolean.FALSE);
                com.getcapacitor.community.database.sqlite.a aVar = this.implementation;
                if (aVar == null) {
                    this.rHandler.d(v0Var, null, this.loadMessage);
                    return;
                }
                try {
                    aVar.e0(n6, n7, f6);
                    this.rHandler.d(v0Var, null, null);
                    return;
                } catch (Exception e6) {
                    this.rHandler.d(v0Var, null, "SetSyncDate: " + e6.getMessage());
                    return;
                }
            }
            str = "SetSyncDate : Must provide a sync date";
        } else {
            str = "SetSyncDate: Must provide a database name";
        }
        this.rHandler.d(v0Var, null, str);
    }
}
