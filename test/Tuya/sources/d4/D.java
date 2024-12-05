package D4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3559m0;

/* loaded from: classes4.dex */
public final class D extends RecyclerView.Adapter {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1493c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1494a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.C f1495b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public D(ArrayList arrayList, W4.C listener) {
        AbstractC3159y.i(listener, "listener");
        this.f1494a = arrayList;
        this.f1495b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3559m0 viewHolder, int i8) {
        Object obj;
        AbstractC3159y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f1494a;
        Object obj2 = null;
        if (arrayList != null) {
            obj = arrayList.get(i8);
        } else {
            obj = null;
        }
        if (obj instanceof X4.T) {
            ArrayList arrayList2 = this.f1494a;
            if (arrayList2 != null) {
                obj2 = arrayList2.get(i8);
            }
            AbstractC3159y.f(obj2);
            viewHolder.g((X4.T) obj2);
            return;
        }
        ArrayList arrayList3 = this.f1494a;
        if (arrayList3 != null) {
            obj2 = arrayList3.get(i8);
        }
        AbstractC3159y.f(obj2);
        viewHolder.f((X4.L) obj2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3559m0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.screenshot_item, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new C3559m0(itemView, this.f1495b);
    }

    public final void c(Object item) {
        Integer num;
        AbstractC3159y.i(item, "item");
        ArrayList arrayList = this.f1494a;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.indexOf(item));
        } else {
            num = null;
        }
        if (num != null && num.intValue() != -1) {
            ArrayList arrayList2 = this.f1494a;
            if (arrayList2 != null) {
                arrayList2.remove(num.intValue());
            }
            notifyItemRemoved(num.intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f1494a;
        if (arrayList != null) {
            AbstractC3159y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        Object obj;
        ArrayList arrayList = this.f1494a;
        if (arrayList != null) {
            obj = arrayList.get(i8);
        } else {
            obj = null;
        }
        if (obj instanceof X4.T) {
            return 0;
        }
        return 1;
    }
}
