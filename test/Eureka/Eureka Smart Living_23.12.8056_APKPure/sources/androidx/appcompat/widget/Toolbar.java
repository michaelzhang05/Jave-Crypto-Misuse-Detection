package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.a0 {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList D;
    private final ArrayList E;
    private final int[] F;
    final androidx.core.view.b0 G;
    private ArrayList H;
    private final ActionMenuView.e I;
    private h3 J;
    private androidx.appcompat.widget.c K;
    private f L;
    private m.a M;
    g.a N;
    private boolean O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private boolean R;
    private final Runnable S;

    /* renamed from: a, reason: collision with root package name */
    ActionMenuView f863a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f864b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f865c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f866d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f867e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f868f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f869g;

    /* renamed from: h, reason: collision with root package name */
    ImageButton f870h;

    /* renamed from: i, reason: collision with root package name */
    View f871i;

    /* renamed from: j, reason: collision with root package name */
    private Context f872j;

    /* renamed from: k, reason: collision with root package name */
    private int f873k;

    /* renamed from: l, reason: collision with root package name */
    private int f874l;

    /* renamed from: m, reason: collision with root package name */
    private int f875m;

    /* renamed from: n, reason: collision with root package name */
    int f876n;

    /* renamed from: o, reason: collision with root package name */
    private int f877o;

    /* renamed from: p, reason: collision with root package name */
    private int f878p;

    /* renamed from: q, reason: collision with root package name */
    private int f879q;

    /* renamed from: r, reason: collision with root package name */
    private int f880r;

    /* renamed from: s, reason: collision with root package name */
    private int f881s;

    /* renamed from: t, reason: collision with root package name */
    private u2 f882t;

    /* renamed from: u, reason: collision with root package name */
    private int f883u;

    /* renamed from: v, reason: collision with root package name */
    private int f884v;

    /* renamed from: w, reason: collision with root package name */
    private int f885w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f886x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f887y;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f888z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.d(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.N;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f863a.J()) {
                Toolbar.this.G.e(gVar);
            }
            g.a aVar = Toolbar.this.N;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {
        static OnBackInvokedDispatcher a(View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            return findOnBackInvokedDispatcher;
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.g3
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            androidx.activity.n.a(obj).registerOnBackInvokedCallback(1000000, androidx.activity.o.a(obj2));
        }

        static void d(Object obj, Object obj2) {
            androidx.activity.n.a(obj).unregisterOnBackInvokedCallback(androidx.activity.o.a(obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.m {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.g f893a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.i f894b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(androidx.appcompat.view.menu.g gVar, boolean z5) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void d(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f893a;
            if (gVar2 != null && (iVar = this.f894b) != null) {
                gVar2.f(iVar);
            }
            this.f893a = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.f871i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f871i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f870h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f871i = null;
            toolbar3.a();
            this.f894b = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.i();
            ViewParent parent = Toolbar.this.f870h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f870h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f870h);
            }
            Toolbar.this.f871i = iVar.getActionView();
            this.f894b = iVar;
            ViewParent parent2 = Toolbar.this.f871i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f871i);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f274a = (toolbar4.f876n & 112) | 8388611;
                generateDefaultLayoutParams.f896b = 2;
                toolbar4.f871i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f871i);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f871i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean i(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void j(boolean z5) {
            if (this.f894b != null) {
                androidx.appcompat.view.menu.g gVar = this.f893a;
                boolean z6 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        }
                        if (this.f893a.getItem(i6) == this.f894b) {
                            z6 = true;
                            break;
                        }
                        i6++;
                    }
                }
                if (z6) {
                    return;
                }
                e(this.f893a, this.f894b);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0008a {

        /* renamed from: b, reason: collision with root package name */
        int f896b;

        public g(int i6, int i7) {
            super(i6, i7);
            this.f896b = 0;
            this.f274a = 8388627;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f896b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f896b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f896b = 0;
            a(marginLayoutParams);
        }

        public g(a.C0008a c0008a) {
            super(c0008a);
            this.f896b = 0;
        }

        public g(g gVar) {
            super((a.C0008a) gVar);
            this.f896b = 0;
            this.f896b = gVar.f896b;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    /* loaded from: classes.dex */
    public static class i extends x.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f897c;

        /* renamed from: d, reason: collision with root package name */
        boolean f898d;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i6) {
                return new i[i6];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f897c = parcel.readInt();
            this.f898d = parcel.readInt() != 0;
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f897c);
            parcel.writeInt(this.f898d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.K);
    }

    private boolean B(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    private int E(View view, int i6, int[] iArr, int i7) {
        g gVar = (g) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i6 + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        int s5 = s(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, s5, max + measuredWidth, view.getMeasuredHeight() + s5);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int F(View view, int i6, int[] iArr, int i7) {
        g gVar = (g) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i6 - Math.max(0, i8);
        iArr[1] = Math.max(0, -i8);
        int s5 = s(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, s5, max, view.getMeasuredHeight() + s5);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int G(View view, int i6, int i7, int i8, int i9, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i10) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + max + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void H(View view, int i6, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    private void J() {
        removeCallbacks(this.S);
        post(this.S);
    }

    private boolean P() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i6) {
        boolean z5 = androidx.core.view.b1.E(this) == 1;
        int childCount = getChildCount();
        int b6 = androidx.core.view.w.b(i6, androidx.core.view.b1.E(this));
        list.clear();
        if (!z5) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f896b == 0 && Q(childAt) && r(gVar.f274a) == b6) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            View childAt2 = getChildAt(i8);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f896b == 0 && Q(childAt2) && r(gVar2.f274a) == b6) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f896b = 1;
        if (!z5 || this.f871i == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.E.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i6 = 0; i6 < menu.size(); i6++) {
            arrayList.add(menu.getItem(i6));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void j() {
        if (this.f882t == null) {
            this.f882t = new u2();
        }
    }

    private void k() {
        if (this.f867e == null) {
            this.f867e = new r(getContext());
        }
    }

    private void l() {
        m();
        if (this.f863a.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f863a.getMenu();
            if (this.L == null) {
                this.L = new f();
            }
            this.f863a.setExpandedActionViewsExclusive(true);
            gVar.c(this.L, this.f872j);
            S();
        }
    }

    private void m() {
        if (this.f863a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f863a = actionMenuView;
            actionMenuView.setPopupTheme(this.f873k);
            this.f863a.setOnMenuItemClickListener(this.I);
            this.f863a.O(this.M, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f274a = (this.f876n & 112) | 8388613;
            this.f863a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f863a, false);
        }
    }

    private void n() {
        if (this.f866d == null) {
            this.f866d = new p(getContext(), null, d.a.J);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f274a = (this.f876n & 112) | 8388611;
            this.f866d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int r(int i6) {
        int E = androidx.core.view.b1.E(this);
        int b6 = androidx.core.view.w.b(i6, E) & 7;
        return (b6 == 1 || b6 == 3 || b6 == 5) ? b6 : E == 1 ? 5 : 3;
    }

    private int s(View view, int i6) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i6 > 0 ? (measuredHeight - i6) / 2 : 0;
        int t5 = t(gVar.f274a);
        if (t5 == 48) {
            return getPaddingTop() - i7;
        }
        if (t5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i7;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i8 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i8 < i9) {
            i8 = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - i8) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i10 < i11) {
                i8 = Math.max(0, i8 - (i11 - i10));
            }
        }
        return paddingTop + i8;
    }

    private int t(int i6) {
        int i7 = i6 & 112;
        return (i7 == 16 || i7 == 48 || i7 == 80) ? i7 : this.f885w & 112;
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.z.b(marginLayoutParams) + androidx.core.view.z.a(marginLayoutParams);
    }

    private int v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int w(List list, int[] iArr) {
        int i6 = iArr[0];
        int i7 = iArr[1];
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            View view = (View) list.get(i8);
            g gVar = (g) view.getLayoutParams();
            int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i6;
            int i11 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i7;
            int max = Math.max(0, i10);
            int max2 = Math.max(0, i11);
            int max3 = Math.max(0, -i10);
            int max4 = Math.max(0, -i11);
            i9 += max + view.getMeasuredWidth() + max2;
            i8++;
            i7 = max4;
            i6 = max3;
        }
        return i9;
    }

    public void A() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        I();
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f863a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.f863a;
        return actionMenuView != null && actionMenuView.J();
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f896b != 2 && childAt != this.f863a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void L(int i6, int i7) {
        j();
        this.f882t.g(i6, i7);
    }

    public void M(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f863a == null) {
            return;
        }
        m();
        androidx.appcompat.view.menu.g N = this.f863a.N();
        if (N == gVar) {
            return;
        }
        if (N != null) {
            N.O(this.K);
            N.O(this.L);
        }
        if (this.L == null) {
            this.L = new f();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.f872j);
            gVar.c(this.L, this.f872j);
        } else {
            cVar.d(this.f872j, null);
            this.L.d(this.f872j, null);
            cVar.j(true);
            this.L.j(true);
        }
        this.f863a.setPopupTheme(this.f873k);
        this.f863a.setPresenter(cVar);
        this.K = cVar;
        S();
    }

    public void N(Context context, int i6) {
        this.f875m = i6;
        TextView textView = this.f865c;
        if (textView != null) {
            textView.setTextAppearance(context, i6);
        }
    }

    public void O(Context context, int i6) {
        this.f874l = i6;
        TextView textView = this.f864b;
        if (textView != null) {
            textView.setTextAppearance(context, i6);
        }
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f863a;
        return actionMenuView != null && actionMenuView.P();
    }

    void S() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a6 = e.a(this);
            boolean z5 = x() && a6 != null && androidx.core.view.b1.T(this) && this.R;
            if (z5 && this.Q == null) {
                if (this.P == null) {
                    this.P = e.b(new Runnable() { // from class: androidx.appcompat.widget.e3
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.e();
                        }
                    });
                }
                e.c(a6, this.P);
            } else {
                if (z5 || (onBackInvokedDispatcher = this.Q) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.P);
                a6 = null;
            }
            this.Q = a6;
        }
    }

    void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView((View) this.E.get(size));
        }
        this.E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f863a) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.L;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f894b;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    @Override // androidx.core.view.a0
    public void f(androidx.core.view.q0 q0Var) {
        this.G.f(q0Var);
    }

    @Override // androidx.core.view.a0
    public void g(androidx.core.view.q0 q0Var) {
        this.G.a(q0Var);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f870h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f870h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        u2 u2Var = this.f882t;
        if (u2Var != null) {
            return u2Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i6 = this.f884v;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        u2 u2Var = this.f882t;
        if (u2Var != null) {
            return u2Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        u2 u2Var = this.f882t;
        if (u2Var != null) {
            return u2Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        u2 u2Var = this.f882t;
        if (u2Var != null) {
            return u2Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i6 = this.f883u;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g N;
        ActionMenuView actionMenuView = this.f863a;
        return actionMenuView != null && (N = actionMenuView.N()) != null && N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f884v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.b1.E(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.b1.E(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f883u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f867e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f867e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        l();
        return this.f863a.getMenu();
    }

    View getNavButtonView() {
        return this.f866d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f866d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f866d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        l();
        return this.f863a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f872j;
    }

    public int getPopupTheme() {
        return this.f873k;
    }

    public CharSequence getSubtitle() {
        return this.f887y;
    }

    final TextView getSubtitleTextView() {
        return this.f865c;
    }

    public CharSequence getTitle() {
        return this.f886x;
    }

    public int getTitleMarginBottom() {
        return this.f881s;
    }

    public int getTitleMarginEnd() {
        return this.f879q;
    }

    public int getTitleMarginStart() {
        return this.f878p;
    }

    public int getTitleMarginTop() {
        return this.f880r;
    }

    final TextView getTitleTextView() {
        return this.f864b;
    }

    public b2 getWrapper() {
        if (this.J == null) {
            this.J = new h3(this, true);
        }
        return this.J;
    }

    public void h() {
        ActionMenuView actionMenuView = this.f863a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void i() {
        if (this.f870h == null) {
            p pVar = new p(getContext(), null, d.a.J);
            this.f870h = pVar;
            pVar.setImageDrawable(this.f868f);
            this.f870h.setContentDescription(this.f869g);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f274a = (this.f876n & 112) | 8388611;
            generateDefaultLayoutParams.f896b = 2;
            this.f870h.setLayoutParams(generateDefaultLayoutParams);
            this.f870h.setOnClickListener(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        S();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0295 A[LOOP:0: B:46:0x0293->B:47:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b7 A[LOOP:1: B:50:0x02b5->B:51:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f0 A[LOOP:2: B:59:0x02ee->B:60:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.F;
        boolean b6 = p3.b(this);
        int i15 = !b6 ? 1 : 0;
        if (Q(this.f866d)) {
            H(this.f866d, i6, 0, i7, 0, this.f877o);
            i8 = this.f866d.getMeasuredWidth() + u(this.f866d);
            i9 = Math.max(0, this.f866d.getMeasuredHeight() + v(this.f866d));
            i10 = View.combineMeasuredStates(0, this.f866d.getMeasuredState());
        } else {
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (Q(this.f870h)) {
            H(this.f870h, i6, 0, i7, 0, this.f877o);
            i8 = this.f870h.getMeasuredWidth() + u(this.f870h);
            i9 = Math.max(i9, this.f870h.getMeasuredHeight() + v(this.f870h));
            i10 = View.combineMeasuredStates(i10, this.f870h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i8);
        iArr[b6 ? 1 : 0] = Math.max(0, currentContentInsetStart - i8);
        if (Q(this.f863a)) {
            H(this.f863a, i6, max, i7, 0, this.f877o);
            i11 = this.f863a.getMeasuredWidth() + u(this.f863a);
            i9 = Math.max(i9, this.f863a.getMeasuredHeight() + v(this.f863a));
            i10 = View.combineMeasuredStates(i10, this.f863a.getMeasuredState());
        } else {
            i11 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i11);
        iArr[i15] = Math.max(0, currentContentInsetEnd - i11);
        if (Q(this.f871i)) {
            max2 += G(this.f871i, i6, max2, i7, 0, iArr);
            i9 = Math.max(i9, this.f871i.getMeasuredHeight() + v(this.f871i));
            i10 = View.combineMeasuredStates(i10, this.f871i.getMeasuredState());
        }
        if (Q(this.f867e)) {
            max2 += G(this.f867e, i6, max2, i7, 0, iArr);
            i9 = Math.max(i9, this.f867e.getMeasuredHeight() + v(this.f867e));
            i10 = View.combineMeasuredStates(i10, this.f867e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((g) childAt.getLayoutParams()).f896b == 0 && Q(childAt)) {
                max2 += G(childAt, i6, max2, i7, 0, iArr);
                i9 = Math.max(i9, childAt.getMeasuredHeight() + v(childAt));
                i10 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
            }
        }
        int i17 = this.f880r + this.f881s;
        int i18 = this.f878p + this.f879q;
        if (Q(this.f864b)) {
            G(this.f864b, i6, max2 + i18, i7, i17, iArr);
            int measuredWidth = this.f864b.getMeasuredWidth() + u(this.f864b);
            i14 = this.f864b.getMeasuredHeight() + v(this.f864b);
            i12 = View.combineMeasuredStates(i10, this.f864b.getMeasuredState());
            i13 = measuredWidth;
        } else {
            i12 = i10;
            i13 = 0;
            i14 = 0;
        }
        if (Q(this.f865c)) {
            i13 = Math.max(i13, G(this.f865c, i6, max2 + i18, i7, i14 + i17, iArr));
            i14 += this.f865c.getMeasuredHeight() + v(this.f865c);
            i12 = View.combineMeasuredStates(i12, this.f865c.getMeasuredState());
        }
        int max3 = Math.max(i9, i14);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i13 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, (-16777216) & i12), P() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i7, i12 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f863a;
        androidx.appcompat.view.menu.g N = actionMenuView != null ? actionMenuView.N() : null;
        int i6 = iVar.f897c;
        if (i6 != 0 && this.L != null && N != null && (findItem = N.findItem(i6)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f898d) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        j();
        this.f882t.f(i6 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.L;
        if (fVar != null && (iVar = fVar.f894b) != null) {
            iVar2.f897c = iVar.getItemId();
        }
        iVar2.f898d = D();
        return iVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0008a ? new g((a.C0008a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.R != z5) {
            this.R = z5;
            S();
        }
    }

    public void setCollapseContentDescription(int i6) {
        setCollapseContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setCollapseIcon(int i6) {
        setCollapseIcon(e.a.b(getContext(), i6));
    }

    public void setCollapsible(boolean z5) {
        this.O = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.f884v) {
            this.f884v = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.f883u) {
            this.f883u = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i6) {
        setLogo(e.a.b(getContext(), i6));
    }

    public void setLogoDescription(int i6) {
        setLogoDescription(getContext().getText(i6));
    }

    public void setNavigationContentDescription(int i6) {
        setNavigationContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setNavigationIcon(int i6) {
        setNavigationIcon(e.a.b(getContext(), i6));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        n();
        this.f866d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        l();
        this.f863a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i6) {
        if (this.f873k != i6) {
            this.f873k = i6;
            if (i6 == 0) {
                this.f872j = getContext();
            } else {
                this.f872j = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setSubtitle(int i6) {
        setSubtitle(getContext().getText(i6));
    }

    public void setSubtitleTextColor(int i6) {
        setSubtitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setTitle(int i6) {
        setTitle(getContext().getText(i6));
    }

    public void setTitleMarginBottom(int i6) {
        this.f881s = i6;
        requestLayout();
    }

    public void setTitleMarginEnd(int i6) {
        this.f879q = i6;
        requestLayout();
    }

    public void setTitleMarginStart(int i6) {
        this.f878p = i6;
        requestLayout();
    }

    public void setTitleMarginTop(int i6) {
        this.f880r = i6;
        requestLayout();
    }

    public void setTitleTextColor(int i6) {
        setTitleTextColor(ColorStateList.valueOf(i6));
    }

    public boolean x() {
        f fVar = this.L;
        return (fVar == null || fVar.f894b == null) ? false : true;
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f863a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void z(int i6) {
        getMenuInflater().inflate(i6, getMenu());
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f885w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new androidx.core.view.b0(new Runnable() { // from class: androidx.appcompat.widget.d3
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.A();
            }
        });
        this.H = new ArrayList();
        this.I = new a();
        this.S = new b();
        c3 v5 = c3.v(getContext(), attributeSet, d.j.R2, i6, 0);
        androidx.core.view.b1.o0(this, context, d.j.R2, attributeSet, v5.r(), i6, 0);
        this.f874l = v5.n(d.j.f6349t3, 0);
        this.f875m = v5.n(d.j.f6304k3, 0);
        this.f885w = v5.l(d.j.S2, this.f885w);
        this.f876n = v5.l(d.j.T2, 48);
        int e6 = v5.e(d.j.f6319n3, 0);
        e6 = v5.s(d.j.f6344s3) ? v5.e(d.j.f6344s3, e6) : e6;
        this.f881s = e6;
        this.f880r = e6;
        this.f879q = e6;
        this.f878p = e6;
        int e7 = v5.e(d.j.f6334q3, -1);
        if (e7 >= 0) {
            this.f878p = e7;
        }
        int e8 = v5.e(d.j.f6329p3, -1);
        if (e8 >= 0) {
            this.f879q = e8;
        }
        int e9 = v5.e(d.j.f6339r3, -1);
        if (e9 >= 0) {
            this.f880r = e9;
        }
        int e10 = v5.e(d.j.f6324o3, -1);
        if (e10 >= 0) {
            this.f881s = e10;
        }
        this.f877o = v5.f(d.j.f6274e3, -1);
        int e11 = v5.e(d.j.f6254a3, Integer.MIN_VALUE);
        int e12 = v5.e(d.j.W2, Integer.MIN_VALUE);
        int f6 = v5.f(d.j.Y2, 0);
        int f7 = v5.f(d.j.Z2, 0);
        j();
        this.f882t.e(f6, f7);
        if (e11 != Integer.MIN_VALUE || e12 != Integer.MIN_VALUE) {
            this.f882t.g(e11, e12);
        }
        this.f883u = v5.e(d.j.f6259b3, Integer.MIN_VALUE);
        this.f884v = v5.e(d.j.X2, Integer.MIN_VALUE);
        this.f868f = v5.g(d.j.V2);
        this.f869g = v5.p(d.j.U2);
        CharSequence p6 = v5.p(d.j.f6314m3);
        if (!TextUtils.isEmpty(p6)) {
            setTitle(p6);
        }
        CharSequence p7 = v5.p(d.j.f6299j3);
        if (!TextUtils.isEmpty(p7)) {
            setSubtitle(p7);
        }
        this.f872j = getContext();
        setPopupTheme(v5.n(d.j.f6294i3, 0));
        Drawable g6 = v5.g(d.j.f6289h3);
        if (g6 != null) {
            setNavigationIcon(g6);
        }
        CharSequence p8 = v5.p(d.j.f6284g3);
        if (!TextUtils.isEmpty(p8)) {
            setNavigationContentDescription(p8);
        }
        Drawable g7 = v5.g(d.j.f6264c3);
        if (g7 != null) {
            setLogo(g7);
        }
        CharSequence p9 = v5.p(d.j.f6269d3);
        if (!TextUtils.isEmpty(p9)) {
            setLogoDescription(p9);
        }
        if (v5.s(d.j.f6354u3)) {
            setTitleTextColor(v5.c(d.j.f6354u3));
        }
        if (v5.s(d.j.f6309l3)) {
            setSubtitleTextColor(v5.c(d.j.f6309l3));
        }
        if (v5.s(d.j.f6279f3)) {
            z(v5.n(d.j.f6279f3, 0));
        }
        v5.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageButton imageButton = this.f870h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            i();
            this.f870h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f870h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f868f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            k();
            if (!B(this.f867e)) {
                c(this.f867e, true);
            }
        } else {
            ImageView imageView = this.f867e;
            if (imageView != null && B(imageView)) {
                removeView(this.f867e);
                this.E.remove(this.f867e);
            }
        }
        ImageView imageView2 = this.f867e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            k();
        }
        ImageView imageView = this.f867e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            n();
        }
        ImageButton imageButton = this.f866d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            j3.a(this.f866d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            n();
            if (!B(this.f866d)) {
                c(this.f866d, true);
            }
        } else {
            ImageButton imageButton = this.f866d;
            if (imageButton != null && B(imageButton)) {
                removeView(this.f866d);
                this.E.remove(this.f866d);
            }
        }
        ImageButton imageButton2 = this.f866d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f865c;
            if (textView != null && B(textView)) {
                removeView(this.f865c);
                this.E.remove(this.f865c);
            }
        } else {
            if (this.f865c == null) {
                Context context = getContext();
                k1 k1Var = new k1(context);
                this.f865c = k1Var;
                k1Var.setSingleLine();
                this.f865c.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.f875m;
                if (i6 != 0) {
                    this.f865c.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f865c.setTextColor(colorStateList);
                }
            }
            if (!B(this.f865c)) {
                c(this.f865c, true);
            }
        }
        TextView textView2 = this.f865c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f887y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f865c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f864b;
            if (textView != null && B(textView)) {
                removeView(this.f864b);
                this.E.remove(this.f864b);
            }
        } else {
            if (this.f864b == null) {
                Context context = getContext();
                k1 k1Var = new k1(context);
                this.f864b = k1Var;
                k1Var.setSingleLine();
                this.f864b.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.f874l;
                if (i6 != 0) {
                    this.f864b.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.f888z;
                if (colorStateList != null) {
                    this.f864b.setTextColor(colorStateList);
                }
            }
            if (!B(this.f864b)) {
                c(this.f864b, true);
            }
        }
        TextView textView2 = this.f864b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f886x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f888z = colorStateList;
        TextView textView = this.f864b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
