package h4;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import android.content.Context;
import android.content.Intent;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class E0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ManagedActivityResultLauncher f32264a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f32265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ManagedActivityResultLauncher managedActivityResultLauncher, Context context) {
            super(0);
            this.f32264a = managedActivityResultLauncher;
            this.f32265b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5583invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5583invoke() {
            this.f32264a.launch(new Intent(this.f32265b, (Class<?>) CardScanActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f32267b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32268c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, Function1 function1, int i8) {
            super(2);
            this.f32266a = z8;
            this.f32267b = function1;
            this.f32268c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            E0.a(this.f32266a, this.f32267b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32268c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f32269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1 function1) {
            super(1);
            this.f32269a = function1;
        }

        public final void a(ActivityResult it) {
            AbstractC3255y.i(it, "it");
            Intent data = it.getData();
            if (data != null) {
                this.f32269a.invoke(data);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ActivityResult) obj);
            return O5.I.f8278a;
        }
    }

    public static final void a(boolean z8, Function1 onResult, Composer composer, int i8) {
        int i9;
        boolean z9;
        Composer composer2;
        int i10;
        int i11;
        AbstractC3255y.i(onResult, "onResult");
        Composer startRestartGroup = composer.startRestartGroup(1242685780);
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
            if (startRestartGroup.changedInstance(onResult)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1242685780, i9, -1, "com.stripe.android.ui.core.elements.ScanCardButtonUI (ScanCardButtonUI.kt:30)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            startRestartGroup.startReplaceableGroup(1696785139);
            if ((i9 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new c(onResult);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (Function1) rememberedValue, startRestartGroup, 8);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1696792073);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m318clickableO2vRcR0$default = ClickableKt.m318clickableO2vRcR0$default(companion, (MutableInteractionSource) rememberedValue2, null, z8, null, null, new a(rememberLauncherForActivityResult, context), 24, null);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m318clickableO2vRcR0$default);
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
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(e4.k.f31661L, startRestartGroup, 0);
            int i12 = e4.n.f31691A0;
            String stringResource = StringResources_androidKt.stringResource(i12, startRestartGroup, 0);
            ColorFilter.Companion companion3 = ColorFilter.Companion;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            ColorFilter m3017tintxETnrds$default = ColorFilter.Companion.m3017tintxETnrds$default(companion3, materialTheme.getColors(startRestartGroup, i13).m1183getPrimary0d7_KjU(), 0, 2, null);
            float f8 = 18;
            Modifier m638height3ABfNKs = SizeKt.m638height3ABfNKs(SizeKt.m657width3ABfNKs(companion, Dp.m5183constructorimpl(f8)), Dp.m5183constructorimpl(f8));
            composer2 = startRestartGroup;
            ImageKt.Image(painterResource, stringResource, m638height3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, m3017tintxETnrds$default, composer2, 392, 56);
            TextKt.m1419Text4IGK_g(StringResources_androidKt.stringResource(i12, composer2, 0), PaddingKt.m609paddingqDBjuR0$default(companion, Dp.m5183constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer2, i13).m1183getPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer2, i13).getH6(), composer2, 48, 0, 65528);
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
            endRestartGroup.updateScope(new b(z8, onResult, i8));
        }
    }
}
