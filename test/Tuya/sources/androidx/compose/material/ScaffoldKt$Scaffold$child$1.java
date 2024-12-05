package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$child$1 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ n $bottomBar;
    final /* synthetic */ o $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ ScaffoldState $scaffoldState;
    final /* synthetic */ o $snackbarHost;
    final /* synthetic */ n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ n $bottomBar;
        final /* synthetic */ o $content;
        final /* synthetic */ n $floatingActionButton;
        final /* synthetic */ int $floatingActionButtonPosition;
        final /* synthetic */ boolean $isFloatingActionButtonDocked;
        final /* synthetic */ ScaffoldState $scaffoldState;
        final /* synthetic */ o $snackbarHost;
        final /* synthetic */ n $topBar;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03151 extends AbstractC3160z implements n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ ScaffoldState $scaffoldState;
            final /* synthetic */ o $snackbarHost;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03151(o oVar, ScaffoldState scaffoldState, int i8) {
                super(2);
                this.$snackbarHost = oVar;
                this.$scaffoldState = scaffoldState;
                this.$$dirty = i8;
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
                    ComposerKt.traceEventStart(533782017, i8, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                }
                this.$snackbarHost.invoke(this.$scaffoldState.getSnackbarHostState(), composer, Integer.valueOf((this.$$dirty >> 9) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z8, int i8, n nVar, o oVar, n nVar2, n nVar3, int i9, int i10, o oVar2, ScaffoldState scaffoldState) {
            super(2);
            this.$isFloatingActionButtonDocked = z8;
            this.$floatingActionButtonPosition = i8;
            this.$topBar = nVar;
            this.$content = oVar;
            this.$floatingActionButton = nVar2;
            this.$bottomBar = nVar3;
            this.$$dirty = i9;
            this.$$dirty1 = i10;
            this.$snackbarHost = oVar2;
            this.$scaffoldState = scaffoldState;
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
                ComposerKt.traceEventStart(-1128984656, i8, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
            }
            boolean z8 = this.$isFloatingActionButtonDocked;
            int i9 = this.$floatingActionButtonPosition;
            n nVar = this.$topBar;
            o oVar = this.$content;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 533782017, true, new C03151(this.$snackbarHost, this.$scaffoldState, this.$$dirty));
            n nVar2 = this.$floatingActionButton;
            n nVar3 = this.$bottomBar;
            int i10 = this.$$dirty;
            ScaffoldKt.m1321ScaffoldLayoutMDYNRJg(z8, i9, nVar, oVar, composableLambda, nVar2, nVar3, composer, ((i10 >> 21) & 14) | 24576 | ((i10 >> 15) & 112) | (i10 & 896) | ((this.$$dirty1 >> 12) & 7168) | (458752 & i10) | ((i10 << 9) & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$child$1(long j8, long j9, int i8, boolean z8, int i9, n nVar, o oVar, n nVar2, n nVar3, int i10, o oVar2, ScaffoldState scaffoldState) {
        super(3);
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$$dirty1 = i8;
        this.$isFloatingActionButtonDocked = z8;
        this.$floatingActionButtonPosition = i9;
        this.$topBar = nVar;
        this.$content = oVar;
        this.$floatingActionButton = nVar2;
        this.$bottomBar = nVar3;
        this.$$dirty = i10;
        this.$snackbarHost = oVar2;
        this.$scaffoldState = scaffoldState;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Modifier childModifier, Composer composer, int i8) {
        int i9;
        AbstractC3159y.i(childModifier, "childModifier");
        if ((i8 & 14) == 0) {
            i9 = i8 | (composer.changed(childModifier) ? 4 : 2);
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1823402604, i9, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
        }
        long j8 = this.$backgroundColor;
        long j9 = this.$contentColor;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1128984656, true, new AnonymousClass1(this.$isFloatingActionButtonDocked, this.$floatingActionButtonPosition, this.$topBar, this.$content, this.$floatingActionButton, this.$bottomBar, this.$$dirty, this.$$dirty1, this.$snackbarHost, this.$scaffoldState));
        int i10 = 1572864 | (i9 & 14);
        int i11 = this.$$dirty1;
        SurfaceKt.m1353SurfaceFjzlyU(childModifier, null, j8, j9, null, 0.0f, composableLambda, composer, i10 | ((i11 >> 9) & 896) | ((i11 >> 9) & 7168), 50);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
