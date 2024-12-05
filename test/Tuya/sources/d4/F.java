package D4;

import W4.InterfaceC1479b;
import X4.C1496f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import o5.P0;
import o5.Y;

/* loaded from: classes4.dex */
public final class F extends RecyclerView.Adapter {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1501f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f1502a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1479b f1503b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.G f1504c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1505d;

    /* renamed from: e, reason: collision with root package name */
    private int f1506e;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public F(ArrayList apps, Context context, InterfaceC1479b applistener, W4.G uptodownProtectListener) {
        AbstractC3159y.i(apps, "apps");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(applistener, "applistener");
        AbstractC3159y.i(uptodownProtectListener, "uptodownProtectListener");
        this.f1502a = context;
        this.f1503b = applistener;
        this.f1504c = uptodownProtectListener;
        this.f1506e = -1;
        a(apps);
    }

    private final void a(ArrayList arrayList) {
        d(new ArrayList());
        b().add("uptodown_protect");
        this.f1506e = 0;
        b().addAll(arrayList);
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f1505d;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3159y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c(ArrayList apps) {
        AbstractC3159y.i(apps, "apps");
        a(apps);
        notifyDataSetChanged();
    }

    public final void d(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f1505d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        Object obj = b().get(i8);
        AbstractC3159y.h(obj, "data[position]");
        if (obj instanceof C1496f) {
            return 0;
        }
        if (obj instanceof String) {
            if (AbstractC3159y.d(obj, "uptodown_protect")) {
                return 3;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof Y) {
            Object obj = b().get(i8);
            AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
            ((Y) viewHolder).c((C1496f) obj);
        } else {
            if (viewHolder instanceof P0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = b().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C1496f) {
                        arrayList.add(next);
                    }
                }
                ((P0) viewHolder).d(arrayList, this.f1502a);
                return;
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 3) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uptodown_protect, viewGroup, false);
                AbstractC3159y.h(inflate, "from(viewGroup.context).…rotect, viewGroup, false)");
                return new P0(inflate, this.f1504c);
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_positive, viewGroup, false);
        AbstractC3159y.h(inflate2, "from(viewGroup.context).…sitive, viewGroup, false)");
        return new Y(inflate2, this.f1503b, this.f1502a);
    }
}
