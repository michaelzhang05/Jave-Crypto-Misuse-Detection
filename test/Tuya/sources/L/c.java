package L;

import R.AbstractC1319p;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f6019c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static c f6020d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f6021a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f6022b;

    c(Context context) {
        this.f6022b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        AbstractC1319p.l(context);
        Lock lock = f6019c;
        lock.lock();
        try {
            if (f6020d == null) {
                f6020d = new c(context.getApplicationContext());
            }
            c cVar = f6020d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f6019c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f6021a.lock();
        try {
            this.f6022b.edit().clear().apply();
        } finally {
            this.f6021a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g8;
        String g9 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g9) || (g8 = g(i("googleSignInAccount", g9))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.Z(g8);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g8;
        String g9 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g9) || (g8 = g(i("googleSignInOptions", g9))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.Y(g8);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC1319p.l(googleSignInAccount);
        AbstractC1319p.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.a0());
        AbstractC1319p.l(googleSignInAccount);
        AbstractC1319p.l(googleSignInOptions);
        String a02 = googleSignInAccount.a0();
        h(i("googleSignInAccount", a02), googleSignInAccount.b0());
        h(i("googleSignInOptions", a02), googleSignInOptions.c0());
    }

    protected final String g(String str) {
        this.f6021a.lock();
        try {
            return this.f6022b.getString(str, null);
        } finally {
            this.f6021a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f6021a.lock();
        try {
            this.f6022b.edit().putString(str, str2).apply();
        } finally {
            this.f6021a.unlock();
        }
    }
}
