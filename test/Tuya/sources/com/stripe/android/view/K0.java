package com.stripe.android.view;

import M5.AbstractC1246t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b3.C1859D;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class K0 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private Function1 f27398a = b.f27402a;

    /* renamed from: b, reason: collision with root package name */
    private List f27399b = AbstractC1246t.m();

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ int f27400c;

    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final L0 f27401a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L0 shippingMethodView) {
            super(shippingMethodView);
            AbstractC3159y.i(shippingMethodView, "shippingMethodView");
            this.f27401a = shippingMethodView;
        }

        public final L0 a() {
            return this.f27401a;
        }

        public final void b(boolean z8) {
            this.f27401a.setSelected(z8);
        }

        public final void c(C1859D shippingMethod) {
            AbstractC3159y.i(shippingMethod, "shippingMethod");
            this.f27401a.setShippingMethod(shippingMethod);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27402a = new b();

        b() {
            super(1);
        }

        public final void a(C1859D it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1859D) obj);
            return L5.I.f6487a;
        }
    }

    public K0() {
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(K0 this$0, a holder, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(holder, "$holder");
        this$0.h(holder.getBindingAdapterPosition());
    }

    public final C1859D b() {
        return (C1859D) AbstractC1246t.p0(this.f27399b, this.f27400c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final a holder, int i8) {
        boolean z8;
        AbstractC3159y.i(holder, "holder");
        holder.c((C1859D) this.f27399b.get(i8));
        if (i8 == this.f27400c) {
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
        AbstractC3159y.i(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        AbstractC3159y.h(context, "getContext(...)");
        return new a(new L0(context, null, 0, 6, null));
    }

    public final void f(Function1 function1) {
        AbstractC3159y.i(function1, "<set-?>");
        this.f27398a = function1;
    }

    public final void g(C1859D shippingMethod) {
        AbstractC3159y.i(shippingMethod, "shippingMethod");
        h(this.f27399b.indexOf(shippingMethod));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27399b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        return ((C1859D) this.f27399b.get(i8)).hashCode();
    }

    public final void h(int i8) {
        int i9 = this.f27400c;
        if (i9 != i8) {
            notifyItemChanged(i9);
            notifyItemChanged(i8);
            this.f27400c = i8;
            this.f27398a.invoke(this.f27399b.get(i8));
        }
    }

    public final void i(List value) {
        AbstractC3159y.i(value, "value");
        h(0);
        this.f27399b = value;
        notifyDataSetChanged();
    }
}
