package m5;

import java.security.SecureRandom;
import org.apache.cordova.NativeToJsMessageQueue;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private org.apache.cordova.e f7925a;

    /* renamed from: b, reason: collision with root package name */
    private NativeToJsMessageQueue f7926b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f7927c = -1;

    public f(org.apache.cordova.e eVar, NativeToJsMessageQueue nativeToJsMessageQueue) {
        this.f7925a = eVar;
        this.f7926b = nativeToJsMessageQueue;
    }

    private boolean h(String str, int i6) {
        StringBuilder sb;
        String str2;
        if (this.f7926b.f()) {
            if (this.f7927c >= 0 && i6 == this.f7927c) {
                return true;
            }
            o.c("CordovaBridge", "Bridge access attempt with wrong secret token, possibly from malicious code. Disabling exec() bridge!");
            a();
            throw new IllegalAccessException();
        }
        if (i6 == -1) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = " call made before bridge was enabled.";
        } else {
            sb = new StringBuilder();
            sb.append("Ignoring ");
            sb.append(str);
            str2 = " from previous page load.";
        }
        sb.append(str2);
        o.a("CordovaBridge", sb.toString());
        return false;
    }

    void a() {
        this.f7927c = -1;
    }

    int b() {
        this.f7927c = new SecureRandom().nextInt(Integer.MAX_VALUE);
        return this.f7927c;
    }

    public String c(int i6, String str, String str2, String str3, String str4) {
        String str5;
        if (!h("exec()", i6)) {
            return null;
        }
        if (str4 == null) {
            return "@Null arguments.";
        }
        this.f7926b.m(true);
        try {
            org.apache.cordova.c.f8373f = Thread.currentThread();
            this.f7925a.d(str, str2, str3, str4);
            str5 = this.f7926b.i(false);
        } finally {
            try {
                return str5;
            } finally {
            }
        }
        return str5;
    }

    public String d(int i6, boolean z5) {
        if (h("retrieveJsMessages()", i6)) {
            return this.f7926b.i(z5);
        }
        return null;
    }

    public void e(int i6, int i7) {
        if (h("setNativeToJsBridgeMode()", i6)) {
            this.f7926b.l(i7);
        }
    }

    public String f(String str, String str2, String str3) {
        if (str3 != null && str3.startsWith("gap:")) {
            try {
                JSONArray jSONArray = new JSONArray(str3.substring(4));
                String c6 = c(jSONArray.getInt(0), jSONArray.getString(1), jSONArray.getString(2), jSONArray.getString(3), str2);
                return c6 == null ? "" : c6;
            } catch (IllegalAccessException | JSONException e6) {
                e6.printStackTrace();
                return "";
            }
        }
        if (str3 != null && str3.startsWith("gap_bridge_mode:")) {
            try {
                e(Integer.parseInt(str3.substring(16)), Integer.parseInt(str2));
            } catch (IllegalAccessException | NumberFormatException e7) {
                e7.printStackTrace();
            }
            return "";
        }
        if (str3 != null && str3.startsWith("gap_poll:")) {
            try {
                String d6 = d(Integer.parseInt(str3.substring(9)), "1".equals(str2));
                return d6 == null ? "" : d6;
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
                return "";
            }
        }
        if (str3 == null || !str3.startsWith("gap_init:")) {
            return null;
        }
        if (!this.f7925a.y(str)) {
            o.c("CordovaBridge", "gap_init called from restricted origin: " + str);
            return "";
        }
        this.f7926b.l(Integer.parseInt(str3.substring(9)));
        return "" + b();
    }

    public void g() {
        this.f7926b.k();
        a();
    }
}
