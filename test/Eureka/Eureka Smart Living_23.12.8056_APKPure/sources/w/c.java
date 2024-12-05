package w;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i, reason: collision with root package name */
    private int f9680i;

    /* renamed from: j, reason: collision with root package name */
    private int f9681j;

    /* renamed from: k, reason: collision with root package name */
    private LayoutInflater f9682k;

    public c(Context context, int i6, Cursor cursor, boolean z5) {
        super(context, cursor, z5);
        this.f9681j = i6;
        this.f9680i = i6;
        this.f9682k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // w.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9682k.inflate(this.f9681j, viewGroup, false);
    }

    @Override // w.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9682k.inflate(this.f9680i, viewGroup, false);
    }
}
