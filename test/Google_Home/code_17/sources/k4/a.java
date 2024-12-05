package K4;

import H4.f;
import M4.j;
import O4.h;
import android.net.nsd.NsdServiceInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f5123a;

    /* renamed from: b, reason: collision with root package name */
    private j f5124b;

    public a(ArrayList arrayList, j listener) {
        AbstractC3255y.i(listener, "listener");
        this.f5123a = arrayList;
        this.f5124b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(U4.b holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        TextView c8 = holder.c();
        h.a aVar = h.f8251h;
        ArrayList arrayList = this.f5123a;
        AbstractC3255y.f(arrayList);
        String serviceName = ((NsdServiceInfo) arrayList.get(i8)).getServiceName();
        AbstractC3255y.h(serviceName, "data!![position].serviceName");
        c8.setText(aVar.c(serviceName));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U4.b onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(f.f3731c, parent, false);
        AbstractC3255y.h(inflate, "from(parent.context).inf…vice_item, parent, false)");
        return new U4.b(inflate, this.f5124b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f5123a;
        AbstractC3255y.f(arrayList);
        return arrayList.size();
    }
}
