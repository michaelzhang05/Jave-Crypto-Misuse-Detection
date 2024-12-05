package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt$AlertDialog$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ InterfaceC1668n $confirmButton;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ InterfaceC1668n $dismissButton;
    final /* synthetic */ InterfaceC1668n $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ InterfaceC1668n $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ InterfaceC1668n $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1668n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC1668n $confirmButton;
        final /* synthetic */ InterfaceC1668n $dismissButton;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03291 extends AbstractC3256z implements InterfaceC1668n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ InterfaceC1668n $confirmButton;
            final /* synthetic */ InterfaceC1668n $dismissButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03291(InterfaceC1668n interfaceC1668n, int i8, InterfaceC1668n interfaceC1668n2) {
                super(2);
                this.$dismissButton = interfaceC1668n;
                this.$$dirty = i8;
                this.$confirmButton = interfaceC1668n2;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1243689536, i8, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:99)");
                }
                InterfaceC1668n interfaceC1668n = this.$dismissButton;
                composer.startReplaceableGroup(-1969500760);
                if (interfaceC1668n != null) {
                    interfaceC1668n.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
                    I i9 = I.f8278a;
                }
                composer.endReplaceableGroup();
                this.$confirmButton.invoke(composer, Integer.valueOf((this.$$dirty >> 3) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC1668n interfaceC1668n, int i8, InterfaceC1668n interfaceC1668n2) {
            super(2);
            this.$dismissButton = interfaceC1668n;
            this.$$dirty = i8;
            this.$confirmButton = interfaceC1668n2;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i8) {
            float f8;
            float f9;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2094788745, i8, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:95)");
            }
            f8 = AndroidAlertDialog_androidKt.ButtonsMainAxisSpacing;
            f9 = AndroidAlertDialog_androidKt.ButtonsCrossAxisSpacing;
            AlertDialogKt.m1457AlertDialogFlowRowixp7dh8(f8, f9, ComposableLambdaKt.composableLambda(composer, -1243689536, true, new C03291(this.$dismissButton, this.$$dirty, this.$confirmButton)), composer, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$1(Modifier modifier, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, Shape shape, long j8, float f8, long j9, long j10, long j11, int i8, int i9, InterfaceC1668n interfaceC1668n4, InterfaceC1668n interfaceC1668n5) {
        super(2);
        this.$modifier = modifier;
        this.$icon = interfaceC1668n;
        this.$title = interfaceC1668n2;
        this.$text = interfaceC1668n3;
        this.$shape = shape;
        this.$containerColor = j8;
        this.$tonalElevation = f8;
        this.$iconContentColor = j9;
        this.$titleContentColor = j10;
        this.$textContentColor = j11;
        this.$$dirty = i8;
        this.$$dirty1 = i9;
        this.$dismissButton = interfaceC1668n4;
        this.$confirmButton = interfaceC1668n5;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1218806937, i8, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:92)");
        }
        String m1800getStringNWtq28 = Strings_androidKt.m1800getStringNWtq28(Strings.Companion.m1793getDialogadMyvUU(), composer, 6);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 2094788745, true, new AnonymousClass1(this.$dismissButton, this.$$dirty, this.$confirmButton));
        Modifier modifier = this.$modifier;
        Modifier.Companion companion = Modifier.Companion;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m1800getStringNWtq28);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidAlertDialog_androidKt$AlertDialog$1$2$1(m1800getStringNWtq28);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then(SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null));
        InterfaceC1668n interfaceC1668n = this.$icon;
        InterfaceC1668n interfaceC1668n2 = this.$title;
        InterfaceC1668n interfaceC1668n3 = this.$text;
        Shape shape = this.$shape;
        long j8 = this.$containerColor;
        float f8 = this.$tonalElevation;
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getActionLabelTextColor(), composer, 6);
        long j9 = this.$iconContentColor;
        long j10 = this.$titleContentColor;
        long j11 = this.$textContentColor;
        int i9 = this.$$dirty;
        int i10 = this.$$dirty1;
        AlertDialogKt.m1456AlertDialogContent4hvqGtA(composableLambda, then, interfaceC1668n, interfaceC1668n2, interfaceC1668n3, shape, j8, f8, color, j9, j10, j11, composer, ((i9 >> 6) & 896) | 6 | ((i9 >> 6) & 7168) | ((i9 >> 6) & 57344) | ((i9 >> 6) & 458752) | ((i9 >> 6) & 3670016) | ((i10 << 15) & 29360128) | (i9 & 1879048192), i10 & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
