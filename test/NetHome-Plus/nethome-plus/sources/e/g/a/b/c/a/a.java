package e.g.a.b.c.a;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerViewScrollEvent.java */
/* loaded from: classes2.dex */
public final class a extends e.g.a.c.c<RecyclerView> {

    /* renamed from: b, reason: collision with root package name */
    private final int f17674b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17675c;

    private a(RecyclerView recyclerView, int i2, int i3) {
        super(recyclerView);
        this.f17674b = i2;
        this.f17675c = i3;
    }

    public static a b(RecyclerView recyclerView, int i2, int i3) {
        return new a(recyclerView, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.a() == a() && this.f17674b == aVar.f17674b && this.f17675c == aVar.f17675c;
    }

    public int hashCode() {
        return ((((629 + a().hashCode()) * 37) + this.f17674b) * 37) + this.f17675c;
    }

    public String toString() {
        return "RecyclerViewScrollEvent{view=" + a() + ", dx=" + this.f17674b + ", dy=" + this.f17675c + '}';
    }
}
