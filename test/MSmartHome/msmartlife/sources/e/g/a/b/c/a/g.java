package e.g.a.b.c.a;

import androidx.appcompat.widget.SearchView;

/* compiled from: SearchViewQueryTextEvent.java */
/* loaded from: classes2.dex */
public final class g extends e.g.a.c.c<SearchView> {

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f17683b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17684c;

    private g(SearchView searchView, CharSequence charSequence, boolean z) {
        super(searchView);
        this.f17683b = charSequence;
        this.f17684c = z;
    }

    public static g b(SearchView searchView, CharSequence charSequence, boolean z) {
        return new g(searchView, charSequence, z);
    }

    public boolean c() {
        return this.f17684c;
    }

    public CharSequence d() {
        return this.f17683b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.a() == a() && gVar.f17683b.equals(this.f17683b) && gVar.f17684c == this.f17684c;
    }

    public int hashCode() {
        return ((((629 + a().hashCode()) * 37) + this.f17683b.hashCode()) * 37) + (this.f17684c ? 1 : 0);
    }

    public String toString() {
        return "SearchViewQueryTextEvent{view=" + a() + ", queryText=" + ((Object) this.f17683b) + ", submitted=" + this.f17684c + '}';
    }
}
