package a5;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class P {

    /* renamed from: c, reason: collision with root package name */
    public static final a f14055c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f14056a;

    /* renamed from: b, reason: collision with root package name */
    private long f14057b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final P a(Context context) {
            AbstractC3255y.i(context, "context");
            return SettingsPreferences.f30353b.G(context);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public P(long j8, long j9) {
        this.f14056a = j8;
        this.f14057b = j9;
    }

    public final long a(Context context) {
        AbstractC3255y.i(context, "context");
        if (System.currentTimeMillis() - this.f14057b > 2592000000L) {
            this.f14056a = 0L;
            this.f14057b = System.currentTimeMillis();
            SettingsPreferences.f30353b.t0(context, this);
        }
        return 209715200 - this.f14056a;
    }

    public final long b() {
        return this.f14056a;
    }

    public final long c() {
        return this.f14057b;
    }

    public final void d(Context context) {
        AbstractC3255y.i(context, "context");
        SettingsPreferences.f30353b.t0(context, this);
    }

    public final void e(long j8) {
        this.f14056a = j8;
    }
}
