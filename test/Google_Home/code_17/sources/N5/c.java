package N5;

import android.text.Editable;
import android.text.style.BulletSpan;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f7757a = 20;

    /* renamed from: b, reason: collision with root package name */
    public final BulletSpan f7758b = new BulletSpan(10);

    public final void a(Editable editable) {
        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
            editable.append("\n");
        }
    }

    public abstract Object[] b(Editable editable, int i8);

    public void c(Editable text) {
        AbstractC3255y.i(text, "text");
        a(text);
        text.setSpan(this, text.length(), text.length(), 17);
    }
}
