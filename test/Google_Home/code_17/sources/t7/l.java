package T7;

import M7.o;
import T7.l;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class l extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f10224a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10225b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10226c;

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f10227d;

    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f10228a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f10229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View rootView, Typeface typeface) {
            super(rootView);
            AbstractC3255y.i(rootView, "rootView");
            this.f10228a = typeface;
            View findViewById = rootView.findViewById(L1.b.f5790a1);
            AbstractC3255y.h(findViewById, "rootView.findViewById(R.id.tv_publisher_link_name)");
            this.f10229b = (TextView) findViewById;
        }

        public static final void a(Context context, o item, View view) {
            AbstractC3255y.i(context, "$context");
            AbstractC3255y.i(item, "$item");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(item.f7406b));
            context.startActivity(intent);
        }

        public final void b(final Context context, final o item, Integer num) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(item, "item");
            SpannableString spannableString = new SpannableString(item.f7405a);
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            TextView textView = this.f10229b;
            textView.setText(spannableString);
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            Typeface typeface = this.f10228a;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            if (item.f7406b.length() > 0) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: T7.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l.a.a(context, item, view);
                    }
                });
            }
        }
    }

    public l(List items, Context context, Integer num, Typeface typeface) {
        AbstractC3255y.i(items, "items");
        AbstractC3255y.i(context, "context");
        this.f10224a = items;
        this.f10225b = context;
        this.f10226c = num;
        this.f10227d = typeface;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10224a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        a holder = (a) viewHolder;
        AbstractC3255y.i(holder, "holder");
        holder.b(this.f10225b, (o) this.f10224a.get(i8), this.f10226c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(L1.c.f5880w, parent, false);
        AbstractC3255y.h(view, "view");
        return new a(view, this.f10227d);
    }
}
