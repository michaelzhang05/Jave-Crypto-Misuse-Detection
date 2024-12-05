package androidx.compose.foundation.gestures;

import O5.I;
import O5.p;
import a6.InterfaceC1668n;
import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import j6.AbstractC3202a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3374p;
import l6.InterfaceC3372o;
import l6.L;
import l6.M;
import l6.O;

/* loaded from: classes.dex */
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {
    private final UpdatableAnimationState animationState;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests;
    private LayoutCoordinates coordinates;
    private LayoutCoordinates focusedChild;
    private Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;
    private final Modifier modifier;
    private final Orientation orientation;
    private final boolean reverseDirection;
    private final M scope;
    private final ScrollableState scrollState;
    private boolean trackingFocusedChild;
    private long viewportSize;

    /* loaded from: classes.dex */
    public static final class Request {
        private final InterfaceC3372o continuation;
        private final Function0 currentBounds;

        public Request(Function0 currentBounds, InterfaceC3372o continuation) {
            AbstractC3255y.i(currentBounds, "currentBounds");
            AbstractC3255y.i(continuation, "continuation");
            this.currentBounds = currentBounds;
            this.continuation = continuation;
        }

        public final InterfaceC3372o getContinuation() {
            return this.continuation;
        }

        public final Function0 getCurrentBounds() {
            return this.currentBounds;
        }

        public String toString() {
            android.support.v4.media.a.a(this.continuation.getContext().get(L.f34568a));
            StringBuilder sb = new StringBuilder();
            sb.append("Request@");
            String num = Integer.toString(hashCode(), AbstractC3202a.a(16));
            AbstractC3255y.h(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            sb.append("(");
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewModifier(M scope, Orientation orientation, ScrollableState scrollState, boolean z8) {
        AbstractC3255y.i(scope, "scope");
        AbstractC3255y.i(orientation, "orientation");
        AbstractC3255y.i(scrollState, "scrollState");
        this.scope = scope;
        this.orientation = orientation;
        this.scrollState = scrollState;
        this.reverseDirection = z8;
        this.bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
        this.viewportSize = IntSize.Companion.m5354getZeroYbymL2g();
        this.animationState = new UpdatableAnimationState();
        this.modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new ContentInViewModifier$modifier$1(this)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta() {
        if (IntSize.m5347equalsimpl0(this.viewportSize, IntSize.Companion.m5354getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            if (this.trackingFocusedChild) {
                findBringIntoViewRequest = getFocusedChildBounds();
            } else {
                findBringIntoViewRequest = null;
            }
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long m5359toSizeozmzZPI = IntSizeKt.m5359toSizeozmzZPI(this.viewportSize);
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return relocationDistance(findBringIntoViewRequest.getLeft(), findBringIntoViewRequest.getRight(), Size.m2809getWidthimpl(m5359toSizeozmzZPI));
            }
            throw new p();
        }
        return relocationDistance(findBringIntoViewRequest.getTop(), findBringIntoViewRequest.getBottom(), Size.m2806getHeightimpl(m5359toSizeozmzZPI));
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m375compareToTemP2vQ(long j8, long j9) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return AbstractC3255y.k(IntSize.m5349getWidthimpl(j8), IntSize.m5349getWidthimpl(j9));
            }
            throw new p();
        }
        return AbstractC3255y.k(IntSize.m5348getHeightimpl(j8), IntSize.m5348getHeightimpl(j9));
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m376compareToiLBOSCw(long j8, long j9) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return Float.compare(Size.m2809getWidthimpl(j8), Size.m2809getWidthimpl(j9));
            }
            throw new p();
        }
        return Float.compare(Size.m2806getHeightimpl(j8), Size.m2806getHeightimpl(j9));
    }

    /* renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m377computeDestinationO0kMr_c(Rect rect, long j8) {
        return rect.m2777translatek4lQ0M(Offset.m2749unaryMinusF1C5BW0(m380relocationOffsetBMxPBkI(rect, j8)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i8 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect rect2 = (Rect) ((Request) content[i8]).getCurrentBounds().invoke();
                if (rect2 != null) {
                    if (m376compareToiLBOSCw(rect2.m2773getSizeNHjbRc(), IntSizeKt.m5359toSizeozmzZPI(this.viewportSize)) <= 0) {
                        rect = rect2;
                    } else {
                        return rect;
                    }
                }
                i8--;
            } while (i8 >= 0);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.focusedChild) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m378isMaxVisibleO0kMr_c(Rect rect, long j8) {
        return Offset.m2737equalsimpl0(m380relocationOffsetBMxPBkI(rect, j8), Offset.Companion.m2756getZeroF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ boolean m379isMaxVisibleO0kMr_c$default(ContentInViewModifier contentInViewModifier, Rect rect, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = contentInViewModifier.viewportSize;
        }
        return contentInViewModifier.m378isMaxVisibleO0kMr_c(rect, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        if (!this.isAnimationRunning) {
            AbstractC3364k.d(this.scope, null, O.UNDISPATCHED, new ContentInViewModifier$launchAnimation$1(this, null), 1, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final float relocationDistance(float f8, float f9, float f10) {
        if ((f8 >= 0.0f && f9 <= f10) || (f8 < 0.0f && f9 > f10)) {
            return 0.0f;
        }
        float f11 = f9 - f10;
        if (Math.abs(f8) >= Math.abs(f11)) {
            return f11;
        }
        return f8;
    }

    /* renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m380relocationOffsetBMxPBkI(Rect rect, long j8) {
        long m5359toSizeozmzZPI = IntSizeKt.m5359toSizeozmzZPI(j8);
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return OffsetKt.Offset(relocationDistance(rect.getLeft(), rect.getRight(), Size.m2809getWidthimpl(m5359toSizeozmzZPI)), 0.0f);
            }
            throw new p();
        }
        return OffsetKt.Offset(0.0f, relocationDistance(rect.getTop(), rect.getBottom(), Size.m2806getHeightimpl(m5359toSizeozmzZPI)));
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(Function0 function0, S5.d dVar) {
        Rect rect = (Rect) function0.invoke();
        if (rect != null && !m379isMaxVisibleO0kMr_c$default(this, rect, 0L, 1, null)) {
            C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
            c3374p.C();
            if (this.bringIntoViewRequests.enqueue(new Request(function0, c3374p)) && !this.isAnimationRunning) {
                launchAnimation();
            }
            Object y8 = c3374p.y();
            if (y8 == T5.b.e()) {
                h.c(dVar);
            }
            if (y8 == T5.b.e()) {
                return y8;
            }
            return I.f8278a;
        }
        return I.f8278a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect localRect) {
        AbstractC3255y.i(localRect, "localRect");
        if (!IntSize.m5347equalsimpl0(this.viewportSize, IntSize.Companion.m5354getZeroYbymL2g())) {
            return m377computeDestinationO0kMr_c(localRect, this.viewportSize);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC1668n interfaceC1668n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC1668n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC1668n interfaceC1668n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC1668n);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(LayoutCoordinates coordinates) {
        AbstractC3255y.i(coordinates, "coordinates");
        this.coordinates = coordinates;
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo381onRemeasuredozmzZPI(long j8) {
        Rect focusedChildBounds;
        long j9 = this.viewportSize;
        this.viewportSize = j8;
        if (m375compareToTemP2vQ(j8, j9) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m378isMaxVisibleO0kMr_c(rect, j9) && !m378isMaxVisibleO0kMr_c(focusedChildBounds, j8)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
