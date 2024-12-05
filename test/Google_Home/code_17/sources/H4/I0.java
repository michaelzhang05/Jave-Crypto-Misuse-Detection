package h4;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class I0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32309a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f32310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f32311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32312d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f32313e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f32314f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f32315g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h4.I0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0757a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f32316a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0757a(String str) {
                super(2);
                this.f32316a = str;
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
                    ComposerKt.traceEventStart(1346550194, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:45)");
                }
                p4.F.a(this.f32316a, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f32317a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0 function0) {
                super(0);
                this.f32317a = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5584invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5584invoke() {
                this.f32317a.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f32318a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f32319b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f32320c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: h4.I0$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0758a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0 f32321a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0758a(Function0 function0) {
                    super(0);
                    this.f32321a = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5585invoke();
                    return O5.I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5585invoke() {
                    this.f32321a.invoke();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3256z implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f32322a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f32323b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str, boolean z8) {
                    super(3);
                    this.f32322a = str;
                    this.f32323b = z8;
                }

                @Override // a6.InterfaceC1669o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return O5.I.f8278a;
                }

                public final void invoke(RowScope TextButton, Composer composer, int i8) {
                    long m3012getUnspecified0d7_KjU;
                    AbstractC3255y.i(TextButton, "$this$TextButton");
                    if ((i8 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1956887564, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:55)");
                    }
                    String str = this.f32322a;
                    composer.startReplaceableGroup(399781910);
                    if (this.f32323b) {
                        m3012getUnspecified0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1177getError0d7_KjU();
                    } else {
                        m3012getUnspecified0d7_KjU = Color.Companion.m3012getUnspecified0d7_KjU();
                    }
                    long j8 = m3012getUnspecified0d7_KjU;
                    composer.endReplaceableGroup();
                    TextKt.m1419Text4IGK_g(str, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Function0 function0, String str, boolean z8) {
                super(2);
                this.f32318a = function0;
                this.f32319b = str;
                this.f32320c = z8;
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
                    ComposerKt.traceEventStart(707616169, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:49)");
                }
                Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog_confirm_button");
                composer.startReplaceableGroup(-1803938456);
                boolean changed = composer.changed(this.f32318a);
                Function0 function0 = this.f32318a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0758a(function0);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.TextButton((Function0) rememberedValue, testTag, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 1956887564, true, new b(this.f32319b, this.f32320c)), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f32324a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f32325b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: h4.I0$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0759a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0 f32326a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0759a(Function0 function0) {
                    super(0);
                    this.f32326a = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5586invoke();
                    return O5.I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5586invoke() {
                    this.f32326a.invoke();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3256z implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f32327a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str) {
                    super(3);
                    this.f32327a = str;
                }

                @Override // a6.InterfaceC1669o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return O5.I.f8278a;
                }

                public final void invoke(RowScope TextButton, Composer composer, int i8) {
                    AbstractC3255y.i(TextButton, "$this$TextButton");
                    if ((i8 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180812490, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:72)");
                    }
                    TextKt.m1419Text4IGK_g(this.f32327a, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Function0 function0, String str) {
                super(2);
                this.f32324a = function0;
                this.f32325b = str;
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
                    ComposerKt.traceEventStart(-1068458905, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:66)");
                }
                Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog_dismiss_button");
                composer.startReplaceableGroup(-1803919448);
                boolean changed = composer.changed(this.f32324a);
                Function0 function0 = this.f32324a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0759a(function0);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.TextButton((Function0) rememberedValue, testTag, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 180812490, true, new b(this.f32325b)), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f32328a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str) {
                super(2);
                this.f32328a = str;
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
                    ComposerKt.traceEventStart(-1956496442, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:41)");
                }
                AbstractC2932h0.a(this.f32328a, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Function0 function0, Function0 function02, String str2, boolean z8, String str3, String str4) {
            super(2);
            this.f32309a = str;
            this.f32310b = function0;
            this.f32311c = function02;
            this.f32312d = str2;
            this.f32313e = z8;
            this.f32314f = str3;
            this.f32315g = str4;
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
                ComposerKt.traceEventStart(-1799194383, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous> (SimpleDialogElementUI.kt:35)");
            }
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog");
            String str = this.f32309a;
            ComposableLambda composableLambda = str != null ? ComposableLambdaKt.composableLambda(composer, 1346550194, true, new C0757a(str)) : null;
            composer.startReplaceableGroup(-1105766663);
            boolean changed = composer.changed(this.f32310b);
            Function0 function0 = this.f32310b;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new b(function0);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AndroidAlertDialog_androidKt.m1103AlertDialog6oU6zVQ((Function0) rememberedValue, ComposableLambdaKt.composableLambda(composer, 707616169, true, new c(this.f32311c, this.f32312d, this.f32313e)), testTag, ComposableLambdaKt.composableLambda(composer, -1068458905, true, new d(this.f32310b, this.f32314f)), ComposableLambdaKt.composableLambda(composer, -1956496442, true, new e(this.f32315g)), composableLambda, null, 0L, 0L, null, composer, 28080, 960);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f32331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32332d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f32333e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f32334f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f32335g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f32336h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f32337i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, String str4, boolean z8, Function0 function0, Function0 function02, int i8, int i9) {
            super(2);
            this.f32329a = str;
            this.f32330b = str2;
            this.f32331c = str3;
            this.f32332d = str4;
            this.f32333e = z8;
            this.f32334f = function0;
            this.f32335g = function02;
            this.f32336h = i8;
            this.f32337i = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            I0.a(this.f32329a, this.f32330b, this.f32331c, this.f32332d, this.f32333e, this.f32334f, this.f32335g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32336h | 1), this.f32337i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.I0.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
