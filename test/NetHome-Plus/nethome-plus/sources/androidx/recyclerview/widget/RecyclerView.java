package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.core.view.d0.c;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.j {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.o mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    androidx.recyclerview.widget.d mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.h mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    final List<c0> mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    h.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.k mScrollingChildHelper;
    final z mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final b0 mViewFlinger;
    private final t.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.t mViewInfoStore;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b0 implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private int f1415f;

        /* renamed from: g, reason: collision with root package name */
        private int f1416g;

        /* renamed from: h, reason: collision with root package name */
        OverScroller f1417h;

        /* renamed from: i, reason: collision with root package name */
        Interpolator f1418i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f1419j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f1420k;

        b0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f1418i = interpolator;
            this.f1419j = false;
            this.f1420k = false;
            this.f1417h = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i2, int i3, int i4, int i5) {
            int i6;
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i4 * i4) + (i5 * i5));
            int sqrt2 = (int) Math.sqrt((i2 * i2) + (i3 * i3));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i7 = width / 2;
            float f2 = width;
            float f3 = i7;
            float b2 = f3 + (b(Math.min(1.0f, (sqrt2 * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i6 = Math.round(Math.abs(b2 / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i6 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i6, RecyclerView.MAX_SCROLL_DURATION);
        }

        private float b(float f2) {
            return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            androidx.core.view.u.a0(RecyclerView.this, this);
        }

        public void c(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f1416g = 0;
            this.f1415f = 0;
            Interpolator interpolator = this.f1418i;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f1418i = interpolator2;
                this.f1417h = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f1417h.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f1419j) {
                this.f1420k = true;
            } else {
                d();
            }
        }

        public void f(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = a(i2, i3, 0, 0);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f1418i != interpolator) {
                this.f1418i = interpolator;
                this.f1417h = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1416g = 0;
            this.f1415f = 0;
            RecyclerView.this.setScrollState(2);
            this.f1417h.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1417h.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f1417h.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                g();
                return;
            }
            this.f1420k = false;
            this.f1419j = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f1417h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f1415f;
                int i5 = currY - this.f1416g;
                this.f1415f = currX;
                this.f1416g = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    y yVar = recyclerView4.mLayout.mSmoothScroller;
                    if (yVar != null && !yVar.isPendingInitialRun() && yVar.isRunning()) {
                        int b2 = RecyclerView.this.mState.b();
                        if (b2 == 0) {
                            yVar.stop();
                        } else if (yVar.getTargetPosition() >= b2) {
                            yVar.setTargetPosition(b2 - 1);
                            yVar.onAnimation(i3, i2);
                        } else {
                            yVar.onAnimation(i3, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.dispatchOnScrolled(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                y yVar2 = RecyclerView.this.mLayout.mSmoothScroller;
                if (!(yVar2 != null && yVar2.isPendingInitialRun()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i8, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.h hVar = recyclerView7.mGapWorker;
                    if (hVar != null) {
                        hVar.f(recyclerView7, i3, i2);
                    }
                }
            }
            y yVar3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (yVar3 != null && yVar3.isPendingInitialRun()) {
                yVar3.onAnimation(0, 0);
            }
            this.f1419j = false;
            if (this.f1420k) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }
    }

    /* loaded from: classes.dex */
    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        c0 mShadowedHolder = null;
        c0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public c0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && androidx.core.view.u.L(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i2, int i3, boolean z) {
            addFlags(8);
            offsetPosition(i3, z);
            this.mPosition = i2;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        boolean hasAnyOfTheFlags(int i2) {
            return (i2 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !androidx.core.view.u.L(this.itemView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i2, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i2;
            }
            this.mPosition += i2;
            if (this.itemView.getLayoutParams() != null) {
                ((p) this.itemView.getLayoutParams()).f1428c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i2 = this.mPendingAccessibilityState;
            if (i2 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i2;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = androidx.core.view.u.w(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i2, int i3) {
            this.mFlags = (i2 & i3) | (this.mFlags & (i3 ^ (-1)));
        }

        public final void setIsRecyclable(boolean z) {
            int i2 = this.mIsRecyclableCount;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                this.mFlags |= 16;
            } else if (z && i3 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(v vVar, boolean z) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* loaded from: classes.dex */
    class d implements t.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.t.b
        public void a(c0 c0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(c0Var.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.t.b
        public void b(c0 c0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.animateAppearance(c0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.t.b
        public void c(c0 c0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.mRecycler.J(c0Var);
            RecyclerView.this.animateDisappearance(c0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.t.b
        public void d(c0 c0Var, l.c cVar, l.c cVar2) {
            c0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(c0Var, c0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(c0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements d.b {
        e() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public View a(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void b(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.d.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.d.b
        public void d() {
            int c2 = c();
            for (int i2 = 0; i2 < c2; i2++) {
                View a = a(i2);
                RecyclerView.this.dispatchChildDetached(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.d.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public c0 f(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void g(int i2) {
            c0 childViewHolderInt;
            View a = a(i2);
            if (a != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(a)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i2);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void h(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.d.b
        public void i(View view, int i2) {
            RecyclerView.this.addView(view, i2);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void j(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void k(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i2, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0027a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0027a
        public void a(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForMove(i2, i3);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0027a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0027a
        public void c(int i2, int i3, Object obj) {
            RecyclerView.this.viewRangeUpdate(i2, i3, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0027a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0027a
        public c0 e(int i2) {
            c0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i2, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.n(findViewHolderForPosition.itemView)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0027a
        public void f(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0027a
        public void g(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForInsert(i2, i3);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0027a
        public void h(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f1450d += i3;
        }

        void i(a.b bVar) {
            int i2 = bVar.a;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f1500b, bVar.f1502d);
                return;
            }
            if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f1500b, bVar.f1502d);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f1500b, bVar.f1502d, bVar.f1501c);
            } else {
                if (i2 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f1500b, bVar.f1502d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends c0> {
        private final h mObservable = new h();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(VH vh, int i2) {
            vh.mPosition = i2;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i2);
            }
            vh.setFlags(1, 519);
            androidx.core.os.c.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i2, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f1428c = true;
            }
            androidx.core.os.c.b();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i2) {
            try {
                androidx.core.os.c.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i2);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i2;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.c.b();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i2) {
            return -1L;
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i2) {
            this.mObservable.d(i2, 1);
        }

        public final void notifyItemInserted(int i2) {
            this.mObservable.f(i2, 1);
        }

        public final void notifyItemMoved(int i2, int i3) {
            this.mObservable.c(i2, i3);
        }

        public final void notifyItemRangeChanged(int i2, int i3) {
            this.mObservable.d(i2, i3);
        }

        public final void notifyItemRangeInserted(int i2, int i3) {
            this.mObservable.f(i2, i3);
        }

        public final void notifyItemRangeRemoved(int i2, int i3) {
            this.mObservable.g(i2, i3);
        }

        public final void notifyItemRemoved(int i2) {
            this.mObservable.g(i2, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i2);

        public void onBindViewHolder(VH vh, int i2, List<Object> list) {
            onBindViewHolder(vh, i2);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i2);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void unregisterAdapterDataObserver(i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i2, Object obj) {
            this.mObservable.e(i2, 1, obj);
        }

        public final void notifyItemRangeChanged(int i2, int i3, Object obj) {
            this.mObservable.e(i2, i3, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void c(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i2, i3, 1);
            }
        }

        public void d(int i2, int i3) {
            e(i2, i3, null);
        }

        public void e(int i2, int i3, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i2, i3, obj);
            }
        }

        public void f(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i2, i3);
            }
        }

        public void g(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i2, i3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i2, int i3) {
        }

        public void onItemRangeChanged(int i2, int i3, Object obj) {
            onItemRangeChanged(i2, i3);
        }

        public void onItemRangeInserted(int i2, int i3) {
        }

        public void onItemRangeMoved(int i2, int i3, int i4) {
        }

        public void onItemRangeRemoved(int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int a(int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface b {
            void a(c0 c0Var);
        }

        /* loaded from: classes.dex */
        public static class c {
            public int a;

            /* renamed from: b, reason: collision with root package name */
            public int f1421b;

            /* renamed from: c, reason: collision with root package name */
            public int f1422c;

            /* renamed from: d, reason: collision with root package name */
            public int f1423d;

            public c a(c0 c0Var) {
                return b(c0Var, 0);
            }

            public c b(c0 c0Var, int i2) {
                View view = c0Var.itemView;
                this.a = view.getLeft();
                this.f1421b = view.getTop();
                this.f1422c = view.getRight();
                this.f1423d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(c0 c0Var) {
            int i2 = c0Var.mFlags & 14;
            if (c0Var.isInvalid()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int oldPosition = c0Var.getOldPosition();
            int adapterPosition = c0Var.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i2 : i2 | FLAG_MOVED;
        }

        public abstract boolean animateAppearance(c0 c0Var, c cVar, c cVar2);

        public abstract boolean animateChange(c0 c0Var, c0 c0Var2, c cVar, c cVar2);

        public abstract boolean animateDisappearance(c0 c0Var, c cVar, c cVar2);

        public abstract boolean animatePersistence(c0 c0Var, c cVar, c cVar2);

        public abstract boolean canReuseUpdatedViewHolder(c0 c0Var);

        public boolean canReuseUpdatedViewHolder(c0 c0Var, List<Object> list) {
            return canReuseUpdatedViewHolder(c0Var);
        }

        public final void dispatchAnimationFinished(c0 c0Var) {
            onAnimationFinished(c0Var);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.a(c0Var);
            }
        }

        public final void dispatchAnimationStarted(c0 c0Var) {
            onAnimationStarted(c0Var);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mFinishedListeners.get(i2).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(c0 c0Var);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null) {
                if (!isRunning) {
                    aVar.a();
                } else {
                    this.mFinishedListeners.add(aVar);
                }
            }
            return isRunning;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(c0 c0Var) {
        }

        public void onAnimationStarted(c0 c0Var) {
        }

        public c recordPostLayoutInformation(z zVar, c0 c0Var) {
            return obtainHolderInfo().a(c0Var);
        }

        public c recordPreLayoutInformation(z zVar, c0 c0Var, int i2, List<Object> list) {
            return obtainHolderInfo().a(c0Var);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j2) {
            this.mAddDuration = j2;
        }

        public void setChangeDuration(long j2) {
            this.mChangeDuration = j2;
        }

        void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j2) {
            this.mMoveDuration = j2;
        }

        public void setRemoveDuration(long j2) {
            this.mRemoveDuration = j2;
        }
    }

    /* loaded from: classes.dex */
    private class m implements l.b {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(c0 c0Var) {
            c0Var.setIsRecyclable(true);
            if (c0Var.mShadowedHolder != null && c0Var.mShadowingHolder == null) {
                c0Var.mShadowedHolder = null;
            }
            c0Var.mShadowingHolder = null;
            if (c0Var.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(c0Var.itemView) || !c0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c0Var.itemView, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        @Deprecated
        public void getItemOffsets(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, z zVar) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, z zVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            getItemOffsets(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.d mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.s mHorizontalBoundCheck;
        private final s.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        y mSmoothScroller;
        androidx.recyclerview.widget.s mVerticalBoundCheck;
        private final s.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* loaded from: classes.dex */
        class a implements s.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.s.b
            public View a(int i2) {
                return o.this.getChildAt(i2);
            }

            @Override // androidx.recyclerview.widget.s.b
            public int b(View view) {
                return o.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.s.b
            public int c() {
                return o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.s.b
            public int d() {
                return o.this.getWidth() - o.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.s.b
            public int e(View view) {
                return o.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        class b implements s.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.s.b
            public View a(int i2) {
                return o.this.getChildAt(i2);
            }

            @Override // androidx.recyclerview.widget.s.b
            public int b(View view) {
                return o.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.s.b
            public int c() {
                return o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.s.b
            public int d() {
                return o.this.getHeight() - o.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.s.b
            public int e(View view) {
                return o.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i2, int i3);
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;

            /* renamed from: b, reason: collision with root package name */
            public int f1424b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f1425c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f1426d;
        }

        public o() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.s(aVar);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.s(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i2, boolean z) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z && !childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.mRecyclerView) {
                    int m = this.mChildHelper.m(view);
                    if (i2 == -1) {
                        i2 = this.mChildHelper.g();
                    }
                    if (m == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                    }
                    if (m != i2) {
                        this.mRecyclerView.mLayout.moveView(m, i2);
                    }
                } else {
                    this.mChildHelper.a(view, i2, false);
                    pVar.f1428c = true;
                    y yVar = this.mSmoothScroller;
                    if (yVar != null && yVar.isRunning()) {
                        this.mSmoothScroller.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.c(view, i2, view.getLayoutParams(), false);
            }
            if (pVar.f1429d) {
                childViewHolderInt.itemView.invalidate();
                pVar.f1429d = false;
            }
        }

        public static int chooseSize(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i3, i4) : size;
            }
            return Math.min(size, Math.max(i3, i4));
        }

        private void detachViewInternal(int i2, View view) {
            this.mChildHelper.d(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = 0
                goto L21
            Lf:
                if (r3 < 0) goto L14
            L11:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i2 = left - paddingLeft;
            int min = Math.min(0, i2);
            int i3 = top - paddingTop;
            int min2 = Math.min(0, i3);
            int i4 = width2 - width;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.p.c.f2885f, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(c.p.c.f2886g, 1);
            dVar.f1424b = obtainStyledAttributes.getInt(c.p.c.q, 1);
            dVar.f1425c = obtainStyledAttributes.getBoolean(c.p.c.p, false);
            dVar.f1426d = obtainStyledAttributes.getBoolean(c.p.c.r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i2 < width && rect.right - i2 > paddingLeft && rect.top - i3 < height && rect.bottom - i3 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void scrapOrRecycleView(v vVar, int i2, View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i2);
                vVar.C(childViewHolderInt);
            } else {
                detachViewAt(i2);
                vVar.D(view);
                this.mRecyclerView.mViewInfoStore.k(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i2, p pVar) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            }
            this.mChildHelper.c(view, i2, pVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(p pVar) {
            return pVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i2, int i3, z zVar, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i2, c cVar) {
        }

        public int computeHorizontalScrollExtent(z zVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(z zVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(z zVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(z zVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(z zVar) {
            return 0;
        }

        public int computeVerticalScrollRange(z zVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(vVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, v vVar) {
            scrapOrRecycleView(vVar, this.mChildHelper.m(view), view);
        }

        public void detachAndScrapViewAt(int i2, v vVar) {
            scrapOrRecycleView(vVar, i2, getChildAt(i2));
        }

        public void detachView(View view) {
            int m = this.mChildHelper.m(view);
            if (m >= 0) {
                detachViewInternal(m, view);
            }
        }

        public void detachViewAt(int i2) {
            detachViewInternal(i2, getChildAt(i2));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, vVar);
        }

        public void endAnimation(View view) {
            l lVar = this.mRecyclerView.mItemAnimator;
            if (lVar != null) {
                lVar.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i2 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.e() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract p generateDefaultLayoutParams();

        public p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((p) view.getLayoutParams()).f1427b.bottom;
        }

        public View getChildAt(int i2) {
            androidx.recyclerview.widget.d dVar = this.mChildHelper;
            if (dVar != null) {
                return dVar.f(i2);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.d dVar = this.mChildHelper;
            if (dVar != null) {
                return dVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(v vVar, z zVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((p) view.getLayoutParams()).f1427b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((p) view.getLayoutParams()).f1427b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return androidx.core.view.u.y(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((p) view.getLayoutParams()).f1427b.left;
        }

        public int getMinimumHeight() {
            return androidx.core.view.u.z(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return androidx.core.view.u.A(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return androidx.core.view.u.C(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return androidx.core.view.u.D(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(View view) {
            return ((p) view.getLayoutParams()).f1427b.right;
        }

        public int getRowCountForAccessibility(v vVar, z zVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(v vVar, z zVar) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((p) view.getLayoutParams()).f1427b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).f1427b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt.addFlags(128);
                this.mRecyclerView.mViewInfoStore.q(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(v vVar, z zVar) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            y yVar = this.mSmoothScroller;
            return yVar != null && yVar.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(View view, int i2, int i3, int i4, int i5) {
            Rect rect = ((p) view.getLayoutParams()).f1427b;
            view.layout(i2 + rect.left, i3 + rect.top, i4 - rect.right, i5 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i2, int i3, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f1427b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void measureChild(View view, int i2, int i3) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i4, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i5, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i2, int i3) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i2, int i3) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                detachViewAt(i2);
                attachView(childAt, i3);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i2);
            }
        }

        public void offsetChildrenVertical(int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i2);
            }
        }

        public void onAdapterChanged(g gVar, g gVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view, int i2, v vVar, z zVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void onInitializeAccessibilityNodeInfo(androidx.core.view.d0.c cVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void onInitializeAccessibilityNodeInfoForItem(View view, androidx.core.view.d0.c cVar) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, cVar);
        }

        public View onInterceptFocusSearch(View view, int i2) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
            onItemsUpdated(recyclerView, i2, i3);
        }

        public void onLayoutChildren(v vVar, z zVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(z zVar) {
        }

        public void onMeasure(v vVar, z zVar, int i2, int i3) {
            this.mRecyclerView.defaultOnMeasure(i2, i3);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i2) {
        }

        void onSmoothScrollerStopped(y yVar) {
            if (this.mSmoothScroller == yVar) {
                this.mSmoothScroller = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean performAccessibilityAction(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i2, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean performAccessibilityActionForItem(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i2, bundle);
        }

        public boolean performAccessibilityActionForItem(v vVar, z zVar, View view, int i2, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                androidx.core.view.u.a0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.q(childCount);
            }
        }

        public void removeAndRecycleAllViews(v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, vVar);
                }
            }
        }

        void removeAndRecycleScrapInt(v vVar) {
            int j2 = vVar.j();
            for (int i2 = j2 - 1; i2 >= 0; i2--) {
                View n = vVar.n(i2);
                c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(n, false);
                    }
                    l lVar = this.mRecyclerView.mItemAnimator;
                    if (lVar != null) {
                        lVar.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    vVar.y(n);
                }
            }
            vVar.e();
            if (j2 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, v vVar) {
            removeView(view);
            vVar.B(view);
        }

        public void removeAndRecycleViewAt(int i2, v vVar) {
            View childAt = getChildAt(i2);
            removeViewAt(i2);
            vVar.B(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.p(view);
        }

        public void removeViewAt(int i2) {
            if (getChildAt(i2) != null) {
                this.mChildHelper.q(i2);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i2, v vVar, z zVar) {
            return 0;
        }

        public void scrollToPosition(int i2) {
        }

        public int scrollVerticallyBy(int i2, v vVar, z zVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.K();
                }
            }
        }

        void setMeasureSpecs(int i2, int i3) {
            this.mWidth = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i2, int i3) {
            setMeasuredDimension(chooseSize(i2, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i3, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i2, int i3) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i7, i4, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i2, i3);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldMeasureChild(View view, int i2, int i3, p pVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldReMeasureChild(View view, int i2, int i3, p pVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, z zVar, int i2) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(y yVar) {
            y yVar2 = this.mSmoothScroller;
            if (yVar2 != null && yVar != yVar2 && yVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = yVar;
            yVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            y yVar = this.mSmoothScroller;
            if (yVar != null) {
                yVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i2) {
            addViewInt(view, i2, true);
        }

        public void addView(View view, int i2) {
            addViewInt(view, i2, false);
        }

        public void onInitializeAccessibilityEvent(v vVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.mRecyclerView.mAdapter;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(v vVar, z zVar, androidx.core.view.d0.c cVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.r0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                cVar.a(l.FLAG_APPEARED_IN_PRE_LAYOUT);
                cVar.r0(true);
            }
            cVar.a0(c.b.a(getRowCountForAccessibility(vVar, zVar), getColumnCountForAccessibility(vVar, zVar), isLayoutHierarchical(vVar, zVar), getSelectionModeForAccessibility(vVar, zVar)));
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, z zVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(v vVar, z zVar, int i2, Bundle bundle) {
            int height;
            int width;
            int i3;
            int i4;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i3 = height;
                    i4 = width;
                }
                i3 = height;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i3 = height;
                    i4 = width;
                }
                i3 = height;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i2 = childRectangleOnScreenScrollAmount[0];
            int i3 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.smoothScrollBy(i2, i3);
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void onInitializeAccessibilityNodeInfoForItem(v vVar, z zVar, View view, androidx.core.view.d0.c cVar) {
            cVar.b0(c.C0022c.f(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void attachView(View view, int i2) {
            attachView(view, i2, (p) view.getLayoutParams());
        }

        public p generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void setMeasuredDimension(int i2, int i3) {
            this.mRecyclerView.setMeasuredDimension(i2, i3);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public abstract boolean onFling(int i2, int i3);
    }

    /* loaded from: classes.dex */
    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        }

        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public static class u {
        SparseArray<a> a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private int f1430b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {
            final ArrayList<c0> a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f1431b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f1432c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f1433d = 0;

            a() {
            }
        }

        private a g(int i2) {
            a aVar = this.a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i2, aVar2);
            return aVar2;
        }

        void a() {
            this.f1430b++;
        }

        public void b() {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                this.a.valueAt(i2).a.clear();
            }
        }

        void c() {
            this.f1430b--;
        }

        void d(int i2, long j2) {
            a g2 = g(i2);
            g2.f1433d = j(g2.f1433d, j2);
        }

        void e(int i2, long j2) {
            a g2 = g(i2);
            g2.f1432c = j(g2.f1432c, j2);
        }

        public c0 f(int i2) {
            a aVar = this.a.get(i2);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<c0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.f1430b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(c0 c0Var) {
            int itemViewType = c0Var.getItemViewType();
            ArrayList<c0> arrayList = g(itemViewType).a;
            if (this.a.get(itemViewType).f1431b <= arrayList.size()) {
                return;
            }
            c0Var.resetInternal();
            arrayList.add(c0Var);
        }

        long j(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        boolean k(int i2, long j2, long j3) {
            long j4 = g(i2).f1433d;
            return j4 == 0 || j2 + j4 < j3;
        }

        boolean l(int i2, long j2, long j3) {
            long j4 = g(i2).f1432c;
            return j4 == 0 || j2 + j4 < j3;
        }
    }

    /* loaded from: classes.dex */
    public final class v {
        final ArrayList<c0> a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<c0> f1434b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<c0> f1435c;

        /* renamed from: d, reason: collision with root package name */
        private final List<c0> f1436d;

        /* renamed from: e, reason: collision with root package name */
        private int f1437e;

        /* renamed from: f, reason: collision with root package name */
        int f1438f;

        /* renamed from: g, reason: collision with root package name */
        u f1439g;

        /* renamed from: h, reason: collision with root package name */
        private a0 f1440h;

        public v() {
            ArrayList<c0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.f1434b = null;
            this.f1435c = new ArrayList<>();
            this.f1436d = Collections.unmodifiableList(arrayList);
            this.f1437e = 2;
            this.f1438f = 2;
        }

        private boolean H(c0 c0Var, int i2, int i3, long j2) {
            c0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = c0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != RecyclerView.FOREVER_NS && !this.f1439g.k(itemViewType, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(c0Var, i2);
            this.f1439g.d(c0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c0Var);
            if (!RecyclerView.this.mState.e()) {
                return true;
            }
            c0Var.mPreLayoutPosition = i3;
            return true;
        }

        private void b(c0 c0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = c0Var.itemView;
                if (androidx.core.view.u.w(view) == 0) {
                    androidx.core.view.u.t0(view, 1);
                }
                androidx.recyclerview.widget.o oVar = RecyclerView.this.mAccessibilityDelegate;
                if (oVar == null) {
                    return;
                }
                androidx.core.view.a n = oVar.n();
                if (n instanceof o.a) {
                    ((o.a) n).o(view);
                }
                androidx.core.view.u.i0(view, n);
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(c0 c0Var) {
            View view = c0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i2) {
            a(this.f1435c.get(i2), true);
            this.f1435c.remove(i2);
        }

        public void B(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
        }

        void C(c0 c0Var) {
            boolean z;
            boolean z2 = true;
            if (!c0Var.isScrap() && c0Var.itemView.getParent() == null) {
                if (!c0Var.isTmpDetached()) {
                    if (!c0Var.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = c0Var.doesTransientStatePreventRecycling();
                        g gVar = RecyclerView.this.mAdapter;
                        if ((gVar != null && doesTransientStatePreventRecycling && gVar.onFailedToRecycleView(c0Var)) || c0Var.isRecyclable()) {
                            if (this.f1438f <= 0 || c0Var.hasAnyOfTheFlags(526)) {
                                z = false;
                            } else {
                                int size = this.f1435c.size();
                                if (size >= this.f1438f && size > 0) {
                                    A(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(c0Var.mPosition)) {
                                    int i2 = size - 1;
                                    while (i2 >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.d(this.f1435c.get(i2).mPosition)) {
                                            break;
                                        } else {
                                            i2--;
                                        }
                                    }
                                    size = i2 + 1;
                                }
                                this.f1435c.add(size, c0Var);
                                z = true;
                            }
                            if (!z) {
                                a(c0Var, true);
                                r1 = z;
                                RecyclerView.this.mViewInfoStore.q(c0Var);
                                if (r1 && !z2 && doesTransientStatePreventRecycling) {
                                    c0Var.mOwnerRecyclerView = null;
                                    return;
                                }
                                return;
                            }
                            r1 = z;
                        }
                        z2 = false;
                        RecyclerView.this.mViewInfoStore.q(c0Var);
                        if (r1) {
                            return;
                        } else {
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(c0Var.isScrap());
            sb.append(" isAttached:");
            sb.append(c0Var.itemView.getParent() != null);
            sb.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }

        void D(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f1434b == null) {
                    this.f1434b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f1434b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.a.add(childViewHolderInt);
        }

        void E(u uVar) {
            u uVar2 = this.f1439g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f1439g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f1439g.a();
        }

        void F(a0 a0Var) {
        }

        public void G(int i2) {
            this.f1437e = i2;
            K();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01db A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.c0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        void J(c0 c0Var) {
            if (c0Var.mInChangeScrap) {
                this.f1434b.remove(c0Var);
            } else {
                this.a.remove(c0Var);
            }
            c0Var.mScrapContainer = null;
            c0Var.mInChangeScrap = false;
            c0Var.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void K() {
            o oVar = RecyclerView.this.mLayout;
            this.f1438f = this.f1437e + (oVar != null ? oVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f1435c.size() - 1; size >= 0 && this.f1435c.size() > this.f1438f; size--) {
                A(size);
            }
        }

        boolean L(c0 c0Var) {
            if (c0Var.isRemoved()) {
                return RecyclerView.this.mState.e();
            }
            int i2 = c0Var.mPosition;
            if (i2 >= 0 && i2 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.e() || RecyclerView.this.mAdapter.getItemViewType(c0Var.mPosition) == c0Var.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || c0Var.getItemId() == RecyclerView.this.mAdapter.getItemId(c0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.exceptionLabel());
        }

        void M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f1435c.size() - 1; size >= 0; size--) {
                c0 c0Var = this.f1435c.get(size);
                if (c0Var != null && (i4 = c0Var.mPosition) >= i2 && i4 < i5) {
                    c0Var.addFlags(2);
                    A(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(c0 c0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(c0Var);
            View view = c0Var.itemView;
            androidx.recyclerview.widget.o oVar = RecyclerView.this.mAccessibilityDelegate;
            if (oVar != null) {
                androidx.core.view.a n = oVar.n();
                androidx.core.view.u.i0(view, n instanceof o.a ? ((o.a) n).n(view) : null);
            }
            if (z) {
                g(c0Var);
            }
            c0Var.mOwnerRecyclerView = null;
            i().i(c0Var);
        }

        public void c() {
            this.a.clear();
            z();
        }

        void d() {
            int size = this.f1435c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1435c.get(i2).clearOldPosition();
            }
            int size2 = this.a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.a.get(i3).clearOldPosition();
            }
            ArrayList<c0> arrayList = this.f1434b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f1434b.get(i4).clearOldPosition();
                }
            }
        }

        void e() {
            this.a.clear();
            ArrayList<c0> arrayList = this.f1434b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.mState.b()) {
                return !RecyclerView.this.mState.e() ? i2 : RecyclerView.this.mAdapterHelper.m(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
        }

        void g(c0 c0Var) {
            w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.a(c0Var);
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.onViewRecycled(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(c0Var);
            }
        }

        c0 h(int i2) {
            int size;
            int m;
            ArrayList<c0> arrayList = this.f1434b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    c0 c0Var = this.f1434b.get(i3);
                    if (!c0Var.wasReturnedFromScrap() && c0Var.getLayoutPosition() == i2) {
                        c0Var.addFlags(32);
                        return c0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m = RecyclerView.this.mAdapterHelper.m(i2)) > 0 && m < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m);
                    for (int i4 = 0; i4 < size; i4++) {
                        c0 c0Var2 = this.f1434b.get(i4);
                        if (!c0Var2.wasReturnedFromScrap() && c0Var2.getItemId() == itemId) {
                            c0Var2.addFlags(32);
                            return c0Var2;
                        }
                    }
                }
            }
            return null;
        }

        u i() {
            if (this.f1439g == null) {
                this.f1439g = new u();
            }
            return this.f1439g;
        }

        int j() {
            return this.a.size();
        }

        public List<c0> k() {
            return this.f1436d;
        }

        c0 l(long j2, int i2, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                c0 c0Var = this.a.get(size);
                if (c0Var.getItemId() == j2 && !c0Var.wasReturnedFromScrap()) {
                    if (i2 == c0Var.getItemViewType()) {
                        c0Var.addFlags(32);
                        if (c0Var.isRemoved() && !RecyclerView.this.mState.e()) {
                            c0Var.setFlags(2, 14);
                        }
                        return c0Var;
                    }
                    if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(c0Var.itemView, false);
                        y(c0Var.itemView);
                    }
                }
            }
            int size2 = this.f1435c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                c0 c0Var2 = this.f1435c.get(size2);
                if (c0Var2.getItemId() == j2 && !c0Var2.isAttachedToTransitionOverlay()) {
                    if (i2 == c0Var2.getItemViewType()) {
                        if (!z) {
                            this.f1435c.remove(size2);
                        }
                        return c0Var2;
                    }
                    if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        c0 m(int i2, boolean z) {
            View e2;
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                c0 c0Var = this.a.get(i3);
                if (!c0Var.wasReturnedFromScrap() && c0Var.getLayoutPosition() == i2 && !c0Var.isInvalid() && (RecyclerView.this.mState.f1454h || !c0Var.isRemoved())) {
                    c0Var.addFlags(32);
                    return c0Var;
                }
            }
            if (!z && (e2 = RecyclerView.this.mChildHelper.e(i2)) != null) {
                c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e2);
                RecyclerView.this.mChildHelper.s(e2);
                int m = RecyclerView.this.mChildHelper.m(e2);
                if (m != -1) {
                    RecyclerView.this.mChildHelper.d(m);
                    D(e2);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f1435c.size();
            for (int i4 = 0; i4 < size2; i4++) {
                c0 c0Var2 = this.f1435c.get(i4);
                if (!c0Var2.isInvalid() && c0Var2.getLayoutPosition() == i2 && !c0Var2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.f1435c.remove(i4);
                    }
                    return c0Var2;
                }
            }
            return null;
        }

        View n(int i2) {
            return this.a.get(i2).itemView;
        }

        public View o(int i2) {
            return p(i2, false);
        }

        View p(int i2, boolean z) {
            return I(i2, z, RecyclerView.FOREVER_NS).itemView;
        }

        void s() {
            int size = this.f1435c.size();
            for (int i2 = 0; i2 < size; i2++) {
                p pVar = (p) this.f1435c.get(i2).itemView.getLayoutParams();
                if (pVar != null) {
                    pVar.f1428c = true;
                }
            }
        }

        void t() {
            int size = this.f1435c.size();
            for (int i2 = 0; i2 < size; i2++) {
                c0 c0Var = this.f1435c.get(i2);
                if (c0Var != null) {
                    c0Var.addFlags(6);
                    c0Var.addChangePayload(null);
                }
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.hasStableIds()) {
                z();
            }
        }

        void u(int i2, int i3) {
            int size = this.f1435c.size();
            for (int i4 = 0; i4 < size; i4++) {
                c0 c0Var = this.f1435c.get(i4);
                if (c0Var != null && c0Var.mPosition >= i2) {
                    c0Var.offsetPosition(i3, true);
                }
            }
        }

        void v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i4 = -1;
                i6 = i2;
                i5 = i3;
            } else {
                i4 = 1;
                i5 = i2;
                i6 = i3;
            }
            int size = this.f1435c.size();
            for (int i8 = 0; i8 < size; i8++) {
                c0 c0Var = this.f1435c.get(i8);
                if (c0Var != null && (i7 = c0Var.mPosition) >= i6 && i7 <= i5) {
                    if (i7 == i2) {
                        c0Var.offsetPosition(i3 - i2, false);
                    } else {
                        c0Var.offsetPosition(i4, false);
                    }
                }
            }
        }

        void w(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.f1435c.size() - 1; size >= 0; size--) {
                c0 c0Var = this.f1435c.get(size);
                if (c0Var != null) {
                    int i5 = c0Var.mPosition;
                    if (i5 >= i4) {
                        c0Var.offsetPosition(-i3, z);
                    } else if (i5 >= i2) {
                        c0Var.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        void y(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            C(childViewHolderInt);
        }

        void z() {
            for (int size = this.f1435c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f1435c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface w {
        void a(c0 c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class x extends i {
        x() {
        }

        void a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    androidx.core.view.u.a0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f1453g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.r(i2, i3, obj)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i2, i3)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i2, int i3, int i4) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i2, i3, i4)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i2, i3)) {
                a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {
        private o mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {
            private int a;

            /* renamed from: b, reason: collision with root package name */
            private int f1442b;

            /* renamed from: c, reason: collision with root package name */
            private int f1443c;

            /* renamed from: d, reason: collision with root package name */
            private int f1444d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f1445e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f1446f;

            /* renamed from: g, reason: collision with root package name */
            private int f1447g;

            public a(int i2, int i3) {
                this(i2, i3, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f1445e != null && this.f1443c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f1443c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f1444d >= 0;
            }

            public void b(int i2) {
                this.f1444d = i2;
            }

            void c(RecyclerView recyclerView) {
                int i2 = this.f1444d;
                if (i2 >= 0) {
                    this.f1444d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i2);
                    this.f1446f = false;
                } else {
                    if (this.f1446f) {
                        e();
                        recyclerView.mViewFlinger.f(this.a, this.f1442b, this.f1443c, this.f1445e);
                        int i3 = this.f1447g + 1;
                        this.f1447g = i3;
                        if (i3 > 10) {
                            Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f1446f = false;
                        return;
                    }
                    this.f1447g = 0;
                }
            }

            public void d(int i2, int i3, int i4, Interpolator interpolator) {
                this.a = i2;
                this.f1442b = i3;
                this.f1443c = i4;
                this.f1445e = interpolator;
                this.f1446f = true;
            }

            public a(int i2, int i3, int i4, Interpolator interpolator) {
                this.f1444d = -1;
                this.f1446f = false;
                this.f1447g = 0;
                this.a = i2;
                this.f1442b = i3;
                this.f1443c = i4;
                this.f1445e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF computeScrollVectorForPosition(int i2);
        }

        public PointF computeScrollVectorForPosition(int i2) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i2);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i2) {
            return this.mRecyclerView.mLayout.findViewByPosition(i2);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public o getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i2) {
            this.mRecyclerView.scrollToPosition(i2);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void normalize(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void onAnimation(int i2, int i3) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f2 = computeScrollVectorForPosition.x;
                if (f2 != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f2), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.c(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i2, i3, recyclerView.mState, this.mRecyclingAction);
                boolean a2 = this.mRecyclingAction.a();
                this.mRecyclingAction.c(recyclerView);
                if (a2 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.e();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i2, int i3, z zVar, a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, z zVar, a aVar);

        public void setTargetPosition(int i2) {
            this.mTargetPosition = i2;
        }

        void start(RecyclerView recyclerView, o oVar) {
            recyclerView.mViewFlinger.g();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = oVar;
            int i2 = this.mTargetPosition;
            if (i2 != -1) {
                recyclerView.mState.a = i2;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.mViewFlinger.e();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class z {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f1448b;
        int m;
        long n;
        int o;
        int p;
        int q;
        int a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f1449c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f1450d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f1451e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f1452f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f1453g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f1454h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f1455i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f1456j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f1457k = false;
        boolean l = false;

        void a(int i2) {
            if ((this.f1451e & i2) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1451e));
        }

        public int b() {
            return this.f1454h ? this.f1449c - this.f1450d : this.f1452f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.f1454h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void f(g gVar) {
            this.f1451e = 1;
            this.f1452f = gVar.getItemCount();
            this.f1454h = false;
            this.f1455i = false;
            this.f1456j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.f1448b + ", mItemCount=" + this.f1452f + ", mIsMeasuring=" + this.f1456j + ", mPreviousLayoutItemCount=" + this.f1449c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1450d + ", mStructureChanged=" + this.f1453g + ", mInPreLayout=" + this.f1454h + ", mRunSimpleAnimations=" + this.f1457k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i2 == 18 || i2 == 19 || i2 == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i2 >= 23;
        POST_UPDATES_ON_ANIMATION = i2 >= 16;
        ALLOW_THREAD_GAP_WORK = i2 >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = i2 <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = i2 <= 15;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(c0 c0Var) {
        View view = c0Var.itemView;
        boolean z2 = view.getParent() == this;
        this.mRecycler.J(getChildViewHolder(view));
        if (c0Var.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.mChildHelper.b(view, true);
        } else {
            this.mChildHelper.k(view);
        }
    }

    private void animateChange(c0 c0Var, c0 c0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        c0Var.setIsRecyclable(false);
        if (z2) {
            addAnimatingView(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z3) {
                addAnimatingView(c0Var2);
            }
            c0Var.mShadowedHolder = c0Var2;
            addAnimatingView(c0Var);
            this.mRecycler.J(c0Var);
            c0Var2.setIsRecyclable(false);
            c0Var2.mShadowingHolder = c0Var;
        }
        if (this.mItemAnimator.animateChange(c0Var, c0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == c0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            c0Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(l.FLAG_MOVED);
        androidx.core.view.d0.b.b(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f1456j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        z zVar = this.mState;
        zVar.f1455i = zVar.f1457k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        zVar.f1454h = zVar.l;
        zVar.f1452f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f1457k) {
            int g2 = this.mChildHelper.g();
            for (int i2 = 0; i2 < g2; i2++) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, l.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f1455i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.l) {
            saveOldPositions();
            z zVar2 = this.mState;
            boolean z2 = zVar2.f1453g;
            zVar2.f1453g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, zVar2);
            this.mState.f1453g = z2;
            for (int i3 = 0; i3 < this.mChildHelper.g(); i3++) {
                c0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i3));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int buildAdapterChangeFlagsForAnimations = l.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= l.FLAG_APPEARED_IN_PRE_LAYOUT;
                    }
                    l.c recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, recordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f1451e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f1452f = this.mAdapter.getItemCount();
        z zVar = this.mState;
        zVar.f1450d = 0;
        zVar.f1454h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, zVar);
        z zVar2 = this.mState;
        zVar2.f1453g = false;
        this.mPendingSavedState = null;
        zVar2.f1457k = zVar2.f1457k && this.mItemAnimator != null;
        zVar2.f1451e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        z zVar = this.mState;
        zVar.f1451e = 1;
        if (zVar.f1457k) {
            for (int g2 = this.mChildHelper.g() - 1; g2 >= 0; g2--) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g2));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    l.c recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    c0 g3 = this.mViewInfoStore.g(changedHolderKey);
                    if (g3 != null && !g3.shouldIgnore()) {
                        boolean h2 = this.mViewInfoStore.h(g3);
                        boolean h3 = this.mViewInfoStore.h(childViewHolderInt);
                        if (h2 && g3 == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            l.c n2 = this.mViewInfoStore.n(g3);
                            this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                            l.c m2 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g3);
                            } else {
                                animateChange(g3, childViewHolderInt, n2, m2, h2, h3);
                            }
                        }
                    } else {
                        this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        z zVar2 = this.mState;
        zVar2.f1449c = zVar2.f1452f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        zVar2.f1457k = false;
        zVar2.l = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<c0> arrayList = this.mRecycler.f1434b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.mPrefetchMaxObservedInInitialPrefetch) {
            oVar.mPrefetchMaxCountObserved = 0;
            oVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.K();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.mOnItemTouchListeners.get(i2);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g2 = this.mChildHelper.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        c0 findViewHolderForAdapterPosition;
        z zVar = this.mState;
        int i2 = zVar.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = zVar.b();
        for (int i3 = i2; i3 < b2; i3++) {
            c0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b2, i2);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f1427b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private androidx.core.view.k getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.k(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, c0 c0Var, c0 c0Var2) {
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
            if (childViewHolderInt != c0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                g gVar = this.mAdapter;
                if (gVar != null && gVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + c0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + c0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var2 + " cannot be found but it is necessary for " + c0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (androidx.core.view.u.x(this) == 0) {
            androidx.core.view.u.u0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.d(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + exceptionLabel());
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z3 = false;
        boolean z4 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f1457k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z2 = this.mDataSetHasChangedAfterLayout) || z4 || this.mLayout.mRequestedSimpleAnimations) && (!z2 || this.mAdapter.hasStableIds());
        z zVar = this.mState;
        if (zVar.f1457k && z4 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z3 = true;
        }
        zVar.l = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.f.a(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.f.a(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.f.a(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.f.a(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.u.Z(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.mChildHelper.g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.mChildHelper.n(focusedChild)) {
                return;
            }
        }
        View view = null;
        c0 findViewHolderForItemId = (this.mState.n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.n);
        if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.g() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i2 = this.mState.o;
            if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            androidx.core.view.u.Z(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f1428c) {
                Rect rect = pVar.f1427b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        z zVar = this.mState;
        zVar.n = -1L;
        zVar.m = -1;
        zVar.o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int adapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        c0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.n = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        z zVar = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            adapterPosition = -1;
        } else {
            adapterPosition = findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAdapterPosition();
        }
        zVar.m = adapterPosition;
        this.mState.o = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.mObserver);
            gVar.onAttachedToRecyclerView(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onAdapterChanged(gVar3, this.mAdapter);
        }
        this.mRecycler.x(gVar3, this.mAdapter, z2);
        this.mState.f1453g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.g();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.stopSmoothScroller();
        }
    }

    void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        androidx.core.view.u.Z(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.onAddFocusables(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(n nVar, int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i2, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    void animateAppearance(c0 c0Var, l.c cVar, l.c cVar2) {
        c0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(c0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(c0 c0Var, l.c cVar, l.c cVar2) {
        addAnimatingView(c0Var);
        c0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(c0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(HttpUrl.FRAGMENT_ENCODE_SET + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(c0 c0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.canReuseUpdatedViewHolder(c0Var, c0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.checkLayoutParams((p) layoutParams);
    }

    void clearOldPositions() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            androidx.core.view.u.Z(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (this.mAdapterHelper.p()) {
                if (this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)) {
                    androidx.core.os.c.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.w();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.i();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    androidx.core.os.c.b();
                    return;
                }
                if (this.mAdapterHelper.p()) {
                    androidx.core.os.c.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    androidx.core.os.c.b();
                    return;
                }
                return;
            }
            return;
        }
        androidx.core.os.c.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.c.b();
    }

    void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(o.chooseSize(i2, getPaddingLeft() + getPaddingRight(), androidx.core.view.u.A(this)), o.chooseSize(i3, getPaddingTop() + getPaddingBottom(), androidx.core.view.u.z(this)));
    }

    void dispatchChildAttached(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        z zVar = this.mState;
        zVar.f1456j = false;
        if (zVar.f1451e == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (!this.mAdapterHelper.q() && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    void dispatchOnScrollStateChanged(int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onScrollStateChanged(i2);
        }
        onScrollStateChanged(i2);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrollStateChanged(this, i2);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i2);
            }
        }
    }

    void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrolled(this, i2, i3);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            c0 c0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (c0Var.itemView.getParent() == this && !c0Var.shouldIgnore() && (i2 = c0Var.mPendingAccessibilityState) != -1) {
                androidx.core.view.u.t0(c0Var.itemView, i2);
                c0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z2 : true) {
            androidx.core.view.u.Z(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(z zVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f1417h;
            zVar.p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.q = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            zVar.p = 0;
            zVar.q = 0;
        }
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int g2 = this.mChildHelper.g() - 1; g2 >= 0; g2--) {
            View f4 = this.mChildHelper.f(g2);
            float translationX = f4.getTranslationX();
            float translationY = f4.getTranslationY();
            if (f2 >= f4.getLeft() + translationX && f2 <= f4.getRight() + translationX && f3 >= f4.getTop() + translationY && f3 <= f4.getBottom() + translationY) {
                return f4;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public c0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public c0 findViewHolderForAdapterPosition(int i2) {
        c0 c0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j2 = this.mChildHelper.j();
        for (int i3 = 0; i3 < j2; i3++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                c0Var = childViewHolderInt;
            }
        }
        return c0Var;
    }

    public c0 findViewHolderForItemId(long j2) {
        g gVar = this.mAdapter;
        c0 c0Var = null;
        if (gVar != null && gVar.hasStableIds()) {
            int j3 = this.mChildHelper.j();
            for (int i2 = 0; i2 < j3; i2++) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j2) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    c0Var = childViewHolderInt;
                }
            }
        }
        return c0Var;
    }

    public c0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public c0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public boolean fling(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (!canScrollHorizontally || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (!canScrollVertically || Math.abs(i3) < this.mMinFlingVelocity) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = canScrollHorizontally || canScrollVertically;
            dispatchNestedFling(f2, f3, z2);
            r rVar = this.mOnFlingListener;
            if (rVar != null && rVar.onFling(i2, i3)) {
                return true;
            }
            if (z2) {
                int i4 = canScrollHorizontally ? 1 : 0;
                if (canScrollVertically) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
                int i5 = this.mMaxFlingVelocity;
                int max = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.mMaxFlingVelocity;
                this.mViewFlinger.c(max, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i2);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z3 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.canScrollHorizontally()) {
                int i4 = (this.mLayout.getLayoutDirection() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionFor(c0 c0Var) {
        if (c0Var.hasAnyOfTheFlags(524) || !c0Var.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.e(c0Var.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.getBaseline();
        }
        return super.getBaseline();
    }

    long getChangedHolderKey(c0 c0Var) {
        return this.mAdapter.hasStableIds() ? c0Var.getItemId() : c0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.mChildDrawingOrderCallback;
        if (jVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return jVar.a(i2, i3);
    }

    public long getChildItemId(View view) {
        c0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public c0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.o getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f1428c) {
            return pVar.f1427b;
        }
        if (this.mState.e() && (pVar.b() || pVar.d())) {
            return pVar.f1427b;
        }
        Rect rect = pVar.f1427b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f1428c = false;
        return rect;
    }

    public n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(c.p.b.a), resources.getDimensionPixelSize(c.p.b.f2880c), resources.getDimensionPixelOffset(c.p.b.f2879b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.j
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i2);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((p) this.mChildHelper.i(i2).getLayoutParams()).f1428c = true;
        }
        this.mRecycler.s();
    }

    void markKnownViewsInvalid() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void offsetChildrenHorizontal(int i2) {
        int g2 = this.mChildHelper.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.mChildHelper.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int g2 = this.mChildHelper.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.mChildHelper.f(i3).offsetTopAndBottom(i2);
        }
    }

    void offsetPositionRecordsForInsert(int i2, int i3) {
        int j2 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j2; i4++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2) {
                childViewHolderInt.offsetPosition(i3, false);
                this.mState.f1453g = true;
            }
        }
        this.mRecycler.u(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.mChildHelper.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.mPosition) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    childViewHolderInt.offsetPosition(i3 - i2, false);
                } else {
                    childViewHolderInt.offsetPosition(i6, false);
                }
                this.mState.f1453g = true;
            }
        }
        this.mRecycler.v(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.mChildHelper.j();
        for (int i5 = 0; i5 < j2; i5++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i6 = childViewHolderInt.mPosition;
                if (i6 >= i4) {
                    childViewHolderInt.offsetPosition(-i3, z2);
                    this.mState.f1453g = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.mState.f1453g = true;
                }
            }
        }
        this.mRecycler.w(i2, i3, z2);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.h> threadLocal = androidx.recyclerview.widget.h.f1569f;
            androidx.recyclerview.widget.h hVar = threadLocal.get();
            this.mGapWorker = hVar;
            if (hVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.h();
                Display s2 = androidx.core.view.u.s(this);
                float f2 = 60.0f;
                if (!isInEditMode() && s2 != null) {
                    float refreshRate = s2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.h hVar2 = this.mGapWorker;
                hVar2.f1573j = 1.0E9f / f2;
                threadLocal.set(hVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.h hVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        if (!ALLOW_THREAD_GAP_WORK || (hVar = this.mGapWorker) == null) {
            return;
        }
        hVar.j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDraw(canvas, this, this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = canScrollHorizontally;
            if (canScrollVertically) {
                i2 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x3 - this.mInitialTouchX;
                int i4 = y3 - this.mInitialTouchY;
                if (canScrollHorizontally == 0 || Math.abs(i3) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (canScrollVertically && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        androidx.core.os.c.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.c.b();
        this.mFirstLayoutComplete = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f1451e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i2, i3);
            this.mState.f1456j = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f1456j = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            z zVar = this.mState;
            if (zVar.l) {
                zVar.f1454h = true;
            } else {
                this.mAdapterHelper.j();
                this.mState.f1454h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.mAdapter;
        if (gVar != null) {
            this.mState.f1452f = gVar.getItemCount();
        } else {
            this.mState.f1452f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
        stopInterceptRequestLayout(false);
        this.mState.f1454h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.a());
        o oVar = this.mLayout;
        if (oVar == null || (parcelable2 = this.mPendingSavedState.f1412h) == null) {
            return;
        }
        oVar.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.b(savedState2);
        } else {
            o oVar = this.mLayout;
            if (oVar != null) {
                savedState.f1412h = oVar.onSaveInstanceState();
            } else {
                savedState.f1412h = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        androidx.core.view.u.a0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(c0 c0Var, l.c cVar) {
        c0Var.setFlags(0, 8192);
        if (this.mState.f1455i && c0Var.isUpdated() && !c0Var.isRemoved() && !c0Var.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(c0Var), c0Var);
        }
        this.mViewInfoStore.e(c0Var, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.endAnimations();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r2 = this.mChildHelper.r(view);
        if (r2) {
            c0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.J(childViewHolderInt);
            this.mRecycler.C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r2);
        return r2;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    void repositionShadowingViews() {
        c0 c0Var;
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.mChildHelper.f(i2);
            c0 childViewHolder = getChildViewHolder(f2);
            if (childViewHolder != null && (c0Var = childViewHolder.mShadowingHolder) != null) {
                View view = c0Var.itemView;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void saveOldPositions() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i2 = 0;
            }
            if (!canScrollVertically) {
                i3 = 0;
            }
            scrollByInternal(i2, i3, null);
        }
    }

    boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i12 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.i.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.c.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i2 != 0 ? this.mLayout.scrollHorizontallyBy(i2, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i3 != 0 ? this.mLayout.scrollVerticallyBy(i3, this.mRecycler, this.mState) : 0;
        androidx.core.os.c.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.scrollToPosition(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.o oVar) {
        this.mAccessibilityDelegate = oVar;
        androidx.core.view.u.i0(this, oVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    boolean setChildImportantForAccessibilityInternal(c0 c0Var, int i2) {
        if (isComputingLayout()) {
            c0Var.mPendingAccessibilityState = i2;
            this.mPendingAccessibilityImportanceChange.add(c0Var);
            return false;
        }
        androidx.core.view.u.t0(c0Var.itemView, i2);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        c.h.j.j.c(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            l lVar = this.mItemAnimator;
            if (lVar != null) {
                lVar.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        this.mChildHelper.o();
        this.mLayout = oVar;
        if (oVar != null) {
            if (oVar.mRecyclerView == null) {
                oVar.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.mRecyclerView.exceptionLabel());
            }
        }
        this.mRecycler.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().n(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.mRecycler.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.mRecycler.F(a0Var);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? androidx.core.view.d0.b.a(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= a2 != 0 ? a2 : 0;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.smoothScrollToPosition(this, this.mState, i2);
        }
    }

    void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().p(i2);
    }

    void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.j
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(g gVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.mChildHelper.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.mChildHelper.i(i6);
            c0 childViewHolderInt = getChildViewHolderInt(i7);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i2 && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((p) i7.getLayoutParams()).f1428c = true;
            }
        }
        this.mRecycler.M(i2, i3);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.p.a.a);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().g(i2, i3, i4, i5, iArr, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.c0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.d r0 = r5.mChildHelper
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.d r3 = r5.mChildHelper
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.d r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().l(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().q(i2, i3);
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().s(i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new androidx.recyclerview.widget.t();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new androidx.recyclerview.widget.e();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z2 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new b0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new h.b() : null;
        this.mState = new z();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = androidx.core.view.v.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = androidx.core.view.v.d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (androidx.core.view.u.w(this) == 0) {
            androidx.core.view.u.t0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.o(this));
        int[] iArr = c.p.c.f2885f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(c.p.c.o);
        if (obtainStyledAttributes.getInt(c.p.c.f2888i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(c.p.c.f2887h, true);
        boolean z3 = obtainStyledAttributes.getBoolean(c.p.c.f2889j, false);
        this.mEnableFastScroller = z3;
        if (z3) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(c.p.c.m), obtainStyledAttributes.getDrawable(c.p.c.n), (StateListDrawable) obtainStyledAttributes.getDrawable(c.p.c.f2890k), obtainStyledAttributes.getDrawable(c.p.c.l));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        if (i3 >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h, reason: collision with root package name */
        Parcelable f1412h;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1412h = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        void b(SavedState savedState) {
            this.f1412h = savedState.f1412h;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f1412h, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {
        c0 a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f1427b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1428c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1429d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1427b = new Rect();
            this.f1428c = true;
            this.f1429d = false;
        }

        public int a() {
            return this.a.getLayoutPosition();
        }

        public boolean b() {
            return this.a.isUpdated();
        }

        public boolean c() {
            return this.a.isRemoved();
        }

        public boolean d() {
            return this.a.isInvalid();
        }

        public p(int i2, int i3) {
            super(i2, i3);
            this.f1427b = new Rect();
            this.f1428c = true;
            this.f1429d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1427b = new Rect();
            this.f1428c = true;
            this.f1429d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1427b = new Rect();
            this.f1428c = true;
            this.f1429d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f1427b = new Rect();
            this.f1428c = true;
            this.f1429d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!oVar.canScrollHorizontally()) {
            i2 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 == Integer.MIN_VALUE || i4 > 0) {
            if (z2) {
                int i5 = i2 != 0 ? 1 : 0;
                if (i3 != 0) {
                    i5 |= 2;
                }
                startNestedScroll(i5, 1);
            }
            this.mViewFlinger.f(i2, i3, i4, interpolator);
            return;
        }
        scrollBy(i2, i3);
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }
}
