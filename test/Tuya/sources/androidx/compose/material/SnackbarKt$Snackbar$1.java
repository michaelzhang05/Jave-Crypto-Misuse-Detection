package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $action;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ n $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SnackbarKt$Snackbar$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ n $action;
        final /* synthetic */ boolean $actionOnNewLine;
        final /* synthetic */ n $content;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.SnackbarKt$Snackbar$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03221 extends AbstractC3160z implements n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ n $action;
            final /* synthetic */ boolean $actionOnNewLine;
            final /* synthetic */ n $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03221(n nVar, n nVar2, int i8, boolean z8) {
                super(2);
                this.$action = nVar;
                this.$content = nVar2;
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
                    ComposerKt.traceEventStart(225114541, i8, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                }
                if (this.$action == null) {
                    composer.startReplaceableGroup(59708346);
                    SnackbarKt.TextOnlySnackbar(this.$content, composer, (this.$$dirty >> 21) & 14);
                    composer.endReplaceableGroup();
                } else if (this.$actionOnNewLine) {
                    composer.startReplaceableGroup(59708411);
                    n nVar = this.$content;
                    n nVar2 = this.$action;
                    int i9 = this.$$dirty;
                    SnackbarKt.NewLineButtonSnackbar(nVar, nVar2, composer, (i9 & 112) | ((i9 >> 21) & 14));
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(59708478);
                    n nVar3 = this.$content;
                    n nVar4 = this.$action;
                    int i10 = this.$$dirty;
                    SnackbarKt.OneRowSnackbar(nVar3, nVar4, composer, (i10 & 112) | ((i10 >> 21) & 14));
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(n nVar, n nVar2, int i8, boolean z8) {
            super(2);
            this.$action = nVar;
            this.$content = nVar2;
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
                ComposerKt.traceEventStart(1939362236, i8, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, 225114541, true, new C03221(this.$action, this.$content, this.$$dirty, this.$actionOnNewLine)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1(n nVar, n nVar2, int i8, boolean z8) {
        super(2);
        this.$action = nVar;
        this.$content = nVar2;
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
            ComposerKt.traceEventStart(-2084221700, i8, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer, 6)))}, ComposableLambdaKt.composableLambda(composer, 1939362236, true, new AnonymousClass1(this.$action, this.$content, this.$$dirty, this.$actionOnNewLine)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
