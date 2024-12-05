package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $action;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ n $content;
    final /* synthetic */ n $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.SnackbarKt$Snackbar$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ n $action;
        final /* synthetic */ long $actionContentColor;
        final /* synthetic */ boolean $actionOnNewLine;
        final /* synthetic */ TextStyle $actionTextStyle;
        final /* synthetic */ n $content;
        final /* synthetic */ n $dismissAction;
        final /* synthetic */ long $dismissActionContentColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(n nVar, n nVar2, n nVar3, TextStyle textStyle, long j8, long j9, int i8, boolean z8) {
            super(2);
            this.$action = nVar;
            this.$content = nVar2;
            this.$dismissAction = nVar3;
            this.$actionTextStyle = textStyle;
            this.$actionContentColor = j8;
            this.$dismissActionContentColor = j9;
            this.$$dirty = i8;
            this.$actionOnNewLine = z8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(835891690, i8, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
            }
            if (this.$action == null) {
                composer.startReplaceableGroup(-2104362770);
                n nVar = this.$content;
                n nVar2 = this.$dismissAction;
                TextStyle textStyle = this.$actionTextStyle;
                long j8 = this.$actionContentColor;
                long j9 = this.$dismissActionContentColor;
                int i9 = this.$$dirty;
                SnackbarKt.m1771OneRowSnackbarkKq0p4A(nVar, null, nVar2, textStyle, j8, j9, composer, (57344 & (i9 >> 9)) | ((i9 >> 27) & 14) | 48 | (i9 & 896) | ((i9 >> 9) & 458752));
                composer.endReplaceableGroup();
            } else if (this.$actionOnNewLine) {
                composer.startReplaceableGroup(-2104362456);
                n nVar3 = this.$content;
                n nVar4 = this.$action;
                n nVar5 = this.$dismissAction;
                TextStyle textStyle2 = this.$actionTextStyle;
                long j10 = this.$actionContentColor;
                long j11 = this.$dismissActionContentColor;
                int i10 = this.$$dirty;
                SnackbarKt.m1770NewLineButtonSnackbarkKq0p4A(nVar3, nVar4, nVar5, textStyle2, j10, j11, composer, (57344 & (i10 >> 9)) | ((i10 >> 27) & 14) | (i10 & 112) | (i10 & 896) | ((i10 >> 9) & 458752));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-2104362176);
                n nVar6 = this.$content;
                n nVar7 = this.$action;
                n nVar8 = this.$dismissAction;
                TextStyle textStyle3 = this.$actionTextStyle;
                long j12 = this.$actionContentColor;
                long j13 = this.$dismissActionContentColor;
                int i11 = this.$$dirty;
                SnackbarKt.m1771OneRowSnackbarkKq0p4A(nVar6, nVar7, nVar8, textStyle3, j12, j13, composer, (57344 & (i11 >> 9)) | ((i11 >> 27) & 14) | (i11 & 112) | (i11 & 896) | ((i11 >> 9) & 458752));
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1(n nVar, n nVar2, n nVar3, long j8, long j9, int i8, boolean z8) {
        super(2);
        this.$action = nVar;
        this.$content = nVar2;
        this.$dismissAction = nVar3;
        this.$actionContentColor = j8;
        this.$dismissActionContentColor = j9;
        this.$$dirty = i8;
        this.$actionOnNewLine = z8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1829663446, i8, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        Typography typography = materialTheme.getTypography(composer, 6);
        SnackbarTokens snackbarTokens = SnackbarTokens.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(typography, snackbarTokens.getSupportingTextFont()))}, ComposableLambdaKt.composableLambda(composer, 835891690, true, new AnonymousClass1(this.$action, this.$content, this.$dismissAction, TypographyKt.fromToken(materialTheme.getTypography(composer, 6), snackbarTokens.getActionLabelTextFont()), this.$actionContentColor, this.$dismissActionContentColor, this.$$dirty, this.$actionOnNewLine)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
