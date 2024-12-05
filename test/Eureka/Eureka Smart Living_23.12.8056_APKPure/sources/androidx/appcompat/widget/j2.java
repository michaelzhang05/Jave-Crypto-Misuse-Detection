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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j2 implements androidx.appcompat.view.menu.p {
    private static Method G;
    private static Method H;
    private static Method I;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: a, reason: collision with root package name */
    private Context f1078a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f1079b;

    /* renamed from: c, reason: collision with root package name */
    d2 f1080c;

    /* renamed from: d, reason: collision with root package name */
    private int f1081d;

    /* renamed from: e, reason: collision with root package name */
    private int f1082e;

    /* renamed from: f, reason: collision with root package name */
    private int f1083f;

    /* renamed from: g, reason: collision with root package name */
    private int f1084g;

    /* renamed from: h, reason: collision with root package name */
    private int f1085h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1086i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1087j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1088k;

    /* renamed from: l, reason: collision with root package name */
    private int f1089l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1090m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1091n;

    /* renamed from: o, reason: collision with root package name */
    int f1092o;

    /* renamed from: p, reason: collision with root package name */
    private View f1093p;

    /* renamed from: q, reason: collision with root package name */
    private int f1094q;

    /* renamed from: r, reason: collision with root package name */
    private DataSetObserver f1095r;

    /* renamed from: s, reason: collision with root package name */
    private View f1096s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f1097t;

    /* renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1098u;

    /* renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1099v;

    /* renamed from: w, reason: collision with root package name */
    final i f1100w;

    /* renamed from: x, reason: collision with root package name */
    private final h f1101x;

    /* renamed from: y, reason: collision with root package name */
    private final g f1102y;

    /* renamed from: z, reason: collision with root package name */
    private final e f1103z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t5 = j2.this.t();
            if (t5 == null || t5.getWindowToken() == null) {
                return;
            }
            j2.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i6, long j6) {
            d2 d2Var;
            if (i6 == -1 || (d2Var = j2.this.f1080c) == null) {
                return;
            }
            d2Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static int a(PopupWindow popupWindow, View view, int i6, boolean z5) {
            int maxAvailableHeight;
            maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i6, z5);
            return maxAvailableHeight;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z5) {
            popupWindow.setIsClippedToScreen(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j2.this.r();
        }
    }

    /* loaded from: classes.dex */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j2.this.b()) {
                j2.this.f();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j2.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i6, int i7, int i8) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i6) {
            if (i6 != 1 || j2.this.A() || j2.this.F.getContentView() == null) {
                return;
            }
            j2 j2Var = j2.this;
            j2Var.B.removeCallbacks(j2Var.f1100w);
            j2.this.f1100w.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j2.this.F) != null && popupWindow.isShowing() && x5 >= 0 && x5 < j2.this.F.getWidth() && y5 >= 0 && y5 < j2.this.F.getHeight()) {
                j2 j2Var = j2.this;
                j2Var.B.postDelayed(j2Var.f1100w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            j2 j2Var2 = j2.this;
            j2Var2.B.removeCallbacks(j2Var2.f1100w);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d2 d2Var = j2.this.f1080c;
            if (d2Var == null || !androidx.core.view.b1.T(d2Var) || j2.this.f1080c.getCount() <= j2.this.f1080c.getChildCount()) {
                return;
            }
            int childCount = j2.this.f1080c.getChildCount();
            j2 j2Var = j2.this;
            if (childCount <= j2Var.f1092o) {
                j2Var.F.setInputMethodMode(2);
                j2.this.f();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j2(Context context) {
        this(context, null, d.a.B);
    }

    private void C() {
        View view = this.f1093p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1093p);
            }
        }
    }

    private void O(boolean z5) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z5);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z5));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j2.q():int");
    }

    private int u(View view, int i6, boolean z5) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.F, view, i6, z5);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i6), Boolean.valueOf(z5))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i6);
    }

    public boolean A() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.E;
    }

    public void D(View view) {
        this.f1096s = view;
    }

    public void E(int i6) {
        this.F.setAnimationStyle(i6);
    }

    public void F(int i6) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            R(i6);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f1082e = rect.left + rect.right + i6;
    }

    public void G(int i6) {
        this.f1089l = i6;
    }

    public void H(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i6) {
        this.F.setInputMethodMode(i6);
    }

    public void J(boolean z5) {
        this.E = z5;
        this.F.setFocusable(z5);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1098u = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1099v = onItemSelectedListener;
    }

    public void N(boolean z5) {
        this.f1088k = true;
        this.f1087j = z5;
    }

    public void P(int i6) {
        this.f1094q = i6;
    }

    public void Q(int i6) {
        d2 d2Var = this.f1080c;
        if (!b() || d2Var == null) {
            return;
        }
        d2Var.setListSelectionHidden(false);
        d2Var.setSelection(i6);
        if (d2Var.getChoiceMode() != 0) {
            d2Var.setItemChecked(i6, true);
        }
    }

    public void R(int i6) {
        this.f1082e = i6;
    }

    public void a(int i6) {
        this.f1083f = i6;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.F.isShowing();
    }

    public int c() {
        return this.f1083f;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.F.dismiss();
        C();
        this.F.setContentView(null);
        this.f1080c = null;
        this.B.removeCallbacks(this.f1100w);
    }

    @Override // androidx.appcompat.view.menu.p
    public void f() {
        int q6 = q();
        boolean A = A();
        androidx.core.widget.m.b(this.F, this.f1085h);
        if (this.F.isShowing()) {
            if (androidx.core.view.b1.T(t())) {
                int i6 = this.f1082e;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = t().getWidth();
                }
                int i7 = this.f1081d;
                if (i7 == -1) {
                    if (!A) {
                        q6 = -1;
                    }
                    if (A) {
                        this.F.setWidth(this.f1082e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f1082e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    q6 = i7;
                }
                this.F.setOutsideTouchable((this.f1091n || this.f1090m) ? false : true);
                this.F.update(t(), this.f1083f, this.f1084g, i6 < 0 ? -1 : i6, q6 < 0 ? -1 : q6);
                return;
            }
            return;
        }
        int i8 = this.f1082e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = t().getWidth();
        }
        int i9 = this.f1081d;
        if (i9 == -1) {
            q6 = -1;
        } else if (i9 != -2) {
            q6 = i9;
        }
        this.F.setWidth(i8);
        this.F.setHeight(q6);
        O(true);
        this.F.setOutsideTouchable((this.f1091n || this.f1090m) ? false : true);
        this.F.setTouchInterceptor(this.f1101x);
        if (this.f1088k) {
            androidx.core.widget.m.a(this.F, this.f1087j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        androidx.core.widget.m.c(this.F, t(), this.f1083f, this.f1084g, this.f1089l);
        this.f1080c.setSelection(-1);
        if (!this.E || this.f1080c.isInTouchMode()) {
            r();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f1103z);
    }

    public int g() {
        if (this.f1086i) {
            return this.f1084g;
        }
        return 0;
    }

    public Drawable i() {
        return this.F.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        return this.f1080c;
    }

    public void m(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void n(int i6) {
        this.f1084g = i6;
        this.f1086i = true;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1095r;
        if (dataSetObserver == null) {
            this.f1095r = new f();
        } else {
            ListAdapter listAdapter2 = this.f1079b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1079b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1095r);
        }
        d2 d2Var = this.f1080c;
        if (d2Var != null) {
            d2Var.setAdapter(this.f1079b);
        }
    }

    public void r() {
        d2 d2Var = this.f1080c;
        if (d2Var != null) {
            d2Var.setListSelectionHidden(true);
            d2Var.requestLayout();
        }
    }

    d2 s(Context context, boolean z5) {
        return new d2(context, z5);
    }

    public View t() {
        return this.f1096s;
    }

    public Object v() {
        if (b()) {
            return this.f1080c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (b()) {
            return this.f1080c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (b()) {
            return this.f1080c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (b()) {
            return this.f1080c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f1082e;
    }

    public j2(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public j2(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f1081d = -2;
        this.f1082e = -2;
        this.f1085h = 1002;
        this.f1089l = 0;
        this.f1090m = false;
        this.f1091n = false;
        this.f1092o = Integer.MAX_VALUE;
        this.f1094q = 0;
        this.f1100w = new i();
        this.f1101x = new h();
        this.f1102y = new g();
        this.f1103z = new e();
        this.C = new Rect();
        this.f1078a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f6307l1, i6, i7);
        this.f1083f = obtainStyledAttributes.getDimensionPixelOffset(d.j.f6312m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(d.j.f6317n1, 0);
        this.f1084g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1086i = true;
        }
        obtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i6, i7);
        this.F = tVar;
        tVar.setInputMethodMode(1);
    }
}
