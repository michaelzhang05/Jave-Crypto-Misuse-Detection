package a5;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3683w;

/* loaded from: classes5.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final String f14032a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14033b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14034c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14035d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14036e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14037f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f14038g;

    /* renamed from: h, reason: collision with root package name */
    private int f14039h;

    public M(Context context) {
        AbstractC3255y.i(context, "context");
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        this.f14032a = aVar.q(context);
        this.f14033b = C3683w.f36547a.a(context);
        this.f14034c = aVar.z(context);
        this.f14035d = aVar.c0(context);
        this.f14036e = aVar.n(context);
        this.f14037f = aVar.R(context);
        this.f14038g = aVar.Y(context);
        this.f14039h = 628;
    }

    public final boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && j6.n.s(str, str2, true)) {
            return true;
        }
        return false;
    }

    public final boolean b(M m8) {
        if (m8 != null && a(m8.f14032a, this.f14032a) && m8.f14033b == this.f14033b && m8.f14035d == this.f14035d && j6.n.s(m8.f14034c, this.f14034c, true) && AbstractC3255y.d(m8.f14036e, this.f14036e) && m8.f14037f == this.f14037f && m8.f14038g == this.f14038g) {
            return true;
        }
        return false;
    }

    public final String c() {
        return this.f14034c;
    }

    public final String d() {
        return this.f14032a;
    }

    public final int e() {
        return this.f14039h;
    }

    public final boolean f() {
        return this.f14037f;
    }

    public final String g() {
        return this.f14036e;
    }

    public final boolean h() {
        return this.f14038g;
    }

    public final boolean i() {
        return this.f14033b;
    }

    public final boolean j() {
        return this.f14035d;
    }

    public final void k(Context context, C1647n device) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(device, "device");
        new V4.q(context, device, this);
    }
}
