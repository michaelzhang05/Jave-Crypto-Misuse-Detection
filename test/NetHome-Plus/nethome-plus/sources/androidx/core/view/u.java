package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.a;
import androidx.core.view.c0;
import androidx.core.view.d0.c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    private static Field f1018b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1019c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f1020d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f1021e;

    /* renamed from: f, reason: collision with root package name */
    private static WeakHashMap<View, String> f1022f;

    /* renamed from: h, reason: collision with root package name */
    private static Field f1024h;

    /* renamed from: j, reason: collision with root package name */
    private static ThreadLocal<Rect> f1026j;
    private static final AtomicInteger a = new AtomicInteger(1);

    /* renamed from: g, reason: collision with root package name */
    private static WeakHashMap<View, y> f1023g = null;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f1025i = false;

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f1027k = {c.h.c.f2631b, c.h.c.f2632c, c.h.c.n, c.h.c.y, c.h.c.B, c.h.c.C, c.h.c.D, c.h.c.E, c.h.c.F, c.h.c.G, c.h.c.f2633d, c.h.c.f2634e, c.h.c.f2635f, c.h.c.f2636g, c.h.c.f2637h, c.h.c.f2638i, c.h.c.f2639j, c.h.c.f2640k, c.h.c.l, c.h.c.m, c.h.c.o, c.h.c.p, c.h.c.q, c.h.c.r, c.h.c.s, c.h.c.t, c.h.c.u, c.h.c.v, c.h.c.w, c.h.c.x, c.h.c.z, c.h.c.A};
    private static final q l = new a();
    private static f m = new f();

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    class a implements q {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class b extends g<Boolean> {
        b(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class c extends g<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class d extends g<CharSequence> {
        d(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class e extends g<Boolean> {
        e(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1028f = new WeakHashMap<>();

        f() {
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                u.S(view, z2 ? 16 : 32);
                this.f1028f.put(view, Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f1028f.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class g<T> {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f1029b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1030c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1031d;

        g(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f1030c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t = (T) view.getTag(this.a);
            if (this.f1029b.isInstance(t)) {
                return t;
            }
            return null;
        }

        void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                u.B(view);
                view.setTag(this.a, t);
                u.S(view, this.f1031d);
            }
        }

        abstract boolean h(T t, T t2);

        g(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.f1029b = cls;
            this.f1031d = i3;
            this.f1030c = i4;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static class h {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            c0 a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f1032b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f1033c;

            a(View view, p pVar) {
                this.f1032b = view;
                this.f1033c = pVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                c0 v = c0.v(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    h.a(windowInsets, this.f1032b);
                    if (v.equals(this.a)) {
                        return this.f1033c.a(view, v).t();
                    }
                }
                this.a = v;
                c0 a = this.f1033c.a(view, v);
                if (i2 >= 30) {
                    return a.t();
                }
                u.f0(view);
                return a.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(c.h.c.R);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static c0 b(View view, c0 c0Var, Rect rect) {
            WindowInsets t = c0Var.t();
            if (t != null) {
                return c0.v(view.computeSystemWindowInsets(t, rect), view);
            }
            rect.setEmpty();
            return c0Var;
        }

        public static c0 c(View view) {
            return c0.a.a(view);
        }

        static void d(View view, p pVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(c.h.c.L, pVar);
            }
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(c.h.c.R));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, pVar));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static class i {
        public static c0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            c0 u = c0.u(rootWindowInsets);
            u.r(u);
            u.d(view.getRootView());
            return u;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static class j {
        static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface k {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class l {
        private static final ArrayList<WeakReference<View>> a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1034b = null;

        /* renamed from: c, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f1035c = null;

        /* renamed from: d, reason: collision with root package name */
        private WeakReference<KeyEvent> f1036d = null;

        l() {
        }

        static l a(View view) {
            int i2 = c.h.c.P;
            l lVar = (l) view.getTag(i2);
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l();
            view.setTag(i2, lVar2);
            return lVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1034b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f1035c == null) {
                this.f1035c = new SparseArray<>();
            }
            return this.f1035c;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(c.h.c.Q);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((k) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1034b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = a;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f1034b == null) {
                    this.f1034b = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = a;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f1034b.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f1034b.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c2));
                }
            }
            return c2 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f1036d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f1036d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && u.N(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f1019c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f1018b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1019c = true;
        }
        Field field = f1018b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    private static void A0(View view) {
        if (w(view) == 0) {
            t0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (w((View) parent) == 4) {
                t0(view, 2);
                return;
            }
        }
    }

    static androidx.core.view.a B(View view) {
        androidx.core.view.a j2 = j(view);
        if (j2 == null) {
            j2 = new androidx.core.view.a();
        }
        i0(view, j2);
        return j2;
    }

    private static g<CharSequence> B0() {
        return new d(c.h.c.N, CharSequence.class, 64, 30);
    }

    public static int C(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void C0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof androidx.core.view.j) {
            ((androidx.core.view.j) view).stopNestedScroll();
        }
    }

    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    private static void D0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static c0 E(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return i.a(view);
        }
        if (i2 >= 21) {
            return h.c(view);
        }
        return null;
    }

    public static final CharSequence F(View view) {
        return B0().f(view);
    }

    public static String G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f1022f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float I(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean J(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean L(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean M(View view) {
        Boolean f2 = a().f(view);
        if (f2 == null) {
            return false;
        }
        return f2.booleanValue();
    }

    public static boolean N(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean O(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof androidx.core.view.j) {
            return ((androidx.core.view.j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean Q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean R(View view) {
        Boolean f2 = h0().f(view);
        if (f2 == null) {
            return false;
        }
        return f2.booleanValue();
    }

    static void S(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = n(view) != null && view.getVisibility() == 0;
            if (m(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : RecyclerView.l.FLAG_MOVED);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(n(view));
                    A0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(n(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void T(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        if (i3 >= 21) {
            Rect u = u();
            boolean z = false;
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            d(view, i2);
            if (z && u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(u);
                return;
            }
            return;
        }
        d(view, i2);
    }

    public static void U(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        if (i3 >= 21) {
            Rect u = u();
            boolean z = false;
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            e(view, i2);
            if (z && u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(u);
                return;
            }
            return;
        }
        e(view, i2);
    }

    public static c0 V(View view, c0 c0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = c0Var.t()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(t);
            if (!onApplyWindowInsets.equals(t)) {
                return c0.v(onApplyWindowInsets, view);
            }
        }
        return c0Var;
    }

    public static void W(View view, androidx.core.view.d0.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.x0());
    }

    private static g<CharSequence> X() {
        return new c(c.h.c.K, CharSequence.class, 8, 28);
    }

    public static boolean Y(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static void Z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    private static g<Boolean> a() {
        return new e(c.h.c.J, Boolean.class, 28);
    }

    public static void a0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    private static void b(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            B(view);
            d0(aVar.b(), view);
            o(view).add(aVar);
            S(view, 0);
        }
    }

    public static void b0(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static y c(View view) {
        if (f1023g == null) {
            f1023g = new WeakHashMap<>();
        }
        y yVar = f1023g.get(view);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(view);
        f1023g.put(view, yVar2);
        return yVar2;
    }

    public static void c0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            d0(i2, view);
            S(view, 0);
        }
    }

    private static void d(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            D0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                D0((View) parent);
            }
        }
    }

    private static void d0(int i2, View view) {
        List<c.a> o = o(view);
        for (int i3 = 0; i3 < o.size(); i3++) {
            if (o.get(i3).b() == i2) {
                o.remove(i3);
                return;
            }
        }
    }

    private static void e(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            D0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                D0((View) parent);
            }
        }
    }

    public static void e0(View view, c.a aVar, CharSequence charSequence, androidx.core.view.d0.f fVar) {
        if (fVar == null && charSequence == null) {
            c0(view, aVar.b());
        } else {
            b(view, aVar.a(charSequence, fVar));
        }
    }

    public static c0 f(View view, c0 c0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? h.b(view, c0Var, rect) : c0Var;
    }

    public static void f0(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static c0 g(View view, c0 c0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = c0Var.t()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(t);
            if (!dispatchApplyWindowInsets.equals(t)) {
                return c0.v(dispatchApplyWindowInsets, view);
            }
        }
        return c0Var;
    }

    public static void g0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.a(view).b(view, keyEvent);
    }

    private static g<Boolean> h0() {
        return new b(c.h.c.M, Boolean.class, 28);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.a(view).f(keyEvent);
    }

    public static void i0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (k(view) instanceof a.C0020a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static androidx.core.view.a j(View view) {
        View.AccessibilityDelegate k2 = k(view);
        if (k2 == null) {
            return null;
        }
        if (k2 instanceof a.C0020a) {
            return ((a.C0020a) k2).a;
        }
        return new androidx.core.view.a(k2);
    }

    public static void j0(View view, boolean z) {
        a().g(view, Boolean.valueOf(z));
    }

    private static View.AccessibilityDelegate k(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return l(view);
    }

    public static void k0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    private static View.AccessibilityDelegate l(View view) {
        if (f1025i) {
            return null;
        }
        if (f1024h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1024h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1025i = true;
                return null;
            }
        }
        try {
            Object obj = f1024h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1025i = true;
            return null;
        }
    }

    @Deprecated
    public static void l0(View view, float f2) {
        view.setAlpha(f2);
    }

    public static int m(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void m0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static CharSequence n(View view) {
        return X().f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n0(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i2 == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof t) {
            ((t) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    private static List<c.a> o(View view) {
        int i2 = c.h.c.H;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i2, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o0(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            view.setBackgroundTintMode(mode);
            if (i2 == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof t) {
            ((t) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void p0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PorterDuff.Mode q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void q0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static Rect r(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    @Deprecated
    public static void r0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static Display s(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (N(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void s0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static float t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void t0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (i3 >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    private static Rect u() {
        if (f1026j == null) {
            f1026j = new ThreadLocal<>();
        }
        Rect rect = f1026j.get();
        if (rect == null) {
            rect = new Rect();
            f1026j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void u0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static boolean v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static void v0(View view, p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.d(view, pVar);
        }
    }

    public static int w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void w0(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void x0(View view, s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (sVar != null ? sVar.a() : null));
        }
    }

    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static void y0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static int z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f1021e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f1020d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1021e = true;
        }
        Field field = f1020d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void z0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f1022f == null) {
            f1022f = new WeakHashMap<>();
        }
        f1022f.put(view, str);
    }
}
