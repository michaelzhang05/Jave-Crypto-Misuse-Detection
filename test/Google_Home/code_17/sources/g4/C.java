package G4;

import a5.C1639f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3943j0;

/* loaded from: classes4.dex */
public final class C extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3032a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3033b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.B f3034c;

    public C(ArrayList rollbackApps, Context context, Z4.B listener) {
        AbstractC3255y.i(rollbackApps, "rollbackApps");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3032a = rollbackApps;
        this.f3033b = context;
        this.f3034c = listener;
    }

    public final ArrayList a() {
        return this.f3032a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3943j0 viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        Object obj = this.f3032a.get(i8);
        AbstractC3255y.h(obj, "rollbackApps[pos]");
        viewHolder.c((C1639f) obj, this.f3033b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3943j0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f3033b).inflate(R.layout.rollback_item, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new C3943j0(itemView, this.f3034c);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f3032a = new ArrayList(arrayList);
        } else {
            this.f3032a = new ArrayList();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3032a.size();
    }
}
