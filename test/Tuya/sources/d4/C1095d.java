package D4;

import W4.InterfaceC1486i;
import X4.C1505o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: D4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1095d extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1666a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1486i f1667b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1668c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1669d;

    /* renamed from: e, reason: collision with root package name */
    private boolean[] f1670e;

    public C1095d(ArrayList downloadsCompleted, ArrayList arrayList, Context context, InterfaceC1486i listener) {
        AbstractC3159y.i(downloadsCompleted, "downloadsCompleted");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1666a = context;
        this.f1667b = listener;
        b(downloadsCompleted, arrayList);
    }

    private final void a(o5.r rVar, C1505o c1505o, boolean z8, boolean z9) {
        if (c1505o.e() == null) {
            rVar.p(c1505o, z8, z9);
        } else {
            rVar.o(c1505o, z8, z9);
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
        this.f1670e = new boolean[d().size()];
    }

    public final int c() {
        boolean[] zArr = this.f1670e;
        if (zArr == null) {
            return 0;
        }
        AbstractC3159y.f(zArr);
        int i8 = 0;
        for (boolean z8 : zArr) {
            if (z8) {
                i8++;
            }
        }
        return i8;
    }

    public final ArrayList d() {
        ArrayList arrayList = this.f1668c;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3159y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        boolean[] zArr = this.f1670e;
        AbstractC3159y.f(zArr);
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (zArr[i8]) {
                boolean[] zArr2 = this.f1670e;
                AbstractC3159y.f(zArr2);
                if (i8 < zArr2.length) {
                    arrayList.add(d().get(i8));
                }
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return this.f1669d;
    }

    public final void g(ArrayList downloads, ArrayList arrayList) {
        AbstractC3159y.i(downloads, "downloads");
        b(downloads, arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return d().size();
    }

    public final void h(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f1668c = arrayList;
    }

    public final void i(int i8) {
        boolean[] zArr = this.f1670e;
        AbstractC3159y.f(zArr);
        AbstractC3159y.f(this.f1670e);
        zArr[i8] = !r1[i8];
        notifyItemChanged(i8);
    }

    public final void j(boolean z8) {
        this.f1669d = z8;
        if (!z8) {
            if (!d().isEmpty()) {
                this.f1670e = new boolean[d().size()];
            } else {
                this.f1670e = new boolean[0];
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        Object obj = d().get(i8);
        AbstractC3159y.h(obj, "data[pos]");
        boolean z8 = this.f1669d;
        boolean[] zArr = this.f1670e;
        AbstractC3159y.f(zArr);
        a((o5.r) viewHolder, (C1505o) obj, z8, zArr[i8]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f1666a).inflate(R.layout.download_item, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new o5.r(itemView, this.f1667b);
    }
}
