package p1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import v1.n;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f8781c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static a f8782d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f8783a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f8784b;

    a(Context context) {
        this.f8784b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        n.h(context);
        Lock lock = f8781c;
        lock.lock();
        try {
            if (f8782d == null) {
                f8782d = new a(context.getApplicationContext());
            }
            a aVar = f8782d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f8781c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String c6;
        String c7 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c7) || (c6 = c(d("googleSignInAccount", c7))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.l(c6);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f8783a.lock();
        try {
            return this.f8784b.getString(str, null);
        } finally {
            this.f8783a.unlock();
        }
    }
}
