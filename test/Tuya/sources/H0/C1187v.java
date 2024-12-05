package H0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import r0.C3679j;

/* renamed from: H0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1187v {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f3407a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.e f3408b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3409c;

    /* renamed from: d, reason: collision with root package name */
    C3679j f3410d;

    /* renamed from: e, reason: collision with root package name */
    boolean f3411e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3412f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f3413g;

    /* renamed from: h, reason: collision with root package name */
    private final C3679j f3414h;

    public C1187v(y0.e eVar) {
        Object obj = new Object();
        this.f3409c = obj;
        this.f3410d = new C3679j();
        this.f3411e = false;
        this.f3412f = false;
        this.f3414h = new C3679j();
        Context k8 = eVar.k();
        this.f3408b = eVar;
        this.f3407a = AbstractC1176j.s(k8);
        Boolean b8 = b();
        this.f3413g = b8 == null ? a(k8) : b8;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f3410d.e(null);
                    this.f3411e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g8 = g(context);
        if (g8 == null) {
            this.f3412f = false;
            return null;
        }
        this.f3412f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g8));
    }

    private Boolean b() {
        if (this.f3407a.contains("firebase_crashlytics_collection_enabled")) {
            this.f3412f = false;
            return Boolean.valueOf(this.f3407a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    private boolean e() {
        try {
            return this.f3408b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z8) {
        String str;
        String str2;
        if (z8) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f3413g == null) {
            str2 = "global Firebase setting";
        } else if (this.f3412f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        E0.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            E0.f.f().e("Could not read data collection permission from manifest", e8);
            return null;
        }
    }

    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z8) {
        if (z8) {
            this.f3414h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean e8;
        try {
            Boolean bool = this.f3413g;
            if (bool != null) {
                e8 = bool.booleanValue();
            } else {
                e8 = e();
            }
            f(e8);
        } catch (Throwable th) {
            throw th;
        }
        return e8;
    }

    public synchronized void h(Boolean bool) {
        Boolean a8;
        if (bool != null) {
            try {
                this.f3412f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a8 = bool;
        } else {
            a8 = a(this.f3408b.k());
        }
        this.f3413g = a8;
        i(this.f3407a, bool);
        synchronized (this.f3409c) {
            try {
                if (d()) {
                    if (!this.f3411e) {
                        this.f3410d.e(null);
                        this.f3411e = true;
                    }
                } else if (this.f3411e) {
                    this.f3410d = new C3679j();
                    this.f3411e = false;
                }
            } finally {
            }
        }
    }

    public Task j() {
        Task a8;
        synchronized (this.f3409c) {
            a8 = this.f3410d.a();
        }
        return a8;
    }

    public Task k(Executor executor) {
        return W.o(executor, this.f3414h.a(), j());
    }
}
