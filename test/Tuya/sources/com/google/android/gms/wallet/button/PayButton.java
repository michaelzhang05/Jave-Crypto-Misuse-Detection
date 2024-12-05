package com.google.android.gms.wallet.button;

import O.C1263g;
import R.AbstractC1319p;
import W.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.wallet.button.ButtonOptions;
import s0.AbstractC3724n;
import s0.AbstractC3725o;
import s0.AbstractC3726p;
import s0.AbstractC3727q;
import s0.AbstractC3728s;
import s0.r;
import t0.e;
import t0.f;
import t0.g;

/* loaded from: classes3.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private View.OnClickListener f16987a;

    /* renamed from: b, reason: collision with root package name */
    private ButtonOptions.a f16988b;

    /* renamed from: c, reason: collision with root package name */
    private View f16989c;

    /* renamed from: d, reason: collision with root package name */
    private final e f16990d;

    public PayButton(Context context) {
        this(context, null);
    }

    private final void b(ButtonOptions buttonOptions) {
        int i8;
        Drawable drawable;
        removeAllViews();
        if (buttonOptions.u() == 2) {
            i8 = r.f37800b;
        } else {
            i8 = r.f37799a;
        }
        f fVar = new f(new ContextThemeWrapper(getContext(), i8), null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(fVar.getContext()).inflate(AbstractC3726p.f37797a, (ViewGroup) fVar, true).findViewById(AbstractC3725o.f37796a);
        Context context = fVar.getContext();
        int G8 = buttonOptions.G();
        GradientDrawable gradientDrawable = (GradientDrawable) g.a(context, AbstractC3724n.f37793a).mutate();
        float f8 = G8;
        gradientDrawable.setCornerRadius(f8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{AbstractC3724n.f37794b});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        ColorStateList valueOf = ColorStateList.valueOf(color);
        if (k.f()) {
            drawable = new RippleDrawable(valueOf, gradientDrawable, null);
        } else {
            GradientDrawable gradientDrawable2 = (GradientDrawable) g.a(context, AbstractC3724n.f37795c).mutate();
            gradientDrawable2.setCornerRadius(f8);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, layerDrawable);
            stateListDrawable.addState(new int[0], gradientDrawable);
            drawable = stateListDrawable;
        }
        linearLayout.setBackground(drawable);
        fVar.setContentDescription(fVar.getContext().getString(AbstractC3727q.f37798a));
        this.f16989c = fVar;
        addView(fVar);
        this.f16989c.setOnClickListener(this);
    }

    public void a(ButtonOptions buttonOptions) {
        ButtonOptions.a aVar = this.f16988b;
        if (buttonOptions.z() != 0) {
            ButtonOptions.this.f16981a = buttonOptions.z();
        }
        if (buttonOptions.u() != 0) {
            ButtonOptions.this.f16982b = buttonOptions.u();
        }
        if (buttonOptions.f16985e) {
            aVar.e(buttonOptions.G());
        }
        if (buttonOptions.s() != null) {
            ButtonOptions.this.f16984d = buttonOptions.s();
        }
        if (!isInEditMode()) {
            removeAllViews();
            ButtonOptions a8 = this.f16988b.a();
            if (C1263g.n().h(getContext(), 232100000) != 0) {
                b(a8);
                Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
                return;
            } else {
                if (TextUtils.isEmpty(a8.s())) {
                    Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
                    return;
                }
                View a9 = e.a((Context) AbstractC1319p.l(getContext()), a8);
                this.f16989c = a9;
                if (a9 == null) {
                    Log.e("PayButton", "Failed to create buttonView");
                    return;
                } else {
                    addView(a9);
                    this.f16989c.setOnClickListener(this);
                    return;
                }
            }
        }
        b(this.f16988b.a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f16987a;
        if (onClickListener != null && view == this.f16989c) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f16987a = onClickListener;
    }

    public PayButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        ButtonOptions.a I8 = ButtonOptions.I();
        this.f16988b = I8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3728s.f37802b);
        int i9 = obtainStyledAttributes.getInt(AbstractC3728s.f37803c, 1);
        int applyDimension = (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics());
        int i10 = AbstractC3728s.f37804d;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i10, applyDimension);
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.f16982b = i9;
        buttonOptions.f16983c = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(i10)) {
            ButtonOptions.this.f16985e = true;
        }
        obtainStyledAttributes.recycle();
        I8.d(1);
        this.f16990d = new e();
        if (isInEditMode()) {
            b(this.f16988b.a());
        }
    }
}
