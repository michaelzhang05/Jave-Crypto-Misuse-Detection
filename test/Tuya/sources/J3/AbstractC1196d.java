package J3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: J3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1196d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f5165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5166b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0099a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f5167a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0099a(boolean z8) {
                super(2);
                this.f5167a = z8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return L5.I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                int i9;
                int i10;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(782248533, i8, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous>.<anonymous> (AddressOptionsAppBar.kt:29)");
                }
                if (this.f5167a) {
                    i9 = q3.t.f37411r;
                } else {
                    i9 = q3.t.f37400g;
                }
                Painter painterResource = PainterResources_androidKt.painterResource(i9, composer, 0);
                if (this.f5167a) {
                    i10 = q3.w.f37429E;
                } else {
                    i10 = b4.n.f14718c;
                }
                IconKt.m1266Iconww6aTOc(painterResource, StringResources_androidKt.stringResource(i10, composer, 0), (Modifier) null, AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).c(), composer, 8, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, boolean z8) {
            super(3);
            this.f5165a = function0;
            this.f5166b = z8;
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
                ComposerKt.traceEventStart(663677113, i8, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous> (AddressOptionsAppBar.kt:26)");
            }
            IconButtonKt.IconButton(this.f5165a, null, false, null, ComposableLambdaKt.composableLambda(composer, 782248533, true, new C0099a(this.f5166b)), composer, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5168a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f5169b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5170c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f5168a = z8;
            this.f5169b = function0;
            this.f5170c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1196d.a(this.f5168a, this.f5169b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5170c | 1));
        }
    }

    public static final void a(boolean z8, Function0 onButtonClick, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        AbstractC3159y.i(onButtonClick, "onButtonClick");
        Composer startRestartGroup = composer.startRestartGroup(-111772214);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(onButtonClick)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111772214, i9, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar (AddressOptionsAppBar.kt:20)");
            }
            AppBarKt.m1106TopAppBarHsRjFd4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1182getSurface0d7_KjU(), 0L, Dp.m5178constructorimpl(0), null, ComposableLambdaKt.composableLambda(startRestartGroup, 663677113, true, new a(onButtonClick, z8)), startRestartGroup, 199686, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, onButtonClick, i8));
        }
    }
}
