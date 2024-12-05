package T7;

import M7.p;
import T7.m;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class m extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public List f10230a;

    /* renamed from: b, reason: collision with root package name */
    public a f10231b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f10232c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f10233d;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f10234e;

    /* loaded from: classes5.dex */
    public interface a {
        void a(p pVar);
    }

    /* loaded from: classes5.dex */
    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final a f10235a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f10236b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f10237c;

        /* renamed from: d, reason: collision with root package name */
        public Typeface f10238d;

        /* renamed from: e, reason: collision with root package name */
        public final ConstraintLayout f10239e;

        /* renamed from: f, reason: collision with root package name */
        public final ImageView f10240f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f10241g;

        /* renamed from: h, reason: collision with root package name */
        public final TextView f10242h;

        /* renamed from: i, reason: collision with root package name */
        public final View f10243i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View rootView, a listener, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3255y.i(rootView, "rootView");
            AbstractC3255y.i(listener, "listener");
            this.f10235a = listener;
            this.f10236b = num;
            this.f10237c = num2;
            this.f10238d = typeface;
            View findViewById = rootView.findViewById(L1.b.f5830o);
            AbstractC3255y.h(findViewById, "rootView.findViewById(R.id.cl_item_container)");
            this.f10239e = (ConstraintLayout) findViewById;
            View findViewById2 = rootView.findViewById(L1.b.f5744E);
            AbstractC3255y.h(findViewById2, "rootView.findViewById(R.id.iv_stack_more_info)");
            this.f10240f = (ImageView) findViewById2;
            View findViewById3 = rootView.findViewById(L1.b.f5826m1);
            AbstractC3255y.h(findViewById3, "rootView.findViewById(R.….tv_stack_selected_state)");
            this.f10241g = (TextView) findViewById3;
            View findViewById4 = rootView.findViewById(L1.b.f5823l1);
            AbstractC3255y.h(findViewById4, "rootView.findViewById(R.id.tv_stack_name)");
            this.f10242h = (TextView) findViewById4;
            View findViewById5 = rootView.findViewById(L1.b.f5752I);
            AbstractC3255y.h(findViewById5, "rootView.findViewById(R.id.line_item)");
            this.f10243i = findViewById5;
        }

        public static final void b(b this$0, p item, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(item, "$item");
            this$0.f10235a.a(item);
        }

        public final void a(final p item) {
            AbstractC3255y.i(item, "item");
            this.f10242h.setText(item.f7408b);
            this.f10241g.setText(item.f7409c);
            Integer num = this.f10236b;
            if (num != null) {
                int intValue = num.intValue();
                this.f10242h.setTextColor(intValue);
                this.f10241g.setTextColor(intValue);
                this.f10240f.setColorFilter(intValue);
            }
            Integer num2 = this.f10237c;
            if (num2 != null) {
                this.f10243i.setBackgroundColor(num2.intValue());
            }
            Typeface typeface = this.f10238d;
            if (typeface != null) {
                this.f10242h.setTypeface(typeface);
                this.f10241g.setTypeface(typeface);
            }
            this.f10239e.setOnClickListener(new View.OnClickListener() { // from class: T7.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m.b.b(m.b.this, item, view);
                }
            });
        }
    }

    public m(List items, a listener, Integer num, Integer num2, Typeface typeface) {
        AbstractC3255y.i(items, "items");
        AbstractC3255y.i(listener, "listener");
        this.f10230a = items;
        this.f10231b = listener;
        this.f10232c = num;
        this.f10233d = num2;
        this.f10234e = typeface;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10230a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        b holder = (b) viewHolder;
        AbstractC3255y.i(holder, "holder");
        holder.a((p) this.f10230a.get(i8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(L1.c.f5874q, parent, false);
        AbstractC3255y.h(view, "view");
        return new b(view, this.f10231b, this.f10232c, this.f10233d, this.f10234e);
    }
}
