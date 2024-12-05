package M3;

import P5.AbstractC1378t;
import a3.C1625g;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import v4.C4108g;
import w4.AbstractC4148a;

/* renamed from: M3.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1326v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.v$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f7098a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7099b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LazyListState f7100c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7101d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, LazyListState lazyListState, int i8, S5.d dVar) {
            super(2, dVar);
            this.f7099b = z8;
            this.f7100c = lazyListState;
            this.f7101d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f7099b, this.f7100c, this.f7101d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f7098a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                if (this.f7099b) {
                    LazyListState lazyListState = this.f7100c;
                    int i9 = this.f7101d;
                    this.f7098a = 1;
                    if (LazyListState.scrollToItem$default(lazyListState, i9, 0, this, 2, null) == e8) {
                        return e8;
                    }
                } else {
                    LazyListState lazyListState2 = this.f7100c;
                    int i10 = this.f7101d;
                    this.f7098a = 2;
                    if (LazyListState.animateScrollToItem$default(lazyListState2, i10, 0, this, 2, null) == e8) {
                        return e8;
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.v$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f7102a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LazyListState f7103b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7104c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7105d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4108g f7106e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f7107f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.v$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f7108a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f7109b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f7110c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C4108g f7111d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f7112e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f7113f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: M3.v$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0132a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f7114a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f7115b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f7116c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0132a(Function1 function1, List list, int i8) {
                    super(0);
                    this.f7114a = function1;
                    this.f7115b = list;
                    this.f7116c = i8;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m44invoke();
                    return O5.I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m44invoke() {
                    this.f7114a.invoke(this.f7115b.get(this.f7116c));
                }
            }

            /* renamed from: M3.v$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0133b extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f7117a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0133b(List list) {
                    super(1);
                    this.f7117a = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    this.f7117a.get(i8);
                    return null;
                }
            }

            /* renamed from: M3.v$b$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3256z implements InterfaceC1670p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f7118a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f7119b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f7120c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C4108g f7121d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f7122e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function1 f7123f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ List f7124g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(List list, int i8, float f8, C4108g c4108g, boolean z8, Function1 function1, List list2) {
                    super(4);
                    this.f7118a = list;
                    this.f7119b = i8;
                    this.f7120c = f8;
                    this.f7121d = c4108g;
                    this.f7122e = z8;
                    this.f7123f = function1;
                    this.f7124g = list2;
                }

                @Override // a6.InterfaceC1670p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return O5.I.f8278a;
                }

                public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
                    int i10;
                    String i11;
                    AbstractC3255y.i(items, "$this$items");
                    if ((i9 & 14) == 0) {
                        i10 = i9 | (composer.changed(items) ? 4 : 2);
                    } else {
                        i10 = i9;
                    }
                    if ((i9 & 112) == 0) {
                        i10 |= composer.changed(i8) ? 32 : 16;
                    }
                    if ((i10 & 731) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i10, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    C1625g c1625g = (C1625g) this.f7118a.get(i8);
                    composer.startReplaceableGroup(1249436630);
                    if (DarkThemeKt.isSystemInDarkTheme(composer, 0) && c1625g.e() != null) {
                        i11 = c1625g.e();
                    } else {
                        i11 = c1625g.i();
                    }
                    Modifier testTag = TestTagKt.testTag(Modifier.Companion, "PaymentMethodsUITestTag" + c1625g.d());
                    AbstractC1325u.a(this.f7120c, c1625g.h(), i11, this.f7121d, AbstractC4148a.a(c1625g.f(), composer, 8), i8 == this.f7119b, this.f7122e, c1625g.g(), testTag, new C0132a(this.f7123f, this.f7124g, i8), composer, C4108g.f40212g << 9, 0);
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, int i8, float f8, C4108g c4108g, boolean z8, Function1 function1) {
                super(1);
                this.f7108a = list;
                this.f7109b = i8;
                this.f7110c = f8;
                this.f7111d = c4108g;
                this.f7112e = z8;
                this.f7113f = function1;
            }

            public final void a(LazyListScope LazyRow) {
                AbstractC3255y.i(LazyRow, "$this$LazyRow");
                List list = this.f7108a;
                LazyRow.items(list.size(), null, new C0133b(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new c(list, this.f7109b, this.f7110c, this.f7111d, this.f7112e, this.f7113f, list)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((LazyListScope) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, LazyListState lazyListState, boolean z8, int i8, C4108g c4108g, Function1 function1) {
            super(3);
            this.f7102a = list;
            this.f7103b = lazyListState;
            this.f7104c = z8;
            this.f7105d = i8;
            this.f7106e = c4108g;
            this.f7107f = function1;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3255y.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(782109993, i9, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI.<anonymous> (NewPaymentMethodTabLayoutUI.kt:60)");
            }
            float e8 = AbstractC1326v.e(BoxWithConstraints.mo545getMaxWidthD9Ej5fM(), this.f7102a.size(), composer, 0);
            A a8 = A.f6474a;
            PaddingValues m600PaddingValuesYgX7TsA$default = PaddingKt.m600PaddingValuesYgX7TsA$default(a8.b(), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(a8.a());
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "PaymentMethodsUITestTag");
            LazyListState lazyListState = this.f7103b;
            boolean z8 = this.f7104c;
            LazyDslKt.LazyRow(testTag, lazyListState, m600PaddingValuesYgX7TsA$default, false, m519spacedBy0680j_4, null, null, z8, new a(this.f7102a, this.f7105d, e8, this.f7106e, z8, this.f7107f), composer, 24966, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.v$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f7125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f7128d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4108g f7129e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f7130f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LazyListState f7131g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7132h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7133i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, int i8, boolean z8, Function1 function1, C4108g c4108g, Modifier modifier, LazyListState lazyListState, int i9, int i10) {
            super(2);
            this.f7125a = list;
            this.f7126b = i8;
            this.f7127c = z8;
            this.f7128d = function1;
            this.f7129e = c4108g;
            this.f7130f = modifier;
            this.f7131g = lazyListState;
            this.f7132h = i9;
            this.f7133i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1326v.a(this.f7125a, this.f7126b, this.f7127c, this.f7128d, this.f7129e, this.f7130f, this.f7131g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7132h | 1), this.f7133i);
        }
    }

    public static final void a(List paymentMethods, int i8, boolean z8, Function1 onItemSelectedListener, C4108g imageLoader, Modifier modifier, LazyListState lazyListState, Composer composer, int i9, int i10) {
        Modifier modifier2;
        LazyListState lazyListState2;
        int i11;
        boolean z9;
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(onItemSelectedListener, "onItemSelectedListener");
        AbstractC3255y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(994479443);
        if ((i10 & 32) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        boolean z10 = false;
        if ((i10 & 64) != 0) {
            i11 = i9 & (-3670017);
            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
        } else {
            lazyListState2 = lazyListState;
            i11 = i9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(994479443, i11, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI (NewPaymentMethodTabLayoutUI.kt:43)");
        }
        boolean booleanValue = ((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
        Integer valueOf = Integer.valueOf(i8);
        startRestartGroup.startReplaceableGroup(-132451049);
        boolean changed = startRestartGroup.changed(booleanValue);
        if ((((i9 & 3670016) ^ 1572864) > 1048576 && startRestartGroup.changed(lazyListState2)) || (i9 & 1572864) == 1048576) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = changed | z9;
        if ((((i9 & 112) ^ 48) > 32 && startRestartGroup.changed(i8)) || (i9 & 48) == 32) {
            z10 = true;
        }
        boolean z12 = z10 | z11;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(booleanValue, lazyListState2, i8, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf, (InterfaceC1668n) rememberedValue, startRestartGroup, ((i11 >> 3) & 14) | 64);
        LazyListState lazyListState3 = lazyListState2;
        Modifier modifier3 = modifier2;
        BoxWithConstraintsKt.BoxWithConstraints(TestTagKt.testTag(modifier2, "PaymentMethodsUITestTag1"), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 782109993, true, new b(paymentMethods, lazyListState2, z8, i8, imageLoader, onItemSelectedListener)), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(paymentMethods, i8, z8, onItemSelectedListener, imageLoader, modifier3, lazyListState3, i9, i10));
        }
    }

    public static final float c(float f8, int i8) {
        A a8 = A.f6474a;
        float m5183constructorimpl = Dp.m5183constructorimpl(f8 - Dp.m5183constructorimpl(a8.b() * 2));
        float m5183constructorimpl2 = Dp.m5183constructorimpl(90);
        float f9 = i8;
        float m5183constructorimpl3 = Dp.m5183constructorimpl(m5183constructorimpl2 * f9);
        float m5183constructorimpl4 = Dp.m5183constructorimpl(a8.a() * (i8 - 1));
        if (Dp.m5182compareTo0680j_4(Dp.m5183constructorimpl(m5183constructorimpl3 + m5183constructorimpl4), m5183constructorimpl) <= 0) {
            return Dp.m5183constructorimpl(Dp.m5183constructorimpl(m5183constructorimpl - m5183constructorimpl4) / f9);
        }
        Iterator it = AbstractC1378t.p(Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)).iterator();
        if (it.hasNext()) {
            Dp m5181boximpl = Dp.m5181boximpl(d(m5183constructorimpl, m5183constructorimpl2, a8.a(), ((Number) it.next()).floatValue()));
            while (it.hasNext()) {
                Dp m5181boximpl2 = Dp.m5181boximpl(d(m5183constructorimpl, m5183constructorimpl2, A.f6474a.a(), ((Number) it.next()).floatValue()));
                if (m5181boximpl.compareTo(m5181boximpl2) > 0) {
                    m5181boximpl = m5181boximpl2;
                }
            }
            return m5181boximpl.m5197unboximpl();
        }
        throw new NoSuchElementException();
    }

    private static final float d(float f8, float f9, float f10, float f11) {
        return Dp.m5183constructorimpl(Dp.m5183constructorimpl(f8 - Dp.m5183constructorimpl(f10 * ((int) (Dp.m5183constructorimpl(Dp.m5183constructorimpl(f8 - f9) - Dp.m5183constructorimpl(f9 * f11)) / Dp.m5183constructorimpl(f9 + f10))))) / ((r3 + 1) + f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(float f8, int i8, Composer composer, int i9) {
        boolean z8;
        composer.startReplaceableGroup(-709663121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-709663121, i9, -1, "com.stripe.android.paymentsheet.ui.rememberViewWidth (NewPaymentMethodTabLayoutUI.kt:103)");
        }
        composer.startReplaceableGroup(1221348739);
        boolean z9 = false;
        if ((((i9 & 14) ^ 6) > 4 && composer.changed(f8)) || (i9 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((((i9 & 112) ^ 48) > 32 && composer.changed(i8)) || (i9 & 48) == 32) {
            z9 = true;
        }
        boolean z10 = z8 | z9;
        Object rememberedValue = composer.rememberedValue();
        if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Dp.m5181boximpl(c(f8, i8));
            composer.updateRememberedValue(rememberedValue);
        }
        float m5197unboximpl = ((Dp) rememberedValue).m5197unboximpl();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m5197unboximpl;
    }
}
