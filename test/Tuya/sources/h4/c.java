package H4;

import E4.f;
import J4.l;
import K4.d;
import R4.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final l f3526a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f3527b;

    public c(ArrayList arrayList, l listener) {
        AbstractC3159y.i(listener, "listener");
        this.f3526a = listener;
        this.f3527b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(g viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        CheckBox checkBox = viewHolder.f8759a;
        ArrayList arrayList = this.f3527b;
        AbstractC3159y.f(arrayList);
        checkBox.setText(((d) arrayList.get(i8)).c());
        CheckBox checkBox2 = viewHolder.f8759a;
        ArrayList arrayList2 = this.f3527b;
        AbstractC3159y.f(arrayList2);
        checkBox2.setChecked(((d) arrayList2.get(i8)).a());
        CheckBox checkBox3 = viewHolder.f8759a;
        ArrayList arrayList3 = this.f3527b;
        AbstractC3159y.f(arrayList3);
        checkBox3.setEnabled(((d) arrayList3.get(i8)).b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(f.f2200v, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new g(itemView, this.f3526a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3527b;
        AbstractC3159y.f(arrayList);
        return arrayList.size();
    }
}
