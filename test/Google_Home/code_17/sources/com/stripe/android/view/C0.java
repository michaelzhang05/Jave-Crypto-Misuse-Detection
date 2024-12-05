package com.stripe.android.view;

import P5.AbstractC1378t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.o;
import com.stripe.android.view.C2634d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3403A;
import m2.AbstractC3407E;

/* loaded from: classes4.dex */
public final class C0 extends RecyclerView.Adapter {

    /* renamed from: k, reason: collision with root package name */
    public static final a f28223k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f28224l = 8;

    /* renamed from: m, reason: collision with root package name */
    private static final long f28225m = -2057760476;

    /* renamed from: a, reason: collision with root package name */
    private final List f28226a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28227b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28228c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28229d;

    /* renamed from: e, reason: collision with root package name */
    private final List f28230e;

    /* renamed from: f, reason: collision with root package name */
    private String f28231f;

    /* renamed from: g, reason: collision with root package name */
    private b f28232g;

    /* renamed from: h, reason: collision with root package name */
    private final int f28233h;

    /* renamed from: i, reason: collision with root package name */
    private final C2634d f28234i;

    /* renamed from: j, reason: collision with root package name */
    private final C2634d f28235j;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(com.stripe.android.model.o oVar);

        void b();

        void c(C2634d c2634d);

