package D4;

import W4.InterfaceC1479b;
import X4.C1496f;
import X4.C1498h;
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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3544f;
import o5.C3563o0;
import o5.L0;
import o5.P0;

/* loaded from: classes4.dex */
public final class r extends RecyclerView.Adapter {

    /* renamed from: j, reason: collision with root package name */
    public static final a f1776j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f1777a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1479b f1778b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.E f1779c;

    /* renamed from: d, reason: collision with root package name */
    private final W4.G f1780d;

    /* renamed from: e, reason: collision with root package name */
    private final W4.t f1781e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1782f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f1783g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1784h;

    /* renamed from: i, reason: collision with root package name */
    private int f1785i;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public r(ArrayList apps, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Context context, InterfaceC1479b applistener, W4.E e8, W4.G uptodownProtectListener, W4.t infoClickListener) {
        AbstractC3159y.i(apps, "apps");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(applistener, "applistener");
        AbstractC3159y.i(uptodownProtectListener, "uptodownProtectListener");
        AbstractC3159y.i(infoClickListener, "infoClickListener");
        this.f1777a = context;
        this.f1778b = applistener;
        this.f1779c = e8;
        this.f1780d = uptodownProtectListener;
        this.f1781e = infoClickListener;
        this.f1785i = -1;
        a(apps, arrayList, arrayList2, arrayList3);
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        f(new ArrayList());
        b().add("uptodown_protect");
        this.f1785i = 0;
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
        ArrayList arrayList = this.f1782f;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3159y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c() {
        notifyDataSetChanged();
    }

    public final void d(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        Iterator it = b().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            Object next = it.next();
            if (next instanceof C1496f) {
                C1496f c1496f = (C1496f) next;
                if (AbstractC3159y.d(c1496f.Q(), appInfo.y0())) {
                    c1496f.O0(appInfo.t0());
                    notifyItemChanged(i8);
                    return;
                }
            }
            i8 = i9;
        }
    }

    public final void e(HashMap hashMap) {
        AbstractC3159y.i(hashMap, "hashMap");
        Iterator it = b().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            Object next = it.next();
            if (next instanceof C1496f) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    C1496f c1496f = (C1496f) next;
                    if (AbstractC3159y.d(entry.getKey(), c1496f.Q())) {
                        c1496f.O0((String) entry.getValue());
                        notifyItemChanged(i8);
                    }
                }
            }
            i8 = i9;
        }
    }

    public final void f(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f1782f = arrayList;
    }

    public final void g(ArrayList apps, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC3159y.i(apps, "apps");
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
        AbstractC3159y.h(obj, "data[position]");
        if (obj instanceof C1496f) {
            if (((C1496f) obj).c0() == C1496f.c.OUTDATED) {
                return 1;
            }
            return 0;
        }
        if (obj instanceof String) {
            if (AbstractC3159y.d(obj, "uptodown_protect")) {
                return 3;
            }
            if (AbstractC3159y.d(obj, "title_system_app")) {
                return 4;
            }
            if (AbstractC3159y.d(obj, "title_system_service")) {
                return 5;
            }
            if (AbstractC3159y.d(obj, "title_disable_app")) {
                return 6;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final void h(ArrayList arrayList) {
        this.f1783g = arrayList;
        this.f1784h = false;
        notifyItemChanged(this.f1785i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3544f) {
            Object obj = b().get(i8);
            AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
            ((C3544f) viewHolder).c((C1496f) obj);
        } else if (viewHolder instanceof L0) {
            Object obj2 = b().get(i8);
            AbstractC3159y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
            ((L0) viewHolder).n((C1496f) obj2);
        } else if (viewHolder instanceof P0) {
            ((P0) viewHolder).d(this.f1783g, this.f1777a);
        } else {
            if (viewHolder instanceof C3563o0) {
                ((C3563o0) viewHolder).b(true);
                return;
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            if (i8 == 6) {
                                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                                AbstractC3159y.h(inflate, "from(viewGroup.context).…_title, viewGroup, false)");
                                String string = this.f1777a.getString(R.string.disabled_apps);
                                AbstractC3159y.h(string, "context.getString(R.string.disabled_apps)");
                                return new C3563o0(inflate, string, this.f1781e);
                            }
                            throw new IllegalArgumentException("viewType unknown");
                        }
                        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                        AbstractC3159y.h(inflate2, "from(viewGroup.context).…_title, viewGroup, false)");
                        String string2 = this.f1777a.getString(R.string.menu_item_title_system_services);
                        AbstractC3159y.h(string2, "context.getString(R.stri…em_title_system_services)");
                        return new C3563o0(inflate2, string2, null);
                    }
                    View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                    AbstractC3159y.h(inflate3, "from(viewGroup.context).…_title, viewGroup, false)");
                    String string3 = this.f1777a.getString(R.string.system_apps_title);
                    AbstractC3159y.h(string3, "context.getString(R.string.system_apps_title)");
                    return new C3563o0(inflate3, string3, null);
                }
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uptodown_protect, viewGroup, false);
                AbstractC3159y.h(inflate4, "from(viewGroup.context).…rotect, viewGroup, false)");
                return new P0(inflate4, this.f1780d);
            }
            View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.update_item, viewGroup, false);
            AbstractC3159y.h(inflate5, "from(viewGroup.context).…e_item, viewGroup, false)");
            return new L0(inflate5, this.f1779c, this.f1777a);
        }
        View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.installed_app_item, viewGroup, false);
        AbstractC3159y.h(inflate6, "from(viewGroup.context).…p_item, viewGroup, false)");
        return new C3544f(inflate6, this.f1778b, this.f1777a);
    }
}
