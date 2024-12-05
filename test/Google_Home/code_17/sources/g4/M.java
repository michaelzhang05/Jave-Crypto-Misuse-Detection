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
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3677q;
import r5.C3934f;
import r5.C3953o0;
import r5.G0;
import r5.L0;
import r5.P0;
import r5.Y0;
import r5.a1;

/* loaded from: classes4.dex */
public final class M extends RecyclerView.Adapter {

    /* renamed from: o, reason: collision with root package name */
    public static final a f3112o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f3113a;

    /* renamed from: b, reason: collision with root package name */
    private final Z4.E f3114b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1588b f3115c;

    /* renamed from: d, reason: collision with root package name */
    private final Z4.F f3116d;

    /* renamed from: e, reason: collision with root package name */
    private final Z4.G f3117e;

    /* renamed from: f, reason: collision with root package name */
    private final Z4.L f3118f;

    /* renamed from: g, reason: collision with root package name */
    private final Z4.t f3119g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3120h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f3121i;

    /* renamed from: j, reason: collision with root package name */
    private b f3122j;

    /* renamed from: k, reason: collision with root package name */
    private int f3123k;

    /* renamed from: l, reason: collision with root package name */
    private int f3124l;

    /* renamed from: m, reason: collision with root package name */
    private int f3125m;

    /* renamed from: n, reason: collision with root package name */
    private int f3126n;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f3127a;

        /* renamed from: b, reason: collision with root package name */
        private int f3128b = 3;

        public final int a() {
            return this.f3128b;
        }

        public final int b() {
            return this.f3127a;
        }

        public final void c(int i8) {
            this.f3128b = i8;
        }

