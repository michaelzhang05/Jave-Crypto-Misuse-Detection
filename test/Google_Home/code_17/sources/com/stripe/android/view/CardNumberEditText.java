package com.stripe.android.view;

import A2.InterfaceC0945c;
import O5.C1352h;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import e3.C2787a;
import e3.EnumC2791e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import m2.AbstractC3407E;
import o2.C3516c;
import o2.InterfaceC3515b;
import o2.f;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardNumberEditText extends StripeEditText {

    /* renamed from: A, reason: collision with root package name */
    private /* synthetic */ Function0 f28321A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f28322B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f28323C;

    /* renamed from: D, reason: collision with root package name */
    private final C3516c f28324D;

    /* renamed from: E, reason: collision with root package name */
    private /* synthetic */ Function1 f28325E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC3390x0 f28326F;

    /* renamed from: p, reason: collision with root package name */
    private S5.g f28327p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3515b f28328q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC0945c f28329r;

    /* renamed from: s, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f28330s;

    /* renamed from: t, reason: collision with root package name */
    private ViewModelStoreOwner f28331t;

    /* renamed from: u, reason: collision with root package name */
    private EnumC2791e f28332u;

    /* renamed from: v, reason: collision with root package name */
    private /* synthetic */ Function1 f28333v;

    /* renamed from: w, reason: collision with root package name */
    private EnumC2791e f28334w;

    /* renamed from: x, reason: collision with root package name */
    private Function1 f28335x;

    /* renamed from: y, reason: collision with root package name */
    private List f28336y;

    /* renamed from: z, reason: collision with root package name */
    private /* synthetic */ Function1 f28337z;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28338a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f28338a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return m2.r.f35037c.a(this.f28338a).g();
        }
    }

    /* loaded from: classes4.dex */
    private final class b extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private int f28339a;

        /* renamed from: b, reason: collision with root package name */
        private int f28340b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f28341c;

        /* renamed from: d, reason: collision with root package name */
        private String f28342d;

        /* renamed from: e, reason: collision with root package name */
        private f.b f28343e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f28344f;

        public b() {
            this.f28343e = CardNumberEditText.this.getUnvalidatedCardNumber();
        }

        private final boolean a() {
            if (CardNumberEditText.this.getUnvalidatedCardNumber().f() > this.f28343e.f()) {
                return true;
            }
            return false;
        }

        private final boolean b() {
            if ((a() || !CardNumberEditText.this.f()) && this.f28342d != null) {
                return true;
            }
            return false;
        }

        private final boolean c(boolean z8) {
            if (!z8 && (CardNumberEditText.this.getUnvalidatedCardNumber().h() || (CardNumberEditText.this.y() && CardNumberEditText.this.getAccountRangeService().d() != null))) {
                return true;
            }
            return false;
        }

        private final boolean d(int i8, int i9, int i10, f.b bVar) {
            if (i10 > i9 && i8 == 0 && bVar.g().length() >= 14) {
                return true;
            }
            return false;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (b()) {
                CardNumberEditText.this.setTextSilent$payments_core_release(this.f28342d);
                Integer num = this.f28341c;
                if (num != null) {
                    CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                    cardNumberEditText.setSelection(g6.m.k(num.intValue(), 0, cardNumberEditText.getFieldText$payments_core_release().length()));
                }
            }
            this.f28342d = null;
            this.f28341c = null;
            if (CardNumberEditText.this.getUnvalidatedCardNumber().f() == CardNumberEditText.this.getPanLength$payments_core_release()) {
                boolean w8 = CardNumberEditText.this.w();
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                cardNumberEditText2.f28322B = cardNumberEditText2.y();
                CardNumberEditText.this.setShouldShowError(!r0.y());
                if (CardNumberEditText.this.getAccountRangeService().d() == null && CardNumberEditText.this.getUnvalidatedCardNumber().k()) {
                    CardNumberEditText.this.z();
                }
                if (c(w8)) {
                    CardNumberEditText.this.getCompletionCallback$payments_core_release().invoke();
                    return;
                }
                return;
            }
            if (CardNumberEditText.this.getUnvalidatedCardNumber().i(CardNumberEditText.this.getPanLength$payments_core_release()) && !CardNumberEditText.this.getUnvalidatedCardNumber().j()) {
                CardNumberEditText cardNumberEditText3 = CardNumberEditText.this;
                cardNumberEditText3.f28322B = cardNumberEditText3.y();
                CardNumberEditText.this.setShouldShowError(true);
            } else {
                CardNumberEditText cardNumberEditText4 = CardNumberEditText.this;
                cardNumberEditText4.f28322B = cardNumberEditText4.y();
                CardNumberEditText.this.setShouldShowError(false);
            }
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f28344f = false;
            this.f28343e = CardNumberEditText.this.getUnvalidatedCardNumber();
            this.f28339a = i8;
            this.f28340b = i10;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            String str;
            int panLength$payments_core_release;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            f.b bVar = new f.b(str);
            CardNumberEditText.this.getAccountRangeService().h(bVar);
            boolean d8 = d(i8, i9, i10, bVar);
            this.f28344f = d8;
            if (d8) {
                CardNumberEditText.this.A(bVar.e(bVar.f()).length());
            }
            if (this.f28344f) {
                panLength$payments_core_release = bVar.f();
            } else {
                panLength$payments_core_release = CardNumberEditText.this.getPanLength$payments_core_release();
            }
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            String e8 = bVar.e(panLength$payments_core_release);
            this.f28341c = Integer.valueOf(cardNumberEditText.v(e8.length(), this.f28339a, this.f28340b, panLength$payments_core_release));
            this.f28342d = e8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f28346a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f28347b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(Parcelable parcelable, boolean z8) {
            super(parcelable);
            this.f28346a = parcelable;
            this.f28347b = z8;
        }

        public final boolean a() {
            return this.f28347b;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3255y.d(this.f28346a, cVar.f28346a) && this.f28347b == cVar.f28347b;
        }

        public int hashCode() {
            Parcelable parcelable = this.f28346a;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f28347b);
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.f28346a + ", isCbcEligible=" + this.f28347b + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f28346a, i8);
            out.writeInt(this.f28347b ? 1 : 0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements C3516c.a {
        d() {
        }

        @Override // o2.C3516c.a
        public void a(List accountRanges) {
            AbstractC3255y.i(accountRanges, "accountRanges");
            CardNumberEditText.B(CardNumberEditText.this, 0, 1, null);
            List list = accountRanges;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2787a) it.next()).b());
            }
            List<? extends EnumC2791e> e02 = AbstractC1378t.e0(arrayList);
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            EnumC2791e enumC2791e = (EnumC2791e) AbstractC1378t.M0(e02);
            if (enumC2791e == null) {
                enumC2791e = EnumC2791e.f31452w;
            }
            cardNumberEditText.setCardBrand$payments_core_release(enumC2791e);
            if (CardNumberEditText.this.f28323C) {
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                EnumC2791e enumC2791e2 = (EnumC2791e) AbstractC1378t.o0(e02);
                if (enumC2791e2 == null) {
                    enumC2791e2 = EnumC2791e.f31452w;
                }
                cardNumberEditText2.setImplicitCardBrandForCbc$payments_core_release(enumC2791e2);
                CardNumberEditText.this.setPossibleCardBrands$payments_core_release(e02);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(CardNumberEditText.this.f28323C);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f28350a = new f();

        f() {
            super(1);
        }

        public final void a(EnumC2791e it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC2791e) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f28351a = new g();

        g() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5559invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5559invoke();
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f28352a = new h();

        h() {
            super(1);
        }

        public final void a(EnumC2791e it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC2791e) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f28353a = new i();

        i() {
            super(1);
        }

        public final void invoke(boolean z8) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28354a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CardNumberEditText f28356a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.view.CardNumberEditText$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0684a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f28357a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CardNumberEditText f28358b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f28359c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0684a(CardNumberEditText cardNumberEditText, boolean z8, S5.d dVar) {
                    super(2, dVar);
                    this.f28358b = cardNumberEditText;
                    this.f28359c = z8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0684a(this.f28358b, this.f28359c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f28357a == 0) {
                        O5.t.b(obj);
                        this.f28358b.x().invoke(kotlin.coroutines.jvm.internal.b.a(this.f28359c));
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((C0684a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            a(CardNumberEditText cardNumberEditText) {
                this.f28356a = cardNumberEditText;
            }

            public final Object a(boolean z8, S5.d dVar) {
                Object g8 = AbstractC3360i.g(C3347b0.c(), new C0684a(this.f28356a, z8, null), dVar);
                if (g8 == T5.b.e()) {
                    return g8;
                }
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f28354a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L a8 = CardNumberEditText.this.f28328q.a();
                a aVar = new a(CardNumberEditText.this);
                this.f28354a = 1;
                if (a8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3256z implements InterfaceC1668n {

        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f28361a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f28362b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f28363c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f f28364d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CardNumberEditText f28365e;

            /* renamed from: com.stripe.android.view.CardNumberEditText$k$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0685a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f28366a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f f28367b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CardNumberEditText f28368c;

                /* renamed from: com.stripe.android.view.CardNumberEditText$k$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0686a implements InterfaceC3707g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardNumberEditText f28369a;

                    public C0686a(CardNumberEditText cardNumberEditText) {
                        this.f28369a = cardNumberEditText;
                    }

                    @Override // o6.InterfaceC3707g
                    public final Object emit(Object obj, S5.d dVar) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        this.f28369a.f28323C = booleanValue;
                        List e8 = this.f28369a.getAccountRangeService().e();
                        ArrayList arrayList = new ArrayList(AbstractC1378t.x(e8, 10));
                        Iterator it = e8.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C2787a) it.next()).b());
                        }
                        List<? extends EnumC2791e> e02 = AbstractC1378t.e0(arrayList);
                        if (booleanValue) {
                            CardNumberEditText cardNumberEditText = this.f28369a;
                            EnumC2791e enumC2791e = (EnumC2791e) AbstractC1378t.o0(e02);
                            if (enumC2791e == null) {
                                enumC2791e = EnumC2791e.f31452w;
                            }
                            cardNumberEditText.setImplicitCardBrandForCbc$payments_core_release(enumC2791e);
                            this.f28369a.setPossibleCardBrands$payments_core_release(e02);
                        } else {
                            CardNumberEditText cardNumberEditText2 = this.f28369a;
                            EnumC2791e enumC2791e2 = (EnumC2791e) AbstractC1378t.M0(e02);
                            if (enumC2791e2 == null) {
                                enumC2791e2 = EnumC2791e.f31452w;
                            }
                            cardNumberEditText2.setCardBrand$payments_core_release(enumC2791e2);
                        }
                        return O5.I.f8278a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0685a(InterfaceC3706f interfaceC3706f, S5.d dVar, CardNumberEditText cardNumberEditText) {
                    super(2, dVar);
                    this.f28367b = interfaceC3706f;
                    this.f28368c = cardNumberEditText;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0685a(this.f28367b, dVar, this.f28368c);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f28366a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3706f interfaceC3706f = this.f28367b;
                        C0686a c0686a = new C0686a(this.f28368c);
                        this.f28366a = 1;
                        if (interfaceC3706f.collect(c0686a, this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((C0685a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC3706f interfaceC3706f, S5.d dVar, CardNumberEditText cardNumberEditText) {
                super(2, dVar);
                this.f28363c = state;
                this.f28364d = interfaceC3706f;
                this.f28365e = cardNumberEditText;
                this.f28362b = lifecycleOwner;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f28362b, this.f28363c, this.f28364d, dVar, this.f28365e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f28361a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f28362b;
                    Lifecycle.State state = this.f28363c;
                    C0685a c0685a = new C0685a(this.f28364d, null, this.f28365e);
                    this.f28361a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c0685a, this) == e8) {
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

        k() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3255y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3255y.i(viewModel, "viewModel");
            InterfaceC3698L f8 = viewModel.f();
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, f8, null, cardNumberEditText), 3, null);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f28370a = new l();

        l() {
            super(1);
        }

        public final void invoke(List it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    public static /* synthetic */ void B(CardNumberEditText cardNumberEditText, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = cardNumberEditText.getFormattedPanLength();
        }
        cardNumberEditText.A(i8);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getCardBrand$annotations() {
    }

    private final int getFormattedPanLength() {
        return getPanLength$payments_core_release() + o2.f.f35815a.a(getPanLength$payments_core_release()).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.b getUnvalidatedCardNumber() {
        return new f.b(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(Function0 tmp0) {
        AbstractC3255y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(CardNumberEditText this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (!z8 && this$0.getUnvalidatedCardNumber().i(this$0.getPanLength$payments_core_release())) {
            this$0.setShouldShowError(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        if (getValidatedCardNumber$payments_core_release() != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void A(int i8) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i8)});
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(AbstractC3407E.f34846b, getText());
        AbstractC3255y.h(string, "getString(...)");
        return string;
    }

    public final C3516c getAccountRangeService() {
        return this.f28324D;
    }

    public final Function1 getBrandChangeCallback$payments_core_release() {
        return this.f28333v;
    }

    public final EnumC2791e getCardBrand() {
        return this.f28332u;
    }

    public final Function0 getCompletionCallback$payments_core_release() {
        return this.f28321A;
    }

    public final Function1 getImplicitCardBrandChangeCallback$payments_core_release() {
        return this.f28335x;
    }

    public final EnumC2791e getImplicitCardBrandForCbc$payments_core_release() {
        return this.f28334w;
    }

    public final int getPanLength$payments_core_release() {
        C2787a d8 = this.f28324D.d();
        if (d8 != null) {
            return d8.g();
        }
        C2787a a8 = this.f28324D.f().a(getUnvalidatedCardNumber());
        if (a8 != null) {
            return a8.g();
        }
        return 16;
    }

    public final List<EnumC2791e> getPossibleCardBrands$payments_core_release() {
        return this.f28336y;
    }

    public final Function1 getPossibleCardBrandsCallback$payments_core_release() {
        return this.f28337z;
    }

    public final f.c getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().l(getPanLength$payments_core_release());
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$payments_core_release() {
        return this.f28331t;
    }

    @VisibleForTesting
    public final S5.g getWorkContext() {
        return this.f28327p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        InterfaceC3390x0 d8;
        super.onAttachedToWindow();
        d8 = AbstractC3364k.d(l6.N.a(this.f28327p), null, null, new j(null), 3, null);
        this.f28326F = d8;
        P.a(this, this.f28331t, new k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC3390x0 interfaceC3390x0 = this.f28326F;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        this.f28326F = null;
        this.f28324D.c();
        super.onDetachedFromWindow();
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        c cVar;
        boolean z8;
        Parcelable superState;
        if (parcelable instanceof c) {
            cVar = (c) parcelable;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            z8 = cVar.a();
        } else {
            z8 = false;
        }
        this.f28323C = z8;
        if (cVar != null && (superState = cVar.getSuperState()) != null) {
            parcelable = superState;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new c(super.onSaveInstanceState(), this.f28323C);
    }

    public final void setBrandChangeCallback$payments_core_release(Function1 callback) {
        AbstractC3255y.i(callback, "callback");
        this.f28333v = callback;
        callback.invoke(this.f28332u);
    }

    public final void setCardBrand$payments_core_release(EnumC2791e value) {
        AbstractC3255y.i(value, "value");
        EnumC2791e enumC2791e = this.f28332u;
        this.f28332u = value;
        if (value != enumC2791e) {
            this.f28333v.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setCompletionCallback$payments_core_release(Function0 function0) {
        AbstractC3255y.i(function0, "<set-?>");
        this.f28321A = function0;
    }

    public final void setImplicitCardBrandChangeCallback$payments_core_release(Function1 callback) {
        AbstractC3255y.i(callback, "callback");
        this.f28335x = callback;
        callback.invoke(this.f28334w);
    }

    public final void setImplicitCardBrandForCbc$payments_core_release(EnumC2791e value) {
        AbstractC3255y.i(value, "value");
        EnumC2791e enumC2791e = this.f28334w;
        this.f28334w = value;
        if (value != enumC2791e) {
            this.f28335x.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setLoadingCallback$payments_core_release(Function1 function1) {
        AbstractC3255y.i(function1, "<set-?>");
        this.f28325E = function1;
    }

    public final void setPossibleCardBrands$payments_core_release(List<? extends EnumC2791e> value) {
        AbstractC3255y.i(value, "value");
        List list = this.f28336y;
        this.f28336y = value;
        if (!AbstractC3255y.d(value, list)) {
            this.f28337z.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setPossibleCardBrandsCallback$payments_core_release(Function1 callback) {
        AbstractC3255y.i(callback, "callback");
        this.f28337z = callback;
        callback.invoke(this.f28336y);
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.f28331t = viewModelStoreOwner;
    }

    public final void setWorkContext(S5.g gVar) {
        AbstractC3255y.i(gVar, "<set-?>");
        this.f28327p = gVar;
    }

    public final /* synthetic */ int v(int i8, int i9, int i10, int i11) {
        int i12;
        Set a8 = o2.f.f35815a.a(i11);
        boolean z8 = a8 instanceof Collection;
        boolean z9 = false;
        if (z8 && a8.isEmpty()) {
            i12 = 0;
        } else {
            Iterator it = a8.iterator();
            i12 = 0;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (i9 <= intValue && i9 + i10 >= intValue && (i12 = i12 + 1) < 0) {
                    AbstractC1378t.v();
                }
            }
        }
        if (!z8 || !a8.isEmpty()) {
            Iterator it2 = a8.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int intValue2 = ((Number) it2.next()).intValue();
                if (i10 == 0 && i9 == intValue2 + 1) {
                    z9 = true;
                    break;
                }
            }
        }
        int i13 = i9 + i10 + i12;
        if (z9 && i13 > 0) {
            i13--;
        }
        if (i13 <= i8) {
            return i13;
        }
        return i8;
    }

    public final boolean w() {
        return this.f28322B;
    }

    public final Function1 x() {
        return this.f28325E;
    }

    public final /* synthetic */ void z() {
        this.f28329r.a(PaymentAnalyticsRequestFactory.v(this.f28330s, PaymentAnalyticsEvent.f25864B0, null, null, null, null, null, 62, null));
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i8, S5.g gVar, S5.g gVar2, InterfaceC3515b interfaceC3515b, o2.p pVar, InterfaceC0945c interfaceC0945c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8, gVar, gVar2, interfaceC3515b, (i9 & 64) != 0 ? new o2.k() : pVar, interfaceC0945c, paymentAnalyticsRequestFactory, (i9 & 512) != 0 ? null : viewModelStoreOwner);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i8, S5.g uiContext, S5.g workContext, InterfaceC3515b cardAccountRangeRepository, o2.p staticCardAccountRanges, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(uiContext, "uiContext");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3255y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.f28327p = workContext;
        this.f28328q = cardAccountRangeRepository;
        this.f28329r = analyticsRequestExecutor;
        this.f28330s = paymentAnalyticsRequestFactory;
        this.f28331t = viewModelStoreOwner;
        EnumC2791e enumC2791e = EnumC2791e.f31452w;
        this.f28332u = enumC2791e;
        this.f28333v = f.f28350a;
        this.f28334w = enumC2791e;
        this.f28335x = h.f28352a;
        this.f28336y = AbstractC1378t.m();
        this.f28337z = l.f28370a;
        this.f28321A = g.f28351a;
        this.f28324D = new C3516c(cardAccountRangeRepository, uiContext, this.f28327p, staticCardAccountRanges, new d(), new e());
        this.f28325E = i.f28353a;
        j();
        setErrorMessage(getResources().getString(AbstractC3407E.f34885u0));
        addTextChangedListener(new b());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.K
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardNumberEditText.o(CardNumberEditText.this, view, z8);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER});
        }
        B(this, 0, 1, null);
        setLayoutDirection(0);
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, C3347b0.c(), C3347b0.b(), new a(context));
        AbstractC3255y.i(context, "context");
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i8, S5.g gVar, S5.g gVar2, final Function0 function0) {
        this(context, attributeSet, i8, gVar, gVar2, new o2.j(context).a(), new o2.k(), new A2.m(), new PaymentAnalyticsRequestFactory(context, new L5.a() { // from class: com.stripe.android.view.J
            @Override // L5.a
            public final Object get() {
                String n8;
                n8 = CardNumberEditText.n(Function0.this);
                return n8;
            }
        }), null, 512, null);
    }
}
