package D4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: D4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1109s extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1786a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1787b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.v f1788c;

    public C1109s(ArrayList data, Context context, W4.v listener) {
        AbstractC3159y.i(data, "data");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1786a = data;
        this.f1787b = context;
        this.f1788c = listener;
    }

    public final ArrayList a() {
        return this.f1786a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(o5.Q viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        Object obj = this.f1786a.get(i8);
        AbstractC3159y.h(obj, "data[pos]");
        viewHolder.h((X4.y) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o5.Q onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f1787b).inflate(R.layout.notification_registry_item, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new o5.Q(itemView, this.f1788c);
    }

    public final void d(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f1786a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1786a.size();
    }
}
