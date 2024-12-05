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
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3329q;
import o5.C3544f;
import o5.C3563o0;
import o5.G0;
import o5.L0;
import o5.P0;
import o5.Y0;
import o5.a1;

/* loaded from: classes4.dex */
public final class M extends RecyclerView.Adapter {

    /* renamed from: o, reason: collision with root package name */
    public static final a f1570o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f1571a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.E f1572b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1479b f1573c;

    /* renamed from: d, reason: collision with root package name */
    private final W4.F f1574d;

    /* renamed from: e, reason: collision with root package name */
    private final W4.G f1575e;

    /* renamed from: f, reason: collision with root package name */
    private final W4.L f1576f;

    /* renamed from: g, reason: collision with root package name */
    private final W4.t f1577g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1578h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f1579i;

    /* renamed from: j, reason: collision with root package name */
    private b f1580j;

    /* renamed from: k, reason: collision with root package name */
    private int f1581k;

    /* renamed from: l, reason: collision with root package name */
    private int f1582l;

    /* renamed from: m, reason: collision with root package name */
    private int f1583m;

    /* renamed from: n, reason: collision with root package name */
    private int f1584n;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f1585a;

        /* renamed from: b, reason: collision with root package name */
        private int f1586b = 3;

        public final int a() {
            return this.f1586b;
        }

        public final int b() {
            return this.f1585a;
        }

        public final void c(int i8) {
            this.f1586b = i8;
        }

