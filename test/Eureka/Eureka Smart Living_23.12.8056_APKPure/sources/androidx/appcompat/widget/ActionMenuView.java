package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.i2;

/* loaded from: classes.dex */
public class ActionMenuView extends i2 implements g.b, androidx.appcompat.view.menu.n {
    e A;

    /* renamed from: p, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f781p;

    /* renamed from: q, reason: collision with root package name */
    private Context f782q;

    /* renamed from: r, reason: collision with root package name */
    private int f783r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f784s;

    /* renamed from: t, reason: collision with root package name */
    private androidx.appcompat.widget.c f785t;

    /* renamed from: u, reason: collision with root package name */
    private m.a f786u;

    /* renamed from: v, reason: collision with root package name */
    g.a f787v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f788w;

    /* renamed from: x, reason: collision with root package name */
    private int f789x;

    /* renamed from: y, reason: collision with root package name */
    private int f790y;

    /* renamed from: z, reason: collision with root package name */
    private int f791z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements m.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z5) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i2.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f792a;

        /* renamed from: b, reason: collision with root package name */
        public int f793b;

        /* renamed from: c, reason: collision with root package name */
        public int f794c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f795d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f796e;

        /* renamed from: f, reason: collision with root package name */
        boolean f797f;

        public c(int i6, int i7) {
            super(i6, i7);
            this.f792a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f792a = cVar.f792a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.A;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.f787v;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(View view, int i6, int i7, int i8, int i9) {
        int i10;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8) - i9, View.MeasureSpec.getMode(i8));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z5 = actionMenuItemView != null && actionMenuItemView.r();
        if (i7 > 0) {
            i10 = 2;
            if (!z5 || i7 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i6, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i11 = measuredWidth / i6;
                if (measuredWidth % i6 != 0) {
                    i11++;
                }
                if (!z5 || i11 >= 2) {
                    i10 = i11;
                }
                cVar.f795d = cVar.f792a && z5;
                cVar.f793b = i10;
                view.measure(View.MeasureSpec.makeMeasureSpec(i6 * i10, 1073741824), makeMeasureSpec);
                return i10;
            }
        }
        i10 = 0;
        cVar.f795d = cVar.f792a && z5;
        cVar.f793b = i10;
        view.measure(View.MeasureSpec.makeMeasureSpec(i6 * i10, 1073741824), makeMeasureSpec);
        return i10;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int, boolean] */
    private void M(int i6, int i7) {
        int i8;
        int i9;
        boolean z5;
        int i10;
        boolean z6;
        boolean z7;
        int i11;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i6);
        int size2 = View.MeasureSpec.getSize(i7);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, paddingTop, -2);
        int i12 = size - paddingLeft;
        int i13 = this.f790y;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = i13 + (i15 / i14);
        int childCount = getChildCount();
        int i17 = 0;
        int i18 = 0;
        boolean z8 = false;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        long j6 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            int i22 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i23 = i19 + 1;
                if (z9) {
                    int i24 = this.f791z;
                    i11 = i23;
                    r14 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    i11 = i23;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f797f = r14;
                cVar.f794c = r14;
                cVar.f793b = r14;
                cVar.f795d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f796e = z9 && ((ActionMenuItemView) childAt).r();
                int L = L(childAt, i16, cVar.f792a ? 1 : i14, childMeasureSpec, paddingTop);
                i20 = Math.max(i20, L);
                if (cVar.f795d) {
                    i21++;
                }
                if (cVar.f792a) {
                    z8 = true;
                }
                i14 -= L;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (L == 1) {
                    j6 |= 1 << i18;
                    i17 = i17;
                }
                i19 = i11;
            }
            i18++;
            size2 = i22;
        }
        int i25 = size2;
        boolean z10 = z8 && i19 == 2;
        boolean z11 = false;
        while (i21 > 0 && i14 > 0) {
            int i26 = 0;
            int i27 = 0;
            int i28 = Integer.MAX_VALUE;
            long j7 = 0;
            while (i27 < childCount) {
                boolean z12 = z11;
                c cVar2 = (c) getChildAt(i27).getLayoutParams();
                int i29 = i17;
                if (cVar2.f795d) {
                    int i30 = cVar2.f793b;
                    if (i30 < i28) {
                        j7 = 1 << i27;
                        i28 = i30;
                        i26 = 1;
                    } else if (i30 == i28) {
                        i26++;
                        j7 |= 1 << i27;
                    }
                }
                i27++;
                i17 = i29;
                z11 = z12;
            }
            z5 = z11;
            i10 = i17;
            j6 |= j7;
            if (i26 > i14) {
                i8 = mode;
                i9 = i12;
                break;
            }
            int i31 = i28 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i33 = i12;
                int i34 = mode;
                long j8 = 1 << i32;
                if ((j7 & j8) == 0) {
                    if (cVar3.f793b == i31) {
                        j6 |= j8;
                    }
                    z7 = z10;
                } else {
                    if (z10 && cVar3.f796e && i14 == 1) {
                        int i35 = this.f791z;
                        z7 = z10;
                        childAt2.setPadding(i35 + i16, 0, i35, 0);
                    } else {
                        z7 = z10;
                    }
                    cVar3.f793b++;
                    cVar3.f797f = true;
                    i14--;
                }
                i32++;
                mode = i34;
                i12 = i33;
                z10 = z7;
            }
            i17 = i10;
            z11 = true;
        }
        i8 = mode;
        i9 = i12;
        z5 = z11;
        i10 = i17;
        boolean z13 = !z8 && i19 == 1;
        if (i14 <= 0 || j6 == 0 || (i14 >= i19 - 1 && !z13 && i20 <= 1)) {
            z6 = z5;
        } else {
            float bitCount = Long.bitCount(j6);
            if (!z13) {
                if ((j6 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f796e) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j6 & (1 << i36)) != 0 && !((c) getChildAt(i36).getLayoutParams()).f796e) {
                    bitCount -= 0.5f;
                }
            }
            int i37 = bitCount > 0.0f ? (int) ((i14 * i16) / bitCount) : 0;
            z6 = z5;
            for (int i38 = 0; i38 < childCount; i38++) {
                if ((j6 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f794c = i37;
                        cVar4.f797f = true;
                        if (i38 == 0 && !cVar4.f796e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i37) / 2;
                        }
                    } else if (cVar4.f792a) {
                        cVar4.f794c = i37;
                        cVar4.f797f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i37) / 2;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i37 / 2;
                        }
                    }
                    z6 = true;
                }
            }
        }
        if (z6) {
            for (int i39 = 0; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f797f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f793b * i16) + cVar5.f794c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, i8 != 1073741824 ? i10 : i25);
    }

    public void B() {
        androidx.appcompat.widget.c cVar = this.f785t;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i2
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.i2
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f792a = true;
        return generateDefaultLayoutParams;
    }

    protected boolean G(int i6) {
        boolean z5 = false;
        if (i6 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i6 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i6);
        if (i6 < getChildCount() && (childAt instanceof a)) {
            z5 = false | ((a) childAt).a();
        }
        return (i6 <= 0 || !(childAt2 instanceof a)) ? z5 : z5 | ((a) childAt2).b();
    }

    public boolean H() {
        androidx.appcompat.widget.c cVar = this.f785t;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        androidx.appcompat.widget.c cVar = this.f785t;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        androidx.appcompat.widget.c cVar = this.f785t;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.f784s;
    }

    public androidx.appcompat.view.menu.g N() {
        return this.f781p;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.f786u = aVar;
        this.f787v = aVar2;
    }

    public boolean P() {
        androidx.appcompat.widget.c cVar = this.f785t;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(androidx.appcompat.view.menu.i iVar) {
        return this.f781p.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar) {
        this.f781p = gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i2, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f781p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f781p = gVar;
            gVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f785t = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.f785t;
            m.a aVar = this.f786u;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.h(aVar);
            this.f781p.c(this.f785t, this.f782q);
            this.f785t.H(this);
        }
        return this.f781p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f785t.A();
    }

    public int getPopupTheme() {
        return this.f783r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f785t;
        if (cVar != null) {
            cVar.j(false);
            if (this.f785t.E()) {
                this.f785t.B();
                this.f785t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i2, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int width;
        int i10;
        if (!this.f788w) {
            super.onLayout(z5, i6, i7, i8, i9);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i9 - i7) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i8 - i6;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean b6 = p3.b(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f792a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b6) {
                        i10 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int max = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (b6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f792a) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f792a) {
                int i24 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = i24 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i2, android.view.View
    public void onMeasure(int i6, int i7) {
        androidx.appcompat.view.menu.g gVar;
        boolean z5 = this.f788w;
        boolean z6 = View.MeasureSpec.getMode(i6) == 1073741824;
        this.f788w = z6;
        if (z5 != z6) {
            this.f789x = 0;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (this.f788w && (gVar = this.f781p) != null && size != this.f789x) {
            this.f789x = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f788w && childCount > 0) {
            M(i6, i7);
            return;
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            c cVar = (c) getChildAt(i8).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i6, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.f785t.G(z5);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f785t.I(drawable);
    }

    public void setOverflowReserved(boolean z5) {
        this.f784s = z5;
    }

    public void setPopupTheme(int i6) {
        if (this.f783r != i6) {
            this.f783r = i6;
            if (i6 == 0) {
                this.f782q = getContext();
            } else {
                this.f782q = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f785t = cVar;
        cVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f790y = (int) (56.0f * f6);
        this.f791z = (int) (f6 * 4.0f);
        this.f782q = context;
        this.f783r = 0;
    }
}
