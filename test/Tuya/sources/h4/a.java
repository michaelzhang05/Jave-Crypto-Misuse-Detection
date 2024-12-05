package H4;

import E4.f;
import J4.j;
import L4.h;
import android.net.nsd.NsdServiceInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3520a;

    /* renamed from: b, reason: collision with root package name */
    private j f3521b;

    public a(ArrayList arrayList, j listener) {
        AbstractC3159y.i(listener, "listener");
        this.f3520a = arrayList;
        this.f3521b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(R4.b holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        TextView c8 = holder.c();
        h.a aVar = h.f6460h;
        ArrayList arrayList = this.f3520a;
        AbstractC3159y.f(arrayList);
        String serviceName = ((NsdServiceInfo) arrayList.get(i8)).getServiceName();
        AbstractC3159y.h(serviceName, "data!![position].serviceName");
        c8.setText(aVar.c(serviceName));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public R4.b onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(f.f2181c, parent, false);
        AbstractC3159y.h(inflate, "from(parent.context).inf…vice_item, parent, false)");
        return new R4.b(inflate, this.f3521b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3520a;
        AbstractC3159y.f(arrayList);
        return arrayList.size();
    }
}
