package v1;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f9637a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9638b;

    public q(Context context) {
        n.h(context);
        Resources resources = context.getResources();
        this.f9637a = resources;
        this.f9638b = resources.getResourcePackageName(s1.k.f9229a);
    }

    public String a(String str) {
        int identifier = this.f9637a.getIdentifier(str, "string", this.f9638b);
        if (identifier == 0) {
            return null;
        }
        return this.f9637a.getString(identifier);
    }
}
