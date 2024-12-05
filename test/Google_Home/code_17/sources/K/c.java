package K;

import Q.AbstractC1400p;
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
    private static final Lock f4964c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static c f4965d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f4966a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f4967b;

    c(Context context) {
        this.f4967b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        AbstractC1400p.l(context);
        Lock lock = f4964c;
        lock.lock();
        try {
            if (f4965d == null) {
                f4965d = new c(context.getApplicationContext());
            }
            c cVar = f4965d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f4964c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f4966a.lock();
        try {
            this.f4967b.edit().clear().apply();
        } finally {
            this.f4966a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g8;
        String g9 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g9) || (g8 = g(i("googleSignInAccount", g9))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.X(g8);
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
            return GoogleSignInOptions.W(g8);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC1400p.l(googleSignInAccount);
        AbstractC1400p.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.Y());
        AbstractC1400p.l(googleSignInAccount);
        AbstractC1400p.l(googleSignInOptions);
        String Y7 = googleSignInAccount.Y();
        h(i("googleSignInAccount", Y7), googleSignInAccount.Z());
        h(i("googleSignInOptions", Y7), googleSignInOptions.a0());
    }

    protected final String g(String str) {
        this.f4966a.lock();
        try {
            return this.f4967b.getString(str, null);
        } finally {
            this.f4966a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f4966a.lock();
        try {
            this.f4967b.edit().putString(str, str2).apply();
        } finally {
            this.f4966a.unlock();
        }
    }
}
