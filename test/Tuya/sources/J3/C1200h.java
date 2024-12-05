package J3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: J3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1200h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1200h f5184a = new C1200h();

    /* renamed from: b, reason: collision with root package name */
    public static X5.n f5185b = ComposableLambdaKt.composableLambdaInstance(-1448355750, false, a.f5187a);

    /* renamed from: c, reason: collision with root package name */
    public static X5.o f5186c = ComposableLambdaKt.composableLambdaInstance(72907088, false, b.f5188a);

    /* renamed from: J3.h$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5187a = new a();

        a() {
            super(2);
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
                ComposerKt.traceEventStart(-1448355750, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$SepaMandateActivityKt.lambda-1.<anonymous> (SepaMandateActivity.kt:93)");
            }
            IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(q3.t.f37411r, composer, 0), StringResources_androidKt.stringResource(q3.w.f37429E, composer, 0), (Modifier) null, AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).c(), composer, 8, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: J3.h$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5188a = new b();

        b() {
            super(3);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(RowScope Button, Composer composer, int i8) {
            AbstractC3159y.i(Button, "$this$Button");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(72907088, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$SepaMandateActivityKt.lambda-2.<anonymous> (SepaMandateActivity.kt:123)");
            }
            TextKt.m1414Text4IGK_g(StringResources_androidKt.stringResource(b4.n.f14742o, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final X5.n a() {
        return f5185b;
    }

    public final X5.o b() {
        return f5186c;
    }
}
