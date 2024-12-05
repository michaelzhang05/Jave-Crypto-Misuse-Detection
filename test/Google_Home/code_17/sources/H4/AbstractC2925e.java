package h4;

import a6.InterfaceC1668n;
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
import h4.C2927f;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;
import x4.AbstractC4190b;
import x4.AbstractC4191c;

/* renamed from: h4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2925e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2927f f32585a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f32586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2927f c2927f, Context context) {
            super(0);
            this.f32585a = c2927f;
            this.f32586b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5587invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5587invoke() {
            this.f32586b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f32585a.f())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2927f f32588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C2927f c2927f, int i8) {
            super(2);
            this.f32587a = z8;
            this.f32588b = c2927f;
            this.f32589c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2925e.a(this.f32587a, this.f32588b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32589c | 1));
        }
    }

    public static final void a(boolean z8, C2927f element, Composer composer, int i8) {
        int i9;
        int i10;
        ColorFilter m3017tintxETnrds$default;
        AbstractC3255y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(1959271317);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1959271317, i8, -1, "com.stripe.android.ui.core.elements.AfterpayClearpayElementUI (AfterpayClearpayElementUI.kt:27)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = context.getResources();
        AbstractC3255y.h(resources, "getResources(...)");
        String A8 = j6.n.A(element.g(resources), "<img/>", "<img src=\"afterpay\"/>", false, 4, null);
        C2927f.a aVar = C2927f.f32594e;
        if (aVar.a()) {
            i9 = e4.k.f31664c;
        } else {
            i9 = e4.k.f31663b;
        }
        if (aVar.a()) {
            i10 = e4.n.f31718Y;
        } else {
            i10 = e4.n.f31706M;
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i11 = MaterialTheme.$stable;
        if (AbstractC3441m.s(materialTheme.getColors(startRestartGroup, i11).m1187getSurface0d7_KjU())) {
            m3017tintxETnrds$default = null;
        } else {
            m3017tintxETnrds$default = ColorFilter.Companion.m3017tintxETnrds$default(ColorFilter.Companion, Color.Companion.m3013getWhite0d7_KjU(), 0, 2, null);
        }
        Map e8 = P5.Q.e(O5.x.a("afterpay", new AbstractC4190b.a(i9, i10, m3017tintxETnrds$default)));
        float f8 = 4;
        AbstractC4191c.b(A8, PaddingKt.m608paddingqDBjuR0(Modifier.Companion, Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(8), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f8)), e8, AbstractC3441m.n(materialTheme, startRestartGroup, i11).j(), materialTheme.getTypography(startRestartGroup, i11).getH6(), z8, new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (AbstractC3247p) null), PlaceholderVerticalAlign.Companion.m4629getBottomJ6kI3mc(), new a(element, context), startRestartGroup, (AbstractC4190b.a.f40679d << 6) | 1572912 | ((i8 << 15) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, element, i8));
        }
    }
}
