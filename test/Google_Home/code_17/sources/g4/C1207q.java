package G4;

import a5.C1654v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: G4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1207q extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3315a;

    /* renamed from: b, reason: collision with root package name */
    private final Z4.u f3316b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3317c;

    public C1207q(ArrayList arrayList, Z4.u listener, String currentLanguageCode) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(currentLanguageCode, "currentLanguageCode");
        this.f3315a = arrayList;
        this.f3316b = listener;
        this.f3317c = currentLanguageCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(r5.H viewHolder, int i8) {
        C1654v c1654v;
        AbstractC3255y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f3315a;
        if (arrayList != null) {
            c1654v = (C1654v) arrayList.get(i8);
        } else {
            c1654v = null;
        }
        AbstractC3255y.f(c1654v);
        viewHolder.b(c1654v, this.f3317c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r5.H onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.language_item, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new r5.H(itemView, this.f3316b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3315a;
        if (arrayList != null) {
            AbstractC3255y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }
}
