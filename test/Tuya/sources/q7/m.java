package Q7;

import J7.p;
import Q7.m;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class m extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public List f8433a;

    /* renamed from: b, reason: collision with root package name */
    public a f8434b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8435c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f8436d;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f8437e;

    /* loaded from: classes5.dex */
    public interface a {
        void c(p pVar);
    }

    /* loaded from: classes5.dex */
    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final a f8438a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f8439b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f8440c;

        /* renamed from: d, reason: collision with root package name */
        public Typeface f8441d;

        /* renamed from: e, reason: collision with root package name */
        public final ConstraintLayout f8442e;

        /* renamed from: f, reason: collision with root package name */
        public final ImageView f8443f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f8444g;

        /* renamed from: h, reason: collision with root package name */
        public final TextView f8445h;

        /* renamed from: i, reason: collision with root package name */
        public final View f8446i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View rootView, a listener, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            AbstractC3159y.i(listener, "listener");
            this.f8438a = listener;
            this.f8439b = num;
            this.f8440c = num2;
            this.f8441d = typeface;
            View findViewById = rootView.findViewById(I1.b.f3835o);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.cl_item_container)");
            this.f8442e = (ConstraintLayout) findViewById;
            View findViewById2 = rootView.findViewById(I1.b.f3749E);
            AbstractC3159y.h(findViewById2, "rootView.findViewById(R.id.iv_stack_more_info)");
            this.f8443f = (ImageView) findViewById2;
            View findViewById3 = rootView.findViewById(I1.b.f3831m1);
            AbstractC3159y.h(findViewById3, "rootView.findViewById(R.….tv_stack_selected_state)");
            this.f8444g = (TextView) findViewById3;
            View findViewById4 = rootView.findViewById(I1.b.f3828l1);
            AbstractC3159y.h(findViewById4, "rootView.findViewById(R.id.tv_stack_name)");
            this.f8445h = (TextView) findViewById4;
            View findViewById5 = rootView.findViewById(I1.b.f3757I);
            AbstractC3159y.h(findViewById5, "rootView.findViewById(R.id.line_item)");
            this.f8446i = findViewById5;
        }

        public static final void b(b this$0, p item, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(item, "$item");
            this$0.f8438a.c(item);
        }

        public final void a(final p item) {
            AbstractC3159y.i(item, "item");
            this.f8445h.setText(item.f5702b);
            this.f8444g.setText(item.f5703c);
            Integer num = this.f8439b;
            if (num != null) {
                int intValue = num.intValue();
                this.f8445h.setTextColor(intValue);
                this.f8444g.setTextColor(intValue);
                this.f8443f.setColorFilter(intValue);
            }
            Integer num2 = this.f8440c;
            if (num2 != null) {
                this.f8446i.setBackgroundColor(num2.intValue());
            }
            Typeface typeface = this.f8441d;
            if (typeface != null) {
                this.f8445h.setTypeface(typeface);
                this.f8444g.setTypeface(typeface);
            }
            this.f8442e.setOnClickListener(new View.OnClickListener() { // from class: Q7.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m.b.b(m.b.this, item, view);
                }
            });
        }
    }

    public m(List items, a listener, Integer num, Integer num2, Typeface typeface) {
        AbstractC3159y.i(items, "items");
        AbstractC3159y.i(listener, "listener");
        this.f8433a = items;
        this.f8434b = listener;
        this.f8435c = num;
        this.f8436d = num2;
        this.f8437e = typeface;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8433a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        b holder = (b) viewHolder;
        AbstractC3159y.i(holder, "holder");
        holder.a((p) this.f8433a.get(i8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3879q, parent, false);
        AbstractC3159y.h(view, "view");
        return new b(view, this.f8434b, this.f8435c, this.f8436d, this.f8437e);
    }
}
