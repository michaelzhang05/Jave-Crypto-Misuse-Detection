package B3;

import B3.f;
import B3.g;
import L5.I;
import M5.a0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.stripe.android.paymentsheet.u;
import e4.C0;
import e4.D0;
import e4.I0;
import j2.AbstractC3053E;
import j4.AbstractC3087m;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3136a;
import m4.AbstractC3414d;
import m4.C;
import m4.C3408a;
import m4.F;
import m4.G;
import m4.Q;
import m4.T;
import m4.d0;
import m4.e0;
import m4.f0;
import m4.p0;
import m4.w0;
import q3.w;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f806a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f807b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f808c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f809d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f810e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: B3.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0009a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f811a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0009a(MutableState mutableState) {
                super(0);
                this.f811a = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m0invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m0invoke() {
                e.c(this.f811a, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, MutableState mutableState, int i8, String str, String str2) {
            super(2);
            this.f806a = z8;
            this.f807b = mutableState;
            this.f808c = i8;
            this.f809d = str;
            this.f810e = str2;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1988669001, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AccountDetailsForm.<anonymous>.<anonymous> (USBankAccountForm.kt:416)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(PaddingKt.m604paddingqDBjuR0$default(PaddingKt.m602paddingVpY3zN4$default(SizeKt.m635heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5178constructorimpl(56), 0.0f, 2, null), 0.0f, Dp.m5178constructorimpl(12), 1, null), Dp.m5178constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, Dp.m5178constructorimpl(f8), 0.0f, 11, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            boolean z8 = this.f806a;
            MutableState mutableState = this.f807b;
            int i9 = this.f808c;
            String str = this.f809d;
            String str2 = this.f810e;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m604paddingqDBjuR0$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = arrangement.m514spacedBy0680j_4(Dp.m5178constructorimpl(f8));
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m514spacedBy0680j_4, centerVertically2, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m2496constructorimpl2 = Updater.m2496constructorimpl(composer);
            Updater.m2503setimpl(m2496constructorimpl2, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            float f9 = 24;
            ImageKt.Image(PainterResources_androidKt.painterResource(i9, composer, 0), (String) null, SizeKt.m647size3ABfNKs(companion, Dp.m5178constructorimpl(f9)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
            TextKt.m1414Text4IGK_g(str + " •••• " + str2, AlphaKt.alpha(companion, z8 ? 0.5f : 1.0f), AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131064);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            boolean z9 = !z8;
            Modifier m647size3ABfNKs = SizeKt.m647size3ABfNKs(companion, Dp.m5178constructorimpl(f9));
            composer.startReplaceableGroup(-224308683);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0009a(mutableState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            IconButtonKt.IconButton((Function0) rememberedValue, m647size3ABfNKs, z9, null, B3.a.f738a.a(), composer, 24624, 8);
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
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f812a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0, MutableState mutableState) {
            super(0);
            this.f812a = function0;
            this.f813b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            e.c(this.f813b, false);
            this.f812a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState mutableState) {
            super(0);
            this.f814a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            e.c(this.f814a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f817c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f818d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0 f819e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f820f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f821g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, String str, String str2, C0 c02, Function0 function0, int i8) {
            super(2);
            this.f815a = z8;
            this.f816b = z9;
            this.f817c = str;
            this.f818d = str2;
            this.f819e = c02;
            this.f820f = function0;
            this.f821g = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.a(this.f815a, this.f816b, this.f817c, this.f818d, this.f819e, this.f820f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f821g | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B3.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0010e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0010e f822a = new C0010e();

        C0010e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableState invoke() {
            MutableState mutableStateOf$default;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            return mutableStateOf$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A3.a f823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f825c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f826d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f827e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f828f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f829g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f830h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w0 f831i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Q f832j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C3408a f833k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ G f834l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ e0 f835m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C0 f836n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f837o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f838p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f839q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(A3.a aVar, String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11, w0 w0Var, w0 w0Var2, Q q8, C3408a c3408a, G g8, e0 e0Var, C0 c02, Function0 function0, int i8, int i9) {
            super(2);
            this.f823a = aVar;
            this.f824b = str;
            this.f825c = str2;
            this.f826d = z8;
            this.f827e = z9;
            this.f828f = z10;
            this.f829g = z11;
            this.f830h = w0Var;
            this.f831i = w0Var2;
            this.f832j = q8;
            this.f833k = c3408a;
            this.f834l = g8;
            this.f835m = e0Var;
            this.f836n = c02;
            this.f837o = function0;
            this.f838p = i8;
            this.f839q = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.d(this.f823a, this.f824b, this.f825c, this.f826d, this.f827e, this.f828f, this.f829g, this.f830h, this.f831i, this.f832j, this.f833k, this.f834l, this.f835m, this.f836n, this.f837o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f838p | 1), RecomposeScopeImplKt.updateChangedFlags(this.f839q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f840a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3408a f841b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z8, C3408a c3408a, G g8) {
            super(2);
            this.f840a = z8;
            this.f841b = c3408a;
            this.f842c = g8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1754596004, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AddressSection.<anonymous>.<anonymous>.<anonymous> (USBankAccountForm.kt:379)");
            }
            AbstractC3414d.a(!this.f840a, this.f841b, a0.f(), this.f842c, composer, (C3408a.f35322c << 3) | 384 | (G.f35073d << 9));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f843a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3408a f844b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f845c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0 f846d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f847e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, C3408a c3408a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f843a = z8;
            this.f844b = c3408a;
            this.f845c = g8;
            this.f846d = e0Var;
            this.f847e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.e(this.f843a, this.f844b, this.f845c, this.f846d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f847e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A3.a f848a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f849b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f850c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f851d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f852e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f853f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f854g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3408a f855h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ G f856i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e0 f857j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f858k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(A3.a aVar, boolean z8, boolean z9, boolean z10, w0 w0Var, w0 w0Var2, Q q8, C3408a c3408a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f848a = aVar;
            this.f849b = z8;
            this.f850c = z9;
            this.f851d = z10;
            this.f852e = w0Var;
            this.f853f = w0Var2;
            this.f854g = q8;
            this.f855h = c3408a;
            this.f856i = g8;
            this.f857j = e0Var;
            this.f858k = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.g(this.f848a, this.f849b, this.f850c, this.f851d, this.f852e, this.f853f, this.f854g, this.f855h, this.f856i, this.f857j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f858k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A3.a f860b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f861c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f862d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f863e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f864f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f865g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3408a f866h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ G f867i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e0 f868j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f869k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z8, A3.a aVar, boolean z9, boolean z10, w0 w0Var, w0 w0Var2, Q q8, C3408a c3408a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f859a = z8;
            this.f860b = aVar;
            this.f861c = z9;
            this.f862d = z10;
            this.f863e = w0Var;
            this.f864f = w0Var2;
            this.f865g = q8;
            this.f866h = c3408a;
            this.f867i = g8;
            this.f868j = e0Var;
            this.f869k = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.h(this.f859a, this.f860b, this.f861c, this.f862d, this.f863e, this.f864f, this.f865g, this.f866h, this.f867i, this.f868j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f869k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f870a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f871b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f872c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z8, Q q8, int i8) {
            super(2);
            this.f870a = z8;
            this.f871b = q8;
            this.f872c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278787130, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PhoneSection.<anonymous>.<anonymous> (USBankAccountForm.kt:343)");
            }
            T.b(!this.f870a, this.f871b, null, null, false, false, null, null, this.f872c, composer, Q.f35195s << 3, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f874b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f875c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, Q q8, int i8, int i9) {
            super(2);
            this.f873a = z8;
            this.f874b = q8;
            this.f875c = i8;
            this.f876d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.i(this.f873a, this.f874b, this.f875c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f876d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class m extends C3136a implements Function0 {
        m(Object obj) {
            super(0, obj, B3.g.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            B3.g.I((B3.g) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class n extends C3136a implements Function0 {
        n(Object obj) {
            super(0, obj, B3.g.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            B3.g.I((B3.g) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class o extends C3136a implements Function0 {
        o(Object obj) {
            super(0, obj, B3.g.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            B3.g.I((B3.g) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A3.a f877a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B3.d f878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f879c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f880d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f881e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(A3.a aVar, B3.d dVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f877a = aVar;
            this.f878b = dVar;
            this.f879c = modifier;
            this.f880d = i8;
            this.f881e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.k(this.f877a, this.f878b, this.f879c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f880d | 1), this.f881e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B3.d f882a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A3.a f883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(B3.d dVar, A3.a aVar) {
            super(0);
            this.f882a = dVar;
            this.f883b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g.b invoke() {
            AbstractC3991f.e.d dVar;
            boolean d8 = this.f882a.d();
            String c8 = this.f882a.c();
            boolean m8 = this.f882a.m();
            boolean o8 = this.f882a.o();
            boolean p8 = this.f882a.p();
            String n8 = this.f882a.n();
            String a8 = this.f882a.a();
            String e8 = this.f882a.e();
            AbstractC3991f b8 = this.f882a.b();
            if (b8 instanceof AbstractC3991f.e.d) {
                dVar = (AbstractC3991f.e.d) b8;
            } else {
                dVar = null;
            }
            return new g.b(d8, this.f883b, m8, o8, p8, n8, a8, e8, dVar, this.f882a.l(), c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z8, boolean z9, String str, String str2, C0 c02, Function0 function0, Composer composer, int i8) {
        int i9;
        boolean z10;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(964687804);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z9)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(str2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(c02)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((i8 & 458752) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(964687804, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AccountDetailsForm (USBankAccountForm.kt:401)");
            }
            MutableState mutableState = (MutableState) RememberSaveableKt.m2583rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) C0010e.f822a, startRestartGroup, 3080, 6);
            startRestartGroup.startReplaceableGroup(1846469047);
            if ((i9 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = Integer.valueOf(B3.b.f741a.a(str));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(f8), 7, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            int i16 = i9;
            Function0 constructor = companion2.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m604paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            F.a(StringResources_androidKt.stringResource(AbstractC3053E.f32847J0, startRestartGroup, 0), PaddingKt.m602paddingVpY3zN4$default(companion, 0.0f, Dp.m5178constructorimpl(f8), 1, null), startRestartGroup, 48, 0);
            composer2 = startRestartGroup;
            p0.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1988669001, true, new a(z9, mutableState, intValue, str, str2)), composer2, 196614, 30);
            composer2.startReplaceableGroup(-670014273);
            if (z8) {
                D0.a(true, c02, PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, Dp.m5178constructorimpl(f8), 0.0f, 0.0f, 13, null), composer2, (C0.f30310g << 3) | 390 | ((i16 >> 9) & 112), 0);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (b(mutableState) && str2 != null) {
                boolean z11 = false;
                String stringResource = StringResources_androidKt.stringResource(w.f37447W, composer2, 0);
                String stringResource2 = StringResources_androidKt.stringResource(w.f37455c, new Object[]{str2}, composer2, 64);
                String stringResource3 = StringResources_androidKt.stringResource(AbstractC3053E.f32839F0, composer2, 0);
                String stringResource4 = StringResources_androidKt.stringResource(AbstractC3053E.f32863V, composer2, 0);
                composer2.startReplaceableGroup(1846556855);
                boolean changed = composer2.changed(mutableState);
                if ((i16 & 458752) == 131072) {
                    z11 = true;
                }
                boolean z12 = changed | z11;
                Object rememberedValue2 = composer2.rememberedValue();
                if (z12 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new b(function0, mutableState);
                    composer2.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1846560597);
                boolean changed2 = composer2.changed(mutableState);
                Object rememberedValue3 = composer2.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(rememberedValue3);
                }
                composer2.endReplaceableGroup();
                I0.a(stringResource, stringResource2, stringResource3, stringResource4, true, function02, (Function0) rememberedValue3, composer2, 24576, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(z8, z9, str, str2, c02, function0, i8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    public static final void d(A3.a formArgs, String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11, w0 nameController, w0 emailController, Q phoneController, C3408a addressController, G g8, e0 e0Var, C0 saveForFutureUseElement, Function0 onRemoveAccount, Composer composer, int i8, int i9) {
        AbstractC3159y.i(formArgs, "formArgs");
        AbstractC3159y.i(nameController, "nameController");
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(phoneController, "phoneController");
        AbstractC3159y.i(addressController, "addressController");
        AbstractC3159y.i(saveForFutureUseElement, "saveForFutureUseElement");
        AbstractC3159y.i(onRemoveAccount, "onRemoveAccount");
        Composer startRestartGroup = composer.startRestartGroup(1342947065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1342947065, i8, i9, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AccountPreviewScreen (USBankAccountForm.kt:209)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i10 = i8 >> 12;
        int i11 = i8 >> 9;
        int i12 = i9 << 21;
        h(z9, formArgs, z10, z11, nameController, emailController, phoneController, addressController, g8, e0Var, startRestartGroup, (i10 & 14) | 294976 | (i11 & 896) | (i11 & 7168) | (Q.f35195s << 18) | (3670016 & i11) | (C3408a.f35322c << 21) | (29360128 & i12) | (G.f35073d << 24) | (234881024 & i12) | (e0.f35448f << 27) | (i12 & 1879048192));
        int i13 = i8 << 3;
        int i14 = (i10 & 112) | (i11 & 14) | (i13 & 896) | (i13 & 7168) | (C0.f30310g << 12);
        int i15 = i9 << 3;
        a(z8, z10, str, str2, saveForFutureUseElement, onRemoveAccount, startRestartGroup, i14 | (57344 & i15) | (i15 & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(formArgs, str, str2, z8, z9, z10, z11, nameController, emailController, phoneController, addressController, g8, e0Var, saveForFutureUseElement, onRemoveAccount, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z8, C3408a c3408a, G g8, e0 e0Var, Composer composer, int i8) {
        int i9;
        String stringResource;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1259934004);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(c3408a)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(g8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(e0Var)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1259934004, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AddressSection (USBankAccountForm.kt:359)");
            }
            C f8 = f(v4.f.a(c3408a.getError(), startRestartGroup, 8));
            startRestartGroup.startReplaceableGroup(543132857);
            if (f8 == null) {
                stringResource = null;
            } else {
                Object[] b8 = f8.b();
                startRestartGroup.startReplaceableGroup(543133715);
                if (b8 == null) {
                    stringResource = null;
                } else {
                    stringResource = StringResources_androidKt.stringResource(f8.a(), Arrays.copyOf(b8, b8.length), startRestartGroup, 64);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(543133285);
                if (stringResource == null) {
                    stringResource = StringResources_androidKt.stringResource(f8.a(), startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5178constructorimpl(0));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment centerEnd = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl2 = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            p0.a(Integer.valueOf(b4.n.f14732j), stringResource, null, false, false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1754596004, true, new g(z8, c3408a, g8)), startRestartGroup, 1572864, 60);
            composer2.startReplaceableGroup(-433026909);
            if (e0Var != null) {
                f0.a(e0Var.i(), composer2, d0.f35426i);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h(z8, c3408a, g8, e0Var, i8));
        }
    }

    private static final C f(State state) {
        return (C) state.getValue();
    }

    public static final void g(A3.a formArgs, boolean z8, boolean z9, boolean z10, w0 nameController, w0 emailController, Q phoneController, C3408a addressController, G g8, e0 e0Var, Composer composer, int i8) {
        AbstractC3159y.i(formArgs, "formArgs");
        AbstractC3159y.i(nameController, "nameController");
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(phoneController, "phoneController");
        AbstractC3159y.i(addressController, "addressController");
        Composer startRestartGroup = composer.startRestartGroup(-304054933);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304054933, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BillingDetailsCollectionScreen (USBankAccountForm.kt:175)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        h(z8, formArgs, z9, z10, nameController, emailController, phoneController, addressController, g8, e0Var, startRestartGroup, ((i8 >> 3) & 14) | 294976 | (i8 & 896) | (i8 & 7168) | (Q.f35195s << 18) | (3670016 & i8) | (C3408a.f35322c << 21) | (29360128 & i8) | (G.f35073d << 24) | (234881024 & i8) | (e0.f35448f << 27) | (1879048192 & i8));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(formArgs, z8, z9, z10, nameController, emailController, phoneController, addressController, g8, e0Var, i8));
        }
    }

    public static final void h(boolean z8, A3.a formArgs, boolean z9, boolean z10, w0 nameController, w0 emailController, Q phoneController, C3408a addressController, G g8, e0 e0Var, Composer composer, int i8) {
        String stringResource;
        boolean z11;
        Object obj;
        Composer composer2;
        int m4870getNexteUduSuo;
        int m4870getNexteUduSuo2;
        AbstractC3159y.i(formArgs, "formArgs");
        AbstractC3159y.i(nameController, "nameController");
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(phoneController, "phoneController");
        AbstractC3159y.i(addressController, "addressController");
        Composer startRestartGroup = composer.startRestartGroup(-741145595);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-741145595, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BillingDetailsForm (USBankAccountForm.kt:246)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (z10) {
            startRestartGroup.startReplaceableGroup(-1176798194);
            stringResource = StringResources_androidKt.stringResource(w.f37444T, startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-1176697134);
            stringResource = StringResources_androidKt.stringResource(w.f37456c0, startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        }
        F.a(stringResource, PaddingKt.m602paddingVpY3zN4$default(companion, 0.0f, Dp.m5178constructorimpl(8), 1, null), startRestartGroup, 48, 0);
        if (!z8 ? formArgs.c().n() != u.d.b.f26397b : formArgs.c().n() == u.d.b.f26398c) {
            z11 = true;
        } else {
            z11 = false;
        }
        startRestartGroup.startReplaceableGroup(100604713);
        if (z11) {
            Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5178constructorimpl(0));
            Alignment centerEnd = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl2 = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            obj = null;
            m4.C0.e(null, nameController, ImeAction.Companion.m4870getNexteUduSuo(), !z9, false, null, null, startRestartGroup, 448, 113);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            obj = null;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100619223);
        if (formArgs.c().k() != u.d.b.f26397b) {
            Modifier m600padding3ABfNKs2 = PaddingKt.m600padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj), Dp.m5178constructorimpl(0));
            Alignment centerEnd2 = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerEnd2, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            X5.o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl3 = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl3.getInserting() || !AbstractC3159y.d(m2496constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2496constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2496constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (AbstractC3159y.d(g8, G.Companion.n())) {
                m4870getNexteUduSuo2 = ImeAction.Companion.m4868getDoneeUduSuo();
            } else {
                m4870getNexteUduSuo2 = ImeAction.Companion.m4870getNexteUduSuo();
            }
            m4.C0.e(null, emailController, m4870getNexteUduSuo2, !z9, false, null, null, startRestartGroup, 64, 113);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100640863);
        if (formArgs.c().o() == u.d.b.f26398c) {
            if (AbstractC3159y.d(g8, G.Companion.t())) {
                m4870getNexteUduSuo = ImeAction.Companion.m4868getDoneeUduSuo();
            } else {
                m4870getNexteUduSuo = ImeAction.Companion.m4870getNexteUduSuo();
            }
            i(z9, phoneController, m4870getNexteUduSuo, startRestartGroup, ((i8 >> 6) & 14) | (Q.f35195s << 3) | ((i8 >> 15) & 112));
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100654761);
        if (formArgs.c().b() == u.d.a.f26393c) {
            int i9 = i8 >> 18;
            composer2 = startRestartGroup;
            e(z9, addressController, g8, e0Var, composer2, (G.f35073d << 6) | ((i8 >> 6) & 14) | (C3408a.f35322c << 3) | (i9 & 112) | (i9 & 896) | (e0.f35448f << 9) | (i9 & 7168));
        } else {
            composer2 = startRestartGroup;
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new j(z8, formArgs, z9, z10, nameController, emailController, phoneController, addressController, g8, e0Var, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(boolean z8, Q q8, int i8, Composer composer, int i9) {
        int i10;
        String stringResource;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1862949300);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(q8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changed(i8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862949300, i10, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PhoneSection (USBankAccountForm.kt:324)");
            }
            C j8 = j(v4.f.a(q8.getError(), startRestartGroup, 8));
            startRestartGroup.startReplaceableGroup(632028479);
            if (j8 == null) {
                stringResource = null;
            } else {
                Object[] b8 = j8.b();
                startRestartGroup.startReplaceableGroup(632029337);
                if (b8 == null) {
                    stringResource = null;
                } else {
                    stringResource = StringResources_androidKt.stringResource(j8.a(), Arrays.copyOf(b8, b8.length), startRestartGroup, 64);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(632028907);
                if (stringResource == null) {
                    stringResource = StringResources_androidKt.stringResource(j8.a(), startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5178constructorimpl(0));
            Alignment centerEnd = Alignment.Companion.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            p0.a(null, stringResource, null, false, false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1278787130, true, new k(z8, q8, i8)), startRestartGroup, 1572870, 60);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(z8, q8, i8, i9));
        }
    }

    private static final C j(State state) {
        return (C) state.getValue();
    }

    public static final void k(A3.a formArgs, B3.d usBankAccountFormArgs, Modifier modifier, Composer composer, int i8, int i9) {
        CreationExtras creationExtras;
        Composer composer2;
        Composer composer3;
        AbstractC3159y.i(formArgs, "formArgs");
        AbstractC3159y.i(usBankAccountFormArgs, "usBankAccountFormArgs");
        Composer startRestartGroup = composer.startRestartGroup(336076536);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(336076536, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountForm (USBankAccountForm.kt:59)");
        }
        g.d dVar = new g.d(new q(usBankAccountFormArgs, formArgs));
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) B3.g.class, current, (String) null, dVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            B3.g gVar = (B3.g) viewModel;
            State a8 = v4.f.a(gVar.n(), startRestartGroup, 8);
            State a9 = v4.f.a(gVar.q(), startRestartGroup, 8);
            B3.c.a(gVar, usBankAccountFormArgs, startRestartGroup, 72);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            B3.f l8 = l(a8);
            if (l8 instanceof f.a) {
                startRestartGroup.startReplaceableGroup(1472164715);
                g(formArgs, usBankAccountFormArgs.d(), l8.f(), usBankAccountFormArgs.p(), gVar.r(), gVar.o(), gVar.s(), gVar.l().s(), m(a9), gVar.v(), startRestartGroup, (Q.f35195s << 18) | 294920 | (C3408a.f35322c << 21) | (G.f35073d << 24) | (e0.f35448f << 27));
                startRestartGroup.endReplaceableGroup();
                composer2 = startRestartGroup;
            } else {
                if (l8 instanceof f.b) {
                    startRestartGroup.startReplaceableGroup(1472980449);
                    f.b bVar = (f.b) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, bVar.i(), bVar.j(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.f(), usBankAccountFormArgs.p(), gVar.r(), gVar.o(), gVar.s(), gVar.l().s(), m(a9), gVar.v(), gVar.x(), new m(gVar), composer3, (Q.f35195s << 27) | 150994952, C3408a.f35322c | (G.f35073d << 3) | (e0.f35448f << 6) | (C0.f30310g << 9));
                    composer3.endReplaceableGroup();
                } else if (l8 instanceof f.e) {
                    startRestartGroup.startReplaceableGroup(1474089443);
                    f.e eVar = (f.e) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, eVar.j().getBankName(), eVar.j().getLast4(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.f(), usBankAccountFormArgs.p(), gVar.r(), gVar.o(), gVar.s(), gVar.l().s(), m(a9), gVar.v(), gVar.x(), new n(gVar), composer3, (Q.f35195s << 27) | 150994952, C3408a.f35322c | (G.f35073d << 3) | (e0.f35448f << 6) | (C0.f30310g << 9));
                    composer3.endReplaceableGroup();
                } else if (l8 instanceof f.d) {
                    startRestartGroup.startReplaceableGroup(1475215425);
                    f.d dVar2 = (f.d) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, dVar2.i(), dVar2.k(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.f(), usBankAccountFormArgs.p(), gVar.r(), gVar.o(), gVar.s(), gVar.l().s(), m(a9), gVar.v(), gVar.x(), new o(gVar), composer3, (Q.f35195s << 27) | 150994952, C3408a.f35322c | (G.f35073d << 3) | (e0.f35448f << 6) | (C0.f30310g << 9));
                    composer3.endReplaceableGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceableGroup(1476229590);
                    composer2.endReplaceableGroup();
                }
                composer2 = composer3;
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new p(formArgs, usBankAccountFormArgs, modifier2, i8, i9));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    private static final B3.f l(State state) {
        return (B3.f) state.getValue();
    }

    private static final G m(State state) {
        return (G) state.getValue();
    }
}
