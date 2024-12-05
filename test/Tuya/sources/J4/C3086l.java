package j4;

import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;

/* renamed from: j4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3086l {

    /* renamed from: a, reason: collision with root package name */
    public static final C3086l f33236a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3082h f33237b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3082h f33238c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3084j f33239d;

    /* renamed from: e, reason: collision with root package name */
    private static final n f33240e;

    /* renamed from: f, reason: collision with root package name */
    private static final C3077c f33241f;

    static {
        C3086l c3086l = new C3086l();
        f33236a = c3086l;
        Color.Companion companion = Color.Companion;
        f33237b = new C3082h(companion.m3008getWhite0d7_KjU(), ColorKt.Color(863533184), ColorKt.Color(863533184), companion.m2997getBlack0d7_KjU(), ColorKt.Color(2566914048L), companion.m2997getBlack0d7_KjU(), ColorKt.Color(2570861635L), ColorKt.Color(2566914048L), ColorsKt.m1200lightColors2qZNXz8$default(ColorKt.Color(4278221567L), 0L, 0L, 0L, 0L, companion.m3008getWhite0d7_KjU(), companion.m3005getRed0d7_KjU(), 0L, 0L, 0L, companion.m2997getBlack0d7_KjU(), 0L, 2974, null), null);
        f33238c = new C3082h(companion.m3000getDarkGray0d7_KjU(), ColorKt.Color(4286085248L), ColorKt.Color(4286085248L), companion.m3008getWhite0d7_KjU(), ColorKt.Color(2583691263L), companion.m3008getWhite0d7_KjU(), ColorKt.Color(1644167167), companion.m3008getWhite0d7_KjU(), ColorsKt.m1198darkColors2qZNXz8$default(ColorKt.Color(4278219988L), 0L, 0L, 0L, 0L, ColorKt.Color(4281216558L), companion.m3005getRed0d7_KjU(), 0L, 0L, 0L, companion.m3008getWhite0d7_KjU(), 0L, 2974, null), null);
        C3084j c3084j = new C3084j(6.0f, 1.0f, 2.0f);
        f33239d = c3084j;
        FontWeight.Companion companion2 = FontWeight.Companion;
        n nVar = new n(companion2.getNormal().getWeight(), companion2.getMedium().getWeight(), companion2.getBold().getWeight(), 1.0f, TextUnitKt.getSp(9), TextUnitKt.getSp(12), TextUnitKt.getSp(13), TextUnitKt.getSp(14), TextUnitKt.getSp(16), TextUnitKt.getSp(20), null, null, null, null, null, null, null, null, 260096, null);
        f33240e = nVar;
        f33241f = new C3077c(new C3075a(c3086l.a(false).g().m1178getPrimary0d7_KjU(), companion.m3008getWhite0d7_KjU(), companion.m3006getTransparent0d7_KjU(), AbstractC3087m.m(), companion.m3008getWhite0d7_KjU(), null), new C3075a(c3086l.a(true).g().m1178getPrimary0d7_KjU(), companion.m3008getWhite0d7_KjU(), companion.m3006getTransparent0d7_KjU(), AbstractC3087m.m(), companion.m3008getWhite0d7_KjU(), null), new C3076b(c3084j.e(), 0.0f), new C3078d(nVar.f(), nVar.n(), null));
    }

    private C3086l() {
    }

    public final C3082h a(boolean z8) {
        if (z8) {
            return f33238c;
        }
        return f33237b;
    }

    public final C3082h b() {
        return f33238c;
    }

    public final C3082h c() {
        return f33237b;
    }

    public final C3077c d() {
        return f33241f;
    }

    public final C3084j e() {
        return f33239d;
    }

    public final n f() {
        return f33240e;
    }
}
