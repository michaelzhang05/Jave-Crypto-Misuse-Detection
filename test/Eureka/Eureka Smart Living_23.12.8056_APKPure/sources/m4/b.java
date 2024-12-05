package m4;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import w3.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f7896c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f7897a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7898b;

    public b(e eVar) {
        this.f7897a = eVar.j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f7898b = b(eVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(e eVar) {
        String d6 = eVar.m().d();
        if (d6 != null) {
            return d6;
        }
        String c6 = eVar.m().c();
        if (!c6.startsWith("1:") && !c6.startsWith("2:")) {
            return c6;
        }
        String[] split = c6.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e6) {
            Log.w("ContentValues", "Invalid key stored " + e6);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f7897a) {
            string = this.f7897a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f7897a) {
            String string = this.f7897a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e6 = e(string);
            if (e6 == null) {
                return null;
            }
            return c(e6);
        }
    }

    public String f() {
        synchronized (this.f7897a) {
            String g6 = g();
            if (g6 != null) {
                return g6;
            }
            return h();
        }
    }

    public String i() {
        synchronized (this.f7897a) {
            for (String str : f7896c) {
                String string = this.f7897a.getString(a(this.f7898b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
