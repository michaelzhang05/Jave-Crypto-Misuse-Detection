package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.accessibility.g0;
import androidx.core.view.c3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: c, reason: collision with root package name */
    private static Field f2318c;

    /* renamed from: e, reason: collision with root package name */
    private static ThreadLocal f2320e;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f2316a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap f2317b = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2319d = false;

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f2321f = {s.c.f9136b, s.c.f9137c, s.c.f9148n, s.c.f9159y, s.c.B, s.c.C, s.c.D, s.c.E, s.c.F, s.c.G, s.c.f9138d, s.c.f9139e, s.c.f9140f, s.c.f9141g, s.c.f9142h, s.c.f9143i, s.c.f9144j, s.c.f9145k, s.c.f9146l, s.c.f9147m, s.c.f9149o, s.c.f9150p, s.c.f9151q, s.c.f9152r, s.c.f9153s, s.c.f9154t, s.c.f9155u, s.c.f9156v, s.c.f9157w, s.c.f9158x, s.c.f9160z, s.c.A};

    /* renamed from: g, reason: collision with root package name */
    private static final y0 f2322g = new y0() { // from class: androidx.core.view.a1
        @Override // androidx.core.view.y0
        public final d a(d dVar) {
            d Y;
            Y = b1.Y(dVar);
            return Y;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final e f2323h = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f {
        a(int i6, Class cls, int i7) {
            super(i6, cls, i7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f {
        b(int i6, Class cls, int i7, int i8) {
            super(i6, cls, i7, i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return p.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends f {
        c(int i6, Class cls, int i7, int i8) {
            super(i6, cls, i7, i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return r.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            r.b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends f {
        d(int i6, Class cls, int i7) {
            super(i6, cls, i7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.b1.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakHashMap f2324a = new WeakHashMap();

        e() {
        }

        private void b(View view, boolean z5) {
            boolean z6 = view.isShown() && view.getWindowVisibility() == 0;
            if (z5 != z6) {
                b1.Z(view, z6 ? 16 : 32);
                this.f2324a.put(view, Boolean.valueOf(z6));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            this.f2324a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.f2324a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f2324a.entrySet()) {
                    b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f2325a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f2326b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2327c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2328d;

        f(int i6, Class cls, int i7) {
            this(i6, cls, 0, i7);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f2327c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object d(View view);

        abstract void e(View view, Object obj);

        Object f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            Object tag = view.getTag(this.f2325a);
            if (this.f2326b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void g(View view, Object obj) {
            if (c()) {
                e(view, obj);
            } else if (b() && h(f(view), obj)) {
                b1.l(view);
                view.setTag(this.f2325a, obj);
                b1.Z(view, this.f2328d);
            }
        }

        abstract boolean h(Object obj, Object obj2);

        f(int i6, Class cls, int i7, int i8) {
            this.f2325a = i6;
            this.f2326b = cls;
            this.f2328d = i7;
            this.f2327c = i8;
        }
    }

    /* loaded from: classes.dex */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i6, Bundle bundle) {
            return view.performAccessibilityAction(i6, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i6, int i7, int i8, int i9) {
            view.postInvalidateOnAnimation(i6, i7, i8, i9);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j6) {
            view.postOnAnimationDelayed(runnable, j6);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z5) {
            view.setHasTransientState(z5);
        }

        static void s(View view, int i6) {
            view.setImportantForAccessibility(i6);
        }
    }

    /* loaded from: classes.dex */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i6) {
            view.setLabelFor(i6);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i6) {
            view.setLayoutDirection(i6);
        }

        static void k(View view, int i6, int i7, int i8, int i9) {
            view.setPaddingRelative(i6, i7, i8, i9);
        }
    }

    /* loaded from: classes.dex */
    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i6) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i6);
        }

        static void f(View view, int i6) {
            view.setAccessibilityLiveRegion(i6);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i6) {
            accessibilityEvent.setContentChangeTypes(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    private static class m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            c3 f2329a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f2330b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ w0 f2331c;

            a(View view, w0 w0Var) {
                this.f2330b = view;
                this.f2331c = w0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                c3 w5 = c3.w(windowInsets, view);
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 30) {
                    m.a(windowInsets, this.f2330b);
                    if (w5.equals(this.f2329a)) {
                        return this.f2331c.a(view, w5).u();
                    }
                }
                this.f2329a = w5;
                c3 a6 = this.f2331c.a(view, w5);
                if (i6 >= 30) {
                    return a6.u();
                }
                b1.n0(view);
                return a6.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(s.c.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static c3 b(View view, c3 c3Var, Rect rect) {
            WindowInsets u5 = c3Var.u();
            if (u5 != null) {
                return c3.w(view.computeSystemWindowInsets(u5, rect), view);
            }
            rect.setEmpty();
            return c3Var;
        }

        static boolean c(View view, float f6, float f7, boolean z5) {
            return view.dispatchNestedFling(f6, f7, z5);
        }

        static boolean d(View view, float f6, float f7) {
            return view.dispatchNestedPreFling(f6, f7);
        }

        static boolean e(View view, int i6, int i7, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i6, i7, iArr, iArr2);
        }

        static boolean f(View view, int i6, int i7, int i8, int i9, int[] iArr) {
            return view.dispatchNestedScroll(i6, i7, i8, i9, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static c3 j(View view) {
            return c3.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f6) {
            view.setElevation(f6);
        }

        static void t(View view, boolean z5) {
            view.setNestedScrollingEnabled(z5);
        }

        static void u(View view, w0 w0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(s.c.L, w0Var);
            }
            if (w0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(s.c.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, w0Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f6) {
            view.setTranslationZ(f6);
        }

        static void x(View view, float f6) {
            view.setZ(f6);
        }

        static boolean y(View view, int i6) {
            return view.startNestedScroll(i6);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    private static class n {
        public static c3 a(View view) {
            WindowInsets rootWindowInsets;
            rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            c3 v5 = c3.v(rootWindowInsets);
            v5.s(v5);
            v5.d(view.getRootView());
            return v5;
        }

        static int b(View view) {
            int scrollIndicators;
            scrollIndicators = view.getScrollIndicators();
            return scrollIndicators;
        }

        static void c(View view, int i6) {
            view.setScrollIndicators(i6);
        }

        static void d(View view, int i6, int i7) {
            view.setScrollIndicators(i6, i7);
        }
    }

    /* loaded from: classes.dex */
    static class o {
        static void a(View view, Collection<View> collection, int i6) {
            view.addKeyboardNavigationClusters(collection, i6);
        }

        static int b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        static int c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        static boolean d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        static boolean e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        static boolean f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        static boolean g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        static View h(View view, View view2, int i6) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i6);
            return keyboardNavigationClusterSearch;
        }

        static boolean i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z5) {
            view.setFocusedByDefault(z5);
        }

        static void l(View view, int i6) {
            view.setImportantForAutofill(i6);
        }

        static void m(View view, boolean z5) {
            view.setKeyboardNavigationCluster(z5);
        }

        static void n(View view, int i6) {
            view.setNextClusterForwardId(i6);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p {
        static void a(View view, final u uVar) {
            l.g gVar = (l.g) view.getTag(s.c.R);
            if (gVar == null) {
                gVar = new l.g();
                view.setTag(s.c.R, gVar);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(uVar) { // from class: androidx.core.view.e2
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            gVar.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener a6;
            l.g gVar = (l.g) view.getTag(s.c.R);
            if (gVar == null || (a6 = a2.a(gVar.get(uVar))) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(a6);
        }

        static <T> T f(View view, int i6) {
            KeyEvent.Callback requireViewById;
            requireViewById = view.requireViewById(i6);
            return (T) requireViewById;
        }

        static void g(View view, boolean z5) {
            view.setAccessibilityHeading(z5);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z5) {
            view.setScreenReaderFocusable(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class q {
        static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6, int i7) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i6, i7);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class r {
        static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    private static final class s {
        public static String[] a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        public static androidx.core.view.d b(View view, androidx.core.view.d dVar) {
            ContentInfo performReceiveContent;
            ContentInfo f6 = dVar.f();
            performReceiveContent = view.performReceiveContent(f6);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f6 ? dVar : androidx.core.view.d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, x0 x0Var) {
            if (x0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(x0Var));
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class t implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        private final x0 f2332a;

        t(x0 x0Var) {
            this.f2332a = x0Var;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.d g6 = androidx.core.view.d.g(contentInfo);
            androidx.core.view.d a6 = this.f2332a.a(view, g6);
            if (a6 == null) {
                return null;
            }
            return a6 == g6 ? contentInfo : a6.f();
        }
    }

    /* loaded from: classes.dex */
    public interface u {
    }

    /* loaded from: classes.dex */
    static class v {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList f2333d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap f2334a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f2335b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference f2336c = null;

        v() {
        }

        static v a(View view) {
            v vVar = (v) view.getTag(s.c.Q);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(s.c.Q, vVar2);
            return vVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f2334a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c6 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c6 != null) {
                            return c6;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f2335b == null) {
                this.f2335b = new SparseArray();
            }
            return this.f2335b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(s.c.R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            androidx.appcompat.app.f0.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f2334a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f2333d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2334a == null) {
                    this.f2334a = new WeakHashMap();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList arrayList2 = f2333d;
                    View view = (View) ((WeakReference) arrayList2.get(size)).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2334a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2334a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c6 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c6 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c6));
                }
            }
            return c6 != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f2336c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f2336c = new WeakReference(keyEvent);
            SparseArray d6 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d6.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) d6.valueAt(indexOfKey);
                d6.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) d6.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && b1.T(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static y0 A(View view) {
        return view instanceof y0 ? (y0) view : f2322g;
    }

    public static void A0(View view, int i6) {
        h.s(view, i6);
    }

    public static boolean B(View view) {
        return h.b(view);
    }

    public static void B0(View view, int i6) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, i6);
        }
    }

    public static int C(View view) {
        return h.c(view);
    }

    public static void C0(View view, int i6) {
        i.h(view, i6);
    }

    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.b(view);
        }
        return 0;
    }

    public static void D0(View view, w0 w0Var) {
        m.u(view, w0Var);
    }

    public static int E(View view) {
        return i.d(view);
    }

    public static void E0(View view, int i6, int i7, int i8, int i9) {
        i.k(view, i6, i7, i8, i9);
    }

    public static int F(View view) {
        return h.d(view);
    }

    public static void F0(View view, boolean z5) {
        p0().g(view, Boolean.valueOf(z5));
    }

    public static int G(View view) {
        return h.e(view);
    }

    public static void G0(View view, int i6, int i7) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i6, i7);
        }
    }

    public static String[] H(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(s.c.N);
    }

    public static void H0(View view, String str) {
        m.v(view, str);
    }

    public static int I(View view) {
        return i.e(view);
    }

    private static void I0(View view) {
        if (C(view) == 0) {
            A0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C((View) parent) == 4) {
                A0(view, 2);
                return;
            }
        }
    }

    public static int J(View view) {
        return i.f(view);
    }

    private static f J0() {
        return new c(s.c.P, CharSequence.class, 64, 30);
    }

    public static c3 K(View view) {
        return Build.VERSION.SDK_INT >= 23 ? n.a(view) : m.j(view);
    }

    public static void K0(View view) {
        m.z(view);
    }

    public static CharSequence L(View view) {
        return (CharSequence) J0().f(view);
    }

    private static void L0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static String M(View view) {
        return m.k(view);
    }

    public static int N(View view) {
        return h.g(view);
    }

    public static float O(View view) {
        return m.m(view);
    }

    public static boolean P(View view) {
        return g.a(view);
    }

    public static boolean Q(View view) {
        return h.h(view);
    }

    public static boolean R(View view) {
        return h.i(view);
    }

    public static boolean S(View view) {
        Boolean bool = (Boolean) b().f(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean T(View view) {
        return k.b(view);
    }

    public static boolean U(View view) {
        return k.c(view);
    }

    public static boolean V(View view) {
        return m.p(view);
    }

    public static boolean W(View view) {
        return i.g(view);
    }

    public static boolean X(View view) {
        Boolean bool = (Boolean) p0().f(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.core.view.d Y(androidx.core.view.d dVar) {
        return dVar;
    }

    static void Z(View view, int i6) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = r(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (q(view) != 0 || z5) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z5 ? 32 : 2048);
                k.g(obtain, i6);
                if (z5) {
                    obtain.getText().add(r(view));
                    I0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i6 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i6);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(r(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i6);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e6);
                }
            }
        }
    }

    public static void a0(View view, int i6) {
        boolean z5;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i6);
            return;
        }
        Rect z6 = z();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            z6.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z5 = !z6.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z5 = false;
        }
        f(view, i6);
        if (z5 && z6.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(z6);
        }
    }

    private static f b() {
        return new d(s.c.J, Boolean.class, 28);
    }

    public static void b0(View view, int i6) {
        boolean z5;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i6);
            return;
        }
        Rect z6 = z();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            z6.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z5 = !z6.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z5 = false;
        }
        g(view, i6);
        if (z5 && z6.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(z6);
        }
    }

    public static int c(View view, CharSequence charSequence, androidx.core.view.accessibility.j0 j0Var) {
        int t5 = t(view, charSequence);
        if (t5 != -1) {
            d(view, new g0.a(t5, charSequence, j0Var));
        }
        return t5;
    }

    public static c3 c0(View view, c3 c3Var) {
        WindowInsets u5 = c3Var.u();
        if (u5 != null) {
            WindowInsets b6 = l.b(view, u5);
            if (!b6.equals(u5)) {
                return c3.w(b6, view);
            }
        }
        return c3Var;
    }

    private static void d(View view, g0.a aVar) {
        l(view);
        l0(aVar.b(), view);
        s(view).add(aVar);
        Z(view, 0);
    }

    public static void d0(View view, androidx.core.view.accessibility.g0 g0Var) {
        view.onInitializeAccessibilityNodeInfo(g0Var.x0());
    }

    public static w2 e(View view) {
        if (f2317b == null) {
            f2317b = new WeakHashMap();
        }
        w2 w2Var = (w2) f2317b.get(view);
        if (w2Var != null) {
            return w2Var;
        }
        w2 w2Var2 = new w2(view);
        f2317b.put(view, w2Var2);
        return w2Var2;
    }

    private static f e0() {
        return new b(s.c.K, CharSequence.class, 8, 28);
    }

    private static void f(View view, int i6) {
        view.offsetLeftAndRight(i6);
        if (view.getVisibility() == 0) {
            L0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                L0((View) parent);
            }
        }
    }

    public static boolean f0(View view, int i6, Bundle bundle) {
        return h.j(view, i6, bundle);
    }

    private static void g(View view, int i6) {
        view.offsetTopAndBottom(i6);
        if (view.getVisibility() == 0) {
            L0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                L0((View) parent);
            }
        }
    }

    public static androidx.core.view.d g0(View view, androidx.core.view.d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, dVar);
        }
        x0 x0Var = (x0) view.getTag(s.c.M);
        if (x0Var == null) {
            return A(view).a(dVar);
        }
        androidx.core.view.d a6 = x0Var.a(view, dVar);
        if (a6 == null) {
            return null;
        }
        return A(view).a(a6);
    }

    public static c3 h(View view, c3 c3Var, Rect rect) {
        return m.b(view, c3Var, rect);
    }

    public static void h0(View view) {
        h.k(view);
    }

    public static c3 i(View view, c3 c3Var) {
        WindowInsets u5 = c3Var.u();
        if (u5 != null) {
            WindowInsets a6 = l.a(view, u5);
            if (!a6.equals(u5)) {
                return c3.w(a6, view);
            }
        }
        return c3Var;
    }

    public static void i0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void j0(View view, Runnable runnable, long j6) {
        h.n(view, runnable, j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void k0(View view, int i6) {
        l0(i6, view);
        Z(view, 0);
    }

    static void l(View view) {
        androidx.core.view.a n6 = n(view);
        if (n6 == null) {
            n6 = new androidx.core.view.a();
        }
        q0(view, n6);
    }

    private static void l0(int i6, View view) {
        List s5 = s(view);
        for (int i7 = 0; i7 < s5.size(); i7++) {
            if (((g0.a) s5.get(i7)).b() == i6) {
                s5.remove(i7);
                return;
            }
        }
    }

    public static int m() {
        return i.a();
    }

    public static void m0(View view, g0.a aVar, CharSequence charSequence, androidx.core.view.accessibility.j0 j0Var) {
        if (j0Var == null && charSequence == null) {
            k0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, j0Var));
        }
    }

    public static androidx.core.view.a n(View view) {
        View.AccessibilityDelegate o6 = o(view);
        if (o6 == null) {
            return null;
        }
        return o6 instanceof a.C0034a ? ((a.C0034a) o6).f2271a : new androidx.core.view.a(o6);
    }

    public static void n0(View view) {
        l.c(view);
    }

    private static View.AccessibilityDelegate o(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : p(view);
    }

    public static void o0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i6, i7);
        }
    }

    private static View.AccessibilityDelegate p(View view) {
        if (f2319d) {
            return null;
        }
        if (f2318c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2318c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2319d = true;
                return null;
            }
        }
        try {
            Object obj = f2318c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2319d = true;
            return null;
        }
    }

    private static f p0() {
        return new a(s.c.O, Boolean.class, 28);
    }

    public static int q(View view) {
        return k.a(view);
    }

    public static void q0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (o(view) instanceof a.C0034a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static CharSequence r(View view) {
        return (CharSequence) e0().f(view);
    }

    public static void r0(View view, boolean z5) {
        b().g(view, Boolean.valueOf(z5));
    }

    private static List s(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(s.c.H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(s.c.H, arrayList2);
        return arrayList2;
    }

    public static void s0(View view, int i6) {
        k.f(view, i6);
    }

    private static int t(View view, CharSequence charSequence) {
        List s5 = s(view);
        for (int i6 = 0; i6 < s5.size(); i6++) {
            if (TextUtils.equals(charSequence, ((g0.a) s5.get(i6)).c())) {
                return ((g0.a) s5.get(i6)).b();
            }
        }
        int i7 = 0;
        int i8 = -1;
        while (true) {
            int[] iArr = f2321f;
            if (i7 >= iArr.length || i8 != -1) {
                break;
            }
            int i9 = iArr[i7];
            boolean z5 = true;
            for (int i10 = 0; i10 < s5.size(); i10++) {
                z5 &= ((g0.a) s5.get(i10)).b() != i9;
            }
            if (z5) {
                i8 = i9;
            }
            i7++;
        }
        return i8;
    }

    public static void t0(View view, CharSequence charSequence) {
        e0().g(view, charSequence);
        if (charSequence != null) {
            f2323h.a(view);
        } else {
            f2323h.d(view);
        }
    }

    public static ColorStateList u(View view) {
        return m.g(view);
    }

    public static void u0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static PorterDuff.Mode v(View view) {
        return m.h(view);
    }

    public static void v0(View view, ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static Rect w(View view) {
        return j.a(view);
    }

    public static void w0(View view, PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    public static Display x(View view) {
        return i.b(view);
    }

    public static void x0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static float y(View view) {
        return m.i(view);
    }

    public static void y0(View view, float f6) {
        m.s(view, f6);
    }

    private static Rect z() {
        if (f2320e == null) {
            f2320e = new ThreadLocal();
        }
        Rect rect = (Rect) f2320e.get();
        if (rect == null) {
            rect = new Rect();
            f2320e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void z0(View view, boolean z5) {
        h.r(view, z5);
    }
}
