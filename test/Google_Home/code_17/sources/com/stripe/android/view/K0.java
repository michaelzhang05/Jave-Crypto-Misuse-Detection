package com.stripe.android.view;

import P5.AbstractC1378t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import e3.C2780D;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class K0 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private Function1 f28453a = b.f28457a;

    /* renamed from: b, reason: collision with root package name */
    private List f28454b = AbstractC1378t.m();

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ int f28455c;

    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final L0 f28456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L0 shippingMethodView) {
            super(shippingMethodView);
            AbstractC3255y.i(shippingMethodView, "shippingMethodView");
            this.f28456a = shippingMethodView;
        }

        public final L0 a() {
            return this.f28456a;
        }

        public final void b(boolean z8) {
            this.f28456a.setSelected(z8);
        }

        public final void c(C2780D shippingMethod) {
            AbstractC3255y.i(shippingMethod, "shippingMethod");
            this.f28456a.setShippingMethod(shippingMethod);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28457a = new b();

        b() {
            super(1);
        }

        public final void a(C2780D it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2780D) obj);
            return O5.I.f8278a;
        }
    }

    public K0() {
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(K0 this$0, a holder, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(holder, "$holder");
        this$0.h(holder.getBindingAdapterPosition());
    }

    public final C2780D b() {
        return (C2780D) AbstractC1378t.p0(this.f28454b, this.f28455c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final a holder, int i8) {
        boolean z8;
        AbstractC3255y.i(holder, "holder");
        holder.c((C2780D) this.f28454b.get(i8));
        if (i8 == this.f28455c) {
            z8 = true;
        } else {
            z8 = false;
        }
        holder.b(z8);
        holder.a().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                K0.d(K0.this, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        AbstractC3255y.h(context, "getContext(...)");
        return new a(new L0(context, null, 0, 6, null));
    }

    public final void f(Function1 function1) {
        AbstractC3255y.i(function1, "<set-?>");
        this.f28453a = function1;
    }

    public final void g(C2780D shippingMethod) {
        AbstractC3255y.i(shippingMethod, "shippingMethod");
        h(this.f28454b.indexOf(shippingMethod));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28454b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        return ((C2780D) this.f28454b.get(i8)).hashCode();
    }

    public final void h(int i8) {
        int i9 = this.f28455c;
        if (i9 != i8) {
            notifyItemChanged(i9);
            notifyItemChanged(i8);
            this.f28455c = i8;
            this.f28453a.invoke(this.f28454b.get(i8));
        }
    }

    public final void i(List value) {
        AbstractC3255y.i(value, "value");
        h(0);
        this.f28454b = value;
        notifyDataSetChanged();
    }
}
