package androidx.compose.material3;

import X5.n;
import X5.o;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPaddingNoLabel;
    private static final float IndicatorVerticalPaddingWithLabel;
    private static final int ItemAnimationDurationMillis = 150;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationRailHeaderPadding = Dp.m5178constructorimpl(8);
    private static final float NavigationRailItemHeight;
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailItemWidth;
    private static final float NavigationRailVerticalPadding;

    static {
        float f8 = 4;
        NavigationRailVerticalPadding = Dp.m5178constructorimpl(f8);
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        NavigationRailItemWidth = navigationRailTokens.m2232getContainerWidthD9Ej5fM();
        NavigationRailItemHeight = navigationRailTokens.m2235getNoLabelActiveIndicatorHeightD9Ej5fM();
        NavigationRailItemVerticalPadding = Dp.m5178constructorimpl(f8);
        float f9 = 2;
        IndicatorHorizontalPadding = Dp.m5178constructorimpl(Dp.m5178constructorimpl(navigationRailTokens.m2230getActiveIndicatorWidthD9Ej5fM() - navigationRailTokens.m2233getIconSizeD9Ej5fM()) / f9);
        IndicatorVerticalPaddingWithLabel = Dp.m5178constructorimpl(Dp.m5178constructorimpl(navigationRailTokens.m2229getActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m2233getIconSizeD9Ej5fM()) / f9);
        IndicatorVerticalPaddingNoLabel = Dp.m5178constructorimpl(Dp.m5178constructorimpl(navigationRailTokens.m2235getNoLabelActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m2233getIconSizeD9Ej5fM()) / f9);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-qi6gXK8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1724NavigationRailqi6gXK8(androidx.compose.ui.Modifier r25, long r26, long r28, X5.o r30, androidx.compose.foundation.layout.WindowInsets r31, X5.o r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m1724NavigationRailqi6gXK8(androidx.compose.ui.Modifier, long, long, X5.o, androidx.compose.foundation.layout.WindowInsets, X5.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationRailItem(boolean r34, kotlin.jvm.functions.Function0 r35, X5.n r36, androidx.compose.ui.Modifier r37, boolean r38, X5.n r39, boolean r40, androidx.compose.material3.NavigationRailItemColors r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.NavigationRailItem(boolean, kotlin.jvm.functions.Function0, X5.n, androidx.compose.ui.Modifier, boolean, X5.n, boolean, androidx.compose.material3.NavigationRailItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationRailItem$lambda-5$lambda-2, reason: not valid java name */
    public static final float m1725NavigationRailItem$lambda5$lambda2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItemBaselineLayout(n nVar, n nVar2, n nVar3, final n nVar4, final boolean z8, final float f8, Composer composer, int i8) {
        int i9;
        float f9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-876426901);
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
                ComposerKt.traceEventStart(-876426901, i9, -1, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:381)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemBaselineLayout$2
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
                    Object obj;
                    Placeable placeable;
                    Placeable placeable2;
                    MeasureResult m1730placeLabelAndIconzUg2_y0;
                    MeasureResult m1729placeIconX9ElhV4;
                    AbstractC3159y.i(Layout, "$this$Layout");
                    AbstractC3159y.i(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (AbstractC3159y.d(LayoutIdKt.getLayoutId(measurable), RewardPlus.ICON)) {
                            Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(j8);
                            int width = mo4131measureBRTryo0.getWidth();
                            f10 = NavigationRailKt.IndicatorHorizontalPadding;
                            float f11 = 2;
                            int mo442roundToPx0680j_4 = width + Layout.mo442roundToPx0680j_4(Dp.m5178constructorimpl(f10 * f11));
                            int d8 = Z5.a.d(mo442roundToPx0680j_4 * f8);
                            int height = mo4131measureBRTryo0.getHeight() + Layout.mo442roundToPx0680j_4(Dp.m5178constructorimpl((nVar4 == null ? NavigationRailKt.IndicatorVerticalPaddingNoLabel : NavigationRailKt.IndicatorVerticalPaddingWithLabel) * f11));
                            for (Measurable measurable2 : list) {
                                if (AbstractC3159y.d(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                                    Placeable mo4131measureBRTryo02 = measurable2.mo4131measureBRTryo0(Constraints.Companion.m5154fixedJhjzzOo(mo442roundToPx0680j_4, height));
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
                                        placeable = measurable3.mo4131measureBRTryo0(Constraints.Companion.m5154fixedJhjzzOo(d8, height));
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
                                        m1729placeIconX9ElhV4 = NavigationRailKt.m1729placeIconX9ElhV4(Layout, mo4131measureBRTryo0, mo4131measureBRTryo02, placeable, j8);
                                        return m1729placeIconX9ElhV4;
                                    }
                                    AbstractC3159y.f(placeable2);
                                    m1730placeLabelAndIconzUg2_y0 = NavigationRailKt.m1730placeLabelAndIconzUg2_y0(Layout, placeable2, mo4131measureBRTryo0, mo4131measureBRTryo02, placeable, j8, z8, f8);
                                    return m1730placeLabelAndIconzUg2_y0;
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
            startRestartGroup.startReplaceableGroup(2083574754);
            nVar.invoke(startRestartGroup, Integer.valueOf(i9 & 14));
            startRestartGroup.startReplaceableGroup(935754904);
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
            startRestartGroup.startReplaceableGroup(-1582262808);
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
                Modifier alpha = AlphaKt.alpha(layoutId2, f9);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion2.getConstructor();
                o materializerOf3 = LayoutKt.materializerOf(alpha);
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
                startRestartGroup.startReplaceableGroup(6101178);
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
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemBaselineLayout$3(nVar, nVar2, nVar3, nVar4, z8, f8, i8));
        }
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m1729placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j8) {
        int i8;
        int width = placeable.getWidth();
        int width2 = placeable2.getWidth();
        if (placeable3 != null) {
            i8 = placeable3.getWidth();
        } else {
            i8 = 0;
        }
        int m5160constrainWidthK40F9xA = ConstraintsKt.m5160constrainWidthK40F9xA(j8, Math.max(width, Math.max(width2, i8)));
        int m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8);
        return MeasureScope.CC.q(measureScope, m5160constrainWidthK40F9xA, m5145getMaxHeightimpl, null, new NavigationRailKt$placeIcon$1(placeable3, placeable, (m5160constrainWidthK40F9xA - placeable.getWidth()) / 2, (m5145getMaxHeightimpl - placeable.getHeight()) / 2, placeable2, (m5160constrainWidthK40F9xA - placeable2.getWidth()) / 2, (m5145getMaxHeightimpl - placeable2.getHeight()) / 2, m5160constrainWidthK40F9xA, m5145getMaxHeightimpl), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m1730placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j8, boolean z8, float f8) {
        int height;
        int i8;
        int m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8);
        int height2 = m5145getMaxHeightimpl - placeable.getHeight();
        float f9 = NavigationRailItemVerticalPadding;
        int mo442roundToPx0680j_4 = height2 - measureScope.mo442roundToPx0680j_4(f9);
        int mo442roundToPx0680j_42 = measureScope.mo442roundToPx0680j_4(f9);
        if (z8) {
            height = mo442roundToPx0680j_42;
        } else {
            height = (m5145getMaxHeightimpl - placeable2.getHeight()) / 2;
        }
        int d8 = Z5.a.d((height - mo442roundToPx0680j_42) * (1 - f8));
        int width = placeable2.getWidth();
        int width2 = placeable.getWidth();
        if (placeable4 != null) {
            i8 = placeable4.getWidth();
        } else {
            i8 = 0;
        }
        int m5160constrainWidthK40F9xA = ConstraintsKt.m5160constrainWidthK40F9xA(j8, Math.max(width, Math.max(width2, i8)));
        return MeasureScope.CC.q(measureScope, m5160constrainWidthK40F9xA, m5145getMaxHeightimpl, null, new NavigationRailKt$placeLabelAndIcon$1(placeable4, z8, f8, placeable, (m5160constrainWidthK40F9xA - placeable.getWidth()) / 2, mo442roundToPx0680j_4, d8, placeable2, (m5160constrainWidthK40F9xA - placeable2.getWidth()) / 2, mo442roundToPx0680j_42, placeable3, (m5160constrainWidthK40F9xA - placeable3.getWidth()) / 2, mo442roundToPx0680j_42 - measureScope.mo442roundToPx0680j_4(IndicatorVerticalPaddingWithLabel), m5160constrainWidthK40F9xA, measureScope), 4, null);
    }
}
