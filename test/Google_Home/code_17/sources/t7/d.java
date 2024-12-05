package T7;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class d extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f10186a;

    public d(List disclosures) {
        AbstractC3255y.i(disclosures, "disclosures");
        this.f10186a = disclosures;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10186a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        f holder = (f) viewHolder;
        AbstractC3255y.i(holder, "holder");
        e disclosure = (e) this.f10186a.get(i8);
        holder.getClass();
        AbstractC3255y.i(disclosure, "disclosure");
        holder.f10202k.setText(disclosure.f10187a);
        holder.f10201j.setText(disclosure.f10188b);
        holder.f10200i.setText(disclosure.f10189c);
        holder.f10199h.setText(disclosure.f10190d);
        holder.f10198g.setText(disclosure.f10191e);
        M7.c cVar = R7.d.f9667f;
        if (cVar != null) {
            Integer num = cVar.f7257i;
            if (num != null) {
                int intValue = num.intValue();
                holder.f10202k.setTextColor(intValue);
                holder.f10197f.setTextColor(intValue);
                holder.f10201j.setTextColor(intValue);
                holder.f10196e.setTextColor(intValue);
                holder.f10200i.setTextColor(intValue);
                holder.f10195d.setTextColor(intValue);
                holder.f10199h.setTextColor(intValue);
                holder.f10194c.setTextColor(intValue);
                holder.f10198g.setTextColor(intValue);
                holder.f10193b.setTextColor(intValue);
            }
            Integer num2 = cVar.f7249a;
            if (num2 != null) {
                holder.f10192a.setBackgroundColor(num2.intValue());
            }
        }
        M7.b bVar = R7.d.f9666e;
        if (bVar != null) {
            Typeface typeface = bVar.f7248b;
            if (typeface != null) {
                holder.f10202k.setTypeface(typeface);
                holder.f10197f.setTypeface(typeface);
                holder.f10201j.setTypeface(typeface);
                holder.f10196e.setTypeface(typeface);
                holder.f10200i.setTypeface(typeface);
                holder.f10195d.setTypeface(typeface);
                holder.f10199h.setTypeface(typeface);
                holder.f10194c.setTypeface(typeface);
                holder.f10198g.setTypeface(typeface);
            }
            Typeface typeface2 = bVar.f7247a;
            if (typeface2 != null) {
                holder.f10193b.setTypeface(typeface2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(L1.c.f5872o, parent, false);
        AbstractC3255y.h(view, "view");
        return new f(view);
    }
}
