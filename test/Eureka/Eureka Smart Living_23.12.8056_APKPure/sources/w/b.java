package w;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f9679a;

    /* loaded from: classes.dex */
    interface a {
        CharSequence a(Cursor cursor);

        void b(Cursor cursor);

        Cursor c();

        Cursor d(CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f9679a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f9679a.a((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d6 = this.f9679a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d6 != null) {
            filterResults.count = d6.getCount();
        } else {
            filterResults.count = 0;
            d6 = null;
        }
        filterResults.values = d6;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c6 = this.f9679a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == c6) {
            return;
        }
        this.f9679a.b((Cursor) obj);
    }
}
