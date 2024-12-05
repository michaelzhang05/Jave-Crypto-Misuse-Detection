package J0;

import J0.E;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class D implements E {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f4629g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f4630h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    private final F f4631a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4632b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4633c;

    /* renamed from: d, reason: collision with root package name */
    private final c1.e f4634d;

    /* renamed from: e, reason: collision with root package name */
    private final C1289y f4635e;

    /* renamed from: f, reason: collision with root package name */
    private E.a f4636f;

    public D(Context context, String str, c1.e eVar, C1289y c1289y) {
        if (context != null) {
            if (str != null) {
                this.f4632b = context;
                this.f4633c = str;
                this.f4634d = eVar;
                this.f4635e = c1289y;
                this.f4631a = new F();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e8;
        e8 = e(UUID.randomUUID().toString());
        G0.h.f().i("Created new Crashlytics installation ID: " + e8 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e8).putString("firebase.installation.id", str).apply();
        return e8;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f4629g.matcher(str).replaceAll("").toLowerCase(Locale.US);
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
        return str.replaceAll(f4630h, "");
    }

    private boolean n() {
        E.a aVar = this.f4636f;
        if (aVar != null && (aVar.e() != null || !this.f4635e.d())) {
            return false;
        }
        return true;
    }

    @Override // J0.E
    public synchronized E.a a() {
        String str;
        if (!n()) {
            return this.f4636f;
        }
        G0.h.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q8 = AbstractC1275j.q(this.f4632b);
        String string = q8.getString("firebase.installation.id", null);
        G0.h.f().i("Cached Firebase Installation ID: " + string);
        if (this.f4635e.d()) {
            C d8 = d(false);
            G0.h.f().i("Fetched Firebase Installation ID: " + d8.b());
            if (d8.b() == null) {
                if (string == null) {
                    str = c();
                } else {
                    str = string;
                }
                d8 = new C(str, null);
            }
            if (Objects.equals(d8.b(), string)) {
                this.f4636f = E.a.a(l(q8), d8);
            } else {
                this.f4636f = E.a.a(b(d8.b(), q8), d8);
            }
        } else if (k(string)) {
            this.f4636f = E.a.b(l(q8));
        } else {
            this.f4636f = E.a.b(b(c(), q8));
        }
        G0.h.f().i("Install IDs: " + this.f4636f);
        return this.f4636f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        G0.h.f().l("Error getting Firebase installation id.", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J0.C d(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L1f
            c1.e r5 = r4.f4634d     // Catch: java.lang.Exception -> L15
            r1 = 0
            com.google.android.gms.tasks.Task r5 = r5.a(r1)     // Catch: java.lang.Exception -> L15
            java.lang.Object r5 = J0.a0.f(r5)     // Catch: java.lang.Exception -> L15
            com.google.firebase.installations.g r5 = (com.google.firebase.installations.g) r5     // Catch: java.lang.Exception -> L15
            java.lang.String r5 = r5.b()     // Catch: java.lang.Exception -> L15
            goto L20
        L15:
            r5 = move-exception
            G0.h r1 = G0.h.f()
            java.lang.String r2 = "Error getting Firebase authentication token."
            r1.l(r2, r5)
        L1f:
            r5 = r0
        L20:
            c1.e r1 = r4.f4634d     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.tasks.Task r1 = r1.getId()     // Catch: java.lang.Exception -> L2e
            java.lang.Object r1 = J0.a0.f(r1)     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2e
            r0 = r1
            goto L38
        L2e:
            r1 = move-exception
            G0.h r2 = G0.h.f()
            java.lang.String r3 = "Error getting Firebase installation id."
            r2.l(r3, r1)
        L38:
            J0.C r1 = new J0.C
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.D.d(boolean):J0.C");
    }

    public String f() {
        return this.f4633c;
    }

    public String g() {
        return this.f4631a.a(this.f4632b);
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
