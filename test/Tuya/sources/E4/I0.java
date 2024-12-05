package e4;

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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class I0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f30389b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f30390c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30391d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f30392e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30393f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f30394g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e4.I0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0731a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30395a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0731a(String str) {
                super(2);
                this.f30395a = str;
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
                    ComposerKt.traceEventStart(1346550194, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:45)");
                }
                m4.F.a(this.f30395a, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f30396a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0 function0) {
                super(0);
                this.f30396a = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5580invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5580invoke() {
                this.f30396a.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f30397a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30398b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f30399c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: e4.I0$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0732a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0 f30400a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0732a(Function0 function0) {
                    super(0);
                    this.f30400a = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5581invoke();
                    return L5.I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5581invoke() {
                    this.f30400a.invoke();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3160z implements X5.o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f30401a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f30402b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str, boolean z8) {
                    super(3);
                    this.f30401a = str;
                    this.f30402b = z8;
                }

                @Override // X5.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return L5.I.f6487a;
                }

                public final void invoke(RowScope TextButton, Composer composer, int i8) {
                    long m3007getUnspecified0d7_KjU;
                    AbstractC3159y.i(TextButton, "$this$TextButton");
                    if ((i8 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1956887564, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:55)");
                    }
                    String str = this.f30401a;
                    composer.startReplaceableGroup(399781910);
                    if (this.f30402b) {
                        m3007getUnspecified0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1172getError0d7_KjU();
                    } else {
                        m3007getUnspecified0d7_KjU = Color.Companion.m3007getUnspecified0d7_KjU();
                    }
                    long j8 = m3007getUnspecified0d7_KjU;
                    composer.endReplaceableGroup();
                    TextKt.m1414Text4IGK_g(str, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Function0 function0, String str, boolean z8) {
                super(2);
                this.f30397a = function0;
                this.f30398b = str;
                this.f30399c = z8;
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
                    ComposerKt.traceEventStart(707616169, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:49)");
                }
                Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog_confirm_button");
                composer.startReplaceableGroup(-1803938456);
                boolean changed = composer.changed(this.f30397a);
                Function0 function0 = this.f30397a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0732a(function0);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.TextButton((Function0) rememberedValue, testTag, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 1956887564, true, new b(this.f30398b, this.f30399c)), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f30403a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30404b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: e4.I0$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0733a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0 f30405a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0733a(Function0 function0) {
                    super(0);
                    this.f30405a = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5582invoke();
                    return L5.I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5582invoke() {
                    this.f30405a.invoke();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3160z implements X5.o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f30406a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str) {
                    super(3);
                    this.f30406a = str;
                }

                @Override // X5.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return L5.I.f6487a;
                }

                public final void invoke(RowScope TextButton, Composer composer, int i8) {
                    AbstractC3159y.i(TextButton, "$this$TextButton");
                    if ((i8 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180812490, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:72)");
                    }
                    TextKt.m1414Text4IGK_g(this.f30406a, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Function0 function0, String str) {
                super(2);
                this.f30403a = function0;
                this.f30404b = str;
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
                    ComposerKt.traceEventStart(-1068458905, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:66)");
                }
                Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog_dismiss_button");
                composer.startReplaceableGroup(-1803919448);
                boolean changed = composer.changed(this.f30403a);
                Function0 function0 = this.f30403a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0733a(function0);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.TextButton((Function0) rememberedValue, testTag, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 180812490, true, new b(this.f30404b)), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30407a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str) {
                super(2);
                this.f30407a = str;
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
                    ComposerKt.traceEventStart(-1956496442, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:41)");
                }
                AbstractC2612h0.a(this.f30407a, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Function0 function0, Function0 function02, String str2, boolean z8, String str3, String str4) {
            super(2);
            this.f30388a = str;
            this.f30389b = function0;
            this.f30390c = function02;
            this.f30391d = str2;
            this.f30392e = z8;
            this.f30393f = str3;
            this.f30394g = str4;
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
                ComposerKt.traceEventStart(-1799194383, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous> (SimpleDialogElementUI.kt:35)");
            }
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog");
            String str = this.f30388a;
            ComposableLambda composableLambda = str != null ? ComposableLambdaKt.composableLambda(composer, 1346550194, true, new C0731a(str)) : null;
            composer.startReplaceableGroup(-1105766663);
            boolean changed = composer.changed(this.f30389b);
            Function0 function0 = this.f30389b;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new b(function0);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AndroidAlertDialog_androidKt.m1098AlertDialog6oU6zVQ((Function0) rememberedValue, ComposableLambdaKt.composableLambda(composer, 707616169, true, new c(this.f30390c, this.f30391d, this.f30392e)), testTag, ComposableLambdaKt.composableLambda(composer, -1068458905, true, new d(this.f30389b, this.f30393f)), ComposableLambdaKt.composableLambda(composer, -1956496442, true, new e(this.f30394g)), composableLambda, null, 0L, 0L, null, composer, 28080, 960);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30408a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30409b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30410c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30411d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f30412e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f30413f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f30414g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f30415h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f30416i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, String str4, boolean z8, Function0 function0, Function0 function02, int i8, int i9) {
            super(2);
            this.f30408a = str;
            this.f30409b = str2;
            this.f30410c = str3;
            this.f30411d = str4;
            this.f30412e = z8;
            this.f30413f = function0;
            this.f30414g = function02;
            this.f30415h = i8;
            this.f30416i = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            I0.a(this.f30408a, this.f30409b, this.f30410c, this.f30411d, this.f30412e, this.f30413f, this.f30414g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30415h | 1), this.f30416i);
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
        throw new UnsupportedOperationException("Method not decompiled: e4.I0.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
