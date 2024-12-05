package J3;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.content.res.ResourcesCompat;
import j4.AbstractC3087m;
import j4.C3086l;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class F {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f4790b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4791c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Typeface f4792d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, long j8, long j9, Typeface typeface) {
            super(2);
            this.f4789a = i8;
            this.f4790b = j8;
            this.f4791c = j9;
            this.f4792d = typeface;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983637009, i8, -1, "com.stripe.android.paymentsheet.ui.EditButton.<anonymous> (PaymentSheetTopBar.kt:133)");
            }
            String upperCase = StringResources_androidKt.stringResource(this.f4789a, composer, 0).toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            long j8 = this.f4790b;
            long j9 = this.f4791c;
            Typeface editButtonTypeface = this.f4792d;
            AbstractC3159y.h(editButtonTypeface, "$editButtonTypeface");
            TextKt.m1414Text4IGK_g(upperCase, (Modifier) null, j8, j9, (FontStyle) null, (FontWeight) null, AndroidTypeface_androidKt.FontFamily(editButtonTypeface), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 130994);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4794b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4795c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f4796d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4797e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i8, boolean z8, long j8, Function0 function0, int i9) {
            super(2);
            this.f4793a = i8;
            this.f4794b = z8;
            this.f4795c = j8;
            this.f4796d = function0;
            this.f4797e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            F.a(this.f4793a, this.f4794b, this.f4795c, this.f4796d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4797e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f4798a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f4800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4801d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4802e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4803f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G g8, boolean z8, Function0 function0, float f8, int i8, int i9) {
            super(2);
            this.f4798a = g8;
            this.f4799b = z8;
            this.f4800c = function0;
            this.f4801d = f8;
            this.f4802e = i8;
            this.f4803f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            F.b(this.f4798a, this.f4799b, this.f4800c, this.f4801d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4802e | 1), this.f4803f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f4804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(G g8) {
            super(2);
            this.f4804a = g8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(477178712, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:68)");
            }
            if (this.f4804a.f()) {
                F.d(composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextInputService f4806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f4807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f4808d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f4809e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextInputService f4810a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f4811b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TextInputService textInputService, Function0 function0) {
                super(0);
                this.f4810a = textInputService;
                this.f4811b = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m16invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16invoke() {
                TextInputService textInputService = this.f4810a;
                if (textInputService != null) {
                    textInputService.hideSoftwareKeyboard();
                }
                this.f4811b.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G f4812a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f4813b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(G g8, long j8) {
                super(2);
                this.f4812a = g8;
                this.f4813b = j8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return L5.I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-430730, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous>.<anonymous> (PaymentSheetTopBar.kt:82)");
                }
                IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(this.f4812a.c(), composer, 0), StringResources_androidKt.stringResource(this.f4812a.a(), composer, 0), (Modifier) null, this.f4813b, composer, 8, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, TextInputService textInputService, Function0 function0, G g8, long j8) {
            super(2);
            this.f4805a = z8;
            this.f4806b = textInputService;
            this.f4807c = function0;
            this.f4808d = g8;
            this.f4809e = j8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1292292902, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:73)");
            }
            IconButtonKt.IconButton(new a(this.f4806b, this.f4807c), TestTagKt.testTag(Modifier.Companion, "SHEET_NAVIGATION_BUTTON_TAG"), this.f4805a, null, ComposableLambdaKt.composableLambda(composer, -430730, true, new b(this.f4808d, this.f4809e)), composer, 24624, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f4814a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4815b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4816c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(G g8, boolean z8, long j8) {
            super(3);
            this.f4814a = g8;
            this.f4815b = z8;
            this.f4816c = j8;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(RowScope TopAppBar, Composer composer, int i8) {
            AbstractC3159y.i(TopAppBar, "$this$TopAppBar");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(858400579, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:92)");
            }
            if (this.f4814a.e()) {
                F.a(this.f4814a.b(), this.f4815b, this.f4816c, this.f4814a.d(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f4817a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4819c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f4820d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4821e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(G g8, boolean z8, float f8, Function0 function0, int i8) {
            super(2);
            this.f4817a = g8;
            this.f4818b = z8;
            this.f4819c = f8;
            this.f4820d = function0;
            this.f4821e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            F.c(this.f4817a, this.f4818b, this.f4819c, this.f4820d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4821e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8) {
            super(2);
            this.f4822a = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            F.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.f4822a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i8, boolean z8, long j8, Function0 function0, Composer composer, int i9) {
        int i10;
        Typeface typeface;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-555214987);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(i8)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555214987, i10, -1, "com.stripe.android.paymentsheet.ui.EditButton (PaymentSheetTopBar.kt:110)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            j4.n p8 = AbstractC3087m.p(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable);
            startRestartGroup.startReplaceableGroup(-1272534780);
            boolean changed = startRestartGroup.changed(p8);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                Integer f8 = p8.f();
                if (f8 == null || (typeface = ResourcesCompat.getFont(context, f8.intValue())) == null) {
                    typeface = Typeface.DEFAULT;
                }
                rememberedValue = typeface;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Typeface typeface2 = (Typeface) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1272529119);
            boolean changed2 = startRestartGroup.changed(p8);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = TextUnit.m5355boximpl(density.mo450toSp0xMU5do(Dp.m5178constructorimpl(Dp.m5178constructorimpl(TextUnit.m5365getValueimpl(C3086l.f33236a.f().p())) * p8.g())));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            long m5374unboximpl = ((TextUnit) rememberedValue2).m5374unboximpl();
            startRestartGroup.endReplaceableGroup();
            IconButtonKt.IconButton(function0, PaddingKt.m604paddingqDBjuR0$default(TestTagKt.testTag(Modifier.Companion, "PaymentSheetEditButton"), 0.0f, 0.0f, Dp.m5178constructorimpl(10), 0.0f, 11, null), z8, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1983637009, true, new a(i8, j8, m5374unboximpl, typeface2)), startRestartGroup, ((i10 >> 9) & 14) | 24624 | ((i10 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(i8, z8, j8, function0, i9));
        }
    }

    public static final void b(G g8, boolean z8, Function0 handleBackPressed, float f8, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC3159y.i(handleBackPressed, "handleBackPressed");
        Composer startRestartGroup = composer.startRestartGroup(1055582764);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(g8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(handleBackPressed)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        int i15 = i9 & 8;
        if (i15 != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(f8)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i15 != 0) {
                f8 = Dp.m5178constructorimpl(0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055582764, i10, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar (PaymentSheetTopBar.kt:45)");
            }
            if (g8 != null) {
                c(g8, z8, f8, handleBackPressed, startRestartGroup, (i10 & 126) | ((i10 >> 3) & 896) | ((i10 << 3) & 7168));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        float f9 = f8;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(g8, z8, handleBackPressed, f9, i8, i9));
        }
    }

    public static final void c(G state, boolean z8, float f8, Function0 onNavigationIconPressed, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3159y.i(state, "state");
        AbstractC3159y.i(onNavigationIconPressed, "onNavigationIconPressed");
        Composer startRestartGroup = composer.startRestartGroup(-1941081964);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(state)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(f8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(onNavigationIconPressed)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        int i14 = i9;
        if ((i14 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1941081964, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar (PaymentSheetTopBar.kt:62)");
            }
            TextInputService textInputService = (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            long c8 = AbstractC3087m.n(materialTheme, startRestartGroup, i15).c();
            long m1182getSurface0d7_KjU = materialTheme.getColors(startRestartGroup, i15).m1182getSurface0d7_KjU();
            composer2 = startRestartGroup;
            AppBarKt.m1107TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(startRestartGroup, 477178712, true, new d(state)), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1292292902, true, new e(z8, textInputService, onNavigationIconPressed, state, c8)), ComposableLambdaKt.composableLambda(startRestartGroup, 858400579, true, new f(state, z8, c8)), m1182getSurface0d7_KjU, 0L, f8, composer2, ((i14 << 12) & 3670016) | 3462, 34);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(state, z8, f8, onNavigationIconPressed, i8));
        }
    }

    public static final void d(Composer composer, int i8) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1806667293);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1806667293, i8, -1, "com.stripe.android.paymentsheet.ui.TestModeBadge (PaymentSheetTopBar.kt:144)");
            }
            long colorResource = ColorResources_androidKt.colorResource(q3.r.f37384d, startRestartGroup, 0);
            long colorResource2 = ColorResources_androidKt.colorResource(q3.r.f37385e, startRestartGroup, 0);
            Modifier m601paddingVpY3zN4 = PaddingKt.m601paddingVpY3zN4(BackgroundKt.m281backgroundbw27NRU(Modifier.Companion, colorResource, RoundedCornerShapeKt.m852RoundedCornerShape0680j_4(Dp.m5178constructorimpl(5))), Dp.m5178constructorimpl(6), Dp.m5178constructorimpl(2));
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m601paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m1414Text4IGK_g("TEST MODE", (Modifier) null, colorResource2, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 196614, 0, 131034);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h(i8));
        }
    }
}
