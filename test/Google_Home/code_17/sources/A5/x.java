package a5;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: f, reason: collision with root package name */
    public static final a f14348f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private String f14350b;

    /* renamed from: d, reason: collision with root package name */
    private long f14352d;

    /* renamed from: e, reason: collision with root package name */
    private long f14353e;

    /* renamed from: a, reason: collision with root package name */
    private long f14349a = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f14351c = -1;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3255y.i(context, "context");
            SettingsPreferences.f30353b.c(context);
        }

        public final x b(Context context) {
            AbstractC3255y.i(context, "context");
            x A8 = SettingsPreferences.f30353b.A(context);
            if (A8 != null) {
                if (A8.h()) {
                    return A8;
                }
                a(context);
                return null;
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        if (this.f14349a > -1 && this.f14350b != null) {
            long j8 = this.f14352d;
            if (j8 > 0 && j8 + 86400000 > System.currentTimeMillis()) {
                return true;
            }
        }
        return false;
    }

    public final long b() {
        return this.f14349a;
    }

    public final int c() {
        return this.f14351c;
    }

    public final String d() {
        return this.f14350b;
    }

    public final long e() {
        return this.f14352d;
    }

    public final long f() {
        return this.f14353e;
    }

    public final boolean g() {
        if (this.f14353e > 0) {
            return true;
        }
        return false;
    }

    public final void i(Context context) {
        AbstractC3255y.i(context, "context");
        SettingsPreferences.f30353b.s0(context, this);
    }

    public final void j(long j8) {
        this.f14349a = j8;
    }

    public final void k(int i8) {
        this.f14351c = i8;
    }

    public final void l(Context context, int i8) {
        AbstractC3255y.i(context, "context");
        this.f14351c = i8;
        i(context);
    }

    public final void m(String str) {
        this.f14350b = str;
    }

    public final void n(Context context) {
        AbstractC3255y.i(context, "context");
        this.f14352d = System.currentTimeMillis();
        i(context);
    }

    public final void o(long j8) {
        this.f14352d = j8;
    }

    public final void p(Context context) {
        AbstractC3255y.i(context, "context");
        this.f14353e = System.currentTimeMillis();
        i(context);
    }

    public final void q(long j8) {
        this.f14353e = j8;
    }

    public String toString() {
        return "NotificationFCM(appId=" + this.f14349a + ", packageName=" + this.f14350b + ", downloadId=" + this.f14351c + ')';
    }
}