        public final void d(int i8) {
            this.f1585a = i8;
        }
    }

    public M(ArrayList updates, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Context context, W4.E updatelistener, InterfaceC1479b applistener, W4.F headerlistener, W4.G uptodownProtectListener, W4.L warningTrackingDisabledListener, W4.t infoClickListener) {
        AbstractC3159y.i(updates, "updates");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(updatelistener, "updatelistener");
        AbstractC3159y.i(applistener, "applistener");
        AbstractC3159y.i(headerlistener, "headerlistener");
        AbstractC3159y.i(uptodownProtectListener, "uptodownProtectListener");
        AbstractC3159y.i(warningTrackingDisabledListener, "warningTrackingDisabledListener");
        AbstractC3159y.i(infoClickListener, "infoClickListener");
        this.f1571a = context;
        this.f1572b = updatelistener;
        this.f1573c = applistener;
        this.f1574d = headerlistener;
        this.f1575e = uptodownProtectListener;
        this.f1576f = warningTrackingDisabledListener;
        this.f1577g = infoClickListener;
        this.f1580j = new b();
        this.f1581k = -1;
        this.f1582l = -1;
        this.f1583m = -1;
        this.f1584n = -1;
        a(updates, arrayList, arrayList2, arrayList3);
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        f(new ArrayList());
        b().add("uptodown_protect");
        int i8 = 0;
        this.f1581k = 0;
        File g8 = new C3329q().g(this.f1571a);
        if (g8.exists() && new C3329q().k(this.f1571a, g8) < 262144000) {
            b().add("warning_not_space");
            i8 = 1;
            this.f1582l = 1;
        }
        if (arrayList != null) {
            this.f1580j.d(arrayList.size());
            this.f1580j.c(3);
        }
        b().add(this.f1580j);
        this.f1583m = i8 + 1;
        if (!SettingsPreferences.f29323b.k0(this.f1571a)) {
            b().add("tracking_disabled");
            this.f1584n = i8 + 2;
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
        ArrayList arrayList = this.f1578h;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3159y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c(int i8) {
        Object remove = b().remove(i8);
        AbstractC3159y.g(remove, "null cannot be cast to non-null type com.uptodown.models.App");
        C1496f c1496f = (C1496f) remove;
        c1496f.J0(C1496f.c.UPDATED);
        notifyItemRemoved(i8);
        int indexOf = b().indexOf("title_recent_updates") + 1;
        b().add(indexOf, c1496f);
        notifyItemInserted(indexOf);
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
        this.f1578h = arrayList;
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
        AbstractC3159y.h(obj, "data[position]");
        if (obj instanceof C1496f) {
            C1496f c1496f = (C1496f) obj;
            if (c1496f.c0() != C1496f.c.OUTDATED && c1496f.i() != 1) {
                return 1;
            }
            return 0;
        }
        if (obj instanceof String) {
            if (AbstractC3159y.d(obj, "uptodown_protect")) {
                return 4;
            }
            if (AbstractC3159y.d(obj, "warning_not_space")) {
                return 5;
            }
            if (AbstractC3159y.d(obj, "tracking_disabled")) {
                return 7;
            }
            if (AbstractC3159y.d(obj, "title_recent_updates")) {
                return 8;
            }
            if (AbstractC3159y.d(obj, "title_ignored")) {
                return 9;
            }
            if (AbstractC3159y.d(obj, "title_disable_app")) {
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
        if (this.f1580j.a() != 3) {
            this.f1580j.c(3);
            notifyItemChanged(this.f1583m);
        }
    }

    public final void i() {
        if (this.f1580j.a() != 2) {
            this.f1580j.c(2);
            notifyItemChanged(this.f1583m);
        }
    }

    public final void j() {
        if (this.f1580j.a() != 0) {
            this.f1580j.c(0);
            notifyItemChanged(this.f1583m);
        }
    }

    public final void k() {
        if (this.f1580j.a() != 1) {
            this.f1580j.c(1);
            notifyItemChanged(this.f1583m);
        }
    }

    public final void l(ArrayList arrayList) {
        this.f1579i = arrayList;
        notifyItemChanged(this.f1581k);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3544f) {
            Object obj = b().get(i8);
            AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
            ((C3544f) viewHolder).c((C1496f) obj);
            return;
        }
        if (viewHolder instanceof L0) {
            Object obj2 = b().get(i8);
            AbstractC3159y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
            ((L0) viewHolder).n((C1496f) obj2);
            return;
        }
        if (viewHolder instanceof P0) {
            ((P0) viewHolder).d(this.f1579i, this.f1571a);
            return;
        }
        if (viewHolder instanceof C3563o0) {
            ((C3563o0) viewHolder).b(true);
            return;
        }
        if (viewHolder instanceof Y0) {
            ((Y0) viewHolder).a(true);
        } else if (viewHolder instanceof G0) {
            ((G0) viewHolder).c(this.f1580j.a(), this.f1580j.b());
        } else {
            if (viewHolder instanceof a1) {
                ((a1) viewHolder).c(!SettingsPreferences.f29323b.k0(this.f1571a));
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
                switch (i8) {
                    case 4:
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uptodown_protect, viewGroup, false);
                        AbstractC3159y.h(inflate, "from(viewGroup.context).…rotect, viewGroup, false)");
                        return new P0(inflate, this.f1575e);
                    case 5:
                        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.warning_not_space_available, viewGroup, false);
                        AbstractC3159y.h(inflate2, "from(viewGroup.context).…ilable, viewGroup, false)");
                        return new Y0(inflate2);
                    case 6:
                        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.updates_header, viewGroup, false);
                        AbstractC3159y.h(inflate3, "from(viewGroup.context).…header, viewGroup, false)");
                        return new G0(inflate3, this.f1574d, this.f1571a);
                    case 7:
                        View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tracking_disabled, viewGroup, false);
                        AbstractC3159y.h(inflate4, "from(viewGroup.context).…sabled, viewGroup, false)");
                        return new a1(inflate4, this.f1571a, this.f1576f);
                    case 8:
                        View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                        AbstractC3159y.h(inflate5, "from(viewGroup.context).…_title, viewGroup, false)");
                        String string = this.f1571a.getString(R.string.updates_recent);
                        AbstractC3159y.h(string, "context.getString(R.string.updates_recent)");
                        return new C3563o0(inflate5, string, null);
                    case 9:
                        View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                        AbstractC3159y.h(inflate6, "from(viewGroup.context).…_title, viewGroup, false)");
                        String string2 = this.f1571a.getString(R.string.update_ignored);
                        AbstractC3159y.h(string2, "context.getString(R.string.update_ignored)");
                        return new C3563o0(inflate6, string2, null);
                    case 10:
                        View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                        AbstractC3159y.h(inflate7, "from(viewGroup.context).…_title, viewGroup, false)");
                        String string3 = this.f1571a.getString(R.string.disabled_apps);
                        AbstractC3159y.h(string3, "context.getString(R.string.disabled_apps)");
                        return new C3563o0(inflate7, string3, this.f1577g);
                    default:
                        throw new IllegalArgumentException("viewType unknown");
                }
            }
            View inflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.installed_app_item, viewGroup, false);
            AbstractC3159y.h(inflate8, "from(viewGroup.context).…p_item, viewGroup, false)");
            return new C3544f(inflate8, this.f1573c, this.f1571a);
        }
        View inflate9 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.update_item, viewGroup, false);
        AbstractC3159y.h(inflate9, "from(viewGroup.context).…e_item, viewGroup, false)");
        return new L0(inflate9, this.f1572b, this.f1571a);
    }
}
