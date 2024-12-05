package androidx.preference;

import android.R;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceViewHolder.java */
/* loaded from: classes.dex */
public class l extends RecyclerView.c0 {
    private final SparseArray<View> a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1356b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1357c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.a = sparseArray;
        sparseArray.put(R.id.title, view.findViewById(R.id.title));
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i2 = p.a;
        sparseArray.put(i2, view.findViewById(i2));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
    }

    public View a(int i2) {
        View view = this.a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i2);
        if (findViewById != null) {
            this.a.put(i2, findViewById);
        }
        return findViewById;
    }

    public boolean b() {
        return this.f1356b;
    }

    public boolean c() {
        return this.f1357c;
    }

    public void d(boolean z) {
        this.f1356b = z;
    }

    public void e(boolean z) {
        this.f1357c = z;
    }
}
