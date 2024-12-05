package G4;

import Z4.InterfaceC1595i;
import a5.C1648o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: G4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1194d extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3208a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1595i f3209b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3210c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3211d;

    /* renamed from: e, reason: collision with root package name */
    private boolean[] f3212e;

    public C1194d(ArrayList downloadsCompleted, ArrayList arrayList, Context context, InterfaceC1595i listener) {
        AbstractC3255y.i(downloadsCompleted, "downloadsCompleted");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3208a = context;
        this.f3209b = listener;
        b(downloadsCompleted, arrayList);
    }

    private final void a(r5.r rVar, C1648o c1648o, boolean z8, boolean z9) {
        if (c1648o.g() == null) {
            rVar.p(c1648o, z8, z9);
        } else {
            rVar.o(c1648o, z8, z9);
        }
    }

    private final void b(ArrayList arrayList, ArrayList arrayList2) {
        h(new ArrayList());
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            d().addAll(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            d().addAll(arrayList);
        }
        this.f3212e = new boolean[d().size()];
    }

    public final int c() {
        boolean[] zArr = this.f3212e;
        if (zArr == null) {
            return 0;
        }
        AbstractC3255y.f(zArr);
        int i8 = 0;
        for (boolean z8 : zArr) {
            if (z8) {
                i8++;
            }
        }
        return i8;
    }

    public final ArrayList d() {
        ArrayList arrayList = this.f3210c;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3255y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        boolean[] zArr = this.f3212e;
        AbstractC3255y.f(zArr);
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (zArr[i8]) {
                boolean[] zArr2 = this.f3212e;
                AbstractC3255y.f(zArr2);
                if (i8 < zArr2.length) {
                    arrayList.add(d().get(i8));
                }
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return this.f3211d;
    }

    public final void g(ArrayList downloads, ArrayList arrayList) {
        AbstractC3255y.i(downloads, "downloads");
        b(downloads, arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return d().size();
    }

    public final void h(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<set-?>");
        this.f3210c = arrayList;
    }

    public final void i(int i8) {
        boolean[] zArr = this.f3212e;
        AbstractC3255y.f(zArr);
        AbstractC3255y.f(this.f3212e);
        zArr[i8] = !r1[i8];
        notifyItemChanged(i8);
    }

    public final void j(boolean z8) {
        this.f3211d = z8;
        if (!z8) {
            if (!d().isEmpty()) {
                this.f3212e = new boolean[d().size()];
            } else {
                this.f3212e = new boolean[0];
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        Object obj = d().get(i8);
        AbstractC3255y.h(obj, "data[pos]");
        boolean z8 = this.f3211d;
        boolean[] zArr = this.f3212e;
        AbstractC3255y.f(zArr);
        a((r5.r) viewHolder, (C1648o) obj, z8, zArr[i8]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f3208a).inflate(R.layout.download_item, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new r5.r(itemView, this.f3209b);
    }
}
