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
import androidx.appcompat.widget.c3;
import androidx.core.view.b1;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private i f520a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f521b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f522c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f523d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f524e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f525f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f526g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f527h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f528i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f529j;

    /* renamed from: k, reason: collision with root package name */
    private int f530k;

    /* renamed from: l, reason: collision with root package name */
    private Context f531l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f532m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f533n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f534o;

    /* renamed from: p, reason: collision with root package name */
    private LayoutInflater f535p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f536q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.A);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i6) {
        LinearLayout linearLayout = this.f528i;
        if (linearLayout != null) {
            linearLayout.addView(view, i6);
        } else {
            addView(view, i6);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(d.g.f6221h, (ViewGroup) this, false);
        this.f524e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(d.g.f6222i, (ViewGroup) this, false);
        this.f521b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(d.g.f6224k, (ViewGroup) this, false);
        this.f522c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f535p == null) {
            this.f535p = LayoutInflater.from(getContext());
        }
        return this.f535p;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f526g;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f527h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f527h.getLayoutParams();
        rect.top += this.f527h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i6) {
        this.f520a = iVar;
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
        return this.f520a;
    }

    public void h(boolean z5, char c6) {
        int i6 = (z5 && this.f520a.A()) ? 0 : 8;
        if (i6 == 0) {
            this.f525f.setText(this.f520a.h());
        }
        if (this.f525f.getVisibility() != i6) {
            this.f525f.setVisibility(i6);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b1.u0(this, this.f529j);
        TextView textView = (TextView) findViewById(d.f.M);
        this.f523d = textView;
        int i6 = this.f530k;
        if (i6 != -1) {
            textView.setTextAppearance(this.f531l, i6);
        }
        this.f525f = (TextView) findViewById(d.f.F);
        ImageView imageView = (ImageView) findViewById(d.f.I);
        this.f526g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f533n);
        }
        this.f527h = (ImageView) findViewById(d.f.f6205r);
        this.f528i = (LinearLayout) findViewById(d.f.f6199l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i7) {
        if (this.f521b != null && this.f532m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f521b.getLayoutParams();
            int i8 = layoutParams.height;
            if (i8 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i8;
            }
        }
        super.onMeasure(i6, i7);
    }

    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f522c == null && this.f524e == null) {
            return;
        }
        if (this.f520a.m()) {
            if (this.f522c == null) {
                g();
            }
            compoundButton = this.f522c;
            view = this.f524e;
        } else {
            if (this.f524e == null) {
                c();
            }
            compoundButton = this.f524e;
            view = this.f522c;
        }
        if (z5) {
            compoundButton.setChecked(this.f520a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f524e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f522c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if (this.f520a.m()) {
            if (this.f522c == null) {
                g();
            }
            compoundButton = this.f522c;
        } else {
            if (this.f524e == null) {
                c();
            }
            compoundButton = this.f524e;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.f536q = z5;
        this.f532m = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f527h;
        if (imageView != null) {
            imageView.setVisibility((this.f534o || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z5 = this.f520a.z() || this.f536q;
        if (z5 || this.f532m) {
            ImageView imageView = this.f521b;
            if (imageView == null && drawable == null && !this.f532m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f532m) {
                this.f521b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f521b;
            if (!z5) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f521b.getVisibility() != 0) {
                this.f521b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i6;
        TextView textView;
        if (charSequence != null) {
            this.f523d.setText(charSequence);
            if (this.f523d.getVisibility() == 0) {
                return;
            }
            textView = this.f523d;
            i6 = 0;
        } else {
            i6 = 8;
            if (this.f523d.getVisibility() == 8) {
                return;
            } else {
                textView = this.f523d;
            }
        }
        textView.setVisibility(i6);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet);
        c3 v5 = c3.v(getContext(), attributeSet, d.j.T1, i6, 0);
        this.f529j = v5.g(d.j.V1);
        this.f530k = v5.n(d.j.U1, -1);
        this.f532m = v5.a(d.j.W1, false);
        this.f531l = context;
        this.f533n = v5.g(d.j.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, d.a.f6137x, 0);
        this.f534o = obtainStyledAttributes.hasValue(0);
        v5.w();
        obtainStyledAttributes.recycle();
    }
}
