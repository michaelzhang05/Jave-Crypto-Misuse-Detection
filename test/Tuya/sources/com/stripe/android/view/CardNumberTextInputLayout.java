package com.stripe.android.view;

import a6.AbstractC1577b;
import a6.C1576a;
import a6.InterfaceC1580e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import f6.AbstractC2683j;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CardNumberTextInputLayout extends TextInputLayout {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ e6.i[] f27316c = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final int f27317d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final M f27318a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1580e f27319b;

    /* loaded from: classes4.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            view.removeOnLayoutChangeListener(this);
            CardNumberTextInputLayout.this.e();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardNumberTextInputLayout f27321b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, CardNumberTextInputLayout cardNumberTextInputLayout) {
            super(obj);
            this.f27321b = cardNumberTextInputLayout;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                if (booleanValue) {
                    this.f27321b.f27318a.b();
                } else {
                    this.f27321b.f27318a.a();
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        ViewGroup viewGroup;
        ViewParent parent = this.f27318a.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(this.f27318a);
        }
        Object r8 = AbstractC2683j.r(ViewGroupKt.getChildren(this));
        AbstractC3159y.g(r8, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) r8;
        frameLayout.addView(this.f27318a);
        M m8 = this.f27318a;
        ViewGroup.LayoutParams layoutParams = m8.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(frameLayout.getWidth() - getResources().getDimensionPixelSize(j2.y.f33109c));
            layoutParams2.topMargin = getResources().getDimensionPixelSize(j2.y.f33110d);
            m8.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setLoading$payments_core_release(boolean z8) {
        this.f27319b.setValue(this, f27316c[0], Boolean.valueOf(z8));
    }

    public /* synthetic */ CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.textInputStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27318a = new M(context, attributeSet, i8);
        C1576a c1576a = C1576a.f13563a;
        this.f27319b = new b(Boolean.FALSE, this);
        addOnLayoutChangeListener(new a());
        setPlaceholderText(getResources().getString(AbstractC3053E.f32869a0));
    }
}
