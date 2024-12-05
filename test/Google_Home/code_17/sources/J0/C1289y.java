package J0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import q0.C3826j;

/* renamed from: J0.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1289y {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f4792a;

    /* renamed from: b, reason: collision with root package name */
    private final A0.f f4793b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4794c;

    /* renamed from: d, reason: collision with root package name */
    C3826j f4795d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4796e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4797f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f4798g;

    /* renamed from: h, reason: collision with root package name */
    private final C3826j f4799h;

    public C1289y(A0.f fVar) {
        Object obj = new Object();
        this.f4794c = obj;
        this.f4795d = new C3826j();
        this.f4796e = false;
        this.f4797f = false;
        this.f4799h = new C3826j();
        Context k8 = fVar.k();
        this.f4793b = fVar;
        this.f4792a = AbstractC1275j.q(k8);
        Boolean b8 = b();
        this.f4798g = b8 == null ? a(k8) : b8;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f4795d.e(null);
                    this.f4796e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g8 = g(context);
        if (g8 == null) {
            this.f4797f = false;
            return null;
        }
        this.f4797f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g8));
    }

    private Boolean b() {
        if (this.f4792a.contains("firebase_crashlytics_collection_enabled")) {
            this.f4797f = false;
            return Boolean.valueOf(this.f4792a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    private boolean e() {
        try {
            return this.f4793b.t();
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
        if (this.f4798g == null) {
            str2 = "global Firebase setting";
        } else if (this.f4797f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        G0.h.f().b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
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
            G0.h.f().e("Could not read data collection permission from manifest", e8);
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
            this.f4799h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean e8;
        try {
            Boolean bool = this.f4798g;
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
                this.f4797f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a8 = bool;
        } else {
            a8 = a(this.f4793b.k());
        }
        this.f4798g = a8;
        i(this.f4792a, bool);
        synchronized (this.f4794c) {
            try {
                if (d()) {
                    if (!this.f4796e) {
                        this.f4795d.e(null);
                        this.f4796e = true;
                    }
                } else if (this.f4796e) {
                    this.f4795d = new C3826j();
                    this.f4796e = false;
                }
            } finally {
            }
        }
    }

    public Task j() {
        Task a8;
        synchronized (this.f4794c) {
            a8 = this.f4795d.a();
        }
        return a8;
    }

    public Task k(Executor executor) {
        return a0.o(executor, this.f4799h.a(), j());
    }
}
