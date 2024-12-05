package G4;

import Z4.InterfaceC1588b;
import a5.C1639f;
import a5.C1641h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3934f;
import r5.C3953o0;
import r5.L0;
import r5.P0;

/* loaded from: classes4.dex */
public final class r extends RecyclerView.Adapter {

    /* renamed from: j, reason: collision with root package name */
    public static final a f3318j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f3319a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1588b f3320b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.E f3321c;

    /* renamed from: d, reason: collision with root package name */
    private final Z4.G f3322d;

    /* renamed from: e, reason: collision with root package name */
    private final Z4.t f3323e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3324f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f3325g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3326h;

    /* renamed from: i, reason: collision with root package name */
    private int f3327i;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public r(ArrayList apps, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Context context, InterfaceC1588b applistener, Z4.E e8, Z4.G uptodownProtectListener, Z4.t infoClickListener) {
        AbstractC3255y.i(apps, "apps");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(applistener, "applistener");
        AbstractC3255y.i(uptodownProtectListener, "uptodownProtectListener");
        AbstractC3255y.i(infoClickListener, "infoClickListener");
        this.f3319a = context;
        this.f3320b = applistener;
        this.f3321c = e8;
        this.f3322d = uptodownProtectListener;
        this.f3323e = infoClickListener;
        this.f3327i = -1;
        a(apps, arrayList, arrayList2, arrayList3);
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        f(new ArrayList());
        b().add("uptodown_protect");
        this.f3327i = 0;
        b().addAll(arrayList);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            b().add("title_system_app");
            b().addAll(arrayList2);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            b().add("title_disable_app");
            b().addAll(arrayList3);
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            b().add("title_system_service");
            b().addAll(arrayList4);
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f3324f;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3255y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c() {
        notifyDataSetChanged();
    }

    public final void d(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        Iterator it = b().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            Object next = it.next();
            if (next instanceof C1639f) {
                C1639f c1639f = (C1639f) next;
                if (AbstractC3255y.d(c1639f.J(), appInfo.y0())) {
                    c1639f.O0(appInfo.t0());
                    notifyItemChanged(i8);
                    return;
                }
            }
            i8 = i9;
        }
    }

    public final void e(HashMap hashMap) {
        AbstractC3255y.i(hashMap, "hashMap");
        Iterator it = b().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            Object next = it.next();
            if (next instanceof C1639f) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    C1639f c1639f = (C1639f) next;
                    if (AbstractC3255y.d(entry.getKey(), c1639f.J())) {
                        c1639f.O0((String) entry.getValue());
                        notifyItemChanged(i8);
                    }
                }
            }
            i8 = i9;
        }
    }

    public final void f(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<set-?>");
        this.f3324f = arrayList;
    }

    public final void g(ArrayList apps, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC3255y.i(apps, "apps");
        a(apps, arrayList, arrayList2, arrayList3);
        notifyDataSetChanged();
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
            if (((C1639f) obj).c0() == C1639f.c.OUTDATED) {
                return 1;
            }
            return 0;
        }
        if (obj instanceof String) {
            if (AbstractC3255y.d(obj, "uptodown_protect")) {
                return 3;
            }
            if (AbstractC3255y.d(obj, "title_system_app")) {
                return 4;
            }
            if (AbstractC3255y.d(obj, "title_system_service")) {
                return 5;
            }
            if (AbstractC3255y.d(obj, "title_disable_app")) {
                return 6;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final void h(ArrayList arrayList) {
        this.f3325g = arrayList;
        this.f3326h = false;
        notifyItemChanged(this.f3327i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3934f) {
            Object obj = b().get(i8);
            AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
            ((C3934f) viewHolder).c((C1639f) obj);
        } else if (viewHolder instanceof L0) {
            Object obj2 = b().get(i8);
            AbstractC3255y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
            ((L0) viewHolder).n((C1639f) obj2);
        } else if (viewHolder instanceof P0) {
            ((P0) viewHolder).d(this.f3325g, this.f3319a);
        } else {
            if (viewHolder instanceof C3953o0) {
                ((C3953o0) viewHolder).b(true);
                return;
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            if (i8 == 6) {
                                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                                AbstractC3255y.h(inflate, "from(viewGroup.context).…_title, viewGroup, false)");
                                String string = this.f3319a.getString(R.string.disabled_apps);
                                AbstractC3255y.h(string, "context.getString(R.string.disabled_apps)");
                                return new C3953o0(inflate, string, this.f3323e);
                            }
                            throw new IllegalArgumentException("viewType unknown");
                        }
                        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                        AbstractC3255y.h(inflate2, "from(viewGroup.context).…_title, viewGroup, false)");
                        String string2 = this.f3319a.getString(R.string.menu_item_title_system_services);
                        AbstractC3255y.h(string2, "context.getString(R.stri…em_title_system_services)");
                        return new C3953o0(inflate2, string2, null);
                    }
                    View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                    AbstractC3255y.h(inflate3, "from(viewGroup.context).…_title, viewGroup, false)");
                    String string3 = this.f3319a.getString(R.string.system_apps_title);
                    AbstractC3255y.h(string3, "context.getString(R.string.system_apps_title)");
                    return new C3953o0(inflate3, string3, null);
                }
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uptodown_protect, viewGroup, false);
                AbstractC3255y.h(inflate4, "from(viewGroup.context).…rotect, viewGroup, false)");
                return new P0(inflate4, this.f3322d);
            }
            View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.update_item, viewGroup, false);
            AbstractC3255y.h(inflate5, "from(viewGroup.context).…e_item, viewGroup, false)");
            return new L0(inflate5, this.f3321c, this.f3319a);
        }
        View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.installed_app_item, viewGroup, false);
        AbstractC3255y.h(inflate6, "from(viewGroup.context).…p_item, viewGroup, false)");
        return new C3934f(inflate6, this.f3320b, this.f3319a);
    }
}
