package X4;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12727f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private String f12729b;

    /* renamed from: d, reason: collision with root package name */
    private long f12731d;

    /* renamed from: e, reason: collision with root package name */
    private long f12732e;

    /* renamed from: a, reason: collision with root package name */
    private long f12728a = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f12730c = -1;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            SettingsPreferences.f29323b.c(context);
        }

        public final x b(Context context) {
            AbstractC3159y.i(context, "context");
            x A8 = SettingsPreferences.f29323b.A(context);
            if (A8 != null) {
                if (A8.h()) {
                    return A8;
                }
                a(context);
                return null;
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        if (this.f12728a > -1 && this.f12729b != null) {
            long j8 = this.f12731d;
            if (j8 > 0 && j8 + 86400000 > System.currentTimeMillis()) {
                return true;
            }
        }
        return false;
    }

    public final long b() {
        return this.f12728a;
    }

    public final int c() {
        return this.f12730c;
    }

    public final String d() {
        return this.f12729b;
    }

    public final long e() {
        return this.f12731d;
    }

    public final long f() {
        return this.f12732e;
    }

    public final boolean g() {
        if (this.f12732e > 0) {
            return true;
        }
        return false;
    }

    public final void i(Context context) {
        AbstractC3159y.i(context, "context");
        SettingsPreferences.f29323b.s0(context, this);
    }

    public final void j(long j8) {
        this.f12728a = j8;
    }

    public final void k(int i8) {
        this.f12730c = i8;
    }

    public final void l(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        this.f12730c = i8;
        i(context);
    }

    public final void m(String str) {
        this.f12729b = str;
    }

    public final void n(Context context) {
        AbstractC3159y.i(context, "context");
        this.f12731d = System.currentTimeMillis();
        i(context);
    }

    public final void o(long j8) {
        this.f12731d = j8;
    }

    public final void p(Context context) {
        AbstractC3159y.i(context, "context");
        this.f12732e = System.currentTimeMillis();
        i(context);
    }

    public final void q(long j8) {
        this.f12732e = j8;
    }

    public String toString() {
        return "NotificationFCM(appId=" + this.f12728a + ", packageName=" + this.f12729b + ", downloadId=" + this.f12730c + ')';
    }
}
