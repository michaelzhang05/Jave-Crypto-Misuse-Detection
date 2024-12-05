package com.stripe.android.paymentsheet.ui;

import J3.K;
import J3.N;
import J3.P;
import L5.I;
import L5.t;
import X5.n;
import X5.o;
import X5.p;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.paymentsheet.ui.d;
import i6.M;
import i6.X;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.s;
import q3.w;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ContentTransform f26656a = AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 90, null, 4, null), 0.0f, 2, null));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26657a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableFloatState f26658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableFloatState mutableFloatState, P5.d dVar) {
            super(2, dVar);
            this.f26658b = mutableFloatState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f26658b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26657a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                this.f26657a = 1;
                if (X.b(250L, this) == e8) {
                    return e8;
                }
            }
            c.e(this.f26658b, 0.0f);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f26660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f26661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState, State state, P5.d dVar) {
            super(2, dVar);
            this.f26660b = mutableState;
            this.f26661c = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f26660b, this.f26661c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26659a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                if (c.b(this.f26660b)) {
                    this.f26659a = 1;
                    if (X.b(1500L, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
            c.g(this.f26661c).invoke();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.ui.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0664c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f26663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0664c(State state, P5.d dVar) {
            super(2, dVar);
            this.f26663b = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0664c(this.f26663b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0664c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f26662a == 0) {
                t.b(obj);
                c.g(this.f26663b).invoke();
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BoxScope f26664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f26665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BoxScope boxScope, Function0 function0, int i8) {
            super(2);
            this.f26664a = boxScope;
            this.f26665b = function0;
            this.f26666c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            c.a(this.f26664a, this.f26665b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26666c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f26667a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MutableState mutableState) {
            super(1);
            this.f26667a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return I.f6487a;
        }

        public final void invoke(float f8) {
            if (f8 == 0.0f) {
                c.c(this.f26667a, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f26668a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ContentTransform invoke(AnimatedContentTransitionScope AnimatedContent) {
            AbstractC3159y.i(AnimatedContent, "$this$AnimatedContent");
            return c.f26656a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26669a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.ui.d f26670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26671c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f26672d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0 function0, com.stripe.android.paymentsheet.ui.d dVar, String str, boolean z8) {
            super(4);
            this.f26669a = function0;
            this.f26670b = dVar;
            this.f26671c = str;
            this.f26672d = z8;
        }

        public final void a(AnimatedContentScope AnimatedContent, boolean z8, Composer composer, int i8) {
            AbstractC3159y.i(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(975531133, i8, -1, "com.stripe.android.paymentsheet.ui.Content.<anonymous> (PrimaryButtonNew.kt:161)");
            }
            Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m5178constructorimpl(8), 0.0f, 2, null);
            Function0 function0 = this.f26669a;
            com.stripe.android.paymentsheet.ui.d dVar = this.f26670b;
            String str = this.f26671c;
            boolean z9 = this.f26672d;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m602paddingVpY3zN4$default);
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
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z8) {
                composer.startReplaceableGroup(-576214542);
                c.a(boxScopeInstance, function0, composer, 6);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-576116799);
                composer.startReplaceableGroup(2059627674);
                boolean z10 = dVar instanceof d.b;
                if (!z10) {
                    str = StringResources_androidKt.stringResource(w.f37446V, composer, 0);
                }
                String str2 = str;
                composer.endReplaceableGroup();
                c.j(boxScopeInstance, str2, !z10, z9, composer, 6);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // X5.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Number) obj4).intValue());
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26673a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.ui.d f26674b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26675c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f26676d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26677e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, com.stripe.android.paymentsheet.ui.d dVar, boolean z8, Function0 function0, int i8) {
            super(2);
            this.f26673a = str;
            this.f26674b = dVar;
            this.f26675c = z8;
            this.f26676d = function0;
            this.f26677e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            c.h(this.f26673a, this.f26674b, this.f26675c, this.f26676d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26677e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f26678a = new i();

        i() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5546invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5546invoke();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26679a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26680b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J3.M f26681c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K f26682d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f26683e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f26684f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.ui.d f26685g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f26686h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f26687i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f26688a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.ui.d f26689b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f26690c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0 f26691d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, com.stripe.android.paymentsheet.ui.d dVar, boolean z8, Function0 function0) {
                super(3);
                this.f26688a = str;
                this.f26689b = dVar;
                this.f26690c = z8;
                this.f26691d = function0;
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6487a;
            }

            public final void invoke(RowScope TextButton, Composer composer, int i8) {
                AbstractC3159y.i(TextButton, "$this$TextButton");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-775915190, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButtonNew.kt:135)");
                }
                c.h(this.f26688a, this.f26689b, this.f26690c, this.f26691d, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function0 function0, boolean z8, J3.M m8, K k8, long j8, String str, com.stripe.android.paymentsheet.ui.d dVar, boolean z9, Function0 function02) {
            super(2);
            this.f26679a = function0;
            this.f26680b = z8;
            this.f26681c = m8;
            this.f26682d = k8;
            this.f26683e = j8;
            this.f26684f = str;
            this.f26685g = dVar;
            this.f26686h = z9;
            this.f26687i = function02;
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
                ComposerKt.traceEventStart(846730925, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.<anonymous> (PrimaryButtonNew.kt:116)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment center = Alignment.Companion.getCenter();
            Function0 function0 = this.f26679a;
            boolean z8 = this.f26680b;
            J3.M m8 = this.f26681c;
            K k8 = this.f26682d;
            long j8 = this.f26683e;
            String str = this.f26684f;
            com.stripe.android.paymentsheet.ui.d dVar = this.f26685g;
            boolean z9 = this.f26686h;
            Function0 function02 = this.f26687i;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ButtonKt.TextButton(function0, SizeKt.m632defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(s.f37392g, composer, 0), 1, null), z8, null, null, RoundedCornerShapeKt.m852RoundedCornerShape0680j_4(m8.b()), BorderStrokeKt.m309BorderStrokecXLIe8U(m8.a(), k8.b()), ButtonDefaults.INSTANCE.m1142buttonColorsro_MJ88(j8, 0L, j8, 0L, composer, ButtonDefaults.$stable << 12, 10), null, ComposableLambdaKt.composableLambda(composer, -775915190, true, new a(str, dVar, z9, function02)), composer, 805306368, 280);
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
    public static final class k extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26692a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26693b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26694c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.ui.d f26695d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f26696e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f26697f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f26698g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26699h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, boolean z8, boolean z9, com.stripe.android.paymentsheet.ui.d dVar, Function0 function0, Function0 function02, int i8, int i9) {
            super(2);
            this.f26692a = str;
            this.f26693b = z8;
            this.f26694c = z9;
            this.f26695d = dVar;
            this.f26696e = function0;
            this.f26697f = function02;
            this.f26698g = i8;
            this.f26699h = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            c.i(this.f26692a, this.f26693b, this.f26694c, this.f26695d, this.f26696e, this.f26697f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26698g | 1), this.f26699h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BoxScope f26700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26702c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f26703d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26704e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(BoxScope boxScope, String str, boolean z8, boolean z9, int i8) {
            super(2);
            this.f26700a = boxScope;
            this.f26701b = str;
            this.f26702c = z8;
            this.f26703d = z9;
            this.f26704e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            c.j(this.f26700a, this.f26701b, this.f26702c, this.f26703d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26704e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BoxScope boxScope, Function0 function0, Composer composer, int i8) {
        int i9;
        float f8;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1926897466);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        int i12 = i9;
        if ((i12 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1926897466, i12, -1, "com.stripe.android.paymentsheet.ui.AnimatedCompleteProcessing (PrimaryButtonNew.kt:227)");
            }
            boolean booleanValue = ((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            startRestartGroup.startReplaceableGroup(2016715285);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(2016717634);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                if (booleanValue) {
                    f8 = 0.0f;
                } else {
                    f8 = 1.0f;
                }
                rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f8);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            float d8 = d(mutableFloatState);
            startRestartGroup.startReplaceableGroup(2016728368);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new e(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(d8, null, 0.0f, "CheckmarkAnimation", (Function1) rememberedValue3, startRestartGroup, 27648, 6);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i12 >> 3) & 14);
            if (!booleanValue) {
                startRestartGroup.startReplaceableGroup(-1905669847);
                I i13 = I.f6487a;
                startRestartGroup.startReplaceableGroup(2016737481);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new a(mutableFloatState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(i13, (n) rememberedValue4, startRestartGroup, 70);
                Boolean valueOf = Boolean.valueOf(b(mutableState));
                Function0 g8 = g(rememberUpdatedState);
                startRestartGroup.startReplaceableGroup(2016743048);
                boolean changed = startRestartGroup.changed(rememberUpdatedState);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new b(mutableState, rememberUpdatedState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf, g8, (n) rememberedValue5, startRestartGroup, 512);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1905304822);
                Function0 g9 = g(rememberUpdatedState);
                startRestartGroup.startReplaceableGroup(2016750204);
                boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new C0664c(rememberUpdatedState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(g9, (n) rememberedValue6, startRestartGroup, 64);
                startRestartGroup.endReplaceableGroup();
            }
            IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(q3.t.f37412s, startRestartGroup, 0), (String) null, boxScope.align(Modifier.Companion, new BiasAlignment(f(animateFloatAsState), 0.0f)), N.f4861a.a(startRestartGroup, 6).d(), startRestartGroup, 56, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(boxScope, function0, i8));
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

    private static final float d(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableFloatState mutableFloatState, float f8) {
        mutableFloatState.setFloatValue(f8);
    }

    private static final float f(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 g(State state) {
        return (Function0) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(String str, com.stripe.android.paymentsheet.ui.d dVar, boolean z8, Function0 function0, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1737940192);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(dVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
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
                ComposerKt.traceEventStart(1737940192, i9, -1, "com.stripe.android.paymentsheet.ui.Content (PrimaryButtonNew.kt:152)");
            }
            composer2 = startRestartGroup;
            AnimatedContentKt.AnimatedContent(Boolean.valueOf(dVar instanceof d.a), IntrinsicKt.height(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), IntrinsicSize.Max), f.f26668a, null, "ContentAnimation", null, ComposableLambdaKt.composableLambda(startRestartGroup, 975531133, true, new g(function0, dVar, str, z8)), startRestartGroup, 1597872, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h(str, dVar, z8, function0, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.String r25, boolean r26, boolean r27, com.stripe.android.paymentsheet.ui.d r28, kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function0 r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.c.i(java.lang.String, boolean, boolean, com.stripe.android.paymentsheet.ui.d, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BoxScope boxScope, String str, boolean z8, boolean z9, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-190300587);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(str)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(z9)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-190300587, i9, -1, "com.stripe.android.paymentsheet.ui.StaticIncompleteProcessing (PrimaryButtonNew.kt:187)");
            }
            N n8 = N.f4861a;
            K a8 = n8.a(startRestartGroup, 6);
            P f8 = n8.f(startRestartGroup, 6);
            FontFamily a9 = f8.a();
            if (a9 == null) {
                a9 = FontFamily.Companion.getDefault();
            }
            TextStyle textStyle = new TextStyle(0L, f8.b(), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, a9, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777177, (AbstractC3151p) null);
            long m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(a8.c(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            TextKt.m1414Text4IGK_g(str, boxScope.align(companion, companion2.getCenter()), m2970copywmQWz5c$default, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, textStyle, startRestartGroup, (i9 >> 3) & 14, 0, 65528);
            if (z8) {
                startRestartGroup.startReplaceableGroup(2039855682);
                q2.b.b(boxScope.align(companion, companion2.getCenterEnd()), m2970copywmQWz5c$default, startRestartGroup, 0, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (z9) {
                startRestartGroup.startReplaceableGroup(2040015053);
                IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(q3.t.f37413t, startRestartGroup, 0), (String) null, boxScope.align(companion, companion2.getCenterEnd()), m2970copywmQWz5c$default, startRestartGroup, 56, 0);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(2040320651);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(boxScope, str, z8, z9, i8));
        }
    }
}
