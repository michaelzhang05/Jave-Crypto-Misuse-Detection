package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset;
    private static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight;
    private static final float NavigationBarItemHorizontalPadding;
    private static final float NavigationBarItemVerticalPadding;

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarHeight = navigationBarTokens.m2221getContainerHeightD9Ej5fM();
        NavigationBarItemHorizontalPadding = Dp.m5178constructorimpl(8);
        NavigationBarItemVerticalPadding = Dp.m5178constructorimpl(16);
        float f8 = 2;
        IndicatorHorizontalPadding = Dp.m5178constructorimpl(Dp.m5178constructorimpl(navigationBarTokens.m2219getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m2222getIconSizeD9Ej5fM()) / f8);
        IndicatorVerticalPadding = Dp.m5178constructorimpl(Dp.m5178constructorimpl(navigationBarTokens.m2218getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m2222getIconSizeD9Ej5fM()) / f8);
        IndicatorVerticalOffset = Dp.m5178constructorimpl(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1698NavigationBarHsRjFd4(androidx.compose.ui.Modifier r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, X5.o r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m1698NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, X5.o, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationBarItem(RowScope rowScope, boolean z8, Function0 onClick, n icon, Modifier modifier, boolean z9, n nVar, boolean z10, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier modifier2;
        int i15;
        boolean z11;
        int i16;
        n nVar2;
        int i17;
        boolean z12;
        int i18;
        int i19;
        Modifier modifier3;
        Composer composer2;
        NavigationBarItemColors navigationBarItemColors2;
        MutableInteractionSource mutableInteractionSource2;
        int i20;
        int i21;
        ComposableLambda composableLambda;
        float f8;
        NavigationBarItemColors navigationBarItemColors3;
        boolean z13;
        Modifier modifier4;
        boolean z14;
        MutableInteractionSource mutableInteractionSource3;
        n nVar3;
        int i22;
        AbstractC3159y.i(rowScope, "<this>");
        AbstractC3159y.i(onClick, "onClick");
        AbstractC3159y.i(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-663510974);
        if ((Integer.MIN_VALUE & i9) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(rowScope)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 1) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 2) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(onClick)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((4 & i9) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(icon)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        int i23 = i9 & 8;
        if (i23 != 0) {
            i10 |= 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i8 & 57344) == 0) {
                if (startRestartGroup.changed(modifier2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i10 |= i15;
            }
        }
        int i24 = 16 & i9;
        if (i24 != 0) {
            i10 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z11 = z9;
        } else {
            z11 = z9;
            if ((i8 & 458752) == 0) {
                if (startRestartGroup.changed(z11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i10 |= i16;
            }
        }
        int i25 = 32 & i9;
        if (i25 != 0) {
            i10 |= 1572864;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i8 & 3670016) == 0) {
                if (startRestartGroup.changed(nVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i10 |= i17;
            }
        }
        int i26 = i9 & 64;
        if (i26 != 0) {
            i10 |= 12582912;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i8 & 29360128) == 0) {
                if (startRestartGroup.changed(z12)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i10 |= i18;
            }
        }
        if ((i8 & 234881024) == 0) {
            if ((i9 & 256) == 0 && startRestartGroup.changed(navigationBarItemColors)) {
                i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                i10 |= i22;
            }
            i22 = 33554432;
            i10 |= i22;
        }
        int i27 = 256 & i9;
        if (i27 != 0) {
            i10 |= 805306368;
        } else if ((i8 & 1879048192) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i10 |= i19;
        }
        int i28 = i10;
        if ((i28 & 1533916891) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            navigationBarItemColors3 = navigationBarItemColors;
            modifier4 = modifier2;
            nVar3 = nVar2;
            z13 = z12;
            z14 = z11;
            composer2 = startRestartGroup;
            mutableInteractionSource3 = mutableInteractionSource;
        } else {
            startRestartGroup.startDefaults();
            if ((i8 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((128 & i9) != 0) {
                    i28 &= -234881025;
                }
                navigationBarItemColors2 = navigationBarItemColors;
                modifier3 = modifier2;
                composer2 = startRestartGroup;
                i20 = i28;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                if (i23 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i24 != 0) {
                    z11 = true;
                }
                if (i25 != 0) {
                    nVar2 = null;
                }
                if (i26 != 0) {
                    z12 = true;
                }
                if ((128 & i9) != 0) {
                    composer2 = startRestartGroup;
                    navigationBarItemColors2 = NavigationBarItemDefaults.INSTANCE.m1697colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    i28 &= -234881025;
                } else {
                    composer2 = startRestartGroup;
                    navigationBarItemColors2 = navigationBarItemColors;
                }
                if (i27 != 0) {
                    composer2.startReplaceableGroup(-492369756);
                    Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                i20 = i28;
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-663510974, i20, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
            }
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new NavigationBarKt$NavigationBarItem$styledIcon$1(navigationBarItemColors2, z8, i20, nVar2, z12, icon));
            if (nVar2 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new NavigationBarKt$NavigationBarItem$styledLabel$1$1(navigationBarItemColors2, z8, i20, nVar2));
                i21 = -492369756;
            } else {
                i21 = -492369756;
                composableLambda = null;
            }
            composer2.startReplaceableGroup(i21);
            Object rememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composer2.updateRememberedValue(rememberedValue2);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue2;
            Modifier a8 = e.a(rowScope, SelectableKt.m822selectableO2vRcR0(modifier3, z8, mutableInteractionSource2, null, z11, Role.m4516boximpl(Role.Companion.m4529getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            composer2.startReplaceableGroup(1157296644);
            boolean changed = composer2.changed(mutableState);
            Modifier modifier5 = modifier3;
            Object rememberedValue3 = composer2.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new NavigationBarKt$NavigationBarItem$2$1(mutableState);
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceableGroup();
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(a8, (Function1) rememberedValue3);
            Alignment center = Alignment.Companion.getCenter();
            composer2.startReplaceableGroup(733328855);
            n nVar4 = nVar2;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            o materializerOf = LayoutKt.materializerOf(onSizeChanged);
            boolean z15 = z11;
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m2496constructorimpl = Updater.m2496constructorimpl(composer2);
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, density, companion2.getSetDensity());
            Updater.m2503setimpl(m2496constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2503setimpl(m2496constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(1796243068);
            if (z8) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f8, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, composer2, 48, 12);
            long Offset = OffsetKt.Offset((m1699NavigationBarItem$lambda3(mutableState) - r6.mo442roundToPx0680j_4(NavigationBarTokens.INSTANCE.m2219getActiveIndicatorWidthD9Ej5fM())) / 2, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo448toPx0680j_4(IndicatorVerticalOffset));
            I i29 = I.f6487a;
            Offset m2724boximpl = Offset.m2724boximpl(Offset);
            composer2.startReplaceableGroup(511388516);
            boolean changed2 = composer2.changed(m2724boximpl) | composer2.changed(mutableInteractionSource2);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changed2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new MappedInteractionSource(mutableInteractionSource2, Offset, null);
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceableGroup();
            NavigationBarItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new NavigationBarKt$NavigationBarItem$3$indicatorRipple$1((MappedInteractionSource) rememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new NavigationBarKt$NavigationBarItem$3$indicator$1(navigationBarItemColors2, animateFloatAsState)), composableLambda2, composableLambda, z12, m1701NavigationBarItem$lambda9$lambda6(animateFloatAsState), composer2, ((i20 >> 9) & 57344) | 438);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            navigationBarItemColors3 = navigationBarItemColors2;
            z13 = z12;
            modifier4 = modifier5;
            z14 = z15;
            mutableInteractionSource3 = mutableInteractionSource2;
            nVar3 = nVar4;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationBarKt$NavigationBarItem$4(rowScope, z8, onClick, icon, modifier4, z14, nVar3, z13, navigationBarItemColors3, mutableInteractionSource3, i8, i9));
        }
    }

    /* renamed from: NavigationBarItem$lambda-3, reason: not valid java name */
    private static final int m1699NavigationBarItem$lambda3(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationBarItem$lambda-4, reason: not valid java name */
    public static final void m1700NavigationBarItem$lambda4(MutableState<Integer> mutableState, int i8) {
        mutableState.setValue(Integer.valueOf(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationBarItem$lambda-9$lambda-6, reason: not valid java name */
    public static final float m1701NavigationBarItem$lambda9$lambda6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationBarItemBaselineLayout(n nVar, n nVar2, n nVar3, final n nVar4, final boolean z8, final float f8, Composer composer, int i8) {
        int i9;
        float f9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(591111291);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(nVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(nVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(nVar3)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(nVar4)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(f8)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591111291, i9, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:381)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                    return g.a(this, intrinsicMeasureScope, list, i16);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                    return g.b(this, intrinsicMeasureScope, list, i16);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo132measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j8) {
                    float f10;
                    float f11;
                    Object obj;
                    Placeable placeable;
                    Placeable placeable2;
                    MeasureResult m1707placeLabelAndIconzUg2_y0;
                    MeasureResult m1706placeIconX9ElhV4;
                    AbstractC3159y.i(Layout, "$this$Layout");
                    AbstractC3159y.i(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (AbstractC3159y.d(LayoutIdKt.getLayoutId(measurable), RewardPlus.ICON)) {
                            Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(j8);
                            int width = mo4131measureBRTryo0.getWidth();
                            f10 = NavigationBarKt.IndicatorHorizontalPadding;
                            float f12 = 2;
                            int mo442roundToPx0680j_4 = width + Layout.mo442roundToPx0680j_4(Dp.m5178constructorimpl(f10 * f12));
                            int d8 = Z5.a.d(mo442roundToPx0680j_4 * f8);
                            int height = mo4131measureBRTryo0.getHeight();
                            f11 = NavigationBarKt.IndicatorVerticalPadding;
                            int mo442roundToPx0680j_42 = height + Layout.mo442roundToPx0680j_4(Dp.m5178constructorimpl(f11 * f12));
                            for (Measurable measurable2 : list) {
                                if (AbstractC3159y.d(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                                    Placeable mo4131measureBRTryo02 = measurable2.mo4131measureBRTryo0(Constraints.Companion.m5154fixedJhjzzOo(mo442roundToPx0680j_4, mo442roundToPx0680j_42));
                                    Iterator<T> it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (AbstractC3159y.d(LayoutIdKt.getLayoutId((Measurable) obj), "indicator")) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    Measurable measurable3 = (Measurable) obj;
                                    if (measurable3 != null) {
                                        placeable = measurable3.mo4131measureBRTryo0(Constraints.Companion.m5154fixedJhjzzOo(d8, mo442roundToPx0680j_42));
                                    } else {
                                        placeable = null;
                                    }
                                    if (nVar4 != null) {
                                        for (Measurable measurable4 : list) {
                                            if (AbstractC3159y.d(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                                placeable2 = measurable4.mo4131measureBRTryo0(Constraints.m5137copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    placeable2 = null;
                                    if (nVar4 == null) {
                                        m1706placeIconX9ElhV4 = NavigationBarKt.m1706placeIconX9ElhV4(Layout, mo4131measureBRTryo0, mo4131measureBRTryo02, placeable, j8);
                                        return m1706placeIconX9ElhV4;
                                    }
                                    AbstractC3159y.f(placeable2);
                                    m1707placeLabelAndIconzUg2_y0 = NavigationBarKt.m1707placeLabelAndIconzUg2_y0(Layout, placeable2, mo4131measureBRTryo0, mo4131measureBRTryo02, placeable, j8, z8, f8);
                                    return m1707placeLabelAndIconzUg2_y0;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                    return g.c(this, intrinsicMeasureScope, list, i16);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                    return g.d(this, intrinsicMeasureScope, list, i16);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            o materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, density, companion2.getSetDensity());
            Updater.m2503setimpl(m2496constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2503setimpl(m2496constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1170727090);
            nVar.invoke(startRestartGroup, Integer.valueOf(i9 & 14));
            startRestartGroup.startReplaceableGroup(-311736667);
            if (f8 > 0.0f) {
                nVar2.invoke(startRestartGroup, Integer.valueOf((i9 >> 3) & 14));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion2.getConstructor();
            o materializerOf2 = LayoutKt.materializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2496constructorimpl2 = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, density2, companion2.getSetDensity());
            Updater.m2503setimpl(m2496constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m2503setimpl(m2496constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1237554120);
            nVar3.invoke(startRestartGroup, Integer.valueOf((i9 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (nVar4 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                if (z8) {
                    f9 = 1.0f;
                } else {
                    f9 = f8;
                }
                Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(AlphaKt.alpha(layoutId2, f9), Dp.m5178constructorimpl(NavigationBarItemHorizontalPadding / 2), 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion2.getConstructor();
                o materializerOf3 = LayoutKt.materializerOf(m602paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2496constructorimpl3 = Updater.m2496constructorimpl(startRestartGroup);
                Updater.m2503setimpl(m2496constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl3, density3, companion2.getSetDensity());
                Updater.m2503setimpl(m2496constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m2503setimpl(m2496constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                startRestartGroup.startReplaceableGroup(359627658);
                nVar4.invoke(startRestartGroup, Integer.valueOf((i9 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationBarKt$NavigationBarItemBaselineLayout$3(nVar, nVar2, nVar3, nVar4, z8, f8, i8));
        }
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarItemVerticalPadding() {
        return NavigationBarItemVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m1706placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j8) {
        int m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        int m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8);
        return MeasureScope.CC.q(measureScope, m5146getMaxWidthimpl, m5145getMaxHeightimpl, null, new NavigationBarKt$placeIcon$1(placeable3, placeable, (m5146getMaxWidthimpl - placeable.getWidth()) / 2, (m5145getMaxHeightimpl - placeable.getHeight()) / 2, placeable2, (m5146getMaxWidthimpl - placeable2.getWidth()) / 2, (m5145getMaxHeightimpl - placeable2.getHeight()) / 2, m5146getMaxWidthimpl, m5145getMaxHeightimpl), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m1707placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j8, boolean z8, float f8) {
        int height;
        int m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8);
        int height2 = m5145getMaxHeightimpl - placeable.getHeight();
        float f9 = NavigationBarItemVerticalPadding;
        int mo442roundToPx0680j_4 = height2 - measureScope.mo442roundToPx0680j_4(f9);
        int mo442roundToPx0680j_42 = measureScope.mo442roundToPx0680j_4(f9);
        if (z8) {
            height = mo442roundToPx0680j_42;
        } else {
            height = (m5145getMaxHeightimpl - placeable2.getHeight()) / 2;
        }
        int d8 = Z5.a.d((height - mo442roundToPx0680j_42) * (1 - f8));
        int m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        return MeasureScope.CC.q(measureScope, m5146getMaxWidthimpl, m5145getMaxHeightimpl, null, new NavigationBarKt$placeLabelAndIcon$1(placeable4, z8, f8, placeable, (m5146getMaxWidthimpl - placeable.getWidth()) / 2, mo442roundToPx0680j_4, d8, placeable2, (m5146getMaxWidthimpl - placeable2.getWidth()) / 2, mo442roundToPx0680j_42, placeable3, (m5146getMaxWidthimpl - placeable3.getWidth()) / 2, mo442roundToPx0680j_42 - measureScope.mo442roundToPx0680j_4(IndicatorVerticalPadding), m5146getMaxWidthimpl, measureScope), 4, null);
    }
}
