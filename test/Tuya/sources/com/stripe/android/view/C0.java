package com.stripe.android.view;

import M5.AbstractC1246t;
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
import com.stripe.android.view.C2440d;
import j2.AbstractC3049A;
import j2.AbstractC3053E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class C0 extends RecyclerView.Adapter {

    /* renamed from: k, reason: collision with root package name */
    public static final a f27168k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f27169l = 8;

    /* renamed from: m, reason: collision with root package name */
    private static final long f27170m = -2057760476;

    /* renamed from: a, reason: collision with root package name */
    private final List f27171a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27172b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27173c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f27174d;

    /* renamed from: e, reason: collision with root package name */
    private final List f27175e;

    /* renamed from: f, reason: collision with root package name */
    private String f27176f;

    /* renamed from: g, reason: collision with root package name */
    private b f27177g;

    /* renamed from: h, reason: collision with root package name */
    private final int f27178h;

    /* renamed from: i, reason: collision with root package name */
    private final C2440d f27179i;

    /* renamed from: j, reason: collision with root package name */
    private final C2440d f27180j;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(com.stripe.android.model.o oVar);

        void b();

        void c(C2440d c2440d);

        void d(com.stripe.android.model.o oVar);
    }

    /* loaded from: classes4.dex */
    public static abstract class c extends RecyclerView.ViewHolder {
        public /* synthetic */ c(View view, AbstractC3151p abstractC3151p) {
            this(view);
        }

        /* loaded from: classes4.dex */
        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            private final G2.m f27183a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d(G2.m r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f27183a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C0.c.d.<init>(G2.m):void");
            }

            public final void a(com.stripe.android.model.o paymentMethod) {
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f27183a.f3153b.setPaymentMethod(paymentMethod);
            }

            public final void b(boolean z8) {
                this.f27183a.f3153b.setSelected(z8);
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
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    G2.m r3 = G2.m.c(r0, r3, r1)
                    java.lang.String r0 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r3, r0)
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
        public static final class C0684c extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            private final G2.l f27181a;

            /* renamed from: b, reason: collision with root package name */
            private final S0 f27182b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0684c(G2.l viewBinding) {
                super(viewBinding.getRoot());
                AbstractC3159y.i(viewBinding, "viewBinding");
                this.f27181a = viewBinding;
                Context context = this.itemView.getContext();
                AbstractC3159y.h(context, "getContext(...)");
                S0 s02 = new S0(context);
                this.f27182b = s02;
                ImageViewCompat.setImageTintList(viewBinding.f3150b, ColorStateList.valueOf(s02.d(true)));
            }

            public final void a(boolean z8) {
                int i8;
                this.f27181a.f3151c.setTextColor(ColorStateList.valueOf(this.f27182b.c(z8)));
                AppCompatImageView appCompatImageView = this.f27181a.f3150b;
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
            public C0684c(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3159y.i(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    G2.l r2 = G2.l.c(r2, r3, r0)
                    java.lang.String r3 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C0.c.C0684c.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }

        /* loaded from: classes4.dex */
        public static final class a extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(G2.e viewBinding) {
                super(viewBinding.getRoot());
                AbstractC3159y.i(viewBinding, "viewBinding");
                this.itemView.setId(AbstractC3049A.f32755S);
                View view = this.itemView;
                Resources resources = view.getResources();
                int i8 = AbstractC3053E.f32831B0;
                view.setContentDescription(resources.getString(i8));
                viewBinding.f3109b.setText(this.itemView.getResources().getString(i8));
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
                    kotlin.jvm.internal.AbstractC3159y.i(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    G2.e r2 = G2.e.c(r2, r3, r0)
                    java.lang.String r3 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C0.c.a.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(G2.e viewBinding) {
                super(viewBinding.getRoot());
                AbstractC3159y.i(viewBinding, "viewBinding");
                this.itemView.setId(AbstractC3049A.f32756T);
                View view = this.itemView;
                Resources resources = view.getResources();
                int i8 = AbstractC3053E.f32833C0;
                view.setContentDescription(resources.getString(i8));
                viewBinding.f3109b.setText(this.itemView.getResources().getString(i8));
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
                    kotlin.jvm.internal.AbstractC3159y.i(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    G2.e r2 = G2.e.c(r2, r3, r0)
                    java.lang.String r3 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
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
        public static final d f27184a = new d("Card", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f27185b = new d("AddCard", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f27186c = new d("AddFpx", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f27187d = new d("GooglePay", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ d[] f27188e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f27189f;

        static {
            d[] a8 = a();
            f27188e = a8;
            f27189f = R5.b.a(a8);
        }

        private d(String str, int i8) {
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f27184a, f27185b, f27186c, f27187d};
        }

        public static R5.a b() {
            return f27189f;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f27188e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27190a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27191b;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f24532i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f24534k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27190a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.f27184a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d.f27185b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.f27186c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.f27187d.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f27191b = iArr2;
        }
    }

    public C0(v0 intentArgs, List addableTypes, String str, boolean z8, boolean z9, boolean z10) {
        int i8;
        AbstractC3159y.i(intentArgs, "intentArgs");
        AbstractC3159y.i(addableTypes, "addableTypes");
        this.f27171a = addableTypes;
        this.f27172b = z8;
        this.f27173c = z9;
        this.f27174d = z10;
        this.f27175e = new ArrayList();
        this.f27176f = str;
        Integer num = z8 ? 1 : null;
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 0;
        }
        this.f27178h = i8;
        this.f27179i = new C2440d.a().c(intentArgs.c()).g(true).d(intentArgs.u()).f(o.p.f24532i).b(intentArgs.b()).e(intentArgs.i()).h(intentArgs.s()).a();
        this.f27180j = new C2440d.a().d(intentArgs.u()).f(o.p.f24534k).e(intentArgs.i()).a();
        setHasStableIds(true);
    }

    private final void A(int i8) {
        String str;
        Iterator it = this.f27175e.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC3159y.d(((com.stripe.android.model.o) it.next()).f24408a, this.f27176f)) {
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
            com.stripe.android.model.o oVar = (com.stripe.android.model.o) AbstractC1246t.p0(this.f27175e, i8);
            if (oVar != null) {
                str = oVar.f24408a;
            } else {
                str = null;
            }
            this.f27176f = str;
        }
        notifyItemChanged(i8);
    }

    private final c.a f(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AbstractC3159y.h(context, "getContext(...)");
        return new c.a(context, viewGroup);
    }

    private final c.b g(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AbstractC3159y.h(context, "getContext(...)");
        return new c.b(context, viewGroup);
    }

    private final c.C0684c h(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AbstractC3159y.h(context, "getContext(...)");
        return new c.C0684c(context, viewGroup);
    }

    private final c.d i(ViewGroup viewGroup) {
        final c.d dVar = new c.d(viewGroup);
        if (this.f27174d) {
            ViewCompat.addAccessibilityAction(dVar.itemView, viewGroup.getContext().getString(AbstractC3053E.f32879f0), new AccessibilityViewCommand() { // from class: com.stripe.android.view.B0
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
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(viewHolder, "$viewHolder");
        AbstractC3159y.i(view, "<anonymous parameter 0>");
        b bVar = this$0.f27177g;
        if (bVar != null) {
            bVar.a(this$0.m(viewHolder.getBindingAdapterPosition()));
            return true;
        }
        return true;
    }

    private final int l(int i8) {
        return (i8 - this.f27175e.size()) - this.f27178h;
    }

    private final int n(int i8) {
        return i8 - this.f27178h;
    }

    private final boolean q(int i8) {
        if (this.f27172b && i8 == 0) {
            return true;
        }
        return false;
    }

    private final boolean r(int i8) {
        d6.i s8;
        if (this.f27172b) {
            s8 = new d6.i(1, this.f27175e.size());
        } else {
            s8 = d6.m.s(0, this.f27175e.size());
        }
        int g8 = s8.g();
        if (i8 <= s8.h() && g8 <= i8) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C0 this$0, RecyclerView.ViewHolder holder, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(holder, "$holder");
        this$0.w(((c.d) holder).getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(C0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f27176f = null;
        b bVar = this$0.f27177g;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(C0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        b bVar = this$0.f27177g;
        if (bVar != null) {
            bVar.c(this$0.f27179i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        b bVar = this$0.f27177g;
        if (bVar != null) {
            bVar.c(this$0.f27180j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27175e.size() + this.f27171a.size() + this.f27178h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        int hashCode;
        if (q(i8)) {
            return f27170m;
        }
        if (r(i8)) {
            hashCode = m(i8).hashCode();
        } else {
            hashCode = ((o.p) this.f27171a.get(l(i8))).f24550a.hashCode();
        }
        return hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (q(i8)) {
            return d.f27187d.ordinal();
        }
        if (r(i8)) {
            if (o.p.f24532i == m(i8).f24412e) {
                return d.f27184a.ordinal();
            }
            return super.getItemViewType(i8);
        }
        o.p pVar = (o.p) this.f27171a.get(l(i8));
        int i9 = e.f27190a[pVar.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                return d.f27186c.ordinal();
            }
            throw new IllegalArgumentException("Unsupported PaymentMethod type: " + pVar.f24550a);
        }
        return d.f27185b.ordinal();
    }

    public final /* synthetic */ void k(com.stripe.android.model.o paymentMethod) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        Integer o8 = o(paymentMethod);
        if (o8 != null) {
            int intValue = o8.intValue();
            this.f27175e.remove(paymentMethod);
            notifyItemRemoved(intValue);
        }
    }

    public final /* synthetic */ com.stripe.android.model.o m(int i8) {
        return (com.stripe.android.model.o) this.f27175e.get(n(i8));
    }

    public final Integer o(com.stripe.android.model.o paymentMethod) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        Integer valueOf = Integer.valueOf(this.f27175e.indexOf(paymentMethod));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue() + this.f27178h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        if (holder instanceof c.d) {
            com.stripe.android.model.o m8 = m(i8);
            c.d dVar = (c.d) holder;
            dVar.a(m8);
            dVar.b(AbstractC3159y.d(m8.f24408a, this.f27176f));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0.s(C0.this, holder, view);
                }
            });
            return;
        }
        if (holder instanceof c.C0684c) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0.t(C0.this, view);
                }
            });
            ((c.C0684c) holder).a(this.f27173c);
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
        AbstractC3159y.i(parent, "parent");
        int i9 = e.f27191b[((d) d.b().get(i8)).ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        return h(parent);
                    }
                    throw new L5.p();
                }
                return g(parent);
            }
            return f(parent);
        }
        return i(parent);
    }

    public final com.stripe.android.model.o p() {
        String str = this.f27176f;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator it = this.f27175e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC3159y.d(((com.stripe.android.model.o) next).f24408a, str)) {
                obj = next;
                break;
            }
        }
        return (com.stripe.android.model.o) obj;
    }

    public final /* synthetic */ void w(int i8) {
        A(i8);
        b bVar = this.f27177g;
        if (bVar != null) {
            bVar.d(m(i8));
        }
    }

    public final /* synthetic */ void x(com.stripe.android.model.o paymentMethod) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        Integer o8 = o(paymentMethod);
        if (o8 != null) {
            notifyItemChanged(o8.intValue());
        }
    }

    public final void y(b bVar) {
        this.f27177g = bVar;
    }

    public final /* synthetic */ void z(List paymentMethods) {
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        this.f27175e.clear();
        this.f27175e.addAll(paymentMethods);
        notifyDataSetChanged();
    }
}
