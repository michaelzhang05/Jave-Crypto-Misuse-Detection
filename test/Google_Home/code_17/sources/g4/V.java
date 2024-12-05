package G4;

import W4.H0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import r5.e1;

/* loaded from: classes4.dex */
public final class V extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3192a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3193b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.M f3194c;

    public V(ArrayList wishlist, Context context, Z4.M listener) {
        AbstractC3255y.i(wishlist, "wishlist");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3192a = wishlist;
        this.f3193b = context;
        this.f3194c = listener;
    }

    public final ArrayList a() {
        return this.f3192a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e1 viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        Object obj = this.f3192a.get(i8);
        AbstractC3255y.h(obj, "wishlist[pos]");
        viewHolder.n((a5.U) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e1 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        H0 c8 = H0.c(LayoutInflater.from(this.f3193b), viewGroup, false);
        AbstractC3255y.h(c8, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
        return new e1(c8, this.f3193b, this.f3194c);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f3192a = new ArrayList(arrayList);
        } else {
            this.f3192a = new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3192a.size();
    }
}
