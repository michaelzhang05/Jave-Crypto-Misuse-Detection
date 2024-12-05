package c.i.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: f, reason: collision with root package name */
    private int f2750f;

    /* renamed from: g, reason: collision with root package name */
    private int f2751g;

    /* renamed from: h, reason: collision with root package name */
    private LayoutInflater f2752h;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f2751g = i2;
        this.f2750f = i2;
        this.f2752h = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // c.i.a.a
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2752h.inflate(this.f2751g, viewGroup, false);
    }

    @Override // c.i.a.a
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2752h.inflate(this.f2750f, viewGroup, false);
    }
}
