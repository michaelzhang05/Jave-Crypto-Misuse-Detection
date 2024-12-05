package com.stripe.android.view;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.a;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.view.A;
import com.stripe.android.view.L;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import d6.AbstractC2757b;
import d6.C2756a;
import d6.InterfaceC2760e;
import e3.C2794h;
import e3.EnumC2791e;
import e3.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import m2.AbstractC3403A;
import m2.AbstractC3407E;
import m2.AbstractC3409G;
import o2.f;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardMultilineWidget extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC2760e f28266A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC2760e f28267B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC2760e f28268C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC2760e f28269D;

    /* renamed from: a, reason: collision with root package name */
    private boolean f28270a;

    /* renamed from: b, reason: collision with root package name */
    private final J2.j f28271b;

    /* renamed from: c, reason: collision with root package name */
    private final CardNumberEditText f28272c;

    /* renamed from: d, reason: collision with root package name */
    private final CardBrandView f28273d;

    /* renamed from: e, reason: collision with root package name */
    private final ExpiryDateEditText f28274e;

    /* renamed from: f, reason: collision with root package name */
    private final CvcEditText f28275f;

    /* renamed from: g, reason: collision with root package name */
    private final PostalCodeEditText f28276g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f28277h;

    /* renamed from: i, reason: collision with root package name */
    private final CardNumberTextInputLayout f28278i;

    /* renamed from: j, reason: collision with root package name */
    private final TextInputLayout f28279j;

    /* renamed from: k, reason: collision with root package name */
    private final TextInputLayout f28280k;

    /* renamed from: l, reason: collision with root package name */
    private final TextInputLayout f28281l;

    /* renamed from: m, reason: collision with root package name */
    private final C2645i0 f28282m;

    /* renamed from: n, reason: collision with root package name */
    private final List f28283n;

    /* renamed from: o, reason: collision with root package name */
    private A f28284o;

    /* renamed from: p, reason: collision with root package name */
    private final i f28285p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28286q;

    /* renamed from: r, reason: collision with root package name */
    private String f28287r;

    /* renamed from: s, reason: collision with root package name */
    private String f28288s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f28289t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC2760e f28290u;

    /* renamed from: v, reason: collision with root package name */
    private ViewModelStoreOwner f28291v;

    /* renamed from: w, reason: collision with root package name */
    private String f28292w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f28293x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC2760e f28294y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f28295z;

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ h6.i[] f28264F = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};

    /* renamed from: E, reason: collision with root package name */
    private static final g f28263E = new g(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f28265G = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return O5.I.f8278a;
        }

        public final void invoke(boolean z8) {
            CardMultilineWidget.this.getCardNumberTextInputLayout().setLoading$payments_core_release(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5557invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5557invoke() {
            CardMultilineWidget.this.getExpiryDateEditText().requestFocus();
            A a8 = CardMultilineWidget.this.f28284o;
            if (a8 != null) {
                a8.e();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function1 {
        c() {
            super(1);
        }

        public final void a(EnumC2791e brand) {
            AbstractC3255y.i(brand, "brand");
            CardMultilineWidget.this.getCardBrandView$payments_core_release().setBrand(brand);
            CardMultilineWidget.this.z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC2791e) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {
        d() {
            super(1);
        }

        public final void a(EnumC2791e brand) {
            AbstractC3255y.i(brand, "brand");
            CardMultilineWidget.this.A(brand);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC2791e) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return O5.I.f8278a;
        }

        public final void invoke(List brands) {
            AbstractC3255y.i(brands, "brands");
            EnumC2791e brand = CardMultilineWidget.this.getCardBrandView$payments_core_release().getBrand();
            CardMultilineWidget.this.getCardBrandView$payments_core_release().setPossibleBrands(brands);
            if (!brands.contains(brand)) {
                CardMultilineWidget.this.getCardBrandView$payments_core_release().setBrand(EnumC2791e.f31452w);
            }
            EnumC2791e enumC2791e = (EnumC2791e) AbstractC1378t.o0(brands);
            if (enumC2791e == null) {
                enumC2791e = EnumC2791e.f31452w;
            }
            CardMultilineWidget.this.A(enumC2791e);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5558invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5558invoke() {
            CardMultilineWidget.this.getCvcEditText().requestFocus();
            A a8 = CardMultilineWidget.this.f28284o;
            if (a8 != null) {
                a8.a();
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class g {
        private g() {
        }

        public /* synthetic */ g(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CardMultilineWidget.this.setShouldShowErrorIcon$payments_core_release(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends Q0 {
        i() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            CardMultilineWidget.l(CardMultilineWidget.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3256z implements InterfaceC1668n {

        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f28305a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f28306b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f28307c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f f28308d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CardMultilineWidget f28309e;

            /* renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0682a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f28310a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f f28311b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CardMultilineWidget f28312c;

                /* renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0683a implements InterfaceC3707g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardMultilineWidget f28313a;

                    public C0683a(CardMultilineWidget cardMultilineWidget) {
                        this.f28313a = cardMultilineWidget;
                    }

                    @Override // o6.InterfaceC3707g
                    public final Object emit(Object obj, S5.d dVar) {
                        this.f28313a.getCardBrandView$payments_core_release().setCbcEligible(((Boolean) obj).booleanValue());
                        return O5.I.f8278a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0682a(InterfaceC3706f interfaceC3706f, S5.d dVar, CardMultilineWidget cardMultilineWidget) {
                    super(2, dVar);
                    this.f28311b = interfaceC3706f;
                    this.f28312c = cardMultilineWidget;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0682a(this.f28311b, dVar, this.f28312c);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f28310a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3706f interfaceC3706f = this.f28311b;
                        C0683a c0683a = new C0683a(this.f28312c);
                        this.f28310a = 1;
                        if (interfaceC3706f.collect(c0683a, this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((C0682a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC3706f interfaceC3706f, S5.d dVar, CardMultilineWidget cardMultilineWidget) {
                super(2, dVar);
                this.f28307c = state;
                this.f28308d = interfaceC3706f;
                this.f28309e = cardMultilineWidget;
                this.f28306b = lifecycleOwner;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f28306b, this.f28307c, this.f28308d, dVar, this.f28309e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f28305a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f28306b;
                    Lifecycle.State state = this.f28307c;
                    C0682a c0682a = new C0682a(this.f28308d, null, this.f28309e);
                    this.f28305a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c0682a, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        j() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3255y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3255y.i(viewModel, "viewModel");
            if (CardMultilineWidget.this.getOnBehalfOf() != null && !AbstractC3255y.d(viewModel.e(), CardMultilineWidget.this.getOnBehalfOf())) {
                viewModel.g(CardMultilineWidget.this.getOnBehalfOf());
            }
            InterfaceC3698L f8 = viewModel.f();
            CardMultilineWidget cardMultilineWidget = CardMultilineWidget.this;
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, f8, null, cardMultilineWidget), 3, null);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28314a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(2);
            this.f28314a = str;
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3255y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3255y.i(viewModel, "viewModel");
            viewModel.g(this.f28314a);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28315b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28315b = cardMultilineWidget;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            if (booleanValue) {
                this.f28315b.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.b.f28617b);
            } else {
                this.f28315b.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.b.f28616a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28316b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28316b = cardMultilineWidget;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            String str;
            AbstractC3255y.i(property, "property");
            Integer num = (Integer) obj2;
            TextInputLayout expiryTextInputLayout = this.f28316b.getExpiryTextInputLayout();
            if (num != null) {
                str = this.f28316b.getResources().getString(num.intValue());
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            expiryTextInputLayout.setPlaceholderText(str);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28317b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28317b = cardMultilineWidget;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            this.f28317b.getCardNumberEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28318b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28318b = cardMultilineWidget;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            this.f28318b.getExpiryDateEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28319b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28319b = cardMultilineWidget;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            this.f28319b.getCvcEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28320b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28320b = cardMultilineWidget;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            this.f28320b.getPostalCodeEditText$payments_core_release().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        AbstractC3255y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(EnumC2791e enumC2791e) {
        this.f28275f.q(enumC2791e, this.f28287r, this.f28288s, this.f28280k);
    }

    static /* synthetic */ void B(CardMultilineWidget cardMultilineWidget, EnumC2791e enumC2791e, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            enumC2791e = cardMultilineWidget.getBrand();
        }
        cardMultilineWidget.A(enumC2791e);
    }

    private final void C(StripeEditText stripeEditText, int i8) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i8);
        if (drawable != null) {
            stripeEditText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    private final Collection<StripeEditText> getAllFields() {
        return P5.a0.i(this.f28272c, this.f28274e, this.f28275f, this.f28276g);
    }

    private final w.b getExpirationDate() {
        return this.f28274e.getValidatedDate();
    }

    @VisibleForTesting
    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CardMultilineWidget this$0, String text) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(text, "text");
        EnumC2791e implicitCardBrandForCbc$payments_core_release = this$0.f28272c.getImplicitCardBrandForCbc$payments_core_release();
        if (implicitCardBrandForCbc$payments_core_release == EnumC2791e.f31452w) {
            implicitCardBrandForCbc$payments_core_release = null;
        }
        if (implicitCardBrandForCbc$payments_core_release == null) {
            implicitCardBrandForCbc$payments_core_release = this$0.f28272c.getCardBrand();
        }
        if (implicitCardBrandForCbc$payments_core_release.q(text)) {
            this$0.z();
            if (this$0.f28270a) {
                this$0.f28276g.requestFocus();
            }
            A a8 = this$0.f28284o;
            if (a8 != null) {
                a8.b();
            }
        } else if (!this$0.f28295z) {
            this$0.q();
        }
        this$0.f28275f.setShouldShowError(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CardMultilineWidget this$0, String it) {
        A a8;
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(it, "it");
        if (this$0.y() && this$0.f28276g.p() && (a8 = this$0.f28284o) != null) {
            a8.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(int i8, CardMultilineWidget this$0, View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        AbstractC3255y.i(this$0, "this$0");
        int width = view.getWidth() + i8;
        CardNumberEditText cardNumberEditText = this$0.f28272c;
        cardNumberEditText.setPadding(cardNumberEditText.getPaddingLeft(), cardNumberEditText.getPaddingTop(), width, cardNumberEditText.getPaddingBottom());
    }

    public static final /* synthetic */ L l(CardMultilineWidget cardMultilineWidget) {
        cardMultilineWidget.getClass();
        return null;
    }

    private final void o(boolean z8) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (z8) {
            i8 = AbstractC3407E.f34867l0;
        } else {
            i8 = AbstractC3407E.f34850d;
        }
        this.f28279j.setHint(getResources().getString(i8));
        if (z8) {
            i9 = AbstractC3403A.f34774y;
        } else {
            i9 = -1;
        }
        this.f28275f.setNextFocusForwardId(i9);
        this.f28275f.setNextFocusDownId(i9);
        int i12 = 0;
        if (z8) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f28281l.setVisibility(i10);
        CvcEditText cvcEditText = this.f28275f;
        if (i10 == 8) {
            i11 = 6;
        } else {
            i11 = 5;
        }
        cvcEditText.setImeOptions(i11);
        TextInputLayout textInputLayout = this.f28280k;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z8) {
                i12 = getResources().getDimensionPixelSize(m2.y.f35083a);
            }
            layoutParams2.setMarginEnd(i12);
            textInputLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    private final void p(AttributeSet attributeSet) {
        Context context = getContext();
        AbstractC3255y.h(context, "getContext(...)");
        int[] CardElement = AbstractC3409G.f34898b;
        AbstractC3255y.h(CardElement, "CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardElement, 0, 0);
        this.f28270a = obtainStyledAttributes.getBoolean(AbstractC3409G.f34901e, this.f28270a);
        this.f28289t = obtainStyledAttributes.getBoolean(AbstractC3409G.f34899c, this.f28289t);
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(AbstractC3409G.f34900d, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    private final void q() {
        if (getBrand().q(this.f28275f.getFieldText$payments_core_release())) {
            return;
        }
        this.f28273d.setShouldShowErrorIcon(this.f28293x);
    }

    private final void r() {
        this.f28274e.setDeleteEmptyListener(new C2660q(this.f28272c));
        this.f28275f.setDeleteEmptyListener(new C2660q(this.f28274e));
        this.f28276g.setDeleteEmptyListener(new C2660q(this.f28275f));
    }

    private final void s() {
        this.f28272c.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.E
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.t(CardMultilineWidget.this, view, z8);
            }
        });
        this.f28274e.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.F
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.u(CardMultilineWidget.this, view, z8);
            }
        });
        this.f28275f.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.G
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.v(CardMultilineWidget.this, view, z8);
            }
        });
        this.f28276g.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.H
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.w(CardMultilineWidget.this, view, z8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3255y.i(this$0, "this$0");
        if (z8 && (a8 = this$0.f28284o) != null) {
            a8.d(A.a.f28164a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3255y.i(this$0, "this$0");
        if (z8 && (a8 = this$0.f28284o) != null) {
            a8.d(A.a.f28165b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(CardMultilineWidget this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            if (!this$0.f28295z) {
                this$0.q();
            }
            A a8 = this$0.f28284o;
            if (a8 != null) {
                a8.d(A.a.f28166c);
                return;
            }
            return;
        }
        this$0.f28273d.setShouldShowErrorIcon(this$0.f28293x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f28270a && z8 && (a8 = this$0.f28284o) != null) {
            a8.d(A.a.f28167d);
        }
    }

    private final void x() {
        this.f28272c.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.f28274e.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.f28275f.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.f28276g.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    private final boolean y() {
        if ((this.f28289t || getUsZipCodeRequired()) && this.f28270a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        B(this, null, 1, null);
        this.f28273d.setShouldShowErrorIcon(this.f28293x);
    }

    public final boolean D() {
        boolean z8;
        boolean z9;
        boolean z10;
        String postalCode$payments_core_release;
        boolean z11;
        Object obj;
        if (getValidatedCardNumber$payments_core_release() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (getExpirationDate() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f28275f.getCvc$payments_core_release() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28272c.setShouldShowError(!z8);
        this.f28274e.setShouldShowError(!z9);
        this.f28275f.setShouldShowError(!z10);
        PostalCodeEditText postalCodeEditText = this.f28276g;
        if ((!this.f28289t && !getUsZipCodeRequired()) || ((postalCode$payments_core_release = this.f28276g.getPostalCode$payments_core_release()) != null && !j6.n.u(postalCode$payments_core_release))) {
            z11 = false;
        } else {
            z11 = true;
        }
        postalCodeEditText.setShouldShowError(z11);
        Iterator<T> it = getAllFields().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((StripeEditText) obj).getShouldShowError()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        StripeEditText stripeEditText = (StripeEditText) obj;
        if (stripeEditText != null) {
            stripeEditText.requestFocus();
        }
        if (!z8 || !z9 || !z10 || this.f28276g.getShouldShowError()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ EnumC2791e getBrand() {
        return this.f28273d.getBrand();
    }

    public final CardBrandView getCardBrandView$payments_core_release() {
        return this.f28273d;
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.f28272c;
    }

    public final StripeEditText.c getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f28266A.getValue(this, f28264F[2]);
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.f28278i;
    }

    public C2794h getCardParams() {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (!D()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        w.b validatedDate = this.f28274e.getValidatedDate();
        if (validatedDate != null) {
            Editable text = this.f28275f.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            Editable text2 = this.f28276g.getText();
            if (text2 != null) {
                str2 = text2.toString();
            } else {
                str2 = null;
            }
            if (!this.f28270a) {
                str2 = null;
            }
            EnumC2791e brand = getBrand();
            Set d8 = P5.a0.d("CardMultilineView");
            f.c validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
            if (validatedCardNumber$payments_core_release != null) {
                str3 = validatedCardNumber$payments_core_release.c();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            String str5 = str3;
            int a8 = validatedDate.a();
            int b8 = validatedDate.b();
            a.C0494a c0494a = new a.C0494a();
            if (str2 != null && !j6.n.u(str2)) {
                str4 = str2;
            }
            return new C2794h(brand, d8, str5, a8, b8, str, null, c0494a.g(str4).a(), null, null, 832, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final CvcEditText getCvcEditText() {
        return this.f28275f;
    }

    public final StripeEditText.c getCvcErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f28268C.getValue(this, f28264F[4]);
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.f28280k;
    }

    public final StripeEditText.c getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f28267B.getValue(this, f28264F[3]);
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.f28294y.getValue(this, f28264F[1]);
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.f28274e;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.f28279j;
    }

    public final Set<L.a> getInvalidFields$payments_core_release() {
        String postalCode$payments_core_release;
        L.a aVar = L.a.f28458a;
        L.a aVar2 = null;
        if (getValidatedCardNumber$payments_core_release() != null) {
            aVar = null;
        }
        L.a aVar3 = L.a.f28459b;
        if (getExpirationDate() != null) {
            aVar3 = null;
        }
        L.a aVar4 = L.a.f28460c;
        if (this.f28275f.getCvc$payments_core_release() != null) {
            aVar4 = null;
        }
        L.a aVar5 = L.a.f28461d;
        if (y() && ((postalCode$payments_core_release = this.f28276g.getPostalCode$payments_core_release()) == null || j6.n.u(postalCode$payments_core_release))) {
            aVar2 = aVar5;
        }
        return AbstractC1378t.b1(AbstractC1378t.r(aVar, aVar3, aVar4, aVar2));
    }

    public final String getOnBehalfOf() {
        return this.f28292w;
    }

    public final o.e getPaymentMethodBillingDetails() {
        o.e.a paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.a();
        }
        return null;
    }

    public final o.e.a getPaymentMethodBillingDetailsBuilder() {
        if (this.f28270a && D()) {
            return new o.e.a().b(new a.C0494a().g(this.f28276g.getPostalCode$payments_core_release()).a());
        }
        return null;
    }

    public p.c getPaymentMethodCard() {
        C2794h cardParams = getCardParams();
        if (cardParams != null) {
            String i8 = cardParams.i();
            String b8 = cardParams.b();
            int g8 = cardParams.g();
            int h8 = cardParams.h();
            return new p.c(i8, Integer.valueOf(g8), Integer.valueOf(h8), b8, null, cardParams.a(), this.f28273d.c(), 16, null);
        }
        return null;
    }

    public com.stripe.android.model.p getPaymentMethodCreateParams() {
        p.c paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return p.e.e(com.stripe.android.model.p.f25636u, paymentMethodCard, getPaymentMethodBillingDetails(), null, null, 12, null);
        }
        return null;
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.f28276g;
    }

    public final StripeEditText.c getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f28269D.getValue(this, f28264F[5]);
    }

    public final boolean getPostalCodeRequired() {
        return this.f28289t;
    }

    public final TextInputLayout getPostalInputLayout$payments_core_release() {
        return this.f28281l;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.f28277h;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.f28293x;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.f28290u.getValue(this, f28264F[0])).booleanValue();
    }

    public final f.c getValidatedCardNumber$payments_core_release() {
        return this.f28272c.getValidatedCardNumber$payments_core_release();
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$payments_core_release() {
        return this.f28291v;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f28286q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28275f.setHint((CharSequence) null);
        this.f28282m.c(this);
        P.a(this, this.f28291v, new j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28282m.b(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        AbstractC3255y.i(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setOnBehalfOf(bundle.getString("state_on_behalf_of"));
            super.onRestoreInstanceState(bundle.getParcelable("state_remaining_state"));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return BundleKt.bundleOf(O5.x.a("state_remaining_state", super.onSaveInstanceState()), O5.x.a("state_on_behalf_of", this.f28292w));
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            z();
        }
    }

    public void setCardHint(String cardHint) {
        AbstractC3255y.i(cardHint, "cardHint");
        this.f28278i.setPlaceholderText(cardHint);
    }

    public void setCardInputListener(A a8) {
        this.f28284o = a8;
    }

    public void setCardNumber(String str) {
        this.f28272c.setText(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCardNumberErrorListener(StripeEditText.c listener) {
        AbstractC3255y.i(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3255y.i(cVar, "<set-?>");
        this.f28266A.setValue(this, f28264F[2], cVar);
    }

    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.f28272c.addTextChangedListener(textWatcher);
    }

    public void setCardValidCallback(L l8) {
        Iterator<T> it = getAllFields().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.f28285p);
        }
        if (l8 != null) {
            Iterator<T> it2 = getAllFields().iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.f28285p);
            }
        }
    }

    public void setCvcCode(String str) {
        this.f28275f.setText(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcErrorListener(StripeEditText.c listener) {
        AbstractC3255y.i(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3255y.i(cVar, "<set-?>");
        this.f28268C.setValue(this, f28264F[4], cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final /* synthetic */ void setCvcIcon(Integer num) {
        boolean z8;
        if (num != null) {
            C(this.f28275f, num.intValue());
        }
        if (num != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f28295z = z8;
    }

    public final void setCvcLabel(String str) {
        this.f28287r = str;
        B(this, null, 1, null);
    }

    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.f28275f.addTextChangedListener(textWatcher);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcPlaceholderText(String str) {
        this.f28288s = str;
        B(this, null, 1, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        Iterator it = this.f28283n.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(z8);
        }
        this.f28286q = z8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDateErrorListener(StripeEditText.c listener) {
        AbstractC3255y.i(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3255y.i(cVar, "<set-?>");
        this.f28267B.setValue(this, f28264F[3], cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDatePlaceholderRes(@StringRes Integer num) {
        setExpirationDatePlaceholderRes$payments_core_release(num);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.f28294y.setValue(this, f28264F[1], num);
    }

    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.f28274e.addTextChangedListener(textWatcher);
    }

    public final void setOnBehalfOf(String str) {
        if (!AbstractC3255y.d(this.f28292w, str)) {
            if (isAttachedToWindow()) {
                P.a(this, this.f28291v, new k(str));
            }
            this.f28292w = str;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setPostalCodeErrorListener(StripeEditText.c cVar) {
        setPostalCodeErrorListener$payments_core_release(cVar);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.c cVar) {
        this.f28269D.setValue(this, f28264F[5], cVar);
    }

    public final void setPostalCodeRequired(boolean z8) {
        this.f28289t = z8;
    }

    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.f28276g.addTextChangedListener(textWatcher);
    }

    public final void setPreferredNetworks(List<? extends EnumC2791e> preferredNetworks) {
        AbstractC3255y.i(preferredNetworks, "preferredNetworks");
        this.f28273d.setMerchantPreferredNetworks(preferredNetworks);
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z8) {
        boolean z9;
        if (this.f28293x != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f28293x = z8;
        if (z9) {
            z();
        }
    }

    public final void setShouldShowPostalCode(boolean z8) {
        this.f28270a = z8;
        o(z8);
    }

    public final void setUsZipCodeRequired(boolean z8) {
        this.f28290u.setValue(this, f28264F[0], Boolean.valueOf(z8));
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.f28291v = viewModelStoreOwner;
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i8, boolean z8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? true : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i8, boolean z8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f28270a = z8;
        J2.j b8 = J2.j.b(LayoutInflater.from(context), this);
        AbstractC3255y.h(b8, "inflate(...)");
        this.f28271b = b8;
        CardNumberEditText etCardNumber = b8.f4857d;
        AbstractC3255y.h(etCardNumber, "etCardNumber");
        this.f28272c = etCardNumber;
        CardBrandView cardBrandView = b8.f4855b;
        AbstractC3255y.h(cardBrandView, "cardBrandView");
        this.f28273d = cardBrandView;
        ExpiryDateEditText etExpiry = b8.f4859f;
        AbstractC3255y.h(etExpiry, "etExpiry");
        this.f28274e = etExpiry;
        CvcEditText etCvc = b8.f4858e;
        AbstractC3255y.h(etCvc, "etCvc");
        this.f28275f = etCvc;
        PostalCodeEditText etPostalCode = b8.f4860g;
        AbstractC3255y.h(etPostalCode, "etPostalCode");
        this.f28276g = etPostalCode;
        LinearLayout secondRowLayout = b8.f4861h;
        AbstractC3255y.h(secondRowLayout, "secondRowLayout");
        this.f28277h = secondRowLayout;
        CardNumberTextInputLayout tlCardNumber = b8.f4862i;
        AbstractC3255y.h(tlCardNumber, "tlCardNumber");
        this.f28278i = tlCardNumber;
        TextInputLayout tlExpiry = b8.f4864k;
        AbstractC3255y.h(tlExpiry, "tlExpiry");
        this.f28279j = tlExpiry;
        TextInputLayout tlCvc = b8.f4863j;
        AbstractC3255y.h(tlCvc, "tlCvc");
        this.f28280k = tlCvc;
        TextInputLayout tlPostalCode = b8.f4865l;
        AbstractC3255y.h(tlPostalCode, "tlPostalCode");
        this.f28281l = tlPostalCode;
        this.f28282m = new C2645i0();
        List p8 = AbstractC1378t.p(tlCardNumber, tlExpiry, tlCvc, tlPostalCode);
        this.f28283n = p8;
        this.f28285p = new i();
        C2756a c2756a = C2756a.f31226a;
        this.f28290u = new l(Boolean.FALSE, this);
        this.f28294y = new m(Integer.valueOf(AbstractC3407E.f34865k0), this);
        this.f28266A = new n(new C2633c0(tlCardNumber), this);
        this.f28267B = new o(new C2633c0(tlExpiry), this);
        this.f28268C = new p(new C2633c0(tlCvc), this);
        this.f28269D = new q(new C2633c0(tlPostalCode), this);
        setOrientation(1);
        Iterator it = p8.iterator();
        while (true) {
            ColorStateList colorStateList = null;
            if (!it.hasNext()) {
                break;
            }
            TextInputLayout textInputLayout = (TextInputLayout) it.next();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                colorStateList = editText.getHintTextColors();
            }
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
        p(attributeSet);
        x();
        s();
        r();
        this.f28273d.setTintColorInt$payments_core_release(this.f28272c.getHintTextColors().getDefaultColor());
        this.f28272c.setCompletionCallback$payments_core_release(new b());
        this.f28272c.setBrandChangeCallback$payments_core_release(new c());
        this.f28272c.setImplicitCardBrandChangeCallback$payments_core_release(new d());
        this.f28272c.setPossibleCardBrandsCallback$payments_core_release(new e());
        this.f28274e.setCompletionCallback$payments_core_release(new f());
        this.f28275f.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.B
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.h(CardMultilineWidget.this, str);
            }
        });
        this.f28276g.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.C
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.i(CardMultilineWidget.this, str);
            }
        });
        o(this.f28270a);
        CardNumberEditText.B(this.f28272c, 0, 1, null);
        z();
        Iterator<T> it2 = getAllFields().iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new h());
        }
        this.f28272c.setLoadingCallback$payments_core_release(new a());
        this.f28276g.setConfig$payments_core_release(PostalCodeEditText.b.f28616a);
        this.f28286q = true;
        final int dimensionPixelSize = getResources().getDimensionPixelSize(m2.y.f35084b);
        this.f28273d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.D
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                CardMultilineWidget.j(dimensionPixelSize, this, view, i9, i10, i11, i12, i13, i14, i15, i16);
            }
        });
    }
}
