package E3;

import B3.f;
import E3.f;
import E3.g;
import O5.I;
import P5.a0;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import h4.C0;
import h4.D0;
import h4.I0;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3232a;
import m2.AbstractC3407E;
import m4.AbstractC3441m;
import p4.AbstractC3757d;
import p4.C;
import p4.C3751a;
import p4.F;
import p4.G;
import p4.Q;
import p4.T;
import p4.d0;
import p4.e0;
import p4.f0;
import p4.p0;
import p4.w0;
import t3.w;

/* loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f2402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2403c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f2404d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2405e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: E3.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0034a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f2406a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0034a(MutableState mutableState) {
                super(0);
                this.f2406a = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5invoke() {
                e.c(this.f2406a, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, MutableState mutableState, int i8, String str, String str2) {
            super(2);
            this.f2401a = z8;
            this.f2402b = mutableState;
            this.f2403c = i8;
            this.f2404d = str;
            this.f2405e = str2;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
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
            Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(PaddingKt.m609paddingqDBjuR0$default(PaddingKt.m607paddingVpY3zN4$default(SizeKt.m640heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5183constructorimpl(56), 0.0f, 2, null), 0.0f, Dp.m5183constructorimpl(12), 1, null), Dp.m5183constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, Dp.m5183constructorimpl(f8), 0.0f, 11, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            boolean z8 = this.f2401a;
            MutableState mutableState = this.f2402b;
            int i9 = this.f2403c;
            String str = this.f2404d;
            String str2 = this.f2405e;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
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
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = arrangement.m519spacedBy0680j_4(Dp.m5183constructorimpl(f8));
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m519spacedBy0680j_4, centerVertically2, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m2501constructorimpl2 = Updater.m2501constructorimpl(composer);
            Updater.m2508setimpl(m2501constructorimpl2, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            float f9 = 24;
            ImageKt.Image(PainterResources_androidKt.painterResource(i9, composer, 0), (String) null, SizeKt.m652size3ABfNKs(companion, Dp.m5183constructorimpl(f9)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
            TextKt.m1419Text4IGK_g(str + " •••• " + str2, AlphaKt.alpha(companion, z8 ? 0.5f : 1.0f), AbstractC3441m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131064);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            boolean z9 = !z8;
            Modifier m652size3ABfNKs = SizeKt.m652size3ABfNKs(companion, Dp.m5183constructorimpl(f9));
            composer.startReplaceableGroup(-224308683);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0034a(mutableState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            IconButtonKt.IconButton((Function0) rememberedValue, m652size3ABfNKs, z9, null, E3.a.f2333a.a(), composer, 24624, 8);
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
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f2407a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f2408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0, MutableState mutableState) {
            super(0);
            this.f2407a = function0;
            this.f2408b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            e.c(this.f2408b, false);
            this.f2407a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f2409a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState mutableState) {
            super(0);
            this.f2409a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            e.c(this.f2409a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2411b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f2412c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f2413d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0 f2414e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f2415f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f2416g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, String str, String str2, C0 c02, Function0 function0, int i8) {
            super(2);
            this.f2410a = z8;
            this.f2411b = z9;
            this.f2412c = str;
            this.f2413d = str2;
            this.f2414e = c02;
            this.f2415f = function0;
            this.f2416g = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.a(this.f2410a, this.f2411b, this.f2412c, this.f2413d, this.f2414e, this.f2415f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2416g | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E3.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0035e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0035e f2417a = new C0035e();

        C0035e() {
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
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D3.a f2418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2419b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f2420c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2421d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f2422e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2423f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f2424g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f2425h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w0 f2426i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Q f2427j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C3751a f2428k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ G f2429l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ e0 f2430m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C0 f2431n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f2432o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f2433p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f2434q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(D3.a aVar, String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11, w0 w0Var, w0 w0Var2, Q q8, C3751a c3751a, G g8, e0 e0Var, C0 c02, Function0 function0, int i8, int i9) {
            super(2);
            this.f2418a = aVar;
            this.f2419b = str;
            this.f2420c = str2;
            this.f2421d = z8;
            this.f2422e = z9;
            this.f2423f = z10;
            this.f2424g = z11;
            this.f2425h = w0Var;
            this.f2426i = w0Var2;
            this.f2427j = q8;
            this.f2428k = c3751a;
            this.f2429l = g8;
            this.f2430m = e0Var;
            this.f2431n = c02;
            this.f2432o = function0;
            this.f2433p = i8;
            this.f2434q = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.d(this.f2418a, this.f2419b, this.f2420c, this.f2421d, this.f2422e, this.f2423f, this.f2424g, this.f2425h, this.f2426i, this.f2427j, this.f2428k, this.f2429l, this.f2430m, this.f2431n, this.f2432o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2433p | 1), RecomposeScopeImplKt.updateChangedFlags(this.f2434q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2435a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3751a f2436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f2437c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z8, C3751a c3751a, G g8) {
            super(2);
            this.f2435a = z8;
            this.f2436b = c3751a;
            this.f2437c = g8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1754596004, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AddressSection.<anonymous>.<anonymous>.<anonymous> (USBankAccountForm.kt:379)");
            }
            AbstractC3757d.a(!this.f2435a, this.f2436b, a0.f(), this.f2437c, composer, (C3751a.f37348c << 3) | 384 | (G.f37099d << 9));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2438a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3751a f2439b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f2440c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0 f2441d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2442e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, C3751a c3751a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f2438a = z8;
            this.f2439b = c3751a;
            this.f2440c = g8;
            this.f2441d = e0Var;
            this.f2442e = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.e(this.f2438a, this.f2439b, this.f2440c, this.f2441d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2442e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D3.a f2443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2445c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2446d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f2447e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f2448f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f2449g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3751a f2450h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ G f2451i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e0 f2452j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f2453k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(D3.a aVar, boolean z8, boolean z9, boolean z10, w0 w0Var, w0 w0Var2, Q q8, C3751a c3751a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f2443a = aVar;
            this.f2444b = z8;
            this.f2445c = z9;
            this.f2446d = z10;
            this.f2447e = w0Var;
            this.f2448f = w0Var2;
            this.f2449g = q8;
            this.f2450h = c3751a;
            this.f2451i = g8;
            this.f2452j = e0Var;
            this.f2453k = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.g(this.f2443a, this.f2444b, this.f2445c, this.f2446d, this.f2447e, this.f2448f, this.f2449g, this.f2450h, this.f2451i, this.f2452j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2453k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2454a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D3.a f2455b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2456c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2457d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f2458e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f2459f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f2460g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3751a f2461h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ G f2462i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e0 f2463j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f2464k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z8, D3.a aVar, boolean z9, boolean z10, w0 w0Var, w0 w0Var2, Q q8, C3751a c3751a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f2454a = z8;
            this.f2455b = aVar;
            this.f2456c = z9;
            this.f2457d = z10;
            this.f2458e = w0Var;
            this.f2459f = w0Var2;
            this.f2460g = q8;
            this.f2461h = c3751a;
            this.f2462i = g8;
            this.f2463j = e0Var;
            this.f2464k = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.h(this.f2454a, this.f2455b, this.f2456c, this.f2457d, this.f2458e, this.f2459f, this.f2460g, this.f2461h, this.f2462i, this.f2463j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2464k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2465a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f2466b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2467c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z8, Q q8, int i8) {
            super(2);
            this.f2465a = z8;
            this.f2466b = q8;
            this.f2467c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278787130, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PhoneSection.<anonymous>.<anonymous> (USBankAccountForm.kt:343)");
            }
            T.b(!this.f2465a, this.f2466b, null, null, false, false, null, null, this.f2467c, composer, Q.f37221s << 3, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2468a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f2469b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2470c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2471d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, Q q8, int i8, int i9) {
            super(2);
            this.f2468a = z8;
            this.f2469b = q8;
            this.f2470c = i8;
            this.f2471d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.i(this.f2468a, this.f2469b, this.f2470c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2471d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class m extends C3232a implements Function0 {
        m(Object obj) {
            super(0, obj, E3.g.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            E3.g.I((E3.g) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class n extends C3232a implements Function0 {
        n(Object obj) {
            super(0, obj, E3.g.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            E3.g.I((E3.g) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class o extends C3232a implements Function0 {
        o(Object obj) {
            super(0, obj, E3.g.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            E3.g.I((E3.g) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D3.a f2472a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.d f2473b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f2474c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2475d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2476e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(D3.a aVar, E3.d dVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f2472a = aVar;
            this.f2473b = dVar;
            this.f2474c = modifier;
            this.f2475d = i8;
            this.f2476e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.k(this.f2472a, this.f2473b, this.f2474c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2475d | 1), this.f2476e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E3.d f2477a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D3.a f2478b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(E3.d dVar, D3.a aVar) {
            super(0);
            this.f2477a = dVar;
            this.f2478b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g.b invoke() {
            f.e.d dVar;
            boolean d8 = this.f2477a.d();
            String c8 = this.f2477a.c();
            boolean m8 = this.f2477a.m();
            boolean o8 = this.f2477a.o();
            boolean p8 = this.f2477a.p();
            String n8 = this.f2477a.n();
            String a8 = this.f2477a.a();
            String e8 = this.f2477a.e();
            B3.f b8 = this.f2477a.b();
            if (b8 instanceof f.e.d) {
                dVar = (f.e.d) b8;
            } else {
                dVar = null;
            }
            return new g.b(d8, this.f2478b, m8, o8, p8, n8, a8, e8, dVar, this.f2477a.l(), c8);
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
            MutableState mutableState = (MutableState) RememberSaveableKt.m2588rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) C0035e.f2417a, startRestartGroup, 3080, 6);
            startRestartGroup.startReplaceableGroup(1846469047);
            if ((i9 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = Integer.valueOf(E3.b.f2336a.a(str));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(f8), 7, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            int i16 = i9;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            F.a(StringResources_androidKt.stringResource(AbstractC3407E.f34823J0, startRestartGroup, 0), PaddingKt.m607paddingVpY3zN4$default(companion, 0.0f, Dp.m5183constructorimpl(f8), 1, null), startRestartGroup, 48, 0);
            composer2 = startRestartGroup;
            p0.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1988669001, true, new a(z9, mutableState, intValue, str, str2)), composer2, 196614, 30);
            composer2.startReplaceableGroup(-670014273);
            if (z8) {
                D0.a(true, c02, PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, Dp.m5183constructorimpl(f8), 0.0f, 0.0f, 13, null), composer2, (C0.f32231g << 3) | 390 | ((i16 >> 9) & 112), 0);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (b(mutableState) && str2 != null) {
                boolean z11 = false;
                String stringResource = StringResources_androidKt.stringResource(w.f39769W, composer2, 0);
                String stringResource2 = StringResources_androidKt.stringResource(w.f39777c, new Object[]{str2}, composer2, 64);
                String stringResource3 = StringResources_androidKt.stringResource(AbstractC3407E.f34815F0, composer2, 0);
                String stringResource4 = StringResources_androidKt.stringResource(AbstractC3407E.f34839V, composer2, 0);
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

    public static final void d(D3.a formArgs, String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11, w0 nameController, w0 emailController, Q phoneController, C3751a addressController, G g8, e0 e0Var, C0 saveForFutureUseElement, Function0 onRemoveAccount, Composer composer, int i8, int i9) {
        AbstractC3255y.i(formArgs, "formArgs");
        AbstractC3255y.i(nameController, "nameController");
        AbstractC3255y.i(emailController, "emailController");
        AbstractC3255y.i(phoneController, "phoneController");
        AbstractC3255y.i(addressController, "addressController");
        AbstractC3255y.i(saveForFutureUseElement, "saveForFutureUseElement");
        AbstractC3255y.i(onRemoveAccount, "onRemoveAccount");
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        int i10 = i8 >> 12;
        int i11 = i8 >> 9;
        int i12 = i9 << 21;
        h(z9, formArgs, z10, z11, nameController, emailController, phoneController, addressController, g8, e0Var, startRestartGroup, (i10 & 14) | 294976 | (i11 & 896) | (i11 & 7168) | (Q.f37221s << 18) | (3670016 & i11) | (C3751a.f37348c << 21) | (29360128 & i12) | (G.f37099d << 24) | (234881024 & i12) | (e0.f37474f << 27) | (i12 & 1879048192));
        int i13 = i8 << 3;
        int i14 = (i10 & 112) | (i11 & 14) | (i13 & 896) | (i13 & 7168) | (C0.f32231g << 12);
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
    public static final void e(boolean z8, C3751a c3751a, G g8, e0 e0Var, Composer composer, int i8) {
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
            if (startRestartGroup.changed(c3751a)) {
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
            C f8 = f(y4.f.a(c3751a.getError(), startRestartGroup, 8));
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
            Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5183constructorimpl(0));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment centerEnd = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs);
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2508setimpl(m2501constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            p0.a(Integer.valueOf(e4.n.f31738j), stringResource, null, false, false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1754596004, true, new g(z8, c3751a, g8)), startRestartGroup, 1572864, 60);
            composer2.startReplaceableGroup(-433026909);
            if (e0Var != null) {
                f0.a(e0Var.i(), composer2, d0.f37452i);
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
            endRestartGroup.updateScope(new h(z8, c3751a, g8, e0Var, i8));
        }
    }

    private static final C f(State state) {
        return (C) state.getValue();
    }

    public static final void g(D3.a formArgs, boolean z8, boolean z9, boolean z10, w0 nameController, w0 emailController, Q phoneController, C3751a addressController, G g8, e0 e0Var, Composer composer, int i8) {
        AbstractC3255y.i(formArgs, "formArgs");
        AbstractC3255y.i(nameController, "nameController");
        AbstractC3255y.i(emailController, "emailController");
        AbstractC3255y.i(phoneController, "phoneController");
        AbstractC3255y.i(addressController, "addressController");
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        h(z8, formArgs, z9, z10, nameController, emailController, phoneController, addressController, g8, e0Var, startRestartGroup, ((i8 >> 3) & 14) | 294976 | (i8 & 896) | (i8 & 7168) | (Q.f37221s << 18) | (3670016 & i8) | (C3751a.f37348c << 21) | (29360128 & i8) | (G.f37099d << 24) | (234881024 & i8) | (e0.f37474f << 27) | (1879048192 & i8));
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

    public static final void h(boolean z8, D3.a formArgs, boolean z9, boolean z10, w0 nameController, w0 emailController, Q phoneController, C3751a addressController, G g8, e0 e0Var, Composer composer, int i8) {
        String stringResource;
        boolean z11;
        Object obj;
        Composer composer2;
        int m4875getNexteUduSuo;
        int m4875getNexteUduSuo2;
        AbstractC3255y.i(formArgs, "formArgs");
        AbstractC3255y.i(nameController, "nameController");
        AbstractC3255y.i(emailController, "emailController");
        AbstractC3255y.i(phoneController, "phoneController");
        AbstractC3255y.i(addressController, "addressController");
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (z10) {
            startRestartGroup.startReplaceableGroup(-1176798194);
            stringResource = StringResources_androidKt.stringResource(w.f39766T, startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-1176697134);
            stringResource = StringResources_androidKt.stringResource(w.f39778c0, startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        }
        F.a(stringResource, PaddingKt.m607paddingVpY3zN4$default(companion, 0.0f, Dp.m5183constructorimpl(8), 1, null), startRestartGroup, 48, 0);
        if (!z8 ? formArgs.c().s() != u.d.b.f27452b : formArgs.c().s() == u.d.b.f27453c) {
            z11 = true;
        } else {
            z11 = false;
        }
        startRestartGroup.startReplaceableGroup(100604713);
        if (z11) {
            Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5183constructorimpl(0));
            Alignment centerEnd = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
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
            Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            obj = null;
            p4.C0.e(null, nameController, ImeAction.Companion.m4875getNexteUduSuo(), !z9, false, null, null, startRestartGroup, 448, 113);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            obj = null;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100619223);
        if (formArgs.c().p() != u.d.b.f27452b) {
            Modifier m605padding3ABfNKs2 = PaddingKt.m605padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj), Dp.m5183constructorimpl(0));
            Alignment centerEnd2 = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerEnd2, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl3 = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (AbstractC3255y.d(g8, G.Companion.n())) {
                m4875getNexteUduSuo2 = ImeAction.Companion.m4873getDoneeUduSuo();
            } else {
                m4875getNexteUduSuo2 = ImeAction.Companion.m4875getNexteUduSuo();
            }
            p4.C0.e(null, emailController, m4875getNexteUduSuo2, !z9, false, null, null, startRestartGroup, 64, 113);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100640863);
        if (formArgs.c().u() == u.d.b.f27453c) {
            if (AbstractC3255y.d(g8, G.Companion.t())) {
                m4875getNexteUduSuo = ImeAction.Companion.m4873getDoneeUduSuo();
            } else {
                m4875getNexteUduSuo = ImeAction.Companion.m4875getNexteUduSuo();
            }
            i(z9, phoneController, m4875getNexteUduSuo, startRestartGroup, ((i8 >> 6) & 14) | (Q.f37221s << 3) | ((i8 >> 15) & 112));
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100654761);
        if (formArgs.c().a() == u.d.a.f27448c) {
            int i9 = i8 >> 18;
            composer2 = startRestartGroup;
            e(z9, addressController, g8, e0Var, composer2, (G.f37099d << 6) | ((i8 >> 6) & 14) | (C3751a.f37348c << 3) | (i9 & 112) | (i9 & 896) | (e0.f37474f << 9) | (i9 & 7168));
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
            C j8 = j(y4.f.a(q8.getError(), startRestartGroup, 8));
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
            Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5183constructorimpl(0));
            Alignment centerEnd = Alignment.Companion.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs);
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
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

    public static final void k(D3.a formArgs, E3.d usBankAccountFormArgs, Modifier modifier, Composer composer, int i8, int i9) {
        CreationExtras creationExtras;
        Composer composer2;
        Composer composer3;
        AbstractC3255y.i(formArgs, "formArgs");
        AbstractC3255y.i(usBankAccountFormArgs, "usBankAccountFormArgs");
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
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) E3.g.class, current, (String) null, dVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            E3.g gVar = (E3.g) viewModel;
            State a8 = y4.f.a(gVar.n(), startRestartGroup, 8);
            State a9 = y4.f.a(gVar.q(), startRestartGroup, 8);
            E3.c.a(gVar, usBankAccountFormArgs, startRestartGroup, 72);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            E3.f l8 = l(a8);
            if (l8 instanceof f.a) {
                startRestartGroup.startReplaceableGroup(1472164715);
                g(formArgs, usBankAccountFormArgs.d(), l8.h(), usBankAccountFormArgs.p(), gVar.r(), gVar.o(), gVar.s(), gVar.l().s(), m(a9), gVar.v(), startRestartGroup, (Q.f37221s << 18) | 294920 | (C3751a.f37348c << 21) | (G.f37099d << 24) | (e0.f37474f << 27));
                startRestartGroup.endReplaceableGroup();
                composer2 = startRestartGroup;
            } else {
                if (l8 instanceof f.b) {
                    startRestartGroup.startReplaceableGroup(1472980449);
                    f.b bVar = (f.b) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, bVar.i(), bVar.l(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.h(), usBankAccountFormArgs.p(), gVar.r(), gVar.o(), gVar.s(), gVar.l().s(), m(a9), gVar.v(), gVar.x(), new m(gVar), composer3, (Q.f37221s << 27) | 150994952, C3751a.f37348c | (G.f37099d << 3) | (e0.f37474f << 6) | (C0.f32231g << 9));
                    composer3.endReplaceableGroup();
                } else if (l8 instanceof f.e) {
                    startRestartGroup.startReplaceableGroup(1474089443);
                    f.e eVar = (f.e) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, eVar.l().getBankName(), eVar.l().getLast4(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.h(), usBankAccountFormArgs.p(), gVar.r(), gVar.o(), gVar.s(), gVar.l().s(), m(a9), gVar.v(), gVar.x(), new n(gVar), composer3, (Q.f37221s << 27) | 150994952, C3751a.f37348c | (G.f37099d << 3) | (e0.f37474f << 6) | (C0.f32231g << 9));
                    composer3.endReplaceableGroup();
                } else if (l8 instanceof f.d) {
                    startRestartGroup.startReplaceableGroup(1475215425);
                    f.d dVar2 = (f.d) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, dVar2.i(), dVar2.p(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.h(), usBankAccountFormArgs.p(), gVar.r(), gVar.o(), gVar.s(), gVar.l().s(), m(a9), gVar.v(), gVar.x(), new o(gVar), composer3, (Q.f37221s << 27) | 150994952, C3751a.f37348c | (G.f37099d << 3) | (e0.f37474f << 6) | (C0.f32231g << 9));
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

    private static final E3.f l(State state) {
        return (E3.f) state.getValue();
    }

    private static final G m(State state) {
        return (G) state.getValue();
    }
}
