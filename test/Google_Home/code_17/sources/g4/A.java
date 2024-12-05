package G4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3929c0;

/* loaded from: classes4.dex */
public final class A extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3024a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3025b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.z f3026c;

    public A(ArrayList datos, Context context, Z4.z listener) {
        AbstractC3255y.i(datos, "datos");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3024a = datos;
        this.f3025b = context;
        this.f3026c = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3929c0 viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        Object obj = this.f3024a.get(i8);
        AbstractC3255y.h(obj, "datos[pos]");
        viewHolder.d((a5.G) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3929c0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reply, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new C3929c0(itemView, this.f3025b, this.f3026c);
    }

    public final void c(a5.G reply) {
        AbstractC3255y.i(reply, "reply");
        Iterator it = this.f3024a.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((a5.G) it.next()).g() == reply.g()) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        this.f3024a.set(i8, reply);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3024a.size();
    }
}
