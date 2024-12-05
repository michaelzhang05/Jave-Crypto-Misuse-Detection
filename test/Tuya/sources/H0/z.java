package H0;

import H0.A;
import a1.InterfaceC1554e;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class z implements A {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f3432g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f3433h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    private final B f3434a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3435b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3436c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1554e f3437d;

    /* renamed from: e, reason: collision with root package name */
    private final C1187v f3438e;

    /* renamed from: f, reason: collision with root package name */
    private A.a f3439f;

    public z(Context context, String str, InterfaceC1554e interfaceC1554e, C1187v c1187v) {
        if (context != null) {
            if (str != null) {
                this.f3435b = context;
                this.f3436c = str;
                this.f3437d = interfaceC1554e;
                this.f3438e = c1187v;
                this.f3434a = new B();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e8;
        e8 = e(UUID.randomUUID().toString());
        E0.f.f().i("Created new Crashlytics installation ID: " + e8 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e8).putString("firebase.installation.id", str).apply();
        return e8;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f3432g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f3433h, "");
    }

    private boolean n() {
        A.a aVar = this.f3439f;
        if (aVar != null && (aVar.d() != null || !this.f3438e.d())) {
            return false;
        }
        return true;
    }

    @Override // H0.A
    public synchronized A.a a() {
        if (!n()) {
            return this.f3439f;
        }
        E0.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences s8 = AbstractC1176j.s(this.f3435b);
        String string = s8.getString("firebase.installation.id", null);
        E0.f.f().i("Cached Firebase Installation ID: " + string);
        if (this.f3438e.d()) {
            String d8 = d();
            E0.f.f().i("Fetched Firebase Installation ID: " + d8);
            if (d8 == null) {
                if (string == null) {
                    d8 = c();
                } else {
                    d8 = string;
                }
            }
            if (d8.equals(string)) {
                this.f3439f = A.a.a(l(s8), d8);
            } else {
                this.f3439f = A.a.a(b(d8, s8), d8);
            }
        } else if (k(string)) {
            this.f3439f = A.a.b(l(s8));
        } else {
            this.f3439f = A.a.b(b(c(), s8));
        }
        E0.f.f().i("Install IDs: " + this.f3439f);
        return this.f3439f;
    }

    public String d() {
        try {
            return (String) W.f(this.f3437d.getId());
        } catch (Exception e8) {
            E0.f.f().l("Failed to retrieve Firebase Installation ID.", e8);
            return null;
        }
    }

    public String f() {
        return this.f3436c;
    }

    public String g() {
        return this.f3434a.a(this.f3435b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
