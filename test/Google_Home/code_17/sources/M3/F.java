package M3;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;
import m4.C3440l;

/* loaded from: classes4.dex */
public abstract class F {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6495a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f6496b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6497c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Typeface f6498d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, long j8, long j9, Typeface typeface) {
            super(2);
            this.f6495a = i8;
            this.f6496b = j8;
            this.f6497c = j9;
            this.f6498d = typeface;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983637009, i8, -1, "com.stripe.android.paymentsheet.ui.EditButton.<anonymous> (PaymentSheetTopBar.kt:133)");
            }
            String upperCase = StringResources_androidKt.stringResource(this.f6495a, composer, 0).toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            long j8 = this.f6496b;
            long j9 = this.f6497c;
            Typeface editButtonTypeface = this.f6498d;
            AbstractC3255y.h(editButtonTypeface, "$editButtonTypeface");
            TextKt.m1419Text4IGK_g(upperCase, (Modifier) null, j8, j9, (FontStyle) null, (FontWeight) null, AndroidTypeface_androidKt.FontFamily(editButtonTypeface), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 130994);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6500b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6501c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6502d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6503e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i8, boolean z8, long j8, Function0 function0, int i9) {
            super(2);
            this.f6499a = i8;
            this.f6500b = z8;
            this.f6501c = j8;
            this.f6502d = function0;
            this.f6503e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            F.a(this.f6499a, this.f6500b, this.f6501c, this.f6502d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6503e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f6504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f6507d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6508e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6509f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G g8, boolean z8, Function0 function0, float f8, int i8, int i9) {
            super(2);
            this.f6504a = g8;
            this.f6505b = z8;
            this.f6506c = function0;
            this.f6507d = f8;
            this.f6508e = i8;
            this.f6509f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            F.b(this.f6504a, this.f6505b, this.f6506c, this.f6507d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6508e | 1), this.f6509f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f6510a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(G g8) {
            super(2);
            this.f6510a = g8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(477178712, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:68)");
            }
            if (this.f6510a.f()) {
                F.d(composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextInputService f6512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6513c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f6514d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f6515e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextInputService f6516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f6517b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TextInputService textInputService, Function0 function0) {
                super(0);
                this.f6516a = textInputService;
                this.f6517b = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m21invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21invoke() {
                TextInputService textInputService = this.f6516a;
                if (textInputService != null) {
                    textInputService.hideSoftwareKeyboard();
                }
                this.f6517b.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G f6518a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f6519b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(G g8, long j8) {
                super(2);
                this.f6518a = g8;
                this.f6519b = j8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return O5.I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-430730, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous>.<anonymous> (PaymentSheetTopBar.kt:82)");
                }
                IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(this.f6518a.c(), composer, 0), StringResources_androidKt.stringResource(this.f6518a.a(), composer, 0), (Modifier) null, this.f6519b, composer, 8, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, TextInputService textInputService, Function0 function0, G g8, long j8) {
            super(2);
            this.f6511a = z8;
            this.f6512b = textInputService;
            this.f6513c = function0;
            this.f6514d = g8;
            this.f6515e = j8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1292292902, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:73)");
            }
            IconButtonKt.IconButton(new a(this.f6512b, this.f6513c), TestTagKt.testTag(Modifier.Companion, "SHEET_NAVIGATION_BUTTON_TAG"), this.f6511a, null, ComposableLambdaKt.composableLambda(composer, -430730, true, new b(this.f6514d, this.f6515e)), composer, 24624, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f6520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6522c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(G g8, boolean z8, long j8) {
            super(3);
            this.f6520a = g8;
            this.f6521b = z8;
            this.f6522c = j8;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(RowScope TopAppBar, Composer composer, int i8) {
            AbstractC3255y.i(TopAppBar, "$this$TopAppBar");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(858400579, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:92)");
            }
            if (this.f6520a.e()) {
                F.a(this.f6520a.b(), this.f6521b, this.f6522c, this.f6520a.d(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f6523a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f6525c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6526d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6527e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(G g8, boolean z8, float f8, Function0 function0, int i8) {
            super(2);
            this.f6523a = g8;
            this.f6524b = z8;
            this.f6525c = f8;
            this.f6526d = function0;
            this.f6527e = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            F.c(this.f6523a, this.f6524b, this.f6525c, this.f6526d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6527e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8) {
            super(2);
            this.f6528a = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            F.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.f6528a | 1));
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
            m4.n p8 = AbstractC3441m.p(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable);
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
                rememberedValue2 = TextUnit.m5360boximpl(density.mo455toSp0xMU5do(Dp.m5183constructorimpl(Dp.m5183constructorimpl(TextUnit.m5370getValueimpl(C3440l.f35212a.f().p())) * p8.g())));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            long m5379unboximpl = ((TextUnit) rememberedValue2).m5379unboximpl();
            startRestartGroup.endReplaceableGroup();
            IconButtonKt.IconButton(function0, PaddingKt.m609paddingqDBjuR0$default(TestTagKt.testTag(Modifier.Companion, "PaymentSheetEditButton"), 0.0f, 0.0f, Dp.m5183constructorimpl(10), 0.0f, 11, null), z8, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1983637009, true, new a(i8, j8, m5379unboximpl, typeface2)), startRestartGroup, ((i10 >> 9) & 14) | 24624 | ((i10 << 3) & 896), 8);
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
        AbstractC3255y.i(handleBackPressed, "handleBackPressed");
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
                f8 = Dp.m5183constructorimpl(0);
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
        AbstractC3255y.i(state, "state");
        AbstractC3255y.i(onNavigationIconPressed, "onNavigationIconPressed");
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
            long c8 = AbstractC3441m.n(materialTheme, startRestartGroup, i15).c();
            long m1187getSurface0d7_KjU = materialTheme.getColors(startRestartGroup, i15).m1187getSurface0d7_KjU();
            composer2 = startRestartGroup;
            AppBarKt.m1112TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(startRestartGroup, 477178712, true, new d(state)), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1292292902, true, new e(z8, textInputService, onNavigationIconPressed, state, c8)), ComposableLambdaKt.composableLambda(startRestartGroup, 858400579, true, new f(state, z8, c8)), m1187getSurface0d7_KjU, 0L, f8, composer2, ((i14 << 12) & 3670016) | 3462, 34);
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
            long colorResource = ColorResources_androidKt.colorResource(t3.r.f39706d, startRestartGroup, 0);
            long colorResource2 = ColorResources_androidKt.colorResource(t3.r.f39707e, startRestartGroup, 0);
            Modifier m606paddingVpY3zN4 = PaddingKt.m606paddingVpY3zN4(BackgroundKt.m286backgroundbw27NRU(Modifier.Companion, colorResource, RoundedCornerShapeKt.m857RoundedCornerShape0680j_4(Dp.m5183constructorimpl(5))), Dp.m5183constructorimpl(6), Dp.m5183constructorimpl(2));
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m606paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m1419Text4IGK_g("TEST MODE", (Modifier) null, colorResource2, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 196614, 0, 131034);
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
