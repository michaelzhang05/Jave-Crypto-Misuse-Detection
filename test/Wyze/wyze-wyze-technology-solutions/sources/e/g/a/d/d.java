package e.g.a.d;

import android.widget.TextView;

/* compiled from: TextViewTextChangeEvent.java */
/* loaded from: classes2.dex */
public final class d extends e.g.a.c.c<TextView> {

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f17711b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17712c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17713d;

    /* renamed from: e, reason: collision with root package name */
    private final int f17714e;

    private d(TextView textView, CharSequence charSequence, int i2, int i3, int i4) {
        super(textView);
        this.f17711b = charSequence;
        this.f17712c = i2;
        this.f17713d = i3;
        this.f17714e = i4;
    }

    public static d b(TextView textView, CharSequence charSequence, int i2, int i3, int i4) {
        return new d(textView, charSequence, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.a() == a() && this.f17711b.equals(dVar.f17711b) && this.f17712c == dVar.f17712c && this.f17713d == dVar.f17713d && this.f17714e == dVar.f17714e;
    }

    public int hashCode() {
        return ((((((((629 + a().hashCode()) * 37) + this.f17711b.hashCode()) * 37) + this.f17712c) * 37) + this.f17713d) * 37) + this.f17714e;
    }

    public String toString() {
        return "TextViewTextChangeEvent{text=" + ((Object) this.f17711b) + ", start=" + this.f17712c + ", before=" + this.f17713d + ", count=" + this.f17714e + ", view=" + a() + '}';
    }
}
