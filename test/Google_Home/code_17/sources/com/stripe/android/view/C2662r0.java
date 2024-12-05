package com.stripe.android.view;

import P5.AbstractC1378t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import d6.AbstractC2757b;
import d6.C2756a;
import d6.InterfaceC2760e;
import e3.C2779C;
import e3.C2780D;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2662r0 extends PagerAdapter {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ h6.i[] f28964j = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(C2662r0.class, "shippingMethods", "getShippingMethods$payments_core_release()Ljava/util/List;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(C2662r0.class, "selectedShippingMethod", "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final int f28965k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f28966a;

    /* renamed from: b, reason: collision with root package name */
    private final m2.u f28967b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f28968c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f28969d;

    /* renamed from: e, reason: collision with root package name */
    private C2779C f28970e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28971f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28972g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC2760e f28973h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC2760e f28974i;

    /* renamed from: com.stripe.android.view.r0$a */
    /* loaded from: classes4.dex */
    public static abstract class a extends RecyclerView.ViewHolder {
        public /* synthetic */ a(View view, AbstractC3247p abstractC3247p) {
            this(view);
        }

        /* renamed from: com.stripe.android.view.r0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0690a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final ShippingInfoWidget f28975a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public C0690a(J2.r r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.widget.ScrollView r0 = r3.getRoot()
                    java.lang.String r1 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.ShippingInfoWidget r3 = r3.f4891b
                    java.lang.String r0 = "shippingInfoWidget"
                    kotlin.jvm.internal.AbstractC3255y.h(r3, r0)
                    r2.f28975a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2662r0.a.C0690a.<init>(J2.r):void");
            }

            public final void a(m2.u paymentSessionConfig, C2779C c2779c, Set allowedShippingCountryCodes) {
                AbstractC3255y.i(paymentSessionConfig, "paymentSessionConfig");
                AbstractC3255y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
                this.f28975a.setHiddenFields(paymentSessionConfig.b());
                this.f28975a.setOptionalFields(paymentSessionConfig.g());
                this.f28975a.setAllowedCountryCodes(allowedShippingCountryCodes);
                this.f28975a.h(c2779c);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public C0690a(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    J2.r r3 = J2.r.c(r0, r3, r1)
                    java.lang.String r0 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2662r0.a.C0690a.<init>(android.view.ViewGroup):void");
            }
        }

        /* renamed from: com.stripe.android.view.r0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final SelectShippingMethodWidget f28976a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public b(J2.s r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.SelectShippingMethodWidget r3 = r3.f4893b
                    java.lang.String r0 = "selectShippingMethodWidget"
                    kotlin.jvm.internal.AbstractC3255y.h(r3, r0)
                    r2.f28976a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2662r0.a.b.<init>(J2.s):void");
            }

            public final void a(List shippingMethods, C2780D c2780d, Function1 onShippingMethodSelectedCallback) {
                AbstractC3255y.i(shippingMethods, "shippingMethods");
                AbstractC3255y.i(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
                this.f28976a.setShippingMethods(shippingMethods);
                this.f28976a.setShippingMethodSelectedCallback(onShippingMethodSelectedCallback);
                if (c2780d != null) {
                    this.f28976a.setSelectedShippingMethod(c2780d);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public b(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    J2.s r3 = J2.s.c(r0, r3, r1)
                    java.lang.String r0 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2662r0.a.b.<init>(android.view.ViewGroup):void");
            }
        }

        private a(View view) {
            super(view);
        }
    }

    /* renamed from: com.stripe.android.view.r0$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28977a;

        static {
            int[] iArr = new int[EnumC2661q0.values().length];
            try {
                iArr[EnumC2661q0.f28959b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2661q0.f28960c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28977a = iArr;
        }
    }

    /* renamed from: com.stripe.android.view.r0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2662r0 f28978b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, C2662r0 c2662r0) {
            super(obj);
            this.f28978b = c2662r0;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            this.f28978b.f28972g = !AbstractC3255y.d((List) obj2, (List) obj);
        }
    }

    /* renamed from: com.stripe.android.view.r0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2662r0 f28979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, C2662r0 c2662r0) {
            super(obj);
            this.f28979b = c2662r0;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            this.f28979b.f28972g = !AbstractC3255y.d((C2780D) obj2, (C2780D) obj);
        }
    }

    public C2662r0(Context context, m2.u paymentSessionConfig, Set allowedShippingCountryCodes, Function1 onShippingMethodSelectedCallback) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(paymentSessionConfig, "paymentSessionConfig");
        AbstractC3255y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        AbstractC3255y.i(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
        this.f28966a = context;
        this.f28967b = paymentSessionConfig;
        this.f28968c = allowedShippingCountryCodes;
        this.f28969d = onShippingMethodSelectedCallback;
        C2756a c2756a = C2756a.f31226a;
        this.f28973h = new c(AbstractC1378t.m(), this);
        this.f28974i = new d(null, this);
    }

    private final List c() {
        EnumC2661q0 enumC2661q0 = EnumC2661q0.f28959b;
        EnumC2661q0 enumC2661q02 = null;
        if (!this.f28967b.p()) {
            enumC2661q0 = null;
        }
        EnumC2661q0 enumC2661q03 = EnumC2661q0.f28960c;
        if (this.f28967b.s() && (!this.f28967b.p() || this.f28971f)) {
            enumC2661q02 = enumC2661q03;
        }
        return AbstractC1378t.r(enumC2661q0, enumC2661q02);
    }

    public final EnumC2661q0 b(int i8) {
        return (EnumC2661q0) AbstractC1378t.p0(c(), i8);
    }

    public final C2780D d() {
        return (C2780D) this.f28974i.getValue(this, f28964j[1]);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup collection, int i8, Object view) {
        AbstractC3255y.i(collection, "collection");
        AbstractC3255y.i(view, "view");
        collection.removeView((View) view);
    }

    public final List e() {
        return (List) this.f28973h.getValue(this, f28964j[0]);
    }

    public final void f(C2780D c2780d) {
        this.f28974i.setValue(this, f28964j[1], c2780d);
    }

    public final void g(boolean z8) {
        this.f28971f = z8;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return c().size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        AbstractC3255y.i(obj, "obj");
        if ((obj instanceof View) && ((View) obj).getTag() == EnumC2661q0.f28960c && this.f28972g) {
            this.f28972g = false;
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i8) {
        return this.f28966a.getString(((EnumC2661q0) c().get(i8)).b());
    }

    public final void h(C2779C c2779c) {
        this.f28970e = c2779c;
        notifyDataSetChanged();
    }

    public final void i(List list) {
        AbstractC3255y.i(list, "<set-?>");
        this.f28973h.setValue(this, f28964j[0], list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup collection, int i8) {
        RecyclerView.ViewHolder c0690a;
        AbstractC3255y.i(collection, "collection");
        EnumC2661q0 enumC2661q0 = (EnumC2661q0) c().get(i8);
        int i9 = b.f28977a[enumC2661q0.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                c0690a = new a.b(collection);
            } else {
                throw new O5.p();
            }
        } else {
            c0690a = new a.C0690a(collection);
        }
        if (c0690a instanceof a.C0690a) {
            ((a.C0690a) c0690a).a(this.f28967b, this.f28970e, this.f28968c);
        } else if (c0690a instanceof a.b) {
            ((a.b) c0690a).a(e(), d(), this.f28969d);
        }
        collection.addView(c0690a.itemView);
        c0690a.itemView.setTag(enumC2661q0);
        View itemView = c0690a.itemView;
        AbstractC3255y.h(itemView, "itemView");
        return itemView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object o8) {
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(o8, "o");
        return view == o8;
    }
}
