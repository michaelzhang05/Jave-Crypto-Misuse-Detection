package G4;

import Z4.InterfaceC1588b;
import a5.C1639f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r5.P0;
import r5.Y;

/* loaded from: classes4.dex */
public final class F extends RecyclerView.Adapter {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3043f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f3044a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1588b f3045b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.G f3046c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3047d;

    /* renamed from: e, reason: collision with root package name */
    private int f3048e;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public F(ArrayList apps, Context context, InterfaceC1588b applistener, Z4.G uptodownProtectListener) {
        AbstractC3255y.i(apps, "apps");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(applistener, "applistener");
        AbstractC3255y.i(uptodownProtectListener, "uptodownProtectListener");
        this.f3044a = context;
        this.f3045b = applistener;
        this.f3046c = uptodownProtectListener;
        this.f3048e = -1;
        a(apps);
    }

    private final void a(ArrayList arrayList) {
        d(new ArrayList());
        b().add("uptodown_protect");
        this.f3048e = 0;
        b().addAll(arrayList);
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f3047d;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3255y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c(ArrayList apps) {
        AbstractC3255y.i(apps, "apps");
        a(apps);
        notifyDataSetChanged();
    }

    public final void d(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<set-?>");
        this.f3047d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        Object obj = b().get(i8);
        AbstractC3255y.h(obj, "data[position]");
        if (obj instanceof C1639f) {
            return 0;
        }
        if (obj instanceof String) {
            if (AbstractC3255y.d(obj, "uptodown_protect")) {
                return 3;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof Y) {
            Object obj = b().get(i8);
            AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
            ((Y) viewHolder).c((C1639f) obj);
        } else {
            if (viewHolder instanceof P0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = b().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C1639f) {
                        arrayList.add(next);
                    }
                }
                ((P0) viewHolder).d(arrayList, this.f3044a);
                return;
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 3) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uptodown_protect, viewGroup, false);
                AbstractC3255y.h(inflate, "from(viewGroup.context).…rotect, viewGroup, false)");
                return new P0(inflate, this.f3046c);
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_positive, viewGroup, false);
        AbstractC3255y.h(inflate2, "from(viewGroup.context).…sitive, viewGroup, false)");
        return new Y(inflate2, this.f3045b, this.f3044a);
    }
}
