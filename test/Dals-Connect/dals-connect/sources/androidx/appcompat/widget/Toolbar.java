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
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private CharSequence C;
    private CharSequence D;
    private ColorStateList E;
    private ColorStateList F;
    private boolean G;
    private boolean H;
    private final ArrayList<View> I;
    private final ArrayList<View> J;
    private final int[] K;
    f L;
    private final ActionMenuView.e M;
    private r0 N;
    private ActionMenuPresenter O;
    private d P;
    private m.a Q;
    private g.a R;
    private boolean S;
    private final Runnable T;

    /* renamed from: f, reason: collision with root package name */
    private ActionMenuView f417f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f418g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f419h;

    /* renamed from: i, reason: collision with root package name */
    private ImageButton f420i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f421j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f422k;
    private CharSequence l;
    ImageButton m;
    View n;
    private Context o;
    private int p;
    private int q;
    private int r;
    int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private i0 y;
    private int z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.L;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.m {

        /* renamed from: f, reason: collision with root package name */
        androidx.appcompat.view.menu.g f427f;

        /* renamed from: g, reason: collision with root package name */
        androidx.appcompat.view.menu.i f428g;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(boolean z) {
            if (this.f428g != null) {
                androidx.appcompat.view.menu.g gVar = this.f427f;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f427f.getItem(i2) == this.f428g) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z2) {
                    return;
                }
                e(this.f427f, this.f428g);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.n;
            if (callback instanceof c.a.o.c) {
                ((c.a.o.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.n = null;
            toolbar3.a();
            this.f428g = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.m);
            }
            Toolbar.this.n = iVar.getActionView();
            this.f428g = iVar;
            ViewParent parent2 = Toolbar.this.n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.n);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = 8388611 | (toolbar4.s & 112);
                generateDefaultLayoutParams.f430b = 2;
                toolbar4.n.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.n);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.n;
            if (callback instanceof c.a.o.c) {
                ((c.a.o.c) callback).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.m
        public void h(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f427f;
            if (gVar2 != null && (iVar = this.f428g) != null) {
                gVar2.f(iVar);
            }
            this.f427f = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean k(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public Parcelable l() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.O);
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.T);
        post(this.T);
    }

    private boolean M() {
        if (!this.S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z = androidx.core.view.u.y(this) == 1;
        int childCount = getChildCount();
        int b2 = androidx.core.view.d.b(i2, androidx.core.view.u.y(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f430b == 0 && N(childAt) && p(eVar.a) == b2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f430b == 0 && N(childAt2) && p(eVar2.a) == b2) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f430b = 1;
        if (z && this.n != null) {
            view.setLayoutParams(eVar);
            this.J.add(view);
        } else {
            addView(view, eVar);
        }
    }

    private MenuInflater getMenuInflater() {
        return new c.a.o.g(getContext());
    }

    private void h() {
        if (this.y == null) {
            this.y = new i0();
        }
    }

    private void i() {
        if (this.f421j == null) {
            this.f421j = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f417f.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f417f.getMenu();
            if (this.P == null) {
                this.P = new d();
            }
            this.f417f.setExpandedActionViewsExclusive(true);
            gVar.c(this.P, this.o);
        }
    }

    private void k() {
        if (this.f417f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f417f = actionMenuView;
            actionMenuView.setPopupTheme(this.p);
            this.f417f.setOnMenuItemClickListener(this.M);
            this.f417f.O(this.Q, this.R);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.s & 112);
            this.f417f.setLayoutParams(generateDefaultLayoutParams);
            c(this.f417f, false);
        }
    }

    private void l() {
        if (this.f420i == null) {
            this.f420i = new k(getContext(), null, c.a.a.N);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.s & 112);
            this.f420i.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i2) {
        int y = androidx.core.view.u.y(this);
        int b2 = androidx.core.view.d.b(i2, y) & 7;
        return (b2 == 1 || b2 == 3 || b2 == 5) ? b2 : y == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r = r(eVar.a);
        if (r == 48) {
            return getPaddingTop() - i3;
        }
        if (r != 80) {
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            if (i4 < i5) {
                i4 = i5;
            } else {
                int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                if (i6 < i7) {
                    i4 = Math.max(0, i4 - (i7 - i6));
                }
            }
            return paddingTop + i4;
        }
        return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.B & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.g.b(marginLayoutParams) + androidx.core.view.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f417f;
        return actionMenuView != null && actionMenuView.J();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f430b != 2 && childAt != this.f417f) {
                removeViewAt(childCount);
                this.J.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.y.g(i2, i3);
    }

    public void I(androidx.appcompat.view.menu.g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar == null && this.f417f == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g N = this.f417f.N();
        if (N == gVar) {
            return;
        }
        if (N != null) {
            N.Q(this.O);
            N.Q(this.P);
        }
        if (this.P == null) {
            this.P = new d();
        }
        actionMenuPresenter.I(true);
        if (gVar != null) {
            gVar.c(actionMenuPresenter, this.o);
            gVar.c(this.P, this.o);
        } else {
            actionMenuPresenter.h(this.o, null);
            this.P.h(this.o, null);
            actionMenuPresenter.c(true);
            this.P.c(true);
        }
        this.f417f.setPopupTheme(this.p);
        this.f417f.setPresenter(actionMenuPresenter);
        this.O = actionMenuPresenter;
    }

    public void J(m.a aVar, g.a aVar2) {
        this.Q = aVar;
        this.R = aVar2;
        ActionMenuView actionMenuView = this.f417f;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void K(Context context, int i2) {
        this.r = i2;
        TextView textView = this.f419h;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void L(Context context, int i2) {
        this.q = i2;
        TextView textView = this.f418g;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.f417f;
        return actionMenuView != null && actionMenuView.P();
    }

    void a() {
        for (int size = this.J.size() - 1; size >= 0; size--) {
            addView(this.J.get(size));
        }
        this.J.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f417f) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.P;
        androidx.appcompat.view.menu.i iVar = dVar == null ? null : dVar.f428g;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f417f;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.m == null) {
            k kVar = new k(getContext(), null, c.a.a.N);
            this.m = kVar;
            kVar.setImageDrawable(this.f422k);
            this.m.setContentDescription(this.l);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.s & 112);
            generateDefaultLayoutParams.f430b = 2;
            this.m.setLayoutParams(generateDefaultLayoutParams);
            this.m.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        i0 i0Var = this.y;
        if (i0Var != null) {
            return i0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.A;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        i0 i0Var = this.y;
        if (i0Var != null) {
            return i0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        i0 i0Var = this.y;
        if (i0Var != null) {
            return i0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        i0 i0Var = this.y;
        if (i0Var != null) {
            return i0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g N;
        ActionMenuView actionMenuView = this.f417f;
        if ((actionMenuView == null || (N = actionMenuView.N()) == null || !N.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.A, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (androidx.core.view.u.y(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (androidx.core.view.u.y(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.z, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f421j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f421j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f417f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f420i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f420i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.O;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f417f.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.o;
    }

    public int getPopupTheme() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    final TextView getSubtitleTextView() {
        return this.f419h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.x;
    }

    public int getTitleMarginEnd() {
        return this.v;
    }

    public int getTitleMarginStart() {
        return this.u;
    }

    public int getTitleMarginTop() {
        return this.w;
    }

    final TextView getTitleTextView() {
        return this.f418g;
    }

    public x getWrapper() {
        if (this.N == null) {
            this.N = new r0(this, true);
        }
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0007a) {
            return new e((a.C0007a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029f A[LOOP:0: B:41:0x029d->B:42:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c1 A[LOOP:1: B:45:0x02bf->B:46:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fa A[LOOP:2: B:54:0x02f8->B:55:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.K;
        if (w0.b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (N(this.f420i)) {
            E(this.f420i, i2, 0, i3, 0, this.t);
            i4 = this.f420i.getMeasuredWidth() + s(this.f420i);
            i5 = Math.max(0, this.f420i.getMeasuredHeight() + t(this.f420i));
            i6 = View.combineMeasuredStates(0, this.f420i.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (N(this.m)) {
            E(this.m, i2, 0, i3, 0, this.t);
            i4 = this.m.getMeasuredWidth() + s(this.m);
            i5 = Math.max(i5, this.m.getMeasuredHeight() + t(this.m));
            i6 = View.combineMeasuredStates(i6, this.m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i4);
        iArr[c2] = Math.max(0, currentContentInsetStart - i4);
        if (N(this.f417f)) {
            E(this.f417f, i2, max, i3, 0, this.t);
            i7 = this.f417f.getMeasuredWidth() + s(this.f417f);
            i5 = Math.max(i5, this.f417f.getMeasuredHeight() + t(this.f417f));
            i6 = View.combineMeasuredStates(i6, this.f417f.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i7);
        if (N(this.n)) {
            max2 += D(this.n, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.n.getMeasuredHeight() + t(this.n));
            i6 = View.combineMeasuredStates(i6, this.n.getMeasuredState());
        }
        if (N(this.f421j)) {
            max2 += D(this.f421j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f421j.getMeasuredHeight() + t(this.f421j));
            i6 = View.combineMeasuredStates(i6, this.f421j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((e) childAt.getLayoutParams()).f430b == 0 && N(childAt)) {
                max2 += D(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i12 = this.w + this.x;
        int i13 = this.u + this.v;
        if (N(this.f418g)) {
            D(this.f418g, i2, max2 + i13, i3, i12, iArr);
            int measuredWidth = this.f418g.getMeasuredWidth() + s(this.f418g);
            i10 = this.f418g.getMeasuredHeight() + t(this.f418g);
            i8 = View.combineMeasuredStates(i6, this.f418g.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i8 = i6;
            i9 = 0;
            i10 = 0;
        }
        if (N(this.f419h)) {
            i9 = Math.max(i9, D(this.f419h, i2, max2 + i13, i3, i10 + i12, iArr));
            i10 += this.f419h.getMeasuredHeight() + t(this.f419h);
            i8 = View.combineMeasuredStates(i8, this.f419h.getMeasuredState());
        }
        int max3 = Math.max(i5, i10);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i9 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & i8), M() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i8 << 16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f417f;
        androidx.appcompat.view.menu.g N = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = savedState.f423h;
        if (i2 != 0 && this.P != null && N != null && (findItem = N.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f424i) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        this.y.f(i2 == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.P;
        if (dVar != null && (iVar = dVar.f428g) != null) {
            savedState.f423h = iVar.getItemId();
        }
        savedState.f424i = A();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(c.a.k.a.a.d(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.A) {
            this.A = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.z) {
            this.z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(c.a.k.a.a.d(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(c.a.k.a.a.d(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f420i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.L = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f417f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.p != i2) {
            this.p = i2;
            if (i2 == 0) {
                this.o = getContext();
            } else {
                this.o = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.x = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public boolean v() {
        d dVar = this.P;
        return (dVar == null || dVar.f428g == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f417f;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f417f;
        return actionMenuView != null && actionMenuView.I();
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0007a {

        /* renamed from: b, reason: collision with root package name */
        int f430b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f430b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i2, int i3) {
            super(i2, i3);
            this.f430b = 0;
            this.a = 8388627;
        }

        public e(e eVar) {
            super((a.C0007a) eVar);
            this.f430b = 0;
            this.f430b = eVar.f430b;
        }

        public e(a.C0007a c0007a) {
            super(c0007a);
            this.f430b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f430b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f430b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.B = 8388627;
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        this.K = new int[2];
        this.M = new a();
        this.T = new b();
        Context context2 = getContext();
        int[] iArr = c.a.j.k3;
        q0 v = q0.v(context2, attributeSet, iArr, i2, 0);
        androidx.core.view.u.g0(this, context, iArr, attributeSet, v.r(), i2, 0);
        this.q = v.n(c.a.j.M3, 0);
        this.r = v.n(c.a.j.D3, 0);
        this.B = v.l(c.a.j.l3, this.B);
        this.s = v.l(c.a.j.m3, 48);
        int e2 = v.e(c.a.j.G3, 0);
        int i3 = c.a.j.L3;
        e2 = v.s(i3) ? v.e(i3, e2) : e2;
        this.x = e2;
        this.w = e2;
        this.v = e2;
        this.u = e2;
        int e3 = v.e(c.a.j.J3, -1);
        if (e3 >= 0) {
            this.u = e3;
        }
        int e4 = v.e(c.a.j.I3, -1);
        if (e4 >= 0) {
            this.v = e4;
        }
        int e5 = v.e(c.a.j.K3, -1);
        if (e5 >= 0) {
            this.w = e5;
        }
        int e6 = v.e(c.a.j.H3, -1);
        if (e6 >= 0) {
            this.x = e6;
        }
        this.t = v.f(c.a.j.x3, -1);
        int e7 = v.e(c.a.j.t3, Integer.MIN_VALUE);
        int e8 = v.e(c.a.j.p3, Integer.MIN_VALUE);
        int f2 = v.f(c.a.j.r3, 0);
        int f3 = v.f(c.a.j.s3, 0);
        h();
        this.y.e(f2, f3);
        if (e7 != Integer.MIN_VALUE || e8 != Integer.MIN_VALUE) {
            this.y.g(e7, e8);
        }
        this.z = v.e(c.a.j.u3, Integer.MIN_VALUE);
        this.A = v.e(c.a.j.q3, Integer.MIN_VALUE);
        this.f422k = v.g(c.a.j.o3);
        this.l = v.p(c.a.j.n3);
        CharSequence p = v.p(c.a.j.F3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.p(c.a.j.C3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.o = getContext();
        setPopupTheme(v.n(c.a.j.B3, 0));
        Drawable g2 = v.g(c.a.j.A3);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence p3 = v.p(c.a.j.z3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g3 = v.g(c.a.j.v3);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence p4 = v.p(c.a.j.w3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i4 = c.a.j.N3;
        if (v.s(i4)) {
            setTitleTextColor(v.c(i4));
        }
        int i5 = c.a.j.E3;
        if (v.s(i5)) {
            setSubtitleTextColor(v.c(i5));
        }
        int i6 = c.a.j.y3;
        if (v.s(i6)) {
            x(v.n(i6, 0));
        }
        v.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.m.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.m;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f422k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f421j)) {
                c(this.f421j, true);
            }
        } else {
            ImageView imageView = this.f421j;
            if (imageView != null && y(imageView)) {
                removeView(this.f421j);
                this.J.remove(this.f421j);
            }
        }
        ImageView imageView2 = this.f421j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f421j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f420i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f420i)) {
                c(this.f420i, true);
            }
        } else {
            ImageButton imageButton = this.f420i;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f420i);
                this.J.remove(this.f420i);
            }
        }
        ImageButton imageButton2 = this.f420i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f419h == null) {
                Context context = getContext();
                t tVar = new t(context);
                this.f419h = tVar;
                tVar.setSingleLine();
                this.f419h.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.r;
                if (i2 != 0) {
                    this.f419h.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.f419h.setTextColor(colorStateList);
                }
            }
            if (!y(this.f419h)) {
                c(this.f419h, true);
            }
        } else {
            TextView textView = this.f419h;
            if (textView != null && y(textView)) {
                removeView(this.f419h);
                this.J.remove(this.f419h);
            }
        }
        TextView textView2 = this.f419h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        TextView textView = this.f419h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f418g == null) {
                Context context = getContext();
                t tVar = new t(context);
                this.f418g = tVar;
                tVar.setSingleLine();
                this.f418g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.q;
                if (i2 != 0) {
                    this.f418g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f418g.setTextColor(colorStateList);
                }
            }
            if (!y(this.f418g)) {
                c(this.f418g, true);
            }
        } else {
            TextView textView = this.f418g;
            if (textView != null && y(textView)) {
                removeView(this.f418g);
                this.J.remove(this.f418g);
            }
        }
        TextView textView2 = this.f418g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f418g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h, reason: collision with root package name */
        int f423h;

        /* renamed from: i, reason: collision with root package name */
        boolean f424i;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f423h = parcel.readInt();
            this.f424i = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f423h);
            parcel.writeInt(this.f424i ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
