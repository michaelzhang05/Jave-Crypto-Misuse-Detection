package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d2 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f978a;

    /* renamed from: b, reason: collision with root package name */
    private int f979b;

    /* renamed from: c, reason: collision with root package name */
    private int f980c;

    /* renamed from: d, reason: collision with root package name */
    private int f981d;

    /* renamed from: e, reason: collision with root package name */
    private int f982e;

    /* renamed from: f, reason: collision with root package name */
    private int f983f;

    /* renamed from: g, reason: collision with root package name */
    private d f984g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f985h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f986i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f987j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.core.view.w2 f988k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.core.widget.k f989l;

    /* renamed from: m, reason: collision with root package name */
    f f990m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(View view, float f6, float f7) {
            view.drawableHotspotChanged(f6, f7);
        }
    }

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f991a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f992b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f993c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f994d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f991a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f992b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f993c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f994d = true;
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            }
        }

        static boolean a() {
            return f994d;
        }

        static void b(d2 d2Var, int i6, View view) {
            try {
                f991a.invoke(d2Var, Integer.valueOf(i6), view, Boolean.FALSE, -1, -1);
                f992b.invoke(d2Var, Integer.valueOf(i6));
                f993c.invoke(d2Var, Integer.valueOf(i6));
            } catch (IllegalAccessException | InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static boolean a(AbsListView absListView) {
            boolean isSelectedChildViewEnabled;
            isSelectedChildViewEnabled = absListView.isSelectedChildViewEnabled();
            return isSelectedChildViewEnabled;
        }

        static void b(AbsListView absListView, boolean z5) {
            absListView.setSelectedChildViewEnabled(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends f.c {

        /* renamed from: b, reason: collision with root package name */
        private boolean f995b;

        d(Drawable drawable) {
            super(drawable);
            this.f995b = true;
        }

        void b(boolean z5) {
            this.f995b = z5;
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f995b) {
                super.draw(canvas);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public void setHotspot(float f6, float f7) {
            if (this.f995b) {
                super.setHotspot(f6, f7);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i6, int i7, int i8, int i9) {
            if (this.f995b) {
                super.setHotspotBounds(i6, i7, i8, i9);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f995b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z5, boolean z6) {
            if (this.f995b) {
                return super.setVisible(z5, z6);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f996a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                e6.printStackTrace();
            }
            f996a = field;
        }

        static boolean a(AbsListView absListView) {
            Field field = f996a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z5) {
            Field field = f996a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z5));
                } catch (IllegalAccessException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        public void a() {
            d2 d2Var = d2.this;
            d2Var.f990m = null;
            d2Var.removeCallbacks(this);
        }

        public void b() {
            d2.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d2 d2Var = d2.this;
            d2Var.f990m = null;
            d2Var.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d2(Context context, boolean z5) {
        super(context, null, d.a.f6137x);
        this.f978a = new Rect();
        this.f979b = 0;
        this.f980c = 0;
        this.f981d = 0;
        this.f982e = 0;
        this.f986i = z5;
        setCacheColorHint(0);
    }

    private void a() {
        this.f987j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f983f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.w2 w2Var = this.f988k;
        if (w2Var != null) {
            w2Var.c();
            this.f988k = null;
        }
    }

    private void b(View view, int i6) {
        performItemClick(view, i6, getItemIdAtPosition(i6));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f978a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f978a);
        selector.draw(canvas);
    }

    private void f(int i6, View view) {
        Rect rect = this.f978a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f979b;
        rect.top -= this.f980c;
        rect.right += this.f981d;
        rect.bottom += this.f982e;
        boolean k6 = k();
        if (view.isEnabled() != k6) {
            l(!k6);
            if (i6 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i6, View view) {
        Drawable selector = getSelector();
        boolean z5 = (selector == null || i6 == -1) ? false : true;
        if (z5) {
            selector.setVisible(false, false);
        }
        f(i6, view);
        if (z5) {
            Rect rect = this.f978a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i6, View view, float f6, float f7) {
        g(i6, view);
        Drawable selector = getSelector();
        if (selector == null || i6 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.k(selector, f6, f7);
    }

    private void i(View view, int i6, float f6, float f7) {
        View childAt;
        this.f987j = true;
        a.a(this, f6, f7);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i7 = this.f983f;
        if (i7 != -1 && (childAt = getChildAt(i7 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f983f = i6;
        a.a(view, f6 - view.getLeft(), f7 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i6, view, f6, f7);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z5) {
        d dVar = this.f984g;
        if (dVar != null) {
            dVar.b(z5);
        }
    }

    private boolean k() {
        return androidx.core.os.b.c() ? c.a(this) : e.a(this);
    }

    private void l(boolean z5) {
        if (androidx.core.os.b.c()) {
            c.b(this, z5);
        } else {
            e.b(this, z5);
        }
    }

    private boolean m() {
        return this.f987j;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i6, int i7, int i8, int i9, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i11 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i11;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < count) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i6, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i9) {
                return (i10 < 0 || i12 <= i10 || i14 <= 0 || i11 == i9) ? i9 : i14;
            }
            if (i10 >= 0 && i12 >= i10) {
                i14 = i11;
            }
            i12++;
        }
        return i11;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f990m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.k r9 = r7.f989l
            if (r9 != 0) goto L5a
            androidx.core.widget.k r9 = new androidx.core.widget.k
            r9.<init>(r7)
            r7.f989l = r9
        L5a:
            androidx.core.widget.k r9 = r7.f989l
            r9.m(r1)
            androidx.core.widget.k r9 = r7.f989l
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.k r8 = r7.f989l
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d2.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f986i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f986i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f986i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f986i && this.f985h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f990m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f990m == null) {
            f fVar = new f();
            this.f990m = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i6 < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f983f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f990m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z5) {
        this.f985h = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f984g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f979b = rect.left;
        this.f980c = rect.top;
        this.f981d = rect.right;
        this.f982e = rect.bottom;
    }
}
