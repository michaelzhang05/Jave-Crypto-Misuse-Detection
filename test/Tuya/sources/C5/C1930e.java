package c5;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: c5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1930e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14989b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f14990a;

    /* renamed from: c5.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public a(AbstractC3151p abstractC3151p) {
        }
    }

    public C1930e(Context context) {
        AbstractC3159y.i(context, "context");
        this.f14990a = context;
    }

    public final long a() {
        try {
            return this.f14990a.getSharedPreferences("sp_uptodown_services", 0).getLong("versioncode_registered", -1L);
        } catch (ClassCastException unused) {
            return -1L;
        }
    }

    public final void b(long j8) {
        try {
            SharedPreferences.Editor edit = this.f14990a.getSharedPreferences("sp_uptodown_services", 0).edit();
            edit.putLong("versioncode_registered", j8);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
