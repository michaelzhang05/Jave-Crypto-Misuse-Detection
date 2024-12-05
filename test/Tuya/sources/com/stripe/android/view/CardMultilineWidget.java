package com.stripe.android.view;

import M5.AbstractC1246t;
import a6.AbstractC1577b;
import a6.C1576a;
import a6.InterfaceC1580e;
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
import b3.C1873h;
import b3.EnumC1870e;
import b3.w;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.a;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.view.A;
import com.stripe.android.view.L;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import i6.AbstractC2829k;
import j2.AbstractC3049A;
import j2.AbstractC3053E;
import j2.AbstractC3055G;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.f;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardMultilineWidget extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC1580e f27211A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC1580e f27212B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC1580e f27213C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC1580e f27214D;

    /* renamed from: a, reason: collision with root package name */
    private boolean f27215a;

    /* renamed from: b, reason: collision with root package name */
    private final G2.j f27216b;

    /* renamed from: c, reason: collision with root package name */
    private final CardNumberEditText f27217c;

    /* renamed from: d, reason: collision with root package name */
    private final CardBrandView f27218d;

    /* renamed from: e, reason: collision with root package name */
    private final ExpiryDateEditText f27219e;

    /* renamed from: f, reason: collision with root package name */
    private final CvcEditText f27220f;

    /* renamed from: g, reason: collision with root package name */
    private final PostalCodeEditText f27221g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f27222h;

    /* renamed from: i, reason: collision with root package name */
    private final CardNumberTextInputLayout f27223i;

    /* renamed from: j, reason: collision with root package name */
    private final TextInputLayout f27224j;

    /* renamed from: k, reason: collision with root package name */
    private final TextInputLayout f27225k;

    /* renamed from: l, reason: collision with root package name */
    private final TextInputLayout f27226l;

    /* renamed from: m, reason: collision with root package name */
    private final C2451i0 f27227m;

    /* renamed from: n, reason: collision with root package name */
    private final List f27228n;

    /* renamed from: o, reason: collision with root package name */
    private A f27229o;

    /* renamed from: p, reason: collision with root package name */
    private final i f27230p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27231q;

    /* renamed from: r, reason: collision with root package name */
    private String f27232r;

    /* renamed from: s, reason: collision with root package name */
    private String f27233s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27234t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC1580e f27235u;

    /* renamed from: v, reason: collision with root package name */
    private ViewModelStoreOwner f27236v;

    /* renamed from: w, reason: collision with root package name */
    private String f27237w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f27238x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC1580e f27239y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f27240z;

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ e6.i[] f27209F = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};

    /* renamed from: E, reason: collision with root package name */
    private static final g f27208E = new g(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f27210G = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L5.I.f6487a;
        }

        public final void invoke(boolean z8) {
            CardMultilineWidget.this.getCardNumberTextInputLayout().setLoading$payments_core_release(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5553invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5553invoke() {
            CardMultilineWidget.this.getExpiryDateEditText().requestFocus();
            A a8 = CardMultilineWidget.this.f27229o;
            if (a8 != null) {
                a8.e();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        public final void a(EnumC1870e brand) {
            AbstractC3159y.i(brand, "brand");
            CardMultilineWidget.this.getCardBrandView$payments_core_release().setBrand(brand);
            CardMultilineWidget.this.z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC1870e) obj);
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        public final void a(EnumC1870e brand) {
            AbstractC3159y.i(brand, "brand");
            CardMultilineWidget.this.A(brand);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC1870e) obj);
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return L5.I.f6487a;
        }

        public final void invoke(List brands) {
            AbstractC3159y.i(brands, "brands");
            EnumC1870e brand = CardMultilineWidget.this.getCardBrandView$payments_core_release().getBrand();
            CardMultilineWidget.this.getCardBrandView$payments_core_release().setPossibleBrands(brands);
            if (!brands.contains(brand)) {
                CardMultilineWidget.this.getCardBrandView$payments_core_release().setBrand(EnumC1870e.f14446w);
            }
            EnumC1870e enumC1870e = (EnumC1870e) AbstractC1246t.o0(brands);
            if (enumC1870e == null) {
                enumC1870e = EnumC1870e.f14446w;
            }
            CardMultilineWidget.this.A(enumC1870e);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5554invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5554invoke() {
            CardMultilineWidget.this.getCvcEditText().requestFocus();
            A a8 = CardMultilineWidget.this.f27229o;
            if (a8 != null) {
                a8.a();
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class g {
        private g() {
        }

        public /* synthetic */ g(AbstractC3151p abstractC3151p) {
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
    static final class j extends AbstractC3160z implements X5.n {

        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f27250a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f27251b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f27252c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f27253d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CardMultilineWidget f27254e;

            /* renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0686a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f27255a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f f27256b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CardMultilineWidget f27257c;

                /* renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0687a implements InterfaceC3359g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardMultilineWidget f27258a;

                    public C0687a(CardMultilineWidget cardMultilineWidget) {
                        this.f27258a = cardMultilineWidget;
                    }

                    @Override // l6.InterfaceC3359g
                    public final Object emit(Object obj, P5.d dVar) {
                        this.f27258a.getCardBrandView$payments_core_release().setCbcEligible(((Boolean) obj).booleanValue());
                        return L5.I.f6487a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0686a(InterfaceC3358f interfaceC3358f, P5.d dVar, CardMultilineWidget cardMultilineWidget) {
                    super(2, dVar);
                    this.f27256b = interfaceC3358f;
                    this.f27257c = cardMultilineWidget;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0686a(this.f27256b, dVar, this.f27257c);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((C0686a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f27255a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3358f interfaceC3358f = this.f27256b;
                        C0687a c0687a = new C0687a(this.f27257c);
                        this.f27255a = 1;
                        if (interfaceC3358f.collect(c0687a, this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC3358f interfaceC3358f, P5.d dVar, CardMultilineWidget cardMultilineWidget) {
                super(2, dVar);
                this.f27252c = state;
                this.f27253d = interfaceC3358f;
                this.f27254e = cardMultilineWidget;
                this.f27251b = lifecycleOwner;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f27251b, this.f27252c, this.f27253d, dVar, this.f27254e);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f27250a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f27251b;
                    Lifecycle.State state = this.f27252c;
                    C0686a c0686a = new C0686a(this.f27253d, null, this.f27254e);
                    this.f27250a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c0686a, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }
        }

        j() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3159y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3159y.i(viewModel, "viewModel");
            if (CardMultilineWidget.this.getOnBehalfOf() != null && !AbstractC3159y.d(viewModel.e(), CardMultilineWidget.this.getOnBehalfOf())) {
                viewModel.g(CardMultilineWidget.this.getOnBehalfOf());
            }
            InterfaceC3349K f8 = viewModel.f();
            CardMultilineWidget cardMultilineWidget = CardMultilineWidget.this;
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, f8, null, cardMultilineWidget), 3, null);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(2);
            this.f27259a = str;
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3159y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3159y.i(viewModel, "viewModel");
            viewModel.g(this.f27259a);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27260b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27260b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            if (booleanValue) {
                this.f27260b.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.b.f27562b);
            } else {
                this.f27260b.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.b.f27561a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27261b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            String str;
            AbstractC3159y.i(property, "property");
            Integer num = (Integer) obj2;
            TextInputLayout expiryTextInputLayout = this.f27261b.getExpiryTextInputLayout();
            if (num != null) {
                str = this.f27261b.getResources().getString(num.intValue());
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
    public static final class n extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27262b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27262b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27262b.getCardNumberEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27263b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27263b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27263b.getExpiryDateEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27264b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27264b.getCvcEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27265b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27265b.getPostalCodeEditText$payments_core_release().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(EnumC1870e enumC1870e) {
        this.f27220f.q(enumC1870e, this.f27232r, this.f27233s, this.f27225k);
    }

    static /* synthetic */ void B(CardMultilineWidget cardMultilineWidget, EnumC1870e enumC1870e, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            enumC1870e = cardMultilineWidget.getBrand();
        }
        cardMultilineWidget.A(enumC1870e);
    }

    private final void C(StripeEditText stripeEditText, int i8) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i8);
        if (drawable != null) {
            stripeEditText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    private final Collection<StripeEditText> getAllFields() {
        return M5.a0.i(this.f27217c, this.f27219e, this.f27220f, this.f27221g);
    }

    private final w.b getExpirationDate() {
        return this.f27219e.getValidatedDate();
    }

    @VisibleForTesting
    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CardMultilineWidget this$0, String text) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(text, "text");
        EnumC1870e implicitCardBrandForCbc$payments_core_release = this$0.f27217c.getImplicitCardBrandForCbc$payments_core_release();
        if (implicitCardBrandForCbc$payments_core_release == EnumC1870e.f14446w) {
            implicitCardBrandForCbc$payments_core_release = null;
        }
        if (implicitCardBrandForCbc$payments_core_release == null) {
            implicitCardBrandForCbc$payments_core_release = this$0.f27217c.getCardBrand();
        }
        if (implicitCardBrandForCbc$payments_core_release.p(text)) {
            this$0.z();
            if (this$0.f27215a) {
                this$0.f27221g.requestFocus();
            }
            A a8 = this$0.f27229o;
            if (a8 != null) {
                a8.b();
            }
        } else if (!this$0.f27240z) {
            this$0.q();
        }
        this$0.f27220f.setShouldShowError(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CardMultilineWidget this$0, String it) {
        A a8;
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(it, "it");
        if (this$0.y() && this$0.f27221g.p() && (a8 = this$0.f27229o) != null) {
            a8.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(int i8, CardMultilineWidget this$0, View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        AbstractC3159y.i(this$0, "this$0");
        int width = view.getWidth() + i8;
        CardNumberEditText cardNumberEditText = this$0.f27217c;
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
            i8 = AbstractC3053E.f32891l0;
        } else {
            i8 = AbstractC3053E.f32874d;
        }
        this.f27224j.setHint(getResources().getString(i8));
        if (z8) {
            i9 = AbstractC3049A.f32798y;
        } else {
            i9 = -1;
        }
        this.f27220f.setNextFocusForwardId(i9);
        this.f27220f.setNextFocusDownId(i9);
        int i12 = 0;
        if (z8) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f27226l.setVisibility(i10);
        CvcEditText cvcEditText = this.f27220f;
        if (i10 == 8) {
            i11 = 6;
        } else {
            i11 = 5;
        }
        cvcEditText.setImeOptions(i11);
        TextInputLayout textInputLayout = this.f27225k;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z8) {
                i12 = getResources().getDimensionPixelSize(j2.y.f33107a);
            }
            layoutParams2.setMarginEnd(i12);
            textInputLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    private final void p(AttributeSet attributeSet) {
        Context context = getContext();
        AbstractC3159y.h(context, "getContext(...)");
        int[] CardElement = AbstractC3055G.f32922b;
        AbstractC3159y.h(CardElement, "CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardElement, 0, 0);
        this.f27215a = obtainStyledAttributes.getBoolean(AbstractC3055G.f32925e, this.f27215a);
        this.f27234t = obtainStyledAttributes.getBoolean(AbstractC3055G.f32923c, this.f27234t);
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(AbstractC3055G.f32924d, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    private final void q() {
        if (getBrand().p(this.f27220f.getFieldText$payments_core_release())) {
            return;
        }
        this.f27218d.setShouldShowErrorIcon(this.f27238x);
    }

    private final void r() {
        this.f27219e.setDeleteEmptyListener(new C2466q(this.f27217c));
        this.f27220f.setDeleteEmptyListener(new C2466q(this.f27219e));
        this.f27221g.setDeleteEmptyListener(new C2466q(this.f27220f));
    }

    private final void s() {
        this.f27217c.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.E
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.t(CardMultilineWidget.this, view, z8);
            }
        });
        this.f27219e.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.F
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.u(CardMultilineWidget.this, view, z8);
            }
        });
        this.f27220f.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.G
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.v(CardMultilineWidget.this, view, z8);
            }
        });
        this.f27221g.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.H
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.w(CardMultilineWidget.this, view, z8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3159y.i(this$0, "this$0");
        if (z8 && (a8 = this$0.f27229o) != null) {
            a8.d(A.a.f27109a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3159y.i(this$0, "this$0");
        if (z8 && (a8 = this$0.f27229o) != null) {
            a8.d(A.a.f27110b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(CardMultilineWidget this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            if (!this$0.f27240z) {
                this$0.q();
            }
            A a8 = this$0.f27229o;
            if (a8 != null) {
                a8.d(A.a.f27111c);
                return;
            }
            return;
        }
        this$0.f27218d.setShouldShowErrorIcon(this$0.f27238x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f27215a && z8 && (a8 = this$0.f27229o) != null) {
            a8.d(A.a.f27112d);
        }
    }

    private final void x() {
        this.f27217c.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.f27219e.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.f27220f.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.f27221g.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    private final boolean y() {
        if ((this.f27234t || getUsZipCodeRequired()) && this.f27215a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        B(this, null, 1, null);
        this.f27218d.setShouldShowErrorIcon(this.f27238x);
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
        if (this.f27220f.getCvc$payments_core_release() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27217c.setShouldShowError(!z8);
        this.f27219e.setShouldShowError(!z9);
        this.f27220f.setShouldShowError(!z10);
        PostalCodeEditText postalCodeEditText = this.f27221g;
        if ((!this.f27234t && !getUsZipCodeRequired()) || ((postalCode$payments_core_release = this.f27221g.getPostalCode$payments_core_release()) != null && !g6.n.u(postalCode$payments_core_release))) {
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
        if (!z8 || !z9 || !z10 || this.f27221g.getShouldShowError()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ EnumC1870e getBrand() {
        return this.f27218d.getBrand();
    }

    public final CardBrandView getCardBrandView$payments_core_release() {
        return this.f27218d;
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.f27217c;
    }

    public final StripeEditText.c getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f27211A.getValue(this, f27209F[2]);
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.f27223i;
    }

    public C1873h getCardParams() {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (!D()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        w.b validatedDate = this.f27219e.getValidatedDate();
        if (validatedDate != null) {
            Editable text = this.f27220f.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            Editable text2 = this.f27221g.getText();
            if (text2 != null) {
                str2 = text2.toString();
            } else {
                str2 = null;
            }
            if (!this.f27215a) {
                str2 = null;
            }
            EnumC1870e brand = getBrand();
            Set d8 = M5.a0.d("CardMultilineView");
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
            a.C0498a c0498a = new a.C0498a();
            if (str2 != null && !g6.n.u(str2)) {
                str4 = str2;
            }
            return new C1873h(brand, d8, str5, a8, b8, str, null, c0498a.g(str4).a(), null, null, 832, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final CvcEditText getCvcEditText() {
        return this.f27220f;
    }

    public final StripeEditText.c getCvcErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f27213C.getValue(this, f27209F[4]);
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.f27225k;
    }

    public final StripeEditText.c getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f27212B.getValue(this, f27209F[3]);
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.f27239y.getValue(this, f27209F[1]);
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.f27219e;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.f27224j;
    }

    public final Set<L.a> getInvalidFields$payments_core_release() {
        String postalCode$payments_core_release;
        L.a aVar = L.a.f27403a;
        L.a aVar2 = null;
        if (getValidatedCardNumber$payments_core_release() != null) {
            aVar = null;
        }
        L.a aVar3 = L.a.f27404b;
        if (getExpirationDate() != null) {
            aVar3 = null;
        }
        L.a aVar4 = L.a.f27405c;
        if (this.f27220f.getCvc$payments_core_release() != null) {
            aVar4 = null;
        }
        L.a aVar5 = L.a.f27406d;
        if (y() && ((postalCode$payments_core_release = this.f27221g.getPostalCode$payments_core_release()) == null || g6.n.u(postalCode$payments_core_release))) {
            aVar2 = aVar5;
        }
        return AbstractC1246t.b1(AbstractC1246t.r(aVar, aVar3, aVar4, aVar2));
    }

    public final String getOnBehalfOf() {
        return this.f27237w;
    }

    public final o.e getPaymentMethodBillingDetails() {
        o.e.a paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.a();
        }
        return null;
    }

    public final o.e.a getPaymentMethodBillingDetailsBuilder() {
        if (this.f27215a && D()) {
            return new o.e.a().b(new a.C0498a().g(this.f27221g.getPostalCode$payments_core_release()).a());
        }
        return null;
    }

    public p.c getPaymentMethodCard() {
        C1873h cardParams = getCardParams();
        if (cardParams != null) {
            String i8 = cardParams.i();
            String c8 = cardParams.c();
            int e8 = cardParams.e();
            int f8 = cardParams.f();
            return new p.c(i8, Integer.valueOf(e8), Integer.valueOf(f8), c8, null, cardParams.b(), this.f27218d.c(), 16, null);
        }
        return null;
    }

    public com.stripe.android.model.p getPaymentMethodCreateParams() {
        p.c paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return p.e.e(com.stripe.android.model.p.f24581u, paymentMethodCard, getPaymentMethodBillingDetails(), null, null, 12, null);
        }
        return null;
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.f27221g;
    }

    public final StripeEditText.c getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f27214D.getValue(this, f27209F[5]);
    }

    public final boolean getPostalCodeRequired() {
        return this.f27234t;
    }

    public final TextInputLayout getPostalInputLayout$payments_core_release() {
        return this.f27226l;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.f27222h;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.f27238x;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.f27235u.getValue(this, f27209F[0])).booleanValue();
    }

    public final f.c getValidatedCardNumber$payments_core_release() {
        return this.f27217c.getValidatedCardNumber$payments_core_release();
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$payments_core_release() {
        return this.f27236v;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f27231q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27220f.setHint((CharSequence) null);
        this.f27227m.c(this);
        P.a(this, this.f27236v, new j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27227m.b(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        AbstractC3159y.i(state, "state");
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
        return BundleKt.bundleOf(L5.x.a("state_remaining_state", super.onSaveInstanceState()), L5.x.a("state_on_behalf_of", this.f27237w));
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            z();
        }
    }

    public void setCardHint(String cardHint) {
        AbstractC3159y.i(cardHint, "cardHint");
        this.f27223i.setPlaceholderText(cardHint);
    }

    public void setCardInputListener(A a8) {
        this.f27229o = a8;
    }

    public void setCardNumber(String str) {
        this.f27217c.setText(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCardNumberErrorListener(StripeEditText.c listener) {
        AbstractC3159y.i(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3159y.i(cVar, "<set-?>");
        this.f27211A.setValue(this, f27209F[2], cVar);
    }

    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.f27217c.addTextChangedListener(textWatcher);
    }

    public void setCardValidCallback(L l8) {
        Iterator<T> it = getAllFields().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.f27230p);
        }
        if (l8 != null) {
            Iterator<T> it2 = getAllFields().iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.f27230p);
            }
        }
    }

    public void setCvcCode(String str) {
        this.f27220f.setText(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcErrorListener(StripeEditText.c listener) {
        AbstractC3159y.i(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3159y.i(cVar, "<set-?>");
        this.f27213C.setValue(this, f27209F[4], cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final /* synthetic */ void setCvcIcon(Integer num) {
        boolean z8;
        if (num != null) {
            C(this.f27220f, num.intValue());
        }
        if (num != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f27240z = z8;
    }

    public final void setCvcLabel(String str) {
        this.f27232r = str;
        B(this, null, 1, null);
    }

    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.f27220f.addTextChangedListener(textWatcher);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcPlaceholderText(String str) {
        this.f27233s = str;
        B(this, null, 1, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        Iterator it = this.f27228n.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(z8);
        }
        this.f27231q = z8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDateErrorListener(StripeEditText.c listener) {
        AbstractC3159y.i(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3159y.i(cVar, "<set-?>");
        this.f27212B.setValue(this, f27209F[3], cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDatePlaceholderRes(@StringRes Integer num) {
        setExpirationDatePlaceholderRes$payments_core_release(num);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.f27239y.setValue(this, f27209F[1], num);
    }

    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.f27219e.addTextChangedListener(textWatcher);
    }

    public final void setOnBehalfOf(String str) {
        if (!AbstractC3159y.d(this.f27237w, str)) {
            if (isAttachedToWindow()) {
                P.a(this, this.f27236v, new k(str));
            }
            this.f27237w = str;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setPostalCodeErrorListener(StripeEditText.c cVar) {
        setPostalCodeErrorListener$payments_core_release(cVar);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.c cVar) {
        this.f27214D.setValue(this, f27209F[5], cVar);
    }

    public final void setPostalCodeRequired(boolean z8) {
        this.f27234t = z8;
    }

    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.f27221g.addTextChangedListener(textWatcher);
    }

    public final void setPreferredNetworks(List<? extends EnumC1870e> preferredNetworks) {
        AbstractC3159y.i(preferredNetworks, "preferredNetworks");
        this.f27218d.setMerchantPreferredNetworks(preferredNetworks);
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z8) {
        boolean z9;
        if (this.f27238x != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f27238x = z8;
        if (z9) {
            z();
        }
    }

    public final void setShouldShowPostalCode(boolean z8) {
        this.f27215a = z8;
        o(z8);
    }

    public final void setUsZipCodeRequired(boolean z8) {
        this.f27235u.setValue(this, f27209F[0], Boolean.valueOf(z8));
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.f27236v = viewModelStoreOwner;
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i8, boolean z8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? true : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i8, boolean z8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27215a = z8;
        G2.j b8 = G2.j.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        this.f27216b = b8;
        CardNumberEditText etCardNumber = b8.f3138d;
        AbstractC3159y.h(etCardNumber, "etCardNumber");
        this.f27217c = etCardNumber;
        CardBrandView cardBrandView = b8.f3136b;
        AbstractC3159y.h(cardBrandView, "cardBrandView");
        this.f27218d = cardBrandView;
        ExpiryDateEditText etExpiry = b8.f3140f;
        AbstractC3159y.h(etExpiry, "etExpiry");
        this.f27219e = etExpiry;
        CvcEditText etCvc = b8.f3139e;
        AbstractC3159y.h(etCvc, "etCvc");
        this.f27220f = etCvc;
        PostalCodeEditText etPostalCode = b8.f3141g;
        AbstractC3159y.h(etPostalCode, "etPostalCode");
        this.f27221g = etPostalCode;
        LinearLayout secondRowLayout = b8.f3142h;
        AbstractC3159y.h(secondRowLayout, "secondRowLayout");
        this.f27222h = secondRowLayout;
        CardNumberTextInputLayout tlCardNumber = b8.f3143i;
        AbstractC3159y.h(tlCardNumber, "tlCardNumber");
        this.f27223i = tlCardNumber;
        TextInputLayout tlExpiry = b8.f3145k;
        AbstractC3159y.h(tlExpiry, "tlExpiry");
        this.f27224j = tlExpiry;
        TextInputLayout tlCvc = b8.f3144j;
        AbstractC3159y.h(tlCvc, "tlCvc");
        this.f27225k = tlCvc;
        TextInputLayout tlPostalCode = b8.f3146l;
        AbstractC3159y.h(tlPostalCode, "tlPostalCode");
        this.f27226l = tlPostalCode;
        this.f27227m = new C2451i0();
        List p8 = AbstractC1246t.p(tlCardNumber, tlExpiry, tlCvc, tlPostalCode);
        this.f27228n = p8;
        this.f27230p = new i();
        C1576a c1576a = C1576a.f13563a;
        this.f27235u = new l(Boolean.FALSE, this);
        this.f27239y = new m(Integer.valueOf(AbstractC3053E.f32889k0), this);
        this.f27211A = new n(new C2439c0(tlCardNumber), this);
        this.f27212B = new o(new C2439c0(tlExpiry), this);
        this.f27213C = new p(new C2439c0(tlCvc), this);
        this.f27214D = new q(new C2439c0(tlPostalCode), this);
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
        this.f27218d.setTintColorInt$payments_core_release(this.f27217c.getHintTextColors().getDefaultColor());
        this.f27217c.setCompletionCallback$payments_core_release(new b());
        this.f27217c.setBrandChangeCallback$payments_core_release(new c());
        this.f27217c.setImplicitCardBrandChangeCallback$payments_core_release(new d());
        this.f27217c.setPossibleCardBrandsCallback$payments_core_release(new e());
        this.f27219e.setCompletionCallback$payments_core_release(new f());
        this.f27220f.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.B
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.h(CardMultilineWidget.this, str);
            }
        });
        this.f27221g.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.C
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.i(CardMultilineWidget.this, str);
            }
        });
        o(this.f27215a);
        CardNumberEditText.B(this.f27217c, 0, 1, null);
        z();
        Iterator<T> it2 = getAllFields().iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new h());
        }
        this.f27217c.setLoadingCallback$payments_core_release(new a());
        this.f27221g.setConfig$payments_core_release(PostalCodeEditText.b.f27561a);
        this.f27231q = true;
        final int dimensionPixelSize = getResources().getDimensionPixelSize(j2.y.f33108b);
        this.f27218d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.D
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                CardMultilineWidget.j(dimensionPixelSize, this, view, i9, i10, i11, i12, i13, i14, i15, i16);
            }
        });
    }
}
