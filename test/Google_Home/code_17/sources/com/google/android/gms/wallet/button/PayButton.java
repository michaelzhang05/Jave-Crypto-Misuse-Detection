package com.google.android.gms.wallet.button;

import N.C1336g;
import Q.AbstractC1400p;
import V.k;
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
import r0.AbstractC3906n;
import r0.AbstractC3907o;
import r0.AbstractC3908p;
import r0.AbstractC3909q;
import r0.AbstractC3910s;
import r0.r;
import s0.C3989e;
import s0.f;
import s0.g;

/* loaded from: classes3.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private View.OnClickListener f18020a;

    /* renamed from: b, reason: collision with root package name */
    private ButtonOptions.a f18021b;

    /* renamed from: c, reason: collision with root package name */
    private View f18022c;

    /* renamed from: d, reason: collision with root package name */
    private final C3989e f18023d;

    public PayButton(Context context) {
        this(context, null);
    }

    private final void b(ButtonOptions buttonOptions) {
        int i8;
        Drawable drawable;
        removeAllViews();
        if (buttonOptions.u() == 2) {
            i8 = r.f38535b;
        } else {
            i8 = r.f38534a;
        }
        f fVar = new f(new ContextThemeWrapper(getContext(), i8), null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(fVar.getContext()).inflate(AbstractC3908p.f38532a, (ViewGroup) fVar, true).findViewById(AbstractC3907o.f38531a);
        Context context = fVar.getContext();
        int y8 = buttonOptions.y();
        GradientDrawable gradientDrawable = (GradientDrawable) g.a(context, AbstractC3906n.f38528a).mutate();
        float f8 = y8;
        gradientDrawable.setCornerRadius(f8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{AbstractC3906n.f38529b});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        ColorStateList valueOf = ColorStateList.valueOf(color);
        if (k.f()) {
            drawable = new RippleDrawable(valueOf, gradientDrawable, null);
        } else {
            GradientDrawable gradientDrawable2 = (GradientDrawable) g.a(context, AbstractC3906n.f38530c).mutate();
            gradientDrawable2.setCornerRadius(f8);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, layerDrawable);
            stateListDrawable.addState(new int[0], gradientDrawable);
            drawable = stateListDrawable;
        }
        linearLayout.setBackground(drawable);
        fVar.setContentDescription(fVar.getContext().getString(AbstractC3909q.f38533a));
        this.f18022c = fVar;
        addView(fVar);
        this.f18022c.setOnClickListener(this);
    }

    public void a(ButtonOptions buttonOptions) {
        ButtonOptions.a aVar = this.f18021b;
        if (buttonOptions.v() != 0) {
            ButtonOptions.this.f18014a = buttonOptions.v();
        }
        if (buttonOptions.u() != 0) {
            ButtonOptions.this.f18015b = buttonOptions.u();
        }
        if (buttonOptions.f18018e) {
            aVar.e(buttonOptions.y());
        }
        if (buttonOptions.p() != null) {
            ButtonOptions.this.f18017d = buttonOptions.p();
        }
        if (!isInEditMode()) {
            removeAllViews();
            ButtonOptions a8 = this.f18021b.a();
            if (C1336g.n().h(getContext(), 232100000) != 0) {
                b(a8);
                Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
                return;
            } else {
                if (TextUtils.isEmpty(a8.p())) {
                    Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
                    return;
                }
                View a9 = C3989e.a((Context) AbstractC1400p.l(getContext()), a8);
                this.f18022c = a9;
                if (a9 == null) {
                    Log.e("PayButton", "Failed to create buttonView");
                    return;
                } else {
                    addView(a9);
                    this.f18022c.setOnClickListener(this);
                    return;
                }
            }
        }
        b(this.f18021b.a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f18020a;
        if (onClickListener != null && view == this.f18022c) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f18020a = onClickListener;
    }

    public PayButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        ButtonOptions.a z8 = ButtonOptions.z();
        this.f18021b = z8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3910s.f38537b);
        int i9 = obtainStyledAttributes.getInt(AbstractC3910s.f38538c, 1);
        int applyDimension = (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics());
        int i10 = AbstractC3910s.f38539d;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i10, applyDimension);
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.f18015b = i9;
        buttonOptions.f18016c = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(i10)) {
            ButtonOptions.this.f18018e = true;
        }
        obtainStyledAttributes.recycle();
        z8.d(1);
        this.f18023d = new C3989e();
        if (isInEditMode()) {
            b(this.f18021b.a());
        }
    }
}
