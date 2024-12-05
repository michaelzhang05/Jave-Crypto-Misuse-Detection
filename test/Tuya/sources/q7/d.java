package Q7;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class d extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f8389a;

    public d(List disclosures) {
        AbstractC3159y.i(disclosures, "disclosures");
        this.f8389a = disclosures;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8389a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        f holder = (f) viewHolder;
        AbstractC3159y.i(holder, "holder");
        e disclosure = (e) this.f8389a.get(i8);
        holder.getClass();
        AbstractC3159y.i(disclosure, "disclosure");
        holder.f8405k.setText(disclosure.f8390a);
        holder.f8404j.setText(disclosure.f8391b);
        holder.f8403i.setText(disclosure.f8392c);
        holder.f8402h.setText(disclosure.f8393d);
        holder.f8401g.setText(disclosure.f8394e);
        J7.c cVar = O7.d.f7811f;
        if (cVar != null) {
            Integer num = cVar.f5551i;
            if (num != null) {
                int intValue = num.intValue();
                holder.f8405k.setTextColor(intValue);
                holder.f8400f.setTextColor(intValue);
                holder.f8404j.setTextColor(intValue);
                holder.f8399e.setTextColor(intValue);
                holder.f8403i.setTextColor(intValue);
                holder.f8398d.setTextColor(intValue);
                holder.f8402h.setTextColor(intValue);
                holder.f8397c.setTextColor(intValue);
                holder.f8401g.setTextColor(intValue);
                holder.f8396b.setTextColor(intValue);
            }
            Integer num2 = cVar.f5543a;
            if (num2 != null) {
                holder.f8395a.setBackgroundColor(num2.intValue());
            }
        }
        J7.b bVar = O7.d.f7810e;
        if (bVar != null) {
            Typeface typeface = bVar.f5542b;
            if (typeface != null) {
                holder.f8405k.setTypeface(typeface);
                holder.f8400f.setTypeface(typeface);
                holder.f8404j.setTypeface(typeface);
                holder.f8399e.setTypeface(typeface);
                holder.f8403i.setTypeface(typeface);
                holder.f8398d.setTypeface(typeface);
                holder.f8402h.setTypeface(typeface);
                holder.f8397c.setTypeface(typeface);
                holder.f8401g.setTypeface(typeface);
            }
            Typeface typeface2 = bVar.f5541a;
            if (typeface2 != null) {
                holder.f8396b.setTypeface(typeface2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3877o, parent, false);
        AbstractC3159y.h(view, "view");
        return new f(view);
    }
}
