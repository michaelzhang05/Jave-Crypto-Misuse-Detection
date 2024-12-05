package com.stripe.android.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import e3.C2788b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

/* renamed from: com.stripe.android.view.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2644i extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final S0 f28787a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28788b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f28789c;

    /* renamed from: d, reason: collision with root package name */
    private C2788b f28790d;

    /* renamed from: e, reason: collision with root package name */
    private int f28791e;

    /* renamed from: com.stripe.android.view.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final J2.g f28792a;

        /* renamed from: b, reason: collision with root package name */
        private final S0 f28793b;

        /* renamed from: c, reason: collision with root package name */
        private final Resources f28794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J2.g viewBinding, S0 themeConfig) {
            super(viewBinding.getRoot());
            AbstractC3255y.i(viewBinding, "viewBinding");
            AbstractC3255y.i(themeConfig, "themeConfig");
            this.f28792a = viewBinding;
            this.f28793b = themeConfig;
            Resources resources = this.itemView.getResources();
            AbstractC3255y.h(resources, "getResources(...)");
            this.f28794c = resources;
        }

        public final void a(boolean z8) {
            int i8;
            this.f28792a.f4848d.setTextColor(this.f28793b.c(z8));
            ImageViewCompat.setImageTintList(this.f28792a.f4846b, ColorStateList.valueOf(this.f28793b.d(z8)));
            AppCompatImageView checkIcon = this.f28792a.f4846b;
            AbstractC3255y.h(checkIcon, "checkIcon");
            if (z8) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            checkIcon.setVisibility(i8);
        }

        public final void b(r bank, boolean z8) {
            String string;
            AbstractC3255y.i(bank, "bank");
            AppCompatTextView appCompatTextView = this.f28792a.f4848d;
            if (z8) {
                string = bank.b();
            } else {
                string = this.f28794c.getString(AbstractC3407E.f34875p0, bank.b());
            }
            appCompatTextView.setText(string);
            Integer a8 = bank.a();
            if (a8 != null) {
                this.f28792a.f4847c.setImageResource(a8.intValue());
            }
        }
    }

    public C2644i(S0 themeConfig, List items, Function1 itemSelectedCallback) {
        AbstractC3255y.i(themeConfig, "themeConfig");
        AbstractC3255y.i(items, "items");
        AbstractC3255y.i(itemSelectedCallback, "itemSelectedCallback");
        this.f28787a = themeConfig;
        this.f28788b = items;
        this.f28789c = itemSelectedCallback;
        this.f28791e = -1;
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2644i this$0, RecyclerView.ViewHolder holder, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(holder, "$holder");
        this$0.f(holder.getBindingAdapterPosition());
    }

    public final int b() {
        return this.f28791e;
    }

    public final void c(int i8) {
        notifyItemChanged(i8);
    }

    public final void e(C2788b c2788b) {
        this.f28790d = c2788b;
    }

    public final void f(int i8) {
        int i9 = this.f28791e;
        if (i8 != i9) {
            if (i9 != -1) {
                notifyItemChanged(i9);
            }
            notifyItemChanged(i8);
            this.f28789c.invoke(Integer.valueOf(i8));
        }
        this.f28791e = i8;
    }

    public final void g(int i8) {
        f(i8);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28788b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int i8) {
        boolean z8;
        AbstractC3255y.i(holder, "holder");
        r rVar = (r) this.f28788b.get(i8);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2644i.d(C2644i.this, holder, view);
            }
        });
        a aVar = (a) holder;
        boolean z9 = true;
        if (i8 == this.f28791e) {
            z8 = true;
        } else {
            z8 = false;
        }
        aVar.a(z8);
        C2788b c2788b = this.f28790d;
        if (c2788b != null) {
            z9 = c2788b.a(rVar);
        }
        aVar.b(rVar, z9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        J2.g c8 = J2.g.c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC3255y.h(c8, "inflate(...)");
        return new a(c8, this.f28787a);
    }
}
