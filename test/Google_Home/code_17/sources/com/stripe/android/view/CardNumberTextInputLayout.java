package com.stripe.android.view;

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
import d6.AbstractC2757b;
import d6.C2756a;
import d6.InterfaceC2760e;
import i6.AbstractC3001j;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CardNumberTextInputLayout extends TextInputLayout {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ h6.i[] f28371c = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final int f28372d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final M f28373a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2760e f28374b;

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
    public static final class b extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardNumberTextInputLayout f28376b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, CardNumberTextInputLayout cardNumberTextInputLayout) {
            super(obj);
            this.f28376b = cardNumberTextInputLayout;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                if (booleanValue) {
                    this.f28376b.f28373a.b();
                } else {
                    this.f28376b.f28373a.a();
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        ViewGroup viewGroup;
        ViewParent parent = this.f28373a.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(this.f28373a);
        }
        Object r8 = AbstractC3001j.r(ViewGroupKt.getChildren(this));
        AbstractC3255y.g(r8, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) r8;
        frameLayout.addView(this.f28373a);
        M m8 = this.f28373a;
        ViewGroup.LayoutParams layoutParams = m8.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(frameLayout.getWidth() - getResources().getDimensionPixelSize(m2.y.f35085c));
            layoutParams2.topMargin = getResources().getDimensionPixelSize(m2.y.f35086d);
            m8.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setLoading$payments_core_release(boolean z8) {
        this.f28374b.setValue(this, f28371c[0], Boolean.valueOf(z8));
    }

    public /* synthetic */ CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.textInputStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f28373a = new M(context, attributeSet, i8);
        C2756a c2756a = C2756a.f31226a;
        this.f28374b = new b(Boolean.FALSE, this);
        addOnLayoutChangeListener(new a());
        setPlaceholderText(getResources().getString(AbstractC3407E.f34845a0));
    }
}
