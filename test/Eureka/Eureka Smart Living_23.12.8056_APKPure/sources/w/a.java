package w;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import w.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f9669a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f9670b;

    /* renamed from: c, reason: collision with root package name */
    protected Cursor f9671c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f9672d;

    /* renamed from: e, reason: collision with root package name */
    protected int f9673e;

    /* renamed from: f, reason: collision with root package name */
    protected C0145a f9674f;

    /* renamed from: g, reason: collision with root package name */
    protected DataSetObserver f9675g;

    /* renamed from: h, reason: collision with root package name */
    protected w.b f9676h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0145a extends ContentObserver {
        C0145a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z5) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f9669a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f9669a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z5) {
        f(context, cursor, z5 ? 1 : 2);
    }

    public abstract CharSequence a(Cursor cursor);

    public void b(Cursor cursor) {
        Cursor j6 = j(cursor);
        if (j6 != null) {
            j6.close();
        }
    }

    @Override // w.b.a
    public Cursor c() {
        return this.f9671c;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i6) {
        b bVar;
        if ((i6 & 1) == 1) {
            i6 |= 2;
            this.f9670b = true;
        } else {
            this.f9670b = false;
        }
        boolean z5 = cursor != null;
        this.f9671c = cursor;
        this.f9669a = z5;
        this.f9672d = context;
        this.f9673e = z5 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i6 & 2) == 2) {
            this.f9674f = new C0145a();
            bVar = new b();
        } else {
            bVar = null;
            this.f9674f = null;
        }
        this.f9675g = bVar;
        if (z5) {
            C0145a c0145a = this.f9674f;
            if (c0145a != null) {
                cursor.registerContentObserver(c0145a);
            }
            DataSetObserver dataSetObserver = this.f9675g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f9669a || (cursor = this.f9671c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        if (!this.f9669a) {
            return null;
        }
        this.f9671c.moveToPosition(i6);
        if (view == null) {
            view = g(this.f9672d, this.f9671c, viewGroup);
        }
        e(view, this.f9672d, this.f9671c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f9676h == null) {
            this.f9676h = new w.b(this);
        }
        return this.f9676h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i6) {
        Cursor cursor;
        if (!this.f9669a || (cursor = this.f9671c) == null) {
            return null;
        }
        cursor.moveToPosition(i6);
        return this.f9671c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        Cursor cursor;
        if (this.f9669a && (cursor = this.f9671c) != null && cursor.moveToPosition(i6)) {
            return this.f9671c.getLong(this.f9673e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        if (!this.f9669a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f9671c.moveToPosition(i6)) {
            if (view == null) {
                view = h(this.f9672d, this.f9671c, viewGroup);
            }
            e(view, this.f9672d, this.f9671c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i6);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f9670b || (cursor = this.f9671c) == null || cursor.isClosed()) {
            return;
        }
        this.f9669a = this.f9671c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f9671c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0145a c0145a = this.f9674f;
            if (c0145a != null) {
                cursor2.unregisterContentObserver(c0145a);
            }
            DataSetObserver dataSetObserver = this.f9675g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f9671c = cursor;
        if (cursor != null) {
            C0145a c0145a2 = this.f9674f;
            if (c0145a2 != null) {
                cursor.registerContentObserver(c0145a2);
            }
            DataSetObserver dataSetObserver2 = this.f9675g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f9673e = cursor.getColumnIndexOrThrow("_id");
            this.f9669a = true;
            notifyDataSetChanged();
        } else {
            this.f9673e = -1;
            this.f9669a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
