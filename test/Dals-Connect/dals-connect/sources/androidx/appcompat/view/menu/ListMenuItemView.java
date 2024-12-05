package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.q0;
import androidx.core.view.u;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f, reason: collision with root package name */
    private i f217f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f218g;

    /* renamed from: h, reason: collision with root package name */
    private RadioButton f219h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f220i;

    /* renamed from: j, reason: collision with root package name */
    private CheckBox f221j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f222k;
    private ImageView l;
    private ImageView m;
    private LinearLayout n;
    private Drawable o;
    private int p;
    private Context q;
    private boolean r;
    private Drawable s;
    private boolean t;
    private LayoutInflater u;
    private boolean v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.D);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i2) {
        LinearLayout linearLayout = this.n;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(c.a.g.f2222h, (ViewGroup) this, false);
        this.f221j = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(c.a.g.f2223i, (ViewGroup) this, false);
        this.f218g = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(c.a.g.f2225k, (ViewGroup) this, false);
        this.f219h = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.u == null) {
            this.u = LayoutInflater.from(getContext());
        }
        return this.u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        rect.top += this.m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i2) {
        this.f217f = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f217f;
    }

    public void h(boolean z, char c2) {
        int i2 = (z && this.f217f.A()) ? 0 : 8;
        if (i2 == 0) {
            this.f222k.setText(this.f217f.h());
        }
        if (this.f222k.getVisibility() != i2) {
            this.f222k.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        u.m0(this, this.o);
        TextView textView = (TextView) findViewById(c.a.f.M);
        this.f220i = textView;
        int i2 = this.p;
        if (i2 != -1) {
            textView.setTextAppearance(this.q, i2);
        }
        this.f222k = (TextView) findViewById(c.a.f.F);
        ImageView imageView = (ImageView) findViewById(c.a.f.I);
        this.l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.s);
        }
        this.m = (ImageView) findViewById(c.a.f.r);
        this.n = (LinearLayout) findViewById(c.a.f.l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f218g != null && this.r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f218g.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f219h == null && this.f221j == null) {
            return;
        }
        if (this.f217f.m()) {
            if (this.f219h == null) {
                g();
            }
            compoundButton = this.f219h;
            compoundButton2 = this.f221j;
        } else {
            if (this.f221j == null) {
                c();
            }
            compoundButton = this.f221j;
            compoundButton2 = this.f219h;
        }
        if (z) {
            compoundButton.setChecked(this.f217f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f221j;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f219h;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f217f.m()) {
            if (this.f219h == null) {
                g();
            }
            compoundButton = this.f219h;
        } else {
            if (this.f221j == null) {
                c();
            }
            compoundButton = this.f221j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.v = z;
        this.r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility((this.t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f217f.z() || this.v;
        if (z || this.r) {
            ImageView imageView = this.f218g;
            if (imageView == null && drawable == null && !this.r) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.r) {
                this.f218g.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f218g;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f218g.getVisibility() != 0) {
                this.f218g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f220i.setText(charSequence);
            if (this.f220i.getVisibility() != 0) {
                this.f220i.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f220i.getVisibility() != 8) {
            this.f220i.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        q0 v = q0.v(getContext(), attributeSet, c.a.j.W1, i2, 0);
        this.o = v.g(c.a.j.Y1);
        this.p = v.n(c.a.j.X1, -1);
        this.r = v.a(c.a.j.Z1, false);
        this.q = context;
        this.s = v.g(c.a.j.a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, c.a.a.A, 0);
        this.t = obtainStyledAttributes.hasValue(0);
        v.w();
        obtainStyledAttributes.recycle();
    }
}
