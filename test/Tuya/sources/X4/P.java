package X4;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class P {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12434c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12435a;

    /* renamed from: b, reason: collision with root package name */
    private long f12436b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final P a(Context context) {
            AbstractC3159y.i(context, "context");
            return SettingsPreferences.f29323b.G(context);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public P(long j8, long j9) {
        this.f12435a = j8;
        this.f12436b = j9;
    }

    public final long a(Context context) {
        AbstractC3159y.i(context, "context");
        if (System.currentTimeMillis() - this.f12436b > 2592000000L) {
            this.f12435a = 0L;
            this.f12436b = System.currentTimeMillis();
            SettingsPreferences.f29323b.t0(context, this);
        }
        return 209715200 - this.f12435a;
    }

    public final long b() {
        return this.f12435a;
    }

    public final long c() {
        return this.f12436b;
    }

    public final void d(Context context) {
        AbstractC3159y.i(context, "context");
        SettingsPreferences.f29323b.t0(context, this);
    }

    public final void e(long j8) {
        this.f12435a = j8;
    }
}
