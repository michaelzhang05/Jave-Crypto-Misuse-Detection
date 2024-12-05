package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class d0 implements androidx.appcompat.view.menu.p {

    /* renamed from: f, reason: collision with root package name */
    private static Method f467f;

    /* renamed from: g, reason: collision with root package name */
    private static Method f468g;

    /* renamed from: h, reason: collision with root package name */
    private static Method f469h;
    private View A;
    private Drawable B;
    private AdapterView.OnItemClickListener C;
    private AdapterView.OnItemSelectedListener D;
    final g E;
    private final f F;
    private final e G;
    private final c H;
    private Runnable I;
    final Handler J;
    private final Rect K;
    private Rect L;
    private boolean M;
    PopupWindow N;

    /* renamed from: i, reason: collision with root package name */
    private Context f470i;

    /* renamed from: j, reason: collision with root package name */
    private ListAdapter f471j;

    /* renamed from: k, reason: collision with root package name */
    z f472k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    int w;
    private View x;
    private int y;
    private DataSetObserver z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View s = d0.this.s();
            if (s == null || s.getWindowToken() == null) {
                return;
            }
            d0.this.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            z zVar;
            if (i2 == -1 || (zVar = d0.this.f472k) == null) {
                return;
            }
            zVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (d0.this.a()) {
                d0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            d0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || d0.this.z() || d0.this.N.getContentView() == null) {
                return;
            }
            d0 d0Var = d0.this;
            d0Var.J.removeCallbacks(d0Var.E);
            d0.this.E.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = d0.this.N) != null && popupWindow.isShowing() && x >= 0 && x < d0.this.N.getWidth() && y >= 0 && y < d0.this.N.getHeight()) {
                d0 d0Var = d0.this;
                d0Var.J.postDelayed(d0Var.E, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            d0 d0Var2 = d0.this;
            d0Var2.J.removeCallbacks(d0Var2.E);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z zVar = d0.this.f472k;
            if (zVar == null || !androidx.core.view.u.N(zVar) || d0.this.f472k.getCount() <= d0.this.f472k.getChildCount()) {
                return;
            }
            int childCount = d0.this.f472k.getChildCount();
            d0 d0Var = d0.this;
            if (childCount <= d0Var.w) {
                d0Var.N.setInputMethodMode(2);
                d0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f467f = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f469h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f468g = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public d0(Context context) {
        this(context, null, c.a.a.E);
    }

    private void B() {
        View view = this.x;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.x);
            }
        }
    }

    private void M(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f467f;
            if (method != null) {
                try {
                    method.invoke(this.N, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.N.setIsClippedToScreen(z);
    }

    private int p() {
        int i2;
        int i3;
        int makeMeasureSpec;
        int i4;
        if (this.f472k == null) {
            Context context = this.f470i;
            this.I = new a();
            z r = r(context, !this.M);
            this.f472k = r;
            Drawable drawable = this.B;
            if (drawable != null) {
                r.setSelector(drawable);
            }
            this.f472k.setAdapter(this.f471j);
            this.f472k.setOnItemClickListener(this.C);
            this.f472k.setFocusable(true);
            this.f472k.setFocusableInTouchMode(true);
            this.f472k.setOnItemSelectedListener(new b());
            this.f472k.setOnScrollListener(this.G);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.D;
            if (onItemSelectedListener != null) {
                this.f472k.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f472k;
            View view2 = this.x;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.y;
                if (i5 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.y);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i6 = this.m;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i2 = 0;
            }
            this.N.setContentView(view);
        } else {
            View view3 = this.x;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i2 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.N.getBackground();
        if (background != null) {
            background.getPadding(this.K);
            Rect rect = this.K;
            int i7 = rect.top;
            i3 = rect.bottom + i7;
            if (!this.q) {
                this.o = -i7;
            }
        } else {
            this.K.setEmpty();
            i3 = 0;
        }
        int t = t(s(), this.o, this.N.getInputMethodMode() == 2);
        if (this.u || this.l == -1) {
            return t + i3;
        }
        int i8 = this.m;
        if (i8 == -2) {
            int i9 = this.f470i.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.K;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i8 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.f470i.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.K;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int d2 = this.f472k.d(makeMeasureSpec, 0, -1, t - i2, -1);
        if (d2 > 0) {
            i2 += i3 + this.f472k.getPaddingTop() + this.f472k.getPaddingBottom();
        }
        return d2 + i2;
    }

    private int t(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f468g;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.N, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.N.getMaxAvailableHeight(view, i2);
        }
        return this.N.getMaxAvailableHeight(view, i2, z);
    }

    public boolean A() {
        return this.M;
    }

    public void C(View view) {
        this.A = view;
    }

    public void D(int i2) {
        this.N.setAnimationStyle(i2);
    }

    public void E(int i2) {
        Drawable background = this.N.getBackground();
        if (background != null) {
            background.getPadding(this.K);
            Rect rect = this.K;
            this.m = rect.left + rect.right + i2;
            return;
        }
        P(i2);
    }

    public void F(int i2) {
        this.t = i2;
    }

    public void G(Rect rect) {
        this.L = rect != null ? new Rect(rect) : null;
    }

    public void H(int i2) {
        this.N.setInputMethodMode(i2);
    }

    public void I(boolean z) {
        this.M = z;
        this.N.setFocusable(z);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.N.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.C = onItemClickListener;
    }

    public void L(boolean z) {
        this.s = true;
        this.r = z;
    }

    public void N(int i2) {
        this.y = i2;
    }

    public void O(int i2) {
        z zVar = this.f472k;
        if (!a() || zVar == null) {
            return;
        }
        zVar.setListSelectionHidden(false);
        zVar.setSelection(i2);
        if (zVar.getChoiceMode() != 0) {
            zVar.setItemChecked(i2, true);
        }
    }

    public void P(int i2) {
        this.m = i2;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.N.isShowing();
    }

    public void b(Drawable drawable) {
        this.N.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.n;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.N.dismiss();
        B();
        this.N.setContentView(null);
        this.f472k = null;
        this.J.removeCallbacks(this.E);
    }

    public void e(int i2) {
        this.n = i2;
    }

    public Drawable h() {
        return this.N.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.f472k;
    }

    public void k(int i2) {
        this.o = i2;
        this.q = true;
    }

    public int n() {
        if (this.q) {
            return this.o;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.z;
        if (dataSetObserver == null) {
            this.z = new d();
        } else {
            ListAdapter listAdapter2 = this.f471j;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f471j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.z);
        }
        z zVar = this.f472k;
        if (zVar != null) {
            zVar.setAdapter(this.f471j);
        }
    }

    public void q() {
        z zVar = this.f472k;
        if (zVar != null) {
            zVar.setListSelectionHidden(true);
            zVar.requestLayout();
        }
    }

    z r(Context context, boolean z) {
        return new z(context, z);
    }

    public View s() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        int p = p();
        boolean z = z();
        androidx.core.widget.j.b(this.N, this.p);
        if (this.N.isShowing()) {
            if (androidx.core.view.u.N(s())) {
                int i2 = this.m;
                if (i2 == -1) {
                    i2 = -1;
                } else if (i2 == -2) {
                    i2 = s().getWidth();
                }
                int i3 = this.l;
                if (i3 == -1) {
                    if (!z) {
                        p = -1;
                    }
                    if (z) {
                        this.N.setWidth(this.m == -1 ? -1 : 0);
                        this.N.setHeight(0);
                    } else {
                        this.N.setWidth(this.m == -1 ? -1 : 0);
                        this.N.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    p = i3;
                }
                this.N.setOutsideTouchable((this.v || this.u) ? false : true);
                this.N.update(s(), this.n, this.o, i2 < 0 ? -1 : i2, p < 0 ? -1 : p);
                return;
            }
            return;
        }
        int i4 = this.m;
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = s().getWidth();
        }
        int i5 = this.l;
        if (i5 == -1) {
            p = -1;
        } else if (i5 != -2) {
            p = i5;
        }
        this.N.setWidth(i4);
        this.N.setHeight(p);
        M(true);
        this.N.setOutsideTouchable((this.v || this.u) ? false : true);
        this.N.setTouchInterceptor(this.F);
        if (this.s) {
            androidx.core.widget.j.a(this.N, this.r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f469h;
            if (method != null) {
                try {
                    method.invoke(this.N, this.L);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.N.setEpicenterBounds(this.L);
        }
        androidx.core.widget.j.c(this.N, s(), this.n, this.o, this.t);
        this.f472k.setSelection(-1);
        if (!this.M || this.f472k.isInTouchMode()) {
            q();
        }
        if (this.M) {
            return;
        }
        this.J.post(this.H);
    }

    public Object u() {
        if (a()) {
            return this.f472k.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f472k.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f472k.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f472k.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.m;
    }

    public boolean z() {
        return this.N.getInputMethodMode() == 2;
    }

    public d0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public d0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.l = -2;
        this.m = -2;
        this.p = 1002;
        this.t = 0;
        this.u = false;
        this.v = false;
        this.w = Integer.MAX_VALUE;
        this.y = 0;
        this.E = new g();
        this.F = new f();
        this.G = new e();
        this.H = new c();
        this.K = new Rect();
        this.f470i = context;
        this.J = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.j.o1, i2, i3);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(c.a.j.p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(c.a.j.q1, 0);
        this.o = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.q = true;
        }
        obtainStyledAttributes.recycle();
        n nVar = new n(context, attributeSet, i2, i3);
        this.N = nVar;
        nVar.setInputMethodMode(1);
    }
}
