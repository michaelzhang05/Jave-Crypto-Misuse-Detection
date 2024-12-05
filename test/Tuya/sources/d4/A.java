package D4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3539c0;

/* loaded from: classes4.dex */
public final class A extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1482a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1483b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.z f1484c;

    public A(ArrayList datos, Context context, W4.z listener) {
        AbstractC3159y.i(datos, "datos");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1482a = datos;
        this.f1483b = context;
        this.f1484c = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3539c0 viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        Object obj = this.f1482a.get(i8);
        AbstractC3159y.h(obj, "datos[pos]");
        viewHolder.d((X4.G) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3539c0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reply, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new C3539c0(itemView, this.f1483b, this.f1484c);
    }

    public final void c(X4.G reply) {
        AbstractC3159y.i(reply, "reply");
        Iterator it = this.f1482a.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((X4.G) it.next()).e() == reply.e()) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        this.f1482a.set(i8, reply);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1482a.size();
    }
}
