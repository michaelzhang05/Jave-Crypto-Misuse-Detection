package G4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3949m0;

/* loaded from: classes4.dex */
public final class D extends RecyclerView.Adapter {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3035c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3036a;

    /* renamed from: b, reason: collision with root package name */
    private final Z4.C f3037b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public D(ArrayList arrayList, Z4.C listener) {
        AbstractC3255y.i(listener, "listener");
        this.f3036a = arrayList;
        this.f3037b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3949m0 viewHolder, int i8) {
        Object obj;
        AbstractC3255y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f3036a;
        Object obj2 = null;
        if (arrayList != null) {
            obj = arrayList.get(i8);
        } else {
            obj = null;
        }
        if (obj instanceof a5.T) {
            ArrayList arrayList2 = this.f3036a;
            if (arrayList2 != null) {
                obj2 = arrayList2.get(i8);
            }
            AbstractC3255y.f(obj2);
            viewHolder.g((a5.T) obj2);
            return;
        }
        ArrayList arrayList3 = this.f3036a;
        if (arrayList3 != null) {
            obj2 = arrayList3.get(i8);
        }
        AbstractC3255y.f(obj2);
        viewHolder.f((a5.L) obj2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3949m0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.screenshot_item, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new C3949m0(itemView, this.f3037b);
    }

    public final void c(Object item) {
        Integer num;
        AbstractC3255y.i(item, "item");
        ArrayList arrayList = this.f3036a;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.indexOf(item));
        } else {
            num = null;
        }
        if (num != null && num.intValue() != -1) {
            ArrayList arrayList2 = this.f3036a;
            if (arrayList2 != null) {
                arrayList2.remove(num.intValue());
            }
            notifyItemRemoved(num.intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3036a;
        if (arrayList != null) {
            AbstractC3255y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        Object obj;
        ArrayList arrayList = this.f3036a;
        if (arrayList != null) {
            obj = arrayList.get(i8);
        } else {
            obj = null;
        }
        if (obj instanceof a5.T) {
            return 0;
        }
        return 1;
    }
}
