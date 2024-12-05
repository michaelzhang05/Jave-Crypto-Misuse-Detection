package androidx.compose.foundation.lazy.layout;

import O5.C1352h;
import O5.p;
import a6.InterfaceC1668n;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    public static final Companion Companion = new Companion(null);
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final LazyLayoutBeyondBoundsState state;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(LazyLayoutBeyondBoundsState state, LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean z8, LayoutDirection layoutDirection, Orientation orientation) {
        AbstractC3255y.i(state, "state");
        AbstractC3255y.i(beyondBoundsInfo, "beyondBoundsInfo");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        AbstractC3255y.i(orientation, "orientation");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = z8;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m753addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i8) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m755isForward4vf7U8o(i8)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m754hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i8) {
        if (m756isOppositeToOrientation4vf7U8o(i8)) {
            return false;
        }
        if (m755isForward4vf7U8o(i8)) {
            if (interval.getEnd() >= this.state.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m755isForward4vf7U8o(int i8) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4122getBeforehoxUOeE())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4121getAfterhoxUOeE())) {
            if (BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4120getAbovehoxUOeE())) {
                return this.reverseLayout;
            }
            if (BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4123getBelowhoxUOeE())) {
                if (this.reverseLayout) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4124getLefthoxUOeE())) {
                int i9 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        if (this.reverseLayout) {
                            return false;
                        }
                    } else {
                        throw new p();
                    }
                } else {
                    return this.reverseLayout;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4125getRighthoxUOeE())) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new C1352h();
                }
                int i10 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        return this.reverseLayout;
                    }
                    throw new p();
                }
                if (this.reverseLayout) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m756isOppositeToOrientation4vf7U8o(int i8) {
        boolean m4116equalsimpl0;
        boolean m4116equalsimpl02;
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        boolean z8 = true;
        if (BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4120getAbovehoxUOeE())) {
            m4116equalsimpl0 = true;
        } else {
            m4116equalsimpl0 = BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4123getBelowhoxUOeE());
        }
        if (m4116equalsimpl0) {
            if (this.orientation == Orientation.Horizontal) {
                return true;
            }
        } else {
            if (BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4124getLefthoxUOeE())) {
                m4116equalsimpl02 = true;
            } else {
                m4116equalsimpl02 = BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4125getRighthoxUOeE());
            }
            if (m4116equalsimpl02) {
                if (this.orientation == Orientation.Vertical) {
                    return true;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4122getBeforehoxUOeE())) {
                    z8 = BeyondBoundsLayout.LayoutDirection.m4116equalsimpl0(i8, companion.m4121getAfterhoxUOeE());
                }
                if (!z8) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new C1352h();
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC1668n interfaceC1668n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC1668n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC1668n interfaceC1668n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC1668n);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo757layouto7g1Pn8(final int i8, Function1 block) {
        int firstPlacedIndex;
        AbstractC3255y.i(block, "block");
        if (this.state.getItemCount() > 0 && this.state.getHasVisibleItems()) {
            if (m755isForward4vf7U8o(i8)) {
                firstPlacedIndex = this.state.getLastPlacedIndex();
            } else {
                firstPlacedIndex = this.state.getFirstPlacedIndex();
            }
            final T t8 = new T();
            t8.f34162a = this.beyondBoundsInfo.addInterval(firstPlacedIndex, firstPlacedIndex);
            T t9 = null;
            while (t9 == null && m754hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f34162a, i8)) {
                LazyLayoutBeyondBoundsInfo.Interval m753addNextIntervalFR3nfPY = m753addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f34162a, i8);
                this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) t8.f34162a);
                t8.f34162a = m753addNextIntervalFR3nfPY;
                this.state.remeasure();
                t9 = (T) block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                    @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                    public boolean getHasMoreContent() {
                        boolean m754hasMoreContentFR3nfPY;
                        m754hasMoreContentFR3nfPY = LazyLayoutBeyondBoundsModifierLocal.this.m754hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f34162a, i8);
                        return m754hasMoreContentFR3nfPY;
                    }
                });
            }
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) t8.f34162a);
            this.state.remeasure();
            return t9;
        }
        return (T) block.invoke(emptyBeyondBoundsScope);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
