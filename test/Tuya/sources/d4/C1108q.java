package D4;

import X4.C1511v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: D4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1108q extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1773a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.u f1774b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1775c;

    public C1108q(ArrayList arrayList, W4.u listener, String currentLanguageCode) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(currentLanguageCode, "currentLanguageCode");
        this.f1773a = arrayList;
        this.f1774b = listener;
        this.f1775c = currentLanguageCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(o5.H viewHolder, int i8) {
        C1511v c1511v;
        AbstractC3159y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f1773a;
        if (arrayList != null) {
            c1511v = (C1511v) arrayList.get(i8);
        } else {
            c1511v = null;
        }
        AbstractC3159y.f(c1511v);
        viewHolder.b(c1511v, this.f1775c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o5.H onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.language_item, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new o5.H(itemView, this.f1774b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f1773a;
        if (arrayList != null) {
            AbstractC3159y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }
}
