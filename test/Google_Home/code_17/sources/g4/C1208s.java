package G4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: G4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1208s extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3328a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3329b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.v f3330c;

    public C1208s(ArrayList data, Context context, Z4.v listener) {
        AbstractC3255y.i(data, "data");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3328a = data;
        this.f3329b = context;
        this.f3330c = listener;
    }

    public final ArrayList a() {
        return this.f3328a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(r5.Q viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        Object obj = this.f3328a.get(i8);
        AbstractC3255y.h(obj, "data[pos]");
        viewHolder.h((a5.y) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public r5.Q onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f3329b).inflate(R.layout.notification_registry_item, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new r5.Q(itemView, this.f3330c);
    }

    public final void d(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<set-?>");
        this.f3328a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3328a.size();
    }
}
