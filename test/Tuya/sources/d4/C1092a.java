package D4;

import W4.InterfaceC1480c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3536b;

/* renamed from: D4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1092a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1653a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1480c f1654b;

    public C1092a(ArrayList arrayList, InterfaceC1480c listener) {
        AbstractC3159y.i(listener, "listener");
        this.f1653a = arrayList;
        this.f1654b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3536b viewHolder, int i8) {
        X4.r rVar;
        AbstractC3159y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f1653a;
        if (arrayList != null) {
            rVar = (X4.r) arrayList.get(i8);
        } else {
            rVar = null;
        }
        AbstractC3159y.f(rVar);
        viewHolder.b(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3536b onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_file_item, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new C3536b(itemView, this.f1654b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f1653a;
        if (arrayList != null) {
            AbstractC3159y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }
}
