package m4;

import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;

/* renamed from: m4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3440l {

    /* renamed from: a, reason: collision with root package name */
    public static final C3440l f35212a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3436h f35213b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3436h f35214c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3438j f35215d;

    /* renamed from: e, reason: collision with root package name */
    private static final n f35216e;

    /* renamed from: f, reason: collision with root package name */
    private static final C3431c f35217f;

    static {
        C3440l c3440l = new C3440l();
        f35212a = c3440l;
        Color.Companion companion = Color.Companion;
        f35213b = new C3436h(companion.m3013getWhite0d7_KjU(), ColorKt.Color(863533184), ColorKt.Color(863533184), companion.m3002getBlack0d7_KjU(), ColorKt.Color(2566914048L), companion.m3002getBlack0d7_KjU(), ColorKt.Color(2570861635L), ColorKt.Color(2566914048L), ColorsKt.m1205lightColors2qZNXz8$default(ColorKt.Color(4278221567L), 0L, 0L, 0L, 0L, companion.m3013getWhite0d7_KjU(), companion.m3010getRed0d7_KjU(), 0L, 0L, 0L, companion.m3002getBlack0d7_KjU(), 0L, 2974, null), null);
        f35214c = new C3436h(companion.m3005getDarkGray0d7_KjU(), ColorKt.Color(4286085248L), ColorKt.Color(4286085248L), companion.m3013getWhite0d7_KjU(), ColorKt.Color(2583691263L), companion.m3013getWhite0d7_KjU(), ColorKt.Color(1644167167), companion.m3013getWhite0d7_KjU(), ColorsKt.m1203darkColors2qZNXz8$default(ColorKt.Color(4278219988L), 0L, 0L, 0L, 0L, ColorKt.Color(4281216558L), companion.m3010getRed0d7_KjU(), 0L, 0L, 0L, companion.m3013getWhite0d7_KjU(), 0L, 2974, null), null);
        C3438j c3438j = new C3438j(6.0f, 1.0f, 2.0f);
        f35215d = c3438j;
        FontWeight.Companion companion2 = FontWeight.Companion;
        n nVar = new n(companion2.getNormal().getWeight(), companion2.getMedium().getWeight(), companion2.getBold().getWeight(), 1.0f, TextUnitKt.getSp(9), TextUnitKt.getSp(12), TextUnitKt.getSp(13), TextUnitKt.getSp(14), TextUnitKt.getSp(16), TextUnitKt.getSp(20), null, null, null, null, null, null, null, null, 260096, null);
        f35216e = nVar;
        f35217f = new C3431c(new C3429a(c3440l.a(false).g().m1183getPrimary0d7_KjU(), companion.m3013getWhite0d7_KjU(), companion.m3011getTransparent0d7_KjU(), AbstractC3441m.m(), companion.m3013getWhite0d7_KjU(), null), new C3429a(c3440l.a(true).g().m1183getPrimary0d7_KjU(), companion.m3013getWhite0d7_KjU(), companion.m3011getTransparent0d7_KjU(), AbstractC3441m.m(), companion.m3013getWhite0d7_KjU(), null), new C3430b(c3438j.e(), 0.0f), new C3432d(nVar.f(), nVar.n(), null));
    }

    private C3440l() {
    }

    public final C3436h a(boolean z8) {
        if (z8) {
            return f35214c;
        }
        return f35213b;
    }

    public final C3436h b() {
        return f35214c;
    }

    public final C3436h c() {
        return f35213b;
    }

    public final C3431c d() {
        return f35217f;
    }

    public final C3438j e() {
        return f35215d;
    }

    public final n f() {
        return f35216e;
    }
}
