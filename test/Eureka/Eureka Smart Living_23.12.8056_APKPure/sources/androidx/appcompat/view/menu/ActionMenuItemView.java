package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.h2;
import androidx.appcompat.widget.j3;
import androidx.appcompat.widget.k1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends k1 implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h, reason: collision with root package name */
    i f505h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f506i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f507j;

    /* renamed from: k, reason: collision with root package name */
    g.b f508k;

    /* renamed from: l, reason: collision with root package name */
    private h2 f509l;

    /* renamed from: m, reason: collision with root package name */
    b f510m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f511n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f512o;

    /* renamed from: p, reason: collision with root package name */
    private int f513p;

    /* renamed from: q, reason: collision with root package name */
    private int f514q;

    /* renamed from: r, reason: collision with root package name */
    private int f515r;

    /* loaded from: classes.dex */
    private class a extends h2 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.h2
        public p b() {
            b bVar = ActionMenuItemView.this.f510m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.h2
        protected boolean c() {
            p b6;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f508k;
            return bVar != null && bVar.a(actionMenuItemView.f505h) && (b6 = b()) != null && b6.b();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        return i6 >= 480 || (i6 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void t() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f506i);
        if (this.f507j != null && (!this.f505h.B() || (!this.f511n && !this.f512o))) {
            z5 = false;
        }
        boolean z7 = z6 & z5;
        setText(z7 ? this.f506i : null);
        CharSequence contentDescription = this.f505h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z7 ? null : this.f505h.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f505h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            j3.a(this, z7 ? null : this.f505h.getTitle());
        } else {
            j3.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return r();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return r() && this.f505h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i6) {
        this.f505h = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f509l == null) {
            this.f509l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f505h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f508k;
        if (bVar != null) {
            bVar.a(this.f505h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f511n = s();
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k1, android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        int i8;
        boolean r5 = r();
        if (r5 && (i8 = this.f514q) >= 0) {
            super.setPadding(i8, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f513p) : this.f513p;
        if (mode != 1073741824 && this.f513p > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i7);
        }
        if (r5 || this.f507j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f507j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h2 h2Var;
        if (this.f505h.hasSubMenu() && (h2Var = this.f509l) != null && h2Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    public void setExpandedFormat(boolean z5) {
        if (this.f512o != z5) {
            this.f512o = z5;
            i iVar = this.f505h;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f507j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = this.f515r;
            if (intrinsicWidth > i6) {
                intrinsicHeight = (int) (intrinsicHeight * (i6 / intrinsicWidth));
                intrinsicWidth = i6;
            }
            if (intrinsicHeight > i6) {
                intrinsicWidth = (int) (intrinsicWidth * (i6 / intrinsicHeight));
            } else {
                i6 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i6);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(g.b bVar) {
        this.f508k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i6, int i7, int i8, int i9) {
        this.f514q = i6;
        super.setPadding(i6, i7, i8, i9);
    }

    public void setPopupCallback(b bVar) {
        this.f510m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f506i = charSequence;
        t();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Resources resources = context.getResources();
        this.f511n = s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f6355v, i6, 0);
        this.f513p = obtainStyledAttributes.getDimensionPixelSize(d.j.f6360w, 0);
        obtainStyledAttributes.recycle();
        this.f515r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f514q = -1;
        setSaveEnabled(false);
    }
}
