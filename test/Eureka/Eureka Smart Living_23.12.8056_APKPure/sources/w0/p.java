package w0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import w0.m;

/* loaded from: classes.dex */
public class p {

    /* renamed from: e, reason: collision with root package name */
    private static final String f9738e = j.class.getName();

    /* renamed from: f, reason: collision with root package name */
    private static SharedPreferences f9739f;

    /* renamed from: a, reason: collision with root package name */
    private j f9740a = new j();

    /* renamed from: b, reason: collision with root package name */
    private d f9741b = new d();

    /* renamed from: c, reason: collision with root package name */
    private m f9742c = new m();

    /* renamed from: d, reason: collision with root package name */
    private Context f9743d;

    public p(Context context, SharedPreferences sharedPreferences) {
        this.f9743d = context;
        f9739f = sharedPreferences;
    }

    public static String e() {
        return f9739f.getString("secret", "");
    }

    public static Boolean f() {
        return !e().isEmpty() ? Boolean.TRUE : Boolean.FALSE;
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                throw new Exception("Passphrase and/or oldpassphrase must not be empty");
            }
            String e6 = e();
            if (e6 == null || e6.length() == 0) {
                throw new Exception("Encryption secret has not been set");
            }
            if (!e6.equals(str2)) {
                throw new Exception("Oldpassphrase is wrong secret");
            }
            String[] n6 = this.f9740a.n(this.f9743d);
            if (n6.length > 0) {
                for (String str3 : n6) {
                    File databasePath = this.f9743d.getDatabasePath(str3);
                    m.a d6 = this.f9742c.d(this.f9743d, databasePath, f9739f, this.f9741b);
                    if (d6 == m.a.ENCRYPTED_SECRET) {
                        this.f9742c.a(this.f9743d, databasePath, str2, str);
                    } else if (d6 == m.a.DOES_NOT_EXIST || d6 == m.a.ENCRYPTED_GLOBAL_SECRET || d6 == m.a.UNKNOWN) {
                        throw new Exception("State for: " + str3 + " not correct");
                    }
                }
            }
            h(str);
        } catch (Exception e7) {
            throw new Exception(e7.getMessage());
        }
    }

    public Boolean b(String str) {
        Boolean bool = Boolean.FALSE;
        try {
            if (TextUtils.isEmpty(str)) {
                throw new Exception("passphrase must not be empty");
            }
            String e6 = e();
            if (e6.isEmpty()) {
                throw new Exception("no passphrase stored  in sharedPreferences");
            }
            return e6.equals(str) ? Boolean.TRUE : bool;
        } catch (Exception e7) {
            throw new Exception(e7.getMessage());
        }
    }

    public void c() {
        try {
            String e6 = e();
            if (e6 == null || e6.length() <= 0) {
                return;
            }
            d();
        } catch (Exception e7) {
            throw new Exception(e7.getMessage());
        }
    }

    public void d() {
        f9739f.edit().remove("secret").commit();
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                throw new Exception("passphrase must not be empty");
            }
            String e6 = e();
            if (e6 != null && e6.length() > 0) {
                throw new Exception("a passphrase has already been set ");
            }
            h(str);
            String[] n6 = this.f9740a.n(this.f9743d);
            if (n6.length > 0) {
                for (String str2 : n6) {
                    File databasePath = this.f9743d.getDatabasePath(str2);
                    m.a d6 = this.f9742c.d(this.f9743d, databasePath, f9739f, this.f9741b);
                    if (d6 == m.a.ENCRYPTED_GLOBAL_SECRET) {
                        this.f9742c.a(this.f9743d, databasePath, this.f9741b.f9706a, str);
                    } else if (d6 == m.a.DOES_NOT_EXIST || d6 == m.a.UNKNOWN) {
                        throw new Exception("State for: " + str2 + " not correct");
                    }
                }
            }
        } catch (Exception e7) {
            throw new Exception(e7.getMessage());
        }
    }

    public void h(String str) {
        f9739f.edit().putString("secret", str).apply();
    }
}
