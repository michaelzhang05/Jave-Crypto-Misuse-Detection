package j4;

import L5.I;
import android.content.Context;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.TextKt;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: j4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3087m {

    /* renamed from: a, reason: collision with root package name */
    private static final long f33242a = ColorKt.Color(4280595582L);

    /* renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f33243b = CompositionLocalKt.staticCompositionLocalOf(a.f33247a);

    /* renamed from: c, reason: collision with root package name */
    private static final ProvidableCompositionLocal f33244c = CompositionLocalKt.staticCompositionLocalOf(c.f33249a);

    /* renamed from: d, reason: collision with root package name */
    private static final ProvidableCompositionLocal f33245d = CompositionLocalKt.staticCompositionLocalOf(d.f33250a);

    /* renamed from: e, reason: collision with root package name */
    private static final ProvidableCompositionLocal f33246e = CompositionLocalKt.staticCompositionLocalOf(b.f33248a);

    /* renamed from: j4.m$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33247a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3082h invoke() {
            return C3085k.f33229a.a(false);
        }
    }

    /* renamed from: j4.m$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33248a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: j4.m$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33249a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3084j invoke() {
            return C3085k.f33229a.c();
        }
    }

    /* renamed from: j4.m$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f33250a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return C3085k.f33229a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.m$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3082h f33251a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f33252b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3084j f33253c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.n f33254d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j4.m$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ X5.n f33255a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: j4.m$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0769a extends AbstractC3160z implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ X5.n f33256a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0769a(X5.n nVar) {
                    super(2);
                    this.f33256a = nVar;
                }

                @Override // X5.n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f6487a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(734609044, i8, -1, "com.stripe.android.uicore.StripeTheme.<anonymous>.<anonymous>.<anonymous> (StripeTheme.kt:373)");
                    }
                    this.f33256a.invoke(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(X5.n nVar) {
                super(2);
                this.f33255a = nVar;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1485460652, i8, -1, "com.stripe.android.uicore.StripeTheme.<anonymous>.<anonymous> (StripeTheme.kt:370)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(AbstractC3087m.t((TextStyle) composer.consume(TextKt.getLocalTextStyle())))}, ComposableLambdaKt.composableLambda(composer, 734609044, true, new C0769a(this.f33255a)), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3082h c3082h, n nVar, C3084j c3084j, X5.n nVar2) {
            super(2);
            this.f33251a = c3082h;
            this.f33252b = nVar;
            this.f33253c = c3084j;
            this.f33254d = nVar2;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-289952640, i8, -1, "com.stripe.android.uicore.StripeTheme.<anonymous> (StripeTheme.kt:365)");
            }
            MaterialThemeKt.MaterialTheme(this.f33251a.g(), AbstractC3087m.v(this.f33252b, composer, 0), AbstractC3087m.u(this.f33253c, composer, 0).a(), ComposableLambdaKt.composableLambda(composer, -1485460652, true, new a(this.f33254d)), composer, 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.m$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3082h f33257a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3084j f33258b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f33259c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.n f33260d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33261e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33262f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3082h c3082h, C3084j c3084j, n nVar, X5.n nVar2, int i8, int i9) {
            super(2);
            this.f33257a = c3082h;
            this.f33258b = c3084j;
            this.f33259c = nVar;
            this.f33260d = nVar2;
            this.f33261e = i8;
            this.f33262f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3087m.a(this.f33257a, this.f33258b, this.f33259c, this.f33260d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f33261e | 1), this.f33262f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        if ((r22 & 4) != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(j4.C3082h r16, j4.C3084j r17, j4.n r18, X5.n r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.AbstractC3087m.a(j4.h, j4.j, j4.n, X5.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float c(Context convertDpToPx, float f8) {
        AbstractC3159y.i(convertDpToPx, "$this$convertDpToPx");
        return f8 * convertDpToPx.getResources().getDisplayMetrics().density;
    }

    public static final int d(C3077c c3077c, Context context) {
        C3075a c8;
        AbstractC3159y.i(c3077c, "<this>");
        AbstractC3159y.i(context, "context");
        if (r(context)) {
            c8 = c3077c.b();
        } else {
            c8 = c3077c.c();
        }
        return ColorKt.m3025toArgb8_81llA(c8.a());
    }

    public static final BorderStroke e(MaterialTheme materialTheme, boolean z8, Composer composer, int i8) {
        AbstractC3159y.i(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(983266912, i8, -1, "com.stripe.android.uicore.getBorderStroke (StripeTheme.kt:441)");
        }
        int i9 = MaterialTheme.$stable;
        int i10 = i8 & 14;
        int i11 = i8 & 112;
        BorderStroke m309BorderStrokecXLIe8U = BorderStrokeKt.m309BorderStrokecXLIe8U(h(materialTheme, z8, composer, i9 | i10 | i11), g(materialTheme, z8, composer, i11 | i9 | i10));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m309BorderStrokecXLIe8U;
    }

    public static final int f(C3077c c3077c, Context context) {
        C3075a c8;
        AbstractC3159y.i(c3077c, "<this>");
        AbstractC3159y.i(context, "context");
        if (r(context)) {
            c8 = c3077c.b();
        } else {
            c8 = c3077c.c();
        }
        return ColorKt.m3025toArgb8_81llA(c8.b());
    }

    public static final long g(MaterialTheme materialTheme, boolean z8, Composer composer, int i8) {
        long e8;
        AbstractC3159y.i(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782836080, i8, -1, "com.stripe.android.uicore.getBorderStrokeColor (StripeTheme.kt:435)");
        }
        if (z8) {
            composer.startReplaceableGroup(358101688);
            e8 = n(materialTheme, composer, MaterialTheme.$stable | (i8 & 14)).g().m1178getPrimary0d7_KjU();
        } else {
            composer.startReplaceableGroup(358102528);
            e8 = n(materialTheme, composer, MaterialTheme.$stable | (i8 & 14)).e();
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return e8;
    }

    public static final float h(MaterialTheme materialTheme, boolean z8, Composer composer, int i8) {
        float c8;
        AbstractC3159y.i(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(522405058, i8, -1, "com.stripe.android.uicore.getBorderStrokeWidth (StripeTheme.kt:429)");
        }
        if (z8) {
            composer.startReplaceableGroup(749275062);
            c8 = o(materialTheme, composer, MaterialTheme.$stable | (i8 & 14)).d();
        } else {
            composer.startReplaceableGroup(749276310);
            c8 = o(materialTheme, composer, MaterialTheme.$stable | (i8 & 14)).c();
        }
        float m5178constructorimpl = Dp.m5178constructorimpl(c8);
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m5178constructorimpl;
    }

    public static final TextStyle i(C3077c c3077c, Composer composer, int i8) {
        C3075a c8;
        TextStyle m4719copyv2rsoow;
        AbstractC3159y.i(c3077c, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057860207, i8, -1, "com.stripe.android.uicore.getComposeTextStyle (StripeTheme.kt:570)");
        }
        TextStyle h52 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH5();
        if (DarkThemeKt.isSystemInDarkTheme(composer, 0)) {
            c8 = c3077c.b();
        } else {
            c8 = c3077c.c();
        }
        m4719copyv2rsoow = h52.m4719copyv2rsoow((r48 & 1) != 0 ? h52.spanStyle.m4651getColor0d7_KjU() : c8.c(), (r48 & 2) != 0 ? h52.spanStyle.m4652getFontSizeXSAIIZE() : c3077c.e().b(), (r48 & 4) != 0 ? h52.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? h52.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? h52.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? h52.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? h52.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? h52.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? h52.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? h52.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? h52.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? h52.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? h52.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? h52.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? h52.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(h52.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(h52.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? h52.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? h52.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? h52.platformStyle : null, (r48 & 1048576) != 0 ? h52.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(h52.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(h52.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? h52.paragraphStyle.getTextMotion() : null);
        if (c3077c.e().a() != null) {
            m4719copyv2rsoow = m4719copyv2rsoow.m4719copyv2rsoow((r48 & 1) != 0 ? m4719copyv2rsoow.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? m4719copyv2rsoow.spanStyle.m4652getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? m4719copyv2rsoow.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? m4719copyv2rsoow.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? m4719copyv2rsoow.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? m4719copyv2rsoow.spanStyle.getFontFamily() : FontFamilyKt.FontFamily(FontKt.m4785FontYpTlLL0$default(c3077c.e().a().intValue(), null, 0, 0, 14, null)), (r48 & 64) != 0 ? m4719copyv2rsoow.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? m4719copyv2rsoow.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? m4719copyv2rsoow.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? m4719copyv2rsoow.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? m4719copyv2rsoow.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? m4719copyv2rsoow.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? m4719copyv2rsoow.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? m4719copyv2rsoow.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? m4719copyv2rsoow.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(m4719copyv2rsoow.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(m4719copyv2rsoow.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? m4719copyv2rsoow.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? m4719copyv2rsoow.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? m4719copyv2rsoow.platformStyle : null, (r48 & 1048576) != 0 ? m4719copyv2rsoow.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(m4719copyv2rsoow.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(m4719copyv2rsoow.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? m4719copyv2rsoow.paragraphStyle.getTextMotion() : null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m4719copyv2rsoow;
    }

    public static final ProvidableCompositionLocal j() {
        return f33246e;
    }

    public static final int k(C3077c c3077c, Context context) {
        C3075a c8;
        AbstractC3159y.i(c3077c, "<this>");
        AbstractC3159y.i(context, "context");
        if (r(context)) {
            c8 = c3077c.b();
        } else {
            c8 = c3077c.c();
        }
        return ColorKt.m3025toArgb8_81llA(c8.c());
    }

    public static final int l(C3077c c3077c, Context context) {
        C3075a c8;
        AbstractC3159y.i(c3077c, "<this>");
        AbstractC3159y.i(context, "context");
        if (r(context)) {
            c8 = c3077c.b();
        } else {
            c8 = c3077c.c();
        }
        return ColorKt.m3025toArgb8_81llA(c8.d());
    }

    public static final long m() {
        return f33242a;
    }

    public static final C3082h n(MaterialTheme materialTheme, Composer composer, int i8) {
        AbstractC3159y.i(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1304104896, i8, -1, "com.stripe.android.uicore.<get-stripeColors> (StripeTheme.kt:410)");
        }
        C3082h c3082h = (C3082h) composer.consume(f33243b);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return c3082h;
    }

    public static final C3084j o(MaterialTheme materialTheme, Composer composer, int i8) {
        AbstractC3159y.i(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1758187266, i8, -1, "com.stripe.android.uicore.<get-stripeShapes> (StripeTheme.kt:416)");
        }
        C3084j c3084j = (C3084j) composer.consume(f33244c);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return c3084j;
    }

    public static final n p(MaterialTheme materialTheme, Composer composer, int i8) {
        AbstractC3159y.i(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-589352801, i8, -1, "com.stripe.android.uicore.<get-stripeTypography> (StripeTheme.kt:423)");
        }
        n nVar = (n) composer.consume(f33245d);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nVar;
    }

    public static final int q(C3077c c3077c, Context context) {
        C3075a c8;
        AbstractC3159y.i(c3077c, "<this>");
        AbstractC3159y.i(context, "context");
        if (r(context)) {
            c8 = c3077c.b();
        } else {
            c8 = c3077c.c();
        }
        return ColorKt.m3025toArgb8_81llA(c8.e());
    }

    public static final boolean r(Context context) {
        AbstractC3159y.i(context, "<this>");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static final boolean s(long j8) {
        int m3025toArgb8_81llA = ColorKt.m3025toArgb8_81llA(j8);
        Color.Companion companion = Color.Companion;
        double calculateContrast = ColorUtils.calculateContrast(m3025toArgb8_81llA, ColorKt.m3025toArgb8_81llA(companion.m2997getBlack0d7_KjU()));
        double calculateContrast2 = ColorUtils.calculateContrast(ColorKt.m3025toArgb8_81llA(j8), ColorKt.m3025toArgb8_81llA(companion.m3008getWhite0d7_KjU()));
        if (calculateContrast2 > 2.2d || calculateContrast <= calculateContrast2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle t(TextStyle textStyle) {
        TextStyle m4719copyv2rsoow;
        TextStyle.Companion companion = TextStyle.Companion;
        m4719copyv2rsoow = textStyle.m4719copyv2rsoow((r48 & 1) != 0 ? textStyle.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? textStyle.spanStyle.m4652getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? textStyle.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? textStyle.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(textStyle.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(textStyle.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? textStyle.paragraphStyle.m4605getLineHeightXSAIIZE() : companion.getDefault().m4731getLineHeightXSAIIZE(), (r48 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.platformStyle : new PlatformTextStyle(true), (r48 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : companion.getDefault().getLineHeightStyle(), (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(textStyle.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(textStyle.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
        return m4719copyv2rsoow;
    }

    public static final C3083i u(C3084j c3084j, Composer composer, int i8) {
        AbstractC3159y.i(c3084j, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-530823679, i8, -1, "com.stripe.android.uicore.toComposeShapes (StripeTheme.kt:225)");
        }
        C3083i c3083i = new C3083i(Dp.m5178constructorimpl(c3084j.c()), Dp.m5178constructorimpl(c3084j.d()), Shapes.copy$default(MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable), RoundedCornerShapeKt.m852RoundedCornerShape0680j_4(Dp.m5178constructorimpl(c3084j.e())), RoundedCornerShapeKt.m852RoundedCornerShape0680j_4(Dp.m5178constructorimpl(c3084j.e())), null, 4, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return c3083i;
    }

    public static final Typography v(n nVar, Composer composer, int i8) {
        FontFamily fontFamily;
        FontFamily fontFamily2;
        TextStyle m4719copyv2rsoow;
        FontFamily fontFamily3;
        TextStyle m4719copyv2rsoow2;
        FontFamily fontFamily4;
        TextStyle m4719copyv2rsoow3;
        FontFamily fontFamily5;
        TextStyle m4719copyv2rsoow4;
        FontFamily fontFamily6;
        TextStyle m4719copyv2rsoow5;
        FontFamily fontFamily7;
        TextStyle m4719copyv2rsoow6;
        TextStyle m4719copyv2rsoow7;
        AbstractC3159y.i(nVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1580579333, i8, -1, "com.stripe.android.uicore.toComposeTypography (StripeTheme.kt:239)");
        }
        Integer f8 = nVar.f();
        if (f8 != null) {
            fontFamily = FontFamilyKt.FontFamily(FontKt.m4785FontYpTlLL0$default(f8.intValue(), null, 0, 0, 14, null));
        } else {
            fontFamily = null;
        }
        TextStyle t8 = t(TextStyle.Companion.getDefault());
        if (fontFamily == null) {
            FontFamily k8 = nVar.k();
            if (k8 == null) {
                k8 = FontFamily.Companion.getDefault();
            }
            fontFamily2 = k8;
        } else {
            fontFamily2 = fontFamily;
        }
        long r8 = nVar.r();
        float g8 = nVar.g();
        TextUnitKt.m5378checkArithmeticR2X_6o(r8);
        m4719copyv2rsoow = t8.m4719copyv2rsoow((r48 & 1) != 0 ? t8.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? t8.spanStyle.m4652getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(r8), TextUnit.m5365getValueimpl(r8) * g8), (r48 & 4) != 0 ? t8.spanStyle.getFontWeight() : new FontWeight(nVar.h()), (r48 & 8) != 0 ? t8.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? t8.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? t8.spanStyle.getFontFamily() : fontFamily2, (r48 & 64) != 0 ? t8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? t8.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? t8.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? t8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? t8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? t8.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? t8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? t8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? t8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(t8.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(t8.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? t8.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? t8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? t8.platformStyle : null, (r48 & 1048576) != 0 ? t8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(t8.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(t8.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? t8.paragraphStyle.getTextMotion() : null);
        if (fontFamily == null) {
            FontFamily l8 = nVar.l();
            if (l8 == null) {
                l8 = FontFamily.Companion.getDefault();
            }
            fontFamily3 = l8;
        } else {
            fontFamily3 = fontFamily;
        }
        long n8 = nVar.n();
        float g9 = nVar.g();
        TextUnitKt.m5378checkArithmeticR2X_6o(n8);
        m4719copyv2rsoow2 = t8.m4719copyv2rsoow((r48 & 1) != 0 ? t8.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? t8.spanStyle.m4652getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(n8), TextUnit.m5365getValueimpl(n8) * g9), (r48 & 4) != 0 ? t8.spanStyle.getFontWeight() : new FontWeight(nVar.i()), (r48 & 8) != 0 ? t8.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? t8.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? t8.spanStyle.getFontFamily() : fontFamily3, (r48 & 64) != 0 ? t8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? t8.spanStyle.m4655getLetterSpacingXSAIIZE() : TextUnitKt.getSp(-0.32d), (r48 & 256) != 0 ? t8.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? t8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? t8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? t8.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? t8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? t8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? t8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(t8.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(t8.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? t8.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? t8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? t8.platformStyle : null, (r48 & 1048576) != 0 ? t8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(t8.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(t8.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? t8.paragraphStyle.getTextMotion() : null);
        if (fontFamily == null) {
            FontFamily m8 = nVar.m();
            if (m8 == null) {
                m8 = FontFamily.Companion.getDefault();
            }
            fontFamily4 = m8;
        } else {
            fontFamily4 = fontFamily;
        }
        long p8 = nVar.p();
        float g10 = nVar.g();
        TextUnitKt.m5378checkArithmeticR2X_6o(p8);
        m4719copyv2rsoow3 = t8.m4719copyv2rsoow((r48 & 1) != 0 ? t8.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? t8.spanStyle.m4652getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(p8), TextUnit.m5365getValueimpl(p8) * g10), (r48 & 4) != 0 ? t8.spanStyle.getFontWeight() : new FontWeight(nVar.i()), (r48 & 8) != 0 ? t8.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? t8.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? t8.spanStyle.getFontFamily() : fontFamily4, (r48 & 64) != 0 ? t8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? t8.spanStyle.m4655getLetterSpacingXSAIIZE() : TextUnitKt.getSp(-0.15d), (r48 & 256) != 0 ? t8.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? t8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? t8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? t8.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? t8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? t8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? t8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(t8.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(t8.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? t8.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? t8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? t8.platformStyle : null, (r48 & 1048576) != 0 ? t8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(t8.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(t8.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? t8.paragraphStyle.getTextMotion() : null);
        if (fontFamily == null) {
            FontFamily c8 = nVar.c();
            if (c8 == null) {
                c8 = FontFamily.Companion.getDefault();
            }
            fontFamily5 = c8;
        } else {
            fontFamily5 = fontFamily;
        }
        long o8 = nVar.o();
        float g11 = nVar.g();
        TextUnitKt.m5378checkArithmeticR2X_6o(o8);
        m4719copyv2rsoow4 = t8.m4719copyv2rsoow((r48 & 1) != 0 ? t8.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? t8.spanStyle.m4652getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(o8), TextUnit.m5365getValueimpl(o8) * g11), (r48 & 4) != 0 ? t8.spanStyle.getFontWeight() : new FontWeight(nVar.j()), (r48 & 8) != 0 ? t8.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? t8.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? t8.spanStyle.getFontFamily() : fontFamily5, (r48 & 64) != 0 ? t8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? t8.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? t8.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? t8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? t8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? t8.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? t8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? t8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? t8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(t8.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(t8.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? t8.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? t8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? t8.platformStyle : null, (r48 & 1048576) != 0 ? t8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(t8.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(t8.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? t8.paragraphStyle.getTextMotion() : null);
        if (fontFamily == null) {
            FontFamily q8 = nVar.q();
            if (q8 == null) {
                q8 = FontFamily.Companion.getDefault();
            }
            fontFamily6 = q8;
        } else {
            fontFamily6 = fontFamily;
        }
        long o9 = nVar.o();
        float g12 = nVar.g();
        TextUnitKt.m5378checkArithmeticR2X_6o(o9);
        m4719copyv2rsoow5 = t8.m4719copyv2rsoow((r48 & 1) != 0 ? t8.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? t8.spanStyle.m4652getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(o9), TextUnit.m5365getValueimpl(o9) * g12), (r48 & 4) != 0 ? t8.spanStyle.getFontWeight() : new FontWeight(nVar.j()), (r48 & 8) != 0 ? t8.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? t8.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? t8.spanStyle.getFontFamily() : fontFamily6, (r48 & 64) != 0 ? t8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? t8.spanStyle.m4655getLetterSpacingXSAIIZE() : TextUnitKt.getSp(-0.15d), (r48 & 256) != 0 ? t8.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? t8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? t8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? t8.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? t8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? t8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? t8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(t8.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(t8.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? t8.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? t8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? t8.platformStyle : null, (r48 & 1048576) != 0 ? t8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(t8.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(t8.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? t8.paragraphStyle.getTextMotion() : null);
        if (fontFamily == null) {
            FontFamily e8 = nVar.e();
            if (e8 == null) {
                e8 = FontFamily.Companion.getDefault();
            }
            fontFamily7 = e8;
        } else {
            fontFamily7 = fontFamily;
        }
        long s8 = nVar.s();
        float g13 = nVar.g();
        TextUnitKt.m5378checkArithmeticR2X_6o(s8);
        m4719copyv2rsoow6 = t8.m4719copyv2rsoow((r48 & 1) != 0 ? t8.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? t8.spanStyle.m4652getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(s8), TextUnit.m5365getValueimpl(s8) * g13), (r48 & 4) != 0 ? t8.spanStyle.getFontWeight() : new FontWeight(nVar.i()), (r48 & 8) != 0 ? t8.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? t8.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? t8.spanStyle.getFontFamily() : fontFamily7, (r48 & 64) != 0 ? t8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? t8.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? t8.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? t8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? t8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? t8.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? t8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? t8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? t8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(t8.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(t8.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? t8.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? t8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? t8.platformStyle : null, (r48 & 1048576) != 0 ? t8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(t8.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(t8.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? t8.paragraphStyle.getTextMotion() : null);
        if (fontFamily == null && (fontFamily = nVar.d()) == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily8 = fontFamily;
        long t9 = nVar.t();
        float g14 = nVar.g();
        TextUnitKt.m5378checkArithmeticR2X_6o(t9);
        m4719copyv2rsoow7 = t8.m4719copyv2rsoow((r48 & 1) != 0 ? t8.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? t8.spanStyle.m4652getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(t9), TextUnit.m5365getValueimpl(t9) * g14), (r48 & 4) != 0 ? t8.spanStyle.getFontWeight() : new FontWeight(nVar.j()), (r48 & 8) != 0 ? t8.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? t8.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? t8.spanStyle.getFontFamily() : fontFamily8, (r48 & 64) != 0 ? t8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? t8.spanStyle.m4655getLetterSpacingXSAIIZE() : TextUnitKt.getSp(-0.15d), (r48 & 256) != 0 ? t8.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? t8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? t8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? t8.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? t8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? t8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? t8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(t8.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(t8.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? t8.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? t8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? t8.platformStyle : null, (r48 & 1048576) != 0 ? t8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(t8.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(t8.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? t8.paragraphStyle.getTextMotion() : null);
        Typography typography = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable);
        Typography copy = typography.copy(t(typography.getH1()), t(typography.getH2()), t(typography.getH3()), m4719copyv2rsoow, m4719copyv2rsoow2, m4719copyv2rsoow3, m4719copyv2rsoow5, t(typography.getSubtitle2()), m4719copyv2rsoow4, m4719copyv2rsoow7, t(typography.getButton()), m4719copyv2rsoow6, t(typography.getOverline()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return copy;
    }
}
