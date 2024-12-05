package io.sqlc;

import android.util.Log;
import java.io.File;
import java.sql.SQLException;
import org.apache.cordova.networkinformation.NetworkManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x4.d;
import x4.e;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: j, reason: collision with root package name */
    static e f7053j = new e();

    /* renamed from: i, reason: collision with root package name */
    d f7054i;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b4, code lost:
    
        r9.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject j(java.lang.String r8, org.json.JSONArray r9, org.apache.cordova.a r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sqlc.b.j(java.lang.String, org.json.JSONArray, org.apache.cordova.a):org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.sqlc.a
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.sqlc.a
    public void d() {
        try {
            d dVar = this.f7054i;
            if (dVar != null) {
                dVar.d();
            }
        } catch (Exception e6) {
            Log.e(SQLitePlugin.class.getSimpleName(), "couldn't close database, ignoring", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.sqlc.a
    public void e(String[] strArr, JSONArray[] jSONArrayArr, org.apache.cordova.a aVar) {
        String message;
        int i6;
        if (this.f7054i == null) {
            aVar.error("database has been closed");
            return;
        }
        int length = strArr.length;
        JSONArray jSONArray = new JSONArray();
        for (int i7 = 0; i7 < length; i7++) {
            JSONObject jSONObject = null;
            try {
                String str = strArr[i7];
                long a6 = this.f7054i.a();
                jSONObject = j(str, jSONArrayArr[i7], aVar);
                long a7 = this.f7054i.a() - a6;
                jSONObject.put("rowsAffected", a7);
                if (a7 > 0) {
                    long b6 = this.f7054i.b();
                    if (b6 > 0) {
                        jSONObject.put("insertId", b6);
                    }
                }
                message = NetworkManager.TYPE_UNKNOWN;
            } catch (SQLException e6) {
                e6.printStackTrace();
                int errorCode = e6.getErrorCode();
                message = e6.getMessage();
                Log.v("executeSqlBatch", "SQLitePlugin.executeSql[Batch](): SQL Error code = " + errorCode + " message = " + message);
                if (errorCode == 1) {
                    i6 = 5;
                } else if (errorCode == 13) {
                    i6 = 4;
                } else if (errorCode == 19) {
                    i6 = 6;
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
                message = e7.getMessage();
                Log.e("executeSqlBatch", "SQLitePlugin.executeSql[Batch](): UNEXPECTED JSON Error=" + message);
            }
            i6 = 0;
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", "success");
                    jSONObject2.put("result", jSONObject);
                    jSONArray.put(jSONObject2);
                } catch (JSONException e8) {
                    e8.printStackTrace();
                    Log.e("executeSqlBatch", "SQLitePlugin.executeSql[Batch](): Error=" + e8.getMessage());
                }
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", "error");
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("message", message);
                jSONObject4.put("code", i6);
                jSONObject3.put("result", jSONObject4);
                jSONArray.put(jSONObject3);
            }
        }
        aVar.success(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.sqlc.a
    public void i(File file) {
        this.f7054i = f7053j.a(file.getAbsolutePath(), 6);
    }
}
