package G4;

import Z4.InterfaceC1589c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3926b;

/* renamed from: G4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1191a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3195a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1589c f3196b;

    public C1191a(ArrayList arrayList, InterfaceC1589c listener) {
        AbstractC3255y.i(listener, "listener");
        this.f3195a = arrayList;
        this.f3196b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3926b viewHolder, int i8) {
        a5.r rVar;
        AbstractC3255y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f3195a;
        if (arrayList != null) {
            rVar = (a5.r) arrayList.get(i8);
        } else {
            rVar = null;
        }
        AbstractC3255y.f(rVar);
        viewHolder.b(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3926b onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_file_item, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new C3926b(itemView, this.f3196b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3195a;
        if (arrayList != null) {
            AbstractC3255y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }
}
