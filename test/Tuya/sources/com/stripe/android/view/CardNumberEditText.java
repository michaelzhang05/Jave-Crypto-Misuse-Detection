package com.stripe.android.view;

import L5.C1224h;
import M5.AbstractC1246t;
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
import b3.C1866a;
import b3.EnumC1870e;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import j2.AbstractC3053E;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.C3168c;
import l2.InterfaceC3167b;
import l2.f;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import x2.InterfaceC3873c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardNumberEditText extends StripeEditText {

    /* renamed from: A, reason: collision with root package name */
    private /* synthetic */ Function0 f27266A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f27267B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f27268C;

    /* renamed from: D, reason: collision with root package name */
    private final C3168c f27269D;

    /* renamed from: E, reason: collision with root package name */
    private /* synthetic */ Function1 f27270E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC2855x0 f27271F;

    /* renamed from: p, reason: collision with root package name */
    private P5.g f27272p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3167b f27273q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3873c f27274r;

    /* renamed from: s, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f27275s;

    /* renamed from: t, reason: collision with root package name */
    private ViewModelStoreOwner f27276t;

    /* renamed from: u, reason: collision with root package name */
    private EnumC1870e f27277u;

    /* renamed from: v, reason: collision with root package name */
    private /* synthetic */ Function1 f27278v;

    /* renamed from: w, reason: collision with root package name */
    private EnumC1870e f27279w;

    /* renamed from: x, reason: collision with root package name */
    private Function1 f27280x;

    /* renamed from: y, reason: collision with root package name */
    private List f27281y;

    /* renamed from: z, reason: collision with root package name */
    private /* synthetic */ Function1 f27282z;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f27283a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return j2.r.f33061c.a(this.f27283a).e();
        }
    }

    /* loaded from: classes4.dex */
    private final class b extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private int f27284a;

        /* renamed from: b, reason: collision with root package name */
        private int f27285b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f27286c;

        /* renamed from: d, reason: collision with root package name */
        private String f27287d;

        /* renamed from: e, reason: collision with root package name */
        private f.b f27288e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f27289f;

        public b() {
            this.f27288e = CardNumberEditText.this.getUnvalidatedCardNumber();
        }

        private final boolean a() {
            if (CardNumberEditText.this.getUnvalidatedCardNumber().f() > this.f27288e.f()) {
                return true;
            }
            return false;
        }

        private final boolean b() {
            if ((a() || !CardNumberEditText.this.f()) && this.f27287d != null) {
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
                CardNumberEditText.this.setTextSilent$payments_core_release(this.f27287d);
                Integer num = this.f27286c;
                if (num != null) {
                    CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                    cardNumberEditText.setSelection(d6.m.k(num.intValue(), 0, cardNumberEditText.getFieldText$payments_core_release().length()));
                }
            }
            this.f27287d = null;
            this.f27286c = null;
            if (CardNumberEditText.this.getUnvalidatedCardNumber().f() == CardNumberEditText.this.getPanLength$payments_core_release()) {
                boolean w8 = CardNumberEditText.this.w();
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                cardNumberEditText2.f27267B = cardNumberEditText2.y();
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
                cardNumberEditText3.f27267B = cardNumberEditText3.y();
                CardNumberEditText.this.setShouldShowError(true);
            } else {
                CardNumberEditText cardNumberEditText4 = CardNumberEditText.this;
                cardNumberEditText4.f27267B = cardNumberEditText4.y();
                CardNumberEditText.this.setShouldShowError(false);
            }
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f27289f = false;
            this.f27288e = CardNumberEditText.this.getUnvalidatedCardNumber();
            this.f27284a = i8;
            this.f27285b = i10;
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
            this.f27289f = d8;
            if (d8) {
                CardNumberEditText.this.A(bVar.e(bVar.f()).length());
            }
            if (this.f27289f) {
                panLength$payments_core_release = bVar.f();
            } else {
                panLength$payments_core_release = CardNumberEditText.this.getPanLength$payments_core_release();
            }
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            String e8 = bVar.e(panLength$payments_core_release);
            this.f27286c = Integer.valueOf(cardNumberEditText.v(e8.length(), this.f27284a, this.f27285b, panLength$payments_core_release));
            this.f27287d = e8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f27291a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27292b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            this.f27291a = parcelable;
            this.f27292b = z8;
        }

        public final boolean b() {
            return this.f27292b;
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
            return AbstractC3159y.d(this.f27291a, cVar.f27291a) && this.f27292b == cVar.f27292b;
        }

        public int hashCode() {
            Parcelable parcelable = this.f27291a;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27292b);
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.f27291a + ", isCbcEligible=" + this.f27292b + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f27291a, i8);
            out.writeInt(this.f27292b ? 1 : 0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements C3168c.a {
        d() {
        }

        @Override // l2.C3168c.a
        public void a(List accountRanges) {
            AbstractC3159y.i(accountRanges, "accountRanges");
            CardNumberEditText.B(CardNumberEditText.this, 0, 1, null);
            List list = accountRanges;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1866a) it.next()).c());
            }
            List<? extends EnumC1870e> e02 = AbstractC1246t.e0(arrayList);
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            EnumC1870e enumC1870e = (EnumC1870e) AbstractC1246t.M0(e02);
            if (enumC1870e == null) {
                enumC1870e = EnumC1870e.f14446w;
            }
            cardNumberEditText.setCardBrand$payments_core_release(enumC1870e);
            if (CardNumberEditText.this.f27268C) {
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                EnumC1870e enumC1870e2 = (EnumC1870e) AbstractC1246t.o0(e02);
                if (enumC1870e2 == null) {
                    enumC1870e2 = EnumC1870e.f14446w;
                }
                cardNumberEditText2.setImplicitCardBrandForCbc$payments_core_release(enumC1870e2);
                CardNumberEditText.this.setPossibleCardBrands$payments_core_release(e02);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(CardNumberEditText.this.f27268C);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f27295a = new f();

        f() {
            super(1);
        }

        public final void a(EnumC1870e it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC1870e) obj);
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f27296a = new g();

        g() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5555invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5555invoke();
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f27297a = new h();

        h() {
            super(1);
        }

        public final void a(EnumC1870e it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC1870e) obj);
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f27298a = new i();

        i() {
            super(1);
        }

        public final void invoke(boolean z8) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27299a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CardNumberEditText f27301a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.view.CardNumberEditText$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0688a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f27302a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CardNumberEditText f27303b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f27304c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0688a(CardNumberEditText cardNumberEditText, boolean z8, P5.d dVar) {
                    super(2, dVar);
                    this.f27303b = cardNumberEditText;
                    this.f27304c = z8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0688a(this.f27303b, this.f27304c, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((C0688a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f27302a == 0) {
                        L5.t.b(obj);
                        this.f27303b.x().invoke(kotlin.coroutines.jvm.internal.b.a(this.f27304c));
                        return L5.I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            a(CardNumberEditText cardNumberEditText) {
                this.f27301a = cardNumberEditText;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object g8 = AbstractC2825i.g(C2812b0.c(), new C0688a(this.f27301a, z8, null), dVar);
                if (g8 == Q5.b.e()) {
                    return g8;
                }
                return L5.I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f27299a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K a8 = CardNumberEditText.this.f27273q.a();
                a aVar = new a(CardNumberEditText.this);
                this.f27299a = 1;
                if (a8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3160z implements X5.n {

        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f27306a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f27307b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f27308c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f27309d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CardNumberEditText f27310e;

            /* renamed from: com.stripe.android.view.CardNumberEditText$k$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0689a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f27311a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f f27312b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CardNumberEditText f27313c;

                /* renamed from: com.stripe.android.view.CardNumberEditText$k$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0690a implements InterfaceC3359g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardNumberEditText f27314a;

                    public C0690a(CardNumberEditText cardNumberEditText) {
                        this.f27314a = cardNumberEditText;
                    }

                    @Override // l6.InterfaceC3359g
                    public final Object emit(Object obj, P5.d dVar) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        this.f27314a.f27268C = booleanValue;
                        List e8 = this.f27314a.getAccountRangeService().e();
                        ArrayList arrayList = new ArrayList(AbstractC1246t.x(e8, 10));
                        Iterator it = e8.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C1866a) it.next()).c());
                        }
                        List<? extends EnumC1870e> e02 = AbstractC1246t.e0(arrayList);
                        if (booleanValue) {
                            CardNumberEditText cardNumberEditText = this.f27314a;
                            EnumC1870e enumC1870e = (EnumC1870e) AbstractC1246t.o0(e02);
                            if (enumC1870e == null) {
                                enumC1870e = EnumC1870e.f14446w;
                            }
                            cardNumberEditText.setImplicitCardBrandForCbc$payments_core_release(enumC1870e);
                            this.f27314a.setPossibleCardBrands$payments_core_release(e02);
                        } else {
                            CardNumberEditText cardNumberEditText2 = this.f27314a;
                            EnumC1870e enumC1870e2 = (EnumC1870e) AbstractC1246t.M0(e02);
                            if (enumC1870e2 == null) {
                                enumC1870e2 = EnumC1870e.f14446w;
                            }
                            cardNumberEditText2.setCardBrand$payments_core_release(enumC1870e2);
                        }
                        return L5.I.f6487a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0689a(InterfaceC3358f interfaceC3358f, P5.d dVar, CardNumberEditText cardNumberEditText) {
                    super(2, dVar);
                    this.f27312b = interfaceC3358f;
                    this.f27313c = cardNumberEditText;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0689a(this.f27312b, dVar, this.f27313c);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((C0689a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f27311a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3358f interfaceC3358f = this.f27312b;
                        C0690a c0690a = new C0690a(this.f27313c);
                        this.f27311a = 1;
                        if (interfaceC3358f.collect(c0690a, this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC3358f interfaceC3358f, P5.d dVar, CardNumberEditText cardNumberEditText) {
                super(2, dVar);
                this.f27308c = state;
                this.f27309d = interfaceC3358f;
                this.f27310e = cardNumberEditText;
                this.f27307b = lifecycleOwner;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f27307b, this.f27308c, this.f27309d, dVar, this.f27310e);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f27306a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f27307b;
                    Lifecycle.State state = this.f27308c;
                    C0689a c0689a = new C0689a(this.f27309d, null, this.f27310e);
                    this.f27306a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c0689a, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }
        }

        k() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3159y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3159y.i(viewModel, "viewModel");
            InterfaceC3349K f8 = viewModel.f();
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, f8, null, cardNumberEditText), 3, null);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f27315a = new l();

        l() {
            super(1);
        }

        public final void invoke(List it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
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
        return getPanLength$payments_core_release() + l2.f.f33814a.a(getPanLength$payments_core_release()).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.b getUnvalidatedCardNumber() {
        return new f.b(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(Function0 tmp0) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(CardNumberEditText this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
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
        String string = getResources().getString(AbstractC3053E.f32870b, getText());
        AbstractC3159y.h(string, "getString(...)");
        return string;
    }

    public final C3168c getAccountRangeService() {
        return this.f27269D;
    }

    public final Function1 getBrandChangeCallback$payments_core_release() {
        return this.f27278v;
    }

    public final EnumC1870e getCardBrand() {
        return this.f27277u;
    }

    public final Function0 getCompletionCallback$payments_core_release() {
        return this.f27266A;
    }

    public final Function1 getImplicitCardBrandChangeCallback$payments_core_release() {
        return this.f27280x;
    }

    public final EnumC1870e getImplicitCardBrandForCbc$payments_core_release() {
        return this.f27279w;
    }

    public final int getPanLength$payments_core_release() {
        C1866a d8 = this.f27269D.d();
        if (d8 != null) {
            return d8.e();
        }
        C1866a a8 = this.f27269D.f().a(getUnvalidatedCardNumber());
        if (a8 != null) {
            return a8.e();
        }
        return 16;
    }

    public final List<EnumC1870e> getPossibleCardBrands$payments_core_release() {
        return this.f27281y;
    }

    public final Function1 getPossibleCardBrandsCallback$payments_core_release() {
        return this.f27282z;
    }

    public final f.c getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().l(getPanLength$payments_core_release());
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$payments_core_release() {
        return this.f27276t;
    }

    @VisibleForTesting
    public final P5.g getWorkContext() {
        return this.f27272p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        InterfaceC2855x0 d8;
        super.onAttachedToWindow();
        d8 = AbstractC2829k.d(i6.N.a(this.f27272p), null, null, new j(null), 3, null);
        this.f27271F = d8;
        P.a(this, this.f27276t, new k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC2855x0 interfaceC2855x0 = this.f27271F;
        if (interfaceC2855x0 != null) {
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        this.f27271F = null;
        this.f27269D.c();
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
            z8 = cVar.b();
        } else {
            z8 = false;
        }
        this.f27268C = z8;
        if (cVar != null && (superState = cVar.getSuperState()) != null) {
            parcelable = superState;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new c(super.onSaveInstanceState(), this.f27268C);
    }

    public final void setBrandChangeCallback$payments_core_release(Function1 callback) {
        AbstractC3159y.i(callback, "callback");
        this.f27278v = callback;
        callback.invoke(this.f27277u);
    }

    public final void setCardBrand$payments_core_release(EnumC1870e value) {
        AbstractC3159y.i(value, "value");
        EnumC1870e enumC1870e = this.f27277u;
        this.f27277u = value;
        if (value != enumC1870e) {
            this.f27278v.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setCompletionCallback$payments_core_release(Function0 function0) {
        AbstractC3159y.i(function0, "<set-?>");
        this.f27266A = function0;
    }

    public final void setImplicitCardBrandChangeCallback$payments_core_release(Function1 callback) {
        AbstractC3159y.i(callback, "callback");
        this.f27280x = callback;
        callback.invoke(this.f27279w);
    }

    public final void setImplicitCardBrandForCbc$payments_core_release(EnumC1870e value) {
        AbstractC3159y.i(value, "value");
        EnumC1870e enumC1870e = this.f27279w;
        this.f27279w = value;
        if (value != enumC1870e) {
            this.f27280x.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setLoadingCallback$payments_core_release(Function1 function1) {
        AbstractC3159y.i(function1, "<set-?>");
        this.f27270E = function1;
    }

    public final void setPossibleCardBrands$payments_core_release(List<? extends EnumC1870e> value) {
        AbstractC3159y.i(value, "value");
        List list = this.f27281y;
        this.f27281y = value;
        if (!AbstractC3159y.d(value, list)) {
            this.f27282z.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setPossibleCardBrandsCallback$payments_core_release(Function1 callback) {
        AbstractC3159y.i(callback, "callback");
        this.f27282z = callback;
        callback.invoke(this.f27281y);
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.f27276t = viewModelStoreOwner;
    }

    public final void setWorkContext(P5.g gVar) {
        AbstractC3159y.i(gVar, "<set-?>");
        this.f27272p = gVar;
    }

    public final /* synthetic */ int v(int i8, int i9, int i10, int i11) {
        int i12;
        Set a8 = l2.f.f33814a.a(i11);
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
                    AbstractC1246t.v();
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
        return this.f27267B;
    }

    public final Function1 x() {
        return this.f27270E;
    }

    public final /* synthetic */ void z() {
        this.f27274r.a(PaymentAnalyticsRequestFactory.v(this.f27275s, PaymentAnalyticsEvent.f24809B0, null, null, null, null, null, 62, null));
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i8, P5.g gVar, P5.g gVar2, InterfaceC3167b interfaceC3167b, l2.p pVar, InterfaceC3873c interfaceC3873c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8, gVar, gVar2, interfaceC3167b, (i9 & 64) != 0 ? new l2.k() : pVar, interfaceC3873c, paymentAnalyticsRequestFactory, (i9 & 512) != 0 ? null : viewModelStoreOwner);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i8, P5.g uiContext, P5.g workContext, InterfaceC3167b cardAccountRangeRepository, l2.p staticCardAccountRanges, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(uiContext, "uiContext");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3159y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.f27272p = workContext;
        this.f27273q = cardAccountRangeRepository;
        this.f27274r = analyticsRequestExecutor;
        this.f27275s = paymentAnalyticsRequestFactory;
        this.f27276t = viewModelStoreOwner;
        EnumC1870e enumC1870e = EnumC1870e.f14446w;
        this.f27277u = enumC1870e;
        this.f27278v = f.f27295a;
        this.f27279w = enumC1870e;
        this.f27280x = h.f27297a;
        this.f27281y = AbstractC1246t.m();
        this.f27282z = l.f27315a;
        this.f27266A = g.f27296a;
        this.f27269D = new C3168c(cardAccountRangeRepository, uiContext, this.f27272p, staticCardAccountRanges, new d(), new e());
        this.f27270E = i.f27298a;
        j();
        setErrorMessage(getResources().getString(AbstractC3053E.f32909u0));
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

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, C2812b0.c(), C2812b0.b(), new a(context));
        AbstractC3159y.i(context, "context");
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i8, P5.g gVar, P5.g gVar2, final Function0 function0) {
        this(context, attributeSet, i8, gVar, gVar2, new l2.j(context).a(), new l2.k(), new x2.m(), new PaymentAnalyticsRequestFactory(context, new I5.a() { // from class: com.stripe.android.view.J
            @Override // I5.a
            public final Object get() {
                String n8;
                n8 = CardNumberEditText.n(Function0.this);
                return n8;
            }
        }), null, 512, null);
    }
}
