package m0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public View f7538b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f7537a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f7539c = new ArrayList();

    public s(View view) {
        this.f7538b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f7538b == sVar.f7538b && this.f7537a.equals(sVar.f7537a);
    }

    public int hashCode() {
        return (this.f7538b.hashCode() * 31) + this.f7537a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f7538b + "\n") + "    values:";
        for (String str2 : this.f7537a.keySet()) {
            str = str + "    " + str2 + ": " + this.f7537a.get(str2) + "\n";
        }
        return str;
    }
}
