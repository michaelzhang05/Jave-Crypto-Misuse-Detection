package f5;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: f5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2840e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31964b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f31965a;

    /* renamed from: f5.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public a(AbstractC3247p abstractC3247p) {
        }
    }

    public C2840e(Context context) {
        AbstractC3255y.i(context, "context");
        this.f31965a = context;
    }

    public final long a() {
        try {
            return this.f31965a.getSharedPreferences("sp_uptodown_services", 0).getLong("versioncode_registered", -1L);
        } catch (ClassCastException unused) {
            return -1L;
        }
    }

    public final void b(long j8) {
        try {
            SharedPreferences.Editor edit = this.f31965a.getSharedPreferences("sp_uptodown_services", 0).edit();
            edit.putLong("versioncode_registered", j8);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
