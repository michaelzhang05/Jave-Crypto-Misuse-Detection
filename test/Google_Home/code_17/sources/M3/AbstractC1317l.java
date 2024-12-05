package M3;

import M3.C1320o;
import M3.InterfaceC1318m;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import h4.I0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import m2.AbstractC3407E;
import m4.AbstractC3434f;
import m4.AbstractC3441m;
import p4.C0;
import p4.p0;
import p4.u0;
import w4.AbstractC4148a;

/* renamed from: M3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1317l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6997a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f6998b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, MutableState mutableState) {
            super(0);
            this.f6997a = function1;
            this.f6998b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m37invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m37invoke() {
            if (AbstractC1317l.b(this.f6998b)) {
                return;
            }
            AbstractC1317l.c(this.f6998b, true);
            this.f6997a.invoke(InterfaceC1318m.c.f7042a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6999a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f7000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1, MutableState mutableState) {
            super(1);
            this.f6999a = function1;
            this.f7000b = mutableState;
        }

        public final void a(C1320o.a item) {
            AbstractC3255y.i(item, "item");
            AbstractC1317l.c(this.f7000b, false);
            this.f6999a.invoke(new InterfaceC1318m.a(item));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1320o.a) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f7002b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1 function1, MutableState mutableState) {
            super(0);
            this.f7001a = function1;
            this.f7002b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m38invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m38invoke() {
            AbstractC1317l.c(this.f7002b, false);
            this.f7001a.invoke(InterfaceC1318m.b.f7041a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1320o f7003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f7004b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7005c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1320o c1320o, Function1 function1, int i8) {
            super(2);
            this.f7003a = c1320o;
            this.f7004b = function1;
            this.f7005c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1317l.a(this.f7003a, this.f7004b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7005c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C3252v implements Function1 {
        e(Object obj) {
            super(1, obj, InterfaceC1319n.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;)V", 0);
        }

        public final void d(InterfaceC1318m p02) {
            AbstractC3255y.i(p02, "p0");
            ((InterfaceC1319n) this.receiver).b(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((InterfaceC1318m) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1319n f7006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7008c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7009d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC1319n interfaceC1319n, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7006a = interfaceC1319n;
            this.f7007b = modifier;
            this.f7008c = i8;
            this.f7009d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1317l.d(this.f7006a, this.f7007b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7008c | 1), this.f7009d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1320o f7010a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7011b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f7012c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.l$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7013a = new a();

            a() {
                super(1);
            }

            public final void invoke(String it) {
                AbstractC3255y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.l$g$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f7014a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Modifier modifier) {
                super(2);
                this.f7014a = modifier;
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
                    ComposerKt.traceEventStart(1623512054, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:105)");
                }
                AbstractC1317l.g(StringResources_androidKt.stringResource(AbstractC3407E.f34844a, composer, 0), this.f7014a, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.l$g$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1320o f7015a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f7016b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C1320o c1320o, Function1 function1) {
                super(2);
                this.f7015a = c1320o;
                this.f7016b = function1;
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
                    ComposerKt.traceEventStart(1857875321, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:111)");
                }
                AbstractC1317l.a(this.f7015a, this.f7016b, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1320o c1320o, Modifier modifier, Function1 function1) {
            super(2);
            this.f7010a = c1320o;
            this.f7011b = modifier;
            this.f7012c = function1;
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
                ComposerKt.traceEventStart(1330496850, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous> (EditPaymentMethod.kt:97)");
            }
            TextFieldColors d8 = C0.d(false, composer, 6, 0);
            TextFieldKt.TextField("•••• •••• •••• " + this.f7010a.g(), (Function1) a.f7013a, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), false, false, (TextStyle) null, (InterfaceC1668n) ComposableLambdaKt.composableLambda(composer, 1623512054, true, new b(this.f7011b)), (InterfaceC1668n) null, (InterfaceC1668n) null, (InterfaceC1668n) ComposableLambdaKt.composableLambda(composer, 1857875321, true, new c(this.f7010a, this.f7012c)), false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, d8, composer, 806882736, 0, 523696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7017a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function1 function1) {
            super(0);
            this.f7017a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m39invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m39invoke() {
            this.f7017a.invoke(InterfaceC1318m.g.f7046a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7018a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1) {
            super(0);
            this.f7018a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m40invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m40invoke() {
            this.f7018a.invoke(InterfaceC1318m.f.f7045a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7019a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function1 function1) {
            super(0);
            this.f7019a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m41invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m41invoke() {
            this.f7019a.invoke(InterfaceC1318m.e.f7044a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7020a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function1 function1) {
            super(0);
            this.f7020a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m42invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m42invoke() {
            this.f7020a.invoke(InterfaceC1318m.d.f7043a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$l, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0130l extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1320o f7021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f7022b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f7023c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7024d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7025e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0130l(C1320o c1320o, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7021a = c1320o;
            this.f7022b = function1;
            this.f7023c = modifier;
            this.f7024d = i8;
            this.f7025e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1317l.f(this.f7021a, this.f7022b, this.f7023c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7024d | 1), this.f7025e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7027b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7028c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Modifier modifier, int i8) {
            super(2);
            this.f7026a = str;
            this.f7027b = modifier;
            this.f7028c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1317l.g(this.f7026a, this.f7027b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7028c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7031c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.l$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BoxScope f7032a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f7033b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f7034c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0 f7035d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BoxScope boxScope, boolean z8, boolean z9, Function0 function0) {
                super(2);
                this.f7032a = boxScope;
                this.f7033b = z8;
                this.f7034c = z9;
                this.f7035d = function0;
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
                    ComposerKt.traceEventStart(649323835, i8, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:204)");
                }
                ButtonKt.TextButton(this.f7035d, this.f7032a.align(Modifier.Companion, Alignment.Companion.getCenter()), this.f7033b && !this.f7034c, null, null, AbstractC3441m.o(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).f(), null, null, null, C1311f.f6879a.a(), composer, 805306368, 472);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z8, boolean z9, Function0 function0) {
            super(2);
            this.f7029a = z8;
            this.f7030b = z9;
            this.f7031c = function0;
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
                ComposerKt.traceEventStart(934400577, i8, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous> (EditPaymentMethod.kt:193)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier m566offsetVpY3zN4$default = OffsetKt.m566offsetVpY3zN4$default(PaddingKt.m609paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(companion, "PaymentSheetEditScreenRemoveButton"), 0.0f, 1, null), Dp.m5183constructorimpl(f8), 0.0f, Dp.m5183constructorimpl(f8), 0.0f, 10, null), 0.0f, Dp.m5183constructorimpl(f8), 1, null);
            boolean z8 = this.f7029a;
            boolean z9 = this.f7030b;
            Function0 function0 = this.f7031c;
            composer.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m566offsetVpY3zN4$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement().provides(Boolean.FALSE)}, ComposableLambdaKt.composableLambda(composer, 649323835, true, new a(boxScopeInstance, z9, z8, function0)), composer, 56);
            composer.startReplaceableGroup(-245509255);
            if (z8) {
                t2.b.b(boxScopeInstance.align(companion, companion2.getCenterEnd()), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1177getError0d7_KjU(), composer, 0, 0);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.l$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7036a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7037b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7038c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7039d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z8, boolean z9, Function0 function0, int i8) {
            super(2);
            this.f7036a = z8;
            this.f7037b = z9;
            this.f7038c = function0;
            this.f7039d = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1317l.h(this.f7036a, this.f7037b, this.f7038c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7039d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1320o c1320o, Function1 function1, Composer composer, int i8) {
        boolean z8;
        boolean z9;
        Composer startRestartGroup = composer.startRestartGroup(1943978362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943978362, i8, -1, "com.stripe.android.paymentsheet.ui.Dropdown (EditPaymentMethod.kt:232)");
        }
        startRestartGroup.startReplaceableGroup(-1126873801);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(-1126870188);
        int i9 = (i8 & 112) ^ 48;
        boolean z10 = true;
        if ((i9 > 32 && startRestartGroup.changed(function1)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (z8 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new a(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier testTag = TestTagKt.testTag(ClickableKt.m320clickableXHw0xAI$default(companion2, false, null, null, (Function0) rememberedValue2, 7, null), "dropdown_menu_clickable");
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        Function0 constructor = companion4.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(companion2, Dp.m5183constructorimpl(10));
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(Dp.m5183constructorimpl(4));
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m519spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion4.getConstructor();
        InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2501constructorimpl2 = Updater.m2501constructorimpl(startRestartGroup);
        Updater.m2508setimpl(m2501constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(c1320o.h().getIcon().intValue(), startRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 124);
        IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(AbstractC3434f.f35152a, startRestartGroup, 0), (String) null, (Modifier) null, 0L, startRestartGroup, 56, 12);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean b8 = b(mutableState);
        B2.b a8 = B2.c.a(AbstractC3407E.f34841X);
        C1320o.a h8 = c1320o.h();
        List a9 = c1320o.a();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        long j8 = AbstractC3441m.n(materialTheme, startRestartGroup, i10).j();
        long h9 = AbstractC3441m.n(materialTheme, startRestartGroup, i10).h();
        startRestartGroup.startReplaceableGroup(-533242456);
        if ((i9 > 32 && startRestartGroup.changed(function1)) || (i8 & 48) == 32) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new b(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-533235523);
        if ((i9 <= 32 || !startRestartGroup.changed(function1)) && (i8 & 48) != 32) {
            z10 = false;
        }
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new c(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        u0.b(b8, a8, h8, a9, function12, j8, h9, (Function0) rememberedValue4, startRestartGroup, 4160);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(c1320o, function1, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    public static final void d(InterfaceC1319n interactor, Modifier modifier, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        AbstractC3255y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(958707926);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i13 = i9 & 2;
        if (i13 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(958707926, i10, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethod (EditPaymentMethod.kt:71)");
            }
            f(e(y4.f.a(interactor.a(), startRestartGroup, 8)), new e(interactor), modifier, startRestartGroup, ((i10 << 3) & 896) | 8, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(interactor, modifier, i8, i9));
        }
    }

    private static final C1320o e(State state) {
        return (C1320o) state.getValue();
    }

    public static final void f(C1320o viewState, Function1 viewActionHandler, Modifier modifier, Composer composer, int i8, int i9) {
        AbstractC3255y.i(viewState, "viewState");
        AbstractC3255y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(124818519);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(124818519, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi (EditPaymentMethod.kt:86)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(t3.s.f39712e, startRestartGroup, 0);
        boolean z8 = viewState.i() == C1320o.b.f7059a;
        Modifier testTag = TestTagKt.testTag(PaddingKt.m607paddingVpY3zN4$default(modifier2, dimensionResource, 0.0f, 2, null), "TEST_TAG_PAYMENT_SHEET_EDIT_SCREEN");
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        boolean z9 = z8;
        Modifier modifier3 = modifier2;
        p0.b(null, null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1330496850, true, new g(viewState, modifier2, viewActionHandler)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
        Modifier.Companion companion2 = Modifier.Companion;
        SpacerKt.Spacer(SizeKt.m641requiredHeight3ABfNKs(companion2, Dp.m5183constructorimpl(32)), startRestartGroup, 6);
        B2.b f8 = viewState.f();
        startRestartGroup.startReplaceableGroup(1368256471);
        if (f8 != null) {
            AbstractC1321p.a(AbstractC4148a.a(f8, startRestartGroup, 8), PaddingKt.m609paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(8), 7, null), startRestartGroup, 48, 0);
        }
        startRestartGroup.endReplaceableGroup();
        String stringResource = StringResources_androidKt.stringResource(AbstractC3407E.f34829M0, startRestartGroup, 0);
        boolean z10 = viewState.i() == C1320o.b.f7060b;
        boolean z11 = viewState.c() && z9;
        Modifier testTag2 = TestTagKt.testTag(companion2, "TEST_TAG_EDIT_SCREEN_UPDATE_BUTTON");
        startRestartGroup.startReplaceableGroup(1368271973);
        int i10 = (i8 & 112) ^ 48;
        boolean z12 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new h(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        t2.c.a(stringResource, z11, (Function0) rememberedValue, testTag2, z10, false, startRestartGroup, 3072, 32);
        startRestartGroup.startReplaceableGroup(1368276737);
        if (viewState.b()) {
            boolean z13 = viewState.i() == C1320o.b.f7061c;
            startRestartGroup.startReplaceableGroup(1368282974);
            boolean z14 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z14 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new i(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            h(z9, z13, (Function0) rememberedValue2, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (viewState.d()) {
            String stringResource2 = StringResources_androidKt.stringResource(t3.w.f39771Y, new Object[]{AbstractC4148a.a(viewState.e(), startRestartGroup, 8)}, startRestartGroup, 64);
            String stringResource3 = StringResources_androidKt.stringResource(AbstractC3407E.f34843Z, new Object[]{viewState.h().a().h(), viewState.g()}, startRestartGroup, 64);
            String stringResource4 = StringResources_androidKt.stringResource(AbstractC3407E.f34815F0, startRestartGroup, 0);
            String stringResource5 = StringResources_androidKt.stringResource(AbstractC3407E.f34839V, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(692289345);
            boolean z15 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z15 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new j(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(692291725);
            boolean z16 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (48 & i8) == 32;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z16 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new k(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            I0.a(stringResource2, stringResource3, stringResource4, stringResource5, true, function0, (Function0) rememberedValue4, startRestartGroup, 24576, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0130l(viewState, viewActionHandler, modifier3, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, Modifier modifier, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1417892261);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        int i12 = i9;
        if ((i12 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1417892261, i12, -1, "com.stripe.android.paymentsheet.ui.Label (EditPaymentMethod.kt:173)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1419Text4IGK_g(str, modifier, Color.m2975copywmQWz5c$default(AbstractC3441m.n(materialTheme, startRestartGroup, i13).i(), ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i13).getSubtitle1(), composer2, i12 & 126, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new m(str, modifier, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z8, boolean z9, Function0 function0, Composer composer, int i8) {
        int i9;
        float high;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-336781567);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z9)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336781567, i9, -1, "com.stripe.android.paymentsheet.ui.RemoveButton (EditPaymentMethod.kt:188)");
            }
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            if (z9) {
                startRestartGroup.startReplaceableGroup(701837750);
                high = ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable);
            } else {
                startRestartGroup.startReplaceableGroup(701838610);
                high = ContentAlpha.INSTANCE.getHigh(startRestartGroup, ContentAlpha.$stable);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentAlpha.provides(Float.valueOf(high)), RippleThemeKt.getLocalRippleTheme().provides(C1322q.f7068a)}, ComposableLambdaKt.composableLambda(startRestartGroup, 934400577, true, new n(z9, z8, function0)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new o(z8, z9, function0, i8));
        }
    }
}
