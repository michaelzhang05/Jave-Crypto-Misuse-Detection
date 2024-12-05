package K4;

import H4.f;
import M4.l;
import N4.d;
import U4.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class c extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final l f5129a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f5130b;

    public c(ArrayList arrayList, l listener) {
        AbstractC3255y.i(listener, "listener");
        this.f5129a = listener;
        this.f5130b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(g viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        CheckBox checkBox = viewHolder.f10385a;
        ArrayList arrayList = this.f5130b;
        AbstractC3255y.f(arrayList);
        checkBox.setText(((d) arrayList.get(i8)).c());
        CheckBox checkBox2 = viewHolder.f10385a;
        ArrayList arrayList2 = this.f5130b;
        AbstractC3255y.f(arrayList2);
        checkBox2.setChecked(((d) arrayList2.get(i8)).a());
        CheckBox checkBox3 = viewHolder.f10385a;
        ArrayList arrayList3 = this.f5130b;
        AbstractC3255y.f(arrayList3);
        checkBox3.setEnabled(((d) arrayList3.get(i8)).b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(f.f3750v, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new g(itemView, this.f5129a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f5130b;
        AbstractC3255y.f(arrayList);
        return arrayList.size();
    }
}
