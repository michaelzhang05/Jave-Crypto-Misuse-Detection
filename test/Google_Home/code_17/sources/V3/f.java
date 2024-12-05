package V3;

import O5.r;
import O5.x;
import P5.Q;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.os.LocaleListCompat;
import c4.InterfaceC2046d;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2046d f10685a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f10686b;

    public f(Context context, InterfaceC2046d hardwareIdSupplier) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(hardwareIdSupplier, "hardwareIdSupplier");
        this.f10685a = hardwareIdSupplier;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AbstractC3255y.h(displayMetrics, "getDisplayMetrics(...)");
        this.f10686b = displayMetrics;
    }

    @Override // V3.e
    public Map a() {
        Map h8;
        String a8 = ((j) this.f10685a.get()).a();
        r a9 = x.a(g.f10767b.toString(), "Android");
        r a10 = x.a(g.f10770c.toString(), Build.MODEL);
        r a11 = x.a(g.f10773d.toString(), Build.VERSION.CODENAME);
        r a12 = x.a(g.f10776e.toString(), Build.VERSION.RELEASE);
        r a13 = x.a(g.f10779f.toString(), LocaleListCompat.create(Locale.getDefault()).toLanguageTags());
        r a14 = x.a(g.f10782g.toString(), TimeZone.getDefault().getDisplayName());
        String gVar = g.f10788i.toString();
        Y y8 = Y.f34167a;
        String format = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f10686b.heightPixels), Integer.valueOf(this.f10686b.widthPixels)}, 2));
        AbstractC3255y.h(format, "format(locale, format, *args)");
        Map k8 = Q.k(a9, a10, a11, a12, a13, a14, x.a(gVar, format));
        if (a8.length() > 0) {
            h8 = Q.e(x.a(g.f10785h.toString(), a8));
        } else {
            h8 = Q.h();
        }
        return Q.q(k8, h8);
    }
}
