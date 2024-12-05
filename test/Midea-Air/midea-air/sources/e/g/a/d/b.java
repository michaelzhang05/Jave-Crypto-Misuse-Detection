package e.g.a.d;

import android.text.Editable;
import android.widget.TextView;

/* compiled from: TextViewAfterTextChangeEvent.java */
/* loaded from: classes2.dex */
public final class b extends e.g.a.c.c<TextView> {

    /* renamed from: b, reason: collision with root package name */
    private final Editable f17705b;

    private b(TextView textView, Editable editable) {
        super(textView);
        this.f17705b = editable;
    }

    public static b b(TextView textView, Editable editable) {
        return new b(textView, editable);
    }

    public Editable c() {
        return this.f17705b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.a() == a() && this.f17705b.equals(bVar.f17705b);
    }

    public int hashCode() {
        return ((629 + a().hashCode()) * 37) + this.f17705b.hashCode();
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent{editable=" + ((Object) this.f17705b) + ", view=" + a() + '}';
    }
}
