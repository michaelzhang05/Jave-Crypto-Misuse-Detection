package androidx.compose.foundation.text.selection;

import a6.InterfaceC1669o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function0 {
        final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, MutableState<IntSize> mutableState) {
            super(0);
            this.$manager = textFieldSelectionManager;
            this.$magnifierSize$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Offset.m2729boximpl(m1095invokeF1C5BW0());
        }

        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
        public final long m1095invokeF1C5BW0() {
            return TextFieldSelectionManagerKt.m1094calculateSelectionMagnifierCenterAndroidO0kMr_c(this.$manager, TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$1(this.$magnifierSize$delegate));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.$manager = textFieldSelectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
        return mutableState.getValue().m5353unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j8) {
        mutableState.setValue(IntSize.m5341boximpl(j8));
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3255y.i(composed, "$this$composed");
        composer.startReplaceableGroup(1980580247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1980580247, i8, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:43)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5341boximpl(IntSize.Companion.m5354getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$manager, mutableState);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(mutableState) | composer.changed(density);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(density, mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(composed, anonymousClass1, (Function1) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animatedSelectionMagnifier;
    }
}