        void d(com.stripe.android.model.o oVar);
    }

    /* loaded from: classes4.dex */
    public static abstract class c extends RecyclerView.ViewHolder {
        public /* synthetic */ c(View view, AbstractC3247p abstractC3247p) {
            this(view);
        }

        /* loaded from: classes4.dex */
        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            private final J2.m f28238a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d(J2.m r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f28238a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C0.c.d.<init>(J2.m):void");
            }

            public final void a(com.stripe.android.model.o paymentMethod) {
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f28238a.f4872b.setPaymentMethod(paymentMethod);
            }

            public final void b(boolean z8) {
                this.f28238a.f4872b.setSelected(z8);
                this.itemView.setSelected(z8);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    J2.m r3 = J2.m.c(r0, r3, r1)
                    java.lang.String r0 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C0.c.d.<init>(android.view.ViewGroup):void");
            }
        }

        private c(View view) {
            super(view);
        }

        /* renamed from: com.stripe.android.view.C0$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0680c extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            private final J2.l f28236a;

            /* renamed from: b, reason: collision with root package name */
            private final S0 f28237b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0680c(J2.l viewBinding) {
                super(viewBinding.getRoot());
                AbstractC3255y.i(viewBinding, "viewBinding");
                this.f28236a = viewBinding;
                Context context = this.itemView.getContext();
                AbstractC3255y.h(context, "getContext(...)");
                S0 s02 = new S0(context);
                this.f28237b = s02;
                ImageViewCompat.setImageTintList(viewBinding.f4869b, ColorStateList.valueOf(s02.d(true)));
            }

            public final void a(boolean z8) {
                int i8;
                this.f28236a.f4870c.setTextColor(ColorStateList.valueOf(this.f28237b.c(z8)));
                AppCompatImageView appCompatImageView = this.f28236a.f4869b;
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = 4;
                }
                appCompatImageView.setVisibility(i8);
                this.itemView.setSelected(z8);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public C0680c(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3255y.i(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    J2.l r2 = J2.l.c(r2, r3, r0)
                    java.lang.String r3 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C0.c.C0680c.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }

        /* loaded from: classes4.dex */
        public static final class a extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(J2.e viewBinding) {
                super(viewBinding.getRoot());
                AbstractC3255y.i(viewBinding, "viewBinding");
                this.itemView.setId(AbstractC3403A.f34731S);
                View view = this.itemView;
                Resources resources = view.getResources();
                int i8 = AbstractC3407E.f34807B0;
                view.setContentDescription(resources.getString(i8));
                viewBinding.f4828b.setText(this.itemView.getResources().getString(i8));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3255y.i(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    J2.e r2 = J2.e.c(r2, r3, r0)
                    java.lang.String r3 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C0.c.a.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(J2.e viewBinding) {
                super(viewBinding.getRoot());
                AbstractC3255y.i(viewBinding, "viewBinding");
                this.itemView.setId(AbstractC3403A.f34732T);
                View view = this.itemView;
                Resources resources = view.getResources();
                int i8 = AbstractC3407E.f34809C0;
                view.setContentDescription(resources.getString(i8));
                viewBinding.f4828b.setText(this.itemView.getResources().getString(i8));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public b(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3255y.i(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    J2.e r2 = J2.e.c(r2, r3, r0)
                    java.lang.String r3 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C0.c.b.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f28239a = new d("Card", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f28240b = new d("AddCard", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f28241c = new d("AddFpx", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f28242d = new d("GooglePay", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ d[] f28243e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f28244f;

        static {
            d[] a8 = a();
            f28243e = a8;
            f28244f = U5.b.a(a8);
        }

        private d(String str, int i8) {
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f28239a, f28240b, f28241c, f28242d};
        }

        public static U5.a b() {
            return f28244f;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f28243e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28245a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28246b;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25587i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25589k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28245a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.f28239a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d.f28240b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.f28241c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.f28242d.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f28246b = iArr2;
        }
    }

    public C0(v0 intentArgs, List addableTypes, String str, boolean z8, boolean z9, boolean z10) {
        int i8;
        AbstractC3255y.i(intentArgs, "intentArgs");
        AbstractC3255y.i(addableTypes, "addableTypes");
        this.f28226a = addableTypes;
        this.f28227b = z8;
        this.f28228c = z9;
        this.f28229d = z10;
        this.f28230e = new ArrayList();
        this.f28231f = str;
        Integer num = z8 ? 1 : null;
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 0;
        }
        this.f28233h = i8;
        this.f28234i = new C2634d.a().c(intentArgs.b()).g(true).d(intentArgs.w()).f(o.p.f25587i).b(intentArgs.a()).e(intentArgs.i()).h(intentArgs.v()).a();
        this.f28235j = new C2634d.a().d(intentArgs.w()).f(o.p.f25589k).e(intentArgs.i()).a();
        setHasStableIds(true);
    }

    private final void A(int i8) {
        String str;
        Iterator it = this.f28230e.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC3255y.d(((com.stripe.android.model.o) it.next()).f25463a, this.f28231f)) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 != i8) {
            notifyItemChanged(i9);
            com.stripe.android.model.o oVar = (com.stripe.android.model.o) AbstractC1378t.p0(this.f28230e, i8);
            if (oVar != null) {
                str = oVar.f25463a;
            } else {
                str = null;
            }
            this.f28231f = str;
        }
        notifyItemChanged(i8);
    }

    private final c.a f(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AbstractC3255y.h(context, "getContext(...)");
        return new c.a(context, viewGroup);
    }

    private final c.b g(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AbstractC3255y.h(context, "getContext(...)");
        return new c.b(context, viewGroup);
    }

    private final c.C0680c h(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AbstractC3255y.h(context, "getContext(...)");
        return new c.C0680c(context, viewGroup);
    }

    private final c.d i(ViewGroup viewGroup) {
        final c.d dVar = new c.d(viewGroup);
        if (this.f28229d) {
            ViewCompat.addAccessibilityAction(dVar.itemView, viewGroup.getContext().getString(AbstractC3407E.f34855f0), new AccessibilityViewCommand() { // from class: com.stripe.android.view.B0
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                    boolean j8;
                    j8 = C0.j(C0.this, dVar, view, commandArguments);
                    return j8;
                }
            });
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(C0 this$0, c.d viewHolder, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(viewHolder, "$viewHolder");
        AbstractC3255y.i(view, "<anonymous parameter 0>");
        b bVar = this$0.f28232g;
        if (bVar != null) {
            bVar.a(this$0.m(viewHolder.getBindingAdapterPosition()));
            return true;
        }
        return true;
    }

    private final int l(int i8) {
        return (i8 - this.f28230e.size()) - this.f28233h;
    }

    private final int n(int i8) {
        return i8 - this.f28233h;
    }

    private final boolean q(int i8) {
        if (this.f28227b && i8 == 0) {
            return true;
        }
        return false;
    }

    private final boolean r(int i8) {
        g6.i s8;
        if (this.f28227b) {
            s8 = new g6.i(1, this.f28230e.size());
        } else {
            s8 = g6.m.s(0, this.f28230e.size());
        }
        int e8 = s8.e();
        if (i8 <= s8.f() && e8 <= i8) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C0 this$0, RecyclerView.ViewHolder holder, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(holder, "$holder");
        this$0.w(((c.d) holder).getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(C0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f28231f = null;
        b bVar = this$0.f28232g;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(C0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        b bVar = this$0.f28232g;
        if (bVar != null) {
            bVar.c(this$0.f28234i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        b bVar = this$0.f28232g;
        if (bVar != null) {
            bVar.c(this$0.f28235j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28230e.size() + this.f28226a.size() + this.f28233h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        int hashCode;
        if (q(i8)) {
            return f28225m;
        }
        if (r(i8)) {
            hashCode = m(i8).hashCode();
        } else {
            hashCode = ((o.p) this.f28226a.get(l(i8))).f25605a.hashCode();
        }
        return hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (q(i8)) {
            return d.f28242d.ordinal();
        }
        if (r(i8)) {
            if (o.p.f25587i == m(i8).f25467e) {
                return d.f28239a.ordinal();
            }
            return super.getItemViewType(i8);
        }
        o.p pVar = (o.p) this.f28226a.get(l(i8));
        int i9 = e.f28245a[pVar.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                return d.f28241c.ordinal();
            }
            throw new IllegalArgumentException("Unsupported PaymentMethod type: " + pVar.f25605a);
        }
        return d.f28240b.ordinal();
    }

    public final /* synthetic */ void k(com.stripe.android.model.o paymentMethod) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        Integer o8 = o(paymentMethod);
        if (o8 != null) {
            int intValue = o8.intValue();
            this.f28230e.remove(paymentMethod);
            notifyItemRemoved(intValue);
        }
    }

    public final /* synthetic */ com.stripe.android.model.o m(int i8) {
        return (com.stripe.android.model.o) this.f28230e.get(n(i8));
    }

    public final Integer o(com.stripe.android.model.o paymentMethod) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        Integer valueOf = Integer.valueOf(this.f28230e.indexOf(paymentMethod));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue() + this.f28233h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        if (holder instanceof c.d) {
            com.stripe.android.model.o m8 = m(i8);
            c.d dVar = (c.d) holder;
            dVar.a(m8);
            dVar.b(AbstractC3255y.d(m8.f25463a, this.f28231f));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0.s(C0.this, holder, view);
                }
            });
            return;
        }
        if (holder instanceof c.C0680c) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0.t(C0.this, view);
                }
            });
            ((c.C0680c) holder).a(this.f28228c);
        } else if (holder instanceof c.a) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0.u(C0.this, view);
                }
            });
        } else if (holder instanceof c.b) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.A0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0.v(C0.this, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        int i9 = e.f28246b[((d) d.b().get(i8)).ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        return h(parent);
                    }
                    throw new O5.p();
                }
                return g(parent);
            }
            return f(parent);
        }
        return i(parent);
    }

    public final com.stripe.android.model.o p() {
        String str = this.f28231f;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator it = this.f28230e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC3255y.d(((com.stripe.android.model.o) next).f25463a, str)) {
                obj = next;
                break;
            }
        }
        return (com.stripe.android.model.o) obj;
    }

    public final /* synthetic */ void w(int i8) {
        A(i8);
        b bVar = this.f28232g;
        if (bVar != null) {
            bVar.d(m(i8));
        }
    }

    public final /* synthetic */ void x(com.stripe.android.model.o paymentMethod) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        Integer o8 = o(paymentMethod);
        if (o8 != null) {
            notifyItemChanged(o8.intValue());
        }
    }

    public final void y(b bVar) {
        this.f28232g = bVar;
    }

    public final /* synthetic */ void z(List paymentMethods) {
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        this.f28230e.clear();
        this.f28230e.addAll(paymentMethods);
        notifyDataSetChanged();
    }
}
