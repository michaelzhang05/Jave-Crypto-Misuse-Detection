package androidx.compose.ui.node;

import a6.InterfaceC1668n;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Function0 Constructor = LayoutNode.Companion.getConstructor$ui_release();
        private static final Function0 VirtualConstructor = ComposeUiNode$Companion$VirtualConstructor$1.INSTANCE;
        private static final InterfaceC1668n SetModifier = ComposeUiNode$Companion$SetModifier$1.INSTANCE;
        private static final InterfaceC1668n SetDensity = ComposeUiNode$Companion$SetDensity$1.INSTANCE;
        private static final InterfaceC1668n SetResolvedCompositionLocals = ComposeUiNode$Companion$SetResolvedCompositionLocals$1.INSTANCE;
        private static final InterfaceC1668n SetMeasurePolicy = ComposeUiNode$Companion$SetMeasurePolicy$1.INSTANCE;
        private static final InterfaceC1668n SetLayoutDirection = ComposeUiNode$Companion$SetLayoutDirection$1.INSTANCE;
        private static final InterfaceC1668n SetViewConfiguration = ComposeUiNode$Companion$SetViewConfiguration$1.INSTANCE;
        private static final InterfaceC1668n SetCompositeKeyHash = ComposeUiNode$Companion$SetCompositeKeyHash$1.INSTANCE;

        private Companion() {
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getSetCompositeKeyHash$annotations() {
        }

        public final Function0 getConstructor() {
            return Constructor;
        }

        @ExperimentalComposeUiApi
        public final InterfaceC1668n getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        public final InterfaceC1668n getSetDensity() {
            return SetDensity;
        }

        public final InterfaceC1668n getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final InterfaceC1668n getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final InterfaceC1668n getSetModifier() {
            return SetModifier;
        }

        public final InterfaceC1668n getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final InterfaceC1668n getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final Function0 getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    int getCompositeKeyHash();

    CompositionLocalMap getCompositionLocalMap();

    Density getDensity();

    LayoutDirection getLayoutDirection();

    MeasurePolicy getMeasurePolicy();

    Modifier getModifier();

    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i8);

    void setCompositionLocalMap(CompositionLocalMap compositionLocalMap);

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);
}
