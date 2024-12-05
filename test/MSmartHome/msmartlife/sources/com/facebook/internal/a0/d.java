package com.facebook.internal.a0;

import com.facebook.GraphRequest;
import com.facebook.f;
import com.facebook.internal.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentUtility.java */
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentUtility.java */
    /* loaded from: classes.dex */
    public static class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", "analysis_log_"));
        }
    }

    /* compiled from: InstrumentUtility.java */
    /* loaded from: classes.dex */
    static class b implements FilenameFilter {
        b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.matches(String.format("^(%s|%s|%s)[0-9]+.json$", "crash_log_", "shield_log_", "thread_check_log_"));
        }
    }

    public static boolean a(String str) {
        File c2 = c();
        if (c2 == null || str == null) {
            return false;
        }
        return new File(c2, str).delete();
    }

    public static String b(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return th.getCause().toString();
    }

    public static File c() {
        File file = new File(f.e().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static String d(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static boolean e(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (stackTraceElement.getClassName().startsWith("com.facebook")) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static File[] f() {
        File c2 = c();
        if (c2 == null) {
            return new File[0];
        }
        File[] listFiles = c2.listFiles(new a());
        return listFiles != null ? listFiles : new File[0];
    }

    public static File[] g() {
        File c2 = c();
        if (c2 == null) {
            return new File[0];
        }
        File[] listFiles = c2.listFiles(new b());
        return listFiles != null ? listFiles : new File[0];
    }

    public static JSONObject h(String str, boolean z) {
        File c2 = c();
        if (c2 != null && str != null) {
            try {
                return new JSONObject(x.e0(new FileInputStream(new File(c2, str))));
            } catch (Exception unused) {
                if (z) {
                    a(str);
                }
            }
        }
        return null;
    }

    public static void i(String str, JSONArray jSONArray, GraphRequest.f fVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            GraphRequest.L(null, String.format("%s/instruments", f.f()), jSONObject, fVar).i();
        } catch (JSONException unused) {
        }
    }

    public static void j(String str, String str2) {
        File c2 = c();
        if (c2 == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(c2, str));
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