        public final void d(int i8) {
            this.f3127a = i8;
        }
    }

    public M(ArrayList updates, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Context context, Z4.E updatelistener, InterfaceC1588b applistener, Z4.F headerlistener, Z4.G uptodownProtectListener, Z4.L warningTrackingDisabledListener, Z4.t infoClickListener) {
        AbstractC3255y.i(updates, "updates");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(updatelistener, "updatelistener");
        AbstractC3255y.i(applistener, "applistener");
        AbstractC3255y.i(headerlistener, "headerlistener");
        AbstractC3255y.i(uptodownProtectListener, "uptodownProtectListener");
        AbstractC3255y.i(warningTrackingDisabledListener, "warningTrackingDisabledListener");
        AbstractC3255y.i(infoClickListener, "infoClickListener");
        this.f3113a = context;
        this.f3114b = updatelistener;
        this.f3115c = applistener;
        this.f3116d = headerlistener;
        this.f3117e = uptodownProtectListener;
        this.f3118f = warningTrackingDisabledListener;
        this.f3119g = infoClickListener;
        this.f3122j = new b();
        this.f3123k = -1;
        this.f3124l = -1;
        this.f3125m = -1;
        this.f3126n = -1;
        a(updates, arrayList, arrayList2, arrayList3);
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        f(new ArrayList());
        b().add("uptodown_protect");
        int i8 = 0;
        this.f3123k = 0;
        File g8 = new C3677q().g(this.f3113a);
        if (g8.exists() && new C3677q().k(this.f3113a, g8) < 262144000) {
            b().add("warning_not_space");
            i8 = 1;
            this.f3124l = 1;
        }
        if (arrayList != null) {
            this.f3122j.d(arrayList.size());
            this.f3122j.c(3);
        }
        b().add(this.f3122j);
        this.f3125m = i8 + 1;
        if (!SettingsPreferences.f30353b.k0(this.f3113a)) {
            b().add("tracking_disabled");
            this.f3126n = i8 + 2;
            return;
        }
        if (arrayList != null) {
            b().addAll(arrayList);
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            b().add("title_disable_app");
            b().addAll(arrayList4);
        }
        if (arrayList2 != null && arrayList2.size() > 0) {
            b().add("title_recent_updates");
            b().addAll(arrayList2);
        }
        if (arrayList3 != null && arrayList3.size() > 0) {
            b().add("title_ignored");
            b().addAll(arrayList3);
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f3120h;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3255y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c(int i8) {
        Object remove = b().remove(i8);
        AbstractC3255y.g(remove, "null cannot be cast to non-null type com.uptodown.models.App");
        C1639f c1639f = (C1639f) remove;
        c1639f.J0(C1639f.c.UPDATED);
        notifyItemRemoved(i8);
        int indexOf = b().indexOf("title_recent_updates") + 1;
        b().add(indexOf, c1639f);
        notifyItemInserted(indexOf);
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
        this.f3120h = arrayList;
    }

    public final void g(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        a(arrayList, arrayList2, arrayList3, arrayList4);
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
            C1639f c1639f = (C1639f) obj;
            if (c1639f.c0() != C1639f.c.OUTDATED && c1639f.i() != 1) {
                return 1;
            }
            return 0;
        }
        if (obj instanceof String) {
            if (AbstractC3255y.d(obj, "uptodown_protect")) {
                return 4;
            }
            if (AbstractC3255y.d(obj, "warning_not_space")) {
                return 5;
            }
            if (AbstractC3255y.d(obj, "tracking_disabled")) {
                return 7;
            }
            if (AbstractC3255y.d(obj, "title_recent_updates")) {
                return 8;
            }
            if (AbstractC3255y.d(obj, "title_ignored")) {
                return 9;
            }
            if (AbstractC3255y.d(obj, "title_disable_app")) {
                return 10;
            }
            throw new IllegalArgumentException();
        }
        if (obj instanceof b) {
            return 6;
        }
        throw new IllegalArgumentException();
    }

    public final void h() {
        if (this.f3122j.a() != 3) {
            this.f3122j.c(3);
            notifyItemChanged(this.f3125m);
        }
    }

    public final void i() {
        if (this.f3122j.a() != 2) {
            this.f3122j.c(2);
            notifyItemChanged(this.f3125m);
        }
    }

    public final void j() {
        if (this.f3122j.a() != 0) {
            this.f3122j.c(0);
            notifyItemChanged(this.f3125m);
        }
    }

    public final void k() {
        if (this.f3122j.a() != 1) {
            this.f3122j.c(1);
            notifyItemChanged(this.f3125m);
        }
    }

    public final void l(ArrayList arrayList) {
        this.f3121i = arrayList;
        notifyItemChanged(this.f3123k);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3934f) {
            Object obj = b().get(i8);
            AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
            ((C3934f) viewHolder).c((C1639f) obj);
            return;
        }
        if (viewHolder instanceof L0) {
            Object obj2 = b().get(i8);
            AbstractC3255y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
            ((L0) viewHolder).n((C1639f) obj2);
            return;
        }
        if (viewHolder instanceof P0) {
            ((P0) viewHolder).d(this.f3121i, this.f3113a);
            return;
        }
        if (viewHolder instanceof C3953o0) {
            ((C3953o0) viewHolder).b(true);
            return;
        }
        if (viewHolder instanceof Y0) {
            ((Y0) viewHolder).a(true);
        } else if (viewHolder instanceof G0) {
            ((G0) viewHolder).c(this.f3122j.a(), this.f3122j.b());
        } else {
            if (viewHolder instanceof a1) {
                ((a1) viewHolder).c(!SettingsPreferences.f30353b.k0(this.f3113a));
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
                switch (i8) {
                    case 4:
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uptodown_protect, viewGroup, false);
                        AbstractC3255y.h(inflate, "from(viewGroup.context).…rotect, viewGroup, false)");
                        return new P0(inflate, this.f3117e);
                    case 5:
                        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.warning_not_space_available, viewGroup, false);
                        AbstractC3255y.h(inflate2, "from(viewGroup.context).…ilable, viewGroup, false)");
                        return new Y0(inflate2);
                    case 6:
                        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.updates_header, viewGroup, false);
                        AbstractC3255y.h(inflate3, "from(viewGroup.context).…header, viewGroup, false)");
                        return new G0(inflate3, this.f3116d, this.f3113a);
                    case 7:
                        View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tracking_disabled, viewGroup, false);
                        AbstractC3255y.h(inflate4, "from(viewGroup.context).…sabled, viewGroup, false)");
                        return new a1(inflate4, this.f3113a, this.f3118f);
                    case 8:
                        View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                        AbstractC3255y.h(inflate5, "from(viewGroup.context).…_title, viewGroup, false)");
                        String string = this.f3113a.getString(R.string.updates_recent);
                        AbstractC3255y.h(string, "context.getString(R.string.updates_recent)");
                        return new C3953o0(inflate5, string, null);
                    case 9:
                        View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                        AbstractC3255y.h(inflate6, "from(viewGroup.context).…_title, viewGroup, false)");
                        String string2 = this.f3113a.getString(R.string.update_ignored);
                        AbstractC3255y.h(string2, "context.getString(R.string.update_ignored)");
                        return new C3953o0(inflate6, string2, null);
                    case 10:
                        View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                        AbstractC3255y.h(inflate7, "from(viewGroup.context).…_title, viewGroup, false)");
                        String string3 = this.f3113a.getString(R.string.disabled_apps);
                        AbstractC3255y.h(string3, "context.getString(R.string.disabled_apps)");
                        return new C3953o0(inflate7, string3, this.f3119g);
                    default:
                        throw new IllegalArgumentException("viewType unknown");
                }
            }
            View inflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.installed_app_item, viewGroup, false);
            AbstractC3255y.h(inflate8, "from(viewGroup.context).…p_item, viewGroup, false)");
            return new C3934f(inflate8, this.f3115c, this.f3113a);
        }
        View inflate9 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.update_item, viewGroup, false);
        AbstractC3255y.h(inflate9, "from(viewGroup.context).…e_item, viewGroup, false)");
        return new L0(inflate9, this.f3114b, this.f3113a);
    }
}
