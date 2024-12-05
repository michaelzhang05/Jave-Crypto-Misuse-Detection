package D4;

import X4.C1496f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3553j0;

/* loaded from: classes4.dex */
public final class C extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1490a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1491b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.B f1492c;

    public C(ArrayList rollbackApps, Context context, W4.B listener) {
        AbstractC3159y.i(rollbackApps, "rollbackApps");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1490a = rollbackApps;
        this.f1491b = context;
        this.f1492c = listener;
    }

    public final ArrayList a() {
        return this.f1490a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3553j0 viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        Object obj = this.f1490a.get(i8);
        AbstractC3159y.h(obj, "rollbackApps[pos]");
        viewHolder.c((C1496f) obj, this.f1491b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3553j0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f1491b).inflate(R.layout.rollback_item, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new C3553j0(itemView, this.f1492c);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f1490a = new ArrayList(arrayList);
        } else {
            this.f1490a = new ArrayList();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1490a.size();
    }
}
