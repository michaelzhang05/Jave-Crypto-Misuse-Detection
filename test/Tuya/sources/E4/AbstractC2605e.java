package e4;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import e4.C2607f;
import j4.AbstractC3087m;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import u4.AbstractC3805b;
import u4.AbstractC3806c;

/* renamed from: e4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2605e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2607f f30664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2607f c2607f, Context context) {
            super(0);
            this.f30664a = c2607f;
            this.f30665b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5583invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5583invoke() {
            this.f30665b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f30664a.f())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2607f f30667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C2607f c2607f, int i8) {
            super(2);
            this.f30666a = z8;
            this.f30667b = c2607f;
            this.f30668c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2605e.a(this.f30666a, this.f30667b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30668c | 1));
        }
    }

    public static final void a(boolean z8, C2607f element, Composer composer, int i8) {
        int i9;
        int i10;
        ColorFilter m3012tintxETnrds$default;
        AbstractC3159y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(1959271317);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1959271317, i8, -1, "com.stripe.android.ui.core.elements.AfterpayClearpayElementUI (AfterpayClearpayElementUI.kt:27)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = context.getResources();
        AbstractC3159y.h(resources, "getResources(...)");
        String A8 = g6.n.A(element.g(resources), "<img/>", "<img src=\"afterpay\"/>", false, 4, null);
        C2607f.a aVar = C2607f.f30673e;
        if (aVar.a()) {
            i9 = b4.k.f14658c;
        } else {
            i9 = b4.k.f14657b;
        }
        if (aVar.a()) {
            i10 = b4.n.f14712Y;
        } else {
            i10 = b4.n.f14700M;
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i11 = MaterialTheme.$stable;
        if (AbstractC3087m.s(materialTheme.getColors(startRestartGroup, i11).m1182getSurface0d7_KjU())) {
            m3012tintxETnrds$default = null;
        } else {
            m3012tintxETnrds$default = ColorFilter.Companion.m3012tintxETnrds$default(ColorFilter.Companion, Color.Companion.m3008getWhite0d7_KjU(), 0, 2, null);
        }
        Map e8 = M5.Q.e(L5.x.a("afterpay", new AbstractC3805b.a(i9, i10, m3012tintxETnrds$default)));
        float f8 = 4;
        AbstractC3806c.b(A8, PaddingKt.m603paddingqDBjuR0(Modifier.Companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8)), e8, AbstractC3087m.n(materialTheme, startRestartGroup, i11).j(), materialTheme.getTypography(startRestartGroup, i11).getH6(), z8, new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (AbstractC3151p) null), PlaceholderVerticalAlign.Companion.m4624getBottomJ6kI3mc(), new a(element, context), startRestartGroup, (AbstractC3805b.a.f38495d << 6) | 1572912 | ((i8 << 15) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, element, i8));
        }
    }
}
