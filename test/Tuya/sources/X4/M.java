package X4;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final String f12411a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12412b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12413c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12414d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12415e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12416f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12417g;

    /* renamed from: h, reason: collision with root package name */
    private int f12418h;

    public M(Context context) {
        AbstractC3159y.i(context, "context");
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        this.f12411a = aVar.q(context);
        this.f12412b = C3335w.f34546a.a(context);
        this.f12413c = aVar.z(context);
        this.f12414d = aVar.c0(context);
        this.f12415e = aVar.n(context);
        this.f12416f = aVar.R(context);
        this.f12417g = aVar.Y(context);
        this.f12418h = 627;
    }

    public final boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && g6.n.s(str, str2, true)) {
            return true;
        }
        return false;
    }

    public final boolean b(M m8) {
        if (m8 != null && a(m8.f12411a, this.f12411a) && m8.f12412b == this.f12412b && m8.f12414d == this.f12414d && g6.n.s(m8.f12413c, this.f12413c, true) && AbstractC3159y.d(m8.f12415e, this.f12415e) && m8.f12416f == this.f12416f && m8.f12417g == this.f12417g) {
            return true;
        }
        return false;
    }

    public final String c() {
        return this.f12413c;
    }

    public final String d() {
        return this.f12411a;
    }

    public final int e() {
        return this.f12418h;
    }

    public final boolean f() {
        return this.f12416f;
    }

    public final String g() {
        return this.f12415e;
    }

    public final boolean h() {
        return this.f12417g;
    }

    public final boolean i() {
        return this.f12412b;
    }

    public final boolean j() {
        return this.f12414d;
    }

    public final void k(Context context, C1504n device) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(device, "device");
        new S4.q(context, device, this);
    }
}
