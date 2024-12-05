package G4;

import Z4.InterfaceC1587a;
import a5.C1641h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3930d;

/* renamed from: G4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1206p extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f3311a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1587a f3312b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3313c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3314d;

    public C1206p(Z4.s listener, InterfaceC1587a actionsClickListener, Context context) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f3311a = listener;
        this.f3312b = actionsClickListener;
        this.f3313c = context;
        this.f3314d = new ArrayList();
    }

    public final ArrayList a() {
        return this.f3314d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3930d holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        Object obj = this.f3314d.get(i8);
        AbstractC3255y.h(obj, "apps[position]");
        holder.m((C1641h) obj, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3930d onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_info_item_small, parent, false);
        AbstractC3255y.h(itemView, "itemView");
        return new C3930d(itemView, this.f3311a, this.f3312b, this.f3313c);
    }

    public final void d(ArrayList appList) {
        AbstractC3255y.i(appList, "appList");
        ArrayList arrayList = this.f3314d;
        arrayList.clear();
        arrayList.addAll(appList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3314d.size();
    }
}
